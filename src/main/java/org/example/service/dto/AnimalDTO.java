package org.example.service.dto;

import lombok.*;

import javax.persistence.*;


@Data
@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class AnimalDTO {

    private Integer id;
    private Integer weight;
    private String type;
    private String name;

}
