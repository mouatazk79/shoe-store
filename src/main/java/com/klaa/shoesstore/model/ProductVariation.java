package com.klaa.shoesstore.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class ProductVariation {
    @Id
    @SequenceGenerator(sequenceName = "product_variation_sequence",initialValue = 1,allocationSize = 1,name = "product_variation_sequence")
    @GeneratedValue(generator = "product_variation_sequence",strategy = GenerationType.SEQUENCE)
    private Long id;
}
