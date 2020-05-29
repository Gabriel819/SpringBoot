package com.example.membertest;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Member implements Serializable{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer user_idx;

    @Column(name = "USER_NAME", nullable = true)
    private String user_name;

    @Column(name = "USER_PHONE", nullable = true)
    private String user_phone;

    @Column(name = "USER_EMAIL", nullable = true)
    private String user_email;

    @Column(name = "USER_ID", nullable = false)
    private String user_id;

    @Column(name = "USER_PW", nullable = true)
    private String user_pw;

    @Column(name = "USER_GENDER", nullable = true)
    private String user_gender;

    @Column(name = "USER_NICKNAME", nullable = true)
    private String user_nickname;

    @Column(name = "STAMP", nullable = true)
    private int stamp;
}
