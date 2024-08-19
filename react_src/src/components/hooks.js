import axios from "axios";
import React, { useEffect, useState } from "react";
import { Button } from "reactstrap";

function Hooks() {

    const [name, setName] = useState('')

    useEffect(() => {
         fetchNameAPI();
    },[])

    function fetchNameAPI() {

            console.log('inside useEffect')
    
               axios.get("http://localhost:8080/fetchName").then(
                (response) => {
                   
                    console.log("response is "+response.data)
                    //name = response.data;
                    setName(response.data)
    
                },
                (error) => {
                    console.log("Error is "+error)
                }
               )
    }

    return (

        <h1>
            I am Hook and the name is {name}...

            <Button onClick={()=> {
                console.log("Name is from the button click "+name)
            }}>Click to see the value of name</Button>
        </h1>
    )
}

export default Hooks;