package com.csc;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class TestLinkedList {

  LinkedList theListOfTheLinkedVariety;

  @BeforeEach
  void setUp() {
    theListOfTheLinkedVariety = new LinkedList();

    ChainLink linkOne = new ChainLink("red");
    ChainLink linkTwo = new ChainLink("blue");
    ChainLink linkThree = new ChainLink("green");

    theListOfTheLinkedVariety.append(linkOne);
    theListOfTheLinkedVariety.append(linkTwo);
    theListOfTheLinkedVariety.append(linkThree);
  }

  @Test
  public void testOne() {
    assertEquals("red", theListOfTheLinkedVariety.get(0).color);
  }

  @Test
  public void testTwo() {
    assertEquals("blue", theListOfTheLinkedVariety.get(1).color);
  }

  @Test
  public void testThree() {
    assertEquals("green", theListOfTheLinkedVariety.get(2).color);
  }
}
