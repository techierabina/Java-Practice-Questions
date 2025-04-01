import java.util.Scanner;

class Queue {
    class Node {
        int data;
        Node next;
    }

    Node head;
    Node tail;

    void enqueue(int value) {
        if(tail == null) {
            tail = new Node();
            tail.data = value;
            tail.next = null;
            head = tail;
        }
        else {
            Node temp = new Node();
            temp.data = value;
            temp.next = null;
            tail.next = temp;
            tail = temp;
        }
    }

    void dequeue() {
        if(head == null) {
            System.out.println("Queue is empty.");
        }
        else {
            if(head.next == null) {
                head = null;
                tail = null;
            }
            else {
                Node temp = head;
                head = head.next;
                temp.next = null;
            }
        }
    }

    void view() {
        if(head == null) {
            System.out.println("Queue is empty.");
        }
        else {
            System.out.println("Queue elements are: ");
            Node temp = head;
            while(temp != null) {
                System.out.print(temp.data + " ");
                temp = temp.next;
            }
            System.out.println();
        }
    }
}

public class QueueDriver {
    public static void main(String[] args) {
        int choice, value;
        Scanner input = new Scanner(System.in);
        Queue queue = new Queue();
        do {
            System.out.println("------------------------");
            System.out.println("1. Enqueue");
            System.out.println("2. Dequeue");
            System.out.println("3. View the queue");
            System.out.println("4. Exit");
            System.out.println("------------------------");
            System.out.println("Enter your choice: ");
            choice = input.nextInt();

            switch(choice) {
                case 1:
                    System.out.println("Enter a value to enqueue:");
                    value = input.nextInt();
                    queue.enqueue(value);
                    break;
                case 2:
                    queue.dequeue();
                    break;
                case 3:
                    queue.view();
                    break;
                case 4:
                    break;
            }
        }while(choice != 4);
    }
}
