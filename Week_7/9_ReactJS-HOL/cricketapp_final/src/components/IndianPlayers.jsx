import React from 'react';

const IndianPlayers = () => {
  const oddTeamPlayers = ['Virat', 'Dhoni', 'Pant', 'Ashwin', 'Shami'];
  const evenTeamPlayers = ['Rohit', 'Gill', 'Hardik', 'Jadeja', 'Bumrah', 'Surya'];

  const T20players = ['Ishan', 'Sky', 'Tilak'];
  const RanjiTrophyPlayers = ['Pujara', 'Rahane'];
  const mergedPlayers = [...T20players, ...RanjiTrophyPlayers];

  return (
    <div>
      <h2>Odd Team Players</h2>
      {oddTeamPlayers.map((player, index) => (
        <p key={index}>{player}</p>
      ))}

      <h2>Even Team Players</h2>
      {evenTeamPlayers.map((player, index) => (
        <p key={index}>{player}</p>
      ))}

      <h2>Merged T20 and Ranji Players</h2>
      {mergedPlayers.map((player, index) => (
        <p key={index}>{player}</p>
      ))}
    </div>
  );
};

export default IndianPlayers;
