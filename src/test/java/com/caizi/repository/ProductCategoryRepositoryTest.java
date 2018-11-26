package com.caizi.repository;

import com.caizi.dataobject.ProductCategory;
import lombok.extern.slf4j.Slf4j;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;

@RunWith(SpringRunner.class)
@SpringBootTest
@Slf4j
public class ProductCategoryRepositoryTest {

    @Autowired
    private ProductCategoryRepository repository;

    @Test
    public void test1(){
        ProductCategory productCategory = repository.findByCategoryId(1);
        System.out.println(productCategory.toString());
        System.out.println(repository.findAll().size());

    }

    @Test
    public void saveTest(){
        ProductCategory productCategory = new ProductCategory("category", 3);
        ProductCategory productCategory1 = repository.findById(13).get();
        productCategory1.setCategoryName("hello1");
        repository.save(productCategory1);
    }

    @Test
    public void findByCategoryTypeInTest(){
        List<Integer> list = Arrays.asList(3,5,6);
        List<ProductCategory> result = repository.findByCategoryTypeIn(list);
        log.info("size {}", result.size());
        Assert.assertNotEquals(0, result.size());


    }

}