import React, { useState } from 'react';
import '../Stylesheets/mystyle.css';

function CalculateScore() {
  const [name, setName] = useState('');
  const [school, setSchool] = useState('');
  const [total, setTotal] = useState('');
  const [goal, setGoal] = useState('');
  const [average, setAverage] = useState(null);

  const handleSubmit = (e) => {
    e.preventDefault();
    const avg = (parseFloat(total) / parseFloat(goal)).toFixed(2);
    setAverage(avg);
  };

  return (
    <div className="score-container">
      <h2>Student Score Calculator</h2>
      <form onSubmit={handleSubmit}>
        <input type="text" placeholder="Name" onChange={(e) => setName(e.target.value)} required />
        <input type="text" placeholder="School" onChange={(e) => setSchool(e.target.value)} required />
        <input type="number" placeholder="Total Marks" onChange={(e) => setTotal(e.target.value)} required />
        <input type="number" placeholder="Goal Marks" onChange={(e) => setGoal(e.target.value)} required />
        <button type="submit">Calculate Average</button>
      </form>
      {average && (
        <p>{name} from {school} scored an average of {average}</p>
      )}
    </div>
  );
}

export default CalculateScore;
