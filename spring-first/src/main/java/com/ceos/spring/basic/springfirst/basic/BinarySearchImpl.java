package com.ceos.spring.basic.springfirst.basic;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
public class BinarySearchImpl {

  @Autowired
  @Qualifier("bubble")
  private SortAlgorithm sortAlgorithm;

  public int binarySearch(int[] numbers, int numberToSearchFor){
    int[] sortedNumbers = sortAlgorithm.sort(numbers);
    System.out.println(sortAlgorithm);
    return 3;
  }
}