package com.example.demo_spring.product;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Transient;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.context.annotation.Primary;

import java.time.LocalDate;

@Setter
@Getter //Getter
@NoArgsConstructor
@AllArgsConstructor //prende tutti gli argomenti del constructor
@Entity
public class Product {
    @Id
    @GeneratedValue
    private Long id;
    private String name;
    private String description;
    private double price;
    //private String category;
    //private LocalDate expiryDate;
    //@Transient
    //private int daysToExpire;
}
