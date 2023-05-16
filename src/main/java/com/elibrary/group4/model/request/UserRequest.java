package com.elibrary.group4.model.request;

import lombok.Getter;
import lombok.Setter;
import org.springframework.web.multipart.MultipartFile;

@Setter @Getter
public class UserRequest {
    private String firstName;
    private MultipartFile image;
    private String lastName;
    private String userName;
    private String email;
    private String phone;
    private String password;
}