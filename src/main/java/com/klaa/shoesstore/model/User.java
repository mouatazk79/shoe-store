package com.klaa.shoesstore.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import java.util.Collection;
import java.util.Date;

@Entity
@Table(name = "_user")
@Data
@AllArgsConstructor
@NoArgsConstructor
@EntityListeners(AuditingEntityListener.class)
public class User implements UserDetails {
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

    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        return null;
    }

    @Override
    public String getUsername() {
        return email;
    }

    @Override
    public boolean isAccountNonExpired() {
        return true;
    }

    @Override
    public boolean isAccountNonLocked() {
        return true;
    }

    @Override
    public boolean isCredentialsNonExpired() {
        return true;
    }

    @Override
    public boolean isEnabled() {
        return true;
    }
}
