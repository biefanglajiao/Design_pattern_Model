package org.策略模式_旅游出行策略;

import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import java.io.File;

public class Xmlutil {
            public static  Object getbBean(){
            try {
                DocumentBuilderFactory documentBuilderFactory= DocumentBuilderFactory.newInstance();
                DocumentBuilder builder=documentBuilderFactory.newDocumentBuilder();
                Document document;
                document=  builder.parse(new File("src/main/java/org/策略模式_旅游出行策略/config.xml"));
                NodeList nodeList=null;
                Node classNode=null;
                String cNamebefore="org.策略模式_旅游出行策略.";
                String cName=null;

                nodeList=document.getElementsByTagName("className");


                    classNode=nodeList.item(0).getFirstChild();

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


