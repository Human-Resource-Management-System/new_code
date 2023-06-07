<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@page import="models.Image" %>
<%@ page import="java.util.List" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Image Gallery</title>
</head>
<body>
    <h1>Image Gallery</h1>
    <%
        // Retrieve the list of images from the controller or service
        List<Image> images = (List<Image>) request.getAttribute("images");
        String imagePath = request.getContextPath() + "/";
    %>
    <% if (images != null && !images.isEmpty()) { %>
        <div>
            <% for (Image image : images) { %>
                <img src="<%= imagePath + image.getEmplPhoto() %>" alt="Image" width="200px" height="200px">
            <% } %>
        </div>
    <% } else { %>
        <p>No images found.</p>
    <% } %>
</body>
</html>
