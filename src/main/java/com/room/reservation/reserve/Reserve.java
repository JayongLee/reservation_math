package com.room.reservation.reserve;

import javax.persistence.*;

import com.room.reservation.room.Room;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

@Getter
@Setter
@Entity
public class Reserve {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column
    private LocalDateTime start_time;

    @Column LocalDateTime end_time;

    private LocalDateTime createDate;

    // @OneToOne
    // private Room room;
}
