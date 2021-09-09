package com.company;

public class Node {
    public int key;     //ключ узла, по которому можно обращаться к нему
    public String data;     //данные в узле
    public Node leftChild;      //левый ребёнок
    public Node rightChild;     //правый ребёнок

    /*
    Метод, выводящий содержимое узла на экран
     */
    public void printNode() {
        System.out.println("Ключ: " + key + " Данные: " + data);
    }
}