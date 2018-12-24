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
import org.xml.sax.SAXException;

public class Testing1 {
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
	Element rootElement = doc.createElement("server");

	Element sbx = doc.createElement("sbx");
	sbx.appendChild(doc.createTextNode("raman"));
	rootElement.appendChild(sbx);

	Element dev = doc.createElement("dev");
	dev.appendChild(doc.createTextNode("12"));
	rootElement.appendChild(dev);

	nList.appendChild(sbx);
	nList.appendChild(dev);
	//write in a XMLFile
	TransformerFactory transformerFactory = TransformerFactory.newInstance();
	Transformer transformer = null;
	try {
	    transformer = transformerFactory.newTransformer();
	} catch (TransformerConfigurationException e) {
	    e.printStackTrace();
	}
	DOMSource source = new DOMSource(doc);
	StreamResult result = new StreamResult(new File(filepath));

	try {
	    transformer.transform(source, result);
	} catch (TransformerException e) {

	    e.printStackTrace();
	}


    }
}
