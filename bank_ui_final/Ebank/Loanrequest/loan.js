
// function submitLoanRequest() {
//     document.getElementById("loanRequestForm").addEventListener("submit", function(event) {
//          event.preventDefault(); // Prevent default form submission

//          // Create FormData object to collect form data
//        //   const formData = new FormData(this);

//          var formData = new FormData(document.getElementById("loanRequestForm"));

//          // Make a POST request to the Spring Boot REST endpoint
//          fetch('http://localhost:8080/loanrequests/save', {
//              method: 'POST',
//              headers: {
//                  'Content-Type': 'application/json',
//                  'Access-Control-Allow-Origin':'*'
//              },
//              body: JSON.stringify(Object.fromEntries(formData))
//          })
//          .then(response => {
//              if (!response.ok) {
//                  throw new Error('Network response was not ok');
//              }else{
//                alert("Loan Request Submitted Successfully.")
//            //   return response.json();
//              }
//          })
//          .then(data => {
//              console.log('Success:', data);
//              // Optionally, do something with the response data
//          })
//          .catch(error => {
//              console.error('Error:', error);
//              // Optionally, handle errors
//          });
//      });
//    }





document.getElementById('ddform').addEventListener('submit', function(event) {
    event.preventDefault(); // Prevent the form from submitting normally

    // Get form values
    const requestData = {
      requestid: document.getElementById('request').value,
      accountnumber: document.getElementById('account').value,
      ddnumber: document.getElementById('ddnum').value,
      infavof: document.getElementById('infavor').value,
      payableat: document.getElementById('Payable').value,
      commisionamount: document.getElementById('Commission').value,
      amount: document.getElementById('Amount').value,
      date: document.getElementById('date').value,
      status: document.getElementById('text').value
    };

    // POST request using fetch
    fetch('http://localhost:8080/ddfrom/save', {
      method: 'POST',
      headers: {
        'Content-Type': 'application/json',
        'Access-Control-Allow-Origin': '*'
      },
      body: JSON.stringify(requestData),
    })
    .then(response => response.json())
    .then(data => {
      console.log('Success:', data);
      // Optionally, you can display a success message or redirect the user
    })
    .catch((error) => {
      console.error('Error:', error);
      // Optionally, you can display an error message to the user
    });
  });
