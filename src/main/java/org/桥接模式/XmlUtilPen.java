package org.桥接模式;

import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import java.io.File;
import java.io.IOException;

public class XmlUtilPen {


    public static  Object getbBean(String args){
        try {
            DocumentBuilderFactory documentBuilderFactory= DocumentBuilderFactory.newInstance();
            DocumentBuilder builder=documentBuilderFactory.newDocumentBuilder();
          Document document;
            document=  builder.parse(new File("src/main/java/org/桥接模式/configPen.xml"));
            NodeList nodeList=null;
            Node classNode=null;
            String cNamebefore="org.桥接模式.";
            String cName=null;

            nodeList=document.getElementsByTagName("className");

            if (args.equals("color")){
                classNode=nodeList.item(0).getFirstChild();
            }else if (args.equals("pen")){
                classNode=nodeList.item(1).getFirstChild();
            }
            cName=classNode.getNodeValue();
            Class c=Class.forName(cNamebefore+cName);
            Object onj=c.newInstance();
            return onj;

        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }

    }
}
