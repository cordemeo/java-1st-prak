import java.util.Scanner;

public class PDL {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        String[] cards = input.split(" ");
        String player1Cards = cards[0];
        String player2Cards = cards[1];

        DoublyLinkedList player1List = new DoublyLinkedList();
        DoublyLinkedList player2List = new DoublyLinkedList();

        for (int i = 0; i < player1Cards.length(); i++) {
            player1List.addLast(Integer.parseInt(player1Cards.substring(i, i+1)));
        }

        for (int i = 0; i < player2Cards.length(); i++) {
            player2List.addLast(Integer.parseInt(player2Cards.substring(i, i+1)));
        }

        int moves = 0;
        while (!player1List.isEmpty() && !player2List.isEmpty()) {
            int player1Card = player1List.removeFirst();
            int player2Card = player2List.removeFirst();

            if (player1Card > player2Card) {
                player1List.addLast(player1Card);
                player1List.addLast(player2Card);
            } else if (player2Card > player1Card) {
                player2List.addLast(player2Card);
                player2List.addLast(player1Card);
            }

            moves++;
            if (moves == 106) {
                System.out.println("botva");
                return;
            }
        }

        if (player1List.isEmpty()) {
            System.out.println("second " + moves);
        } else {
            System.out.println("first " + moves);
        }
    }
}

class DoublyLinkedList {
    private Node first;
    private Node last;
    private int size;

    class Node {
        int data;
        Node next;
        Node prev;

        Node(int data) {
            this.data = data;
        }
    }

    public int getSize() {
        return size;
    }

    public boolean isEmpty() {
        return (first == null);
    }

    public void addLast(int data) {
        Node newNode = new Node(data);
        if (isEmpty()) {
            first = newNode;
        } else {
            last.next = newNode;
            newNode.prev = last;
        }
        last = newNode;
        size++;
    }

    public int removeFirst() {
        int temp = first.data;
        if (first.next == null) {
            last = null;
        } else {
            first.next.prev = null;
        }
        first = first.next;
        size--;
        return temp;
    }
}
