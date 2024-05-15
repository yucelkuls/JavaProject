package j29_Collection.p03_Queue;

import java.util.Arrays;
import java.util.Deque;
import java.util.LinkedList;

public class C02_Deque {
    public static void main(String[] args) {
        /*
        Deque: Double Ended Queue -> Queue'larda FİFO Deque'lerde hem FİFO hem LİFO geçerli
        LİFO : Last in First out -> metrobuse son binen ilk iner :)
        */
        Deque<String> d1 = new LinkedList<>(Arrays.asList("jaBAN", "javaZAN", "javaHIR", "javaCAN", "javİDAN", "jaVİYE", "javaSU", "javaHAN", "javaZADE"));

        //deque print-> sout(d)
        System.out.println("d1 = " + d1); // [jaBAN, javaZAN, javaHIR, javaCAN, javİDAN, jaVİYE, javaSU, javaHAN, javaZADE]
        //deque eleman ekleme-> add()
        d1.add("javaCardi");
        System.out.println("d1 = " + d1); // [jaBAN, javaZAN, javaHIR, javaCAN, javİDAN, jaVİYE, javaSU, javaHAN, javaZADE, javaCardi]
        System.out.println("d1.getFirst() = " + d1.getFirst()); // jaBAN
        System.out.println("d1.getLast() = " + d1.getLast()); // javaCardi
        System.out.println("d1.peek() = " + d1.peek()); // jaBAN
        System.out.println("d1.peekFirst() = " + d1.peekFirst()); //jaBAN
        System.out.println("d1.peekLast() = " + d1.peekLast()); //javaCardi

        d1.clear();
        System.out.println("d1 clear() sonrasi= " + d1); // []
   //     System.out.println("d1.getFirst() = " + d1.getFirst()); // RTE - > NoSuchElementException
        System.out.println("d1.peek() = " + d1.peek()); // null
        System.out.println("d1.peekFirst() = " + d1.peekFirst()); //null
        System.out.println("d1.peekLast() = " + d1.peekLast()); //null
   //     System.out.println("d1.getLast() = " + d1.getLast()); // RTE - > NoSuchElementException

        Deque<String> d2 = new LinkedList<>(Arrays.asList("jaBAN", "javaZAN", "javaHIR", "javaCAN", "javİDAN", "jaVİYE", "javaSU", "javaHAN", "javaZADE"));
        System.out.println("d2.poll() = " + d2.poll()); // jaBAN
        System.out.println("d2.pollFirst() = " + d2.pollFirst()); // javaZAN
        System.out.println("d2.pollLast() = " + d2.pollLast()); // javaZADE
        System.out.println("d2.remove() = " + d2.remove()); // javaHIR
        System.out.println("d2.removeFirst() = " + d2.removeFirst()); // javaCAN
        System.out.println("d2.removeLast() = " + d2.removeLast()); // javaHAN
        d2.clear();
        System.out.println("d2 clear() sonrasi = " + d2); // []
        System.out.println("d2.poll() = " + d2.poll()); // null
        System.out.println("d2.pollFirst() = " + d2.pollFirst()); // null
        System.out.println("d2.pollLast() = " + d2.pollLast()); // null
        System.out.println("d2.remove() = " + d2.remove()); // RTE - > NoSuchElementException
        System.out.println("d2.removeFirst() = " + d2.removeFirst()); // RTE - > NoSuchElementException
        System.out.println("d2.removeLast() = " + d2.removeLast()); // RTE - > NoSuchElementException




    }
}
