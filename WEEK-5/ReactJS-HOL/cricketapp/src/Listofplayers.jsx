function ListofPlayers() {

    const players = [
        { name: "Virat Kohli", score: 95 },
        { name: "Rohit Sharma", score: 88 },
        { name: "Shubman Gill", score: 75 },
        { name: "KL Rahul", score: 65 },
        { name: "Hardik Pandya", score: 72 },
        { name: "Ravindra Jadeja", score: 68 },
        { name: "Rishabh Pant", score: 91 },
        { name: "Mohammed Shami", score: 45 },
        { name: "Jasprit Bumrah", score: 60 },
        { name: "Kuldeep Yadav", score: 55 },
        { name: "Mohammed Siraj", score: 80 }
    ];

    const lowScorePlayers = players.filter(player => player.score < 70);

    return (
        <div>
            <h2>List of Players</h2>

            <table border="1" cellPadding="10">
                <thead>
                <tr>
                    <th>Player</th>
                    <th>Score</th>
                </tr>
                </thead>

                <tbody>
                {players.map((player, index) => (
                    <tr key={index}>
                        <td>{player.name}</td>
                        <td>{player.score}</td>
                    </tr>
                ))}
                </tbody>
            </table>

            <br />

            <h2>Players with Score Below 70</h2>

            <ul>
                {lowScorePlayers.map((player, index) => (
                    <li key={index}>
                        {player.name} - {player.score}
                    </li>
                ))}
            </ul>

        </div>
    );
}
export default ListofPlayers;