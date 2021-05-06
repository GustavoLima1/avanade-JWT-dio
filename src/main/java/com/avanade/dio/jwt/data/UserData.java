package com.avanade.dio.jwt.data;

import lombok.*;

import java.io.Serializable;

@Data
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class UserData implements Serializable {

    private String username;
    private String password;

}
