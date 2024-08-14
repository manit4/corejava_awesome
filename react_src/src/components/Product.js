import React from "react";

const Product = ({data}) => {

    return (

        <div>
            <h2>{data.productId}&nbsp;{data.name}&nbsp;{data.price}&nbsp;{data.category}</h2>
        </div>
    )
}

export default Product;