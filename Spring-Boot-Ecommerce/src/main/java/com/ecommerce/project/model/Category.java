package com.ecommerce.project.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.NotBlank;
<<<<<<< HEAD
import jakarta.validation.constraints.Size;
=======
>>>>>>> 426436134e6621e2962cb4d5322bb74594931cb8
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity(name="categories")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Category {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long categoryId;

    @NotBlank
<<<<<<< HEAD
    @Size(min = 5, message = "Category name must contain atleast 5 characters")
=======
>>>>>>> 426436134e6621e2962cb4d5322bb74594931cb8
    private String categoryName;

}
