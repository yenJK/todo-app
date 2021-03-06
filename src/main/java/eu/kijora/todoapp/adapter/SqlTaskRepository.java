package eu.kijora.todoapp.adapter;

import eu.kijora.todoapp.model.Task;
import eu.kijora.todoapp.model.TaskRepository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RestResource;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
interface SqlTaskRepository extends TaskRepository, JpaRepository<Task, Integer> {

//    @Override
//    @RestResource(exported = false)
//    void deleteById(Integer integer); //gives 405 method not allowed
//
//    @Override
//    @RestResource(exported = false)
//    void delete(Task entity);

    @RestResource(path = "done", rel = "done") //under /search resource
    List<Task> findByDoneIsTrue();

    List<Task> findAllByGroup_Id(Integer groupId);
}
