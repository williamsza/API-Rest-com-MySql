package com.api.produto.database;

import com.api.produto.entity.Categories;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RepositoryCategories
 extends JpaRepository<Categories, String> {
    
    


}
