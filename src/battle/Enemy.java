package battle;

import java.util.Random;
import java.io.File;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

public class Enemy extends Entity{

	public Enemy() {
		//super(name, health, strength, exp);
					
			try {
				
				File fXmlFile = new File("enemy.xml");
				DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
				DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
				Document doc = dBuilder.parse(fXmlFile);
							
				NodeList nList = doc.getElementsByTagName("Enemy");
				
					Random random = new Random();

					Node nNode = nList.item(random.nextInt(nList.getLength()));

					if (nNode.getNodeType() == Node.ELEMENT_NODE) {

						Element eElement = (Element) nNode;
						
						name = eElement.getElementsByTagName("Name").item(0).getTextContent();
						health = Integer.parseInt(eElement.getElementsByTagName("Health").item(0).getTextContent());
						strength = Integer.parseInt(eElement.getElementsByTagName("Strength").item(0).getTextContent());
						exp = Integer.parseInt(eElement.getElementsByTagName("Exp").item(0).getTextContent());
						
					}
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		public void stillAlive() {
			if (this.getHealth() <=0){
				System.out.println("You defeated " + this.getName() + "!");
		}
	}
		
	}


