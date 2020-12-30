package com.sayon.whatsappproject.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name="user_table")
@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class user
{
    @Id
    @Column(name="contact_no")
    String contact_no;
    @Column(name="user_name")
    String user_name;

    // Joining status_table
    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name = "contact_number", referencedColumnName = "contact_no")
    List<status> statusInfo;

    // Joining message_table
    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name = "contact_no", referencedColumnName = "contact_no")
    List<message> messageInfo;
}
