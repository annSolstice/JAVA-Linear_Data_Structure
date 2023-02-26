
package Project_UAS;

public class QueueLO<E> {
    LinkedList<E> antrian; //variabel array elemen bertipe integer
    
    public QueueLO() { //deklarasi constructor dengan parameter
        antrian = new LinkedList<E>();
    }
    
    //memasukkan elemen dalam daftar queue (antrian)
    public boolean enqueue(E data) {        
        antrian.addLast(data);
        return true; //jika queue penuh, mengembalikan nilai false
    }

    //mengambil elemen dalam daftar queue (antrian)
    public E dequeue() {
        if (!isEmpty()) { //jika queue tidak kosong
            return (E) antrian.removeFirst().getData();
        }
        return null; //mengembalikan nilai delete
    }
    public boolean isEmpty() { //daftar queue kosong
        return antrian.isEmpty();
    }
   
    public E search(E data) {
        return (E) antrian.search(data);
    }
    
    public E delete(E data) {
        return (E) antrian.delete(data);
    }
    
    public int size() {
        return antrian.getSize();
    }

    @Override
    public String toString() {
        return antrian.toString();
    }
}
