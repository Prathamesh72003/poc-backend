package com.ideaclick.poc.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class studentDTO {
    private Long prn;
    private String name;
    private String email;
    private String phone;
    private String gender;
    private String address;
    private String resume;
    private String linkedin;
    private String department;
}
