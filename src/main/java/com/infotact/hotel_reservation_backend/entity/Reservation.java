package com.infotact.hotel_reservation_backend.entity;
import jakarta.persistence.*;
import lombok.*;
import java.time.LocalDate;

@Entity
@Table(name = "reservations")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Reservation {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String customerName;

    private LocalDate checkInDate;

    private LocalDate checkOutDate;

    private String status;

    @ManyToOne
    @JoinColumn(name = "room_type_id")
    private Roomtype roomtype;
}
