import React, { useState } from 'react';

function GuestPage() {
  return (
    <div>
      <h2>Welcome, Guest!</h2>
      <p>Browse available flights below:</p>
      <ul>
        <li>Flight A - Delhi to Mumbai</li>
        <li>Flight B - Bangalore to Kolkata</li>
        <li>Flight C - Hyderabad to Chennai</li>
      </ul>
    </div>
  );
}

function UserPage() {
  return (
    <div>
      <h2>Welcome, User!</h2>
      <p>You can now book your flight tickets.</p>
      <button>Book Flight A</button>
      <button>Book Flight B</button>
    </div>
  );
}

function App() {
  const [isLoggedIn, setIsLoggedIn] = useState(false);

  const toggleLogin = () => {
    setIsLoggedIn(prev => !prev);
  };

  const buttonLabel = isLoggedIn ? "Logout" : "Login";
  const displayPage = isLoggedIn ? <UserPage /> : <GuestPage />;

  return (
    <div style={{ textAlign: 'center' }}>
      <h1>Ticket Booking App</h1>
      <button onClick={toggleLogin}>{buttonLabel}</button>
      <hr />
      {displayPage}
    </div>
  );
}

export default App;
