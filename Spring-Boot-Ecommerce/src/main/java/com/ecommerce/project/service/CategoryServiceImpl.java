package com.ecommerce.project.service;

<<<<<<< HEAD
import com.ecommerce.project.exceptions.APIException;
import com.ecommerce.project.exceptions.EmptyCategoryException;
import com.ecommerce.project.exceptions.ResourceNotFoundException;
=======
>>>>>>> 426436134e6621e2962cb4d5322bb74594931cb8
import com.ecommerce.project.model.Category;
import com.ecommerce.project.repositories.CategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class CategoryServiceImpl implements CategoryService {

//    private List<Category> categories = new ArrayList<>();
//    private Long nextId = 1L;

    @Autowired
    private CategoryRepository categoryRepository;

    @Override
    public List<Category> getAllCategories() {
<<<<<<< HEAD
        long count = categoryRepository.count();
        if(count == 0)
            throw new EmptyCategoryException("There is no category created till now. So the category is empty");
=======
>>>>>>> 426436134e6621e2962cb4d5322bb74594931cb8
        return categoryRepository.findAll();
    }

    @Override
    public void createCategory(Category category) {
//        category.setCategoryId(nextId++);
//        category.setCategoryName(category.getCategoryName());
<<<<<<< HEAD
        Category savedCategory = categoryRepository.findByCategoryName(category.getCategoryName());
        if(savedCategory != null)
            throw new APIException("Category with the name " + category.getCategoryName() + " already exists !!!");
=======
>>>>>>> 426436134e6621e2962cb4d5322bb74594931cb8
        categoryRepository.save(category);
    }

    @Override
    public String deleteCategory(Long categoryId) {

        Category category = categoryRepository.findById(categoryId)
<<<<<<< HEAD
                .orElseThrow(() -> new ResourceNotFoundException("Category","categoryId",categoryId));
=======
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "Category not found"));
>>>>>>> 426436134e6621e2962cb4d5322bb74594931cb8

        categoryRepository.delete(category);
        return "Category with categoryId: " + categoryId + " deleted successfully !";
    }

    @Override
    public Category updateCategory(Category category, Long categoryId) {

        Category savedCategory = categoryRepository.findById(categoryId)
<<<<<<< HEAD
                .orElseThrow(() -> new ResourceNotFoundException("Category","categoryId",categoryId));
=======
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "Category not found"));
>>>>>>> 426436134e6621e2962cb4d5322bb74594931cb8

        category.setCategoryId(categoryId);
        savedCategory = categoryRepository.save(category);
        return savedCategory;
    }
}

