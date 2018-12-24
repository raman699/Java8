package com.practice.xml;

public class Testing {
    DocumentBuilderFactory docFactory = DocumentBuilderFactory.newInstance();
    DocumentBuilder docBulder = docFactory.newDocumentBuilder();

    //root mainElement
    Document doc = docBulder.newDocument();
    Element rootElement = doc.createElement("Books");
    doc.appendChild(rootElement);

    //root Book
    Element Book = doc.createElement("Book");
    rootElement.appendChild(Book);

    //setting ganre for a book
    Attr att = doc.createAttribute("ganre");
    att.setValue(ganre);
    Book.setAttributeNode(att);

    //book id
    Element bookId = doc.createElement("bookId");
    bookId.appendChild(doc.createTextNode(randomString(4)));
    Book.appendChild(bookId);

    //bookname element
    Element bookname = doc.createElement("bookName");
    bookname.appendChild(doc.createTextNode(name));
    Book.appendChild(bookname);

    //book author
    Element bookAuthor = doc.createElement("bookAuthor");
    bookAuthor.appendChild(doc.createTextNode(author));
    Book.appendChild(bookAuthor);

    //book year
    Element bookYear = doc.createElement("bookYear");
    bookYear.appendChild(doc.createTextNode(String.valueOf(year)));
    Book.appendChild(bookYear);

    //book available
    Element bookAvail = doc.createElement("bookAvailable");
    bookAvail.appendChild(doc.createTextNode(String.valueOf(free)));
    Book.appendChild(bookAvail);

    //write in a XMLFile
    TransformerFactory transformerFactory = TransformerFactory.newInstance();
    Transformer transformer = transformerFactory.newTransformer();
    DOMSource source = new DOMSource(doc);
    StreamResult result = new StreamResult(new File("Test/Books.xml"));

    transformer.transform(source, result);

    System.out.println("File saved!");
}
