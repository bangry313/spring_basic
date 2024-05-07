package com.ezen.springbasic.domain.cookbook;

import com.ezen.springbasic.domain.cookbook.dao.CookbookDao;
import com.ezen.springbasic.domain.cookbook.dao.MemoryCookbookDao;
import com.ezen.springbasic.domain.cookbook.dto.CookbookDto;
import lombok.extern.slf4j.Slf4j;

import java.util.List;

@Slf4j
public class GeneralCookbookApplication {
    public static void main(String[] args) {
        CookbookDto cookbookDto = new CookbookDto();
        cookbookDto.setBookId(1);
        cookbookDto.setTitle("한식 요리책");
        cookbookDto.setAuthor("김기정");
        cookbookDto.setDescription("맛있는 한식 관련 요리책입니다");

        CookbookDao cookbookDao = new MemoryCookbookDao();
        cookbookDao.create(cookbookDto);
        cookbookDao.create(new CookbookDto(2, "중식 요리책", "김짱개", null));

        List<CookbookDto> list  = cookbookDao.findAll();
        for (CookbookDto dto : list) {
            log.info("요리책 정보 : {}", dto);
        }
    }
}
