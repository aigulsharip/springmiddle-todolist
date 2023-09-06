package kz.bitlab.middle.springmiddletodolist.repository;

import kz.bitlab.middle.springmiddletodolist.model.Task;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TaskRepository extends JpaRepository<Task, Long> {
}
