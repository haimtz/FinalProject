package il.co.moshavit.service;

import java.io.File;
import java.io.IOException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

public class Settings {
	
	private static final String FILE_NAME = "WebContent\\WEB-INF\\database-config.xml";
	
	public static String getData(String tagName) throws ParserConfigurationException, 
													  SAXException, IOException
	{
		File myFile = new File(FILE_NAME);
		
		DocumentBuilderFactory docFactory = DocumentBuilderFactory.newInstance();
		DocumentBuilder docBuilder = docFactory.newDocumentBuilder();
		Document doc = docBuilder.parse(myFile);
		
		doc.getDocumentElement().normalize();
		
		NodeList nodes = doc.getElementsByTagName("dataSetting");
		Node node = nodes.item(0);
		
		Element element = (Element)node;
		NodeList nodes_1 = element.getElementsByTagName(tagName).item(0).getChildNodes();
		
		return ((Node)nodes_1.item(0)).getNodeValue();
		
	}

}
