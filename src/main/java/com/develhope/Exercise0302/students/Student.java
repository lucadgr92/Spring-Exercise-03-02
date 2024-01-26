package com.develhope.Exercise0302.students;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "students")
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    @Column(name = "first_name", nullable = false)
    private String firstName;
    @Column(name = "second_name", nullable = false)
    private String secondName;
    @Column(name = "email", nullable = false, unique = true)
    private String email;

}

/*

    scrivi una applicazione web Spring Boot con le dipendenze neccessarie che:
        crea un mock della base dati usando h2 che ha username:testdb e password:psw1234
        crea la tabella students dove ogni studente avrà:
        primary key
        colonna lastName (not null)
        colonna firstName (not null)
        colonna email con valori univoci e not null
        usa la h2-console con il browser per connettersi al db*/
