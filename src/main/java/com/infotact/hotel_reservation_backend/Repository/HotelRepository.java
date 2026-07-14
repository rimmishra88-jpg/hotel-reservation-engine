package com.infotact.hotel_reservation_backend.Repository;

import com.infotact.hotel_reservation_backend.entity.Hotel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface HotelRepository extends JpaRepository<Hotel, Long> {
}