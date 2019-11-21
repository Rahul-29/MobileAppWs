package com.rahul.app.ws.controller;

import com.rahul.app.ws.model.request.UpdateUserDetails;
import com.rahul.app.ws.model.response.UserResponse;
import org.springframework.web.bind.annotation.*;

import javax.validation.constraints.Null;

@RestController
@RequestMapping("/users")
public class UserController {

    @GetMapping(path = "/{userId}")
    public String getUser(@PathVariable String userId){
        return "GET USER called with user id :" + userId;
    }

    @GetMapping
    public String getUser(@RequestParam(name = "page")int page, @RequestParam(value = "limit")int limit){
        String firstName = null;
        int firstNameLength = firstName.length();
        return "Get User Response";
    }

    @PutMapping(path = "/{userId}")
    public String updateUser(@PathVariable String userId, @RequestBody UpdateUserDetails updateUserDetails){
        return "User updated of : " + updateUserDetails.getFirstName();
    }

    @DeleteMapping(path = "/{userId}")
    public String deleteUser(@PathVariable String userId){
        return "user deleted:::::" + userId;
    }
}
