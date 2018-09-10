/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package libraly;

import java.lang.*;

public class Book {
  private String title;
  private int pages;
  public Book () {
    title = "War and Peace";
    pages = 660;
  }
  public Book (String title, int pages) {
    this.title = title;
    this.pages = pages;
  }
  public Book (String title) {
    this.title = title;
    pages = 220;
  }
  public Book (int pages) {
    title = "The Great Gatsby";
    this.pages = pages;
  }
  public String getTitle () {
    return title;
  }
  public int getPages ()
  {
    return pages;
  }
  public String getInfo () {
    return getTitle() + " " + getPages() + "pages";
  }
}