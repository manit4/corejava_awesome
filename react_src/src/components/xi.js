import React, { useEffect } from "react";
import { generateToken } from "../services/user-service";

export const Xi = () => {

    var name = "Laurene";

    useEffect( () => {
        
        console.log('the name is '+name)
    })

    return (
        <div>
            <h1> I am Xi Component and the name is {name}...</h1>
        {
            console.log('hiiiii')
        }
        </div>
    )
}