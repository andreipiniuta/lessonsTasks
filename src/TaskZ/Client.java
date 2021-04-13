package TaskZ;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Client {
    public static void main(String[] args) throws ParserConfigurationException, IOException, SAXException {
        List<Recipe> allRecipe = new ArrayList<>();

        DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
        DocumentBuilder db = dbf.newDocumentBuilder();
        Document document = db.parse("D:/stormnet-tasks/project/recipe.xml");
        Element rootTag = document.getDocumentElement();
        NodeList allTags = rootTag.getElementsByTagName("product");
        int allTagscount = allTags.getLength();
        for(int i =0; i<allTagscount; i++){
            Recipe recipe = new Recipe();
            Element objectTag = (Element) allTags.item(i);

            Element productNameTag = (Element) objectTag.getElementsByTagName("product-name").item(0);
            String productName = productNameTag.getTextContent();
            recipe.setProductName(productName);

            Element sandTag = (Element) objectTag.getElementsByTagName("sand").item(0);
            String sand = sandTag.getTextContent();
            double s = Double.parseDouble(sand);
            recipe.setSand(s);

            Element gravelTag = (Element) objectTag.getElementsByTagName("gravel").item(0);
            String gravel = gravelTag.getTextContent();
            double g = Double.parseDouble(gravel);
            recipe.setGravel(g);

            Element bitumTag = (Element) objectTag.getElementsByTagName("bitum").item(0);
            String bitum = bitumTag.getTextContent();
            double b = Double.parseDouble(bitum);
            recipe.setBitum(b);

            allRecipe.add(recipe);
        }
        for (Recipe rcp:allRecipe) {
            System.out.println(rcp);
        }
    }
}
