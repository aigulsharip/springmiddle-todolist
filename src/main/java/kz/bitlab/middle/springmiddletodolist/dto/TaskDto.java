package kz.bitlab.middle.springmiddletodolist.dto;

import jakarta.persistence.Column;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class TaskDto {

    private Long id;

    private String name;

    private int taskLevel;
}
