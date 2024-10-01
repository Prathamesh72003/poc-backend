package com.ideaclick.poc.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "student")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class studentEntity {
   
    @Id
    @Column(name = "prn")
    private Long prn;

    @Column(name = "name")
    private String name;

    @Column(name = "email")
    private String email;

    @Column(name = "phone")
    private String phone;

    @Column(name = "gender")
    private String Gender;

    @Column(name = "address")
    private String address;

    @Column(name = "resume")
    private String resume;

    @Column(name = "linkedin")
    private String linkedin;

    @Column(name = "derpartment")
    private String department;
}
