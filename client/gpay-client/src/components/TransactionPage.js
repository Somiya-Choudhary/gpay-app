import React from "react";
import { dummyTransactions } from "../DummyData/DummyTransactions";
import '../App.css';

export const TransactionPage = () => {
  return (
    <div className="transactionContainer">
      <h2>Transactions</h2>

      <div className="transactionHeader">
        <div>Recipient</div>
        <div>Type</div>
        <div>Amount</div>
        <div>Date</div>
      </div>

      <div className="transactionRows">
        {dummyTransactions.map((t) => (
          <div className="transactionRow" key={t.id}>
            <div>{t.recipient}</div>
            <div>{t.type}</div>
            <div>₹ {t.amount}</div>
            <div>{t.date}</div>
          </div>
        ))}
      </div>
    </div>
  );
};
