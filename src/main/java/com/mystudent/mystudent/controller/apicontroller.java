package com.mystudent.mystudent.controller;

import com.mystudent.mystudent.model.user;
import com.mystudent.mystudent.repository.UserRepo;
import net.bytebuddy.agent.builder.AgentBuilder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class apicontroller {

    @Autowired
    private UserRepo userRepo;

    @GetMapping(value = "/users")
    public List<user> getusers(){
        return userRepo.findAll();
    }

    @PostMapping(value = "/save")
    public String saveUser(@RequestBody user user){
        userRepo.save(user);
        return "Saved...";
    }

    @PutMapping(value = "/update/{id}")
    public String updateUser(@PathVariable long id, @RequestBody user user){
        user updatedUser=userRepo.findById(id).get();
        updatedUser.setFname((user.getFname()));
        updatedUser.setLnmae((user.getLname()));
        updatedUser.setRollno((user.getRollno()));
        userRepo.save(updatedUser);
        return "Updated.....";

    }

    @DeleteMapping(value = "/delete/{id}")
    public String deleteuser(@PathVariable long id){
        user deleteuser=userRepo.findById(id).get();
        userRepo.delete(deleteuser);
        return "Deleted user with the id : " +id;
    }




}
