package dev.sumana.cmappings.utils;

import org.springframework.beans.BeanUtils;

public class GenericConverter {
    public static <S, D> D convertTo(S s, Class<D> resultClass) throws IllegalAccessException, InstantiationException {
        D d = resultClass.newInstance();
        BeanUtils.copyProperties(s, d);
        return d;
    }
}
