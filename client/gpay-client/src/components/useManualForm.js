import React, { useState } from 'react';
import { useNavigate } from "react-router-dom";


export const useManualForm = () => {
    const [userData, setUserData] = useState({});
    const navigate = useNavigate();

    const handleChange = (e) => {
        const { name, value } = e.target;
        setUserData((prev) => ({...prev,[name]: value}))
    }

    const handleSubmit = (e, url) => {
        console.log("userData",userData)
        e.preventDefault(); // prevent page refresh
        fetch(url, {
          method: "POST",
          headers: { "Content-Type": "application/json" },
          body: JSON.stringify(userData),
        })
          .then((res) => res.json())
          .then((data) => {
            console.log(" user:", data);
            navigate("/home");
          })
          .catch((e) => {
            console.log("error:", e);
          });

      }

      return({userData,handleChange,handleSubmit})



}