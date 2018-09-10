/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package libraly;

/**
 *
 * @author Дом
 */

public class Libraly {
  public static void main (String [] args) {
    Book b1,b2,b3, b4;
    b1 = new Book ();
    b2 = new Book ("Fight Club", 197);
    b3 = new Book ("For Whom The Bell Tools");
    b4 = new Book (430);
    System.out.println (b1.getInfo() + "\n" + b2.getInfo() + "\n"
    + b3.getInfo() + "\n" + b4.getInfo());

  }
}
