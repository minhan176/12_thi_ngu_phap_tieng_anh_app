package com.rosion.grammar.adapter;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.Color;
import android.text.Editable;
import android.text.TextWatcher;
import android.transition.AutoTransition;
import android.transition.TransitionManager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

import com.rosion.grammar.HienTaiTD;
import com.rosion.grammar.HomeActivity;
import com.rosion.grammar.LuyenTapBa;
import com.rosion.grammar.LuyenTapHai;
import com.rosion.grammar.LuyenTapMot;
import com.rosion.grammar.LuyenTapMuoi;
import com.rosion.grammar.MainActivity;
import com.rosion.grammar.MyData;
import com.rosion.grammar.R;

import static android.content.Context.MODE_PRIVATE;

public class LTapMuoi extends RecyclerView.Adapter<LTapMuoi.ViewHolder> {

    MyData[] myData;
    Context context;
    //Context ListAdapter context SharedPreferences
    public LTapMuoi(MyData[] myData, LuyenTapMuoi activity){
        this.context = activity;
        this.myData = myData;
    }

    @NonNull
    @Override
    public LTapMuoi.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater= LayoutInflater.from(parent.getContext());
        View view = layoutInflater.inflate(R.layout.layout_muoi,parent,false);
        ViewHolder viewHolder = new ViewHolder(view);
        return viewHolder;
    }
    @Override
    public void onBindViewHolder(@NonNull LTapMuoi.ViewHolder holder, int position) {
        final MyData myDataList = myData[position];
        holder.adapterHTD.setText(myDataList.getName());

    }
    @Override
    public int getItemCount() {
        return myData.length;
    }

    public class ViewHolder extends RecyclerView.ViewHolder  {
        TextView textBT1,textBT2, adapterHTD, count, true1, true2, true3, true4, true5, true6, true7, true8, true9, true10,true11, true12, true13, true14, true15, true16, true17, true18, true19, true20,true21, true22,true23, true24, dat, so_cau;
        private TextView textHTD, thu1,loigiai1, thu2, loigiai2, thu3, loigiai3, thu4, loigiai4, thu5, loigiai5, thu6, loigiai6, thu7, loigiai7, thu8, loigiai8, thu9, loigiai9, thu10, loigiai10, thu11, loigiai11, thu12, loigiai12,  thu13, loigiai13, thu14, loigiai14, thu15, loigiai15, thu16, loigiai16, thu17, loigiai17, thu18, loigiai18, thu19, loigiai19, thu20, loigiai20, thu21, loigiai21, thu22, loigiai22, thu23,loigiai23, thu24, loigiai24;
        LinearLayout hoanthanh1, not_hoanthanh;
        private Button btHTD, btHTD1, visible1, visible2, visible3, visible4, visible5, visible6, visible7, visible8, visible9, visible10, visible11, visible12, visible13, visible14, visible15, visible16, visible17, visible18, visible19, visible20, visible21, visible22, visible23, visible24;
        RadioButton radio1a, radio1b, radio1c, radio1d,
                radio2a, radio2b, radio2c, radio2d,
                radio3a, radio3b, radio3c, radio3d,
                radio4a, radio4b, radio4c, radio4d,
                radio5a, radio5b, radio5c, radio5d,
                radio6a, radio6b, radio6c, radio6d,
                radio7a, radio7b, radio7c, radio7d,
                radio8a, radio8b, radio8c, radio8d,
                radio9a, radio9b, radio9c, radio9d,
                radio10a, radio10b, radio10c, radio10d,
                radio11a, radio11b, radio11c, radio11d,
                radio12a, radio12b, radio12c, radio12d,
                radio13a, radio13b, radio13c, radio13d,
                radio14a, radio14b, radio14c, radio14d,
                radio15a, radio15b, radio15c, radio15d,
                radio16a, radio16b, radio16c, radio16d,
                radio17a, radio17b, radio17c, radio17d,
                radio18a, radio18b, radio18c, radio18d,
                radio19a, radio19b, radio19c, radio19d,
                radio20a, radio20b, radio20c, radio20d,
                radio21a, radio21b, radio21c, radio21d,
                radio22a, radio22b, radio22c, radio22d,
                        radio23a, radio23b, radio23c, radio23d,
                  radio24a, radio24b, radio24c, radio24d;
        LinearLayout expandableView, expandableView2,expandableView3, expandableView4,expandableView5, expandableView6,expandableView7, expandableView8,expandableView9, expandableView10,expandableView11, expandableView12,expandableView13, expandableView14,expandableView15, expandableView16,expandableView17, expandableView18,expandableView19, expandableView20,expandableView21, expandableView22, expandableView23, expandableView24;
        CardView cardView, cardView2,cardView3, cardView4,cardView5, cardView6,cardView7, cardView8,cardView9, cardView10,cardView11, cardView12,cardView13, cardView14,cardView15, cardView16,cardView17, cardView18,cardView19, cardView20,cardView21, cardView22, cardView23, cardView24;
        private int n = 0;
        public static final String TEXT = "text";
        private String text;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            textHTD = itemView.findViewById(R.id.saveHTD);
            btHTD = itemView.findViewById(R.id.btHTD);
            textBT1 = itemView.findViewById(R.id.textBT1);
            textBT2 = itemView.findViewById(R.id.textBT2);
            hoanthanh1 = itemView.findViewById(R.id.hoanthanh1);
            not_hoanthanh = itemView.findViewById(R.id.not_hoanthanh);
            btHTD1= itemView.findViewById(R.id.btHTD1);
            adapterHTD = itemView.findViewById(R.id.adapterHTTD);
            dat = itemView.findViewById(R.id.dat);
            so_cau = itemView.findViewById(R.id.so_cau);

            /*textBT1.addTextChangedListener(myTextWatcher);
            btHTD.addTextChangedListener(myTextWatcher);
            btHTD1.addTextChangedListener(myTextWatcher);
            so_cau.addTextChangedListener(myTextWatcher);
            count.addTextChangedListener(myTextWatcher);
            dat.addTextChangedListener(myTextWatcher);*/

            radio1a = itemView.findViewById(R.id.radio1a);
            radio1b = itemView.findViewById(R.id.radio1b);
            radio1c = itemView.findViewById(R.id.radio1c);
            radio1d = itemView.findViewById(R.id.radio1d);
            visible1 = itemView.findViewById(R.id.visible1);
            true1 = itemView.findViewById(R.id.true1);
            expandableView = itemView.findViewById(R.id.expandableView);
            cardView = itemView.findViewById(R.id.cardView);
            thu1 = itemView.findViewById(R.id.thu1);
            loigiai1 = itemView.findViewById(R.id.loigiai1);

            radio2a = itemView.findViewById(R.id.radio2a);
            radio2b = itemView.findViewById(R.id.radio2b);
            radio2c = itemView.findViewById(R.id.radio2c);
            radio2d = itemView.findViewById(R.id.radio2d);
            visible2 = itemView.findViewById(R.id.visible2);
            true2 = itemView.findViewById(R.id.true2);
            expandableView2 = itemView.findViewById(R.id.expandableView2);
            cardView2 = itemView.findViewById(R.id.cardView2);
            thu2 = itemView.findViewById(R.id.thu2);
            loigiai2 = itemView.findViewById(R.id.loigiai2);

            radio3a = itemView.findViewById(R.id.radio3a);
            radio3b = itemView.findViewById(R.id.radio3b);
            radio3c = itemView.findViewById(R.id.radio3c);
            radio3d = itemView.findViewById(R.id.radio3d);
            visible3 = itemView.findViewById(R.id.visible3);
            true3 = itemView.findViewById(R.id.true3);
            expandableView3 = itemView.findViewById(R.id.expandableView3);
            cardView3 = itemView.findViewById(R.id.cardView3);
            thu3 = itemView.findViewById(R.id.thu3);
            loigiai3 = itemView.findViewById(R.id.loigiai3);

            radio4a = itemView.findViewById(R.id.radio4a);
            radio4b = itemView.findViewById(R.id.radio4b);
            radio4c = itemView.findViewById(R.id.radio4c);
            radio4d = itemView.findViewById(R.id.radio4d);
            visible4 = itemView.findViewById(R.id.visible4);
            true4 = itemView.findViewById(R.id.true4);
            expandableView4 = itemView.findViewById(R.id.expandableView4);
            cardView4 = itemView.findViewById(R.id.cardView4);
            thu4 = itemView.findViewById(R.id.thu4);
            loigiai4 = itemView.findViewById(R.id.loigiai4);

            radio5a = itemView.findViewById(R.id.radio5a);
            radio5b = itemView.findViewById(R.id.radio5b);
            radio5c = itemView.findViewById(R.id.radio5c);
            radio5d = itemView.findViewById(R.id.radio5d);
            visible5 = itemView.findViewById(R.id.visible5);
            true5 = itemView.findViewById(R.id.true5);
            expandableView5 = itemView.findViewById(R.id.expandableView5);
            cardView5 = itemView.findViewById(R.id.cardView5);
            thu5 = itemView.findViewById(R.id.thu5);
            loigiai5 = itemView.findViewById(R.id.loigiai5);

            radio6a = itemView.findViewById(R.id.radio6a);
            radio6b = itemView.findViewById(R.id.radio6b);
            radio6c = itemView.findViewById(R.id.radio6c);
            radio6d = itemView.findViewById(R.id.radio6d);
            visible6 = itemView.findViewById(R.id.visible6);
            true6 = itemView.findViewById(R.id.true6);
            expandableView6 = itemView.findViewById(R.id.expandableView6);
            cardView6 = itemView.findViewById(R.id.cardView6);
            thu6 = itemView.findViewById(R.id.thu6);
            loigiai6 = itemView.findViewById(R.id.loigiai6);

            radio7a = itemView.findViewById(R.id.radio7a);
            radio7b = itemView.findViewById(R.id.radio7b);
            radio7c = itemView.findViewById(R.id.radio7c);
            radio7d = itemView.findViewById(R.id.radio7d);
            visible7 = itemView.findViewById(R.id.visible7);
            true7 = itemView.findViewById(R.id.true7);
            expandableView7 = itemView.findViewById(R.id.expandableView7);
            cardView7 = itemView.findViewById(R.id.cardView7);
            thu7 = itemView.findViewById(R.id.thu7);
            loigiai7 = itemView.findViewById(R.id.loigiai7);

            radio8a = itemView.findViewById(R.id.radio8a);
            radio8b = itemView.findViewById(R.id.radio8b);
            radio8c = itemView.findViewById(R.id.radio8c);
            radio8d = itemView.findViewById(R.id.radio8d);
            visible8 = itemView.findViewById(R.id.visible8);
            true8 = itemView.findViewById(R.id.true8);
            expandableView8 = itemView.findViewById(R.id.expandableView8);
            cardView8 = itemView.findViewById(R.id.cardView8);
            thu8 = itemView.findViewById(R.id.thu8);
            loigiai8 = itemView.findViewById(R.id.loigiai8);

            radio9a = itemView.findViewById(R.id.radio9a);
            radio9b = itemView.findViewById(R.id.radio9b);
            radio9c = itemView.findViewById(R.id.radio9c);
            radio9d = itemView.findViewById(R.id.radio9d);
            visible9 = itemView.findViewById(R.id.visible9);
            true9 = itemView.findViewById(R.id.true9);
            expandableView9 = itemView.findViewById(R.id.expandableView9);
            cardView9 = itemView.findViewById(R.id.cardView9);
            thu9 = itemView.findViewById(R.id.thu9);
            loigiai9 = itemView.findViewById(R.id.loigiai9);

            radio10a = itemView.findViewById(R.id.radio10a);
            radio10b = itemView.findViewById(R.id.radio10b);
            radio10c = itemView.findViewById(R.id.radio10c);
            radio10d = itemView.findViewById(R.id.radio10d);
            visible10 = itemView.findViewById(R.id.visible10);
            true10 = itemView.findViewById(R.id.true10);
            expandableView10 = itemView.findViewById(R.id.expandableView10);
            cardView10 = itemView.findViewById(R.id.cardView10);
            thu10 = itemView.findViewById(R.id.thu10);
            loigiai10 = itemView.findViewById(R.id.loigiai10);

            radio11a = itemView.findViewById(R.id.radio11a);
            radio11b = itemView.findViewById(R.id.radio11b);
            radio11c = itemView.findViewById(R.id.radio11c);
            radio11d = itemView.findViewById(R.id.radio11d);
            visible11 = itemView.findViewById(R.id.visible11);
            true11 = itemView.findViewById(R.id.true11);
            expandableView11 = itemView.findViewById(R.id.expandableView11);
            cardView11 = itemView.findViewById(R.id.cardView11);
            thu11 = itemView.findViewById(R.id.thu11);
            loigiai11 = itemView.findViewById(R.id.loigiai11);

            radio12a = itemView.findViewById(R.id.radio12a);
            radio12b = itemView.findViewById(R.id.radio12b);
            radio12c = itemView.findViewById(R.id.radio12c);
            radio12d = itemView.findViewById(R.id.radio12d);
            visible12 = itemView.findViewById(R.id.visible12);
            true12 = itemView.findViewById(R.id.true12);
            expandableView12 = itemView.findViewById(R.id.expandableView12);
            cardView12 = itemView.findViewById(R.id.cardView12);
            thu12 = itemView.findViewById(R.id.thu12);
            loigiai12 = itemView.findViewById(R.id.loigiai12);

            radio13a = itemView.findViewById(R.id.radio13a);
            radio13b = itemView.findViewById(R.id.radio13b);
            radio13c = itemView.findViewById(R.id.radio13c);
            radio13d = itemView.findViewById(R.id.radio13d);
            visible13 = itemView.findViewById(R.id.visible13);
            true13 = itemView.findViewById(R.id.true13);
            expandableView13 = itemView.findViewById(R.id.expandableView13);
            cardView13 = itemView.findViewById(R.id.cardView13);
            thu13 = itemView.findViewById(R.id.thu13);
            loigiai13 = itemView.findViewById(R.id.loigiai13);

            radio14a = itemView.findViewById(R.id.radio14a);
            radio14b = itemView.findViewById(R.id.radio14b);
            radio14c = itemView.findViewById(R.id.radio14c);
            radio14d = itemView.findViewById(R.id.radio14d);
            visible14 = itemView.findViewById(R.id.visible14);
            true14 = itemView.findViewById(R.id.true14);
            expandableView14 = itemView.findViewById(R.id.expandableView14);
            cardView14 = itemView.findViewById(R.id.cardView14);
            thu14 = itemView.findViewById(R.id.thu14);
            loigiai14 = itemView.findViewById(R.id.loigiai14);

            radio15a = itemView.findViewById(R.id.radio15a);
            radio15b = itemView.findViewById(R.id.radio15b);
            radio15c = itemView.findViewById(R.id.radio15c);
            radio15d = itemView.findViewById(R.id.radio15d);
            visible15 = itemView.findViewById(R.id.visible15);
            true15 = itemView.findViewById(R.id.true15);
            expandableView15 = itemView.findViewById(R.id.expandableView15);
            cardView15 = itemView.findViewById(R.id.cardView15);
            thu15 = itemView.findViewById(R.id.thu15);
            loigiai15 = itemView.findViewById(R.id.loigiai15);

            radio16a = itemView.findViewById(R.id.radio16a);
            radio16b = itemView.findViewById(R.id.radio16b);
            radio16c = itemView.findViewById(R.id.radio16c);
            radio16d = itemView.findViewById(R.id.radio16d);
            visible16 = itemView.findViewById(R.id.visible16);
            true16 = itemView.findViewById(R.id.true16);
            expandableView16 = itemView.findViewById(R.id.expandableView16);
            cardView16 = itemView.findViewById(R.id.cardView16);
            thu16 = itemView.findViewById(R.id.thu16);
            loigiai16 = itemView.findViewById(R.id.loigiai16);

            radio17a = itemView.findViewById(R.id.radio17a);
            radio17b = itemView.findViewById(R.id.radio17b);
            radio17c = itemView.findViewById(R.id.radio17c);
            radio17d = itemView.findViewById(R.id.radio17d);
            visible17 = itemView.findViewById(R.id.visible17);
            true17 = itemView.findViewById(R.id.true17);
            expandableView17 = itemView.findViewById(R.id.expandableView17);
            cardView17 = itemView.findViewById(R.id.cardView17);
            thu17 = itemView.findViewById(R.id.thu17);
            loigiai17 = itemView.findViewById(R.id.loigiai17);

            radio18a = itemView.findViewById(R.id.radio18a);
            radio18b = itemView.findViewById(R.id.radio18b);
            radio18c = itemView.findViewById(R.id.radio18c);
            radio18d = itemView.findViewById(R.id.radio18d);
            visible18 = itemView.findViewById(R.id.visible18);
            true18 = itemView.findViewById(R.id.true18);
            expandableView18 = itemView.findViewById(R.id.expandableView18);
            cardView18 = itemView.findViewById(R.id.cardView18);
            thu18 = itemView.findViewById(R.id.thu18);
            loigiai18 = itemView.findViewById(R.id.loigiai18);

            radio19a = itemView.findViewById(R.id.radio19a);
            radio19b = itemView.findViewById(R.id.radio19b);
            radio19c = itemView.findViewById(R.id.radio19c);
            radio19d = itemView.findViewById(R.id.radio19d);
            visible19 = itemView.findViewById(R.id.visible19);
            true19 = itemView.findViewById(R.id.true19);
            expandableView19 = itemView.findViewById(R.id.expandableView19);
            cardView19 = itemView.findViewById(R.id.cardView19);
            thu19 = itemView.findViewById(R.id.thu19);
            loigiai19 = itemView.findViewById(R.id.loigiai19);

            radio20a = itemView.findViewById(R.id.radio20a);
            radio20b = itemView.findViewById(R.id.radio20b);
            radio20c = itemView.findViewById(R.id.radio20c);
            radio20d = itemView.findViewById(R.id.radio20d);
            visible20 = itemView.findViewById(R.id.visible20);
            true20 = itemView.findViewById(R.id.true20);
            expandableView20 = itemView.findViewById(R.id.expandableView20);
            cardView20 = itemView.findViewById(R.id.cardView20);
            thu20 = itemView.findViewById(R.id.thu20);
            loigiai20 = itemView.findViewById(R.id.loigiai20);

            radio21a = itemView.findViewById(R.id.radio21a);
            radio21b = itemView.findViewById(R.id.radio21b);
            radio21c = itemView.findViewById(R.id.radio21c);
            radio21d = itemView.findViewById(R.id.radio21d);
            visible21 = itemView.findViewById(R.id.visible21);
            true21 = itemView.findViewById(R.id.true21);
            expandableView21 = itemView.findViewById(R.id.expandableView21);
            cardView21 = itemView.findViewById(R.id.cardView21);
            thu21 = itemView.findViewById(R.id.thu21);
            loigiai21 = itemView.findViewById(R.id.loigiai21);

            radio22a = itemView.findViewById(R.id.radio22a);
            radio22b = itemView.findViewById(R.id.radio22b);
            radio22c = itemView.findViewById(R.id.radio22c);
            radio22d = itemView.findViewById(R.id.radio22d);
            visible22 = itemView.findViewById(R.id.visible22);
            true22 = itemView.findViewById(R.id.true22);
            expandableView22 = itemView.findViewById(R.id.expandableView22);
            cardView22 = itemView.findViewById(R.id.cardView22);
            thu22 = itemView.findViewById(R.id.thu22);
            loigiai22 = itemView.findViewById(R.id.loigiai22);

            radio23a = itemView.findViewById(R.id.radio23a);
            radio23b = itemView.findViewById(R.id.radio23b);
            radio23c = itemView.findViewById(R.id.radio23c);
            radio23d = itemView.findViewById(R.id.radio23d);
            visible23 = itemView.findViewById(R.id.visible23);
            true23 = itemView.findViewById(R.id.true23);
            expandableView23 = itemView.findViewById(R.id.expandableView23);
            cardView23 = itemView.findViewById(R.id.cardView23);
            thu23 = itemView.findViewById(R.id.thu23);
            loigiai23 = itemView.findViewById(R.id.loigiai23);

            radio24a = itemView.findViewById(R.id.radio24a);
            radio24b = itemView.findViewById(R.id.radio24b);
            radio24c = itemView.findViewById(R.id.radio24c);
            radio24d = itemView.findViewById(R.id.radio24d);
            visible24 = itemView.findViewById(R.id.visible24);
            true24 = itemView.findViewById(R.id.true24);
            expandableView24 = itemView.findViewById(R.id.expandableView24);
            cardView24 = itemView.findViewById(R.id.cardView24);
            thu24 = itemView.findViewById(R.id.thu24);
            loigiai24 = itemView.findViewById(R.id.loigiai24);


            thu1.setOnClickListener(new View.OnClickListener(){
                @Override
                public void onClick(View v) {
                    TransitionManager.beginDelayedTransition(cardView, new AutoTransition());
                    expandableView.setVisibility(View.GONE);
                    loigiai1.setVisibility(View.VISIBLE);
                }
            });
            loigiai1.setOnClickListener(new View.OnClickListener(){
                @Override
                public void onClick(View v) {
                    TransitionManager.beginDelayedTransition(cardView, new AutoTransition());
                    expandableView.setVisibility(View.VISIBLE);
                    loigiai1.setVisibility(View.GONE);
                }
            });

            thu2.setOnClickListener(new View.OnClickListener(){
                @Override
                public void onClick(View v) {
                    TransitionManager.beginDelayedTransition(cardView2, new AutoTransition());
                    expandableView2.setVisibility(View.GONE);
                    loigiai2.setVisibility(View.VISIBLE);
                }
            });
            loigiai2.setOnClickListener(new View.OnClickListener(){
                @Override
                public void onClick(View v) {
                    TransitionManager.beginDelayedTransition(cardView2, new AutoTransition());
                    expandableView2.setVisibility(View.VISIBLE);
                    loigiai2.setVisibility(View.GONE);
                }
            });

            thu3.setOnClickListener(new View.OnClickListener(){
                @Override
                public void onClick(View v) {
                    TransitionManager.beginDelayedTransition(cardView3, new AutoTransition());
                    expandableView3.setVisibility(View.GONE);
                    loigiai3.setVisibility(View.VISIBLE);
                }
            });
            loigiai3.setOnClickListener(new View.OnClickListener(){
                @Override
                public void onClick(View v) {
                    TransitionManager.beginDelayedTransition(cardView3, new AutoTransition());
                    expandableView3.setVisibility(View.VISIBLE);
                    loigiai3.setVisibility(View.GONE);
                }
            });

            thu4.setOnClickListener(new View.OnClickListener(){
                @Override
                public void onClick(View v) {
                    TransitionManager.beginDelayedTransition(cardView4, new AutoTransition());
                    expandableView4.setVisibility(View.GONE);
                    loigiai4.setVisibility(View.VISIBLE);
                }
            });
            loigiai4.setOnClickListener(new View.OnClickListener(){
                @Override
                public void onClick(View v) {
                    TransitionManager.beginDelayedTransition(cardView4, new AutoTransition());
                    expandableView4.setVisibility(View.VISIBLE);
                    loigiai4.setVisibility(View.GONE);
                }
            });

            thu5.setOnClickListener(new View.OnClickListener(){
                @Override
                public void onClick(View v) {
                    TransitionManager.beginDelayedTransition(cardView5, new AutoTransition());
                    expandableView5.setVisibility(View.GONE);
                    loigiai5.setVisibility(View.VISIBLE);
                }
            });
            loigiai5.setOnClickListener(new View.OnClickListener(){
                @Override
                public void onClick(View v) {
                    TransitionManager.beginDelayedTransition(cardView5, new AutoTransition());
                    expandableView5.setVisibility(View.VISIBLE);
                    loigiai5.setVisibility(View.GONE);
                }
            });

            thu6.setOnClickListener(new View.OnClickListener(){
                @Override
                public void onClick(View v) {
                    TransitionManager.beginDelayedTransition(cardView6, new AutoTransition());
                    expandableView6.setVisibility(View.GONE);
                    loigiai6.setVisibility(View.VISIBLE);
                }
            });
            loigiai6.setOnClickListener(new View.OnClickListener(){
                @Override
                public void onClick(View v) {
                    TransitionManager.beginDelayedTransition(cardView6, new AutoTransition());
                    expandableView6.setVisibility(View.VISIBLE);
                    loigiai6.setVisibility(View.GONE);
                }
            });

            thu7.setOnClickListener(new View.OnClickListener(){
                @Override
                public void onClick(View v) {
                    TransitionManager.beginDelayedTransition(cardView7, new AutoTransition());
                    expandableView7.setVisibility(View.GONE);
                    loigiai7.setVisibility(View.VISIBLE);
                }
            });
            loigiai7.setOnClickListener(new View.OnClickListener(){
                @Override
                public void onClick(View v) {
                    TransitionManager.beginDelayedTransition(cardView7, new AutoTransition());
                    expandableView7.setVisibility(View.VISIBLE);
                    loigiai7.setVisibility(View.GONE);
                }
            });

            thu8.setOnClickListener(new View.OnClickListener(){
                @Override
                public void onClick(View v) {
                    TransitionManager.beginDelayedTransition(cardView8, new AutoTransition());
                    expandableView8.setVisibility(View.GONE);
                    loigiai8.setVisibility(View.VISIBLE);
                }
            });
            loigiai8.setOnClickListener(new View.OnClickListener(){
                @Override
                public void onClick(View v) {
                    TransitionManager.beginDelayedTransition(cardView8, new AutoTransition());
                    expandableView8.setVisibility(View.VISIBLE);
                    loigiai8.setVisibility(View.GONE);
                }
            });

            thu9.setOnClickListener(new View.OnClickListener(){
                @Override
                public void onClick(View v) {
                    TransitionManager.beginDelayedTransition(cardView9, new AutoTransition());
                    expandableView9.setVisibility(View.GONE);
                    loigiai9.setVisibility(View.VISIBLE);
                }
            });
            loigiai9.setOnClickListener(new View.OnClickListener(){
                @Override
                public void onClick(View v) {
                    TransitionManager.beginDelayedTransition(cardView9, new AutoTransition());
                    expandableView9.setVisibility(View.VISIBLE);
                    loigiai9.setVisibility(View.GONE);
                }
            });

            thu10.setOnClickListener(new View.OnClickListener(){
                @Override
                public void onClick(View v) {
                    TransitionManager.beginDelayedTransition(cardView10, new AutoTransition());
                    expandableView10.setVisibility(View.GONE);
                    loigiai10.setVisibility(View.VISIBLE);
                }
            });
            loigiai10.setOnClickListener(new View.OnClickListener(){
                @Override
                public void onClick(View v) {
                    TransitionManager.beginDelayedTransition(cardView10, new AutoTransition());
                    expandableView10.setVisibility(View.VISIBLE);
                    loigiai10.setVisibility(View.GONE);
                }
            });
            thu11.setOnClickListener(new View.OnClickListener(){
                @Override
                public void onClick(View v) {
                    TransitionManager.beginDelayedTransition(cardView11, new AutoTransition());
                    expandableView11.setVisibility(View.GONE);
                    loigiai11.setVisibility(View.VISIBLE);
                }
            });
            loigiai11.setOnClickListener(new View.OnClickListener(){
                @Override
                public void onClick(View v) {
                    TransitionManager.beginDelayedTransition(cardView11, new AutoTransition());
                    expandableView11.setVisibility(View.VISIBLE);
                    loigiai11.setVisibility(View.GONE);
                }
            });

            thu12.setOnClickListener(new View.OnClickListener(){
                @Override
                public void onClick(View v) {
                    TransitionManager.beginDelayedTransition(cardView12, new AutoTransition());
                    expandableView12.setVisibility(View.GONE);
                    loigiai12.setVisibility(View.VISIBLE);
                }
            });
            loigiai12.setOnClickListener(new View.OnClickListener(){
                @Override
                public void onClick(View v) {
                    TransitionManager.beginDelayedTransition(cardView12, new AutoTransition());
                    expandableView12.setVisibility(View.VISIBLE);
                    loigiai12.setVisibility(View.GONE);
                }
            });



            thu13.setOnClickListener(new View.OnClickListener(){
                @Override
                public void onClick(View v) {
                    TransitionManager.beginDelayedTransition(cardView13, new AutoTransition());
                    expandableView13.setVisibility(View.GONE);
                    loigiai13.setVisibility(View.VISIBLE);
                }
            });
            loigiai13.setOnClickListener(new View.OnClickListener(){
                @Override
                public void onClick(View v) {
                    TransitionManager.beginDelayedTransition(cardView13, new AutoTransition());
                    expandableView13.setVisibility(View.VISIBLE);
                    loigiai13.setVisibility(View.GONE);
                }
            });

            thu14.setOnClickListener(new View.OnClickListener(){
                @Override
                public void onClick(View v) {
                    TransitionManager.beginDelayedTransition(cardView14, new AutoTransition());
                    expandableView14.setVisibility(View.GONE);
                    loigiai14.setVisibility(View.VISIBLE);
                }
            });
            loigiai14.setOnClickListener(new View.OnClickListener(){
                @Override
                public void onClick(View v) {
                    TransitionManager.beginDelayedTransition(cardView14, new AutoTransition());
                    expandableView4.setVisibility(View.VISIBLE);
                    loigiai14.setVisibility(View.GONE);
                }
            });

            thu15.setOnClickListener(new View.OnClickListener(){
                @Override
                public void onClick(View v) {
                    TransitionManager.beginDelayedTransition(cardView15, new AutoTransition());
                    expandableView15.setVisibility(View.GONE);
                    loigiai15.setVisibility(View.VISIBLE);
                }
            });
            loigiai15.setOnClickListener(new View.OnClickListener(){
                @Override
                public void onClick(View v) {
                    TransitionManager.beginDelayedTransition(cardView15, new AutoTransition());
                    expandableView15.setVisibility(View.VISIBLE);
                    loigiai15.setVisibility(View.GONE);
                }
            });

            thu16.setOnClickListener(new View.OnClickListener(){
                @Override
                public void onClick(View v) {
                    TransitionManager.beginDelayedTransition(cardView16, new AutoTransition());
                    expandableView16.setVisibility(View.GONE);
                    loigiai16.setVisibility(View.VISIBLE);
                }
            });
            loigiai16.setOnClickListener(new View.OnClickListener(){
                @Override
                public void onClick(View v) {
                    TransitionManager.beginDelayedTransition(cardView16, new AutoTransition());
                    expandableView16.setVisibility(View.VISIBLE);
                    loigiai16.setVisibility(View.GONE);
                }
            });

            thu17.setOnClickListener(new View.OnClickListener(){
                @Override
                public void onClick(View v) {
                    TransitionManager.beginDelayedTransition(cardView17, new AutoTransition());
                    expandableView17.setVisibility(View.GONE);
                    loigiai17.setVisibility(View.VISIBLE);
                }
            });
            loigiai17.setOnClickListener(new View.OnClickListener(){
                @Override
                public void onClick(View v) {
                    TransitionManager.beginDelayedTransition(cardView17, new AutoTransition());
                    expandableView17.setVisibility(View.VISIBLE);
                    loigiai17.setVisibility(View.GONE);
                }
            });

            thu18.setOnClickListener(new View.OnClickListener(){
                @Override
                public void onClick(View v) {
                    TransitionManager.beginDelayedTransition(cardView18, new AutoTransition());
                    expandableView18.setVisibility(View.GONE);
                    loigiai18.setVisibility(View.VISIBLE);
                }
            });
            loigiai18.setOnClickListener(new View.OnClickListener(){
                @Override
                public void onClick(View v) {
                    TransitionManager.beginDelayedTransition(cardView18, new AutoTransition());
                    expandableView18.setVisibility(View.VISIBLE);
                    loigiai18.setVisibility(View.GONE);
                }
            });

            thu19.setOnClickListener(new View.OnClickListener(){
                @Override
                public void onClick(View v) {
                    TransitionManager.beginDelayedTransition(cardView19, new AutoTransition());
                    expandableView19.setVisibility(View.GONE);
                    loigiai19.setVisibility(View.VISIBLE);
                }
            });
            loigiai19.setOnClickListener(new View.OnClickListener(){
                @Override
                public void onClick(View v) {
                    TransitionManager.beginDelayedTransition(cardView19, new AutoTransition());
                    expandableView19.setVisibility(View.VISIBLE);
                    loigiai19.setVisibility(View.GONE);
                }
            });

            thu20.setOnClickListener(new View.OnClickListener(){
                @Override
                public void onClick(View v) {
                    TransitionManager.beginDelayedTransition(cardView20, new AutoTransition());
                    expandableView20.setVisibility(View.GONE);
                    loigiai20.setVisibility(View.VISIBLE);
                }
            });
            loigiai20.setOnClickListener(new View.OnClickListener(){
                @Override
                public void onClick(View v) {
                    TransitionManager.beginDelayedTransition(cardView20, new AutoTransition());
                    expandableView20.setVisibility(View.VISIBLE);
                    loigiai20.setVisibility(View.GONE);
                }
            });
            thu21.setOnClickListener(new View.OnClickListener(){
                @Override
                public void onClick(View v) {
                    TransitionManager.beginDelayedTransition(cardView21, new AutoTransition());
                    expandableView21.setVisibility(View.GONE);
                    loigiai21.setVisibility(View.VISIBLE);
                }
            });
            loigiai21.setOnClickListener(new View.OnClickListener(){
                @Override
                public void onClick(View v) {
                    TransitionManager.beginDelayedTransition(cardView21, new AutoTransition());
                    expandableView21.setVisibility(View.VISIBLE);
                    loigiai21.setVisibility(View.GONE);
                }
            });

            thu22.setOnClickListener(new View.OnClickListener(){
                @Override
                public void onClick(View v) {
                    TransitionManager.beginDelayedTransition(cardView22, new AutoTransition());
                    expandableView22.setVisibility(View.GONE);
                    loigiai22.setVisibility(View.VISIBLE);
                }
            });
            loigiai22.setOnClickListener(new View.OnClickListener(){
                @Override
                public void onClick(View v) {
                    TransitionManager.beginDelayedTransition(cardView22, new AutoTransition());
                    expandableView22.setVisibility(View.VISIBLE);
                    loigiai22.setVisibility(View.GONE);
                }
            });

            thu23.setOnClickListener(new View.OnClickListener(){
                @Override
                public void onClick(View v) {
                    TransitionManager.beginDelayedTransition(cardView23, new AutoTransition());
                    expandableView23.setVisibility(View.GONE);
                    loigiai23.setVisibility(View.VISIBLE);
                }
            });
            loigiai23.setOnClickListener(new View.OnClickListener(){
                @Override
                public void onClick(View v) {
                    TransitionManager.beginDelayedTransition(cardView23, new AutoTransition());
                    expandableView23.setVisibility(View.VISIBLE);
                    loigiai23.setVisibility(View.GONE);
                }
            });

            thu24.setOnClickListener(new View.OnClickListener(){
                @Override
                public void onClick(View v) {
                    TransitionManager.beginDelayedTransition(cardView24, new AutoTransition());
                    expandableView24.setVisibility(View.GONE);
                    loigiai24.setVisibility(View.VISIBLE);
                }
            });
            loigiai24.setOnClickListener(new View.OnClickListener(){
                @Override
                public void onClick(View v) {
                    TransitionManager.beginDelayedTransition(cardView24, new AutoTransition());
                    expandableView24.setVisibility(View.VISIBLE);
                    loigiai24.setVisibility(View.GONE);
                }
            });

            radio1a.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    an();
                    count.setText(String.valueOf(n));
                    true1.setText("Đáp án đúng");
                    true1.setTextColor(Color.parseColor("#00FF04"));
                    radio1a.setTextColor(Color.parseColor("#00FF04"));
                    visible1.setVisibility(View.VISIBLE);
                    if (expandableView.getVisibility()==View.GONE){
                        TransitionManager.beginDelayedTransition(cardView, new AutoTransition());
                        expandableView.setVisibility(View.VISIBLE);
                    }
                }
            });
            radio1b.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    visible1.setVisibility(View.VISIBLE);
                    radio1b.setTextColor(Color.parseColor("#ff0000"));
                    radio1a.setTextColor(Color.parseColor("#00FF04"));
                    if (expandableView.getVisibility()==View.GONE){
                        TransitionManager.beginDelayedTransition(cardView, new AutoTransition());
                        expandableView.setVisibility(View.VISIBLE);
                    }
                }
            });
            radio1c.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    visible1.setVisibility(View.VISIBLE);
                    radio1c.setTextColor(Color.parseColor("#ff0000"));
                    radio1a.setTextColor(Color.parseColor("#00FF04"));
                    if (expandableView.getVisibility()==View.GONE){
                        TransitionManager.beginDelayedTransition(cardView, new AutoTransition());
                        expandableView.setVisibility(View.VISIBLE);
                    }
                }
            });
            radio1d.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    visible1.setVisibility(View.VISIBLE);
                    radio1d.setTextColor(Color.parseColor("#ff0000"));
                    radio1a.setTextColor(Color.parseColor("#00FF04"));
                    if (expandableView.getVisibility()==View.GONE){
                        TransitionManager.beginDelayedTransition(cardView, new AutoTransition());
                        expandableView.setVisibility(View.VISIBLE);
                    }
                }
            });

            radio2a.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    an();
                    count.setText(String.valueOf(n));
                    true2.setText("Đáp án đúng");
                    true2.setTextColor(Color.parseColor("#00FF04"));
                    radio2a.setTextColor(Color.parseColor("#00FF04"));
                    visible2.setVisibility(View.VISIBLE);
                    if (expandableView2.getVisibility()==View.GONE){
                        TransitionManager.beginDelayedTransition(cardView2, new AutoTransition());
                        expandableView2.setVisibility(View.VISIBLE);
                    } else {

                    }
                }
            });
            radio2b.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    visible2.setVisibility(View.VISIBLE);
                    radio2b.setTextColor(Color.parseColor("#ff0000"));
                    radio2a.setTextColor(Color.parseColor("#00FF04"));
                    if (expandableView2.getVisibility()==View.GONE){
                        TransitionManager.beginDelayedTransition(cardView2, new AutoTransition());
                        expandableView2.setVisibility(View.VISIBLE);
                    }
                }
            });
            radio2c.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    visible2.setVisibility(View.VISIBLE);
                    radio2c.setTextColor(Color.parseColor("#ff0000"));
                    radio2a.setTextColor(Color.parseColor("#00FF04"));
                    if (expandableView2.getVisibility()==View.GONE){
                        TransitionManager.beginDelayedTransition(cardView2, new AutoTransition());
                        expandableView2.setVisibility(View.VISIBLE);
                    }
                }
            });
            radio2d.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    visible2.setVisibility(View.VISIBLE);
                    radio2d.setTextColor(Color.parseColor("#ff0000"));
                    radio2a.setTextColor(Color.parseColor("#00FF04"));
                    if (expandableView2.getVisibility()==View.GONE){
                        TransitionManager.beginDelayedTransition(cardView2, new AutoTransition());
                        expandableView2.setVisibility(View.VISIBLE);
                    }
                }
            });

            radio3a.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    visible3.setVisibility(View.VISIBLE);
                    radio3a.setTextColor(Color.parseColor("#ff0000"));
                    radio3b.setTextColor(Color.parseColor("#00FF04"));
                    if (expandableView3.getVisibility()==View.GONE){
                        TransitionManager.beginDelayedTransition(cardView3, new AutoTransition());
                        expandableView3.setVisibility(View.VISIBLE);
                    }
                }
            });
            radio3b.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    visible3.setVisibility(View.VISIBLE);
                    an();
                    count.setText(String.valueOf(n));
                    true3.setText("Đáp án đúng");
                    true3.setTextColor(Color.parseColor("#00FF04"));
                    radio3b.setTextColor(Color.parseColor("#00FF04"));
                    if (expandableView3.getVisibility()==View.GONE){
                        TransitionManager.beginDelayedTransition(cardView3, new AutoTransition());
                        expandableView3.setVisibility(View.VISIBLE);
                    }
                }
            });
            radio3c.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    visible3.setVisibility(View.VISIBLE);
                    radio3c.setTextColor(Color.parseColor("#ff0000"));
                    radio3b.setTextColor(Color.parseColor("#00FF04"));
                    if (expandableView3.getVisibility()==View.GONE){
                        TransitionManager.beginDelayedTransition(cardView3, new AutoTransition());
                        expandableView3.setVisibility(View.VISIBLE);
                    }
                }
            });
            radio3d.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    visible3.setVisibility(View.VISIBLE);
                    radio3c.setTextColor(Color.parseColor("#ff0000"));
                    radio3b.setTextColor(Color.parseColor("#00FF04"));
                    if (expandableView3.getVisibility()==View.GONE){
                        TransitionManager.beginDelayedTransition(cardView3, new AutoTransition());
                        expandableView3.setVisibility(View.VISIBLE);
                    }
                }
            });

            radio4a.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    visible4.setVisibility(View.VISIBLE);
                    radio4a.setTextColor(Color.parseColor("#ff0000"));
                    radio4b.setTextColor(Color.parseColor("#00FF04"));
                    if (expandableView4.getVisibility()==View.GONE){
                        TransitionManager.beginDelayedTransition(cardView4, new AutoTransition());
                        expandableView4.setVisibility(View.VISIBLE);
                    }
                }
            });
            radio4b.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    visible4.setVisibility(View.VISIBLE);
                    an();
                    count.setText(String.valueOf(n));
                    true4.setText("Đáp án đúng");
                    true4.setTextColor(Color.parseColor("#00FF04"));
                    radio4b.setTextColor(Color.parseColor("#00FF04"));
                    if (expandableView4.getVisibility()==View.GONE){
                        TransitionManager.beginDelayedTransition(cardView4, new AutoTransition());
                        expandableView4.setVisibility(View.VISIBLE);
                    }
                }
            });
            radio4c.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    visible4.setVisibility(View.VISIBLE);
                    radio4c.setTextColor(Color.parseColor("#ff0000"));
                    radio4b.setTextColor(Color.parseColor("#00FF04"));
                    if (expandableView4.getVisibility()==View.GONE){
                        TransitionManager.beginDelayedTransition(cardView4, new AutoTransition());
                        expandableView4.setVisibility(View.VISIBLE);
                    }
                }
            });
            radio4d.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    visible4.setVisibility(View.VISIBLE);
                    radio4d.setTextColor(Color.parseColor("#ff0000"));
                    radio4b.setTextColor(Color.parseColor("#00FF04"));
                    if (expandableView4.getVisibility()==View.GONE){
                        TransitionManager.beginDelayedTransition(cardView4, new AutoTransition());
                        expandableView4.setVisibility(View.VISIBLE);
                    }
                }
            });

            radio5a.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    radio5a.setTextColor(Color.parseColor("#ff0000"));
                    radio5d.setTextColor(Color.parseColor("#00FF04"));
                    visible5.setVisibility(View.VISIBLE);
                    if (expandableView5.getVisibility()==View.GONE){
                        TransitionManager.beginDelayedTransition(cardView5, new AutoTransition());
                        expandableView5.setVisibility(View.VISIBLE);
                    }
                }
            });
            radio5b.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    radio5b.setTextColor(Color.parseColor("#ff0000"));
                    radio5d.setTextColor(Color.parseColor("#00FF04"));
                    visible5.setVisibility(View.VISIBLE);
                    if (expandableView5.getVisibility()==View.GONE){
                        TransitionManager.beginDelayedTransition(cardView5, new AutoTransition());
                        expandableView5.setVisibility(View.VISIBLE);
                    }
                }
            });
            radio5c.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    radio5c.setTextColor(Color.parseColor("#ff0000"));
                    radio5d.setTextColor(Color.parseColor("#00FF04"));
                    visible5.setVisibility(View.VISIBLE);
                    if (expandableView5.getVisibility()==View.GONE){
                        TransitionManager.beginDelayedTransition(cardView5, new AutoTransition());
                        expandableView5.setVisibility(View.VISIBLE);
                    }
                }
            });
            radio5d.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    visible5.setVisibility(View.VISIBLE);
                    an();
                    count.setText(String.valueOf(n));
                    true5.setText("Đáp án đúng");
                    true5.setTextColor(Color.parseColor("#00FF04"));
                    radio5d.setTextColor(Color.parseColor("#00FF04"));
                    if (expandableView5.getVisibility()==View.GONE){
                        TransitionManager.beginDelayedTransition(cardView5, new AutoTransition());
                        expandableView5.setVisibility(View.VISIBLE);
                    }
                }
            });

            radio6a.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    an();
                    count.setText(String.valueOf(n));
                    true6.setText("Đáp án đúng");
                    true6.setTextColor(Color.parseColor("#00FF04"));
                    radio6a.setTextColor(Color.parseColor("#00FF04"));
                    visible6.setVisibility(View.VISIBLE);
                    if (expandableView6.getVisibility()==View.GONE){
                        TransitionManager.beginDelayedTransition(cardView6, new AutoTransition());
                        expandableView6.setVisibility(View.VISIBLE);
                    } else {

                    }
                }
            });
            radio6b.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    visible6.setVisibility(View.VISIBLE);
                    radio6b.setTextColor(Color.parseColor("#ff0000"));
                    radio6a.setTextColor(Color.parseColor("#00FF04"));
                    if (expandableView6.getVisibility()==View.GONE){
                        TransitionManager.beginDelayedTransition(cardView6, new AutoTransition());
                        expandableView6.setVisibility(View.VISIBLE);
                    }
                }
            });
            radio6c.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    visible6.setVisibility(View.VISIBLE);
                    radio6c.setTextColor(Color.parseColor("#ff0000"));
                    radio6a.setTextColor(Color.parseColor("#00FF04"));
                    if (expandableView6.getVisibility()==View.GONE){
                        TransitionManager.beginDelayedTransition(cardView6, new AutoTransition());
                        expandableView6.setVisibility(View.VISIBLE);
                    }
                }
            });
            radio6d.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    visible6.setVisibility(View.VISIBLE);
                    radio6d.setTextColor(Color.parseColor("#ff0000"));
                    radio6a.setTextColor(Color.parseColor("#00FF04"));
                    if (expandableView6.getVisibility()==View.GONE){
                        TransitionManager.beginDelayedTransition(cardView6, new AutoTransition());
                        expandableView6.setVisibility(View.VISIBLE);
                    }
                }
            });

            radio7a.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    radio7a.setTextColor(Color.parseColor("#ff0000"));
                    radio7d.setTextColor(Color.parseColor("#00FF04"));
                    visible7.setVisibility(View.VISIBLE);
                    if (expandableView7.getVisibility()==View.GONE){
                        TransitionManager.beginDelayedTransition(cardView7, new AutoTransition());
                        expandableView7.setVisibility(View.VISIBLE);
                    }
                }
            });
            radio7b.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    radio7b.setTextColor(Color.parseColor("#ff0000"));
                    radio7d.setTextColor(Color.parseColor("#00FF04"));
                    visible7.setVisibility(View.VISIBLE);
                    if (expandableView7.getVisibility()==View.GONE){
                        TransitionManager.beginDelayedTransition(cardView7, new AutoTransition());
                        expandableView7.setVisibility(View.VISIBLE);
                    }
                }
            });
            radio7c.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    radio7c.setTextColor(Color.parseColor("#ff0000"));
                    radio7d.setTextColor(Color.parseColor("#00FF04"));
                    visible7.setVisibility(View.VISIBLE);
                    if (expandableView7.getVisibility()==View.GONE){
                        TransitionManager.beginDelayedTransition(cardView7, new AutoTransition());
                        expandableView7.setVisibility(View.VISIBLE);
                    }
                }
            });
            radio7d.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    visible7.setVisibility(View.VISIBLE);
                    an();
                    count.setText(String.valueOf(n));
                    true7.setText("Đáp án đúng");
                    true7.setTextColor(Color.parseColor("#00FF04"));
                    radio7d.setTextColor(Color.parseColor("#00FF04"));
                    if (expandableView7.getVisibility()==View.GONE){
                        TransitionManager.beginDelayedTransition(cardView7, new AutoTransition());
                        expandableView7.setVisibility(View.VISIBLE);
                    }
                }
            });

            radio8a.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    visible8.setVisibility(View.VISIBLE);
                    radio8a.setTextColor(Color.parseColor("#ff0000"));
                    radio8b.setTextColor(Color.parseColor("#00FF04"));
                    if (expandableView8.getVisibility()==View.GONE){
                        TransitionManager.beginDelayedTransition(cardView8, new AutoTransition());
                        expandableView8.setVisibility(View.VISIBLE);
                    }
                }
            });
            radio8b.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    visible8.setVisibility(View.VISIBLE);
                    an();
                    count.setText(String.valueOf(n));
                    true8.setText("Đáp án đúng");
                    true8.setTextColor(Color.parseColor("#00FF04"));
                    radio8b.setTextColor(Color.parseColor("#00FF04"));
                    if (expandableView8.getVisibility()==View.GONE){
                        TransitionManager.beginDelayedTransition(cardView8, new AutoTransition());
                        expandableView8.setVisibility(View.VISIBLE);
                    }
                }
            });
            radio8c.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    visible8.setVisibility(View.VISIBLE);
                    radio8c.setTextColor(Color.parseColor("#ff0000"));
                    radio8b.setTextColor(Color.parseColor("#00FF04"));
                    if (expandableView8.getVisibility()==View.GONE){
                        TransitionManager.beginDelayedTransition(cardView8, new AutoTransition());
                        expandableView8.setVisibility(View.VISIBLE);
                    }
                }
            });
            radio8d.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    visible8.setVisibility(View.VISIBLE);
                    radio8d.setTextColor(Color.parseColor("#ff0000"));
                    radio8b.setTextColor(Color.parseColor("#00FF04"));
                    if (expandableView8.getVisibility()==View.GONE){
                        TransitionManager.beginDelayedTransition(cardView8, new AutoTransition());
                        expandableView8.setVisibility(View.VISIBLE);
                    }
                }
            });

            radio9a.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    visible9.setVisibility(View.VISIBLE);
                    radio9a.setTextColor(Color.parseColor("#ff0000"));
                    radio9b.setTextColor(Color.parseColor("#00FF04"));
                    if (expandableView9.getVisibility()==View.GONE){
                        TransitionManager.beginDelayedTransition(cardView9, new AutoTransition());
                        expandableView9.setVisibility(View.VISIBLE);
                    }
                }
            });
            radio9b.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    visible9.setVisibility(View.VISIBLE);
                    an();
                    count.setText(String.valueOf(n));
                    true9.setText("Đáp án đúng");
                    true9.setTextColor(Color.parseColor("#00FF04"));
                    radio9b.setTextColor(Color.parseColor("#00FF04"));
                    if (expandableView9.getVisibility()==View.GONE){
                        TransitionManager.beginDelayedTransition(cardView9, new AutoTransition());
                        expandableView9.setVisibility(View.VISIBLE);
                    }
                }
            });
            radio9c.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    visible9.setVisibility(View.VISIBLE);
                    radio9c.setTextColor(Color.parseColor("#ff0000"));
                    radio9b.setTextColor(Color.parseColor("#00FF04"));
                    if (expandableView9.getVisibility()==View.GONE){
                        TransitionManager.beginDelayedTransition(cardView9, new AutoTransition());
                        expandableView9.setVisibility(View.VISIBLE);
                    }
                }
            });
            radio9d.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    visible9.setVisibility(View.VISIBLE);
                    radio9d.setTextColor(Color.parseColor("#ff0000"));
                    radio9b.setTextColor(Color.parseColor("#00FF04"));
                    if (expandableView9.getVisibility()==View.GONE){
                        TransitionManager.beginDelayedTransition(cardView9, new AutoTransition());
                        expandableView9.setVisibility(View.VISIBLE);
                    }
                }
            });

            radio10a.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    radio10a.setTextColor(Color.parseColor("#ff0000"));
                    radio10d.setTextColor(Color.parseColor("#00FF04"));
                    visible10.setVisibility(View.VISIBLE);
                    if (expandableView10.getVisibility()==View.GONE){
                        TransitionManager.beginDelayedTransition(cardView10, new AutoTransition());
                        expandableView10.setVisibility(View.VISIBLE);
                    }
                }
            });
            radio10b.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    radio10b.setTextColor(Color.parseColor("#ff0000"));
                    radio10d.setTextColor(Color.parseColor("#00FF04"));
                    visible10.setVisibility(View.VISIBLE);
                    if (expandableView10.getVisibility()==View.GONE){
                        TransitionManager.beginDelayedTransition(cardView10, new AutoTransition());
                        expandableView10.setVisibility(View.VISIBLE);
                    }
                }
            });
            radio10c.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    radio10c.setTextColor(Color.parseColor("#ff0000"));
                    radio10d.setTextColor(Color.parseColor("#00FF04"));
                    visible10.setVisibility(View.VISIBLE);
                    if (expandableView10.getVisibility()==View.GONE){
                        TransitionManager.beginDelayedTransition(cardView10, new AutoTransition());
                        expandableView10.setVisibility(View.VISIBLE);
                    }
                }
            });
            radio10d.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    visible10.setVisibility(View.VISIBLE);
                    an();
                    count.setText(String.valueOf(n));
                    true10.setText("Đáp án đúng");
                    true10.setTextColor(Color.parseColor("#00FF04"));
                    radio10d.setTextColor(Color.parseColor("#00FF04"));
                    if (expandableView10.getVisibility()==View.GONE){
                        TransitionManager.beginDelayedTransition(cardView10, new AutoTransition());
                        expandableView10.setVisibility(View.VISIBLE);
                    }
                }
            });

            radio11a.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    radio11a.setTextColor(Color.parseColor("#ff0000"));
                    radio11d.setTextColor(Color.parseColor("#00FF04"));
                    visible11.setVisibility(View.VISIBLE);
                    if (expandableView11.getVisibility()==View.GONE){
                        TransitionManager.beginDelayedTransition(cardView11, new AutoTransition());
                        expandableView11.setVisibility(View.VISIBLE);
                    }
                }
            });
            radio11b.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    radio11b.setTextColor(Color.parseColor("#ff0000"));
                    radio11d.setTextColor(Color.parseColor("#00FF04"));
                    visible11.setVisibility(View.VISIBLE);
                    if (expandableView11.getVisibility()==View.GONE){
                        TransitionManager.beginDelayedTransition(cardView11, new AutoTransition());
                        expandableView11.setVisibility(View.VISIBLE);
                    }
                }
            });
            radio11c.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    radio11c.setTextColor(Color.parseColor("#ff0000"));
                    radio11d.setTextColor(Color.parseColor("#00FF04"));
                    visible11.setVisibility(View.VISIBLE);
                    if (expandableView11.getVisibility()==View.GONE){
                        TransitionManager.beginDelayedTransition(cardView11, new AutoTransition());
                        expandableView11.setVisibility(View.VISIBLE);
                    }
                }
            });
            radio11d.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    visible11.setVisibility(View.VISIBLE);
                    an();
                    count.setText(String.valueOf(n));
                    true11.setText("Đáp án đúng");
                    true11.setTextColor(Color.parseColor("#00FF04"));
                    radio11d.setTextColor(Color.parseColor("#00FF04"));
                    if (expandableView11.getVisibility()==View.GONE){
                        TransitionManager.beginDelayedTransition(cardView11, new AutoTransition());
                        expandableView11.setVisibility(View.VISIBLE);
                    }
                }
            });

            radio12a.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    visible12.setVisibility(View.VISIBLE);
                    radio12a.setTextColor(Color.parseColor("#ff0000"));
                    radio12b.setTextColor(Color.parseColor("#00FF04"));
                    if (expandableView12.getVisibility()==View.GONE){
                        TransitionManager.beginDelayedTransition(cardView12, new AutoTransition());
                        expandableView12.setVisibility(View.VISIBLE);
                    }
                }
            });
            radio12b.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    visible12.setVisibility(View.VISIBLE);
                    an();
                    count.setText(String.valueOf(n));
                    true12.setText("Đáp án đúng");
                    true12.setTextColor(Color.parseColor("#00FF04"));
                    radio12b.setTextColor(Color.parseColor("#00FF04"));
                    if (expandableView12.getVisibility()==View.GONE){
                        TransitionManager.beginDelayedTransition(cardView12, new AutoTransition());
                        expandableView12.setVisibility(View.VISIBLE);
                    }
                }
            });
            radio12c.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    visible12.setVisibility(View.VISIBLE);
                    radio12c.setTextColor(Color.parseColor("#ff0000"));
                    radio12b.setTextColor(Color.parseColor("#00FF04"));
                    if (expandableView12.getVisibility()==View.GONE){
                        TransitionManager.beginDelayedTransition(cardView12, new AutoTransition());
                        expandableView12.setVisibility(View.VISIBLE);
                    }
                }
            });
            radio12d.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    visible12.setVisibility(View.VISIBLE);
                    radio12d.setTextColor(Color.parseColor("#ff0000"));
                    radio12b.setTextColor(Color.parseColor("#00FF04"));
                    if (expandableView12.getVisibility()==View.GONE){
                        TransitionManager.beginDelayedTransition(cardView12, new AutoTransition());
                        expandableView12.setVisibility(View.VISIBLE);
                    }
                }
            });

            radio13a.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    an();
                    count.setText(String.valueOf(n));
                    true13.setText("Đáp án đúng");
                    true13.setTextColor(Color.parseColor("#00FF04"));
                    radio13a.setTextColor(Color.parseColor("#00FF04"));
                    visible13.setVisibility(View.VISIBLE);
                    if (expandableView13.getVisibility()==View.GONE){
                        TransitionManager.beginDelayedTransition(cardView13, new AutoTransition());
                        expandableView13.setVisibility(View.VISIBLE);
                    }
                }
            });
            radio13b.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    visible13.setVisibility(View.VISIBLE);
                    radio13b.setTextColor(Color.parseColor("#ff0000"));
                    radio13a.setTextColor(Color.parseColor("#00FF04"));
                    if (expandableView13.getVisibility()==View.GONE){
                        TransitionManager.beginDelayedTransition(cardView13, new AutoTransition());
                        expandableView13.setVisibility(View.VISIBLE);
                    }
                }
            });
            radio13c.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    visible13.setVisibility(View.VISIBLE);
                    radio13c.setTextColor(Color.parseColor("#ff0000"));
                    radio13a.setTextColor(Color.parseColor("#00FF04"));
                    if (expandableView13.getVisibility()==View.GONE){
                        TransitionManager.beginDelayedTransition(cardView13, new AutoTransition());
                        expandableView13.setVisibility(View.VISIBLE);
                    }
                }
            });
            radio13d.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    visible13.setVisibility(View.VISIBLE);
                    radio13d.setTextColor(Color.parseColor("#ff0000"));
                    radio13a.setTextColor(Color.parseColor("#00FF04"));
                    if (expandableView13.getVisibility()==View.GONE){
                        TransitionManager.beginDelayedTransition(cardView13, new AutoTransition());
                        expandableView13.setVisibility(View.VISIBLE);
                    }
                }
            });

            radio14a.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    visible14.setVisibility(View.VISIBLE);
                    radio14a.setTextColor(Color.parseColor("#ff0000"));
                    radio14c.setTextColor(Color.parseColor("#00FF04"));
                    if (expandableView14.getVisibility()==View.GONE){
                        TransitionManager.beginDelayedTransition(cardView14, new AutoTransition());
                        expandableView14.setVisibility(View.VISIBLE);
                    }
                }
            });
            radio14b.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    visible14.setVisibility(View.VISIBLE);
                    radio14b.setTextColor(Color.parseColor("#ff0000"));
                    radio14c.setTextColor(Color.parseColor("#00FF04"));
                    if (expandableView14.getVisibility()==View.GONE){
                        TransitionManager.beginDelayedTransition(cardView14, new AutoTransition());
                        expandableView14.setVisibility(View.VISIBLE);
                    }
                }
            });
            radio14c.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    visible14.setVisibility(View.VISIBLE);
                    an();
                    count.setText(String.valueOf(n));
                    true14.setText("Đáp án đúng");
                    true14.setTextColor(Color.parseColor("#00FF04"));
                    radio14c.setTextColor(Color.parseColor("#00FF04"));
                    if (expandableView14.getVisibility()==View.GONE){
                        TransitionManager.beginDelayedTransition(cardView14, new AutoTransition());
                        expandableView14.setVisibility(View.VISIBLE);
                    }
                }
            });
            radio14d.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    visible14.setVisibility(View.VISIBLE);
                    radio14d.setTextColor(Color.parseColor("#ff0000"));
                    radio14c.setTextColor(Color.parseColor("#00FF04"));
                    if (expandableView14.getVisibility()==View.GONE){
                        TransitionManager.beginDelayedTransition(cardView14, new AutoTransition());
                        expandableView14.setVisibility(View.VISIBLE);
                    }
                }
            });

            radio15a.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    an();
                    count.setText(String.valueOf(n));
                    true15.setText("Đáp án đúng");
                    true15.setTextColor(Color.parseColor("#00FF04"));
                    radio15a.setTextColor(Color.parseColor("#00FF04"));
                    visible15.setVisibility(View.VISIBLE);
                    if (expandableView15.getVisibility()==View.GONE){
                        TransitionManager.beginDelayedTransition(cardView15, new AutoTransition());
                        expandableView15.setVisibility(View.VISIBLE);
                    }
                }
            });
            radio15b.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    visible15.setVisibility(View.VISIBLE);
                    radio15b.setTextColor(Color.parseColor("#ff0000"));
                    radio15a.setTextColor(Color.parseColor("#00FF04"));
                    if (expandableView15.getVisibility()==View.GONE){
                        TransitionManager.beginDelayedTransition(cardView15, new AutoTransition());
                        expandableView15.setVisibility(View.VISIBLE);
                    }
                }
            });
            radio15c.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    visible15.setVisibility(View.VISIBLE);
                    radio15c.setTextColor(Color.parseColor("#ff0000"));
                    radio15a.setTextColor(Color.parseColor("#00FF04"));
                    if (expandableView15.getVisibility()==View.GONE){
                        TransitionManager.beginDelayedTransition(cardView15, new AutoTransition());
                        expandableView15.setVisibility(View.VISIBLE);
                    }
                }
            });
            radio15d.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    visible15.setVisibility(View.VISIBLE);
                    radio15d.setTextColor(Color.parseColor("#ff0000"));
                    radio15a.setTextColor(Color.parseColor("#00FF04"));
                    if (expandableView15.getVisibility()==View.GONE){
                        TransitionManager.beginDelayedTransition(cardView15, new AutoTransition());
                        expandableView15.setVisibility(View.VISIBLE);
                    }
                }
            });

            radio16a.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    visible16.setVisibility(View.VISIBLE);
                    radio16a.setTextColor(Color.parseColor("#ff0000"));
                    radio16b.setTextColor(Color.parseColor("#00FF04"));
                    if (expandableView16.getVisibility()==View.GONE){
                        TransitionManager.beginDelayedTransition(cardView16, new AutoTransition());
                        expandableView16.setVisibility(View.VISIBLE);
                    }
                }
            });
            radio16b.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    visible16.setVisibility(View.VISIBLE);
                    an();
                    count.setText(String.valueOf(n));
                    true16.setText("Đáp án đúng");
                    true16.setTextColor(Color.parseColor("#00FF04"));
                    radio16b.setTextColor(Color.parseColor("#00FF04"));
                    if (expandableView16.getVisibility()==View.GONE){
                        TransitionManager.beginDelayedTransition(cardView16, new AutoTransition());
                        expandableView16.setVisibility(View.VISIBLE);
                    }
                }
            });
            radio16c.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    visible16.setVisibility(View.VISIBLE);
                    radio16c.setTextColor(Color.parseColor("#ff0000"));
                    radio16b.setTextColor(Color.parseColor("#00FF04"));
                    if (expandableView16.getVisibility()==View.GONE){
                        TransitionManager.beginDelayedTransition(cardView16, new AutoTransition());
                        expandableView16.setVisibility(View.VISIBLE);
                    }
                }
            });
            radio16d.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    visible16.setVisibility(View.VISIBLE);
                    radio16d.setTextColor(Color.parseColor("#ff0000"));
                    radio16b.setTextColor(Color.parseColor("#00FF04"));
                    if (expandableView16.getVisibility()==View.GONE){
                        TransitionManager.beginDelayedTransition(cardView16, new AutoTransition());
                        expandableView16.setVisibility(View.VISIBLE);
                    }
                }
            });

            radio17a.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    visible17.setVisibility(View.VISIBLE);
                    radio17a.setTextColor(Color.parseColor("#ff0000"));
                    radio17c.setTextColor(Color.parseColor("#00FF04"));
                    if (expandableView17.getVisibility()==View.GONE){
                        TransitionManager.beginDelayedTransition(cardView17, new AutoTransition());
                        expandableView17.setVisibility(View.VISIBLE);
                    }
                }
            });
            radio17b.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    visible17.setVisibility(View.VISIBLE);
                    radio17b.setTextColor(Color.parseColor("#ff0000"));
                    radio17c.setTextColor(Color.parseColor("#00FF04"));
                    if (expandableView17.getVisibility()==View.GONE){
                        TransitionManager.beginDelayedTransition(cardView17, new AutoTransition());
                        expandableView17.setVisibility(View.VISIBLE);
                    }
                }
            });
            radio17c.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    visible17.setVisibility(View.VISIBLE);
                    an();
                    count.setText(String.valueOf(n));
                    true17.setText("Đáp án đúng");
                    true17.setTextColor(Color.parseColor("#00FF04"));
                    radio17c.setTextColor(Color.parseColor("#00FF04"));
                    if (expandableView17.getVisibility()==View.GONE){
                        TransitionManager.beginDelayedTransition(cardView17, new AutoTransition());
                        expandableView17.setVisibility(View.VISIBLE);
                    }
                }
            });
            radio17d.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    visible17.setVisibility(View.VISIBLE);
                    radio17d.setTextColor(Color.parseColor("#ff0000"));
                    radio17c.setTextColor(Color.parseColor("#00FF04"));
                    if (expandableView17.getVisibility()==View.GONE){
                        TransitionManager.beginDelayedTransition(cardView17, new AutoTransition());
                        expandableView17.setVisibility(View.VISIBLE);
                    }
                }
            });

            radio18a.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    visible18.setVisibility(View.VISIBLE);
                    radio18a.setTextColor(Color.parseColor("#ff0000"));
                    radio18b.setTextColor(Color.parseColor("#00FF04"));
                    if (expandableView18.getVisibility()==View.GONE){
                        TransitionManager.beginDelayedTransition(cardView18, new AutoTransition());
                        expandableView18.setVisibility(View.VISIBLE);
                    }
                }
            });
            radio18b.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    visible18.setVisibility(View.VISIBLE);
                    an();
                    count.setText(String.valueOf(n));
                    true18.setText("Đáp án đúng");
                    true18.setTextColor(Color.parseColor("#00FF04"));
                    radio18b.setTextColor(Color.parseColor("#00FF04"));
                    if (expandableView18.getVisibility()==View.GONE){
                        TransitionManager.beginDelayedTransition(cardView18, new AutoTransition());
                        expandableView18.setVisibility(View.VISIBLE);
                    }
                }
            });
            radio18c.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    visible18.setVisibility(View.VISIBLE);
                    radio18c.setTextColor(Color.parseColor("#ff0000"));
                    radio18b.setTextColor(Color.parseColor("#00FF04"));
                    if (expandableView18.getVisibility()==View.GONE){
                        TransitionManager.beginDelayedTransition(cardView18, new AutoTransition());
                        expandableView18.setVisibility(View.VISIBLE);
                    }
                }
            });
            radio18d.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    visible18.setVisibility(View.VISIBLE);
                    radio18d.setTextColor(Color.parseColor("#ff0000"));
                    radio18b.setTextColor(Color.parseColor("#00FF04"));
                    if (expandableView18.getVisibility()==View.GONE){
                        TransitionManager.beginDelayedTransition(cardView18, new AutoTransition());
                        expandableView18.setVisibility(View.VISIBLE);
                    }
                }
            });

            radio19a.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    radio19a.setTextColor(Color.parseColor("#ff0000"));
                    radio19d.setTextColor(Color.parseColor("#00FF04"));
                    visible19.setVisibility(View.VISIBLE);
                    if (expandableView19.getVisibility()==View.GONE){
                        TransitionManager.beginDelayedTransition(cardView19, new AutoTransition());
                        expandableView19.setVisibility(View.VISIBLE);
                    }
                }
            });
            radio19b.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    radio19b.setTextColor(Color.parseColor("#ff0000"));
                    radio19d.setTextColor(Color.parseColor("#00FF04"));
                    visible19.setVisibility(View.VISIBLE);
                    if (expandableView19.getVisibility()==View.GONE){
                        TransitionManager.beginDelayedTransition(cardView19, new AutoTransition());
                        expandableView19.setVisibility(View.VISIBLE);
                    }
                }
            });
            radio19c.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    radio19c.setTextColor(Color.parseColor("#ff0000"));
                    radio19d.setTextColor(Color.parseColor("#00FF04"));
                    visible19.setVisibility(View.VISIBLE);
                    if (expandableView19.getVisibility()==View.GONE){
                        TransitionManager.beginDelayedTransition(cardView19, new AutoTransition());
                        expandableView19.setVisibility(View.VISIBLE);
                    }
                }
            });
            radio19d.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    visible19.setVisibility(View.VISIBLE);
                    an();
                    count.setText(String.valueOf(n));
                    true19.setText("Đáp án đúng");
                    true19.setTextColor(Color.parseColor("#00FF04"));
                    radio19d.setTextColor(Color.parseColor("#00FF04"));
                    if (expandableView19.getVisibility()==View.GONE){
                        TransitionManager.beginDelayedTransition(cardView19, new AutoTransition());
                        expandableView19.setVisibility(View.VISIBLE);
                    }
                }
            });

            radio20a.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    an();
                    count.setText(String.valueOf(n));
                    true20.setText("Đáp án đúng");
                    true20.setTextColor(Color.parseColor("#00FF04"));
                    radio20a.setTextColor(Color.parseColor("#00FF04"));
                    visible20.setVisibility(View.VISIBLE);
                    if (expandableView20.getVisibility()==View.GONE){
                        TransitionManager.beginDelayedTransition(cardView20, new AutoTransition());
                        expandableView20.setVisibility(View.VISIBLE);
                    }
                }
            });
            radio20b.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    visible20.setVisibility(View.VISIBLE);
                    radio20b.setTextColor(Color.parseColor("#ff0000"));
                    radio20a.setTextColor(Color.parseColor("#00FF04"));
                    if (expandableView20.getVisibility()==View.GONE){
                        TransitionManager.beginDelayedTransition(cardView20, new AutoTransition());
                        expandableView20.setVisibility(View.VISIBLE);
                    }
                }
            });
            radio20c.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    visible20.setVisibility(View.VISIBLE);
                    radio20c.setTextColor(Color.parseColor("#ff0000"));
                    radio20a.setTextColor(Color.parseColor("#00FF04"));
                    if (expandableView20.getVisibility()==View.GONE){
                        TransitionManager.beginDelayedTransition(cardView20, new AutoTransition());
                        expandableView20.setVisibility(View.VISIBLE);
                    }
                }
            });
            radio20d.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    visible20.setVisibility(View.VISIBLE);
                    radio20d.setTextColor(Color.parseColor("#ff0000"));
                    radio20a.setTextColor(Color.parseColor("#00FF04"));
                    if (expandableView20.getVisibility()==View.GONE){
                        TransitionManager.beginDelayedTransition(cardView20, new AutoTransition());
                        expandableView20.setVisibility(View.VISIBLE);
                    }
                }
            });

            radio21a.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    an();
                    count.setText(String.valueOf(n));
                    true21.setText("Đáp án đúng");
                    true21.setTextColor(Color.parseColor("#00FF04"));
                    radio21a.setTextColor(Color.parseColor("#00FF04"));
                    visible21.setVisibility(View.VISIBLE);
                    if (expandableView21.getVisibility()==View.GONE){
                        TransitionManager.beginDelayedTransition(cardView21, new AutoTransition());
                        expandableView21.setVisibility(View.VISIBLE);
                    } else {

                    }
                }
            });
            radio21b.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    visible21.setVisibility(View.VISIBLE);
                    radio21b.setTextColor(Color.parseColor("#ff0000"));
                    radio21a.setTextColor(Color.parseColor("#00FF04"));
                    if (expandableView21.getVisibility()==View.GONE){
                        TransitionManager.beginDelayedTransition(cardView21, new AutoTransition());
                        expandableView21.setVisibility(View.VISIBLE);
                    }
                }
            });
            radio21c.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    visible21.setVisibility(View.VISIBLE);
                    radio21c.setTextColor(Color.parseColor("#ff0000"));
                    radio21a.setTextColor(Color.parseColor("#00FF04"));
                    if (expandableView21.getVisibility()==View.GONE){
                        TransitionManager.beginDelayedTransition(cardView21, new AutoTransition());
                        expandableView21.setVisibility(View.VISIBLE);
                    }
                }
            });
            radio21d.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    visible21.setVisibility(View.VISIBLE);
                    radio21d.setTextColor(Color.parseColor("#ff0000"));
                    radio21a.setTextColor(Color.parseColor("#00FF04"));
                    if (expandableView21.getVisibility()==View.GONE){
                        TransitionManager.beginDelayedTransition(cardView21, new AutoTransition());
                        expandableView21.setVisibility(View.VISIBLE);
                    }
                }
            });

            radio22a.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    radio22a.setTextColor(Color.parseColor("#ff0000"));
                    radio22d.setTextColor(Color.parseColor("#00FF04"));
                    visible22.setVisibility(View.VISIBLE);
                    if (expandableView22.getVisibility()==View.GONE){
                        TransitionManager.beginDelayedTransition(cardView22, new AutoTransition());
                        expandableView22.setVisibility(View.VISIBLE);
                    }
                }
            });
            radio22b.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    radio22b.setTextColor(Color.parseColor("#ff0000"));
                    radio22d.setTextColor(Color.parseColor("#00FF04"));
                    visible22.setVisibility(View.VISIBLE);
                    if (expandableView22.getVisibility()==View.GONE){
                        TransitionManager.beginDelayedTransition(cardView22, new AutoTransition());
                        expandableView22.setVisibility(View.VISIBLE);
                    }
                }
            });
            radio22c.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    radio22c.setTextColor(Color.parseColor("#ff0000"));
                    radio22d.setTextColor(Color.parseColor("#00FF04"));
                    visible22.setVisibility(View.VISIBLE);
                    if (expandableView22.getVisibility()==View.GONE){
                        TransitionManager.beginDelayedTransition(cardView22, new AutoTransition());
                        expandableView22.setVisibility(View.VISIBLE);
                    }
                }
            });
            radio22d.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    visible22.setVisibility(View.VISIBLE);
                    an();
                    count.setText(String.valueOf(n));
                    true22.setText("Đáp án đúng");
                    true22.setTextColor(Color.parseColor("#00FF04"));
                    radio22d.setTextColor(Color.parseColor("#00FF04"));
                    if (expandableView22.getVisibility()==View.GONE){
                        TransitionManager.beginDelayedTransition(cardView22, new AutoTransition());
                        expandableView22.setVisibility(View.VISIBLE);
                    }
                }
            });

            radio23a.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    visible23.setVisibility(View.VISIBLE);
                    radio23a.setTextColor(Color.parseColor("#ff0000"));
                    radio23c.setTextColor(Color.parseColor("#00FF04"));
                    if (expandableView23.getVisibility()==View.GONE){
                        TransitionManager.beginDelayedTransition(cardView23, new AutoTransition());
                        expandableView23.setVisibility(View.VISIBLE);
                    }
                }
            });
            radio23b.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    visible23.setVisibility(View.VISIBLE);
                    radio23b.setTextColor(Color.parseColor("#ff0000"));
                    radio23c.setTextColor(Color.parseColor("#00FF04"));
                    if (expandableView23.getVisibility()==View.GONE){
                        TransitionManager.beginDelayedTransition(cardView23, new AutoTransition());
                        expandableView23.setVisibility(View.VISIBLE);
                    }
                }
            });
            radio23c.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    visible23.setVisibility(View.VISIBLE);
                    an();
                    count.setText(String.valueOf(n));
                    true23.setText("Đáp án đúng");
                    true23.setTextColor(Color.parseColor("#00FF04"));
                    radio23c.setTextColor(Color.parseColor("#00FF04"));
                    if (expandableView23.getVisibility()==View.GONE){
                        TransitionManager.beginDelayedTransition(cardView23, new AutoTransition());
                        expandableView23.setVisibility(View.VISIBLE);
                    }
                }
            });
            radio23d.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    visible23.setVisibility(View.VISIBLE);
                    radio23d.setTextColor(Color.parseColor("#ff0000"));
                    radio23c.setTextColor(Color.parseColor("#00FF04"));
                    if (expandableView23.getVisibility()==View.GONE){
                        TransitionManager.beginDelayedTransition(cardView23, new AutoTransition());
                        expandableView23.setVisibility(View.VISIBLE);
                    }
                }
            });

            radio24a.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    visible24.setVisibility(View.VISIBLE);
                    radio24a.setTextColor(Color.parseColor("#ff0000"));
                    radio24b.setTextColor(Color.parseColor("#00FF04"));
                    if (expandableView24.getVisibility()==View.GONE){
                        TransitionManager.beginDelayedTransition(cardView24, new AutoTransition());
                        expandableView24.setVisibility(View.VISIBLE);
                    }
                }
            });
            radio24b.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    visible24.setVisibility(View.VISIBLE);
                    an();
                    count.setText(String.valueOf(n));
                    true24.setText("Đáp án đúng");
                    true24.setTextColor(Color.parseColor("#00FF04"));
                    radio24b.setTextColor(Color.parseColor("#00FF04"));
                    if (expandableView24.getVisibility()==View.GONE){
                        TransitionManager.beginDelayedTransition(cardView24, new AutoTransition());
                        expandableView24.setVisibility(View.VISIBLE);
                    }
                }
            });
            radio24c.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    visible24.setVisibility(View.VISIBLE);
                    radio24c.setTextColor(Color.parseColor("#ff0000"));
                    radio24b.setTextColor(Color.parseColor("#00FF04"));
                    if (expandableView24.getVisibility()==View.GONE){
                        TransitionManager.beginDelayedTransition(cardView24, new AutoTransition());
                        expandableView24.setVisibility(View.VISIBLE);
                    }
                }
            });
            radio24d.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    visible24.setVisibility(View.VISIBLE);
                    radio24d.setTextColor(Color.parseColor("#ff0000"));
                    radio24b.setTextColor(Color.parseColor("#00FF04"));
                    if (expandableView24.getVisibility()==View.GONE){
                        TransitionManager.beginDelayedTransition(cardView24, new AutoTransition());
                        expandableView24.setVisibility(View.VISIBLE);
                    }
                }
            });

            count = itemView.findViewById(R.id.count);
            btHTD.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    textHTD.setText("yes");
                    textBT1.setText("Đánh dấu chưa hoàn thành");
                    //
                    hoanthanh1.setVisibility(View.VISIBLE);
                    not_hoanthanh.setVisibility(View.INVISIBLE);
                    btHTD.setVisibility(View.INVISIBLE);
                    btHTD1.setVisibility(View.VISIBLE);
                    saveData();
                }
            });
            btHTD1.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    if(textBT1.getText().toString().length() == 7){
                        textHTD.setText("");
                        saveData();
                        //context.startActivity(new Intent(context, LuyenTapMot.class));
                        Intent intent = new Intent(context, LuyenTapMot.class);
                        context.startActivity(intent);
                        ((Activity)context).overridePendingTransition(0, 0);
                        ((Activity)context).finish();
                        //((Activity)context).overridePendingTransition(0, 0);
                    }else {
                        textHTD.setText("");
                        textBT1.setText("Đánh dấu đã hoàn thành");
                        //
                        hoanthanh1.setVisibility(View.INVISIBLE);
                        not_hoanthanh.setVisibility(View.VISIBLE);
                        btHTD.setVisibility(View.VISIBLE);
                        btHTD1.setVisibility(View.INVISIBLE);
                        saveData();
                    }
                }
            });
            loadData();
            updateViews();
            count.addTextChangedListener(new TextWatcher(){

                @Override
                public void beforeTextChanged(CharSequence s, int start, int count, int after) {

                }

                @Override
                public void onTextChanged(CharSequence s, int start, int before, int count) {

                }

                @Override
                public void afterTextChanged(Editable s) {
                    if( Integer.parseInt(count.getText().toString()) >= 20 ){
                        dat.setTextColor(Color.parseColor("#00FF04"));
                        so_cau.setTextColor(Color.parseColor("#00FF04"));
                        count.setTextColor(Color.parseColor("#00FF04"));
                        btHTD.setVisibility(View.VISIBLE);
                        btHTD1.setVisibility(View.INVISIBLE);
                        textBT1.setVisibility(View.VISIBLE);
                        textBT2.setVisibility(View.INVISIBLE);
                    }
                }
            });
        }

        private void an() {
            n++;
        }

        public void saveData() {
            SharedPreferences sharedPreferences = context.getSharedPreferences("LuyenTapMuoi", MODE_PRIVATE);
            SharedPreferences.Editor editor = sharedPreferences.edit();
            editor.putString(TEXT, textHTD.getText().toString());
            editor.apply();
        }

        public void loadData() {
            SharedPreferences sharedPreferences = context.getSharedPreferences("LuyenTapMuoi", MODE_PRIVATE);
            text = sharedPreferences.getString(TEXT, "");
        }

        public void updateViews() {
            textHTD.setText(text);
            if(textHTD.getText().toString().length() > 0){
                //textBT1.setTextColor(Color.parseColor("#0000"));
                textBT1.setText("LÀM LẠI");
                hoanthanh1.setVisibility(View.VISIBLE);
                not_hoanthanh.setVisibility(View.INVISIBLE);
                btHTD.setVisibility(View.INVISIBLE);
                btHTD1.setVisibility(View.VISIBLE);
                textBT1.setVisibility(View.VISIBLE);
                textBT2.setVisibility(View.INVISIBLE);

                radio1a.setChecked(true);
                radio1a.setTextColor(Color.parseColor("#00FF04"));
                true1.setText("Đáp án đúng");
                true1.setTextColor(Color.parseColor("#00FF04"));
                loigiai1.setVisibility(View.VISIBLE);
                visible1.setVisibility(View.VISIBLE);

                radio2d.setChecked(true);
                radio2d.setTextColor(Color.parseColor("#00FF04"));
                true2.setText("Đáp án đúng");
                true2.setTextColor(Color.parseColor("#00FF04"));
                loigiai2.setVisibility(View.VISIBLE);
                visible2.setVisibility(View.VISIBLE);


                radio3c.setChecked(true);
                radio3c.setTextColor(Color.parseColor("#00FF04"));
                true3.setText("Đáp án đúng");
                true3.setTextColor(Color.parseColor("#00FF04"));
                loigiai3.setVisibility(View.VISIBLE);
                visible3.setVisibility(View.VISIBLE);

                radio4c.setChecked(true);
                radio4c.setTextColor(Color.parseColor("#00FF04"));
                true4.setText("Đáp án đúng");
                true4.setTextColor(Color.parseColor("#00FF04"));
                loigiai4.setVisibility(View.VISIBLE);
                visible4.setVisibility(View.VISIBLE);

                radio5c.setChecked(true);
                radio5c.setTextColor(Color.parseColor("#00FF04"));
                true5.setText("Đáp án đúng");
                true5.setTextColor(Color.parseColor("#00FF04"));
                loigiai5.setVisibility(View.VISIBLE);
                visible5.setVisibility(View.VISIBLE);

                radio6b.setChecked(true);
                radio6b.setTextColor(Color.parseColor("#00FF04"));
                true6.setText("Đáp án đúng");
                true6.setTextColor(Color.parseColor("#00FF04"));
                loigiai6.setVisibility(View.VISIBLE);
                visible6.setVisibility(View.VISIBLE);

                radio7b.setChecked(true);
                radio7b.setTextColor(Color.parseColor("#00FF04"));
                true7.setText("Đáp án đúng");
                true7.setTextColor(Color.parseColor("#00FF04"));
                loigiai7.setVisibility(View.VISIBLE);
                visible7.setVisibility(View.VISIBLE);

                radio8c.setChecked(true);
                radio8c.setTextColor(Color.parseColor("#00FF04"));
                true8.setText("Đáp án đúng");
                true8.setTextColor(Color.parseColor("#00FF04"));
                loigiai8.setVisibility(View.VISIBLE);
                visible8.setVisibility(View.VISIBLE);

                radio9c.setChecked(true);
                radio9c.setTextColor(Color.parseColor("#00FF04"));
                true9.setText("Đáp án đúng");
                true9.setTextColor(Color.parseColor("#00FF04"));
                loigiai9.setVisibility(View.VISIBLE);
                visible9.setVisibility(View.VISIBLE);

                radio10b.setChecked(true);
                radio10b.setTextColor(Color.parseColor("#00FF04"));
                true10.setText("Đáp án đúng");
                true10.setTextColor(Color.parseColor("#00FF04"));
                loigiai10.setVisibility(View.VISIBLE);
                visible10.setVisibility(View.VISIBLE);

                radio11c.setChecked(true);
                radio11c.setTextColor(Color.parseColor("#00FF04"));
                true11.setText("Đáp án đúng");
                true11.setTextColor(Color.parseColor("#00FF04"));
                loigiai11.setVisibility(View.VISIBLE);
                visible11.setVisibility(View.VISIBLE);

                radio12b.setChecked(true);
                radio12b.setTextColor(Color.parseColor("#00FF04"));
                true12.setText("Đáp án đúng");
                true12.setTextColor(Color.parseColor("#00FF04"));
                loigiai12.setVisibility(View.VISIBLE);
                visible12.setVisibility(View.VISIBLE);


                radio13c.setChecked(true);
                radio13c.setTextColor(Color.parseColor("#00FF04"));
                true13.setText("Đáp án đúng");
                true13.setTextColor(Color.parseColor("#00FF04"));
                loigiai13.setVisibility(View.VISIBLE);
                visible13.setVisibility(View.VISIBLE);

                radio14c.setChecked(true);
                radio14c.setTextColor(Color.parseColor("#00FF04"));
                true14.setText("Đáp án đúng");
                true14.setTextColor(Color.parseColor("#00FF04"));
                loigiai14.setVisibility(View.VISIBLE);
                visible14.setVisibility(View.VISIBLE);

                radio15c.setChecked(true);
                radio15c.setTextColor(Color.parseColor("#00FF04"));
                true15.setText("Đáp án đúng");
                true15.setTextColor(Color.parseColor("#00FF04"));
                loigiai15.setVisibility(View.VISIBLE);
                visible15.setVisibility(View.VISIBLE);

                radio16b.setChecked(true);
                radio16b.setTextColor(Color.parseColor("#00FF04"));
                true16.setText("Đáp án đúng");
                true16.setTextColor(Color.parseColor("#00FF04"));
                loigiai16.setVisibility(View.VISIBLE);
                visible16.setVisibility(View.VISIBLE);

                radio17b.setChecked(true);
                radio17b.setTextColor(Color.parseColor("#00FF04"));
                true17.setText("Đáp án đúng");
                true17.setTextColor(Color.parseColor("#00FF04"));
                loigiai17.setVisibility(View.VISIBLE);
                visible17.setVisibility(View.VISIBLE);

                radio18c.setChecked(true);
                radio18c.setTextColor(Color.parseColor("#00FF04"));
                true18.setText("Đáp án đúng");
                true18.setTextColor(Color.parseColor("#00FF04"));
                loigiai18.setVisibility(View.VISIBLE);
                visible18.setVisibility(View.VISIBLE);

                radio19c.setChecked(true);
                radio19c.setTextColor(Color.parseColor("#00FF04"));
                true19.setText("Đáp án đúng");
                true19.setTextColor(Color.parseColor("#00FF04"));
                loigiai19.setVisibility(View.VISIBLE);
                visible19.setVisibility(View.VISIBLE);

                radio20b.setChecked(true);
                radio20b.setTextColor(Color.parseColor("#00FF04"));
                true20.setText("Đáp án đúng");
                true20.setTextColor(Color.parseColor("#00FF04"));
                loigiai20.setVisibility(View.VISIBLE);
                visible20.setVisibility(View.VISIBLE);

                radio21c.setChecked(true);
                radio21c.setTextColor(Color.parseColor("#00FF04"));
                true21.setText("Đáp án đúng");
                true21.setTextColor(Color.parseColor("#00FF04"));
                loigiai21.setVisibility(View.VISIBLE);
                visible21.setVisibility(View.VISIBLE);

                radio22b.setChecked(true);
                radio22b.setTextColor(Color.parseColor("#00FF04"));
                true22.setText("Đáp án đúng");
                true22.setTextColor(Color.parseColor("#00FF04"));
                loigiai22.setVisibility(View.VISIBLE);
                visible22.setVisibility(View.VISIBLE);

                radio23a.setChecked(true);
                radio23a.setTextColor(Color.parseColor("#00FF04"));
                true23.setText("Đáp án đúng");
                true23.setTextColor(Color.parseColor("#00FF04"));
                loigiai23.setVisibility(View.VISIBLE);
                visible23.setVisibility(View.VISIBLE);

                radio24d.setChecked(true);
                radio24d.setTextColor(Color.parseColor("#00FF04"));
                true24.setText("Đáp án đúng");
                true24.setTextColor(Color.parseColor("#00FF04"));
                loigiai24.setVisibility(View.VISIBLE);
                visible24.setVisibility(View.VISIBLE);


            } else {
                textBT1.setText("Đánh dấu đã hoàn thành");
                hoanthanh1.setVisibility(View.INVISIBLE);
                not_hoanthanh.setVisibility(View.VISIBLE);
                btHTD.setVisibility(View.INVISIBLE);
                btHTD1.setVisibility(View.INVISIBLE);
            }
            //switch1.setChecked(switchOnOff);
        }
    }
}
