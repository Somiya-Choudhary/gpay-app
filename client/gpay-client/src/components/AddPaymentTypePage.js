import React, { useState } from "react";
import { useNavigate } from "react-router-dom";
import '../App.css';

export const AddPaymentTypePage = () => {
  const navigate = useNavigate();

  const [paymentType, setPaymentType] = useState(""); // credit, debit, upi
  const [cardNumber, setCardNumber] = useState("");
  const [upiId, setUpiId] = useState("");

  const handlePaymentTypeChange = (e) => {
    setPaymentType(e.target.value);
    setCardNumber("");
    setUpiId("");
  };

  const handleSubmit = (e) => {
    e.preventDefault();
    console.log("Payment type added:", paymentType, cardNumber || upiId);
    alert(`Payment type added: ${paymentType}`);
    navigate("/home"); // redirect back to home
  };

  return (
    <div className="paymentPageContainer">
      <h2>Add Payment Type</h2>
      <form onSubmit={handleSubmit} className="paymentForm">
        <div className="paymentTypeOptions">
          <label>
            <input
              type="radio"
              value="Credit Card"
              checked={paymentType === "Credit Card"}
              onChange={handlePaymentTypeChange}
            />
            Credit Card
          </label>

          <label>
            <input
              type="radio"
              value="Debit Card"
              checked={paymentType === "Debit Card"}
              onChange={handlePaymentTypeChange}
            />
            Debit Card
          </label>

          <label>
            <input
              type="radio"
              value="UPI"
              checked={paymentType === "UPI"}
              onChange={handlePaymentTypeChange}
            />
            UPI
          </label>
        </div>

        {paymentType === "Credit Card" || paymentType === "Debit Card" ? (
          <input
            type="text"
            placeholder="Enter Card Number"
            value={cardNumber}
            onChange={(e) => setCardNumber(e.target.value)}
            required
          />
        ) : null}

        {paymentType === "UPI" ? (
          <input
            type="text"
            placeholder="Enter UPI ID"
            value={upiId}
            onChange={(e) => setUpiId(e.target.value)}
            required
          />
        ) : null}

        <button type="submit" className="submitBtn">
          Add Payment
        </button>
      </form>
    </div>
  );
};
