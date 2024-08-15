import React from "react";
import { Link } from "react-router-dom";
import { ListGroup } from "reactstrap";

const Menu = () => {

    return (

        <ListGroup>
            <Link className="list-group-item" tag="a" to="/">Home</Link>
            <Link className="list-group-item" tag="a" to="/product">Product</Link>
            <Link className="list-group-item" tag="a" to="/employee">Employee</Link>
            <Link className="list-group-item" tag="a" to="/category">Category</Link>
        </ListGroup>
    )
}

export default Menu;