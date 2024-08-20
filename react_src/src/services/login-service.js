import axios from "axios"

export const BASE_URL = "http://localhost:8080/"

export const generateToken = (credentials) =>{

    return axios.get(BASE_URL+"fetchName");
}

export const login = (token) => {

    localStorage.setItem('token', token);
}

export const isLoggedIn = () => {

    console.log('toek is inside isLoggedIn '+localStorage.getItem('token'))

    if(localStorage.getItem('token') == '' || localStorage.getItem('token') == null || localStorage.getItem('token') == undefined ) {
        console.log('inside if of isLoggedIn')
        return false;
    }
    else {
        console.log('else of islOggedIn')
        return true;
    }
}