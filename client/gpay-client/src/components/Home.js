import React from 'react';

export const Home = ({userData}) => {

    return (
        <>
            <h1>Welcome to Home Page</h1>
            <div>{userData.name}</div>
            <div>{userData.email}</div>
        </>
    )
}