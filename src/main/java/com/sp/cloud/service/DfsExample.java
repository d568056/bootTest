package com.sp.cloud.service;

import java.util.LinkedList;

public class DfsExample {

public static void main(String[] args){
    Graph g = new Graph(5);

    g.addEdge(1, 0);
    g.addEdge(0, 2);
    g.addEdge(2, 1);
    g.addEdge(0, 3);
    g.addEdge(1, 4);

}
}


