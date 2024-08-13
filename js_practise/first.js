
// var b;
// console.log(b)


// var a = 100;
// a = 105;
// console.log(a)
// console.log( typeof a)

// a = 'Zhen';
// console.log(a)

// console.log( typeof a)

// a = true;
// console.log( typeof a)


// var names = [ 'Eileen', 'Shuai', 'Zhen' ];
// console.log(names)

// console.log( names[0]+ names[1]);
// console.log( names[0] +' and '+ names[1]);

// console.log(names[5]);

// names[10] = 'Xi';

// for( var i = 0; i < names.length; i++ ){

//     console.log( names[i] )
// }

//this is function declaration
// function display() {
//     console.log( 'inside display()' )
// }

// display();


// function add( a, b ) {

//     console.log( a+b )
// }

// add(10, 20, 30);//This is legal in js as you can see add() accepts 2 argumnets but passed 3...
// add( 'Manit', 'Manu');


// function add( a, b ) {

//     console.log( a + b )
//     console.log(arguments)
// }

// add(10, 30, 20, 100);





// function add( a, b ) {

//     var total = 0;

//     for( var i = 0; i < arguments.length; i++ ){
//         total = total +arguments[i];
//     }

//     console.log('Total is ',total)  
// }

// add(10, 30, 20, 100);






// function add(a, b) {

//     return a+b;
// }

// var returnedValue = add(10, 20);
// console.log(returnedValue)




//below is the function expression...

// var display = function() {
//     console.log('hi');
// }

// display();



// var add = function(a, b) {

//     console.log( a+b )
// }

// add(10, 20);



// function displayPurpose( result ) {
//     console.log(result)
// }

// function add( a, b ) {

//     var total = a + b;

//     displayPurpose(total);
// }

// add(50, 100);






// function displayPurpose( result ) {
//     console.log(result)
// }

// function add( a, b, cMethod ) {

//     var total = a + b;

//     cMethod(total)
// }

// add(50, 100, displayPurpose);

//JS Object
// var name = {
//     username: 'Manit',
//     email: 'manit@gmail.com', 
//     age : 100
// }

// console.log(name)
// name.username = 'Eileen';
// name.age = 101;
// console.log(name)






// var manit = {
//     username: 'Manit',
//     email: 'manit@gmail.com', 
//     age : 10,
//     playingBasketBall :  function() {
//         this.age = 100;
//     }
// }

// manit.playingBasketBall();
// console.log(manit.age)

// var zhen = {
//     username: 'Zhen',
//     email: 'zhen@gmail.com', 
//     age : 11,
//     playingBasketBall :  function(age) {
//         this.age = age;
//     }
// } 

// zhen.playingBasketBall(20);

// console.log( zhen)


// function Person( username, age, email ) {

//     this.username = username;
//     this.age = age;
//     this.email = email;

//     this.playingBasketBall = function(age) {
//         this.age = age;
//     }
// }

// var laurene = new Person('Laurene', 22, 'lau@gmail.com');
// console.log(laurene)

// var jing = new Person('Jingjing', 21, 'jing@gmail.com');
// jing.playingBasketBall(25);
// console.log(jing)



// [
//     {
//         "username" : "Jing",
//         "password" : "123"
//     },
//     {
//         "username" : "Laurene",
//         "password" : "234"
//     },
//     {
//         "username" : "Zhen",
//         "password" : "345"
//     }
// ]



// var names = [ 'Zhen', 'Xi','Laurene', 'Jing'];
// //names.sort();//this sorts in increasing order...
// console.log(names)

// var names = [ 'Zhen', 'Xi','Laurene', 'Jing'];
// names.reverse();
// console.log(names)



// var salaries = [34, 21, 5, 10];
// salaries.sort();

// console.log(salaries)

// var salaries = [34, 21, 5, 10];

// salaries.sort(function (x, y) {
//    console.log(x, y)
//    return y - x;
// });

// console.log(salaries)







// var salaries = [34, 21, 5, 10];

// var filteredSalaries = salaries.filter(function(x) {
//     if(x >= 10 ) {
//         return x;
//     }
// })

// console.log(filteredSalaries)





// var salaries = [34, 21, 5, 10];

// var filteredSalaries = salaries.map(function(item) {
  
//     return item +10;
// })

// console.log(filteredSalaries)








// var salaries = [34, 21, 5, 10];

// salaries.forEach(function(x) {
//     console.log(x)
// })




// var salaries = [34, 21, 5, 10];

// var display = function(x) {
//     console.log(x)
// }

// salaries.forEach(display)






var salaries = [34, 21, 5, 10];

var sortScheme = function(x, y) {
    
    return x - y;
}

salaries.sort(sortScheme)

console.log(salaries)



