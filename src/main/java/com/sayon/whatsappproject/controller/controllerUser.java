package com.sayon.whatsappproject.controller;

import com.sayon.whatsappproject.entities.user;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/user")
public class controllerUser
{
    @Autowired
    service serviceObj;

    @GetMapping("/show/all")
    private List<user> showContacts()
    {
        return serviceObj.userRepo.findAll();
    }

    @GetMapping("/show/contact/{contact-no}")
    private String showContact(@PathVariable("contact-no") String contact_no)
    {
        return serviceObj.userRepo.findById(contact_no).get().toString();
    }

    @PostMapping("add/contact")
    private String addContact(@RequestBody user obj)
    {
        serviceObj.userRepo.save(obj);
        return "User added";
    }
}
