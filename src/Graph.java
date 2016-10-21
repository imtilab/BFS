/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author mti
 */
import java.util.LinkedList;
import java.util.Scanner;
import java.util.Queue;

public class Graph {

    Scanner kb = new Scanner(System.in);

    int arr[][];
    int vertex;
    int edges;
    boolean B[];
    //Queue q = new Queue();
    Queue q = new LinkedList();

    public void setGraph() {

        System.out.println("How Many Vertex?");
        int ver = kb.nextInt();
        System.out.println("How Many Edges?");
        int edg = kb.nextInt();

        arr = new int[ver + 1][ver + 1];
        vertex = ver;
        edges = edg;

        for (int i = 0; i < edg; i++) {
            System.out.println("From");
            int from = kb.nextInt();
            System.out.println("To");
            int to = kb.nextInt();

            arr[from][to] = 1;
            arr[to][from] = 1;
        }
    }

    public void BFSOrder() {
        B = new boolean[vertex + 1];

        System.out.println("Give Start of Graph");
        int start = kb.nextInt();

        try {
            q.add(start);
        } catch (Exception e) {
            System.out.println("It should not be printed as Linked list Queue");
        }
        B[start] = true;

        FirstBFSOrder();

        int part = 2;
        for (int n = 1; n <= vertex; n++) {
            if (!B[n]) {
                System.out.println("Part " + part + " of Graph");
                part++;
                BFSOrder(n);
            }
        }
    }
    //this part for first all connected nodes
    public void FirstBFSOrder() {

        while (!q.isEmpty()) {
            int fromQ = -1;
            try {
                fromQ = (Integer) q.poll();
                System.out.println(fromQ);
            } catch (Exception e) {
                System.out.println("Queue is Empty!");
            }

            for (int m = 0; m <= vertex; m++) {
                if (!B[m] && arr[fromQ][m] > 0) {
                    try {
                        q.add(m);
                        B[m] = true;
                    } catch (Exception e) {
                        System.out.println("It should not be printed "
                                + "as Linked list Queue");
                    }
                }
            }
        }
    }
    //this part for disconnected nodes
    public void BFSOrder(int n) {
        try {
            q.add(n);
        } catch (Exception e) {
            System.out.println("It should not be printed as Linked list Queue");
        }
        B[n] = true;

        while (!q.isEmpty()) {
            int fromQ = -1;
            try {
                fromQ = (Integer) q.poll();
                System.out.println(fromQ);
            } catch (Exception e) {
                System.out.println("Queue is Empty!");
            }

            for (int m = 0; m <= vertex; m++) {
                if (!B[m] && arr[fromQ][m] > 0) {
                    try {
                        q.add(m);
                        B[m] = true;
                    } catch (Exception e) {
                        System.out.println("It should not be printed "
                                + "as Linked list Queue");
                    }
                }
            }
        }
    }
}
