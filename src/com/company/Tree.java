package com.company;

public class Tree {
    Node root;

    /*
      Поиск элемента в дереве по ключу
     */
    public Node find(int key) {
        Node current = root;
        while (current.key != key) {
            if (current.key < key) {
                current = current.rightChild;
            } else {
                current = current.leftChild;
            }
            if (current == null) {
                return null;
            }
        }
        return current;
    }


}
