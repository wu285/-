package com.example.springprops;

import lombok.Data;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Map;

@Data
@Component
@ConfigurationProperties(prefix = "book")
public class Book {
//   @Value("${book.name}")
    private String name;
    //@Value("${book.author}")
    private String author;
   // @Value("${book.price}")
    private Float price;
    // @Value("${book.description}")
    private String description;
    private List<String> fans;
    private  Map<String, Integer> rank;

}
