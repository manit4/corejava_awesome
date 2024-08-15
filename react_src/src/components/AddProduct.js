import React from "react";
import { Button, Form, FormGroup, Input, Label } from "reactstrap";

const AddProduct = () => {

    return (

        <div style={ {marginLeft:400, marginRight:400} }>
            <Form>

                <FormGroup>
                    <Label for="productId">ProductId</Label> 
                    <Input
                        name="email"
                        placeholder="Enter Product Id"
                        type="text"
                    /> 
                </FormGroup>
                <FormGroup>
                    <Label for="productId">Product Name</Label> 
                    <Input
                        name="productName"
                        placeholder="Enter Product Name"
                        type="text"
                    /> 
                </FormGroup>
                <FormGroup>
                    <Label for="productId">Price</Label> 
                    <Input
                        name="price"
                        placeholder="Enter Price"
                        type="text"
                    /> 
                </FormGroup>

                <Button color="danger" style={ {marginLeft:170}}>Add Product</Button>

            </Form>
        </div>
    )
}

export default AddProduct;