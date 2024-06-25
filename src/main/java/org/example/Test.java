package org.example;

public class Test {

  public static ListNode mergeTwoLists(ListNode list1, ListNode list2) {

    var result = new ListNode();
    var newResult = new ListNode();
    int caraQueGanhouADisputa;
    boolean jaFoiIniciado = false;

    if(list1 == null || list1.next == null) {
      return list2;
    }

    if(list2 == null || list2.next == null) {
      return list1;
    }

    while(list1.val != 0 && list2.val != 0) {

      if(list1.val <= list2.val) {
        caraQueGanhouADisputa = list1.val;
        //Primeiro elemento de result tem o 1° elemento;
        if(!jaFoiIniciado) {
          result.val = caraQueGanhouADisputa;
          list1 = list1.next;
          jaFoiIniciado = true;
        } else {
            result.next = new ListNode(caraQueGanhouADisputa);
            result = result.next;
            list1 = list1.next;
        }
      }
      else {
        caraQueGanhouADisputa = list2.val;
        if(!jaFoiIniciado) {
          result.val = caraQueGanhouADisputa;
          list2 = list2.next;
          jaFoiIniciado = true;
        }
        else {
            result.next = new ListNode(caraQueGanhouADisputa);
            newResult = new ListNode(result.val, result.next);
            list2 = list2.next;
        }
      }
    }
    return newResult;
  }

}
