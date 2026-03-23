<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <title>Admin Panel</title>
    <link rel="stylesheet" href="css/style.css">
</head>
<body>
    <div class="container">
        <h2>Admin Panel</h2>
        <form action="admin" method="post">
            <input type="text" name="flightNumber" placeholder="Flight Number" required>
            <select name="action" required>
                <option value="add">Add Flight</option>
                <option value="edit">Edit Flight</option>
                <option value="delete">Delete Flight</option>
            </select>
            <input type="submit" value="Submit">
        </form>

        <h3>Flight Details</h3>
        <table border="1" width="100%">
            <tr>
                <th>Flight Number</th>
                <th>Destination</th>
                <th>Seats Available</th>
            </tr>
            <tr>
                <td>AI101</td>
                <td>New York</td>
                <td>50</td>
            </tr>
            <tr>
                <td>BA202</td>
                <td>London</td>
                <td>30</td>
            </tr>
        </table>
    </div>
</body>
</html>
