package com.room.reservation.room;

import javax.persistence.*;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.time.LocalDateTime;

@Getter
@Setter
@Entity
public class Room {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column
    private String room_name; // 방의 이름
    private ReservationStatus reservationStatus;

    public Room() {
        this.reservationStatus = ReservationStatus.WAITING;
    }

    public void succeed() {
        this.reservationStatus = ReservationStatus.RESERVED;
    }

    public void empty() {
        this.reservationStatus = ReservationStatus.EMPTY;
    }

    private LocalDateTime createDate;

}
