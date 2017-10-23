package com.magic.happypi.base;

import com.github.pagehelper.PageInfo;

import java.util.Map;

public interface IBaseService<T extends  Object> {

    Boolean insert(T t);

    Boolean update(T t);

    Boolean delete(T t);

    T get(String id);

    PageInfo searchPageWithMap(int pageNum, int PageSize, Map<String, Object> params);

}
