import React, {useState, useEffect} from "react";
import { useNavigate } from "react-router-dom";
import { RowList } from "./RowList";

export const Business = () => {

    const [businessData, setBusinessData] = useState([]);

    useEffect(() => {
        fetch('http://localhost:8080/api/v1/businesses')
            .then((res) => res.json())
            .then((data) => {
                setBusinessData(data)
            })
    },[])

    return (
      <RowList
        title="Business List"
        data={businessData}
        nameKey="businessName"
        emailKey="email"
      />
    )
};

