package me.asite.domain;

import lombok.AccessLevel;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

import static javax.persistence.GenerationType.IDENTITY;

@Entity
@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class Student {

    @Id
    @GeneratedValue(strategy = IDENTITY)
    @Column(name = "member_id")
    private Long id;

    private String studentId;

    private String password;

    private String name;

    private String major;

    private String email;
    @OneToMany(mappedBy = "student")
    private List<ScheduleAttendace> scheduleAttendaceList = new ArrayList<>();

    @Builder
    public Student(String studentId, String password, String name, String major, String email) {
        this.studentId = studentId;
        this.password = password;
        this.name = name;
        this.major = major;
        this.email = email;
    }
}
