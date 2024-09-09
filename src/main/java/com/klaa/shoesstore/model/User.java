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
@Table(name = "_user")
@Data
@AllArgsConstructor
@NoArgsConstructor
@EntityListeners(AuditingEntityListener.class)
public class User {
    @Id
    @SequenceGenerator(sequenceName = "user_sequence",initialValue = 1,allocationSize = 1,name = "user_sequence")
    @GeneratedValue(generator = "user_sequence",strategy = GenerationType.SEQUENCE)
    private Long id;
    private String name;
    @OneToOne
    private Role role;
    private String email;
    private String password;

    @CreatedDate
    @Column(nullable = false)
    private Date createdDate;

    @LastModifiedDate
    @Column(insertable = false)
    private Date lastModifiedDate;
}
