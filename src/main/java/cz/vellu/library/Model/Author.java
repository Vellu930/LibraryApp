package cz.vellu.library.Model;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;

@Entity
public class Author implements Serializable {
    
    private static final long SerialUID = 123456432L;
    
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private int author_id;
    private String name;
    @OneToMany
    @JoinColumn(name = "book_id")
    private List<Book> books;
    
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
    
}
