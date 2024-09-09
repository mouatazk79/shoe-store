package com.klaa.shoesstore.model;

import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.MapsId;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class OrderProduct {
    @EmbeddedId
    private OrderProductId id;
    @ManyToOne
    @MapsId("productId")
    private Product product;
    @ManyToOne
    @MapsId("orderId")
    private Order order;
    private Long quantity;
}
