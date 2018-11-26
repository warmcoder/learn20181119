package com.caizi.repository;

import com.caizi.dataobject.ProductCategory;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.domain.Page;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import java.awt.print.Pageable;
import java.util.List;

/**
 * Created by caizizhou
 * 2018-11-19 下午7:36
 */

public interface ProductCategoryRepository extends JpaRepository<ProductCategory, Integer> {
    ProductCategory findByCategoryId(Integer id);
    List<ProductCategory> findByCategoryTypeIn(List<Integer> categoryType);
}
