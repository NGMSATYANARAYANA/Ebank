function generateId(){
    var regId = Math.floor(100000000 + Math.random() * 900000000);
    var reqId = Math.floor(100000000 + Math.random() * 900000000);

    const regIdElement = document.getElementById("RegisterId").value=regId;
    const reqIdElement = document.getElementById("RequestId").value=reqId;
    console.log(regId);
    console.log(reqId)
}

function registration() {
    document.getElementById("registrationForm").addEventListener("submit", function(event) {
         event.preventDefault(); // Prevent default form submission

         // Create FormData object to collect form data
       //   const formData = new FormData(this);

         var formData = new FormData(document.getElementById("registrationForm"));


         console.log(formData.secondName);
         // Make a POST request to the Spring Boot REST endpoint
         fetch('http://localhost:8080/UserRequest/save', {
             method: 'POST',
             headers: {
                 'Content-Type': 'application/json',
                 'Access-Control-Allow-Origin':'*'
             },
             body: JSON.stringify(Object.fromEntries(formData))
         })
         .then(response => {
             if (!response.ok) {
                 throw new Error('Network response was not ok');
             }else{
               alert("Registration Successfully.")
           //   return response.json();
             }
         })
         .then(data => {
             console.log('Success:', data);
             // Optionally, do something with the response data
         })
         .catch(error => {
             console.error('Error:', error);
             // Optionally, handle errors
         });
     });
   }
// function generateId(){
//     var regId = Math.floor(100000000 + Math.random() * 900000000);
//     var reqId = Math.floor(100000000 + Math.random() * 900000000);

//     const regIdElement = document.getElementById("RegisterId").value=regId;
//     const reqIdElement = document.getElementById("RequestId").value=reqId;
//     console.log(regId);
//     console.log(reqId)
// }
// function registration() {
//     document.getElementById("registrationForm").addEventListener("submit", function(event) {
//         event.preventDefault(); // Prevent default form submission

//         // Create FormData object to collect form data
//         var formData = new FormData(document.getElementById("registrationForm"));

//         // Get the email value from the form data
//         var email = formData.get('emailid');

//         // Make a GET request to check if the email already exists
//         fetch('http://localhost:8080/UserRequest/save' + email)
//             .then(response => {
//                 if (!response.ok) {
//                     throw new Error('Network response was not ok');
//                 }
//                 return response.json();
//             })
//             .then(data => {
//                 // If the email exists in the database, show a popup message
//                 if (data.exists) {
//                     alert("Email already exists in the database. Please use a different email.");
//                 } else {
//                     // If the email does not exist, proceed with the registration
//                     fetch('http://localhost:8080/UserRequest/save', {
//                         method: 'POST',
//                         headers: {
//                             'Content-Type': 'application/json',
//                             'Access-Control-Allow-Origin': '*'
//                         },
//                         body: JSON.stringify(Object.fromEntries(formData))
//                     })
//                     .then(response => {
//                         if (!response.ok) {
//                             throw new Error('Network response was not ok');
//                         } else {
//                             alert("Registration Successful.");
//                         }
//                     })
//                     .catch(error => {
//                         console.error('Error:', error);
//                     });
//                 }
//             })
//             .catch(error => {
//                 console.error('Error:', error);
//             });
//     });
// }


