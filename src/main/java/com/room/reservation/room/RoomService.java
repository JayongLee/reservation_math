package com.room.reservation.room;

import java.time.LocalDateTime;
import java.util.List;

import org.springframework.stereotype.Service;
import java.util.Optional;
import com.room.reservation.DataNotFoundException;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Service
public class RoomService {

    private final RoomRepository roomRepository;

    public List<Room> getList() {
        return this.roomRepository.findAll();
    }

    public Room getRoom(Integer id) {
        Optional<Room> room = this.roomRepository.findById(id);
        if (room.isPresent()) {
            return room.get();
        } else {
            throw new DataNotFoundException("room is not found");
        }
    }

    public boolean roomAvailability(int room_number) {
        return true;
    }
}
