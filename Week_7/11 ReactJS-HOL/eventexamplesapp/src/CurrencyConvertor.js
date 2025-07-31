import React, { useState } from 'react';

function CurrencyConvertor() {
  const [rupees, setRupees] = useState('');
  const [euro, setEuro] = useState('');

  const handleSubmit = () => {
    const converted = (parseFloat(rupees) / 90).toFixed(2);
    setEuro(converted);
  }

  return (
    <div>
      <h2>Currency Convertor (INR to Euro)</h2>
      <input
        type="number"
        placeholder="Enter amount in Rupees"
        value={rupees}
        onChange={(e) => setRupees(e.target.value)}
      />
      <button onClick={handleSubmit}>Convert</button>
      <p>{rupees && `€ ${euro}`}</p>
    </div>
  );
}

export default CurrencyConvertor;
