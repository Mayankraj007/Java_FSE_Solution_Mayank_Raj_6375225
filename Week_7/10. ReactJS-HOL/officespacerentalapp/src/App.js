import React from 'react';

const officeList = [
  { name: 'Office A', rent: 45000, address: 'Bangalore', image: 'https://via.placeholder.com/150' },
  { name: 'Office B', rent: 70000, address: 'Mumbai', image: 'https://via.placeholder.com/150' },
  { name: 'Office C', rent: 55000, address: 'Delhi', image: 'https://via.placeholder.com/150' }
];

function App() {
  return (
    <div style={{ textAlign: 'center' }}>
      <h1>Office Space Rental App</h1>
      {officeList.map((office, index) => (
        <div key={index} style={{ border: '1px solid gray', margin: '10px', padding: '10px' }}>
          <img src={office.image} alt={office.name} width="150" />
          <h2>{office.name}</h2>
          <p style={{ color: office.rent < 60000 ? 'red' : 'green' }}>
            Rent: ₹{office.rent}
          </p>
          <p>Address: {office.address}</p>
        </div>
      ))}
    </div>
  );
}

export default App;
