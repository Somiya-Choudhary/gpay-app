import React, { useState } from 'react';
import { useNavigate } from "react-router-dom";


export const useManualForm = () => {
    const [userData, setUserData] = useState({});
    const navigate = useNavigate();

    const handleChange = (e) => {
        const { name, value } = e.target;
        setUserData((prev) => ({...prev,[name]: value}))
    }

    const handleSubmit = (e) => {
        e.preventDefault(); // prevent page refresh
        console.log("Form submitted:", userData);
        navigate("/home")
      }

      return({userData,handleChange,handleSubmit})



}