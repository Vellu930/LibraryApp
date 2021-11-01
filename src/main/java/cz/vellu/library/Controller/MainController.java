package cz.vellu.library.Controller;

import cz.vellu.library.Model.Author;
import cz.vellu.library.Model.Book;
import cz.vellu.library.Repositories.AuthorRepository;
import cz.vellu.library.Repositories.BookRepository;
import cz.vellu.library.dto.AuthorDTO;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/home")
public class MainController {

    @Autowired
    private AuthorRepository authRepo;

    @Autowired
    private BookRepository bookRepo;

    @PostMapping("/add")
    private Author addAuthor(@RequestBody AuthorDTO authorRequest) {

        return authRepo.save(authorRequest.getAuthor());
    }

    @GetMapping("/findAll")
    Iterable<Author> findAllAuthors() {
        return authRepo.findAll();
    }
    
    /*    @PutMapping("/{author_id}/books/{book_id}")
    Author assignBooksToAuthor(@PathVariable int author_id, @PathVariable int book_id) {
    
    Author author = authRepo.findById(author_id).get();
    Book book = bookRepo.findById(book_id).get();
    
    author.assignBook(book);
    return authRepo.save(author);
    }*/

}
