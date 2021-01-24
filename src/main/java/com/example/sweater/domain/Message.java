package com.example.sweater.domain;

import org.hibernate.validator.constraints.Length;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotBlank;

@Entity
public class Message {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @NotBlank(message = "Please fill the message")
    @Length(max = 2048, message = "Message too long(more than 2kB)")
    private String text;
    @NotBlank(message = "Please fill the message")
    @Length(max = 255, message = "Message too long(more than 255)")
    private String tag;
    private User author;
    private String filename;
}
