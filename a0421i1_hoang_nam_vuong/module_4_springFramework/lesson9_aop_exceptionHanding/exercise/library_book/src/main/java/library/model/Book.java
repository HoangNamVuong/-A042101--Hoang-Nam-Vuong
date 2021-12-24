package library.model;

import javax.persistence.*;
import java.util.LinkedHashSet;
import java.util.Set;

@Entity
public class Book {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    private String author;

    private Integer number;

    @OneToMany(mappedBy = "book")
    private Set<Keycode> keycodeBook = new LinkedHashSet<>();

    public Book() {
    }

    public Book(Long id, String name, String author, Integer number, Set<Keycode> keycodeBook) {
        this.id = id;
        this.name = name;
        this.author = author;
        this.number = number;
        this.keycodeBook = keycodeBook;
    }

    public void generateKeycode(Keycode keycode) {
        keycodeBook.add(keycode);
    }

    public void borrow() {
        if (number > 0) number--;
    }

    public void returnBook() {
        number++;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }

    public Set<Keycode> getKeycodeBook() {
        return keycodeBook;
    }

    public void setKeycodeBook(Set<Keycode> keycodeBook) {
        this.keycodeBook = keycodeBook;
    }
}
