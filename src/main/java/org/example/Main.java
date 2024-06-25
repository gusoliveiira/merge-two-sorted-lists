package org.example;

public class Main {

  public static void main(String[] args) {

    var firstListNode = new ListNode(1, new ListNode(2, new ListNode(4)));
    var secondListNode = new ListNode(1, new ListNode(3, new ListNode(4)));

    var output = Test.mergeTwoLists(firstListNode, secondListNode);
    System.out.println("The output is: " + output.toString());
  }
}