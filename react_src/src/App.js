import { Col, Container, Row } from 'reactstrap';
import './App.css';
import AddProduct from './components/AddProduct';
import Body from './components/body';
import Footer from './components/footer';
import Header from './components/header'; 
import Menu from './components/Menu';
import { BrowserRouter, Route, Routes } from 'react-router-dom';
import AddEmployee from './components/AddEmployee';
import AddCategory from './components/AddCategory';


function App() {

  return (
    <div>
      <BrowserRouter>
        <Container>
        <Header />
          <Row>
            <Col md={4}><Menu /></Col>
            
            <Col md={8}>
            <Routes>
            <Route path='/' Component={Body} />
            <Route path='/product' Component={AddProduct} />
            <Route path='/employee' Component={AddEmployee} />
            <Route path='/category' Component={AddCategory} />
            </Routes>
            </Col>
            
            

          </Row>

        </Container>
      </BrowserRouter>
    </div>
  )
}







// function App() {

//   var data = " I am learnig React";

//   var names = [ 'Eileen', 'Xi', 'Zhen' ]

//   return (
//     <div style={ {color:"green"} }>
//       {/* <Header name="Manit" age = "100" value={data} namesData = {names}/>

//       <h1>Hi, this is My First React App and the size of array is {names.length}</h1>
//       <h1>Hi, this is My First React App</h1> */}

//       {/* <Body /> */}

//         <AddProduct />

//       {/* <Footer /> */}
//     </div>
//   )
// }

export default App;