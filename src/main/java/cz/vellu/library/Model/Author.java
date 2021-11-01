package cz.vellu.library.Model;

import java.util.HashSet;
import java.util.List;
import java.util.Set;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;

@Entity
public class Author {
        
    @Id
    @GeneratedValue
    private int author_id;
    private String name;
    @OneToMany(targetEntity=Book.class,cascade = CascadeType.ALL, fetch = FetchType.LAZY, orphanRemoval = true)
    @JoinColumn(name = "ab_fk", referencedColumnName = "author_id")
    private List<Book> books;

    public List<Book> getBooks() {
        return books;
    }
    
    public Author() {
    }

    public Author(String name) {
        this.name = name;
    }

    public int getAuthor_id() {
        return author_id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void assignBook(Book book) {
        books.add(book);
    }

    
}
