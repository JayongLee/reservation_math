package com.room.reservation.user;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class UserCreateForm {

    @Size(min = 9, max = 9)
    @NotEmpty(message = "학번을 입력해주세요.")
    private Integer student_code;

    @NotEmpty(message = "이름은 필수항목입니다.")
    private String username;

    @NotEmpty(message = "비밀번호는 필수항목입니다.")
    private String password1;

    @NotEmpty(message = "비밀번호 확인은 필수항목입니다.")
    private String password2;

    @NotEmpty(message = "인증번호 입력은 필수항목입니다.")
    private String check_code;
}
