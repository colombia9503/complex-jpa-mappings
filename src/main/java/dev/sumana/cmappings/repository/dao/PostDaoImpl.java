package dev.sumana.cmappings.repository.dao;

import dev.sumana.cmappings.model.entity.Author;
import dev.sumana.cmappings.model.entity.Comment;
import dev.sumana.cmappings.model.entity.Post;
import org.springframework.data.domain.Page;

import javax.persistence.*;
import java.util.Map;

@NamedNativeQuery(
        name = "getPostWithCommentByRank",
        query = "SELECT * " +
                "FROM ( " +
                "   SELECT P_PC.*, DENSE_RANK() OVER (ORDER  BY \"P.CREATED_AT\", \"P.ID\") RANK " +
                "   FROM ( " +
                "       SELECT * " +
                "       FROM POC_USR.POSTS P " +
                "       LEFT JOIN POC_USR.COMMENTS PC ON P.ID = PC.POST_ID " +
                "       WHERE P.TITLE LIKE :titlePattern " +
                "       ORDER BY P.CREATED_AT" +
                "   ) P_PC" +
                ") P_PC_R " +
                "WHERE P_PC_R.RANK <= :rank"
)

@SqlResultSetMapping(
        name = "PostCommentsMapping",
        entities = {
                @EntityResult(
                        entityClass = Post.class,
                        fields = {
                                @FieldResult(name = "id", column = "P.ID"),
                                @FieldResult(name = "title", column = "P.TITLE"),
                                @FieldResult(name = "content", column = "P.CONTENT")
                        }
                ),
                @EntityResult(
                        entityClass = Comment.class,
                        fields = {
                                @FieldResult(name = "id", column = "PC.ID"),
                                @FieldResult(name = "content", column = "PC.CONTENT")
                        }
                ),
                @EntityResult(
                        entityClass = Author.class,
                        fields = {
                                @FieldResult(name = "name", column = "AU.NAME"),
                                @FieldResult(name = "email", column = "AU.EMAIL")
                        }
                )
        }
)
public class PostDaoImpl implements PostDao {

    private EntityManager em;

    public PostDaoImpl(EntityManager em) {
        this.em = em;
    }

    @Override
    public Page<Post> posts(Map<String, Object> filters) {

        return null;
    }
}
