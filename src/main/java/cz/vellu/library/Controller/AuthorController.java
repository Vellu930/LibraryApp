package cz.vellu.library.Controller;

import cz.vellu.library.Model.Author;
import cz.vellu.library.Repositories.AuthorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping(path = "/home")
public class AuthorController {

    @Autowired
    private AuthorRepository authRepo;

    @PostMapping(path = "/add") // Map ONLY POST Requests
    public @ResponseBody
    String addNewAuthor(@RequestParam String name) {
        // @ResponseBody means the returned String is the response, not a view name
        // @RequestParam means it is a parameter from the GET or POST request
        
    Author auth = new Author(name);
    authRepo.save(auth);
    return "Saved";
    }

    @GetMapping(path = "/all")
    public @ResponseBody
    Iterable<Author> getAllAuthors() {
        // This returns a JSON or XML with the users
        return authRepo.findAll();
    }

}
