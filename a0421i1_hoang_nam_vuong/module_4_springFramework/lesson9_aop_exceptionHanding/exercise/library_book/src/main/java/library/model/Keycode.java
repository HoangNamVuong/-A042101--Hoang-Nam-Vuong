package library.model;

import javax.persistence.*;

@Entity
public class Keycode {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Integer code;

    @ManyToOne(targetEntity = Book.class)
    private Book book;

    @ManyToOne(targetEntity = Status.class)
    private Status status;

    public Keycode() {
    }

    public Keycode(Long id, Integer code, Book book, Status status) {
        this.id = id;
        this.code = code;
        this.book = book;
        this.status = status;
    }

    public Keycode(Integer code, Book book, Status status) {
        this.code = code;
        this.book = book;
        this.status = status;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public Book getBook() {
        return book;
    }

    public void setBook(Book book) {
        this.book = book;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }
}
