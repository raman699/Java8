package com.practice.xml;

import java.io.File;
import java.io.IOException;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;
import javax.xml.parsers.ParserConfigurationException;

import org.xml.sax.SAXException;

public class TestingTest {
    /**
     * @param args
     * @throws InterruptedException
     * @throws ParserConfigurationException
     * @throws SAXException
     * @throws IOException
     * @throws JAXBException
     */
    public static void main (String[] args) throws InterruptedException, ParserConfigurationException, SAXException, IOException, JAXBException {
	File file = new File("/home/ramandeep/Air/work/Dropbox/jee-neon-workspace/realCodingMakesAProgrammerPerfect/src/com/practice/xml/books.xml");

	JAXBContext jaxbContext = JAXBContext.newInstance(Books.class);
	Marshaller jaxbMarshaller = jaxbContext.createMarshaller();
	jaxbMarshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
	Unmarshaller jaxbUnmarshaller = jaxbContext.createUnmarshaller();
	Books books = (Books) jaxbUnmarshaller.unmarshal(file);
	books.add(new Book(
		"fantasy",
		7111,
		"Troscsn",
		"Brawm",
		15,
		true
		));
	jaxbMarshaller.marshal(books,file);
    }}
