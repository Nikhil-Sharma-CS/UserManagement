package org.example.UserManagement.Service;

import org.example.UserManagement.Model.User;
import org.example.UserManagement.Repository.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Objects;

@Service
public class UserService {

    @Autowired
    UserRepo userRepo;

    public List<User> getAllUser() {
        return userRepo.getUsers();
    }


    //Post Mapping function to add users
    public String addUser(List<User> users) {
        List<User> OriginalList = getAllUser();
        OriginalList.addAll(users);

        return "Users added";
    }


    //Get Mapping function to get user by ID
    public User getUserId(int id) {
        List<User> UserList = getAllUser();
        for(User user : UserList)
        {
            if(user.getUserID() == id)
                return user;
        }
        return null;
    }

    //Delete Mapping function to delete user by ID
    public String deleteUser(Integer id) {
        List<User> Users = getAllUser();
        for(User user : Users)
        {
            if(Objects.equals(user.getUserID(), id))
            {
                Users.remove(user);
                return "User Removed";
            }
        }
        return "User Not Found";
    }


    //Put Mapping function to update user's name
    public String updateUserName(Integer id, String username) {
        List<User> Users = getAllUser();
        for(User user : Users)
        {
            if(Objects.equals(user.getUserID(), id))
            {
                user.setUserName(username);
                return "User Name Updated";
            }
        }
        return "User Not Found";
    }


    //Put Mapping function to update user's PhoneNumber
    public String updateUserPhoneNumber(Integer id, long phoneNumber) {
        List<User> Users = getAllUser();
        for(User user : Users)
        {
            if(Objects.equals(user.getUserID(), id))
            {
                user.setPhoneNumber(phoneNumber);
                return "User Phone Number Updated";
            }
        }
        return "User Not Found";
    }


    //Put Mapping function to update user's address
    public String updateUserAddress(Integer id, String address) {
        List<User> Users = getAllUser();
        for(User user : Users)
        {
            if(Objects.equals(user.getUserID(), id))
            {
                user.setAddress(address);
                return "User Address Updated";
            }
        }
        return "User Not Found";
    }
}
