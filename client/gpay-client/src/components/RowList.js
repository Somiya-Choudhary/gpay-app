import React from "react";

export const RowList = ({ title, data, nameKey, emailKey, buttonText = "+ Add", onButtonClick }) => {
  return (
    <div className="boxContainer">
      <div className="boxHeader">
        <h2>{title}</h2>
      </div>
      <div className="boxContent">
        {data.map((item, index) => (
          <div className="boxRow" key={index}>
            <div className="boxInfo">
              <div className="username">{item[nameKey]}</div>
              <div className="email">{item[emailKey]}</div>
            </div>
            <button
              className="actionBtn"
              onClick={() => onButtonClick && onButtonClick(item)}
            >
              {buttonText}
            </button>
          </div>
        ))}
      </div>
    </div>
  );
};
