package com.room.reservation.room;

import java.time.LocalDateTime;
import java.util.List;

import com.room.reservation.reservation.Reservation;
import com.room.reservation.reservation.ReservationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.Optional;
import com.room.reservation.DataNotFoundException;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Service
public class RoomService {

    @Autowired
    private final RoomRepository roomRepository;
    private final ReservationRepository reservationRepository;

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

    public boolean checkAvailability(LocalDateTime startTime, int roomNumber){
        Optional<Room> optionalRoom = roomRepository.findById(roomNumber);

        if (optionalRoom.isPresent()){
            Room room = optionalRoom.get();
            // 방 번호에 따른 예약 리스트들을 저장하는 함수 만들기
            // List<Reservation> reservations = reservationRepository.findByRoomNumber(roomNumber);
        }
    }

}
