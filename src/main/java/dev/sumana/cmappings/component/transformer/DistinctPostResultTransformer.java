package dev.sumana.cmappings.component.transformer;

import org.hibernate.transform.BasicTransformerAdapter;
import org.springframework.stereotype.Component;

import javax.persistence.EntityManager;
import java.util.List;

public class DistinctPostResultTransformer extends BasicTransformerAdapter {
    private final EntityManager em;

    public DistinctPostResultTransformer(EntityManager em) {
        this.em = em;
    }

    @Override
    public List transformList(List list) {
        return super.transformList(list);
    }
}
