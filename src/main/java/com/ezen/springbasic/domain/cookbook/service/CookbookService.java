package com.ezen.springbasic.domain.cookbook.service;

import com.ezen.springbasic.domain.cookbook.dto.CookbookDto;

import java.util.List;

public interface CookbookService {
    /** 요리책 등록 */
    public void regiterCookbook(CookbookDto cookbookDto);

    /** 요리책 전체 목록 */
    public List<CookbookDto> getCookbooks();
}
