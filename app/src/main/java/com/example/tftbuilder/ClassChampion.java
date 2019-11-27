package com.example.tftbuilder;
import java.util.ArrayList;

public class ClassChampion {
    private String name;
    private int icon;
    private int[] bonus;
    private int[] icon_bonus;
    private static ArrayList<ClassChampion> listClassChampion;

    public ClassChampion(String name, int icon, int[] bonus, int[] icon_bonus){
        this.name=name;
        this.icon=icon;
        this.bonus=bonus;
        this.icon_bonus=icon_bonus;
    }

    public String getName() {
        return name;
    }

    public int getIcon() {
        return icon;
    }

    public int[] getBonus() {
        return bonus;
    }

    public int[] getIcon_bonus() {
        return icon_bonus;
    }

    public static void setListClassChampion() {
        listClassChampion=new ArrayList<ClassChampion>();
        listClassChampion.add(new ClassChampion("Giả kim", R.drawable.alchemist, new int[]{1},
                new int[]{R.drawable.alchemist_gold_icon}));
        listClassChampion.add(new ClassChampion("Sát thủ", R.drawable.assassin, new int[]{3, 6},
                new int[]{R.drawable.assassin_bronze_icon, R.drawable.assassin_gold_icon}));
        listClassChampion.add(new ClassChampion("Hóa thân", R.drawable.avatar, new int[]{1},
                new int[]{R.drawable.avatar_gold_icon}));
        listClassChampion.add(new ClassChampion("Cuồng chiến", R.drawable.berserker, new int[]{3, 6},
                new int[]{R.drawable.berserker_bronze_icon, R.drawable.berserker_gold_icon}));
        listClassChampion.add(new ClassChampion("Kiếm khách", R.drawable.blademaster, new int[]{2, 4, 6},
                new int[]{R.drawable.blademaster_bronze_icon, R.drawable.blademaster_silver_icon,
                R.drawable.blademaster_gold_icon}));
        listClassChampion.add(new ClassChampion("Tự nhiên", R.drawable.druid, new int[]{2},
                new int[]{R.drawable.druid_gold_icon}));
        listClassChampion.add(new ClassChampion("Pháp sư", R.drawable.mage, new int[]{3, 6},
                new int[]{R.drawable.mage_bronze_icon, R.drawable.mage_gold_icon}));
        listClassChampion.add(new ClassChampion("Bí ẩn", R.drawable.mystic, new int[]{2, 4},
                new int[]{R.drawable.mystic_bronze_icon, R.drawable.mystic_gold_icon}));
        listClassChampion.add(new ClassChampion("Mãnh thú", R.drawable.predator, new int[]{3},
                new int[]{R.drawable.predator_gold_icon}));
        listClassChampion.add(new ClassChampion("Xạ thủ", R.drawable.ranger, new int[]{2, 4, 6},
                new int[]{R.drawable.ranger_bronze_icon, R.drawable.ranger_silver_icon,
                R.drawable.ranger_gold_icon}));
        listClassChampion.add(new ClassChampion("Triệu hồi", R.drawable.summoner, new int[]{3, 6},
                new int[]{R.drawable.summoner_bronze_icon, R.drawable.summoner_gold_icon}));
        listClassChampion.add(new ClassChampion("Hộ vệ", R.drawable.warden, new int[]{2, 4, 6},
                new int[]{R.drawable.warden_bronze_icon, R.drawable.warden_silver_icon,
                R.drawable.warden_gold_icon}));
        listClassChampion.add(new ClassChampion("Ngọc", R.drawable.crystal, new int[]{2, 4},
                new int[]{R.drawable.crystal_bronze_icon, R.drawable.crystal_gold_icon}));
        listClassChampion.add(new ClassChampion("Ánh sáng", R.drawable.light, new int[]{3, 6, 9},
                new int[]{R.drawable.light_bronze_icon, R.drawable.light_silver_icon,
                R.drawable.light_gold_icon}));
        listClassChampion.add(new ClassChampion("Độc", R.drawable.poison, new int[]{3},
                new int[]{R.drawable.poison_gold_icon}));
        listClassChampion.add(new ClassChampion("Cát", R.drawable.desert, new int[]{2, 4},
                new int[]{R.drawable.desert_bronze_icon, R.drawable.desert_gold_icon}));
        listClassChampion.add(new ClassChampion("Thép", R.drawable.steel, new int[]{2, 3, 4},
                new int[]{R.drawable.steel_bronze_icon, R.drawable.steel_silver_icon,
                R.drawable.steel_gold_icon}));
        listClassChampion.add(new ClassChampion("Bóng tối", R.drawable.shadow, new int[]{2, 4},
                new int[]{R.drawable.shadow_bronze_icon, R.drawable.shadow_gold_icon}));
        listClassChampion.add(new ClassChampion("Sét", R.drawable.electric, new int[]{2, 3, 4},
                new int[]{R.drawable.electric_bronze_icon, R.drawable.electric_silver_icon,
                R.drawable.electric_gold_icon}));
        listClassChampion.add(new ClassChampion("Đất", R.drawable.mountain, new int[]{2},
                new int[]{R.drawable.mountain_gold_icon}));
        listClassChampion.add(new ClassChampion("Gió", R.drawable.cloud, new int[]{2, 3, 4},
                new int[]{R.drawable.cloud_bronze_icon, R.drawable.cloud_silver_icon,
                R.drawable.cloud_gold_icon}));
        listClassChampion.add(new ClassChampion("Băng quốc", R.drawable.glacial, new int[]{2, 4, 6},
                new int[]{R.drawable.glacial_bronze_icon, R.drawable.glacial_silver_icon,
                R.drawable.glacial_gold_icon}));
        listClassChampion.add(new ClassChampion("Nước", R.drawable.ocean, new int[]{2, 4, 6},
                new int[]{R.drawable.ocean_bronze_icon, R.drawable.ocean_silver_icon,
                R.drawable.ocean_gold_icon}));
        listClassChampion.add(new ClassChampion("Rừng", R.drawable.woodland, new int[]{3},
                new int[]{R.drawable.woodland_gold_icon}));
        listClassChampion.add(new ClassChampion("Lửa", R.drawable.inferno, new int[]{3, 6, 9},
                new int[]{R.drawable.inferno_bronze_icon, R.drawable.inferno_silver_icon,
                R.drawable.inferno_gold_icon}));
    }

    public static ArrayList<ClassChampion> getListClassChampion() {
        return listClassChampion;
    }

    public static ClassChampion getClassByIDIcon(int idIcon) {
        for (int i=0; i<listClassChampion.size(); i++) {
            ClassChampion temp=listClassChampion.get(i);
            if (temp.getIcon()==idIcon) return temp;
        }
        return null;
    }
}
