package com.practice.xml;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;


@XmlRootElement (name = "books")
class Books {
    private ArrayList<Book> books;
    public Books(){
	books = new ArrayList<>();
    }

    public void add(Book book){
	books.add(book);
    }

    @XmlElement(name = "book")
    public List<Book> getBooks() {
	return books;
    }
}

@XmlRootElement(name = "Book")
class Book {
    // поля
    @XmlAttribute(name="ganre")
    String ganre;
    @XmlElement
    String bookName;
    @XmlElement
    String bookAuthor;
    @XmlElement
    int bookId;
    @XmlElement
    int bookYear;
    @XmlElement
    boolean bookAvailable;

    public Book(){

    }

    public Book(String ganre, int bookId, String bookName, String bookAuthor, int bookYear, boolean bookAvailable){ // Конструктор чтобы быстрее создавать новые книги не напрягаясь
	setGanre(ganre);
	setBookId(bookId);
	setBookName(bookName);
	setBookAuthor(bookAuthor);
	setBookYear(bookYear);
	setBookAvailable(bookAvailable);
    }

    String getGanre(){
	return this.ganre;
    }

    void setGanre(String ganre){
	this.ganre = ganre;
    }

    String getBookName(){
	return this.bookName;
    }

    void setBookName(String bookName){
	this.bookName = bookName;
    }

    String getBookAuthor (){
	return this.bookAuthor ;
    }

    void setBookAuthor (String bookAuthor ){
	this.bookAuthor  = bookAuthor;
    }

    boolean getBookAvailable(){
	return this.bookAvailable;
    }

    void setBookAvailable(boolean bookAvailable){
	this.bookAvailable = bookAvailable;
    }

    int getBookId(){
	return this.bookId;
    }

    void setBookId(int bookId){
	this.bookId = bookId;
    }

    int getBookYear(){
	return this.bookYear;
    }


    void setBookYear(int bookYear){
	this.bookYear = bookYear;
    }
}