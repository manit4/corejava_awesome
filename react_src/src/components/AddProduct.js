import axios from "axios";
import React from "react";
import { toast, ToastContainer } from "react-toastify";
import { Button, Form, FormGroup, Input, Label } from "reactstrap";

const AddProduct = () => {

    var product = {};

    function addProduct(e) {

        e.preventDefault();

        console.log("product is "+product)

        axios.post("http://localhost:8080/addProduct", product).then(
            (response) => {
              console.log(response);
              toast.success(response.data)
            },
            (error) => {
              console.log(error);
            }
        )

        document.getElementById('productId').value = '';
        document.getElementById('productName').value = '';
        document.getElementById('price').value = '';
    }

    return (

        <div style={ {marginLeft:200, marginRight:300} }>
            <ToastContainer />
            <Form onSubmit={addProduct}>

                <FormGroup>
                    <Label for="productId">ProductId</Label> 
                    <Input
                        name="email"
                        placeholder="Enter Product Id"
                        type="text"
                        id="productId"
                       onChange={(e)=> {
                         product.productId = e.target.value;
                         console.log(product)
                       }}
                        
                    /> 
                </FormGroup>
                <FormGroup>
                    <Label for="productId">Product Name</Label> 
                    <Input
                        name="productName"
                        placeholder="Enter Product Name"
                        type="text"
                        id="productName"
                        onChange={(e)=> {
                            product.productName = e.target.value
                            console.log(product)
                        }}
                    /> 
                </FormGroup>
                <FormGroup>
                    <Label for="productId">Price</Label> 
                    <Input
                        name="price"
                        placeholder="Enter Price"
                        type="text"
                        id="price"
                        onChange={(e)=> {
                            product.price = e.target.value;
                            console.log(product)
                        }}
                    /> 
                </FormGroup>

                <Button type="submit" color="danger" style={ {marginLeft:170}}>Add Product</Button>

            </Form>
        </div>
    )
}

export default AddProduct;