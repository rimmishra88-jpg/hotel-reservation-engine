package com.infotact.hotel_reservation_backend.entity;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "room_types")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Roomtype {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String roomType;

    private Double pricePerNight;

    private Integer totalRooms;

    @ManyToOne
    @JoinColumn(name = "hotel_id")
    private Hotel hotel;
}

