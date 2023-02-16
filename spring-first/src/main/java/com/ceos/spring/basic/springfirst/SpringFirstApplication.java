package com.ceos.spring.basic.springfirst;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringFirstApplication {

  public static void main(String[] args) {

    BinarySearchImpl binarySearch = new BinarySearchImpl(new QuickSortAlgorithm());
    int result = binarySearch.binarySearch(new int[] { 124, 6 }, 3);
    System.out.println("Result: " + result);
    
    SpringApplication.run(SpringFirstApplication.class, args);
  }

}
