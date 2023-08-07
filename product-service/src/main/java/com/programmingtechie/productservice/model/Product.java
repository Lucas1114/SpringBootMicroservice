package com.programmingtechie.productservice.model;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import java.math.BigDecimal;


//In Spring Data MongoDB, the @Document annotation is used to specify that a Java class represents a MongoDB document.
//It is used to map the Java object to a collection in the MongoDB database.
@Document(value = "product")
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Data


public class Product {
    //mark a field as the identifier or primary key of an entity class.
    @Id
    private String id;
    private String name;
    private String description;
    private BigDecimal price;

}
