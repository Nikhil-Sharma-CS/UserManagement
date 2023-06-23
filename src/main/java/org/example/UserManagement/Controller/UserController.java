package org.example.UserManagement.Controller;

import org.example.UserManagement.Model.User;
import org.example.UserManagement.Service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class UserController {

    @Autowired
    UserService userService;


    //Post mapping to addUser
    @PostMapping("addUser")
    public String addUser(@RequestBody List<User> users)
    {
        return userService.addUser(users);
    }


    //Get mapping to getUser by id
    @GetMapping("getUserById/{ID}")
    public User getUserById(@PathVariable Integer ID)
    {
        return userService.getUserId(ID);
    }


    //Get mapping to getAllUser
    @GetMapping("getAllUser")
    public List<User> getAllUser()
    {
        return userService.getAllUser();

    }


    //Put Mappings to updateUserInfo
    //Put Mapping to change username by ID
    @PutMapping("updateUserName/{ID}/{username}")
    public String updateUserName(@PathVariable Integer ID, @PathVariable String username)
    {
        return userService.updateUserName(ID, username);
    }


    //Put Mapping to change userPhoneNumber by ID
    @PutMapping("updateUserPhoneNumber/{ID}/{phoneNumber}")
    public String updateUserPhoneNumber(@PathVariable Integer ID, @PathVariable long phoneNumber)
    {
        return userService.updateUserPhoneNumber(ID, phoneNumber);
    }


    //Put Mapping to change userAddress by ID
    @PutMapping("updateUserAddress/{ID}/{address}")
    public String updateUserAddress(@PathVariable Integer ID, @PathVariable String address)
    {
        return userService.updateUserAddress(ID,address);
    }


    //Delete Mapping to deleteUser
    @DeleteMapping("deleteUser/{ID}")
    public String deleteUser(@PathVariable Integer ID)
    {
        return userService.deleteUser(ID);
    }
}