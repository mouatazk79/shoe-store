package com.klaa.shoesstore.model;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import lombok.Data;

import java.io.Serializable;

@Embeddable
@Data
public class OrderProductId implements Serializable {
    @Column(name = "order_id")
    Long orderId;

    @Column(name = "product_id")
    Long productId;

}
