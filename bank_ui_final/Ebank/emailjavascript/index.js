function fetchAccountRequests() {
 
    // Create FormData object to collect form data
  //   const formData = new FormData(this);

  
    location.href = "../AdminDashBoard/Ac"; // Replace 'newpage.html' with your desired page URL


    // Make a POST request to the Spring Boot REST endpoint
    fetch('http://localhost:8080/account-request/fetchAll', {
        method: 'GET',
        headers: {
            'Content-Type': 'application/json',
            'Access-Control-Allow-Origin':'*'
        }
    })
    .then(response => response.json())

    .then(response => {
        
           // const data = response.json();
           // const data =  JSON.parse(response.body);  
           console.log("Resp : "+response);  
           let table = '<table>';  
           table += '<tr><th>RequestId</th><th>Account Existing</th><th>Account Number</th><th>Card Number</th><th>Status</th></tr>';  
           response.forEach(item => {  
               var accountExisting = item.accountExisting==0?false:true;
               var status = item.status==0?'Approve':'reject';
           table += `<tr><td>${item.requestId}</td><td>${accountExisting}</td>
           <td>${item.accountNumber}</td><td>${item.cardNumber}</td><td>${status}</td></tr>`;  
           });  
           table += '</table>';  
           const tableContainer = document.getElementById('ac-request-container');  
           tableContainer.innerHTML = table;  
           //   return response.json();
        
    })
   //  .then(data => {
   //      console.log('Success:', data);
   //      // Optionally, do something with the response data
   //  })
    .catch(error => {
        console.error('Error:', error);
        // Optionally, handle errors
    });

}