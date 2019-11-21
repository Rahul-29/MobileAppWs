package com.rahul.app.ws.model.response;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.validation.constraints.NotNull;

@Getter
@Setter
public class UserResponse {
    private String firstName;

    @NotNull
    private String lastName;
    private String email;
    private String userId;


}
