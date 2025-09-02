package com.skyroute.booking_service.entity;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDateTime;

@Entity
@Table(name = "bookings")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Booking {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long bookingId;

    @ManyToOne
    @JoinColumn(name = "user_id", nullable = false)
    private User user;

    @ManyToOne
    @JoinColumn(name = "flight_id", nullable = false)
    private Flight flight;

    private LocalDateTime bookingDate;

    @Enumerated(EnumType.STRING)
    private BookingStatus status; // CONFIRMED / CANCELLED

    @OneToOne(mappedBy = "booking", cascade = CascadeType.ALL)
    private Payment payment;
}

enum BookingStatus {
    CONFIRMED, CANCELLED
}
