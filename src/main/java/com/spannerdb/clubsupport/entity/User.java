package com.spannerdb.clubsupport.entity;

import lombok.Data;
import org.springframework.cloud.gcp.data.spanner.core.mapping.*;

import java.time.LocalDate;

@Table(name="users")
@Data
public class User {

    @PrimaryKey
    private Long id;

    private String name, surname;

    @Column(name="date_of_birth")
    private LocalDate birth;

    private String city;

    public User() {
    }

    public User(Long id, String name, String surname, LocalDate birth, String city) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.birth = birth;
        this.city = city;
    }
}

