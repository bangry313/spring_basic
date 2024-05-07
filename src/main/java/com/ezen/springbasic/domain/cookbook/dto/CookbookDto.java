package com.ezen.springbasic.domain.cookbook.dto;

import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
@ToString
@Builder
public class CookbookDto {
    private int bookId;
    private String title;
    private String author;
    private String description;
}
