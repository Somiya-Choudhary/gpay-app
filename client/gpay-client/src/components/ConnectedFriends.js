import React from "react";
import { useNavigate } from "react-router-dom";
import { friendsData } from "../DummyData/FriendsData.js";
import { RowList } from "./RowList";


export const ConnectedFriends = () => {
  const navigate = useNavigate();

  const handlePay = (friend) => {
    navigate("/payment", { state: { recipientName: "Dummy" } });
  };

  return (
    <RowList
      title="Connected Friends"
      data={friendsData}
      nameKey="username"
      emailKey="email"
      buttonText="Pay"
      onButtonClick={handlePay}
    />
  );
};
