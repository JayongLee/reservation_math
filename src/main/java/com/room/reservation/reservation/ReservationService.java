package com.room.reservation.reservation;

import com.room.reservation.DataNotFoundException;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Optional;
@RequiredArgsConstructor
@Service
public class ReservationService {

    private final ReservationRepository reservationRepository;

    // public List<Reserve> getList(){}
    public Reservation getReservation(Integer id){
        Optional<Reservation> reservation = this.reservationRepository.findById(id);
        if (reservation.isPresent()) {
            return reservation.get();
        } else {
            throw new DataNotFoundException("reservation is not found");
        }
    }
}


