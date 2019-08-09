package dev.sumana.cmappings.repository;

import dev.sumana.cmappings.model.entity.Comment;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface CommentRepository extends PagingAndSortingRepository<Comment, Long> {
}
