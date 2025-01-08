package com.example.app.model;

import com.example.app.model.composite_keys.UserMeetingRoleCompositePK;
import com.example.app.model.types.MeetingRole;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "role_player")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class RolePlayer {

    @EmbeddedId
    private UserMeetingRoleCompositePK userMeetingRoleCompositePK;

    @ManyToOne
    @MapsId("username")
    @JoinColumn(name = "username")
    private AppUser appUser;

    @ManyToOne
    @MapsId("meetingId")
    @JoinColumn(name = "meeting_id")
    private Meeting meeting;

//    @Enumerated(EnumType.STRING)
//    @MapsId("meetingRole")
//    @Column(name = "role")
//    private MeetingRole meetingRole;

    private String reportLink;

}
