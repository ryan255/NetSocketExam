package com.hand;

/**
 * Hello world!
 *
 */
import org.w3c.dom.Document;
import org.w3c.dom.Element;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerConfigurationException;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import java.io.File;
import java.io.StringWriter;

/**
 * Created by ryan255 on 16/8/1.
 */

public class XmlCreate {

    public static void main(String[] args) {
        try {
            DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
            DocumentBuilder builder = factory.newDocumentBuilder();
            Document document = builder.newDocument();
            Element root = document.createElement("stock");

            Element lan1 = document.createElement("id");
            lan1.setTextContent("0");
            Element name1 = document.createElement("name");
            name1.setTextContent("汉得信息");
            Element ide1 = document.createElement("open");
            ide1.setTextContent("今日开盘价");

            lan1.appendChild(name1);
            lan1.appendChild(ide1);
            root.appendChild(lan1);
            document.appendChild(root);

            TransformerFactory tff = TransformerFactory.newInstance();
            Transformer tf = tff.newTransformer();
            StringWriter sw = new StringWriter();
            tf.transform(new DOMSource(document),new StreamResult(sw));

            tf.transform(new DOMSource(document),new StreamResult(new File("new.xml")));
            System.out.print("文件创建成功");

        } catch (ParserConfigurationException e) {
            e.printStackTrace();
        } catch (TransformerConfigurationException e) {
            e.printStackTrace();
        } catch (TransformerException e) {
            e.printStackTrace();
        }

    }
}