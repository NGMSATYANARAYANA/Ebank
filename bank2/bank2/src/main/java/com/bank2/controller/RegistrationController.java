package com.bank2.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bank2.entity.RegistrationEntity;
import com.bank2.entity.RegistrationEntityTnx;
import com.bank2.model.RegistrationApproveReq;
import com.bank2.services.Registrationservice;


@RestController
@CrossOrigin("*")
@RequestMapping("/UserRequest")
public class RegistrationController {
	
	@Autowired
	private Registrationservice services;
	
	
	private final Registrationservice userService;

    @Autowired
    public RegistrationController(Registrationservice userService) {
        this.userService = userService;
    }

    @GetMapping("/users/{email}")
    public RegistrationEntity getUserByEmail(@PathVariable String email) {
        return userService.getUserByEmail(email);
    }

//   @GetMapping("/users/{requestId}")
//  public RegistrationEntity getUserone(@PathVariable String requestId) {
//      return userService.getUserByEmail(requestId);
//   }

	
	@PostMapping("/save")
	public RegistrationEntityTnx submitTnx(@RequestBody RegistrationEntityTnx request)
	{
		return services.post(request);
	}
	
	@PostMapping("/approve")
	public RegistrationEntity approve(@RequestBody RegistrationApproveReq req)
	{
		return services.approve(req);
	}
	
	@PostMapping("/reject")
	public RegistrationEntity reject(@RequestBody RegistrationApproveReq req)
	{
		return services.reject(req);
	}
	
	@GetMapping("/ureqest")
	public List<RegistrationEntityTnx> getAll()
	{
		return services.get();
	}
	
	

//	@GetMapping("/{emailid}")
//	public RegistrationEntity getEmail1(@PathVariable String emailid)
//	{
//		return services.getEmail(emailid);
//	}
//	
//	@GetMapping("/users/{requestId}")
//   public RegistrationEntity getUserReq(@PathVariable String requestId)
//   {
//	   return userService.getUserByRequestId(requestId);
//   }

	
}
