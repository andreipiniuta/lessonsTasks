package DAO;

import java.util.List;
//на каждый бизнес объект свой interface
public interface MaterialDAO {

        void saveMaterial(Material material);

        List<Material> loadAllMaterial();

        Material loadMaterialbyID(Integer ID);

        void updateMaterial(Material material);

        void deleteMaterial(Integer ID);

    }

