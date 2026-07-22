import { useState } from "react";
import Guest from "./Guest";
import User from "./User";

function App() {

  const [isLoggedIn, setIsLoggedIn] = useState(false);

  function login() {
    setIsLoggedIn(true);
  }

  function logout() {
    setIsLoggedIn(false);
  }

  return (

      <div style={{ padding: "20px" }}>

        <h1>Ticket Booking App</h1>

        {

          isLoggedIn ?

              <div>

                <button onClick={logout}>
                  Logout
                </button>

                <User />

              </div>

              :

              <div>

                <button onClick={login}>
                  Login
                </button>

                <Guest />

              </div>

        }

      </div>

  );

}

export default App;