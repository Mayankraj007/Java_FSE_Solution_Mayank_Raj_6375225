import React from 'react';

const ListofPlayers = () => {
  const players = [
    { name: 'Virat', score: 85 },
    { name: 'Rohit', score: 45 },
    { name: 'Dhoni', score: 90 },
    { name: 'Gill', score: 65 },
    { name: 'Pant', score: 50 },
    { name: 'Hardik', score: 72 },
    { name: 'Ashwin', score: 55 },
    { name: 'Jadeja', score: 78 },
    { name: 'Shami', score: 60 },
    { name: 'Bumrah', score: 82 },
    { name: 'Surya', score: 47 },
  ];

  const filteredPlayers = players.filter(player => player.score >= 70);

  return (
    <div>
      <h2>All Players</h2>
      {players.map((player, index) => (
        <p key={index}>{player.name} - {player.score}</p>
      ))}

      <h2>Players with Score ≥ 70</h2>
      {filteredPlayers.map((player, index) => (
        <p key={index}>{player.name} - {player.score}</p>
      ))}
    </div>
  );
};

export default ListofPlayers;
