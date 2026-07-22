import { useState } from "react";
import CurrencyConvertor from "./CurrencyConvertor";

function App() {

  const [count, setCount] = useState(0);

  function incrementValue() {
    setCount(count + 1);
  }

  function decrementValue() {
    setCount(count - 1);
  }

  function sayHello() {
    alert("Hello! Have a Nice Day.");
  }

  function increase() {
    incrementValue();
    sayHello();
  }

  function sayWelcome(message) {
    alert(message);
  }

  function onPress() {
    alert("I was clicked");
  }

  return (

      <div style={{ padding: "20px" }}>

        <h1>React Event Examples</h1>

        <h2>Counter : {count}</h2>

        <button onClick={increase}>
          Increment
        </button>

        &nbsp;

        <button onClick={decrementValue}>
          Decrement
        </button>

        <hr />

        <button onClick={() => sayWelcome("Welcome")}>
          Say Welcome
        </button>

        <hr />

        <button onClick={onPress}>
          OnPress
        </button>

        <hr />

        <CurrencyConvertor />

      </div>

  );

}

export default App;