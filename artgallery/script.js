document.getElementById('loginForm').addEventListener('submit', function (e) {
    e.preventDefault(); // Prevent form from submitting the traditional way

    // Get the username and password values from the form
    const username = document.getElementById('username').value;
    const password = document.getElementById('password').value;

    // Mock authentication - replace this with actual logic (e.g., API call to a backend server)
    if (username === 'tirumala' && password === '1234') {
        // Redirect to homepage
        window.location.href = 'homepage.html'; // Make sure homepage.html exists
    } else {
        // Show error message
        document.getElementById('errorMessage').textContent = 'Invalid username or password.';
    }
});


document.getElementById("registerForm")?.addEventListener("submit", function(event) {
    event.preventDefault();
    const username = document.getElementById("registerUsername").value;
    const email = document.getElementById("email").value;
    const password = document.getElementById("registerPassword").value;

    if (username && email && password) {
        alert("Registration successful! You can now log in.");
        window.location.href = "login.html";
    } else {
        document.getElementById("errorMessage").textContent = "Please fill in all fields.";
    }
});

function logout() {
    localStorage.removeItem("isLoggedIn");
    window.location.href = "login.html";
}

window.onload = function() {
    if (localStorage.getItem("isLoggedIn") && window.location.pathname !== "/home.html") {
        window.location.href = "home.html";
    }
};
