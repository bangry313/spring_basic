package com.ezen.springbasic.domain.cookbook.dao;

import com.ezen.springbasic.domain.cookbook.dto.CookbookDto;

import java.util.List;

public interface CookbookDao {
    public void create(CookbookDto cookbookDto);
    public List<CookbookDto> findAll();
}
