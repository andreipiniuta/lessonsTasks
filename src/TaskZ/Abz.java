package TaskZ;

import org.json.JSONWriter;
import parsers.json.JsonWriter;

import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Abz {
    private  String AbzName;
    private List<Material> storage;

    public Abz(String abzName) {
        this.AbzName = abzName;
    }

    public void addMaterial() throws IOException {
        storage = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of dilivery ready to accept");
        String str = sc.nextLine();
        int numberDilivery = Integer.parseInt(str);
        for (int i = 0; i < numberDilivery; i++) {
            Material material = new Material();
            System.out.println(i + 1 +"th Dilivery");

            while (true) {
                System.out.println("Enter Name of material. You can choose only from" + Arrays.toString(MaterialName.values()));
                String s = sc.nextLine();
                try{
                    MaterialName materialName = MaterialName.valueOf(s);
                    material.setMaterialName(materialName);
                    break;
                } catch (Exception e ) {
                    System.out.println("Not valid Material!!!");
                }
            }

            while (true) {
                System.out.println("Enter Name of provider. You can choose only from" + Arrays.toString(ProviderName.values()));
                String p = sc.nextLine();
                try {
                    ProviderName providerName = ProviderName.valueOf(p);
                    material.setProviderName(providerName);
                    break;
                } catch (Exception e){
                    System.out.println("Not valid Provider!!!");
                }
            }
            double amount = ConsoleUtils.readDouble("Enter amount");
            double costPerOne = ConsoleUtils.readDouble("Enter cost");
            material.setCostPerOne(costPerOne);
            material.setAmount(amount);

            storage.add(material);
        }
        System.out.println("Yuor list of dilivery for accept is");
        for (Material m: storage) {
            System.out.println(m);
        }
        FileWriter writer = new FileWriter("D:/stormnet-tasks/project/materialFromClient.json");
        JSONWriter jsonWriter = new JSONWriter(writer);
        jsonWriter.array();
        for (Material material:storage) {
            jsonWriter.object();
            jsonWriter.key("materialName").value(material.getMaterialName());
            jsonWriter.key("providerName").value(material.getProviderName());
            jsonWriter.key("amount").value(material.getAmount());
            jsonWriter.key("costPerOne").value(material.getCostPerOne());
            jsonWriter.key("totalCost").value(material.getTotalCost());
            jsonWriter.endObject();
        }
        jsonWriter.endArray();
        writer.close();

    }

//    public void showTotalSand(){
//        for (int i = 0; i<storage.size(); i++){
//            if(storage.contains(material.getMaterialName().equals("sand"))){
//                totalSand = totalSand + material.getAmount();
//            }
//        }
//    }
//    public void showTotalGravel() {
//        for (int i = 0; i < storage.size(); i++) {
//            if (storage.contains(material.getMaterialName().equals("gravel"))) {
//                totalGravel = totalGravel + material.getAmount();
//            }
//        }
//    }
//    public void showTotalBitum() {
//        for (int i = 0; i < storage.size(); i++) {
//            if (storage.contains(material.getMaterialName().equals("bitum"))) {
//                totalBitum = totalBitum + material.getAmount();
//            }
//        }

}
