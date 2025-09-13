import React, { useEffect, useState } from 'react';
import { Routes, Route } from 'react-router-dom';
import './App.css';
import { LandingPage } from './components/LandingPage';
import { Login } from "./components/Login";
import { Register } from "./components/Register";
import { Home } from "./components/Home";
import { Profile } from "./components/Profile";
import { Loader } from "./components/Loader";

const HomePageWithLoader = Loader(Home);


function App() {
    const [isLoading, setIsLoading] = useState(true);
    const [userData, setUserData] = useState({});

    useEffect(() => {
        // API call to server to register user and get Data
        const timer = setTimeout(() => {
            setIsLoading(false);
            setUserData({name: 'Somya',email: 'dummy@gmail.com'})
        }, 10000);

        return () => clearTimeout(timer);
    })

  return (
    <div className="App">
      <Routes>
        <Route path="/" element={<LandingPage />} />
        <Route path="/login" element={<Login />} />
        <Route path="/register" element={<Register />} />
        <Route path="/home" element={<HomePageWithLoader isLoading={isLoading} userData={userData}/>} />
        <Route path="/profile" element={<Profile />} />
      </Routes>
    </div>
  );
}

export default App;
