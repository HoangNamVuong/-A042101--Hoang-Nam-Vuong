package library.model;

import javax.persistence.*;
import java.util.Set;

@Entity
public class Status {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String status;

    @OneToMany(mappedBy = "status")
    private Set<Keycode> keycodeStatus;

    public Status() {
    }

    public Status(Long id) {
        this.id = id;
    }

    public Status(Long id, String status, Set<Keycode> keycodeStatus) {
        this.id = id;
        this.status = status;
        this.keycodeStatus = keycodeStatus;
    }

    public Status(Long id, String status) {
        this.id = id;
        this.status = status;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Set<Keycode> getKeycodeStatus() {
        return keycodeStatus;
    }

    public void setKeycodeStatus(Set<Keycode> keycodeStatus) {
        this.keycodeStatus = keycodeStatus;
    }
}
