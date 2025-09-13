import React from 'react';
import { useNavigate } from "react-router-dom";

import { Button } from './Button';


export const LandingPage = () => {
    const navigate = useNavigate();

    const onRegister = () => {
        navigate("/register")
    }

    const onLogin = () => {
        navigate("/login")
    }

    return(
    <>
        <h2> Payment App</h2>
        <div>
            <Button text={'Login'} onClickHandler={onLogin} />
            <Button text={'Register'} onClickHandler={onRegister} />
        </div>

    </>)

}
