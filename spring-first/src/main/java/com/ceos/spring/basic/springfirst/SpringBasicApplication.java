package com.ceos.spring.basic.springfirst;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.ceos.spring.basic.springfirst.basic.BinarySearchImpl;

@SpringBootApplication
public class SpringBasicApplication {

  public static void main(String[] args) {

    // We don't need to create a new instance of a Component
    // BinarySearchImpl binarySearch = new BinarySearchImpl(new QuickSortAlgorithm());

    ApplicationContext applicationContext =  SpringApplication.run(SpringBasicApplication.class, args);

    BinarySearchImpl binarySearch = applicationContext.getBean(BinarySearchImpl.class);
    BinarySearchImpl binarySearch1 = applicationContext.getBean(BinarySearchImpl.class);

    System.out.println(binarySearch);
    System.out.println(binarySearch1);
    
    int result = binarySearch.binarySearch(new int[] { 124, 6 }, 3);
    System.out.println("Result: " + result);
  }
}
