package com.bank2.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.bank2.ServiceConstants.RegistrationConstantsUtil;
import com.bank2.entity.RegistrationEntity;
import com.bank2.entity.RegistrationEntityTnx;
import com.bank2.model.RegistrationApproveReq;
import com.bank2.repository.RegistrationRepository;
import com.bank2.repository.RegistrationTnxRepository;

import jakarta.mail.MessagingException;
import jakarta.mail.internet.MimeMessage;
import jakarta.transaction.Transactional;




@Service
public class Registrationservice {
	@Autowired
	private RegistrationRepository registrationRepository;
	
	@Autowired
	private RegistrationTnxRepository registrationTnxRepository;
	
	@Autowired
    private JavaMailSender  emailSender;
	
	@Autowired
	private EmailService emailService;
	
	
	 @Autowired
	    public Registrationservice(RegistrationRepository userRepository) {
	        this.registrationRepository = userRepository;
	    }

	    public RegistrationEntity getUserByEmail(String email) {
	        return registrationRepository.findByEmailid(email);
	    }
	
//	     public RegistrationEntity getUserByRequestId(int requestId)
//	     {
//	    	 return registrationRepository.findByone(requestId);
//	     }
//	
	    
//	    public RegistrationEntityTnx getUserByRequest(String email)
//	    {
//	    	return registrationTnxRepository.findByEmail(email);
//	    }
	    
	
	public RegistrationEntityTnx post(RegistrationEntityTnx trans) {
		
		trans.setStatus(RegistrationConstantsUtil.SUBMITTED);
		RegistrationEntityTnx tnx =  registrationTnxRepository.save(trans);
		
		 String subject = tnx.getRequestid() +" : Registration Submitted";
	     String text = "Your Registration has been Submitted.";
		emailService.sendEmail(trans.getEmailid(), subject, text);
		
		return tnx;
		
	}
	
	
	public RegistrationEntity approve(RegistrationApproveReq req) {
		
		Optional<RegistrationEntityTnx> tnx = registrationTnxRepository.findById(req.getRegId());
		
		if(tnx.isPresent()) {
			RegistrationEntityTnx tnxObj = tnx.get();
			RegistrationEntity master = populateMaster(tnx.get());
			if(req.getAction().equals("A")) {
				
				registrationRepository.save(master);
				
				tnxObj.setStatus(RegistrationConstantsUtil.APPROVED);
				registrationTnxRepository.save(tnxObj);
				
				
				 String subject = tnxObj.getRequestid()+" : Registartion Approved";
			     String text = "Your account has been Accepted.";
				emailService.sendEmail(tnxObj.getEmailid(), subject, text);
//			}else {
//				
//				tnxObj.setStatus(RegistrationConstantsUtil.REJECTED);
//				registrationTnxRepository.save(tnxObj);
//				
//			        String subject = tnxObj.getRequestid()+" : Registration Rejected";
//			        String text = "Your account has been Rejected.";
//			        emailService.sendEmail(tnxObj.getEmailid(), subject, text);
				
			}
			return master; 
			
		} else {
			return new RegistrationEntity();
		}
			
	}
	
	
	public RegistrationEntity reject(RegistrationApproveReq req) {
	    Optional<RegistrationEntityTnx> tnx = registrationTnxRepository.findById(req.getRegId());

	    if (tnx.isPresent()) {
	        RegistrationEntityTnx tnxObj = tnx.get();
	        RegistrationEntity master = populateMaster(tnx.get());
	        if (req.getAction().equals("R")) {

	            registrationRepository.save(master);

	            tnxObj.setStatus(RegistrationConstantsUtil.REJECTED);
	            registrationTnxRepository.save(tnxObj);

	            String subject = tnxObj.getRequestid() + " : Registration Rejected";
	            String text = "Your account has been rejected.";
	            emailService.sendEmail(tnxObj.getEmailid(), subject, text);
	        }
	        return master;
	    } else {
	        return new RegistrationEntity();
	    }
	}

	
	
	
	
	
	private RegistrationEntity populateMaster(RegistrationEntityTnx tnx){
		RegistrationEntity registrationMaster = new RegistrationEntity();
		registrationMaster.setRegisterid(tnx.getRegisterid());
		registrationMaster.setRequestid(tnx.getRequestid());
		registrationMaster.setFirstname(tnx.getFirstname());
		registrationMaster.setSecondname(tnx.getSecondname());
		registrationMaster.setHousename(tnx.getHousename());
		registrationMaster.setResidencephonenumber(tnx.getResidencephonenumber());
		registrationMaster.setOfficephonenumber(tnx.getOfficephonenumber());
		registrationMaster.setEmailid(tnx.getEmailid());
		registrationMaster.setAge(tnx.getAge());
		registrationMaster.setSex(tnx.getSex());
		registrationMaster.setCity(tnx.getCity());
		registrationMaster.setCountry(tnx.getCountry());
		return registrationMaster;
	}
	
     	
		public List<RegistrationEntityTnx> get(){
			return registrationTnxRepository.findAll();
		}
		
		
		public Optional<RegistrationEntity> getById(int id)
		{
			return registrationRepository.findById(id);
		}
		
		
		public Optional<RegistrationEntityTnx> getById1(int id)
		{
			return registrationTnxRepository.findById(id);
		}
		
		
//		@Transactional
//		 public String checkEmail(String emailid)
//		 {
//			 RegistrationEntityTnx email1 = registrationTnxRepository.findByEmail(emailid);
//			 if(email1 !=null)
//			 {
//				 return "email alredy exists";
//				 
//			 }
//			 else {
//				 RegistrationEntityTnx newEmail = new RegistrationEntityTnx();
//				 newEmail.setEmailid(emailid);
//				 registrationTnxRepository.save(newEmail);
//				 return "email stored successfully";
//			 }
//		 }

		    }


