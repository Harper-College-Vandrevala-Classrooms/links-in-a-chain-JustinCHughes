package com.csc;

public class Main {

  public static void main(String[] args)
  {
    ChainLink linkOne = new ChainLink("red");
    ChainLink linkTwo = new ChainLink("blue");
    ChainLink linkThree = new ChainLink("green");

    LinkedList theListOfTheLinkedVariety = new LinkedList();

    theListOfTheLinkedVariety.append(linkOne);
    theListOfTheLinkedVariety.append(linkTwo);
    theListOfTheLinkedVariety.append(linkThree);

    System.out.println("Index 0: " + theListOfTheLinkedVariety.get(0).color);
    System.out.println("Index 1 " + theListOfTheLinkedVariety.get(1).color);
    System.out.println("Index 2: " + theListOfTheLinkedVariety.get(2).color);
  }
}
