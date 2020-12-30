package com.sayon.whatsappproject.entities;

import lombok.*;

import javax.persistence.*;
import java.sql.Date;
import java.time.Instant;

@Entity
@Table(name="status_table")
@Data
@NoArgsConstructor
@ToString
public class status
{
    @Id
    @Column(name="status_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Integer status_id;
    @Column(name="status_msg")
    public
    String status_message;
    @Column(name="status_time")
    String time;
    @Column(name="contact_number")
    String contact_no;

    public status(String contact_no, String status_message)
    {
        this.contact_no = contact_no;
        this.status_message = status_message;
        this.time = Date.from(Instant.now()).toString();
    }

    public void setStatus_message(String status_message) {
        this.status_message = status_message;
    }

    public void setContact_no(String contact_no) {
        this.contact_no = contact_no;
    }

    public String getContact_no() {
        return contact_no;
    }
}
