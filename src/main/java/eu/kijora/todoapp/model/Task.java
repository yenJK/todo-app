package eu.kijora.todoapp.model;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import java.time.LocalDateTime;

@Entity
@Table(name = "tasks")
public class Task {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @NotBlank(message = "Task's description must not be null!")
    private String description;
    private boolean done;
//    private LocalDateTime deadline;
//    private LocalDateTime createdOn;
//    private LocalDateTime updatedOn;

    public Task() {
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public boolean isDone() {
        return done;
    }

    public void setDone(boolean done) {
        this.done = done;
    }

//    public LocalDateTime getDeadline() {
//        return deadline;
//    }
//
//    public void setDeadline(LocalDateTime deadline) {
//        this.deadline = deadline;
//    }
//
//    @PrePersist
//    void prePersist() {
//
//    }
//
//    public void setUpdatedOn(LocalDateTime updatedOn) {
//        this.updatedOn = updatedOn;
//    }
}
