package dev.sumana.cmappings.repository;

import dev.sumana.cmappings.model.entity.Post;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface PostRepository extends PagingAndSortingRepository<Post, Long> {
}
