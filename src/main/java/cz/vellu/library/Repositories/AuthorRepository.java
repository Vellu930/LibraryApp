
package cz.vellu.library.Repositories;

import org.springframework.data.repository.CrudRepository;
import cz.vellu.library.Model.Author;

// This will be AUTO IMPLEMENTED by Spring into a Bean called userRepository
// CRUD refers Create, Read, Update, Delete

public interface AuthorRepository extends CrudRepository<Author, Integer> {

}