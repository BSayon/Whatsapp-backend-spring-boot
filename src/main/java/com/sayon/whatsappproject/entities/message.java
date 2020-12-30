package com.sayon.whatsappproject.entities;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.*;
import java.sql.Date;
import java.time.Instant;

@Entity
@Table(name="message_table")
@Data
@NoArgsConstructor
@ToString
public class message
{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Integer message_id;
    @Column
    public
    String message;
    @Column
    String time;
    @Column
    String contact_no;

    public message(String message, String contact_no) {
        this.message = message;
        this.contact_no = contact_no;
        this.time = Date.from(Instant.now()).toString();
    }
}
