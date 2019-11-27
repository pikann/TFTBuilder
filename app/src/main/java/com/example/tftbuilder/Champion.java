package com.example.tftbuilder;
import java.util.ArrayList;

public class Champion {
    private String name;
    private int icon;
    private ArrayList<ClassChampion> classChampion;
    private static ArrayList<Champion> listChampion;

    public Champion(String name, int icon, ArrayList<ClassChampion> classChampion){
        this.name=name;
        this.icon=icon;
        this.classChampion=classChampion;
    }

    public String getName() {
        return name;
    }

    public int getIcon() {
        return icon;
    }

    public ArrayList<ClassChampion> getClassChampion() {
        return classChampion;
    }

    public static void setListChampion() {
        listChampion=new ArrayList<Champion>();

        ArrayList<ClassChampion> tempClass=new ArrayList<ClassChampion>();
        tempClass.add(ClassChampion.getClassByIDIcon(R.drawable.light));
        tempClass.add(ClassChampion.getClassByIDIcon(R.drawable.blademaster));
        listChampion.add(new Champion("Aatrox", R.drawable.aatrox, tempClass));

        tempClass=new ArrayList<ClassChampion>();
        tempClass.add(ClassChampion.getClassByIDIcon(R.drawable.inferno));
        tempClass.add(ClassChampion.getClassByIDIcon(R.drawable.summoner));
        listChampion.add(new Champion("Annie", R.drawable.annie, tempClass));

        tempClass=new ArrayList<ClassChampion>();
        tempClass.add(ClassChampion.getClassByIDIcon(R.drawable.crystal));
        tempClass.add(ClassChampion.getClassByIDIcon(R.drawable.ranger));
        listChampion.add(new Champion("Ashe", R.drawable.ashe, tempClass));

        tempClass=new ArrayList<ClassChampion>();
        tempClass.add(ClassChampion.getClassByIDIcon(R.drawable.desert));
        tempClass.add(ClassChampion.getClassByIDIcon(R.drawable.summoner));
        listChampion.add(new Champion("Azir", R.drawable.azir, tempClass));

        tempClass=new ArrayList<ClassChampion>();
        tempClass.add(ClassChampion.getClassByIDIcon(R.drawable.inferno));
        tempClass.add(ClassChampion.getClassByIDIcon(R.drawable.mage));
        listChampion.add(new Champion("Brand", R.drawable.brand, tempClass));

        tempClass=new ArrayList<ClassChampion>();
        tempClass.add(ClassChampion.getClassByIDIcon(R.drawable.glacial));
        tempClass.add(ClassChampion.getClassByIDIcon(R.drawable.warden));
        listChampion.add(new Champion("Braum", R.drawable.braum, tempClass));

        tempClass=new ArrayList<ClassChampion>();
        tempClass.add(ClassChampion.getClassByIDIcon(R.drawable.inferno));
        tempClass.add(ClassChampion.getClassByIDIcon(R.drawable.assassin));
        listChampion.add(new Champion("Diana", R.drawable.diana, tempClass));

        tempClass=new ArrayList<ClassChampion>();
        tempClass.add(ClassChampion.getClassByIDIcon(R.drawable.poison));
        tempClass.add(ClassChampion.getClassByIDIcon(R.drawable.berserker));
        listChampion.add(new Champion("Dr Mundo", R.drawable.drmundo, tempClass));

        tempClass=new ArrayList<ClassChampion>();
        tempClass.add(ClassChampion.getClassByIDIcon(R.drawable.glacial));
        tempClass.add(ClassChampion.getClassByIDIcon(R.drawable.ranger));
        listChampion.add(new Champion("Ezreal", R.drawable.ezreal, tempClass));

        tempClass=new ArrayList<ClassChampion>();
        tempClass.add(ClassChampion.getClassByIDIcon(R.drawable.woodland));
        tempClass.add(ClassChampion.getClassByIDIcon(R.drawable.druid));
        listChampion.add(new Champion("Ivern", R.drawable.ivern, tempClass));

        tempClass=new ArrayList<ClassChampion>();
        tempClass.add(ClassChampion.getClassByIDIcon(R.drawable.cloud));
        tempClass.add(ClassChampion.getClassByIDIcon(R.drawable.mystic));
        listChampion.add(new Champion("Janna", R.drawable.janna, tempClass));

        tempClass=new ArrayList<ClassChampion>();
        tempClass.add(ClassChampion.getClassByIDIcon(R.drawable.light));
        tempClass.add(ClassChampion.getClassByIDIcon(R.drawable.berserker));
        listChampion.add(new Champion("Jax", R.drawable.jax, tempClass));

        tempClass=new ArrayList<ClassChampion>();
        tempClass.add(ClassChampion.getClassByIDIcon(R.drawable.desert));
        tempClass.add(ClassChampion.getClassByIDIcon(R.drawable.assassin));
        listChampion.add(new Champion("Khazix", R.drawable.khazix, tempClass));

        tempClass=new ArrayList<ClassChampion>();
        tempClass.add(ClassChampion.getClassByIDIcon(R.drawable.shadow));
        tempClass.add(ClassChampion.getClassByIDIcon(R.drawable.inferno));
        tempClass.add(ClassChampion.getClassByIDIcon(R.drawable.ranger));
        listChampion.add(new Champion("Kindred", R.drawable.kindred, tempClass));

        tempClass=new ArrayList<ClassChampion>();
        tempClass.add(ClassChampion.getClassByIDIcon(R.drawable.poison));
        tempClass.add(ClassChampion.getClassByIDIcon(R.drawable.predator));
        listChampion.add(new Champion("Kog'Maw", R.drawable.kogmaw, tempClass));

        tempClass=new ArrayList<ClassChampion>();
        tempClass.add(ClassChampion.getClassByIDIcon(R.drawable.woodland));
        tempClass.add(ClassChampion.getClassByIDIcon(R.drawable.mage));
        tempClass.add(ClassChampion.getClassByIDIcon(R.drawable.assassin));
        listChampion.add(new Champion("LeBlanc", R.drawable.leblanc, tempClass));

        tempClass=new ArrayList<ClassChampion>();
        tempClass.add(ClassChampion.getClassByIDIcon(R.drawable.cloud));
        tempClass.add(ClassChampion.getClassByIDIcon(R.drawable.avatar));
        listChampion.add(new Champion("Lux gió", R.drawable.luxcloud, tempClass));

        tempClass=new ArrayList<ClassChampion>();
        tempClass.add(ClassChampion.getClassByIDIcon(R.drawable.crystal));
        tempClass.add(ClassChampion.getClassByIDIcon(R.drawable.avatar));
        listChampion.add(new Champion("Lux ngọc", R.drawable.luxcrystal, tempClass));

        tempClass=new ArrayList<ClassChampion>();
        tempClass.add(ClassChampion.getClassByIDIcon(R.drawable.electric));
        tempClass.add(ClassChampion.getClassByIDIcon(R.drawable.avatar));
        listChampion.add(new Champion("Lux sét", R.drawable.luxelectric, tempClass));

        tempClass=new ArrayList<ClassChampion>();
        tempClass.add(ClassChampion.getClassByIDIcon(R.drawable.glacial));
        tempClass.add(ClassChampion.getClassByIDIcon(R.drawable.avatar));
        listChampion.add(new Champion("Lux băng quốc", R.drawable.luxglacial, tempClass));

        tempClass=new ArrayList<ClassChampion>();
        tempClass.add(ClassChampion.getClassByIDIcon(R.drawable.inferno));
        tempClass.add(ClassChampion.getClassByIDIcon(R.drawable.avatar));
        listChampion.add(new Champion("Lux lửa", R.drawable.luxinferno, tempClass));

        tempClass=new ArrayList<ClassChampion>();
        tempClass.add(ClassChampion.getClassByIDIcon(R.drawable.light));
        tempClass.add(ClassChampion.getClassByIDIcon(R.drawable.avatar));
        listChampion.add(new Champion("Lux ánh sáng", R.drawable.luxlight, tempClass));

        tempClass=new ArrayList<ClassChampion>();
        tempClass.add(ClassChampion.getClassByIDIcon(R.drawable.ocean));
        tempClass.add(ClassChampion.getClassByIDIcon(R.drawable.avatar));
        listChampion.add(new Champion("Lux nước", R.drawable.luxocean, tempClass));

        tempClass=new ArrayList<ClassChampion>();
        tempClass.add(ClassChampion.getClassByIDIcon(R.drawable.shadow));
        tempClass.add(ClassChampion.getClassByIDIcon(R.drawable.avatar));
        listChampion.add(new Champion("Lux bóng tối", R.drawable.luxshadow, tempClass));

        tempClass=new ArrayList<ClassChampion>();
        tempClass.add(ClassChampion.getClassByIDIcon(R.drawable.steel));
        tempClass.add(ClassChampion.getClassByIDIcon(R.drawable.avatar));
        listChampion.add(new Champion("Lux thép", R.drawable.luxsteel, tempClass));

        tempClass=new ArrayList<ClassChampion>();
        tempClass.add(ClassChampion.getClassByIDIcon(R.drawable.woodland));
        tempClass.add(ClassChampion.getClassByIDIcon(R.drawable.avatar));
        listChampion.add(new Champion("Lux rừng", R.drawable.luxwoodland, tempClass));

        tempClass=new ArrayList<ClassChampion>();
        tempClass.add(ClassChampion.getClassByIDIcon(R.drawable.mountain));
        tempClass.add(ClassChampion.getClassByIDIcon(R.drawable.warden));
        listChampion.add(new Champion("Malphite", R.drawable.malphite, tempClass));

        tempClass=new ArrayList<ClassChampion>();
        tempClass.add(ClassChampion.getClassByIDIcon(R.drawable.shadow));
        tempClass.add(ClassChampion.getClassByIDIcon(R.drawable.summoner));
        listChampion.add(new Champion("Malzahar", R.drawable.malzahar, tempClass));

        tempClass=new ArrayList<ClassChampion>();
        tempClass.add(ClassChampion.getClassByIDIcon(R.drawable.woodland));
        tempClass.add(ClassChampion.getClassByIDIcon(R.drawable.druid));
        listChampion.add(new Champion("Maokai", R.drawable.maokai, tempClass));

        tempClass=new ArrayList<ClassChampion>();
        tempClass.add(ClassChampion.getClassByIDIcon(R.drawable.shadow));
        tempClass.add(ClassChampion.getClassByIDIcon(R.drawable.mystic));
        tempClass.add(ClassChampion.getClassByIDIcon(R.drawable.blademaster));
        listChampion.add(new Champion("Master Yi", R.drawable.masteryi, tempClass));

        tempClass=new ArrayList<ClassChampion>();
        tempClass.add(ClassChampion.getClassByIDIcon(R.drawable.ocean));
        tempClass.add(ClassChampion.getClassByIDIcon(R.drawable.mystic));
        listChampion.add(new Champion("Nami", R.drawable.nami, tempClass));

        tempClass=new ArrayList<ClassChampion>();
        tempClass.add(ClassChampion.getClassByIDIcon(R.drawable.light));
        tempClass.add(ClassChampion.getClassByIDIcon(R.drawable.warden));
        listChampion.add(new Champion("Nasus", R.drawable.nasus, tempClass));

        tempClass=new ArrayList<ClassChampion>();
        tempClass.add(ClassChampion.getClassByIDIcon(R.drawable.ocean));
        tempClass.add(ClassChampion.getClassByIDIcon(R.drawable.warden));
        listChampion.add(new Champion("Nautilus", R.drawable.nautilus, tempClass));

        tempClass=new ArrayList<ClassChampion>();
        tempClass.add(ClassChampion.getClassByIDIcon(R.drawable.woodland));
        tempClass.add(ClassChampion.getClassByIDIcon(R.drawable.druid));
        listChampion.add(new Champion("Neeko", R.drawable.neeko, tempClass));

        tempClass=new ArrayList<ClassChampion>();
        tempClass.add(ClassChampion.getClassByIDIcon(R.drawable.steel));
        tempClass.add(ClassChampion.getClassByIDIcon(R.drawable.assassin));
        listChampion.add(new Champion("Nocturne", R.drawable.nocturne, tempClass));

        tempClass=new ArrayList<ClassChampion>();
        tempClass.add(ClassChampion.getClassByIDIcon(R.drawable.glacial));
        tempClass.add(ClassChampion.getClassByIDIcon(R.drawable.berserker));
        listChampion.add(new Champion("Olaf", R.drawable.olaf, tempClass));

        tempClass=new ArrayList<ClassChampion>();
        tempClass.add(ClassChampion.getClassByIDIcon(R.drawable.electric));
        tempClass.add(ClassChampion.getClassByIDIcon(R.drawable.warden));
        listChampion.add(new Champion("Ornn", R.drawable.ornn, tempClass));

        tempClass=new ArrayList<ClassChampion>();
        tempClass.add(ClassChampion.getClassByIDIcon(R.drawable.cloud));
        tempClass.add(ClassChampion.getClassByIDIcon(R.drawable.assassin));
        listChampion.add(new Champion("Qiyana gió", R.drawable.qiyanacloud, tempClass));

        tempClass=new ArrayList<ClassChampion>();
        tempClass.add(ClassChampion.getClassByIDIcon(R.drawable.inferno));
        tempClass.add(ClassChampion.getClassByIDIcon(R.drawable.assassin));
        listChampion.add(new Champion("Qiyana lửa", R.drawable.qiyanainferno, tempClass));

        tempClass=new ArrayList<ClassChampion>();
        tempClass.add(ClassChampion.getClassByIDIcon(R.drawable.mountain));
        tempClass.add(ClassChampion.getClassByIDIcon(R.drawable.assassin));
        listChampion.add(new Champion("Qiyana đất", R.drawable.qiyanamountain, tempClass));

        tempClass=new ArrayList<ClassChampion>();
        tempClass.add(ClassChampion.getClassByIDIcon(R.drawable.ocean));
        tempClass.add(ClassChampion.getClassByIDIcon(R.drawable.assassin));
        listChampion.add(new Champion("Qiyana nước", R.drawable.qiyanaocean, tempClass));

        tempClass=new ArrayList<ClassChampion>();
        tempClass.add(ClassChampion.getClassByIDIcon(R.drawable.steel));
        tempClass.add(ClassChampion.getClassByIDIcon(R.drawable.predator));
        listChampion.add(new Champion("Rek'Sai", R.drawable.reksai, tempClass));

        tempClass=new ArrayList<ClassChampion>();
        tempClass.add(ClassChampion.getClassByIDIcon(R.drawable.desert));
        tempClass.add(ClassChampion.getClassByIDIcon(R.drawable.berserker));
        listChampion.add(new Champion("Renekton", R.drawable.renekton, tempClass));

        tempClass=new ArrayList<ClassChampion>();
        tempClass.add(ClassChampion.getClassByIDIcon(R.drawable.poison));
        tempClass.add(ClassChampion.getClassByIDIcon(R.drawable.alchemist));
        listChampion.add(new Champion("Singed", R.drawable.singed, tempClass));

        tempClass=new ArrayList<ClassChampion>();
        tempClass.add(ClassChampion.getClassByIDIcon(R.drawable.shadow));
        tempClass.add(ClassChampion.getClassByIDIcon(R.drawable.berserker));
        listChampion.add(new Champion("Sion", R.drawable.sion, tempClass));

        tempClass=new ArrayList<ClassChampion>();
        tempClass.add(ClassChampion.getClassByIDIcon(R.drawable.desert));
        tempClass.add(ClassChampion.getClassByIDIcon(R.drawable.blademaster));
        listChampion.add(new Champion("Sivir", R.drawable.sivir, tempClass));

        tempClass=new ArrayList<ClassChampion>();
        tempClass.add(ClassChampion.getClassByIDIcon(R.drawable.crystal));
        tempClass.add(ClassChampion.getClassByIDIcon(R.drawable.predator));
        listChampion.add(new Champion("Skarner", R.drawable.skarner, tempClass));

        tempClass=new ArrayList<ClassChampion>();
        tempClass.add(ClassChampion.getClassByIDIcon(R.drawable.light));
        tempClass.add(ClassChampion.getClassByIDIcon(R.drawable.mystic));
        listChampion.add(new Champion("Soraka", R.drawable.soraka, tempClass));

        tempClass=new ArrayList<ClassChampion>();
        tempClass.add(ClassChampion.getClassByIDIcon(R.drawable.ocean));
        tempClass.add(ClassChampion.getClassByIDIcon(R.drawable.mage));
        listChampion.add(new Champion("Syndra", R.drawable.syndra, tempClass));

        tempClass=new ArrayList<ClassChampion>();
        tempClass.add(ClassChampion.getClassByIDIcon(R.drawable.mountain));
        tempClass.add(ClassChampion.getClassByIDIcon(R.drawable.mage));
        listChampion.add(new Champion("Taliyah", R.drawable.taliyah, tempClass));

        tempClass=new ArrayList<ClassChampion>();
        tempClass.add(ClassChampion.getClassByIDIcon(R.drawable.crystal));
        tempClass.add(ClassChampion.getClassByIDIcon(R.drawable.warden));
        listChampion.add(new Champion("Taric", R.drawable.taric, tempClass));

        tempClass=new ArrayList<ClassChampion>();
        tempClass.add(ClassChampion.getClassByIDIcon(R.drawable.ocean));
        tempClass.add(ClassChampion.getClassByIDIcon(R.drawable.warden));
        listChampion.add(new Champion("Thresh", R.drawable.thresh, tempClass));

        tempClass=new ArrayList<ClassChampion>();
        tempClass.add(ClassChampion.getClassByIDIcon(R.drawable.poison));
        tempClass.add(ClassChampion.getClassByIDIcon(R.drawable.ranger));
        listChampion.add(new Champion("Twitch", R.drawable.twitch, tempClass));

        tempClass=new ArrayList<ClassChampion>();
        tempClass.add(ClassChampion.getClassByIDIcon(R.drawable.inferno));
        tempClass.add(ClassChampion.getClassByIDIcon(R.drawable.ranger));
        listChampion.add(new Champion("Varus", R.drawable.varus, tempClass));

        tempClass=new ArrayList<ClassChampion>();
        tempClass.add(ClassChampion.getClassByIDIcon(R.drawable.light));
        tempClass.add(ClassChampion.getClassByIDIcon(R.drawable.ranger));
        listChampion.add(new Champion("Vayne", R.drawable.vayne, tempClass));

        tempClass=new ArrayList<ClassChampion>();
        tempClass.add(ClassChampion.getClassByIDIcon(R.drawable.shadow));
        tempClass.add(ClassChampion.getClassByIDIcon(R.drawable.mage));
        listChampion.add(new Champion("Veigar", R.drawable.veigar, tempClass));

        tempClass=new ArrayList<ClassChampion>();
        tempClass.add(ClassChampion.getClassByIDIcon(R.drawable.ocean));
        tempClass.add(ClassChampion.getClassByIDIcon(R.drawable.mage));
        listChampion.add(new Champion("Vladimir", R.drawable.vladimir, tempClass));

        tempClass=new ArrayList<ClassChampion>();
        tempClass.add(ClassChampion.getClassByIDIcon(R.drawable.glacial));
        tempClass.add(ClassChampion.getClassByIDIcon(R.drawable.electric));
        tempClass.add(ClassChampion.getClassByIDIcon(R.drawable.berserker));
        listChampion.add(new Champion("Volibear", R.drawable.volibear, tempClass));

        tempClass=new ArrayList<ClassChampion>();
        tempClass.add(ClassChampion.getClassByIDIcon(R.drawable.glacial));
        tempClass.add(ClassChampion.getClassByIDIcon(R.drawable.predator));
        listChampion.add(new Champion("Warwick", R.drawable.warwick, tempClass));

        tempClass=new ArrayList<ClassChampion>();
        tempClass.add(ClassChampion.getClassByIDIcon(R.drawable.cloud));
        tempClass.add(ClassChampion.getClassByIDIcon(R.drawable.blademaster));
        listChampion.add(new Champion("Yasuo", R.drawable.yasuo, tempClass));

        tempClass=new ArrayList<ClassChampion>();
        tempClass.add(ClassChampion.getClassByIDIcon(R.drawable.light));
        tempClass.add(ClassChampion.getClassByIDIcon(R.drawable.summoner));
        listChampion.add(new Champion("Yorick", R.drawable.yorick, tempClass));

        tempClass=new ArrayList<ClassChampion>();
        tempClass.add(ClassChampion.getClassByIDIcon(R.drawable.electric));
        tempClass.add(ClassChampion.getClassByIDIcon(R.drawable.assassin));
        tempClass.add(ClassChampion.getClassByIDIcon(R.drawable.summoner));
        listChampion.add(new Champion("Zed", R.drawable.zed, tempClass));

        tempClass=new ArrayList<ClassChampion>();
        tempClass.add(ClassChampion.getClassByIDIcon(R.drawable.inferno));
        tempClass.add(ClassChampion.getClassByIDIcon(R.drawable.summoner));
        listChampion.add(new Champion("Zyra", R.drawable.zyra, tempClass));
    }

    public static ArrayList<Champion> getListChampion() {
        return listChampion;
    }

    public static Champion getChampionByName(String name) {
        for (int i=0; i<listChampion.size(); i++) {
            Champion temp=listChampion.get(i);
            if (temp.getName().equals(name)) return temp;
        }
        return null;
    }

    public static Champion getChampionByIDIcon(int idIcon) {
        for (int i=0; i<listChampion.size(); i++) {
            Champion temp=listChampion.get(i);
            if (temp.getIcon()==idIcon) return temp;
        }
        return null;
    }
}
