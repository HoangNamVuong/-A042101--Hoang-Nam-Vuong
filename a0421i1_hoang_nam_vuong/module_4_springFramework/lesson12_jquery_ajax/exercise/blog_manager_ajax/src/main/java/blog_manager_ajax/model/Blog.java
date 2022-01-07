package blog_manager_ajax.model;

import javax.persistence.*;

@Entity
public class Blog {
    @Id
    @GeneratedValue(generator = "uuid2")
    private String id;
    private String title;
    private String author;
    @Column(columnDefinition = "VARCHAR(1000)")
    private String summary;
    @Column(columnDefinition = "VARCHAR(5000)")
    private String content;
    @ManyToOne(targetEntity = Category.class)
    private Category category;

    public Blog() {
    }

    public Blog(String id, String title, String author, String summary, String content, Category category) {
        this.id = id;
        this.title = title;
        this.author = author;
        this.summary = summary;
        this.content = content;
        this.category = category;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getSummary() {
        return summary;
    }

    public void setSummary(String summary) {
        this.summary = summary;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }
}
