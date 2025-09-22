import React from "react";
import { useNavigate } from "react-router-dom";
import { businessData } from "../DummyData/BusinessData.js";
import { RowList } from "./RowList";

export const ConnectedBusiness = () => {
  const navigate = useNavigate();

  const handlePay = (business) => {
    navigate("/payment", { state: { recipientName: business.business } });
  };

  return (
    <RowList
      title="Connected Business"
      data={businessData}
      nameKey="business"
      emailKey="businessEmail"
      buttonText="Pay"
      onButtonClick={handlePay}
    />
  );
};
