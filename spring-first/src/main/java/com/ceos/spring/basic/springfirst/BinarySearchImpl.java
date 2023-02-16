package com.ceos.spring.basic.springfirst;

public class BinarySearchImpl {

  private SortAlgorithm sortAlgorithm;

  public BinarySearchImpl(SortAlgorithm sortAlgorithm) {
    super();
    this.sortAlgorithm = sortAlgorithm;
  }

  public int binarySearch(int[] numbers, int numberToSearchFor){
    int[] sortedNumbers = sortAlgorithm.sort(numbers);
    System.out.println(sortAlgorithm);
    return 3;
  }
}