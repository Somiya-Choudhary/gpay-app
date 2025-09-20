import React, { useState } from 'react';
import { useManualForm } from './useManualForm';

export const Register = () => {
    const { userData, handleChange, handleSubmit } = useManualForm();

    return (
        <>
            <h2>On Register Page</h2>
            <form onSubmit={(e) => handleSubmit(e,"http://localhost:8080/api/v1/createUser")}>
                <div>
                    <label>User Name:</label>
                    <input
                        type="text"
                        name="name"
                        value={userData.username}
                        onChange={handleChange}
                        required
                    />
                </div>
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

                  <div className="formItem">
                    <label>Mobile: </label>
                    <input
                      type="tel"
                      name="contactNumber"
                      value={userData.mobile}
                      onChange={handleChange}
                      required
                      placeholder="Enter mobile number"
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
