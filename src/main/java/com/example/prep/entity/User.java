package com.example.prep.entity;

import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name="m_user")
@Data
public class User {
    @Id
    @Column(name="user_id")
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Long id;

    @Column(name="user_nm")
    private String userName;
}
