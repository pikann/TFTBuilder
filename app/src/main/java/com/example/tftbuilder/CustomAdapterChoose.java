package com.example.tftbuilder;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.List;

public class CustomAdapterChoose extends ArrayAdapter<Champion> {
    private Context context;
    private int resource;
    private List<Champion> championList;
    private boolean[] choose;
    public CustomAdapterChoose(Context context, int resource, List<Champion> championList){
        super(context, resource, championList);
        this.context=context;
        this.resource=resource;
        this.championList=championList;
        this.choose=new boolean[this.championList.size()];
        for (int i=0;i<this.championList.size();i++) this.choose[i]=false;
    }

    public void setChoose(int i, boolean boo) {
        choose[i]=boo;
    }

    public boolean[] getChoose() {
        return choose;
    }

    public boolean getChoose(int i) {
        return choose[i];
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        ViewHolder viewHolder;
        if (convertView == null) {
            convertView = LayoutInflater.from(context).inflate(R.layout.row_listview_choose, parent, false);
            viewHolder = new ViewHolder();
            viewHolder.imgChampion = (ImageView) convertView.findViewById(R.id.img_champion);
            viewHolder.tv_Name = (TextView) convertView.findViewById(R.id.tv_name);
            viewHolder.imgClass1 = (ImageView) convertView.findViewById(R.id.img_class1);
            viewHolder.tv_nameClass1= (TextView) convertView.findViewById(R.id.tv_name_class1);
            viewHolder.imgClass2 = (ImageView) convertView.findViewById(R.id.img_class2);
            viewHolder.tv_nameClass2= (TextView) convertView.findViewById(R.id.tv_name_class2);
            viewHolder.imgClass3 = (ImageView) convertView.findViewById(R.id.img_class3);
            viewHolder.tv_nameClass3= (TextView) convertView.findViewById(R.id.tv_name_class3);
            viewHolder.ll_choose= (LinearLayout) convertView.findViewById(R.id.ll_choose);

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
        if (this.choose[position]==true)
            viewHolder.ll_choose.setBackgroundColor(convertView.getResources().getColor(R.color.colorAccent));
        else
            viewHolder.ll_choose.setBackgroundColor(convertView.getResources().getColor(R.color.colorPrimary));
        return convertView;
    }
    public class ViewHolder {
        ImageView imgChampion, imgClass1, imgClass2, imgClass3;
        TextView tv_Name, tv_nameClass1, tv_nameClass2, tv_nameClass3;
        LinearLayout ll_choose;
    }
}
