package com.ezen.springbasic.domain.cookbook.dao;
import com.ezen.springbasic.domain.cookbook.dto.CookbookDto;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MemoryCookbookDao implements CookbookDao{

    private List<CookbookDto> cookbooks;

    public MemoryCookbookDao() {
        this.cookbooks = Collections.synchronizedList(new ArrayList<CookbookDto>());
    }

    @Override
    public void create(CookbookDto cookbookDto) {
        cookbooks.add(cookbookDto);
    }

    @Override
    public List<CookbookDto> findAll() {
        return cookbooks;
    }
}
