import './App.css';
import Body from './components/body';
import Footer from './components/footer';
import Header from './components/header'; 


function App() {

  var data = " I am learnig React";

  var names = [ 'Eileen', 'Xi', 'Zhen' ]

  return (
    <div style={ {color:"green"} }>
      <Header name="Manit" age = "100" value={data} namesData = {names}/>

      <h1>Hi, this is My First React App and the size of array is {names.length}</h1>
      <h1>Hi, this is My First React App</h1>

      <Body />
      <Footer />
    </div>
  )
}

export default App;
