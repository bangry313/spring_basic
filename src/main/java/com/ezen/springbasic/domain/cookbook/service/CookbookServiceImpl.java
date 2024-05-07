package com.ezen.springbasic.domain.cookbook.service;

import com.ezen.springbasic.domain.cookbook.dao.CookbookDao;
import com.ezen.springbasic.domain.cookbook.dto.CookbookDto;

import java.util.List;

public class CookbookServiceImpl implements CookbookService{

    private CookbookDao cookbookDao;

    public CookbookServiceImpl(CookbookDao cookbookDao){
        this.cookbookDao = cookbookDao;
    }

    public CookbookDao getCookbookDao() {
        return cookbookDao;
    }

    public void setCookbookDao(CookbookDao cookbookDao) {
        this.cookbookDao = cookbookDao;
    }

    @Override
    public void regiterCookbook(CookbookDto cookbookDto) {
        cookbookDao.create(cookbookDto);
    }

    @Override
    public List<CookbookDto> getCookbooks() {
        return cookbookDao.findAll();
    }
}
