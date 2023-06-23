# User Management System

This is the code for User Management Application using Spring Boot in Java.
This implements various API's like Get, Post, Put, Delete, which helps in functionality of the code.


## 🚀 About Me
Hi, My name is Nikhil Sharma,

I'm a full stack developer trainee at Geekster. I have knowledge of Java, OOPs, Maven, APIs, DSA.


## Data Flow

### Controller
-   This section contains a class named UserController which user functions as mentioned below :

       #### 1. PostMapping("addUser") : to input users.
       #### 2. GetMapping("getUserById/{ID}") : to display users on basis of ID.
       #### 3. GetMapping("getAllUser") : to display all users at once.
       #### 4. PutMapping("updateUserName/{ID}/{username}") : to update user's name.
       #### 5. PutMapping("updateUserPhoneNumber/{ID}/{phoneNumber}") : to update user's PhoneNumber.
       #### 6. @PutMapping("updateUserAddress/{ID}/{address}") : to update user's address.
       #### 7. DeleteMapping("deleteUser/{ID}") : to delete user by ID.

### Services
-   This section contains a class UserService with functions that helps API to perform their specific tasks : 

    #### 1. List<User> getAllUser()
    #### 2. String addUser(List<User> users)
    #### 3. User getUserId(int id)
    #### 4. String deleteUser(Integer id)
    #### 5. String updateUserName(Integer id, String username)
    #### 6. String updateUserPhoneNumber(Integer id, long phoneNumber)
    #### 7. String updateUserAddress(Integer id, String address)

###  Repository
-   This section contains a class UserRepo which returns a list of type user data types.

    #### 1. List<User> getUsers()

### Database Design
-   In this section we use a array list of user data type, where user is the type of data we created which will hold all necessary value of user entity as required.


## Data Structure Used

- We created a custom data type using concept of classes named **User**, which contains all the necessary information about a user entity. And the data structure used to handle this entity is **Array List**.
## Summary

This project performs various tasks which a certain application may perform like **Create**, **Read**, **Update**, **Delete**. 
We used **MVC Architecture** to create this project. 
And this is created in **SpringBoot** using **Maven** and **Java**.


## 🔗 Links
[![Github](https://img.shields.io/badge/Github-000?style=for-the-badge&logo=ko-fi&logoColor=white)](https://github.com/Nikhil-Sharma-CS)
[![linkedin](https://img.shields.io/badge/linkedin-0A66C2?style=for-the-badge&logo=linkedin&logoColor=white)](https://www.linkedin.com/in/nikhil-sharma-cse)
