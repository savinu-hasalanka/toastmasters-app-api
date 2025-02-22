package com.example.app.dto;

import com.example.app.model.types.MeetingRole;
import lombok.AllArgsConstructor;
import lombok.Data;

import java.io.Serializable;

@Data
@AllArgsConstructor
public class RolePlayerDto implements Serializable {
    private MeetingRole meetingRole;
    private String rolePlayerUsername;
}
