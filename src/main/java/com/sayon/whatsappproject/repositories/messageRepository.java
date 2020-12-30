package com.sayon.whatsappproject.repositories;

import com.sayon.whatsappproject.entities.message;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface messageRepository extends JpaRepository<message, Integer>
{

}
