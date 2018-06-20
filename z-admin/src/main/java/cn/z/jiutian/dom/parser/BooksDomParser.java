package cn.z.jiutian.dom.parser;

import java.io.File;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NodeList;

public class BooksDomParser {

    public static void main(String[] args) throws Exception {
        DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
        DocumentBuilder db = dbf.newDocumentBuilder();
        
        Document doc = db.parse(new File("src/main/java/cn/z/jiutian/dom/parser/books.xml"));
        NodeList lists = doc.getElementsByTagName("book");
        System.out.println("lists length: " + lists.getLength());
        
        for( int i = 0; i < lists.getLength(); i++){
            System.out.println("----------------------");
            
            Element element = (Element)lists.item(i);
            
            String content0 = element.getElementsByTagName("title").item(0).getNodeValue();
            System.out.println(content0);
            
            String content = element.getElementsByTagName("title").item(0).getFirstChild().getNodeValue();
            System.out.println("title : " + content);
            
            content = element.getElementsByTagName("author").item(0).getFirstChild().getNodeValue();
            System.out.println("author : " + content);
            
            content = element.getElementsByTagName("year").item(0).getFirstChild().getNodeValue();
            System.out.println("year : " + content);
            
            content = element.getElementsByTagName("price").item(0).getFirstChild().getNodeValue();
            System.out.println("price : " + content);
            
        }
        
        
    }

}
