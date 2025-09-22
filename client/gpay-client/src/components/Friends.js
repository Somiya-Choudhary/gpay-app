import React, {useState, useEffect} from "react";
import { useNavigate } from "react-router-dom";
import { RowList } from "./RowList";

export const Friends = () => {

    const [friendsData, setFriendsData] = useState([]);

    useEffect(() => {
        fetch('http://localhost:8080/api/v1/users')
            .then((res) => res.json())
            .then((data) => {
                setFriendsData(data)
            })
    },[])

    return(
      <RowList
        title="Friends List"
        data={friendsData}
        nameKey="name"
        emailKey="email"
      />
    )

};