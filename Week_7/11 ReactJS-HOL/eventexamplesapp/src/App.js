import React, { Component } from 'react';
import CurrencyConvertor from './CurrencyConvertor';

class App extends Component {
  constructor(props) {
    super(props);
    this.state = {
      count: 0
    };
  }

  increment = () => {
    this.setState({ count: this.state.count + 1 });
    this.sayHello();
  }

  decrement = () => {
    this.setState({ count: this.state.count - 1 });
  }

  sayHello = () => {
    console.log("Hello! Welcome to the event example app.");
  }

  sayWelcome = (message) => {
    alert(message);
  }

  handleClick = (event) => {
    alert("I was clicked");
  }

  render() {
    return (
      <div style={{ textAlign: 'center' }}>
        <h1>React Event Handling</h1>
        <h2>Counter: {this.state.count}</h2>
        <button onClick={this.increment}>Increment</button>
        <button onClick={this.decrement}>Decrement</button>
        <br /><br />
        <button onClick={() => this.sayWelcome("Welcome!")}>Say Welcome</button>
        <br /><br />
        <button onClick={this.handleClick}>Synthetic Event Button</button>
        <br /><br />
        <CurrencyConvertor />
      </div>
    );
  }
}

export default App;
