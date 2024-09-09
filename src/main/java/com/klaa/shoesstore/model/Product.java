package com.klaa.shoesstore.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Product {
    @Id
    @SequenceGenerator(sequenceName = "user_sequence",initialValue = 1,allocationSize = 1,name = "user_sequence")
    @GeneratedValue(generator = "user_sequence",strategy = GenerationType.SEQUENCE)
    private Long id;
    private String name;
    private String description;
    private String mainPictureURL;
    private String price;
    private boolean isSimple;
    private boolean isActive;
    @OneToMany()
    private List<ProductVariation> productVariations;

}
