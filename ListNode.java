/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Project_UAS;

/**
 *
 * @author Resiana Kinanti
 */
public class ListNode <E>{ //deklarasi class ListNode dgn tipe data objek
    private Object data; //deklarasi variabel data bertipe Object
    private ListNode next; //deklarasikan variabel next bertipe ListNode
    private ListNode prev; //deklarasikan variabel next bertipe ListNode

    public ListNode() { //deklarasikan constructor tanpa parameter
        next = null;
        prev = null;
    }

    public ListNode(E d) { //deklarasikan constructor dgn parameter
        setData(d); //memanggil method setData diberikan parameter = parameter constructor
        next = null; //nilai next = null
        prev = null; //nilai prev = null
    }

    public E getData() { //method getter untuk variabel data
        return (E) data;
    }

    public void setData(E data) { //method setter untuk variabel data
        this.data = data;
    }

    public ListNode getNext() { //method getter untuk variabel next
        return next;
    }

    public void setNext(ListNode next) { //method setter untuk variabel next
        this.next = next;
    }

    public ListNode getPrev() { //method getter untuk variabel prev
        return prev;
    }

    public void setPrev(ListNode prev) { //method getter untuk variabel data
        this.prev = prev;
    }

//    @Override
//    public String toString() { //method toString utk menampilkan output
//        return "DOListNode " + "data = " + data + ", next = " + next + ", prev = " + prev;
//    }
    
}

    
