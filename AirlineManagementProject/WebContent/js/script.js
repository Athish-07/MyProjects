document.addEventListener("DOMContentLoaded", function () {
    const forms = document.querySelectorAll("form");
    forms.forEach(form => {
        form.addEventListener("submit", function (e) {
            let isValid = true;
            const inputs = form.querySelectorAll("input[required], select[required]");
            inputs.forEach(input => {
                if (input.value.trim() === "") {
                    alert(input.name + " cannot be empty");
                    isValid = false;
                }
            });
            if (!isValid) e.preventDefault();
        });
    });

    const bookingForm = document.querySelector("#flightBookingForm");
    if (bookingForm) {
        bookingForm.addEventListener("submit", function (e) {
            e.preventDefault();
            const modal = document.getElementById("confirmationModal");
            modal.classList.add("show");
            setTimeout(() => {
                bookingForm.submit();
            }, 2000);
        });
    }
});
