package com.rocketseat.certification_nlw.modules.students.controllers.entities;

import java.util.UUID;
import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CertificationStudentEntity {

    private UUID id;
    private UUID StudentID;
    private String technology;
    private int grade;
    List<AnswersCertificationsEntity> answersCertificationsEnties;
}
