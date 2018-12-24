package com.practice.xml;

import java.io.File;
import java.io.IOException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerConfigurationException;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.xml.sax.SAXException;

public class Testing {
    public static void main(String...s){
	String filepath = "/home/ramandeep/Air/work/Dropbox/jee-neon-workspace/realCodingMakesAProgrammerPerfect/src/com/practice/xml/books.xml";
	DocumentBuilderFactory docFactory = DocumentBuilderFactory.newInstance();
	DocumentBuilder docBuilder=null;
	Document doc=null;
	try
	{
	    docBuilder = docFactory.newDocumentBuilder();
	    doc = docBuilder.parse(filepath);
	}
	catch (SAXException | IOException e1)
	{

	    e1.printStackTrace();
	}
	catch (ParserConfigurationException e)
	{

	    e.printStackTrace();
	}

	Element nList = doc.getDocumentElement();


	Node server = doc.getFirstChild();
	Element rootElement = doc.createElement("server");
	//server.appendChild(rootElement);

	//root Book
	Element sbx = doc.createElement("sbx");
	sbx.appendChild(doc.createTextNode("raman"));
	rootElement.appendChild(sbx);


	//book id
	Element dev = doc.createElement("dev");
	dev.appendChild(doc.createTextNode("12"));
	rootElement.appendChild(dev);

	//	//bookname element
	//	Element bookname = doc.createElement("bookName");
	//	bookname.appendChild(doc.createTextNode("name"));
	//	Book.appendChild(bookname);
	//
	//	//book author
	//	Element bookAuthor = doc.createElement("bookAuthor");
	//	bookAuthor.appendChild(doc.createTextNode("author"));
	//	Book.appendChild(bookAuthor);
	//
	//	//book year
	//	Element bookYear = doc.createElement("bookYear");
	//	bookYear.appendChild(doc.createTextNode(String.valueOf("year")));
	//	Book.appendChild(bookYear);
	//
	//	//book available
	//	Element bookAvail = doc.createElement("bookAvailable");
	//	bookAvail.appendChild(doc.createTextNode(String.valueOf("free")));
	//	Book.appendChild(bookAvail);

	nList.appendChild(sbx);
	nList.appendChild(dev);
	//write in a XMLFile
	TransformerFactory transformerFactory = TransformerFactory.newInstance();
	Transformer transformer = null;
	try {
	    transformer = transformerFactory.newTransformer();
	} catch (TransformerConfigurationException e) {
	    // TODO Auto-generated catch block
	    e.printStackTrace();
	}
	DOMSource source = new DOMSource(doc);
	StreamResult result = new StreamResult(new File(filepath));

	try {
	    transformer.transform(source, result);
	} catch (TransformerException e) {
	    // TODO Auto-generated catch block
	    e.printStackTrace();
	}

	System.out.println("File saved!");
    }
}
