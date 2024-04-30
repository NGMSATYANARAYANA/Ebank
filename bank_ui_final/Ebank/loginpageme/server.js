const express = require('express');
const bodyParser = require('body-parser');
const mongoose = require('mongoose');

const app = express();
const PORT = process.env.PORT || 8080;

// Middleware
app.use(bodyParser.json());

// Connect to MongoDB
mongoose.connect('mongodb://localhost:27017/admins', { useNewUrlParser: true, useUnifiedTopology: true })
    .then(() => console.log('Connected to MongoDB'))
    .catch(err => console.error('Failed to connect to MongoDB:', err));

// Define a mongoose schema for Admin
const adminSchema = new mongoose.Schema({
    accountnumber: String,
    registerid: String,
    password: String,
    secretanswer: String,
});

// Create a mongoose model for Admin
const Admin = mongoose.model('Admin', adminSchema);

// Login route
app.post('/loginRequest/save', (req, res) => {
    const { accountnumber, registerid, password, secretanswer } = req.body;

    // Create a new admin instance
    const admin = new Admin({
        accountnumber,
        registerid,
        password,
        secretanswer,
    });

    // Save the admin to the database
    admin.save()
        .then(() => {
            console.log('Admin details saved successfully');
            res.status(200).json({ message: 'Admin details saved successfully' });
        })
        .catch(err => {
            console.error('Error saving admin details:', err);
            res.status(500).json({ error: 'Internal server error' });
        });
});

// Start the server
app.listen(PORT, () => {
    console.log(`Server is running on port ${PORT}`);
});
