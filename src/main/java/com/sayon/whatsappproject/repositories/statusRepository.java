package com.sayon.whatsappproject.repositories;

import com.sayon.whatsappproject.entities.status;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface statusRepository extends JpaRepository<status, Integer>
{
    //List<status> findByContact_no(String contact_no);
}

