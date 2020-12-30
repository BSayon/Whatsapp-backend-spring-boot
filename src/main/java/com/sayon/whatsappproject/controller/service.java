package com.sayon.whatsappproject.controller;

import com.sayon.whatsappproject.repositories.messageRepository;
import com.sayon.whatsappproject.repositories.statusRepository;
import com.sayon.whatsappproject.repositories.userRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class service
{
    @Autowired
    public userRepository userRepo;

    @Autowired
    public messageRepository msgRepo;

    @Autowired
    public statusRepository statusRepo;
}
