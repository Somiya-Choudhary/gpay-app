import React from 'react';
import { useNavigate } from 'react-router-dom';
import '../App.css';
import { Dashboard } from './Dashboard';

export const Home = ({ userData }) => {
  const navigate = useNavigate();

  const goToProfile = () => {
    navigate("/profile");
  };

  const addPaymentType = () => {
    navigate("/addpaymenttype");
  };

  const goToTransactions = () => {
      navigate("/transactions");
    };

  return (
    <>
      <h1>Hello {"Dummy"}, Welcome to Payment App</h1>

      <div className="userInfo">
        <div className="userEmail">{userData.email}</div>
        <button className="profileBtn" onClick={goToProfile}>
          Go to Profile
        </button>
        <button className="transactionsBtn" onClick={goToTransactions}>
          Your Transactions
        </button>
        <button className="paymentBtn" onClick={addPaymentType}>
          Add new Payment type
        </button>
      </div>

      <Dashboard />
    </>
  );
};
