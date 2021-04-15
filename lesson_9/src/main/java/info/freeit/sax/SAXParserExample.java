package info.freeit.sax;

import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;

import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

public class SAXParserExample {
	public static void main(String args[]) {
		 
        final String fileName = "books.xml";
 
        try {
            SAXParserFactory factory = SAXParserFactory.newInstance();
            SAXParser saxParser = factory.newSAXParser();

            DefaultHandler handler = new MyPersonalBooksHandler();
 
//            DefaultHandler handler = new DefaultHandler() {
//                boolean title = false;
//                boolean date = false;
//
//                @Override
//                public void startElement(String uri, String localName, String qName, Attributes attributes) throws SAXException {
//                    if (qName.equalsIgnoreCase("title")) {
//                        title = true;
//                    }
//                    if (qName.equalsIgnoreCase("date")) {
//                        date = true;
//                    }
//                }
//
//                @Override
//                public void characters(char ch[], int start, int length) throws SAXException {
//                    if (title) {
//                        System.out.println("Title: " + new String(ch, start, length));
//                        title = false;
//                    }
//                    if(date) {
//                    	System.out.println("Date: " + new String(ch, start, length));
//                    	date = false;
//                    }
//                }
//
//                @Override
//                public void endElement(String uri, String localName, String qName) throws SAXException {
//                    System.out.println("element: " + localName + " ended!!!");
//                }
//            };

            saxParser.parse(fileName, handler);
 
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
