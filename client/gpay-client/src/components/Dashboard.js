// Dashboard.js
import React from "react";
import { Friends } from "./Friends";
import { ConnectedFriends } from "./ConnectedFriends"
import { Business } from "./Business";
import { ConnectedBusiness } from "./ConnectedBusinesses";

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
