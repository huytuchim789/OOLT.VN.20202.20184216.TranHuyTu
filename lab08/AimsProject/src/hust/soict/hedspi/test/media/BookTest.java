/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hust.soict.hedspi.test.media;

import hust.soict.hedspi.aims.media.Book;

/**
 *
 * @author MyPC
 */
public class BookTest {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        // TODO code application logic here
        Book book1=new Book("Than Dong Dat Viet","Truyen Tranh",10,"Phan Thi","asd arw wf asdas.asd asd arw wf 12.2 abc asd asd.asd");
        book1.addAuthor("Bao");
        book1.addAuthor("Du Tran");
        book1.processContent();
        book1.toString();
    }
}
