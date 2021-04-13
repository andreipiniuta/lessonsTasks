package DAO.json;

import DAO.IDGenerator;
import DAO.Material;
import DAO.MaterialDAO;

import java.util.ArrayList;
import java.util.List;
// на каждое хранилище данных(json, xml, sql) своя реализация interface
//тут типо храним просто в листе
public class JsonMaterialDAO implements MaterialDAO {//обл видимость пекета, чтобы было через фабрику DAO

    public static List<Material> allMaterial = new ArrayList<>();



    @Override
    public void saveMaterial(Material material) {//сохранени объекта
        Integer materialID = material.getID();// узнаем номер у объекта
        if(materialID != null) {//если ID уже есть, т.е. НЕ null, то такой объект уже есть, и это ошибка
            throw new RuntimeException("Material with " + materialID + "has already existed");
        }
        materialID = IDGenerator.getIdGenerator().nextID();//присваиваем ID-шник с пом класса-генератора ID
        material.setID(materialID); //установка объекту ID-шника
        allMaterial.add(material);
    }

    @Override
    public List<Material> loadAllMaterial() {//загрузить  все объекты
        return allMaterial;
    }

    @Override
    public Material loadMaterialbyID(Integer ID) {//загрузить объект по номеру ID
        if (ID == null) {//если вообще нет ID
            throw new RuntimeException("ID can not be null");
        }
        for (Material material : allMaterial) {//ищем в листе объект с заданным ID
            if (ID.equals(material.getID())) {
                return material;
            }
        }
        throw  new RuntimeException("Material with " + ID + "not found");//передали не существующий iD
    }

    @Override
    public void updateMaterial(Material material) {//обновить объект
        Integer materialID = material.getID();// узнаем номер у объекта
        if(materialID == null) {//если вообще нет такого ID
            return;
        }
        Material storedMaterial = loadMaterialbyID(materialID);//загрузка объекта с указанным номерм
        storedMaterial.setAmount(material.getAmount());//установка этому объекту новое значение количество
        storedMaterial.setCostPerOne(material.getCostPerOne());//установка этому объекту новое значение цена

    }

    @Override
    public void deleteMaterial(Integer ID) {//удаление объекта
        if (ID == null) {//если вообще нет ID
            throw new RuntimeException("ID can not be null");
        }
        for (Material material : allMaterial) {//ищем в листе объект с заданным ID
            if (ID.equals(material.getID())) {//если по номеру нашли
                allMaterial.remove(material);//удаление из листа
                return;
            }
        }
        throw  new RuntimeException("Material with " + ID + "not found");//передали не существующий iD

    }
}
