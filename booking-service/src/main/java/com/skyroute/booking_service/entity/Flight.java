package com.skyroute.booking_service.entity;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDateTime;
import java.util.List;

@Entity
@Table(name = "flights")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Flight {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long flightId;

    private String airline; // Indigo, AirIndia, etc.

    private String source;

    private String destination;

    private LocalDateTime departureTime;

    private LocalDateTime arrivalTime;

    private Integer totalSeats;

    private Double price;

    @OneToMany(mappedBy = "flight", cascade = CascadeType.ALL)
    private List<Booking> bookings;
}
