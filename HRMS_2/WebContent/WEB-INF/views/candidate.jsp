<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <title>Enter Candidate Details</title>
</head>
<body>
    <h1>Enter Candidate Details</h1>
    <form method="post" action="success">
        <label for="firstName">First Name:</label>
        <input type="text" name="firstName" id="firstName" required><br><br>
        
        <label for="middleName">Middle Name:</label>
        <input type="text" name="middleName" id="middleName"><br><br>
        
        <label for="lastName">Last Name:</label>
        <input type="text" name="lastName" id="lastName" required><br><br>
        
        <label for="rDate">Registration Date:</label>
        <input type="date" name="rDate" id="rDate" required><br><br>
        
        <label for="gender">Gender:</label>
        <input type="text" name="gender" id="gender" required><br><br>
        
        <label for="dob">Date of Birth:</label>
        <input type="date" name="dob" id="dob" required><br><br>
        
        <label for="email">Email:</label>
        <input type="email" name="email" id="email" required><br><br>
        
        <label for="mobile">Mobile Number:</label>
        <input type="text" name="mobile" id="mobile" required><br><br>
        
        <label for="address">Address:</label>
        <textarea name="address" id="address" rows="3" required></textarea><br><br>
        
        <label for="ludate">Last Update Date:</label>
        <input type="date" name="ludate" id="ludate" required><br><br>
        
        <label for="status">Status:</label>
        <input type="text" name="status" id="status" required><br><br>
        
        <input type="submit" value="Submit">
    </form>
</body>
</html>
