package dev.sumana.cmappings.repository.dao;

import dev.sumana.cmappings.model.entity.Post;
import org.springframework.data.domain.Page;

import java.util.Map;

public class PostDaoImpl implements PostDao{
    @Override
    public Page<Post> posts(Map<String, Object> filters) {
        return null;
    }
}
