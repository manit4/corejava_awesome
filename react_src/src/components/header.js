import React from "react";

function Header() {

    return (
        <div>
            <h1> I am Header Component</h1>

        </div>
    )
}



// function Header() {

//     var data = [
//         {
//             username:'abc',
//             password:'123',
//             name:'Manit'
//         },
//         {
//             username:'bcd',
//             password:'234',
//             name:'Manu'
//         }
//     ]

//     return (
//         <div>
           
//            {
//             data.map((item) =>
//             <h1>{item.name}</h1>)
//            }

//         </div>
//     )
// }





// function Header() {

//     var data = [
//         {
//             username:'abc',
//             password:'123',
//             name:'Manit'
//         },
//         {
//             username:'bcd',
//             password:'234',
//             name:'Manu'
//         }
//     ]

//     return (
//         <div>
           
//            <h2>{data[0].name}{data[0].username}</h2>
//            <h2>{data[1].name}</h2>

//         </div>
//     )
// }

// function Header() {

//     var name = 'Manit'

//     var data = {
//         username:'abc',
//         password:'123',
//         name:'Manit'
//     }


//     return (
//         <div>
           
//            <h1>{name}</h1>
//            {data.name}

//         </div>
//     )
// }





// function Header({name, age, value, namesData}) {

//     return (
//         <div>
//             <h1>This is Header Component and the prop value is {name} and the age is {age}
//             and the value is {value} and the size of the array is {namesData.length}</h1>

//         </div>
//     )
// }

export default Header;