// Dashboard.js
import React from "react";
import { Friends, ConnectedFriends } from "./Friends";
import { Business, ConnectedBusiness } from "./Business";

export const Dashboard = () => {
  return (
    <div className="dashboardContainer">
      <div className="dashboardContainer">
        <Friends />
        <ConnectedFriends />
        <Business />
        <ConnectedBusiness />
      </div>
    </div>
  );
};
