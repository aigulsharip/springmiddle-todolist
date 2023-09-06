package kz.bitlab.middle.springmiddletodolist.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "t_tasks")
@Getter
@Setter
public class Task {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;


    @Column(name = "name")
    private String name;

    @Column (name = "level")
    private int level;


}
