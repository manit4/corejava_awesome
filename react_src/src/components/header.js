import React from "react";

function Header({name, age, value, namesData}) {

    return (
        <h1>This is Header Component and the prop value is {name} and the age is {age}
        and the value is {value} and the size of the array is {namesData.length}</h1>
    )
}

export default Header;