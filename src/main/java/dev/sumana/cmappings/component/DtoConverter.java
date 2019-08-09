package dev.sumana.cmappings.component;

import java.util.Collection;

public interface DtoConverter<S, D> {
    S convertTo(D s);
    Collection<S> convertFromCollection(Collection<D> dCollection);
}
