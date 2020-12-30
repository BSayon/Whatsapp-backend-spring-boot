package com.sayon.whatsappproject.controller;

import com.sayon.whatsappproject.entities.message;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/message")
public class controllerMessage
{
    @Autowired
    service serviceMsg;

    @GetMapping("/show/all")
    private List<message> getAllMessages()
    {
        return serviceMsg.msgRepo.findAll();
    }

    @GetMapping("/show/contact/{contact-no}")
    private String showMessage(@PathVariable("contact-no") String contact_no)
    {

        return "Feature Not added, in production......";
    }

    @PostMapping("add/contact/{contact-no}")
    private String addMessage(@PathVariable("contact-no") String contact_no, @RequestBody message msg)
    {
        message newobj = new message(msg.message.toString(), contact_no);
        serviceMsg.msgRepo.save(newobj);
        return "Message added..";
    }
}
