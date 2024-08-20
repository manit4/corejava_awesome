import React, { useEffect, useState } from "react";
import { Button, Form, FormGroup, Input, Label } from "reactstrap";
import { ToastContainer, toast } from "react-toastify";
import { useNavigate } from "react-router-dom";
import { dologin, generateToken } from "../services/user-service";

const Index = () => {

    const [loginForm, setLoginForm] = useState({})
    const navigate = useNavigate();

    function submitLoginForm(e) {
    console.log(loginForm);
    e.preventDefault();
    if(loginForm.username == null || loginForm.password == null) {
        toast.warn('Enter Credentials first')
        return;
    }
    generateToken(loginForm).then(
        (response) => {
            console.log('token is ', response.data)
            if(response.data != null && response.data != '') {
                dologin(response.data)
                navigate('/product')
            }
        }
    )
    .catch((error) => {
        console.log(error)
        toast.error('Bad Credentials')
    })
    }

    return (

        <div >
            <ToastContainer />
            <h2 style={{textAlign:'center'}}>Enter Credentials</h2>
            <Form onSubmit={submitLoginForm}>
                <Label for="username">Username</Label>
                <FormGroup>
                    <Input type="text" name="username" placeholder="Enter Username" onChange={(event)=> {
                        setLoginForm({...loginForm, username:event.target.value})
                        console.log('username is ', loginForm.username)
                    }}/>
                </FormGroup>
                <Label for="productName">Password</Label>
                <FormGroup>
                    <Input type="password" name="password" placeholder="Enter Password" onChange={(event)=> {
                        setLoginForm({...loginForm, password:event.target.value})
                        console.log('password is ', loginForm.username, loginForm.password)
                    }}/>
                </FormGroup>
                
                <div style={{textAlign:'center'}}>
                <Button color="primary" type='submit'>Login</Button>
                </div>
            </Form>
        </div>
    )

}

export default Index