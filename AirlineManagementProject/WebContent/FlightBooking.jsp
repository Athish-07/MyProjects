<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <title>Book a Flight</title>
    <link rel="stylesheet" href="css/style.css">
    <script src="js/script.js" defer></script>
</head>
<body>
    <div class="container">
        <h2>Book a Flight</h2>
        <form id="flightBookingForm" action="bookFlight" method="post">
            <input type="text" name="flightNumber" placeholder="Flight Number" required>
            <select name="seatClass" required>
                <option value="Economy">Economy</option>
                <option value="Business">Business</option>
                <option value="First Class">First Class</option>
            </select>
            <input type="submit" value="Book Flight">
        </form>
        <div id="confirmationModal">Flight booked successfully! Redirecting...</div>
    </div>
</body>
</html>
