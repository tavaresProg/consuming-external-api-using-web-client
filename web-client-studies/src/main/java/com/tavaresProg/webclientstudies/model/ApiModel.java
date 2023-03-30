package com.tavaresProg.webclientstudies.model;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class ApiModel {
    public String text;
    public boolean found;
    public int number;
    public String type;
    public String date;
}
