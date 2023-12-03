package com.emretoprak.ecommerce.service.admin;

import com.emretoprak.ecommerce.dto.CategoryDTO;
import com.emretoprak.ecommerce.entities.Category;

public interface AdminService {
    Category createCategory(CategoryDTO categoryDTO);

}
