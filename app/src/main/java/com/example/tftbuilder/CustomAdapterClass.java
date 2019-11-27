package com.example.tftbuilder;

import android.content.Context;
import android.graphics.Typeface;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.List;

public class CustomAdapterClass extends ArrayAdapter<ClassCount> {
    private Context context;
    private int resource;
    private List<ClassCount> classCountList;
    public CustomAdapterClass(Context context, int resource, List<ClassCount> classCountList){
        super(context, resource, classCountList);
        this.context=context;
        this.resource=resource;
        this.classCountList=classCountList;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        ViewHolder viewHolder;
        if (convertView == null) {
            convertView = LayoutInflater.from(context).inflate(R.layout.row_listview_class, parent, false);
            viewHolder = new ViewHolder();
            viewHolder.imgIconClass=convertView.findViewById(R.id.img_icon_class);
            viewHolder.tv_name_class=convertView.findViewById(R.id.tv_name_class);
            viewHolder.tv_num=convertView.findViewById(R.id.tv_num);
            viewHolder.tv_num1=convertView.findViewById(R.id.tv_num_1);
            viewHolder.tv_num2=convertView.findViewById(R.id.tv_num_2);
            viewHolder.tv_num3=convertView.findViewById(R.id.tv_num_3);
            convertView.setTag(viewHolder);
        } else {
            viewHolder = (ViewHolder) convertView.getTag();
        }
        ClassCount classCount = classCountList.get(position);
        ClassChampion classChampion=classCount.getClassChampion();

        viewHolder.imgIconClass.setImageResource(classCount.getIcon());
        viewHolder.tv_num.setText(Integer.toString(classCount.getCount()));
        viewHolder.tv_name_class.setText(classChampion.getName());
        viewHolder.tv_num1.setText(Integer.toString(classChampion.getBonus()[0]));
        if (classChampion.getBonus().length>=2)
            viewHolder.tv_num2.setText(Integer.toString(classChampion.getBonus()[1]));
        else viewHolder.tv_num2.setText("");
        if (classChampion.getBonus().length==3)
            viewHolder.tv_num3.setText(Integer.toString(classChampion.getBonus()[2]));
        else viewHolder.tv_num3.setText("");
        viewHolder.tv_num1.setTypeface(Typeface.defaultFromStyle(Typeface.NORMAL));
        viewHolder.tv_num2.setTypeface(Typeface.defaultFromStyle(Typeface.NORMAL));
        viewHolder.tv_num3.setTypeface(Typeface.defaultFromStyle(Typeface.NORMAL));
        if (classCount.getBonus()==0) viewHolder.tv_num1.setTypeface(Typeface.defaultFromStyle(Typeface.BOLD));
        else {
            if (classCount.getBonus()==1) viewHolder.tv_num2.setTypeface(Typeface.defaultFromStyle(Typeface.BOLD));
            else {
                if (classCount.getBonus()==2) viewHolder.tv_num3.setTypeface(Typeface.defaultFromStyle(Typeface.BOLD));
            }
        }
        return convertView;
    }
    public class ViewHolder {
        ImageView imgIconClass;
        TextView tv_num, tv_name_class, tv_num1, tv_num2, tv_num3;
    }
}
