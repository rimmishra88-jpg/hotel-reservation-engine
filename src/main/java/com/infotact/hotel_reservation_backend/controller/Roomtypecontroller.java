package com.infotact.hotel_reservation_backend.controller;
import com.infotact.hotel_reservation_backend.Service.RoomtypeService;
import com.infotact.hotel_reservation_backend.entity.Roomtype;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/roomtypes")
public class Roomtypecontroller {

    @Autowired
    private RoomtypeService roomtypeService;

    @GetMapping
    public List<Roomtype> getAllRoomtypes() {
        return roomtypeService.getAllRoomtypes();
    }

    @GetMapping("/{id}")
    public Optional<Roomtype> getRoomtypeById(@PathVariable Long id) {
        return roomtypeService.getRoomtypeById(id);
    }

    @PostMapping
    public Roomtype saveRoomtype(@RequestBody Roomtype roomtype) {
        return roomtypeService.saveRoomtype(roomtype);
    }

    @DeleteMapping("/{id}")
    public void deleteRoomtype(@PathVariable Long id) {
        roomtypeService.deleteRoomtype(id);
    }

    @PutMapping("/{id}")
public Roomtype updateRoomtype(@PathVariable Long id,
                               @RequestBody Roomtype roomtype) {
    return roomtypeService.updateRoomtype(id, roomtype);
}
}
