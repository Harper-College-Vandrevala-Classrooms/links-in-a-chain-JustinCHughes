package com.csc;

public class LinkedList {
  private Node head;

  public LinkedList()
  {
    this.head = null;
  }

  public void append(ChainLink data)
  {
    Node newNode = new Node(data);
    if (head == null)
    {
      head = newNode;
    }
    else
    {
      Node current = head;
      while (current.next != null)
      {
        current = current.next;
      }
      current.next = newNode;
    }
  }

  public ChainLink get(int i)
  {
    if(i < 0)
    {
      return null;
    }
    
    Node current = head;
    int count = 0;

    while(current != null)
    {
      if(count == i)
      {
        return current.data;
      }
      current = current.next;
      count++;
    }

    return null;
  }
}