package com.scaler.productservicedec2023.inheritancedemo.singleclass;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity (name = "st_user")
@Inheritance (strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn (name = "userType" ,
        discriminatorType = DiscriminatorType.INTEGER )
@DiscriminatorValue (value= "0" )
public class user {
    @Id
    private long id;
    private String name;
    private String email;
}
