package kz.bitlab.middle.springmiddletodolist.mapper;

import kz.bitlab.middle.springmiddletodolist.dto.TaskDto;
import kz.bitlab.middle.springmiddletodolist.model.Task;
import org.mapstruct.MapMapping;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import java.util.List;

@Mapper (componentModel = "spring")
public interface TaskMapper {
    @Mapping(source = "taskLevel", target = "level")
    Task toEntity (TaskDto taskDto);

    @Mapping (source = "level", target = "taskLevel")
    TaskDto toDto (Task task);

    List<TaskDto> toDtoList(List<Task> tasks);
}
