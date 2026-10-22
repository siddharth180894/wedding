package com.matrimonial.wedding.ui.Entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
@Table(name = "users")
public class User {

    @Setter
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "user_id")
    private Long userId;

    @Setter
    @Column(nullable = false, unique = true, length = 255)
    private String email;

    @Setter
    @Column(name = "password_hash", nullable = false)
    private String passwordHash;

    @Setter
    @Column(name = "phone_number", unique = true, length = 20)
    private String phoneNumber;

    @Setter
    @Column(name = "account_status", nullable = false)
    private String accountStatus = "ACTIVE";

    @Setter
    @Column(name = "email_verified", nullable = false)
    private Boolean emailVerified = false;

    @Column(name = "created_at", insertable = false, updatable = false)
    private LocalDateTime createdAt;

    @Column(name = "updated_at", insertable = false, updatable = false)
    private LocalDateTime updatedAt;

//    public User() {
//    }
//
//    public Long getUserId() {
//        return userId;
//    }
//
//    public String getEmail() {
//        return email;
//    }
//
//    public String getPasswordHash() {
//        return passwordHash;
//    }
//
//    public String getPhoneNumber() {
//        return phoneNumber;
//    }
//
//    public String getAccountStatus() {
//        return accountStatus;
//    }
//
//    public Boolean getEmailVerified() {
//        return emailVerified;
//    }
//
//    public LocalDateTime getCreatedAt() {
//        return createdAt;
//    }
//
//    public LocalDateTime getUpdatedAt() {
//        return updatedAt;
//    }
}

