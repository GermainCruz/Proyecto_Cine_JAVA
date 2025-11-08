/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gestionlogin;

/**
 *
 * @author Harry
 */
public class BinarySearchTree {

    private Node root;

    public void insert(String correo, int idCliente) {
        root = insertRec(root, correo, idCliente);
    }

    private Node insertRec(Node root, String correo, int idCliente) {
        if (root == null) {
            return new Node(correo, idCliente);
        }
        if (correo.compareTo(root.correo) < 0) {
            root.left = insertRec(root.left, correo, idCliente);
        } else if (correo.compareTo(root.correo) > 0) {
            root.right = insertRec(root.right, correo, idCliente);
        }
        return root;
    }
//    private Node insertRec(Node root, String correo, int idCliente) {
//        if (root == null) {
//            return new Node(correo, idCliente);
//        }
//        if (correo == null || (root.correo != null && correo.compareTo(root.correo) < 0)) {
//            root.left = insertRec(root.left, correo, idCliente);
//        } else if (root.correo == null || (correo != null && correo.compareTo(root.correo) > 0)) {
//            root.right = insertRec(root.right, correo, idCliente);
//        }
//        return root;
//    }

    public int search(String correo) {
        return searchRec(root, correo);
    }

    private int searchRec(Node root, String correo) {
        if (root == null) {
            return -1; // No encontrado
        }
        if (correo.equals(root.correo)) {
            return root.idCliente;
        }
        return correo.compareTo(root.correo) < 0
                ? searchRec(root.left, correo)
                : searchRec(root.right, correo);
    }

    public Node getRoot() {
        return root;
    }

    public void setRoot(Node root) {
        this.root = root;
    }

}
