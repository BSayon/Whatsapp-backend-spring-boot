package com.sayon.whatsappproject.controller;

import com.sayon.whatsappproject.entities.status;
import com.sayon.whatsappproject.entities.user;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/status")
public class controllerStatus
{
    @Autowired
    service serviceObj;

    @GetMapping("/show/all")
    private List<status> showStatus()
    {
        return serviceObj.statusRepo.findAll();
    }

    @GetMapping("/show/contact/{contact-no}")
    private String getStatus(@PathVariable("contact-no") String contact_no)
    {
        // get status by contact_no
//        String obj = serviceObj.statusRepo.findByContact_no(contact_no).toString();
//        return obj;
        return "Feature not added, in production....";
    }

    @PostMapping("/add/contact/{contact-no}")
    private String addStatus(@PathVariable("contact-no")String contact_no, @RequestBody status st)
    {
        status obj = new status(contact_no, st.status_message.toString());
        serviceObj.statusRepo.save(obj);
        return "Status added";
    }
}
