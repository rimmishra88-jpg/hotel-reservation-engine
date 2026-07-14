package com.infotact.hotel_reservation_backend.Service;

import com.infotact.hotel_reservation_backend.Repository.RoomtypeRepository;
import com.infotact.hotel_reservation_backend.entity.Roomtype;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class RoomtypeService {

    @Autowired
    private RoomtypeRepository roomtypeRepository;

    public List<Roomtype> getAllRoomtypes() {
        return roomtypeRepository.findAll();
    }

    public Optional<Roomtype> getRoomtypeById(Long id) {
        return roomtypeRepository.findById(id);
    }

    public Roomtype saveRoomtype(Roomtype roomtype) {
        return roomtypeRepository.save(roomtype);
    }

    public Roomtype updateRoomtype(Roomtype roomtype) {
        return roomtypeRepository.save(roomtype);
    }

    public void deleteRoomtype(Long id) {
        roomtypeRepository.deleteById(id);
    }
}


