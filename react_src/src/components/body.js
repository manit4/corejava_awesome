import React, { useEffect, useState } from "react";
import { ToastContainer, toast } from "react-toastify";
import { Button } from "reactstrap";
import AllProducts from "./AllProducts";
import axios from "axios";
import { getProducts, removeProduct } from "../services/ProductService";




function Body() {

    const [products, setProducts] = useState([]);

    useEffect(() => {
       fetchAllProducts();
    },[])

    function fetchAllProducts() {

        getProducts().then(
            (response) => {
                console.log(response)
                setProducts(response.data);
                console.log(products);
                toast.success('Products Available...',
                    {
                        position:'bottom-center'
                    }
                )
            },
            (error) => {
                console.log(error)
                toast.error('Internal Server Error...')
            }
        );
    }

    function deleteProduct(productId) {
         removeProduct(productId).then(
                        (response) => {
                           console.log(response.data)
                           toast.error("Product Deleted")
                           fetchAllProducts();

                        },
                        (error) => {
                             console.log(error.data)
                        }
                    )
    }

    

    return ( 

        <div>
            <h1>I am Body Component</h1>
            <ToastContainer />

            {

                products.length > 0 ? products.map((item) => (
                    <h1>{item.productId}&nbsp;&nbsp;{item.productName}&nbsp;&nbsp;{item.price}&nbsp;&nbsp;<Button color = "warning" onClick={() => {
                        deleteProduct(item.productId)
                    }}>Delete</Button></h1>
                    
                )) : "No Products Available"
            }

        </div>
    )
}
















// function Body() {

//     const [products, setProducts] = useState([]);

//     useEffect(() => {
//        fetchAllProducts();
//     },[])

//     function fetchAllProducts() {
//         axios.get("http://localhost:8080/allProducts").then(
//             (response) => {
//                 console.log(response)
//                 setProducts(response.data);
//                 console.log(products);
//                 toast.success('Products Available...',
//                     {
//                         position:'bottom-center'
//                     }
//                 )
//             },
//             (error) => {
//                 console.log(error)
//                 toast.error('Internal Server Error...')
//             }
//         );
//     }

//     function deleteProduct(productId) {
//         console.log('inside delete() and the id is '+productId)

//         axios.delete("http://localhost:8080/delete/"+productId).then(
//             (response) => {
//                console.log(response.data)
//             },
//             (error) => {
//                  console.log(error.data)
//             }
//         )
//     }

//     return ( 

//         <div>
//             <h1>I am Body Component</h1>
//             <ToastContainer />

//             {

//                 products.map((item) => (
//                     <h1>{item.productId}&nbsp;&nbsp;{item.productName}&nbsp;&nbsp;{item.price}&nbsp;&nbsp;<Button color = "warning" onClick={() => {
//                         deleteProduct(item.productId);
//                     }}>Delete</Button></h1>
                    
//                 ))
//             }

//         </div>
//     )
// }







// function Body() {

//     // function notify() {
//     //     toast("Wow so easy!");
//     // }

//     return ( 

//         <div>
//             <ToastContainer />
//             <h2 style={{color:"red"}}>This is Body Component</h2>
//             {/* <Button color="primary" onClick={notify}>Click Me</Button> */}
//             <Button color="primary" onClick={() => {
//                 toast.success("Product Added Successfully", {
//                     position: "top-left",
//                     autoClose: 5000,
//                     hideProgressBar: false,
//                     closeOnClick: true,
//                     pauseOnHover: false,
//                     draggable: true,
//                     progress: undefined,
//                     theme: "dark"
//                     })
//             }}>Click Me</Button>

// <AllProducts />

//         </div>
//     )
// }



export default Body;