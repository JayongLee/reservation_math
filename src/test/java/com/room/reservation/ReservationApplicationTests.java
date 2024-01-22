package com.room.reservation;

import com.room.reservation.room.ReservationStatus;
import com.room.reservation.room.Room;
import com.room.reservation.room.RoomRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.time.LocalDateTime;

@SpringBootTest
class ReservationApplicationTests {

	@Autowired
	private RoomRepository roomRepository;
	@Test
	void testRoom() {
		Room room1 = new Room();
		room1.setRoom_name("1번방");
		room1.setId(1);
		room1.setReservationStatus(ReservationStatus.EMPTY);
		room1.setCreateDate(LocalDateTime.now());
		this.roomRepository.save(room1);

		Room room2 = new Room();
		room2.setRoom_name("2번방");
		room2.setId(2);
		room2.setReservationStatus(ReservationStatus.EMPTY);
		room2.setCreateDate(LocalDateTime.now());
		this.roomRepository.save(room2);

		Room room3 = new Room();
		room3.setRoom_name("3번방");
		room3.setId(3);
		room3.setReservationStatus(ReservationStatus.EMPTY);
		room3.setCreateDate(LocalDateTime.now());
		this.roomRepository.save(room3);

		Room room4 = new Room();
		room4.setRoom_name("4번방");
		room4.setId(1);
		room4.setReservationStatus(ReservationStatus.EMPTY);
		room4.setCreateDate(LocalDateTime.now());
		this.roomRepository.save(room4);
	}

}
