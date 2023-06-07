<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <title>Enter Induction Details</title>
</head>
<body>
    <h1>Enter Induction Details</h1>
    <form method="post" action="success2">
        <label for="indcId">Induction ID:</label>
        <input type="text" name="indc_id" id="indc_id" required><br><br>
        
        <label for="emofId">Employment Offer ID:</label>
        <input type="text" name="indc_emof_id" id="indc_emof_id" required><br><br>
        
        <label for="indcDate">Induction Date:</label>
        <input type="date" name="indcDate" id="indcDate" required><br><br>
        
        <label for="processesAusrId">Processes Ausr ID:</label>
        <input type="text" name="indc_processes_ausr_id" id="indc_processes_ausr_id" required><br><br>
        
        <label for="indcStatus">Induction Status:</label>
        <input type="text" name="status" id="status" required><br><br>
        
        <input type="submit" value="Submit">
    </form>
</body>
</html>
