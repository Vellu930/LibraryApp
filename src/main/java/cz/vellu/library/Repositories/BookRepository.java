
package cz.vellu.library.Repositories;

import org.springframework.data.repository.CrudRepository;
import cz.vellu.library.Model.Book;
import cz.vellu.library.Model.Book;

public interface BookRepository extends CrudRepository<Book, Integer> {
    
}
