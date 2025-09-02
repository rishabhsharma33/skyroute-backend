package com.skyroute.booking_service.entity;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "payments")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Payment {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long paymentId;

    @OneToOne
    @JoinColumn(name = "booking_id", nullable = false)
    private Booking booking;

    private Double amount;

    @Enumerated(EnumType.STRING)
    private PaymentMethod method; // CARD / UPI / NETBANKING

    @Enumerated(EnumType.STRING)
    private PaymentStatus status; // SUCCESS / FAILED
}

enum PaymentMethod {
    CARD, UPI, NETBANKING
}

enum PaymentStatus {
    SUCCESS, FAILED
}
