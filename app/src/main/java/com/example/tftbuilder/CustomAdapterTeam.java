package com.example.tftbuilder;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.List;

public class CustomAdapterTeam extends ArrayAdapter<Champion> {
    private Context context;
    private int resource;
    private List<Champion> championList;
    public CustomAdapterTeam(Context context, int resource, List<Champion> championList){
        super(context, resource, championList);
        this.context=context;
        this.resource=resource;
        this.championList=championList;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        ViewHolder viewHolder;
        if (convertView == null) {
            convertView = LayoutInflater.from(context).inflate(R.layout.row_listview_team, parent, false);
            viewHolder = new ViewHolder();
            viewHolder.imgChampion = (ImageView) convertView.findViewById(R.id.img_champion_t);
            viewHolder.tv_Name = (TextView) convertView.findViewById(R.id.tv_name_t);
            viewHolder.imgClass1 = (ImageView) convertView.findViewById(R.id.img_class1_t);
            viewHolder.tv_nameClass1= (TextView) convertView.findViewById(R.id.tv_name_class1_t);
            viewHolder.imgClass2 = (ImageView) convertView.findViewById(R.id.img_class2_t);
            viewHolder.tv_nameClass2= (TextView) convertView.findViewById(R.id.tv_name_class2_t);
            viewHolder.imgClass3 = (ImageView) convertView.findViewById(R.id.img_class3_t);
            viewHolder.tv_nameClass3= (TextView) convertView.findViewById(R.id.tv_name_class3_t);

            convertView.setTag(viewHolder);
        } else {
            viewHolder = (ViewHolder) convertView.getTag();
        }
        Champion champion = championList.get(position);
        viewHolder.imgChampion.setImageResource(champion.getIcon());
        viewHolder.tv_Name.setText(champion.getName());
        viewHolder.imgClass1.setImageResource(champion.getClassChampion().get(0).getIcon());
        viewHolder.tv_nameClass1.setText(champion.getClassChampion().get(0).getName());
        viewHolder.imgClass2.setImageResource(champion.getClassChampion().get(1).getIcon());
        viewHolder.tv_nameClass2.setText(champion.getClassChampion().get(1).getName());
        if (champion.getClassChampion().size()==3){
            viewHolder.imgClass3.setImageResource(champion.getClassChampion().get(2).getIcon());
            viewHolder.tv_nameClass3.setText(champion.getClassChampion().get(2).getName());
        }
        else{
            viewHolder.imgClass3.setImageResource(0);
            viewHolder.tv_nameClass3.setText("");
        }
        return convertView;
    }
    public class ViewHolder {
        ImageView imgChampion, imgClass1, imgClass2, imgClass3;
        TextView tv_Name, tv_nameClass1, tv_nameClass2, tv_nameClass3;
    }
}
