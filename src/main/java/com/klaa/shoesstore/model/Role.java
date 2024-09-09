package com.klaa.shoesstore.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import java.util.Date;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@EntityListeners(AuditingEntityListener.class)
public class Role {
    @Id
    @SequenceGenerator(sequenceName = "role_sequence",initialValue = 1,allocationSize = 1,name = "role_sequence")
    @GeneratedValue(generator = "role_sequence",strategy = GenerationType.SEQUENCE)
    private Long id;
    private String name;
    @CreatedDate
    @Column(nullable = false)
    private Date createdDate;

    @LastModifiedDate
    @Column(insertable = false)
    private Date lastModifiedDate;
}
