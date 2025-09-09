package com.charly.market.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class CategoryDto {

    private int categoryId;
    private String categoryName;
    private String categoryType;
    private String categoryStatus;

}
