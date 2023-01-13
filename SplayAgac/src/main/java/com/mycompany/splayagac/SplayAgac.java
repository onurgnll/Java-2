
package com.mycompany.splayagac;

import java.util.Scanner;
class Node {
public int data;
public Node left;
public Node right;
public Node parent;

public Node(int data) {
  this.data = data;
  this.parent = null;
  this.left = null;
  this.right = null;
}
}

public class SplayAgac {

public static void main(String[] args) {
  SplayTree t = new SplayTree();

  Node a, b, c, d, e, f, g, h, i, j, k, l, m;
  a = new Node(67);
  b = new Node(3);
  c = new Node(62);
  d = new Node(56);
  e = new Node(34);
  f = new Node(38);
  g = new Node(75);
  h = new Node(2);
  i = new Node(14);
  j = new Node(1);
  k = new Node(76);

  t.insert(a);
  t.insert(b);
  t.insert(c);
  t.insert(d);
  t.insert(e);
  t.insert(f);
  t.insert(g);
  t.insert(h);
  t.insert(i);
  t.insert(j);
  t.insert(k);

  t.inorder(t.root);
}
}