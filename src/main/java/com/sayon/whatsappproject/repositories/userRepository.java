package com.sayon.whatsappproject.repositories;

import com.sayon.whatsappproject.entities.status;
import com.sayon.whatsappproject.entities.user;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface userRepository extends JpaRepository<user, String>
{
//    public List<user> findByStatusInfo(String contact_no);
}
