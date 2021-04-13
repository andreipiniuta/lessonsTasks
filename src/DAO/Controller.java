package DAO;

import DAO.Material;
import DAO.MaterialDAO;
import DAO.json.JsonMaterialDAO;

import java.util.List;

public class Controller {
    public static void main(String[] args) {


        MaterialDAO materialDAO = new JsonMaterialDAO();//создали  DAO объект
        List<Material> allMaterials = materialDAO.loadAllMaterial();//загрузили данные из хранилища
        Material m = new Material();
        m.setAmount(15);
        m.setCostPerOne(10);
        //после создания объекта его можно сохранить
        materialDAO.saveMaterial(m);
    }
}
