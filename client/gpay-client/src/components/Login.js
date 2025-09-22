import React, { useState } from 'react';
import { useManualForm } from './useManualForm';


export const Login = () => {
    const { userData, handleChange, handleSubmit } = useManualForm();

    return(
        <>
            <h2>Login Page</h2>
            <form onSubmit={(e) => handleSubmit(e, "http://localhost:8080/api/v1/users/loginUser")}>
                <div>
                    <label>Email: </label>
                    <input
                      type="email"
                      name="email"
                      value={userData.email}
                      onChange={handleChange}
                      required
                    />
                  </div>

                  <div>
                    <label>Password: </label>
                    <input
                      type="password"
                      name="password"
                      value={userData.password}
                      onChange={handleChange}
                      required
                    />
                  </div>

              <button type="submit">Submit</button>

            </form>
        </>
    )
}