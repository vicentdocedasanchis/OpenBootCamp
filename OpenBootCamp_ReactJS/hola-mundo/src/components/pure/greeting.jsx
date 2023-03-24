import React, { Component } from 'react';
import PropTypes from 'prop-types';


class Greeting extends Component {
    constructor(props){
        super(props);
        this.state={
            age : 29
        }
    }
    render() {
        return (
            <div>
                <h1>
                    ¡HOLA {this.props.name }!
                </h1>
                <h2>
                    Tu edad es { this.state.age}
                </h2>
            </div>
        );
    }
    birthday = () =>{
        this.setState((prevState)=>{
            {
                age: prevState.age +1
            }
        })

      
    }
}


Greeting.propTypes = {
    name: PropTypes.string,

};


export default Greeting;
