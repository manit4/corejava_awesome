import React from "react";
import Product from "./Product";

const AllProducts = () => {

    var products = [
        {
            productId : 'p_01',
            name : 'Sony LED',
            price : 100,
            category : 'Electronics'
        },
        {
            productId : 'p_02',
            name : 'Levis Jeans',
            price : 30,
            category : 'Clothing'
        }
    ]

    return (

        <>
        Here are the Products Available for you
            {
                products.map((item) => 
               <Product data = {item}/> )
            }
        </>
    )
}

export default AllProducts






// const AllProducts = () => {

//     var products = [
//         {
//             productId : 'p_01',
//             name : 'Sony LED',
//             price : 100,
//             category : 'Electronics'
//         },
//         {
//             productId : 'p_02',
//             name : 'Levis Jeans',
//             price : 30,
//             category : 'Clothing'
//         }
//     ]

//     return (

//         <>
//             {
//                 products.map((item) => 
//                 <h2>{item.name} &nbsp;&nbsp;{item.price}</h2>)
//             }
//         </>
//     )
// }

// export default AllProducts