package com.example.tftbuilder;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

public class ChooseChampionActivity extends AppCompatActivity {
    private ListView lvFullChampion;
    private ArrayList<Champion> listChampionChoose;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_choose_champion);
        lvFullChampion=findViewById(R.id.lv_full_champion);
        listChampionChoose=new ArrayList<Champion>();

        Intent intent=getIntent();
        int[] listTeam=intent.getIntArrayExtra("ListTeam");

        final ArrayList<Champion> listChampion=Champion.getListChampion();

        for (int i=0;i<listTeam.length;i++)
            listChampion.remove(Champion.getChampionByIDIcon(listTeam[i]));

        final CustomAdapterChoose customAdapterChoose=new CustomAdapterChoose(this, R.layout.row_listview_choose, listChampion);
        lvFullChampion.setAdapter(customAdapterChoose);
        lvFullChampion.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                if (customAdapterChoose.getChoose(i)) {
                    listChampionChoose.remove(listChampion.get(i));
                    customAdapterChoose.setChoose(i, false);
                    customAdapterChoose.notifyDataSetChanged();
                }
                else {
                    listChampionChoose.add(listChampion.get(i));
                    customAdapterChoose.setChoose(i, true);
                    customAdapterChoose.notifyDataSetChanged();
                }
            }
        });
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_choose, menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId()){
            case android.R.id.home:
                onBackPressed();
                return true;
            case R.id.ic_check:
                Intent intent=new Intent();
                int[] listChampionID=new int[listChampionChoose.size()];
                for (int i=0;i<listChampionChoose.size();i++)
                    listChampionID[i]=listChampionChoose.get(i).getIcon();
                intent.putExtra("ListChoose", listChampionID);
                ChooseChampionActivity.this.setResult(Activity.RESULT_OK, intent);
                super.finish();
                return true;
        }
        return super.onOptionsItemSelected(item);
    }
}
