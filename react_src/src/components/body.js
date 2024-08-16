import React, { useEffect, useState } from "react";
import { ToastContainer, toast } from "react-toastify";
import { Button } from "reactstrap";
import AllProducts from "./AllProducts";
import axios from "axios";

function Body() {

    const [products, setProducts] = useState([]);

    var name = 'Manit'

    useEffect(() => {
       fetchAllProducts();
       console.log('Name is '+name)
       name = 'Manu';
       console.log('afte setting '+name);
    },[])

    function fetchAllProducts() {
        axios.get("http://localhost:8080/allProducts").then(
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

    return ( 

        <div>
            <h1>I am Body Component and the name is {name}</h1>
            <ToastContainer />

            {

                products.map((item) => (
                    <h1>{item.productId}</h1>
                ))
            }

        </div>
    )
}







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