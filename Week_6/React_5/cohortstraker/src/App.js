import React from 'react';
import './App.css';
import CohortDetails from './components/CohortDetails';

function App() {
  return (
    <div className="App">
      <h2>My Academy Dashboard</h2>
      <CohortDetails
        name="Cohort Alpha"
        status="ongoing"
        startDate="2024-01-10"
        endDate="2024-06-30"
      />
      <CohortDetails
        name="Cohort Beta"
        status="completed"
        startDate="2023-08-01"
        endDate="2023-12-31"
      />
    </div>
  );
}

export default App;
