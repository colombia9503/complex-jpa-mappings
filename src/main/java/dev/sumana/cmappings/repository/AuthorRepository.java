package dev.sumana.cmappings.repository;

import dev.sumana.cmappings.model.entity.Author;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AuthorRepository extends PagingAndSortingRepository<Author, String> {
}
