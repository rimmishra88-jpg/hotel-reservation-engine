package com.infotact.hotel_reservation_backend.Repository;

import com.infotact.hotel_reservation_backend.entity.Reservation;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ReservationRepository extends JpaRepository<Reservation, Long> {

}


