import React from "react";
import '../App.css';

export const Profile = ({ userData }) => {
  const { name, email, mobile,defaultPaymentType } = userData;

  return (
    <div className="profileContainer">
      <h2>User Profile</h2>

      <div className="profileInfo">
        <div className="profileItem">
          <strong>Name:</strong> {name}
        </div>
        <div className="profileItem">
          <strong>Email:</strong> {email}
        </div>
        <div className="profileItem">
          <strong>Mobile:</strong> {mobile}
        </div>
        <div className="profileItem">
          <strong>Default Payment Type:</strong> {defaultPaymentType || "Not set"}
        </div>
      </div>
    </div>
  );
};
