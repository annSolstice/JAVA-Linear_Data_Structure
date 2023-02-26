
package Project_UAS;

//import java.util.NoSuchElementException;

public class LinkedList<E> { //deklarasi class LinkedList bertipe data objek
    private ListNode<E> head; //deklarasi variabel head bertipe ListNode
    private int size; //deklarasi variabel size bertipe integer

    public LinkedList() { //deklarasi constructor tanpa parameter
        head = new ListNode<E>(); //nilai head = objek milik ListNode nantinya
        head.setNext(head); //memanggil method setNext untuk head
        head.setPrev(head); //memanggil method setPrev untuk head
        size = 0; //nilai size = 0
    }
    
    public void addBefore(E val, ListNode point) { //deklarasi method addBefore dgn parameter
        ListNode<E> baru = new ListNode<>(val); //nilai parameter val masuk sebagai nilai parameter objek ListNode
        baru.setNext(point); //memangil method setNext dgn parameter
        baru.setPrev(point.getPrev()); //memanggil method setPrev dgn parameter
        point.getPrev().setNext(baru); //memanggil method getPrev
        point.setPrev(baru); //memanggil method setPrev dgn parameter
        //size++:
    }
    
    public void addFirst(E val) //method untuk menambahkan nilai pada awal list
    {
        addBefore(val, head.getNext());
        size++;
    }
    
    public void addLast(E val) { //method untuk menambahkan nilai pada akhir last
        addBefore(val, head);
    }
    
    public ListNode<E> remove(ListNode<E> point) { //method yg digunakan utk menghapus nilai list
        point.getPrev().setNext(point.getNext());
        point.getNext().setPrev(point.getPrev());
        //size--;
        return point;
    }
    
    public ListNode<E> removeFirst() { //method utk menghapus node pada bagian awal
        //size--;
        return remove(head.getNext());
    }
    
    public ListNode<E> removeLast() { //method utk menghapus node pada bagian akhir
        return remove(head.getPrev());
    }
    
    public boolean isEmpty() { //method yg menerangkan kondisi list kosong
        return (getSize() == -1);
    }
    
    public ListNode<E> search(E val) { //method utk mencari salah satu letak node
        ListNode<E> bantu = head.getNext(); //deklarasi objek baru bernama bantu utk class ListNode
        while(bantu != head) 
        { //selama node bantu tidak sama dengan parameter val dan tidak sama dengan nilai head
            if (((Comparable) bantu.getData()).compareTo(val) == 0) {
                return bantu;
            }
            bantu = bantu.getNext();
        }
        //System.out.println("Data : " +bantu);
        return null;
    }
    
    public ListNode<E> delete (E val) {
        return remove(search(val));
    }
    
    public String toString() {
        String isi = "";
        ListNode<E> bantu = head.getNext();
        while(bantu != head) 
        { //selama node bantu tidak sama dengan nilai head
            System.out.println(bantu.getData()+" ");
            bantu = bantu.getNext();
        }
        return isi;
    }

    public ListNode<E> getHead() { //method utk mendapatkan nilai head
        return head;
    }

    public void setHead(ListNode<E> head) { //method utk menetapkan nilai head
        this.head = head;
    }

    public int getSize() { //method utk mendapatkan nilai size
        return size;
    }

    public void setSize(int size) { //method utk menetapkan nilai size
        this.size = size;
    }
}
