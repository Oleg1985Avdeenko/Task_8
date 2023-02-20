package org.example.bean;

import lombok.*;

import javax.persistence.*;
import java.io.Serializable;

@Data
@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Builder
@Table
public class Animal implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column
    private Integer weight;

    @Column
    private String type;

    @Column
    private String name;
}
