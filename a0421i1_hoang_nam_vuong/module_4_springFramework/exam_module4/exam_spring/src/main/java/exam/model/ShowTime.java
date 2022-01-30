package exam.model;

import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.validation.constraints.Future;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import java.time.LocalDate;

@Entity
public class ShowTime {
    @Id
    @Pattern(regexp = "CI-[0-9]{5}", message = "Wrong format! Please input again!")
    private String id;

    @DateTimeFormat(pattern = "yyyy-MM-dd")
    @Future(message = "The date is not available!")
    private LocalDate date;

    @NotNull(message = "Quantity is not empty")
    @Min(value = 1)
    private Integer quantity;

    @ManyToOne(targetEntity = Film.class)
    private Film film;

    @ManyToOne(targetEntity = User.class)
    private User user;

    public ShowTime() {
    }

    public ShowTime(String id, LocalDate date, Integer quantity, Film film) {
        this.id = id;
        this.date = date;
        this.quantity = quantity;
        this.film = film;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public Film getFilm() {
        return film;
    }

    public void setFilm(Film film) {
        this.film = film;
    }
}
