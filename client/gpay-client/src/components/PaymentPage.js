import React, { useState } from "react";
import { useNavigate, useLocation } from "react-router-dom";
import '../App.css';

export const PaymentPage = () => {
  const navigate = useNavigate();
  const location = useLocation();
  const { recipientName } = location.state || {}; // get name from state
  const [amount, setAmount] = useState("");

  const handlePay = (e) => {
    e.preventDefault();
    if (!amount) return alert("Please enter amount");
    console.log(`Paying ${amount} to ${recipientName}`);
    alert(`Payment of ${amount} done to ${recipientName}`);
    navigate("/home"); // redirect back to home
  };

  return (
    <div className="paymentPageContainer">
      <h2>Payment Page</h2>
      <p>Paying to: <strong>{recipientName}</strong></p>

      <form onSubmit={handlePay} className="paymentForm">
        <input
          type="number"
          placeholder="Enter amount"
          value={amount}
          onChange={(e) => setAmount(e.target.value)}
          required
        />
        <button type="submit" className="payBtn">
          Pay
        </button>
      </form>
    </div>
  );
};
