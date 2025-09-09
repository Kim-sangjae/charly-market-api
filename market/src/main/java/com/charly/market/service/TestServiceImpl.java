package com.charly.market.service;

import com.charly.market.dto.CategoryDto;
import com.charly.market.entity.Category;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class TestServiceImpl implements TestService {

    private final CategoryRepository categoryRepository;

    @Override
    public boolean createCategory(CategoryDto categoryDto) {

        Category category = Category.builder()
                .categoryStatus(categoryDto.getCategoryStatus())
                .categoryName(categoryDto.getCategoryName())
                .categoryType(categoryDto.getCategoryType()).build();

        categoryRepository.save(category);

        return true;
    }

}
