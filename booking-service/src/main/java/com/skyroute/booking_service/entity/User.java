package com.skyroute.booking_service.entity;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDateTime;
import java.util.List;

@Entity
@Table(name = "users")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long userId;

    private String name;

    @Column(unique = true, nullable = false)
    private String email;

    private String phone;

    private String password;

    @Enumerated(EnumType.STRING)
    private Role role; // CUSTOMER / ADMIN / AIRLINE

    @OneToMany(mappedBy = "user", cascade = CascadeType.ALL)
    private List<Booking> bookings;
}

enum Role {
    CUSTOMER, ADMIN, AIRLINE
}
