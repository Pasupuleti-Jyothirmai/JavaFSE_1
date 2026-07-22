import ListofPlayers from "./ListofPlayers.jsx";
import IndianPlayers from "./IndianPlayers.jsx";

function App() {

  const flag = true;

  if (flag) {
    return (
        <ListofPlayers />
    );
  }
  else {
    return (
        <IndianPlayers />
    );
  }

}

export default App;