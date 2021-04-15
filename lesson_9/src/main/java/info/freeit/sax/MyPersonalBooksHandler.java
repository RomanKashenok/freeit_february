package info.freeit.sax;

import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

public class MyPersonalBooksHandler extends DefaultHandler {
    boolean title = false; //true
    boolean date = false;

    @Override
    public void startDocument() throws SAXException {
        System.out.println("Document parsing started!!! \n");
    }

    @Override
    public void endDocument() throws SAXException {
        System.out.println("Document parsing finished!!!");
    }

    @Override//<title>
    public void startElement(String uri, String localName, String qName, Attributes attributes) throws SAXException {
        if (qName.equalsIgnoreCase("title")) {
            title = true;
        }
        if (qName.equalsIgnoreCase("date")) {
            date = true;
        }
    }

    @Override // book title
    public void characters(char ch[], int start, int length) throws SAXException {
        if (title) {
            System.out.println("Title: " + new String(ch, start, length));
        }
        if (date) {
            System.out.println("Date: " + new String(ch, start, length));
        }
    }

    @Override // </title>
    public void endElement(String uri, String localName, String qName) throws SAXException {
        if (title) {
            System.out.println("element: " + qName + " ended!!!");
            title = false;
        }
        if (date) {
            System.out.println("element: " + qName + " ended!!!");
            date = false;
        }
    }
}
