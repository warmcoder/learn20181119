package com.caizi;

import com.caizi.repository.ProductCategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by caizizhou
 * 2018-11-19 下午3:02
 */
@RestController
//@SpringBootApplication
class Example {

    @Autowired
    private ProductCategoryRepository productCategoryRepository;

    @RequestMapping("/")
    String home(){
        long a = 1111;
        int b = (int)a;
        System.out.print(productCategoryRepository.findByCategoryId(1).toString());
        return "HelloWorld!";
    }



    public static void main(String[] args){

        SpringApplication.run(Example.class, args);
    }

}
