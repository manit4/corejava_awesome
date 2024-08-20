import React from "react";
import { Button, Form, FormGroup, Input, Label } from "reactstrap";
import { generateToken, login } from "../services/login-service";
import { toast, ToastContainer } from "react-toastify";
import { useNavigate } from "react-router-dom";


const Login = () => {

    var navigate = useNavigate();

    var credentials = {
        username : '',
        password : ''
    }

    const submitForm = (e) => {

        e.preventDefault();
        console.log('Form Clicked...')

        if(credentials.username == '' || credentials.password == '') {
            toast.error('Field/s is empty, kinldy fill fields before submitting')
            return;
        }

        generateToken(credentials).then(
            (response) => {
                console.log('The resposne is '+response.data)
                login(response.data)
                navigate("/")
            },
        (error) => {
            console.log('The Error is '+error.data)
        }
        )
    }

    return (
        <div>
            <ToastContainer />
            <h1>Enter your Credentials for Login</h1>

            <Form onSubmit={submitForm}>
            <Label for="username">Username</Label>
                <FormGroup>
                    <Input type="text" name="username" placeholder="Enter Username" onChange={(e) => {
                        credentials.username = e.target.value;
                        console.log(credentials)
                    }}/>
                </FormGroup>
                <Label for="username">Password</Label>
                <FormGroup>
                    <Input type="text" name="password" placeholder="Enter Password" onChange={(e) => {
                        console.log(e)
                        credentials.password = e.target.value;
                        console.log('password is '+credentials.password)
                        console.log('username is '+credentials.username)
                    }}/>
                </FormGroup>
                <Button style={{marginLeft:300}}>Login</Button>
                
            </Form>
        </div>
    )
}

export default Login;