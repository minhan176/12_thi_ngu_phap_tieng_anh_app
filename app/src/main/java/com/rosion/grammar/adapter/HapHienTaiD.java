package com.rosion.grammar.adapter;

import android.content.Context;
import android.content.SharedPreferences;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.rosion.grammar.MyData;
import com.rosion.grammar.R;
import com.rosion.grammar.HienTaiD;

import static android.content.Context.MODE_PRIVATE;

public class HapHienTaiD extends RecyclerView.Adapter<HapHienTaiD.ViewHolder> {

    MyData[] myData;
    Context context;
    //Context ListAdapter context SharedPreferences
    public HapHienTaiD(MyData[] myData, HienTaiD activity){
        this.context = activity;
        this.myData = myData;
    }

    @NonNull
    @Override
    public HapHienTaiD.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater= LayoutInflater.from(parent.getContext());
        View view = layoutInflater.inflate(R.layout.htd_layout,parent,false);
        ViewHolder viewHolder = new ViewHolder(view);
        return viewHolder;
    }
    @Override
    public void onBindViewHolder(@NonNull HapHienTaiD.ViewHolder holder, int position) {
        final MyData myDataList = myData[position];
        holder.adapterHTTD.setText(myDataList.getName());

    }
    @Override
    public int getItemCount() {
        return myData.length;
    }

    public class ViewHolder extends RecyclerView.ViewHolder  {
        TextView textBT1, adapterHTTD;
        private TextView textHTD;
        LinearLayout hoanthanh1;
        private Button btHTD, btHTD1;

        public static final String SHARED_PREFS = "sharedPrefs";
        public static final String TEXT = "text";
        private String text;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            textHTD = itemView.findViewById(R.id.saveHTD);
            btHTD = itemView.findViewById(R.id.btHTD);
            textBT1 = itemView.findViewById(R.id.textBT1);
            hoanthanh1 = itemView.findViewById(R.id.hoanthanh1);
            btHTD1= itemView.findViewById(R.id.btHTD1);
            adapterHTTD = itemView.findViewById(R.id.adapterHTTD);

            btHTD.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    textHTD.setText("yes");
                    textBT1.setText("Đánh dấu chưa hoàn thành");
                    hoanthanh1.setVisibility(View.VISIBLE);
                    btHTD.setVisibility(View.INVISIBLE);
                    btHTD1.setVisibility(View.VISIBLE);
                    saveData();
                }
            });
            btHTD1.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    textHTD.setText("");
                    textBT1.setText("Đánh dấu đã hoàn thành");
                    hoanthanh1.setVisibility(View.INVISIBLE);
                    btHTD.setVisibility(View.VISIBLE);
                    btHTD1.setVisibility(View.INVISIBLE);
                    saveData();
                }
            });
            loadData();
            updateViews();
        }

        public void saveData() {
            SharedPreferences sharedPreferences = context.getSharedPreferences(SHARED_PREFS, MODE_PRIVATE);
            SharedPreferences.Editor editor = sharedPreferences.edit();
            editor.putString(TEXT, textHTD.getText().toString());
            //editor.putBoolean(SWITCH1, switch1.isChecked());
            editor.apply();
            //Toast.makeText(this, "MeData saved", Toast.LENGTH_SHORT).show();
        }

        public void loadData() {
            SharedPreferences sharedPreferences = context.getSharedPreferences(SHARED_PREFS, MODE_PRIVATE);
            text = sharedPreferences.getString(TEXT, "");
            //switchOnOff = sharedPreferences.getBoolean(SWITCH1, false);
        }

        public void updateViews() {
            textHTD.setText(text);
            if(textHTD.getText().toString().length() > 0){
                textBT1.setText("Đánh dấu chưa hoàn thành");
                hoanthanh1.setVisibility(View.VISIBLE);
                btHTD.setVisibility(View.INVISIBLE);
                btHTD1.setVisibility(View.VISIBLE);
            } else {
                textBT1.setText("Đánh dấu đã hoàn thành");
                hoanthanh1.setVisibility(View.INVISIBLE);
                btHTD.setVisibility(View.VISIBLE);
                btHTD1.setVisibility(View.INVISIBLE);
            }
            //switch1.setChecked(switchOnOff);
        }
    }
}
