package org.example.UserManagement.Model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class User {

    //User Details / Meta data of user

    //User ID is supposed to be unchangeable
    private Integer userID;

    private String name;

    private String userName;

    private String address;

    private Long phoneNumber;

}