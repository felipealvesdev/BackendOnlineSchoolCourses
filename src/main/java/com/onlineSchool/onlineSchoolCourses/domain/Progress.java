package com.onlineSchool.onlineSchoolCourses.domain;

import com.onlineSchool.onlineSchoolCourses.domain.enums.ProgressStatus;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;
import java.util.List;

@Entity(name = "progress")
@Table(name = "progress")
@Getter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode
public class Progress {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "student_id", nullable = false)
    private User student;

    @OneToMany(mappedBy = "progress", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Lesson> lesson;

    @Enumerated(EnumType.STRING)
    private ProgressStatus progressStatus;

    private LocalDateTime startedAt;
    private LocalDateTime finishedAt;
}
