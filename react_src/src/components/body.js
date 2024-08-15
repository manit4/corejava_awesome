import React from "react";
import { ToastContainer, toast } from "react-toastify";
import { Button } from "reactstrap";
import AllProducts from "./AllProducts";

function Body() {

    return ( 

        <div>
            <h1>I am Body Component</h1>
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