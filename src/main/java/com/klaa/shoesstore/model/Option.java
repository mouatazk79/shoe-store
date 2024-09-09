package com.klaa.shoesstore.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Entity(name = "_option")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Option {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "option_id")
    private Long id;
    @ManyToOne
    @JoinColumn(name = "attribute_id")
    private Attribute attribute;
    private String value;
    @ManyToMany(mappedBy = "options")
    private Set<Product> products = new HashSet<>();

}
