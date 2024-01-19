package com.room.reservation.room;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import lombok.RequiredArgsConstructor;

@RequestMapping("/reserve")
@RequiredArgsConstructor
@Controller
public class RoomController {

    private final RoomService roomService;

    @GetMapping("/room")
    public String list(Model model){
        List<Room> roomList = this.roomService.getList();
        model.addAttribute("roomList", roomList);
        return "room_form";
    }
}
