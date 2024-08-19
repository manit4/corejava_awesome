import axios from "axios"

const BASE_URL = "http://localhost:8080/";

export const getProducts= () => {
      
    return axios.get(BASE_URL+"allProducts");
}

export const removeProduct = (productId)  => {

    return axios.delete(BASE_URL+"delete/"+productId);
}
