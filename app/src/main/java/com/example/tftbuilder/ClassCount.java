package com.example.tftbuilder;

public class ClassCount {
    private ClassChampion classChampion;
    private int count;
    public ClassCount(ClassChampion classChampion, int count){
        this.classChampion=classChampion;
        this.count=count;
    }

    public ClassChampion getClassChampion() {
        return classChampion;
    }

    public int getCount() {
        return count;
    }

    public int getBonus() {
        int i;
        for (i=classChampion.getBonus().length-1; i>-1; i--){
            if (count>=classChampion.getBonus()[i]) break;
        }
        return i;
    }

    public int getIcon() {
        if (getBonus()==-1) return classChampion.getIcon();
        return classChampion.getIcon_bonus()[getBonus()];
    }

    public void addCount() {
        count++;
    }

    public int getBonusRank() {
        int idBonus=getBonus();
        if (idBonus==-1) return 0;
        if (idBonus==2) return 3;
        if (idBonus==1&&classChampion.getBonus().length==2) return 3;
        if (idBonus==0&&classChampion.getBonus().length==1) return 3;
        if (idBonus==0) return 1;
        return 2;
    }
}
