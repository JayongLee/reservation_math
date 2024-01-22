package com.room.reservation.room;

import javax.persistence.*;
import java.util.List;

import javax.persistence.CascadeType;

import com.room.reservation.reserve.Reserve;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.time.LocalDateTime;

import javax.persistence.OneToOne;

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


    @Column
    private LocalDateTime start_time; // 이용 시작 시간

    @Column
    private LocalDateTime end_time; // 이용 종료 시간

    private LocalDateTime createDate;

    // @OneToOne(mappedBy = "room", cascade = CascadeType.REMOVE)
    // private List<Reserve> reserveList;
}
