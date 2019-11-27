package com.example.tftbuilder;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.Collections;

public class TeamActivity extends AppCompatActivity {
    private Button btn_add;
    private ListView lv_team;
    private ListView lv_class;
    private ArrayList<Champion> listChampion;
    private CustomAdapterTeam customAdapterTeam;
    private ArrayList<ClassCount> listClassCount;
    private CustomAdapterClass customAdapterClass;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_team);
        btn_add=findViewById(R.id.btn_add);
        lv_team=findViewById(R.id.lv_team);
        lv_class=findViewById(R.id.lv_class);
        listChampion=new ArrayList<Champion>();

        customAdapterTeam=new CustomAdapterTeam(this, R.layout.row_listview_team, this.listChampion);
        lv_team.setAdapter(customAdapterTeam);

        listClassCount=new ArrayList<ClassCount>();
        customAdapterClass=new CustomAdapterClass(this, R.layout.row_listview_class, this.listClassCount);
        lv_class.setAdapter(customAdapterClass);

        btn_add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(TeamActivity.this, ChooseChampionActivity.class);
                int[] listChampionID=new int[listChampion.size()];
                for (int i=0;i<listChampion.size();i++)
                    listChampionID[i]=listChampion.get(i).getIcon();
                intent.putExtra("ListTeam", listChampionID);
                startActivityForResult(intent, 100);
            }
        });
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        if (resultCode== Activity.RESULT_OK&&requestCode==100){
            int[] listChoose=data.getIntArrayExtra("ListChoose");
            for (int i=0;i<listChoose.length;i++)
                listChampion.add(Champion.getChampionByIDIcon(listChoose[i]));
            customAdapterTeam.notifyDataSetChanged();
            TeamActivity.this.setListClassChampion();
            Collections.sort(listClassCount, new CustomComparator());
            customAdapterClass.notifyDataSetChanged();
        }
        super.onActivityResult(requestCode, resultCode, data);
    }

    private void setListClassChampion() {
        listClassCount.clear();
        for (int i=0;i<listChampion.size();i++)
            for (int j=0;j<listChampion.get(i).getClassChampion().size();j++) {
                ClassChampion classChampion=listChampion.get(i).getClassChampion().get(j);
                boolean daco=false;
                for (int k=0;k<listClassCount.size();k++){
                    if (listClassCount.get(k).getClassChampion().getIcon()==classChampion.getIcon()){
                        listClassCount.get(k).addCount();
                        daco=true;
                        break;
                    }
                }
                if (daco==false) listClassCount.add(new ClassCount(classChampion, 1));
            }
    }


}
