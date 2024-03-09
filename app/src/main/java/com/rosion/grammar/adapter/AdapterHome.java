package com.rosion.grammar.adapter;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.view.DragEvent;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

import com.google.android.gms.ads.AdListener;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.InterstitialAd;
import com.google.android.gms.ads.MobileAds;
import com.rosion.grammar.HienTaiHT;
import com.rosion.grammar.HienTaiHTTD;
import com.rosion.grammar.HomeActivity;
import com.rosion.grammar.LuyenTapBa;
import com.rosion.grammar.LuyenTapBay;
import com.rosion.grammar.LuyenTapBon;
import com.rosion.grammar.LuyenTapChin;
import com.rosion.grammar.LuyenTapHai;
import com.rosion.grammar.LuyenTapMot;
import com.rosion.grammar.LuyenTapMuoi;
import com.rosion.grammar.LuyenTapNam;
import com.rosion.grammar.LuyenTapSau;
import com.rosion.grammar.LuyenTapTam;
import com.rosion.grammar.MyData;
import com.rosion.grammar.QuaKhuD;
import com.rosion.grammar.QuaKhuHT;
import com.rosion.grammar.QuaKhuHTTD;
import com.rosion.grammar.QuaKhuTD;
import com.rosion.grammar.R;
import com.rosion.grammar.HienTaiD;
import com.rosion.grammar.HienTaiTD;
import com.rosion.grammar.TuongLaiD;
import com.rosion.grammar.TuongLaiHT;
import com.rosion.grammar.TuongLaiHTTD;
import com.rosion.grammar.TuongLaiTD;

import static android.content.Context.MODE_PRIVATE;
import static com.rosion.grammar.adapter.HapHienTaiD.ViewHolder.SHARED_PREFS;
import static com.rosion.grammar.adapter.HapHienTaiD.ViewHolder.TEXT;

public class AdapterHome extends RecyclerView.Adapter<AdapterHome.ViewHolder> {

    MyData[] myData;
    Context context;
   public AdapterHome(MyData[] myData, HomeActivity activity){
        this.context = activity;
        this.myData = myData;
   }

    @NonNull
    @Override
    public AdapterHome.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater= LayoutInflater.from(parent.getContext());
        View view = layoutInflater.inflate(R.layout.home_layout,parent,false);
        ViewHolder viewHolder= new ViewHolder(view);
        return viewHolder;
    }
    @Override
    public void onBindViewHolder(@NonNull AdapterHome.ViewHolder holder, int position) {
       final MyData myDataList = myData[position];
       holder.textHome.setText(myDataList.getName());

    }
    @Override
    public int getItemCount() {
        return myData.length;
    }
    public class ViewHolder extends RecyclerView.ViewHolder {
        TextView textHome, text1,text2,text3, text4,text5, text6,text7, text8,text9, text10,text11, text12,text13, text14,text15, text16,text17, text18,text19, text20,text21, text22;
        Button button1,button2, button3,button4,button5, button6,button7,button8, button9,button10,button11, button12,button13,button14, button15,button16,button17, button18,button19,button20, button21, button22;
        CardView card1, card2, card3, card4, card5, card6, card7, card8, card9, card10, card11, card12, card13, card14, card15, card16, card17, card18, card19, card20, card21, card22;
        ImageView image1,image2,image3,image4,image5,image6,image7,image8,image9,image10,image11,image12,image13,image14,image15,image16,image17,image18,image19,image20,image21,image22;
        LinearLayout layout;
        int id_interstitial;
        private InterstitialAd mInterstitialAd;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            textHome= itemView.findViewById(R.id.textHome);
            button1 = itemView.findViewById(R.id.button1);
            button2 = itemView.findViewById(R.id.button2);
            button3 = itemView.findViewById(R.id.button3);
            button4 = itemView.findViewById(R.id.button4);
            button5 = itemView.findViewById(R.id.button5);
            button6 = itemView.findViewById(R.id.button6);
            button7 = itemView.findViewById(R.id.button7);
            button8 = itemView.findViewById(R.id.button8);
            button9 = itemView.findViewById(R.id.button9);
            button10 = itemView.findViewById(R.id.button10);
            button11 = itemView.findViewById(R.id.button11);
            button12 = itemView.findViewById(R.id.button12);
            button13 = itemView.findViewById(R.id.button13);
            button14 = itemView.findViewById(R.id.button14);
            button15 = itemView.findViewById(R.id.button15);
            button16 = itemView.findViewById(R.id.button16);
            button17 = itemView.findViewById(R.id.button17);
            button18 = itemView.findViewById(R.id.button18);
            button19= itemView.findViewById(R.id.button19);
            button20 = itemView.findViewById(R.id.button20);
            button21 = itemView.findViewById(R.id.button21);
            button22 = itemView.findViewById(R.id.button22);

            card1 = itemView.findViewById(R.id.card1);
            card2 = itemView.findViewById(R.id.card2);
            card3 = itemView.findViewById(R.id.card3);
            card4 = itemView.findViewById(R.id.card4);
            card5 = itemView.findViewById(R.id.card5);
            card6 = itemView.findViewById(R.id.card6);
            card7 = itemView.findViewById(R.id.card7);
            card8 = itemView.findViewById(R.id.card8);
            card9 = itemView.findViewById(R.id.card9);
            card10 = itemView.findViewById(R.id.card10);
            card11 = itemView.findViewById(R.id.card11);
            card12 = itemView.findViewById(R.id.card12);
            card13 = itemView.findViewById(R.id.card13);
            card14 = itemView.findViewById(R.id.card14);
            card15 = itemView.findViewById(R.id.card15);
            card16 = itemView.findViewById(R.id.card16);
            card17 = itemView.findViewById(R.id.card17);
            card18 = itemView.findViewById(R.id.card18);
            card19 = itemView.findViewById(R.id.card19);
            card20 = itemView.findViewById(R.id.card20);
            card21 = itemView.findViewById(R.id.card21);
            card22 = itemView.findViewById(R.id.card22);

            text1 = itemView.findViewById(R.id.text1);
            text2 = itemView.findViewById(R.id.text2);
            text3 = itemView.findViewById(R.id.text3);
            text4 = itemView.findViewById(R.id.text4);
            text5 = itemView.findViewById(R.id.text5);
            text6 = itemView.findViewById(R.id.text6);
            text7 = itemView.findViewById(R.id.text7);
            text8 = itemView.findViewById(R.id.text8);
            text9 = itemView.findViewById(R.id.text9);
            text10 = itemView.findViewById(R.id.text10);
            text11 = itemView.findViewById(R.id.text11);
            text12 = itemView.findViewById(R.id.text12);
            text13 = itemView.findViewById(R.id.text13);
            text14 = itemView.findViewById(R.id.text14);
            text15 = itemView.findViewById(R.id.text15);
            text16 = itemView.findViewById(R.id.text16);
            text17 = itemView.findViewById(R.id.text17);
            text18 = itemView.findViewById(R.id.text18);
            text19 = itemView.findViewById(R.id.text19);
            text20 = itemView.findViewById(R.id.text20);
            text21 = itemView.findViewById(R.id.text21);
            text22 = itemView.findViewById(R.id.text22);

            layout = itemView.findViewById(R.id.layout);

            image1 = (ImageView) itemView.findViewById(R.id.image1);
            image2 = (ImageView) itemView.findViewById(R.id.image2);
            image3 = (ImageView) itemView.findViewById(R.id.image3);
            image4 = (ImageView) itemView.findViewById(R.id.image4);
            image5 = (ImageView) itemView.findViewById(R.id.image5);
            image6 = (ImageView) itemView.findViewById(R.id.image6);
            image7 = (ImageView) itemView.findViewById(R.id.image7);
            image8 = (ImageView) itemView.findViewById(R.id.image8);
            image9 = (ImageView) itemView.findViewById(R.id.image9);
            image10 = (ImageView) itemView.findViewById(R.id.image10);
            image11 = (ImageView) itemView.findViewById(R.id.image11);
            image12 = (ImageView) itemView.findViewById(R.id.image12);
            image13 = (ImageView) itemView.findViewById(R.id.image13);
            image14 = (ImageView) itemView.findViewById(R.id.image14);
            image15 = (ImageView) itemView.findViewById(R.id.image15);
            image16 = (ImageView) itemView.findViewById(R.id.image16);
            image17 = (ImageView) itemView.findViewById(R.id.image17);
            image18 = (ImageView) itemView.findViewById(R.id.image18);
            image19 = (ImageView) itemView.findViewById(R.id.image19);
            image20 = (ImageView) itemView.findViewById(R.id.image20);
            image21 = (ImageView) itemView.findViewById(R.id.image21);
            image22 = (ImageView) itemView.findViewById(R.id.image22);

            MobileAds.initialize(context,
                    "ca-app-pub-9002559574859995~9231651280");

            mInterstitialAd = new InterstitialAd(context);
            mInterstitialAd.setAdUnitId("ca-app-pub-9002559574859995/9962558570");
            mInterstitialAd.loadAd(new AdRequest.Builder().build());
            mInterstitialAd.setAdListener(new AdListener() {
                @Override
                public void onAdClosed() {
                    // Load the next interstitial.
                    if( id_interstitial == 3) {
                        Intent i = new Intent(context, LuyenTapMot.class);
                        context.startActivity(i);
                    }
                    if( id_interstitial == 6) {
                        Intent i = new Intent(context, LuyenTapHai.class);
                        context.startActivity(i);
                    }
                    if( id_interstitial == 10) {
                        Intent i = new Intent(context, LuyenTapBon.class);
                        context.startActivity(i);
                    }
                    if( id_interstitial == 13) {
                        Intent i = new Intent(context, LuyenTapNam.class);
                        context.startActivity(i);
                    }
                    if( id_interstitial == 17) {
                        Intent i = new Intent(context, LuyenTapBay.class);
                        context.startActivity(i);
                    }
                    if( id_interstitial == 20) {
                        Intent i = new Intent(context, LuyenTapTam.class);
                        context.startActivity(i);
                    }
                    if( id_interstitial == 22) {
                        Intent i = new Intent(context, LuyenTapMuoi.class);
                        context.startActivity(i);
                    }
                    mInterstitialAd.loadAd(new AdRequest.Builder().build());
                }
            });

            button1.setOnClickListener(new View.OnClickListener(){
                @Override
                public void onClick(View v) {
                    Intent i = new Intent(v.getContext(), HienTaiD.class);
                    v.getContext().startActivity(i);
                    SharedPreferences sharedPreferences6 = context.getSharedPreferences("LuyenTapHai", MODE_PRIVATE);
                    String tex6 = sharedPreferences6.getString(TEXT, "");
                    text6.setText(tex6);
                    if( text6.getText().toString().length() > 0 ) {
                        card6.setCardBackgroundColor(0xFFEDEDED);
                        card6.setCardElevation(0);
                        image6.setImageResource(R.mipmap.tick_xanhs1);
                    }else{
                        card6.setCardBackgroundColor(Color.WHITE);
                        card6.setCardElevation(8);
                        image6.setImageResource(R.mipmap.next_offical);
                    }
                    SharedPreferences sharedPreferences7 = context.getSharedPreferences("LuyenTapBa", MODE_PRIVATE);
                    String tex7 = sharedPreferences7.getString(TEXT, "");
                    text7.setText(tex7);
                    if( text7.getText().toString().length() > 0 ) {
                        card7.setCardBackgroundColor(0xFFEDEDED);
                        card7.setCardElevation(0);
                        image7.setImageResource(R.mipmap.tick_xanhs1);
                    }else{
                        card7.setCardBackgroundColor(Color.WHITE);
                        card7.setCardElevation(8);
                        image7.setImageResource(R.mipmap.next_offical);
                    }
                    SharedPreferences sharedPreferences8 = context.getSharedPreferences("QuaKhuD", MODE_PRIVATE);
                    String tex8 = sharedPreferences8.getString(TEXT, "");
                    text8.setText(tex8);
                    if( text8.getText().toString().length() > 0 ) {
                        card8.setCardBackgroundColor(0xFFEDEDED);
                        card8.setCardElevation(0);
                        image8.setImageResource(R.mipmap.tick_xanhs1);
                    }else{
                        card8.setCardBackgroundColor(Color.WHITE);
                        card8.setCardElevation(8);
                        image8.setImageResource(R.mipmap.next_offical);
                    }
                }
            });
            button2.setOnClickListener(new View.OnClickListener(){
                @Override
                public void onClick(View v) {
                    Intent i = new Intent(v.getContext(), HienTaiTD.class);
                    v.getContext().startActivity(i);
                    SharedPreferences sharedPreferences6 = context.getSharedPreferences("LuyenTapHai", MODE_PRIVATE);
                    String tex6 = sharedPreferences6.getString(TEXT, "");
                    text6.setText(tex6);
                    if( text6.getText().toString().length() > 0 ) {
                        card6.setCardBackgroundColor(0xFFEDEDED);
                        card6.setCardElevation(0);
                        image6.setImageResource(R.mipmap.tick_xanhs1);
                    }else{
                        card6.setCardBackgroundColor(Color.WHITE);
                        card6.setCardElevation(8);
                        image6.setImageResource(R.mipmap.next_offical);
                    }
                    SharedPreferences sharedPreferences7 = context.getSharedPreferences("LuyenTapBa", MODE_PRIVATE);
                    String tex7 = sharedPreferences7.getString(TEXT, "");
                    text7.setText(tex7);
                    if( text7.getText().toString().length() > 0 ) {
                        card7.setCardBackgroundColor(0xFFEDEDED);
                        card7.setCardElevation(0);
                        image7.setImageResource(R.mipmap.tick_xanhs1);
                    }else{
                        card7.setCardBackgroundColor(Color.WHITE);
                        card7.setCardElevation(8);
                        image7.setImageResource(R.mipmap.next_offical);
                    }
                    SharedPreferences sharedPreferences8 = context.getSharedPreferences("QuaKhuD", MODE_PRIVATE);
                    String tex8 = sharedPreferences8.getString(TEXT, "");
                    text8.setText(tex8);
                    if( text8.getText().toString().length() > 0 ) {
                        card8.setCardBackgroundColor(0xFFEDEDED);
                        card8.setCardElevation(0);
                        image8.setImageResource(R.mipmap.tick_xanhs1);
                    }else{
                        card8.setCardBackgroundColor(Color.WHITE);
                        card8.setCardElevation(8);
                        image8.setImageResource(R.mipmap.next_offical);
                    }
                    SharedPreferences sharedPreferences9 = context.getSharedPreferences("QuaKhuTD", MODE_PRIVATE);
                    String tex9 = sharedPreferences9.getString(TEXT, "");
                    text9.setText(tex9);
                    if( text9.getText().toString().length() > 0 ) {
                        card9.setCardBackgroundColor(0xFFEDEDED);
                        card9.setCardElevation(0);
                        image9.setImageResource(R.mipmap.tick_xanhs1);
                    }else{
                        card9.setCardBackgroundColor(Color.WHITE);
                        card9.setCardElevation(8);
                        image9.setImageResource(R.mipmap.next_offical);
                    }
                }
            });
            button3.setOnClickListener(new View.OnClickListener(){
                @Override
                public void onClick(View v) {
                    id_interstitial=3;
                    if (mInterstitialAd.isLoaded()) {
                        mInterstitialAd.show();
                    } else {
                        Intent i = new Intent(v.getContext(), LuyenTapMot.class);
                        v.getContext().startActivity(i);
                    }
                    SharedPreferences sharedPreferences6 = context.getSharedPreferences("LuyenTapHai", MODE_PRIVATE);
                    String tex6 = sharedPreferences6.getString(TEXT, "");
                    text6.setText(tex6);
                    if( text6.getText().toString().length() > 0 ) {
                        card6.setCardBackgroundColor(0xFFEDEDED);
                        card6.setCardElevation(0);
                        image6.setImageResource(R.mipmap.tick_xanhs1);
                    }else{
                        card6.setCardBackgroundColor(Color.WHITE);
                        card6.setCardElevation(8);
                        image6.setImageResource(R.mipmap.next_offical);
                    }
                    SharedPreferences sharedPreferences7 = context.getSharedPreferences("LuyenTapBa", MODE_PRIVATE);
                    String tex7 = sharedPreferences7.getString(TEXT, "");
                    text7.setText(tex7);
                    if( text7.getText().toString().length() > 0 ) {
                        card7.setCardBackgroundColor(0xFFEDEDED);
                        card7.setCardElevation(0);
                        image7.setImageResource(R.mipmap.tick_xanhs1);
                    }else{
                        card7.setCardBackgroundColor(Color.WHITE);
                        card7.setCardElevation(8);
                        image7.setImageResource(R.mipmap.next_offical);
                    }
                    SharedPreferences sharedPreferences8 = context.getSharedPreferences("QuaKhuD", MODE_PRIVATE);
                    String tex8 = sharedPreferences8.getString(TEXT, "");
                    text8.setText(tex8);
                    if( text8.getText().toString().length() > 0 ) {
                        card8.setCardBackgroundColor(0xFFEDEDED);
                        card8.setCardElevation(0);
                        image8.setImageResource(R.mipmap.tick_xanhs1);
                    }else{
                        card8.setCardBackgroundColor(Color.WHITE);
                        card8.setCardElevation(8);
                        image8.setImageResource(R.mipmap.next_offical);
                    }
                    SharedPreferences sharedPreferences9 = context.getSharedPreferences("QuaKhuTD", MODE_PRIVATE);
                    String tex9 = sharedPreferences9.getString(TEXT, "");
                    text9.setText(tex9);
                    if( text9.getText().toString().length() > 0 ) {
                        card9.setCardBackgroundColor(0xFFEDEDED);
                        card9.setCardElevation(0);
                        image9.setImageResource(R.mipmap.tick_xanhs1);
                    }else{
                        card9.setCardBackgroundColor(Color.WHITE);
                        card9.setCardElevation(8);
                        image9.setImageResource(R.mipmap.next_offical);
                    }
                    SharedPreferences sharedPreferences10 = context.getSharedPreferences("LuyenTapBon", MODE_PRIVATE);
                    String tex10 = sharedPreferences10.getString(TEXT, "");
                    text10.setText(tex10);
                    if( text10.getText().toString().length() > 0 ) {
                        card10.setCardBackgroundColor(0xFFEDEDED);
                        card10.setCardElevation(0);
                        image10.setImageResource(R.mipmap.tick_xanhs1);
                    }else{
                        card10.setCardBackgroundColor(Color.WHITE);
                        card10.setCardElevation(8);
                        image10.setImageResource(R.mipmap.next_offical);
                    }
                }
            });

            button4.setOnClickListener(new View.OnClickListener(){
                @Override
                public void onClick(View v) {
                    Intent i = new Intent(v.getContext(), HienTaiHT.class);
                    v.getContext().startActivity(i);
                    SharedPreferences sharedPreferences6 = context.getSharedPreferences("LuyenTapHai", MODE_PRIVATE);
                    String tex6 = sharedPreferences6.getString(TEXT, "");
                    text6.setText(tex6);
                    if( text6.getText().toString().length() > 0 ) {
                        card6.setCardBackgroundColor(0xFFEDEDED);
                        card6.setCardElevation(0);
                        image6.setImageResource(R.mipmap.tick_xanhs1);
                    }else{
                        card6.setCardBackgroundColor(Color.WHITE);
                        card6.setCardElevation(8);
                        image6.setImageResource(R.mipmap.next_offical);
                    }
                    SharedPreferences sharedPreferences7 = context.getSharedPreferences("LuyenTapBa", MODE_PRIVATE);
                    String tex7 = sharedPreferences7.getString(TEXT, "");
                    text7.setText(tex7);
                    if( text7.getText().toString().length() > 0 ) {
                        card7.setCardBackgroundColor(0xFFEDEDED);
                        card7.setCardElevation(0);
                        image7.setImageResource(R.mipmap.tick_xanhs1);
                    }else{
                        card7.setCardBackgroundColor(Color.WHITE);
                        card7.setCardElevation(8);
                        image7.setImageResource(R.mipmap.next_offical);
                    }
                    SharedPreferences sharedPreferences8 = context.getSharedPreferences("QuaKhuD", MODE_PRIVATE);
                    String tex8 = sharedPreferences8.getString(TEXT, "");
                    text8.setText(tex8);
                    if( text8.getText().toString().length() > 0 ) {
                        card8.setCardBackgroundColor(0xFFEDEDED);
                        card8.setCardElevation(0);
                        image8.setImageResource(R.mipmap.tick_xanhs1);
                    }else{
                        card8.setCardBackgroundColor(Color.WHITE);
                        card8.setCardElevation(8);
                        image8.setImageResource(R.mipmap.next_offical);
                    }
                    SharedPreferences sharedPreferences9 = context.getSharedPreferences("QuaKhuTD", MODE_PRIVATE);
                    String tex9 = sharedPreferences9.getString(TEXT, "");
                    text9.setText(tex9);
                    if( text9.getText().toString().length() > 0 ) {
                        card9.setCardBackgroundColor(0xFFEDEDED);
                        card9.setCardElevation(0);
                        image9.setImageResource(R.mipmap.tick_xanhs1);
                    }else{
                        card9.setCardBackgroundColor(Color.WHITE);
                        card9.setCardElevation(8);
                        image9.setImageResource(R.mipmap.next_offical);
                    }
                    SharedPreferences sharedPreferences10 = context.getSharedPreferences("LuyenTapBon", MODE_PRIVATE);
                    String tex10 = sharedPreferences10.getString(TEXT, "");
                    text10.setText(tex10);
                    if( text10.getText().toString().length() > 0 ) {
                        card10.setCardBackgroundColor(0xFFEDEDED);
                        card10.setCardElevation(0);
                        image10.setImageResource(R.mipmap.tick_xanhs1);
                    }else{
                        card10.setCardBackgroundColor(Color.WHITE);
                        card10.setCardElevation(8);
                        image10.setImageResource(R.mipmap.next_offical);
                    }
                    SharedPreferences sharedPreferences11 = context.getSharedPreferences("QuaKhuHT", MODE_PRIVATE);
                    String tex11 = sharedPreferences11.getString(TEXT, "");
                    text11.setText(tex11);
                    if( text11.getText().toString().length() > 0 ) {
                        card11.setCardBackgroundColor(0xFFEDEDED);
                        card11.setCardElevation(0);
                        image11.setImageResource(R.mipmap.tick_xanhs1);
                    }else{
                        card11.setCardBackgroundColor(Color.WHITE);
                        card11.setCardElevation(8);
                        image11.setImageResource(R.mipmap.next_offical);
                    }
                }
            });
            button5.setOnClickListener(new View.OnClickListener(){
                @Override
                public void onClick(View v) {
                    Intent i = new Intent(v.getContext(), HienTaiHTTD.class);
                    v.getContext().startActivity(i);
                    SharedPreferences sharedPreferences6 = context.getSharedPreferences("LuyenTapHai", MODE_PRIVATE);
                    String tex6 = sharedPreferences6.getString(TEXT, "");
                    text6.setText(tex6);
                    if( text6.getText().toString().length() > 0 ) {
                        card6.setCardBackgroundColor(0xFFEDEDED);
                        card6.setCardElevation(0);
                        image6.setImageResource(R.mipmap.tick_xanhs1);
                    }else{
                        card6.setCardBackgroundColor(Color.WHITE);
                        card6.setCardElevation(8);
                        image6.setImageResource(R.mipmap.next_offical);
                    }
                    SharedPreferences sharedPreferences7 = context.getSharedPreferences("LuyenTapBa", MODE_PRIVATE);
                    String tex7 = sharedPreferences7.getString(TEXT, "");
                    text7.setText(tex7);
                    if( text7.getText().toString().length() > 0 ) {
                        card7.setCardBackgroundColor(0xFFEDEDED);
                        card7.setCardElevation(0);
                        image7.setImageResource(R.mipmap.tick_xanhs1);
                    }else{
                        card7.setCardBackgroundColor(Color.WHITE);
                        card7.setCardElevation(8);
                        image7.setImageResource(R.mipmap.next_offical);
                    }
                    SharedPreferences sharedPreferences8 = context.getSharedPreferences("QuaKhuD", MODE_PRIVATE);
                    String tex8 = sharedPreferences8.getString(TEXT, "");
                    text8.setText(tex8);
                    if( text8.getText().toString().length() > 0 ) {
                        card8.setCardBackgroundColor(0xFFEDEDED);
                        card8.setCardElevation(0);
                        image8.setImageResource(R.mipmap.tick_xanhs1);
                    }else{
                        card8.setCardBackgroundColor(Color.WHITE);
                        card8.setCardElevation(8);
                        image8.setImageResource(R.mipmap.next_offical);
                    }
                    SharedPreferences sharedPreferences9 = context.getSharedPreferences("QuaKhuTD", MODE_PRIVATE);
                    String tex9 = sharedPreferences9.getString(TEXT, "");
                    text9.setText(tex9);
                    if( text9.getText().toString().length() > 0 ) {
                        card9.setCardBackgroundColor(0xFFEDEDED);
                        card9.setCardElevation(0);
                        image9.setImageResource(R.mipmap.tick_xanhs1);
                    }else{
                        card9.setCardBackgroundColor(Color.WHITE);
                        card9.setCardElevation(8);
                        image9.setImageResource(R.mipmap.next_offical);
                    }
                    SharedPreferences sharedPreferences10 = context.getSharedPreferences("LuyenTapBon", MODE_PRIVATE);
                    String tex10 = sharedPreferences10.getString(TEXT, "");
                    text10.setText(tex10);
                    if( text10.getText().toString().length() > 0 ) {
                        card10.setCardBackgroundColor(0xFFEDEDED);
                        card10.setCardElevation(0);
                        image10.setImageResource(R.mipmap.tick_xanhs1);
                    }else{
                        card10.setCardBackgroundColor(Color.WHITE);
                        card10.setCardElevation(8);
                        image10.setImageResource(R.mipmap.next_offical);
                    }
                    SharedPreferences sharedPreferences11 = context.getSharedPreferences("QuaKhuHT", MODE_PRIVATE);
                    String tex11 = sharedPreferences11.getString(TEXT, "");
                    text11.setText(tex11);
                    if( text11.getText().toString().length() > 0 ) {
                        card11.setCardBackgroundColor(0xFFEDEDED);
                        card11.setCardElevation(0);
                        image11.setImageResource(R.mipmap.tick_xanhs1);
                    }else{
                        card11.setCardBackgroundColor(Color.WHITE);
                        card11.setCardElevation(8);
                        image11.setImageResource(R.mipmap.next_offical);
                    }
                    SharedPreferences sharedPreferences12 = context.getSharedPreferences("QuaKhuHTTD", MODE_PRIVATE);
                    String tex12 = sharedPreferences12.getString(TEXT, "");
                    text12.setText(tex12);
                    if( text12.getText().toString().length() > 0 ) {
                        card12.setCardBackgroundColor(0xFFEDEDED);
                        card12.setCardElevation(0);
                        image12.setImageResource(R.mipmap.tick_xanhs1);
                    }else{
                        card12.setCardBackgroundColor(Color.WHITE);
                        card12.setCardElevation(8);
                        image12.setImageResource(R.mipmap.next_offical);
                    }
                }
            });
            button6.setOnClickListener(new View.OnClickListener(){
                @Override
                public void onClick(View v) {
                    id_interstitial=6;
                    if (mInterstitialAd.isLoaded()) {
                        mInterstitialAd.show();
                    } else {
                        Intent i = new Intent(v.getContext(), LuyenTapHai.class);
                        v.getContext().startActivity(i);
                    }
                    SharedPreferences sharedPreferences6 = context.getSharedPreferences("LuyenTapHai", MODE_PRIVATE);
                    String tex6 = sharedPreferences6.getString(TEXT, "");
                    text6.setText(tex6);
                    if( text6.getText().toString().length() > 0 ) {
                        card6.setCardBackgroundColor(0xFFEDEDED);
                        card6.setCardElevation(0);
                        image6.setImageResource(R.mipmap.tick_xanhs1);
                    }else{
                        card6.setCardBackgroundColor(Color.WHITE);
                        card6.setCardElevation(8);
                        image6.setImageResource(R.mipmap.next_offical);
                    }
                    SharedPreferences sharedPreferences7 = context.getSharedPreferences("LuyenTapBa", MODE_PRIVATE);
                    String tex7 = sharedPreferences7.getString(TEXT, "");
                    text7.setText(tex7);
                    if( text7.getText().toString().length() > 0 ) {
                        card7.setCardBackgroundColor(0xFFEDEDED);
                        card7.setCardElevation(0);
                        image7.setImageResource(R.mipmap.tick_xanhs1);
                    }else{
                        card7.setCardBackgroundColor(Color.WHITE);
                        card7.setCardElevation(8);
                        image7.setImageResource(R.mipmap.next_offical);
                    }
                    SharedPreferences sharedPreferences8 = context.getSharedPreferences("QuaKhuD", MODE_PRIVATE);
                    String tex8 = sharedPreferences8.getString(TEXT, "");
                    text8.setText(tex8);
                    if( text8.getText().toString().length() > 0 ) {
                        card8.setCardBackgroundColor(0xFFEDEDED);
                        card8.setCardElevation(0);
                        image8.setImageResource(R.mipmap.tick_xanhs1);
                    }else{
                        card8.setCardBackgroundColor(Color.WHITE);
                        card8.setCardElevation(8);
                        image8.setImageResource(R.mipmap.next_offical);
                    }
                    SharedPreferences sharedPreferences9 = context.getSharedPreferences("QuaKhuTD", MODE_PRIVATE);
                    String tex9 = sharedPreferences9.getString(TEXT, "");
                    text9.setText(tex9);
                    if( text9.getText().toString().length() > 0 ) {
                        card9.setCardBackgroundColor(0xFFEDEDED);
                        card9.setCardElevation(0);
                        image9.setImageResource(R.mipmap.tick_xanhs1);
                    }else{
                        card9.setCardBackgroundColor(Color.WHITE);
                        card9.setCardElevation(8);
                        image9.setImageResource(R.mipmap.next_offical);
                    }
                    SharedPreferences sharedPreferences10 = context.getSharedPreferences("LuyenTapBon", MODE_PRIVATE);
                    String tex10 = sharedPreferences10.getString(TEXT, "");
                    text10.setText(tex10);
                    if( text10.getText().toString().length() > 0 ) {
                        card10.setCardBackgroundColor(0xFFEDEDED);
                        card10.setCardElevation(0);
                        image10.setImageResource(R.mipmap.tick_xanhs1);
                    }else{
                        card10.setCardBackgroundColor(Color.WHITE);
                        card10.setCardElevation(8);
                        image10.setImageResource(R.mipmap.next_offical);
                    }
                    SharedPreferences sharedPreferences11 = context.getSharedPreferences("QuaKhuHT", MODE_PRIVATE);
                    String tex11 = sharedPreferences11.getString(TEXT, "");
                    text11.setText(tex11);
                    if( text11.getText().toString().length() > 0 ) {
                        card11.setCardBackgroundColor(0xFFEDEDED);
                        card11.setCardElevation(0);
                        image11.setImageResource(R.mipmap.tick_xanhs1);
                    }else{
                        card11.setCardBackgroundColor(Color.WHITE);
                        card11.setCardElevation(8);
                        image11.setImageResource(R.mipmap.next_offical);
                    }
                    SharedPreferences sharedPreferences12 = context.getSharedPreferences("QuaKhuHTTD", MODE_PRIVATE);
                    String tex12 = sharedPreferences12.getString(TEXT, "");
                    text12.setText(tex12);
                    if( text12.getText().toString().length() > 0 ) {
                        card12.setCardBackgroundColor(0xFFEDEDED);
                        card12.setCardElevation(0);
                        image12.setImageResource(R.mipmap.tick_xanhs1);
                    }else{
                        card12.setCardBackgroundColor(Color.WHITE);
                        card12.setCardElevation(8);
                        image12.setImageResource(R.mipmap.next_offical);
                    }
                    SharedPreferences sharedPreferences13 = context.getSharedPreferences("LuyenTapNam", MODE_PRIVATE);
                    String tex13 = sharedPreferences13.getString(TEXT, "");
                    text13.setText(tex13);
                    if( text13.getText().toString().length() > 0 ) {
                        card13.setCardBackgroundColor(0xFFEDEDED);
                        card13.setCardElevation(0);
                        image13.setImageResource(R.mipmap.tick_xanhs1);
                    }else{
                        card13.setCardBackgroundColor(Color.WHITE);
                        card13.setCardElevation(8);
                        image13.setImageResource(R.mipmap.next_offical);
                    }
                }
            });
            button7.setOnClickListener(new View.OnClickListener(){
                @Override
                public void onClick(View v) {
                    Intent i = new Intent(v.getContext(), LuyenTapBa.class);
                    v.getContext().startActivity(i);
                    SharedPreferences sharedPreferences6 = context.getSharedPreferences("LuyenTapHai", MODE_PRIVATE);
                    String tex6 = sharedPreferences6.getString(TEXT, "");
                    text6.setText(tex6);
                    if( text6.getText().toString().length() > 0 ) {
                        card6.setCardBackgroundColor(0xFFEDEDED);
                        card6.setCardElevation(0);
                        image6.setImageResource(R.mipmap.tick_xanhs1);
                    }else{
                        card6.setCardBackgroundColor(Color.WHITE);
                        card6.setCardElevation(8);
                        image6.setImageResource(R.mipmap.next_offical);
                    }
                    SharedPreferences sharedPreferences7 = context.getSharedPreferences("LuyenTapBa", MODE_PRIVATE);
                    String tex7 = sharedPreferences7.getString(TEXT, "");
                    text7.setText(tex7);
                    if( text7.getText().toString().length() > 0 ) {
                        card7.setCardBackgroundColor(0xFFEDEDED);
                        card7.setCardElevation(0);
                        image7.setImageResource(R.mipmap.tick_xanhs1);
                    }else{
                        card7.setCardBackgroundColor(Color.WHITE);
                        card7.setCardElevation(8);
                        image7.setImageResource(R.mipmap.next_offical);
                    }
                    SharedPreferences sharedPreferences8 = context.getSharedPreferences("QuaKhuD", MODE_PRIVATE);
                    String tex8 = sharedPreferences8.getString(TEXT, "");
                    text8.setText(tex8);
                    if( text8.getText().toString().length() > 0 ) {
                        card8.setCardBackgroundColor(0xFFEDEDED);
                        card8.setCardElevation(0);
                        image8.setImageResource(R.mipmap.tick_xanhs1);
                    }else{
                        card8.setCardBackgroundColor(Color.WHITE);
                        card8.setCardElevation(8);
                        image8.setImageResource(R.mipmap.next_offical);
                    }
                    SharedPreferences sharedPreferences9 = context.getSharedPreferences("QuaKhuTD", MODE_PRIVATE);
                    String tex9 = sharedPreferences9.getString(TEXT, "");
                    text9.setText(tex9);
                    if( text9.getText().toString().length() > 0 ) {
                        card9.setCardBackgroundColor(0xFFEDEDED);
                        card9.setCardElevation(0);
                        image9.setImageResource(R.mipmap.tick_xanhs1);
                    }else{
                        card9.setCardBackgroundColor(Color.WHITE);
                        card9.setCardElevation(8);
                        image9.setImageResource(R.mipmap.next_offical);
                    }
                    SharedPreferences sharedPreferences10 = context.getSharedPreferences("LuyenTapBon", MODE_PRIVATE);
                    String tex10 = sharedPreferences10.getString(TEXT, "");
                    text10.setText(tex10);
                    if( text10.getText().toString().length() > 0 ) {
                        card10.setCardBackgroundColor(0xFFEDEDED);
                        card10.setCardElevation(0);
                        image10.setImageResource(R.mipmap.tick_xanhs1);
                    }else{
                        card10.setCardBackgroundColor(Color.WHITE);
                        card10.setCardElevation(8);
                        image10.setImageResource(R.mipmap.next_offical);
                    }
                    SharedPreferences sharedPreferences11 = context.getSharedPreferences("QuaKhuHT", MODE_PRIVATE);
                    String tex11 = sharedPreferences11.getString(TEXT, "");
                    text11.setText(tex11);
                    if( text11.getText().toString().length() > 0 ) {
                        card11.setCardBackgroundColor(0xFFEDEDED);
                        card11.setCardElevation(0);
                        image11.setImageResource(R.mipmap.tick_xanhs1);
                    }else{
                        card11.setCardBackgroundColor(Color.WHITE);
                        card11.setCardElevation(8);
                        image11.setImageResource(R.mipmap.next_offical);
                    }
                    SharedPreferences sharedPreferences12 = context.getSharedPreferences("QuaKhuHTTD", MODE_PRIVATE);
                    String tex12 = sharedPreferences12.getString(TEXT, "");
                    text12.setText(tex12);
                    if( text12.getText().toString().length() > 0 ) {
                        card12.setCardBackgroundColor(0xFFEDEDED);
                        card12.setCardElevation(0);
                        image12.setImageResource(R.mipmap.tick_xanhs1);
                    }else{
                        card12.setCardBackgroundColor(Color.WHITE);
                        card12.setCardElevation(8);
                        image12.setImageResource(R.mipmap.next_offical);
                    }
                    SharedPreferences sharedPreferences13 = context.getSharedPreferences("LuyenTapNam", MODE_PRIVATE);
                    String tex13 = sharedPreferences13.getString(TEXT, "");
                    text13.setText(tex13);
                    if( text13.getText().toString().length() > 0 ) {
                        card13.setCardBackgroundColor(0xFFEDEDED);
                        card13.setCardElevation(0);
                        image13.setImageResource(R.mipmap.tick_xanhs1);
                    }else{
                        card13.setCardBackgroundColor(Color.WHITE);
                        card13.setCardElevation(8);
                        image13.setImageResource(R.mipmap.next_offical);
                    }
                    SharedPreferences sharedPreferences14 = context.getSharedPreferences("LuyenTapSau", MODE_PRIVATE);
                    String tex14 = sharedPreferences14.getString(TEXT, "");
                    text14.setText(tex14);
                    if( text14.getText().toString().length() > 0 ) {
                        card14.setCardBackgroundColor(0xFFEDEDED);
                        card14.setCardElevation(0);
                        image14.setImageResource(R.mipmap.tick_xanhs1);
                    }else{
                        card14.setCardBackgroundColor(Color.WHITE);
                        card14.setCardElevation(8);
                        image14.setImageResource(R.mipmap.next_offical);
                    }
                }
            });

            button8.setOnClickListener(new View.OnClickListener(){
                @Override
                public void onClick(View v) {
                    Intent i = new Intent(v.getContext(), QuaKhuD.class);
                    v.getContext().startActivity(i);
                    SharedPreferences sharedPreferences6 = context.getSharedPreferences("LuyenTapHai", MODE_PRIVATE);
                    String tex6 = sharedPreferences6.getString(TEXT, "");
                    text6.setText(tex6);
                    if( text6.getText().toString().length() > 0 ) {
                        card6.setCardBackgroundColor(0xFFEDEDED);
                        card6.setCardElevation(0);
                        image6.setImageResource(R.mipmap.tick_xanhs1);
                    }else{
                        card6.setCardBackgroundColor(Color.WHITE);
                        card6.setCardElevation(8);
                        image6.setImageResource(R.mipmap.next_offical);
                    }
                    SharedPreferences sharedPreferences7 = context.getSharedPreferences("LuyenTapBa", MODE_PRIVATE);
                    String tex7 = sharedPreferences7.getString(TEXT, "");
                    text7.setText(tex7);
                    if( text7.getText().toString().length() > 0 ) {
                        card7.setCardBackgroundColor(0xFFEDEDED);
                        card7.setCardElevation(0);
                        image7.setImageResource(R.mipmap.tick_xanhs1);
                    }else{
                        card7.setCardBackgroundColor(Color.WHITE);
                        card7.setCardElevation(8);
                        image7.setImageResource(R.mipmap.next_offical);
                    }
                    SharedPreferences sharedPreferences8 = context.getSharedPreferences("QuaKhuD", MODE_PRIVATE);
                    String tex8 = sharedPreferences8.getString(TEXT, "");
                    text8.setText(tex8);
                    if( text8.getText().toString().length() > 0 ) {
                        card8.setCardBackgroundColor(0xFFEDEDED);
                        card8.setCardElevation(0);
                        image8.setImageResource(R.mipmap.tick_xanhs1);
                    }else{
                        card8.setCardBackgroundColor(Color.WHITE);
                        card8.setCardElevation(8);
                        image8.setImageResource(R.mipmap.next_offical);
                    }
                    SharedPreferences sharedPreferences9 = context.getSharedPreferences("QuaKhuTD", MODE_PRIVATE);
                    String tex9 = sharedPreferences9.getString(TEXT, "");
                    text9.setText(tex9);
                    if( text9.getText().toString().length() > 0 ) {
                        card9.setCardBackgroundColor(0xFFEDEDED);
                        card9.setCardElevation(0);
                        image9.setImageResource(R.mipmap.tick_xanhs1);
                    }else{
                        card9.setCardBackgroundColor(Color.WHITE);
                        card9.setCardElevation(8);
                        image9.setImageResource(R.mipmap.next_offical);
                    }
                    SharedPreferences sharedPreferences10 = context.getSharedPreferences("LuyenTapBon", MODE_PRIVATE);
                    String tex10 = sharedPreferences10.getString(TEXT, "");
                    text10.setText(tex10);
                    if( text10.getText().toString().length() > 0 ) {
                        card10.setCardBackgroundColor(0xFFEDEDED);
                        card10.setCardElevation(0);
                        image10.setImageResource(R.mipmap.tick_xanhs1);
                    }else{
                        card10.setCardBackgroundColor(Color.WHITE);
                        card10.setCardElevation(8);
                        image10.setImageResource(R.mipmap.next_offical);
                    }
                    SharedPreferences sharedPreferences11 = context.getSharedPreferences("QuaKhuHT", MODE_PRIVATE);
                    String tex11 = sharedPreferences11.getString(TEXT, "");
                    text11.setText(tex11);
                    if( text11.getText().toString().length() > 0 ) {
                        card11.setCardBackgroundColor(0xFFEDEDED);
                        card11.setCardElevation(0);
                        image11.setImageResource(R.mipmap.tick_xanhs1);
                    }else{
                        card11.setCardBackgroundColor(Color.WHITE);
                        card11.setCardElevation(8);
                        image11.setImageResource(R.mipmap.next_offical);
                    }
                    SharedPreferences sharedPreferences12 = context.getSharedPreferences("QuaKhuHTTD", MODE_PRIVATE);
                    String tex12 = sharedPreferences12.getString(TEXT, "");
                    text12.setText(tex12);
                    if( text12.getText().toString().length() > 0 ) {
                        card12.setCardBackgroundColor(0xFFEDEDED);
                        card12.setCardElevation(0);
                        image12.setImageResource(R.mipmap.tick_xanhs1);
                    }else{
                        card12.setCardBackgroundColor(Color.WHITE);
                        card12.setCardElevation(8);
                        image12.setImageResource(R.mipmap.next_offical);
                    }
                    SharedPreferences sharedPreferences13 = context.getSharedPreferences("LuyenTapNam", MODE_PRIVATE);
                    String tex13 = sharedPreferences13.getString(TEXT, "");
                    text13.setText(tex13);
                    if( text13.getText().toString().length() > 0 ) {
                        card13.setCardBackgroundColor(0xFFEDEDED);
                        card13.setCardElevation(0);
                        image13.setImageResource(R.mipmap.tick_xanhs1);
                    }else{
                        card13.setCardBackgroundColor(Color.WHITE);
                        card13.setCardElevation(8);
                        image13.setImageResource(R.mipmap.next_offical);
                    }
                    SharedPreferences sharedPreferences14 = context.getSharedPreferences("LuyenTapSau", MODE_PRIVATE);
                    String tex14 = sharedPreferences14.getString(TEXT, "");
                    text14.setText(tex14);
                    if( text14.getText().toString().length() > 0 ) {
                        card14.setCardBackgroundColor(0xFFEDEDED);
                        card14.setCardElevation(0);
                        image14.setImageResource(R.mipmap.tick_xanhs1);
                    }else{
                        card14.setCardBackgroundColor(Color.WHITE);
                        card14.setCardElevation(8);
                        image14.setImageResource(R.mipmap.next_offical);
                    }
                    SharedPreferences sharedPreferences15 = context.getSharedPreferences("TuongLaiD", MODE_PRIVATE);
                    String tex15 = sharedPreferences15.getString(TEXT, "");
                    text15.setText(tex15);
                    if( text15.getText().toString().length() > 0 ) {
                        card15.setCardBackgroundColor(0xFFEDEDED);
                        card15.setCardElevation(0);
                        image15.setImageResource(R.mipmap.tick_xanhs1);
                    }else{
                        card15.setCardBackgroundColor(Color.WHITE);
                        card15.setCardElevation(8);
                        image15.setImageResource(R.mipmap.next_offical);
                    }
                }
            });
            button9.setOnClickListener(new View.OnClickListener(){
                @Override
                public void onClick(View v) {
                    Intent i = new Intent(v.getContext(), QuaKhuTD.class);
                    v.getContext().startActivity(i);
                    SharedPreferences sharedPreferences6 = context.getSharedPreferences("LuyenTapHai", MODE_PRIVATE);
                    String tex6 = sharedPreferences6.getString(TEXT, "");
                    text6.setText(tex6);
                    if( text6.getText().toString().length() > 0 ) {
                        card6.setCardBackgroundColor(0xFFEDEDED);
                        card6.setCardElevation(0);
                        image6.setImageResource(R.mipmap.tick_xanhs1);
                    }else{
                        card6.setCardBackgroundColor(Color.WHITE);
                        card6.setCardElevation(8);
                        image6.setImageResource(R.mipmap.next_offical);
                    }
                    SharedPreferences sharedPreferences7 = context.getSharedPreferences("LuyenTapBa", MODE_PRIVATE);
                    String tex7 = sharedPreferences7.getString(TEXT, "");
                    text7.setText(tex7);
                    if( text7.getText().toString().length() > 0 ) {
                        card7.setCardBackgroundColor(0xFFEDEDED);
                        card7.setCardElevation(0);
                        image7.setImageResource(R.mipmap.tick_xanhs1);
                    }else{
                        card7.setCardBackgroundColor(Color.WHITE);
                        card7.setCardElevation(8);
                        image7.setImageResource(R.mipmap.next_offical);
                    }
                    SharedPreferences sharedPreferences8 = context.getSharedPreferences("QuaKhuD", MODE_PRIVATE);
                    String tex8 = sharedPreferences8.getString(TEXT, "");
                    text8.setText(tex8);
                    if( text8.getText().toString().length() > 0 ) {
                        card8.setCardBackgroundColor(0xFFEDEDED);
                        card8.setCardElevation(0);
                        image8.setImageResource(R.mipmap.tick_xanhs1);
                    }else{
                        card8.setCardBackgroundColor(Color.WHITE);
                        card8.setCardElevation(8);
                        image8.setImageResource(R.mipmap.next_offical);
                    }
                    SharedPreferences sharedPreferences9 = context.getSharedPreferences("QuaKhuTD", MODE_PRIVATE);
                    String tex9 = sharedPreferences9.getString(TEXT, "");
                    text9.setText(tex9);
                    if( text9.getText().toString().length() > 0 ) {
                        card9.setCardBackgroundColor(0xFFEDEDED);
                        card9.setCardElevation(0);
                        image9.setImageResource(R.mipmap.tick_xanhs1);
                    }else{
                        card9.setCardBackgroundColor(Color.WHITE);
                        card9.setCardElevation(8);
                        image9.setImageResource(R.mipmap.next_offical);
                    }
                    SharedPreferences sharedPreferences10 = context.getSharedPreferences("LuyenTapBon", MODE_PRIVATE);
                    String tex10 = sharedPreferences10.getString(TEXT, "");
                    text10.setText(tex10);
                    if( text10.getText().toString().length() > 0 ) {
                        card10.setCardBackgroundColor(0xFFEDEDED);
                        card10.setCardElevation(0);
                        image10.setImageResource(R.mipmap.tick_xanhs1);
                    }else{
                        card10.setCardBackgroundColor(Color.WHITE);
                        card10.setCardElevation(8);
                        image10.setImageResource(R.mipmap.next_offical);
                    }
                    SharedPreferences sharedPreferences11 = context.getSharedPreferences("QuaKhuHT", MODE_PRIVATE);
                    String tex11 = sharedPreferences11.getString(TEXT, "");
                    text11.setText(tex11);
                    if( text11.getText().toString().length() > 0 ) {
                        card11.setCardBackgroundColor(0xFFEDEDED);
                        card11.setCardElevation(0);
                        image11.setImageResource(R.mipmap.tick_xanhs1);
                    }else{
                        card11.setCardBackgroundColor(Color.WHITE);
                        card11.setCardElevation(8);
                        image11.setImageResource(R.mipmap.next_offical);
                    }
                    SharedPreferences sharedPreferences12 = context.getSharedPreferences("QuaKhuHTTD", MODE_PRIVATE);
                    String tex12 = sharedPreferences12.getString(TEXT, "");
                    text12.setText(tex12);
                    if( text12.getText().toString().length() > 0 ) {
                        card12.setCardBackgroundColor(0xFFEDEDED);
                        card12.setCardElevation(0);
                        image12.setImageResource(R.mipmap.tick_xanhs1);
                    }else{
                        card12.setCardBackgroundColor(Color.WHITE);
                        card12.setCardElevation(8);
                        image12.setImageResource(R.mipmap.next_offical);
                    }
                    SharedPreferences sharedPreferences13 = context.getSharedPreferences("LuyenTapNam", MODE_PRIVATE);
                    String tex13 = sharedPreferences13.getString(TEXT, "");
                    text13.setText(tex13);
                    if( text13.getText().toString().length() > 0 ) {
                        card13.setCardBackgroundColor(0xFFEDEDED);
                        card13.setCardElevation(0);
                        image13.setImageResource(R.mipmap.tick_xanhs1);
                    }else{
                        card13.setCardBackgroundColor(Color.WHITE);
                        card13.setCardElevation(8);
                        image13.setImageResource(R.mipmap.next_offical);
                    }
                    SharedPreferences sharedPreferences14 = context.getSharedPreferences("LuyenTapSau", MODE_PRIVATE);
                    String tex14 = sharedPreferences14.getString(TEXT, "");
                    text14.setText(tex14);
                    if( text14.getText().toString().length() > 0 ) {
                        card14.setCardBackgroundColor(0xFFEDEDED);
                        card14.setCardElevation(0);
                        image14.setImageResource(R.mipmap.tick_xanhs1);
                    }else{
                        card14.setCardBackgroundColor(Color.WHITE);
                        card14.setCardElevation(8);
                        image14.setImageResource(R.mipmap.next_offical);
                    }
                    SharedPreferences sharedPreferences15 = context.getSharedPreferences("TuongLaiD", MODE_PRIVATE);
                    String tex15 = sharedPreferences15.getString(TEXT, "");
                    text15.setText(tex15);
                    if( text15.getText().toString().length() > 0 ) {
                        card15.setCardBackgroundColor(0xFFEDEDED);
                        card15.setCardElevation(0);
                        image15.setImageResource(R.mipmap.tick_xanhs1);
                    }else{
                        card15.setCardBackgroundColor(Color.WHITE);
                        card15.setCardElevation(8);
                        image15.setImageResource(R.mipmap.next_offical);
                    }
                    SharedPreferences sharedPreferences16 = context.getSharedPreferences("TuongLaiTD", MODE_PRIVATE);
                    String tex16 = sharedPreferences16.getString(TEXT, "");
                    text16.setText(tex16);
                    if( text16.getText().toString().length() > 0 ) {
                        card16.setCardBackgroundColor(0xFFEDEDED);
                        card16.setCardElevation(0);
                        image16.setImageResource(R.mipmap.tick_xanhs1);
                    }else{
                        card16.setCardBackgroundColor(Color.WHITE);
                        card16.setCardElevation(8);
                        image16.setImageResource(R.mipmap.next_offical);
                    }
                }
            });
            button10.setOnClickListener(new View.OnClickListener(){
                @Override
                public void onClick(View v) {
                    id_interstitial=10;
                    if (mInterstitialAd.isLoaded()) {
                        mInterstitialAd.show();
                    } else {
                        Intent i = new Intent(v.getContext(), LuyenTapBon.class);
                        v.getContext().startActivity(i);
                    }
                    SharedPreferences sharedPreferences6 = context.getSharedPreferences("LuyenTapHai", MODE_PRIVATE);
                    String tex6 = sharedPreferences6.getString(TEXT, "");
                    text6.setText(tex6);
                    if( text6.getText().toString().length() > 0 ) {
                        card6.setCardBackgroundColor(0xFFEDEDED);
                        card6.setCardElevation(0);
                        image6.setImageResource(R.mipmap.tick_xanhs1);
                    }else{
                        card6.setCardBackgroundColor(Color.WHITE);
                        card6.setCardElevation(8);
                        image6.setImageResource(R.mipmap.next_offical);
                    }
                    SharedPreferences sharedPreferences7 = context.getSharedPreferences("LuyenTapBa", MODE_PRIVATE);
                    String tex7 = sharedPreferences7.getString(TEXT, "");
                    text7.setText(tex7);
                    if( text7.getText().toString().length() > 0 ) {
                        card7.setCardBackgroundColor(0xFFEDEDED);
                        card7.setCardElevation(0);
                        image7.setImageResource(R.mipmap.tick_xanhs1);
                    }else{
                        card7.setCardBackgroundColor(Color.WHITE);
                        card7.setCardElevation(8);
                        image7.setImageResource(R.mipmap.next_offical);
                    }
                    SharedPreferences sharedPreferences8 = context.getSharedPreferences("QuaKhuD", MODE_PRIVATE);
                    String tex8 = sharedPreferences8.getString(TEXT, "");
                    text8.setText(tex8);
                    if( text8.getText().toString().length() > 0 ) {
                        card8.setCardBackgroundColor(0xFFEDEDED);
                        card8.setCardElevation(0);
                        image8.setImageResource(R.mipmap.tick_xanhs1);
                    }else{
                        card8.setCardBackgroundColor(Color.WHITE);
                        card8.setCardElevation(8);
                        image8.setImageResource(R.mipmap.next_offical);
                    }
                    SharedPreferences sharedPreferences9 = context.getSharedPreferences("QuaKhuTD", MODE_PRIVATE);
                    String tex9 = sharedPreferences9.getString(TEXT, "");
                    text9.setText(tex9);
                    if( text9.getText().toString().length() > 0 ) {
                        card9.setCardBackgroundColor(0xFFEDEDED);
                        card9.setCardElevation(0);
                        image9.setImageResource(R.mipmap.tick_xanhs1);
                    }else{
                        card9.setCardBackgroundColor(Color.WHITE);
                        card9.setCardElevation(8);
                        image9.setImageResource(R.mipmap.next_offical);
                    }
                    SharedPreferences sharedPreferences10 = context.getSharedPreferences("LuyenTapBon", MODE_PRIVATE);
                    String tex10 = sharedPreferences10.getString(TEXT, "");
                    text10.setText(tex10);
                    if( text10.getText().toString().length() > 0 ) {
                        card10.setCardBackgroundColor(0xFFEDEDED);
                        card10.setCardElevation(0);
                        image10.setImageResource(R.mipmap.tick_xanhs1);
                    }else{
                        card10.setCardBackgroundColor(Color.WHITE);
                        card10.setCardElevation(8);
                        image10.setImageResource(R.mipmap.next_offical);
                    }
                    SharedPreferences sharedPreferences11 = context.getSharedPreferences("QuaKhuHT", MODE_PRIVATE);
                    String tex11 = sharedPreferences11.getString(TEXT, "");
                    text11.setText(tex11);
                    if( text11.getText().toString().length() > 0 ) {
                        card11.setCardBackgroundColor(0xFFEDEDED);
                        card11.setCardElevation(0);
                        image11.setImageResource(R.mipmap.tick_xanhs1);
                    }else{
                        card11.setCardBackgroundColor(Color.WHITE);
                        card11.setCardElevation(8);
                        image11.setImageResource(R.mipmap.next_offical);
                    }
                    SharedPreferences sharedPreferences12 = context.getSharedPreferences("QuaKhuHTTD", MODE_PRIVATE);
                    String tex12 = sharedPreferences12.getString(TEXT, "");
                    text12.setText(tex12);
                    if( text12.getText().toString().length() > 0 ) {
                        card12.setCardBackgroundColor(0xFFEDEDED);
                        card12.setCardElevation(0);
                        image12.setImageResource(R.mipmap.tick_xanhs1);
                    }else{
                        card12.setCardBackgroundColor(Color.WHITE);
                        card12.setCardElevation(8);
                        image12.setImageResource(R.mipmap.next_offical);
                    }
                    SharedPreferences sharedPreferences13 = context.getSharedPreferences("LuyenTapNam", MODE_PRIVATE);
                    String tex13 = sharedPreferences13.getString(TEXT, "");
                    text13.setText(tex13);
                    if( text13.getText().toString().length() > 0 ) {
                        card13.setCardBackgroundColor(0xFFEDEDED);
                        card13.setCardElevation(0);
                        image13.setImageResource(R.mipmap.tick_xanhs1);
                    }else{
                        card13.setCardBackgroundColor(Color.WHITE);
                        card13.setCardElevation(8);
                        image13.setImageResource(R.mipmap.next_offical);
                    }
                    SharedPreferences sharedPreferences14 = context.getSharedPreferences("LuyenTapSau", MODE_PRIVATE);
                    String tex14 = sharedPreferences14.getString(TEXT, "");
                    text14.setText(tex14);
                    if( text14.getText().toString().length() > 0 ) {
                        card14.setCardBackgroundColor(0xFFEDEDED);
                        card14.setCardElevation(0);
                        image14.setImageResource(R.mipmap.tick_xanhs1);
                    }else{
                        card14.setCardBackgroundColor(Color.WHITE);
                        card14.setCardElevation(8);
                        image14.setImageResource(R.mipmap.next_offical);
                    }
                    SharedPreferences sharedPreferences15 = context.getSharedPreferences("TuongLaiD", MODE_PRIVATE);
                    String tex15 = sharedPreferences15.getString(TEXT, "");
                    text15.setText(tex15);
                    if( text15.getText().toString().length() > 0 ) {
                        card15.setCardBackgroundColor(0xFFEDEDED);
                        card15.setCardElevation(0);
                        image15.setImageResource(R.mipmap.tick_xanhs1);
                    }else{
                        card15.setCardBackgroundColor(Color.WHITE);
                        card15.setCardElevation(8);
                        image15.setImageResource(R.mipmap.next_offical);
                    }
                    SharedPreferences sharedPreferences16 = context.getSharedPreferences("TuongLaiTD", MODE_PRIVATE);
                    String tex16 = sharedPreferences16.getString(TEXT, "");
                    text16.setText(tex16);
                    if( text16.getText().toString().length() > 0 ) {
                        card16.setCardBackgroundColor(0xFFEDEDED);
                        card16.setCardElevation(0);
                        image16.setImageResource(R.mipmap.tick_xanhs1);
                    }else{
                        card16.setCardBackgroundColor(Color.WHITE);
                        card16.setCardElevation(8);
                        image16.setImageResource(R.mipmap.next_offical);
                    }
                    SharedPreferences sharedPreferences17 = context.getSharedPreferences("LuyenTapBay", MODE_PRIVATE);
                    String tex17 = sharedPreferences17.getString(TEXT, "");
                    text17.setText(tex17);
                    if( text17.getText().toString().length() > 0 ) {
                        card17.setCardBackgroundColor(0xFFEDEDED);
                        card17.setCardElevation(0);
                        image17.setImageResource(R.mipmap.tick_xanhs1);
                    }else{
                        card17.setCardBackgroundColor(Color.WHITE);
                        card17.setCardElevation(8);
                        image17.setImageResource(R.mipmap.next_offical);
                    }
                }
            });
            button11.setOnClickListener(new View.OnClickListener(){
                @Override
                public void onClick(View v) {
                    Intent i = new Intent(v.getContext(), QuaKhuHT.class);
                    v.getContext().startActivity(i);
                    SharedPreferences sharedPreferences6 = context.getSharedPreferences("LuyenTapHai", MODE_PRIVATE);
                    String tex6 = sharedPreferences6.getString(TEXT, "");
                    text6.setText(tex6);
                    if( text6.getText().toString().length() > 0 ) {
                        card6.setCardBackgroundColor(0xFFEDEDED);
                        card6.setCardElevation(0);
                        image6.setImageResource(R.mipmap.tick_xanhs1);
                    }else{
                        card6.setCardBackgroundColor(Color.WHITE);
                        card6.setCardElevation(8);
                        image6.setImageResource(R.mipmap.next_offical);
                    }
                    SharedPreferences sharedPreferences7 = context.getSharedPreferences("LuyenTapBa", MODE_PRIVATE);
                    String tex7 = sharedPreferences7.getString(TEXT, "");
                    text7.setText(tex7);
                    if( text7.getText().toString().length() > 0 ) {
                        card7.setCardBackgroundColor(0xFFEDEDED);
                        card7.setCardElevation(0);
                        image7.setImageResource(R.mipmap.tick_xanhs1);
                    }else{
                        card7.setCardBackgroundColor(Color.WHITE);
                        card7.setCardElevation(8);
                        image7.setImageResource(R.mipmap.next_offical);
                    }
                    SharedPreferences sharedPreferences8 = context.getSharedPreferences("QuaKhuD", MODE_PRIVATE);
                    String tex8 = sharedPreferences8.getString(TEXT, "");
                    text8.setText(tex8);
                    if( text8.getText().toString().length() > 0 ) {
                        card8.setCardBackgroundColor(0xFFEDEDED);
                        card8.setCardElevation(0);
                        image8.setImageResource(R.mipmap.tick_xanhs1);
                    }else{
                        card8.setCardBackgroundColor(Color.WHITE);
                        card8.setCardElevation(8);
                        image8.setImageResource(R.mipmap.next_offical);
                    }
                    SharedPreferences sharedPreferences9 = context.getSharedPreferences("QuaKhuTD", MODE_PRIVATE);
                    String tex9 = sharedPreferences9.getString(TEXT, "");
                    text9.setText(tex9);
                    if( text9.getText().toString().length() > 0 ) {
                        card9.setCardBackgroundColor(0xFFEDEDED);
                        card9.setCardElevation(0);
                        image9.setImageResource(R.mipmap.tick_xanhs1);
                    }else{
                        card9.setCardBackgroundColor(Color.WHITE);
                        card9.setCardElevation(8);
                        image9.setImageResource(R.mipmap.next_offical);
                    }
                    SharedPreferences sharedPreferences10 = context.getSharedPreferences("LuyenTapBon", MODE_PRIVATE);
                    String tex10 = sharedPreferences10.getString(TEXT, "");
                    text10.setText(tex10);
                    if( text10.getText().toString().length() > 0 ) {
                        card10.setCardBackgroundColor(0xFFEDEDED);
                        card10.setCardElevation(0);
                        image10.setImageResource(R.mipmap.tick_xanhs1);
                    }else{
                        card10.setCardBackgroundColor(Color.WHITE);
                        card10.setCardElevation(8);
                        image10.setImageResource(R.mipmap.next_offical);
                    }
                    SharedPreferences sharedPreferences11 = context.getSharedPreferences("QuaKhuHT", MODE_PRIVATE);
                    String tex11 = sharedPreferences11.getString(TEXT, "");
                    text11.setText(tex11);
                    if( text11.getText().toString().length() > 0 ) {
                        card11.setCardBackgroundColor(0xFFEDEDED);
                        card11.setCardElevation(0);
                        image11.setImageResource(R.mipmap.tick_xanhs1);
                    }else{
                        card11.setCardBackgroundColor(Color.WHITE);
                        card11.setCardElevation(8);
                        image11.setImageResource(R.mipmap.next_offical);
                    }
                    SharedPreferences sharedPreferences12 = context.getSharedPreferences("QuaKhuHTTD", MODE_PRIVATE);
                    String tex12 = sharedPreferences12.getString(TEXT, "");
                    text12.setText(tex12);
                    if( text12.getText().toString().length() > 0 ) {
                        card12.setCardBackgroundColor(0xFFEDEDED);
                        card12.setCardElevation(0);
                        image12.setImageResource(R.mipmap.tick_xanhs1);
                    }else{
                        card12.setCardBackgroundColor(Color.WHITE);
                        card12.setCardElevation(8);
                        image12.setImageResource(R.mipmap.next_offical);
                    }
                    SharedPreferences sharedPreferences13 = context.getSharedPreferences("LuyenTapNam", MODE_PRIVATE);
                    String tex13 = sharedPreferences13.getString(TEXT, "");
                    text13.setText(tex13);
                    if( text13.getText().toString().length() > 0 ) {
                        card13.setCardBackgroundColor(0xFFEDEDED);
                        card13.setCardElevation(0);
                        image13.setImageResource(R.mipmap.tick_xanhs1);
                    }else{
                        card13.setCardBackgroundColor(Color.WHITE);
                        card13.setCardElevation(8);
                        image13.setImageResource(R.mipmap.next_offical);
                    }
                    SharedPreferences sharedPreferences14 = context.getSharedPreferences("LuyenTapSau", MODE_PRIVATE);
                    String tex14 = sharedPreferences14.getString(TEXT, "");
                    text14.setText(tex14);
                    if( text14.getText().toString().length() > 0 ) {
                        card14.setCardBackgroundColor(0xFFEDEDED);
                        card14.setCardElevation(0);
                        image14.setImageResource(R.mipmap.tick_xanhs1);
                    }else{
                        card14.setCardBackgroundColor(Color.WHITE);
                        card14.setCardElevation(8);
                        image14.setImageResource(R.mipmap.next_offical);
                    }
                    SharedPreferences sharedPreferences15 = context.getSharedPreferences("TuongLaiD", MODE_PRIVATE);
                    String tex15 = sharedPreferences15.getString(TEXT, "");
                    text15.setText(tex15);
                    if( text15.getText().toString().length() > 0 ) {
                        card15.setCardBackgroundColor(0xFFEDEDED);
                        card15.setCardElevation(0);
                        image15.setImageResource(R.mipmap.tick_xanhs1);
                    }else{
                        card15.setCardBackgroundColor(Color.WHITE);
                        card15.setCardElevation(8);
                        image15.setImageResource(R.mipmap.next_offical);
                    }
                    SharedPreferences sharedPreferences16 = context.getSharedPreferences("TuongLaiTD", MODE_PRIVATE);
                    String tex16 = sharedPreferences16.getString(TEXT, "");
                    text16.setText(tex16);
                    if( text16.getText().toString().length() > 0 ) {
                        card16.setCardBackgroundColor(0xFFEDEDED);
                        card16.setCardElevation(0);
                        image16.setImageResource(R.mipmap.tick_xanhs1);
                    }else{
                        card16.setCardBackgroundColor(Color.WHITE);
                        card16.setCardElevation(8);
                        image16.setImageResource(R.mipmap.next_offical);
                    }
                    SharedPreferences sharedPreferences17 = context.getSharedPreferences("LuyenTapBay", MODE_PRIVATE);
                    String tex17 = sharedPreferences17.getString(TEXT, "");
                    text17.setText(tex17);
                    if( text17.getText().toString().length() > 0 ) {
                        card17.setCardBackgroundColor(0xFFEDEDED);
                        card17.setCardElevation(0);
                        image17.setImageResource(R.mipmap.tick_xanhs1);
                    }else{
                        card17.setCardBackgroundColor(Color.WHITE);
                        card17.setCardElevation(8);
                        image17.setImageResource(R.mipmap.next_offical);
                    }
                    SharedPreferences sharedPreferences18 = context.getSharedPreferences("TuongLaiHT", MODE_PRIVATE);
                    String tex18 = sharedPreferences18.getString(TEXT, "");
                    text18.setText(tex18);
                    if( text18.getText().toString().length() > 0 ) {
                        card18.setCardBackgroundColor(0xFFEDEDED);
                        card18.setCardElevation(0);
                        image18.setImageResource(R.mipmap.tick_xanhs1);
                    }else{
                        card18.setCardBackgroundColor(Color.WHITE);
                        card18.setCardElevation(8);
                        image18.setImageResource(R.mipmap.next_offical);
                    }
                }
            });
            button12.setOnClickListener(new View.OnClickListener(){
                @Override
                public void onClick(View v) {
                    Intent i = new Intent(v.getContext(), QuaKhuHTTD.class);
                    v.getContext().startActivity(i);
                    SharedPreferences sharedPreferences6 = context.getSharedPreferences("LuyenTapHai", MODE_PRIVATE);
                    String tex6 = sharedPreferences6.getString(TEXT, "");
                    text6.setText(tex6);
                    if( text6.getText().toString().length() > 0 ) {
                        card6.setCardBackgroundColor(0xFFEDEDED);
                        card6.setCardElevation(0);
                        image6.setImageResource(R.mipmap.tick_xanhs1);
                    }else{
                        card6.setCardBackgroundColor(Color.WHITE);
                        card6.setCardElevation(8);
                        image6.setImageResource(R.mipmap.next_offical);
                    }
                    SharedPreferences sharedPreferences7 = context.getSharedPreferences("LuyenTapBa", MODE_PRIVATE);
                    String tex7 = sharedPreferences7.getString(TEXT, "");
                    text7.setText(tex7);
                    if( text7.getText().toString().length() > 0 ) {
                        card7.setCardBackgroundColor(0xFFEDEDED);
                        card7.setCardElevation(0);
                        image7.setImageResource(R.mipmap.tick_xanhs1);
                    }else{
                        card7.setCardBackgroundColor(Color.WHITE);
                        card7.setCardElevation(8);
                        image7.setImageResource(R.mipmap.next_offical);
                    }
                    SharedPreferences sharedPreferences8 = context.getSharedPreferences("QuaKhuD", MODE_PRIVATE);
                    String tex8 = sharedPreferences8.getString(TEXT, "");
                    text8.setText(tex8);
                    if( text8.getText().toString().length() > 0 ) {
                        card8.setCardBackgroundColor(0xFFEDEDED);
                        card8.setCardElevation(0);
                        image8.setImageResource(R.mipmap.tick_xanhs1);
                    }else{
                        card8.setCardBackgroundColor(Color.WHITE);
                        card8.setCardElevation(8);
                        image8.setImageResource(R.mipmap.next_offical);
                    }
                    SharedPreferences sharedPreferences9 = context.getSharedPreferences("QuaKhuTD", MODE_PRIVATE);
                    String tex9 = sharedPreferences9.getString(TEXT, "");
                    text9.setText(tex9);
                    if( text9.getText().toString().length() > 0 ) {
                        card9.setCardBackgroundColor(0xFFEDEDED);
                        card9.setCardElevation(0);
                        image9.setImageResource(R.mipmap.tick_xanhs1);
                    }else{
                        card9.setCardBackgroundColor(Color.WHITE);
                        card9.setCardElevation(8);
                        image9.setImageResource(R.mipmap.next_offical);
                    }
                    SharedPreferences sharedPreferences10 = context.getSharedPreferences("LuyenTapBon", MODE_PRIVATE);
                    String tex10 = sharedPreferences10.getString(TEXT, "");
                    text10.setText(tex10);
                    if( text10.getText().toString().length() > 0 ) {
                        card10.setCardBackgroundColor(0xFFEDEDED);
                        card10.setCardElevation(0);
                        image10.setImageResource(R.mipmap.tick_xanhs1);
                    }else{
                        card10.setCardBackgroundColor(Color.WHITE);
                        card10.setCardElevation(8);
                        image10.setImageResource(R.mipmap.next_offical);
                    }
                    SharedPreferences sharedPreferences11 = context.getSharedPreferences("QuaKhuHT", MODE_PRIVATE);
                    String tex11 = sharedPreferences11.getString(TEXT, "");
                    text11.setText(tex11);
                    if( text11.getText().toString().length() > 0 ) {
                        card11.setCardBackgroundColor(0xFFEDEDED);
                        card11.setCardElevation(0);
                        image11.setImageResource(R.mipmap.tick_xanhs1);
                    }else{
                        card11.setCardBackgroundColor(Color.WHITE);
                        card11.setCardElevation(8);
                        image11.setImageResource(R.mipmap.next_offical);
                    }
                    SharedPreferences sharedPreferences12 = context.getSharedPreferences("QuaKhuHTTD", MODE_PRIVATE);
                    String tex12 = sharedPreferences12.getString(TEXT, "");
                    text12.setText(tex12);
                    if( text12.getText().toString().length() > 0 ) {
                        card12.setCardBackgroundColor(0xFFEDEDED);
                        card12.setCardElevation(0);
                        image12.setImageResource(R.mipmap.tick_xanhs1);
                    }else{
                        card12.setCardBackgroundColor(Color.WHITE);
                        card12.setCardElevation(8);
                        image12.setImageResource(R.mipmap.next_offical);
                    }
                    SharedPreferences sharedPreferences13 = context.getSharedPreferences("LuyenTapNam", MODE_PRIVATE);
                    String tex13 = sharedPreferences13.getString(TEXT, "");
                    text13.setText(tex13);
                    if( text13.getText().toString().length() > 0 ) {
                        card13.setCardBackgroundColor(0xFFEDEDED);
                        card13.setCardElevation(0);
                        image13.setImageResource(R.mipmap.tick_xanhs1);
                    }else{
                        card13.setCardBackgroundColor(Color.WHITE);
                        card13.setCardElevation(8);
                        image13.setImageResource(R.mipmap.next_offical);
                    }
                    SharedPreferences sharedPreferences14 = context.getSharedPreferences("LuyenTapSau", MODE_PRIVATE);
                    String tex14 = sharedPreferences14.getString(TEXT, "");
                    text14.setText(tex14);
                    if( text14.getText().toString().length() > 0 ) {
                        card14.setCardBackgroundColor(0xFFEDEDED);
                        card14.setCardElevation(0);
                        image14.setImageResource(R.mipmap.tick_xanhs1);
                    }else{
                        card14.setCardBackgroundColor(Color.WHITE);
                        card14.setCardElevation(8);
                        image14.setImageResource(R.mipmap.next_offical);
                    }
                    SharedPreferences sharedPreferences15 = context.getSharedPreferences("TuongLaiD", MODE_PRIVATE);
                    String tex15 = sharedPreferences15.getString(TEXT, "");
                    text15.setText(tex15);
                    if( text15.getText().toString().length() > 0 ) {
                        card15.setCardBackgroundColor(0xFFEDEDED);
                        card15.setCardElevation(0);
                        image15.setImageResource(R.mipmap.tick_xanhs1);
                    }else{
                        card15.setCardBackgroundColor(Color.WHITE);
                        card15.setCardElevation(8);
                        image15.setImageResource(R.mipmap.next_offical);
                    }
                    SharedPreferences sharedPreferences16 = context.getSharedPreferences("TuongLaiTD", MODE_PRIVATE);
                    String tex16 = sharedPreferences16.getString(TEXT, "");
                    text16.setText(tex16);
                    if( text16.getText().toString().length() > 0 ) {
                        card16.setCardBackgroundColor(0xFFEDEDED);
                        card16.setCardElevation(0);
                        image16.setImageResource(R.mipmap.tick_xanhs1);
                    }else{
                        card16.setCardBackgroundColor(Color.WHITE);
                        card16.setCardElevation(8);
                        image16.setImageResource(R.mipmap.next_offical);
                    }
                    SharedPreferences sharedPreferences17 = context.getSharedPreferences("LuyenTapBay", MODE_PRIVATE);
                    String tex17 = sharedPreferences17.getString(TEXT, "");
                    text17.setText(tex17);
                    if( text17.getText().toString().length() > 0 ) {
                        card17.setCardBackgroundColor(0xFFEDEDED);
                        card17.setCardElevation(0);
                        image17.setImageResource(R.mipmap.tick_xanhs1);
                    }else{
                        card17.setCardBackgroundColor(Color.WHITE);
                        card17.setCardElevation(8);
                        image17.setImageResource(R.mipmap.next_offical);
                    }
                    SharedPreferences sharedPreferences18 = context.getSharedPreferences("TuongLaiHT", MODE_PRIVATE);
                    String tex18 = sharedPreferences18.getString(TEXT, "");
                    text18.setText(tex18);
                    if( text18.getText().toString().length() > 0 ) {
                        card18.setCardBackgroundColor(0xFFEDEDED);
                        card18.setCardElevation(0);
                        image18.setImageResource(R.mipmap.tick_xanhs1);
                    }else{
                        card18.setCardBackgroundColor(Color.WHITE);
                        card18.setCardElevation(8);
                        image18.setImageResource(R.mipmap.next_offical);
                    }
                    SharedPreferences sharedPreferences19 = context.getSharedPreferences("TuongLaiHTTD", MODE_PRIVATE);
                    String tex19 = sharedPreferences19.getString(TEXT, "");
                    text19.setText(tex19);
                    if( text19.getText().toString().length() > 0 ) {
                        card19.setCardBackgroundColor(0xFFEDEDED);
                        card19.setCardElevation(0);
                        image19.setImageResource(R.mipmap.tick_xanhs1);
                    }else{
                        card19.setCardBackgroundColor(Color.WHITE);
                        card19.setCardElevation(8);
                        image19.setImageResource(R.mipmap.next_offical);
                    }
                }
            });
            button13.setOnClickListener(new View.OnClickListener(){
                @Override
                public void onClick(View v) {
                    id_interstitial=13;
                    if (mInterstitialAd.isLoaded()) {
                        mInterstitialAd.show();
                    } else {
                        Intent i = new Intent(v.getContext(), LuyenTapNam.class);
                        v.getContext().startActivity(i);
                    }
                    SharedPreferences sharedPreferences6 = context.getSharedPreferences("LuyenTapHai", MODE_PRIVATE);
                    String tex6 = sharedPreferences6.getString(TEXT, "");
                    text6.setText(tex6);
                    if( text6.getText().toString().length() > 0 ) {
                        card6.setCardBackgroundColor(0xFFEDEDED);
                        card6.setCardElevation(0);
                        image6.setImageResource(R.mipmap.tick_xanhs1);
                    }else{
                        card6.setCardBackgroundColor(Color.WHITE);
                        card6.setCardElevation(8);
                        image6.setImageResource(R.mipmap.next_offical);
                    }
                    SharedPreferences sharedPreferences7 = context.getSharedPreferences("LuyenTapBa", MODE_PRIVATE);
                    String tex7 = sharedPreferences7.getString(TEXT, "");
                    text7.setText(tex7);
                    if( text7.getText().toString().length() > 0 ) {
                        card7.setCardBackgroundColor(0xFFEDEDED);
                        card7.setCardElevation(0);
                        image7.setImageResource(R.mipmap.tick_xanhs1);
                    }else{
                        card7.setCardBackgroundColor(Color.WHITE);
                        card7.setCardElevation(8);
                        image7.setImageResource(R.mipmap.next_offical);
                    }
                    SharedPreferences sharedPreferences8 = context.getSharedPreferences("QuaKhuD", MODE_PRIVATE);
                    String tex8 = sharedPreferences8.getString(TEXT, "");
                    text8.setText(tex8);
                    if( text8.getText().toString().length() > 0 ) {
                        card8.setCardBackgroundColor(0xFFEDEDED);
                        card8.setCardElevation(0);
                        image8.setImageResource(R.mipmap.tick_xanhs1);
                    }else{
                        card8.setCardBackgroundColor(Color.WHITE);
                        card8.setCardElevation(8);
                        image8.setImageResource(R.mipmap.next_offical);
                    }
                    SharedPreferences sharedPreferences9 = context.getSharedPreferences("QuaKhuTD", MODE_PRIVATE);
                    String tex9 = sharedPreferences9.getString(TEXT, "");
                    text9.setText(tex9);
                    if( text9.getText().toString().length() > 0 ) {
                        card9.setCardBackgroundColor(0xFFEDEDED);
                        card9.setCardElevation(0);
                        image9.setImageResource(R.mipmap.tick_xanhs1);
                    }else{
                        card9.setCardBackgroundColor(Color.WHITE);
                        card9.setCardElevation(8);
                        image9.setImageResource(R.mipmap.next_offical);
                    }
                    SharedPreferences sharedPreferences10 = context.getSharedPreferences("LuyenTapBon", MODE_PRIVATE);
                    String tex10 = sharedPreferences10.getString(TEXT, "");
                    text10.setText(tex10);
                    if( text10.getText().toString().length() > 0 ) {
                        card10.setCardBackgroundColor(0xFFEDEDED);
                        card10.setCardElevation(0);
                        image10.setImageResource(R.mipmap.tick_xanhs1);
                    }else{
                        card10.setCardBackgroundColor(Color.WHITE);
                        card10.setCardElevation(8);
                        image10.setImageResource(R.mipmap.next_offical);
                    }
                    SharedPreferences sharedPreferences11 = context.getSharedPreferences("QuaKhuHT", MODE_PRIVATE);
                    String tex11 = sharedPreferences11.getString(TEXT, "");
                    text11.setText(tex11);
                    if( text11.getText().toString().length() > 0 ) {
                        card11.setCardBackgroundColor(0xFFEDEDED);
                        card11.setCardElevation(0);
                        image11.setImageResource(R.mipmap.tick_xanhs1);
                    }else{
                        card11.setCardBackgroundColor(Color.WHITE);
                        card11.setCardElevation(8);
                        image11.setImageResource(R.mipmap.next_offical);
                    }
                    SharedPreferences sharedPreferences12 = context.getSharedPreferences("QuaKhuHTTD", MODE_PRIVATE);
                    String tex12 = sharedPreferences12.getString(TEXT, "");
                    text12.setText(tex12);
                    if( text12.getText().toString().length() > 0 ) {
                        card12.setCardBackgroundColor(0xFFEDEDED);
                        card12.setCardElevation(0);
                        image12.setImageResource(R.mipmap.tick_xanhs1);
                    }else{
                        card12.setCardBackgroundColor(Color.WHITE);
                        card12.setCardElevation(8);
                        image12.setImageResource(R.mipmap.next_offical);
                    }
                    SharedPreferences sharedPreferences13 = context.getSharedPreferences("LuyenTapNam", MODE_PRIVATE);
                    String tex13 = sharedPreferences13.getString(TEXT, "");
                    text13.setText(tex13);
                    if( text13.getText().toString().length() > 0 ) {
                        card13.setCardBackgroundColor(0xFFEDEDED);
                        card13.setCardElevation(0);
                        image13.setImageResource(R.mipmap.tick_xanhs1);
                    }else{
                        card13.setCardBackgroundColor(Color.WHITE);
                        card13.setCardElevation(8);
                        image13.setImageResource(R.mipmap.next_offical);
                    }
                    SharedPreferences sharedPreferences14 = context.getSharedPreferences("LuyenTapSau", MODE_PRIVATE);
                    String tex14 = sharedPreferences14.getString(TEXT, "");
                    text14.setText(tex14);
                    if( text14.getText().toString().length() > 0 ) {
                        card14.setCardBackgroundColor(0xFFEDEDED);
                        card14.setCardElevation(0);
                        image14.setImageResource(R.mipmap.tick_xanhs1);
                    }else{
                        card14.setCardBackgroundColor(Color.WHITE);
                        card14.setCardElevation(8);
                        image14.setImageResource(R.mipmap.next_offical);
                    }
                    SharedPreferences sharedPreferences15 = context.getSharedPreferences("TuongLaiD", MODE_PRIVATE);
                    String tex15 = sharedPreferences15.getString(TEXT, "");
                    text15.setText(tex15);
                    if( text15.getText().toString().length() > 0 ) {
                        card15.setCardBackgroundColor(0xFFEDEDED);
                        card15.setCardElevation(0);
                        image15.setImageResource(R.mipmap.tick_xanhs1);
                    }else{
                        card15.setCardBackgroundColor(Color.WHITE);
                        card15.setCardElevation(8);
                        image15.setImageResource(R.mipmap.next_offical);
                    }
                    SharedPreferences sharedPreferences16 = context.getSharedPreferences("TuongLaiTD", MODE_PRIVATE);
                    String tex16 = sharedPreferences16.getString(TEXT, "");
                    text16.setText(tex16);
                    if( text16.getText().toString().length() > 0 ) {
                        card16.setCardBackgroundColor(0xFFEDEDED);
                        card16.setCardElevation(0);
                        image16.setImageResource(R.mipmap.tick_xanhs1);
                    }else{
                        card16.setCardBackgroundColor(Color.WHITE);
                        card16.setCardElevation(8);
                        image16.setImageResource(R.mipmap.next_offical);
                    }
                    SharedPreferences sharedPreferences17 = context.getSharedPreferences("LuyenTapBay", MODE_PRIVATE);
                    String tex17 = sharedPreferences17.getString(TEXT, "");
                    text17.setText(tex17);
                    if( text17.getText().toString().length() > 0 ) {
                        card17.setCardBackgroundColor(0xFFEDEDED);
                        card17.setCardElevation(0);
                        image17.setImageResource(R.mipmap.tick_xanhs1);
                    }else{
                        card17.setCardBackgroundColor(Color.WHITE);
                        card17.setCardElevation(8);
                        image17.setImageResource(R.mipmap.next_offical);
                    }
                    SharedPreferences sharedPreferences18 = context.getSharedPreferences("TuongLaiHT", MODE_PRIVATE);
                    String tex18 = sharedPreferences18.getString(TEXT, "");
                    text18.setText(tex18);
                    if( text18.getText().toString().length() > 0 ) {
                        card18.setCardBackgroundColor(0xFFEDEDED);
                        card18.setCardElevation(0);
                        image18.setImageResource(R.mipmap.tick_xanhs1);
                    }else{
                        card18.setCardBackgroundColor(Color.WHITE);
                        card18.setCardElevation(8);
                        image18.setImageResource(R.mipmap.next_offical);
                    }
                    SharedPreferences sharedPreferences19 = context.getSharedPreferences("TuongLaiHTTD", MODE_PRIVATE);
                    String tex19 = sharedPreferences19.getString(TEXT, "");
                    text19.setText(tex19);
                    if( text19.getText().toString().length() > 0 ) {
                        card19.setCardBackgroundColor(0xFFEDEDED);
                        card19.setCardElevation(0);
                        image19.setImageResource(R.mipmap.tick_xanhs1);
                    }else{
                        card19.setCardBackgroundColor(Color.WHITE);
                        card19.setCardElevation(8);
                        image19.setImageResource(R.mipmap.next_offical);
                    }
                    SharedPreferences sharedPreferences20 = context.getSharedPreferences("LuyenTapTam", MODE_PRIVATE);
                    String tex20 = sharedPreferences20.getString(TEXT, "");
                    text20.setText(tex20);
                    if( text20.getText().toString().length() > 0 ) {
                        card20.setCardBackgroundColor(0xFFEDEDED);
                        card20.setCardElevation(0);
                        image20.setImageResource(R.mipmap.tick_xanhs1);
                    }else{
                        card20.setCardBackgroundColor(Color.WHITE);
                        card20.setCardElevation(8);
                        image20.setImageResource(R.mipmap.next_offical);
                    }
                }
            });
            button14.setOnClickListener(new View.OnClickListener(){
                @Override
                public void onClick(View v) {
                    Intent i = new Intent(v.getContext(), LuyenTapSau.class);
                    v.getContext().startActivity(i);
                    SharedPreferences sharedPreferences7 = context.getSharedPreferences("LuyenTapBa", MODE_PRIVATE);
                    String tex7 = sharedPreferences7.getString(TEXT, "");
                    text7.setText(tex7);
                    if( text7.getText().toString().length() > 0 ) {
                        card7.setCardBackgroundColor(0xFFEDEDED);
                        card7.setCardElevation(0);
                        image7.setImageResource(R.mipmap.tick_xanhs1);
                    }else{
                        card7.setCardBackgroundColor(Color.WHITE);
                        card7.setCardElevation(8);
                        image7.setImageResource(R.mipmap.next_offical);
                    }
                    SharedPreferences sharedPreferences8 = context.getSharedPreferences("QuaKhuD", MODE_PRIVATE);
                    String tex8 = sharedPreferences8.getString(TEXT, "");
                    text8.setText(tex8);
                    if( text8.getText().toString().length() > 0 ) {
                        card8.setCardBackgroundColor(0xFFEDEDED);
                        card8.setCardElevation(0);
                        image8.setImageResource(R.mipmap.tick_xanhs1);
                    }else{
                        card8.setCardBackgroundColor(Color.WHITE);
                        card8.setCardElevation(8);
                        image8.setImageResource(R.mipmap.next_offical);
                    }
                    SharedPreferences sharedPreferences9 = context.getSharedPreferences("QuaKhuTD", MODE_PRIVATE);
                    String tex9 = sharedPreferences9.getString(TEXT, "");
                    text9.setText(tex9);
                    if( text9.getText().toString().length() > 0 ) {
                        card9.setCardBackgroundColor(0xFFEDEDED);
                        card9.setCardElevation(0);
                        image9.setImageResource(R.mipmap.tick_xanhs1);
                    }else{
                        card9.setCardBackgroundColor(Color.WHITE);
                        card9.setCardElevation(8);
                        image9.setImageResource(R.mipmap.next_offical);
                    }
                    SharedPreferences sharedPreferences10 = context.getSharedPreferences("LuyenTapBon", MODE_PRIVATE);
                    String tex10 = sharedPreferences10.getString(TEXT, "");
                    text10.setText(tex10);
                    if( text10.getText().toString().length() > 0 ) {
                        card10.setCardBackgroundColor(0xFFEDEDED);
                        card10.setCardElevation(0);
                        image10.setImageResource(R.mipmap.tick_xanhs1);
                    }else{
                        card10.setCardBackgroundColor(Color.WHITE);
                        card10.setCardElevation(8);
                        image10.setImageResource(R.mipmap.next_offical);
                    }
                    SharedPreferences sharedPreferences11 = context.getSharedPreferences("QuaKhuHT", MODE_PRIVATE);
                    String tex11 = sharedPreferences11.getString(TEXT, "");
                    text11.setText(tex11);
                    if( text11.getText().toString().length() > 0 ) {
                        card11.setCardBackgroundColor(0xFFEDEDED);
                        card11.setCardElevation(0);
                        image11.setImageResource(R.mipmap.tick_xanhs1);
                    }else{
                        card11.setCardBackgroundColor(Color.WHITE);
                        card11.setCardElevation(8);
                        image11.setImageResource(R.mipmap.next_offical);
                    }
                    SharedPreferences sharedPreferences12 = context.getSharedPreferences("QuaKhuHTTD", MODE_PRIVATE);
                    String tex12 = sharedPreferences12.getString(TEXT, "");
                    text12.setText(tex12);
                    if( text12.getText().toString().length() > 0 ) {
                        card12.setCardBackgroundColor(0xFFEDEDED);
                        card12.setCardElevation(0);
                        image12.setImageResource(R.mipmap.tick_xanhs1);
                    }else{
                        card12.setCardBackgroundColor(Color.WHITE);
                        card12.setCardElevation(8);
                        image12.setImageResource(R.mipmap.next_offical);
                    }
                    SharedPreferences sharedPreferences13 = context.getSharedPreferences("LuyenTapNam", MODE_PRIVATE);
                    String tex13 = sharedPreferences13.getString(TEXT, "");
                    text13.setText(tex13);
                    if( text13.getText().toString().length() > 0 ) {
                        card13.setCardBackgroundColor(0xFFEDEDED);
                        card13.setCardElevation(0);
                        image13.setImageResource(R.mipmap.tick_xanhs1);
                    }else{
                        card13.setCardBackgroundColor(Color.WHITE);
                        card13.setCardElevation(8);
                        image13.setImageResource(R.mipmap.next_offical);
                    }
                    SharedPreferences sharedPreferences14 = context.getSharedPreferences("LuyenTapSau", MODE_PRIVATE);
                    String tex14 = sharedPreferences14.getString(TEXT, "");
                    text14.setText(tex14);
                    if( text14.getText().toString().length() > 0 ) {
                        card14.setCardBackgroundColor(0xFFEDEDED);
                        card14.setCardElevation(0);
                        image14.setImageResource(R.mipmap.tick_xanhs1);
                    }else{
                        card14.setCardBackgroundColor(Color.WHITE);
                        card14.setCardElevation(8);
                        image14.setImageResource(R.mipmap.next_offical);
                    }
                    SharedPreferences sharedPreferences15 = context.getSharedPreferences("TuongLaiD", MODE_PRIVATE);
                    String tex15 = sharedPreferences15.getString(TEXT, "");
                    text15.setText(tex15);
                    if( text15.getText().toString().length() > 0 ) {
                        card15.setCardBackgroundColor(0xFFEDEDED);
                        card15.setCardElevation(0);
                        image15.setImageResource(R.mipmap.tick_xanhs1);
                    }else{
                        card15.setCardBackgroundColor(Color.WHITE);
                        card15.setCardElevation(8);
                        image15.setImageResource(R.mipmap.next_offical);
                    }
                    SharedPreferences sharedPreferences16 = context.getSharedPreferences("TuongLaiTD", MODE_PRIVATE);
                    String tex16 = sharedPreferences16.getString(TEXT, "");
                    text16.setText(tex16);
                    if( text16.getText().toString().length() > 0 ) {
                        card16.setCardBackgroundColor(0xFFEDEDED);
                        card16.setCardElevation(0);
                        image16.setImageResource(R.mipmap.tick_xanhs1);
                    }else{
                        card16.setCardBackgroundColor(Color.WHITE);
                        card16.setCardElevation(8);
                        image16.setImageResource(R.mipmap.next_offical);
                    }
                    SharedPreferences sharedPreferences17 = context.getSharedPreferences("LuyenTapBay", MODE_PRIVATE);
                    String tex17 = sharedPreferences17.getString(TEXT, "");
                    text17.setText(tex17);
                    if( text17.getText().toString().length() > 0 ) {
                        card17.setCardBackgroundColor(0xFFEDEDED);
                        card17.setCardElevation(0);
                        image17.setImageResource(R.mipmap.tick_xanhs1);
                    }else{
                        card17.setCardBackgroundColor(Color.WHITE);
                        card17.setCardElevation(8);
                        image17.setImageResource(R.mipmap.next_offical);
                    }
                    SharedPreferences sharedPreferences18 = context.getSharedPreferences("TuongLaiHT", MODE_PRIVATE);
                    String tex18 = sharedPreferences18.getString(TEXT, "");
                    text18.setText(tex18);
                    if( text18.getText().toString().length() > 0 ) {
                        card18.setCardBackgroundColor(0xFFEDEDED);
                        card18.setCardElevation(0);
                        image18.setImageResource(R.mipmap.tick_xanhs1);
                    }else{
                        card18.setCardBackgroundColor(Color.WHITE);
                        card18.setCardElevation(8);
                        image18.setImageResource(R.mipmap.next_offical);
                    }
                    SharedPreferences sharedPreferences19 = context.getSharedPreferences("TuongLaiHTTD", MODE_PRIVATE);
                    String tex19 = sharedPreferences19.getString(TEXT, "");
                    text19.setText(tex19);
                    if( text19.getText().toString().length() > 0 ) {
                        card19.setCardBackgroundColor(0xFFEDEDED);
                        card19.setCardElevation(0);
                        image19.setImageResource(R.mipmap.tick_xanhs1);
                    }else{
                        card19.setCardBackgroundColor(Color.WHITE);
                        card19.setCardElevation(8);
                        image19.setImageResource(R.mipmap.next_offical);
                    }
                    SharedPreferences sharedPreferences20 = context.getSharedPreferences("LuyenTapTam", MODE_PRIVATE);
                    String tex20 = sharedPreferences20.getString(TEXT, "");
                    text20.setText(tex20);
                    if( text20.getText().toString().length() > 0 ) {
                        card20.setCardBackgroundColor(0xFFEDEDED);
                        card20.setCardElevation(0);
                        image20.setImageResource(R.mipmap.tick_xanhs1);
                    }else{
                        card20.setCardBackgroundColor(Color.WHITE);
                        card20.setCardElevation(8);
                        image20.setImageResource(R.mipmap.next_offical);
                    }
                    SharedPreferences sharedPreferences21 = context.getSharedPreferences("LuyenTapChin", MODE_PRIVATE);
                    String tex21 = sharedPreferences21.getString(TEXT, "");
                    text21.setText(tex21);
                    if( text21.getText().toString().length() > 0 ) {
                        card21.setCardBackgroundColor(0xFFEDEDED);
                        card21.setCardElevation(0);
                        image21.setImageResource(R.mipmap.tick_xanhs1);
                    }else{
                        card21.setCardBackgroundColor(Color.WHITE);
                        card21.setCardElevation(8);
                        image21.setImageResource(R.mipmap.next_offical);
                    }
                }
            });
            button15.setOnClickListener(new View.OnClickListener(){
                @Override
                public void onClick(View v) {
                    Intent i = new Intent(v.getContext(), TuongLaiD.class);
                    v.getContext().startActivity(i);
                    SharedPreferences sharedPreferences8 = context.getSharedPreferences("QuaKhuD", MODE_PRIVATE);
                    String tex8 = sharedPreferences8.getString(TEXT, "");
                    text8.setText(tex8);
                    if( text8.getText().toString().length() > 0 ) {
                        card8.setCardBackgroundColor(0xFFEDEDED);
                        card8.setCardElevation(0);
                        image8.setImageResource(R.mipmap.tick_xanhs1);
                    }else{
                        card8.setCardBackgroundColor(Color.WHITE);
                        card8.setCardElevation(8);
                        image8.setImageResource(R.mipmap.next_offical);
                    }
                    SharedPreferences sharedPreferences9 = context.getSharedPreferences("QuaKhuTD", MODE_PRIVATE);
                    String tex9 = sharedPreferences9.getString(TEXT, "");
                    text9.setText(tex9);
                    if( text9.getText().toString().length() > 0 ) {
                        card9.setCardBackgroundColor(0xFFEDEDED);
                        card9.setCardElevation(0);
                        image9.setImageResource(R.mipmap.tick_xanhs1);
                    }else{
                        card9.setCardBackgroundColor(Color.WHITE);
                        card9.setCardElevation(8);
                        image9.setImageResource(R.mipmap.next_offical);
                    }
                    SharedPreferences sharedPreferences10 = context.getSharedPreferences("LuyenTapBon", MODE_PRIVATE);
                    String tex10 = sharedPreferences10.getString(TEXT, "");
                    text10.setText(tex10);
                    if( text10.getText().toString().length() > 0 ) {
                        card10.setCardBackgroundColor(0xFFEDEDED);
                        card10.setCardElevation(0);
                        image10.setImageResource(R.mipmap.tick_xanhs1);
                    }else{
                        card10.setCardBackgroundColor(Color.WHITE);
                        card10.setCardElevation(8);
                        image10.setImageResource(R.mipmap.next_offical);
                    }
                    SharedPreferences sharedPreferences11 = context.getSharedPreferences("QuaKhuHT", MODE_PRIVATE);
                    String tex11 = sharedPreferences11.getString(TEXT, "");
                    text11.setText(tex11);
                    if( text11.getText().toString().length() > 0 ) {
                        card11.setCardBackgroundColor(0xFFEDEDED);
                        card11.setCardElevation(0);
                        image11.setImageResource(R.mipmap.tick_xanhs1);
                    }else{
                        card11.setCardBackgroundColor(Color.WHITE);
                        card11.setCardElevation(8);
                        image11.setImageResource(R.mipmap.next_offical);
                    }
                    SharedPreferences sharedPreferences12 = context.getSharedPreferences("QuaKhuHTTD", MODE_PRIVATE);
                    String tex12 = sharedPreferences12.getString(TEXT, "");
                    text12.setText(tex12);
                    if( text12.getText().toString().length() > 0 ) {
                        card12.setCardBackgroundColor(0xFFEDEDED);
                        card12.setCardElevation(0);
                        image12.setImageResource(R.mipmap.tick_xanhs1);
                    }else{
                        card12.setCardBackgroundColor(Color.WHITE);
                        card12.setCardElevation(8);
                        image12.setImageResource(R.mipmap.next_offical);
                    }
                    SharedPreferences sharedPreferences13 = context.getSharedPreferences("LuyenTapNam", MODE_PRIVATE);
                    String tex13 = sharedPreferences13.getString(TEXT, "");
                    text13.setText(tex13);
                    if( text13.getText().toString().length() > 0 ) {
                        card13.setCardBackgroundColor(0xFFEDEDED);
                        card13.setCardElevation(0);
                        image13.setImageResource(R.mipmap.tick_xanhs1);
                    }else{
                        card13.setCardBackgroundColor(Color.WHITE);
                        card13.setCardElevation(8);
                        image13.setImageResource(R.mipmap.next_offical);
                    }
                    SharedPreferences sharedPreferences14 = context.getSharedPreferences("LuyenTapSau", MODE_PRIVATE);
                    String tex14 = sharedPreferences14.getString(TEXT, "");
                    text14.setText(tex14);
                    if( text14.getText().toString().length() > 0 ) {
                        card14.setCardBackgroundColor(0xFFEDEDED);
                        card14.setCardElevation(0);
                        image14.setImageResource(R.mipmap.tick_xanhs1);
                    }else{
                        card14.setCardBackgroundColor(Color.WHITE);
                        card14.setCardElevation(8);
                        image14.setImageResource(R.mipmap.next_offical);
                    }
                    SharedPreferences sharedPreferences15 = context.getSharedPreferences("TuongLaiD", MODE_PRIVATE);
                    String tex15 = sharedPreferences15.getString(TEXT, "");
                    text15.setText(tex15);
                    if( text15.getText().toString().length() > 0 ) {
                        card15.setCardBackgroundColor(0xFFEDEDED);
                        card15.setCardElevation(0);
                        image15.setImageResource(R.mipmap.tick_xanhs1);
                    }else{
                        card15.setCardBackgroundColor(Color.WHITE);
                        card15.setCardElevation(8);
                        image15.setImageResource(R.mipmap.next_offical);
                    }
                    SharedPreferences sharedPreferences16 = context.getSharedPreferences("TuongLaiTD", MODE_PRIVATE);
                    String tex16 = sharedPreferences16.getString(TEXT, "");
                    text16.setText(tex16);
                    if( text16.getText().toString().length() > 0 ) {
                        card16.setCardBackgroundColor(0xFFEDEDED);
                        card16.setCardElevation(0);
                        image16.setImageResource(R.mipmap.tick_xanhs1);
                    }else{
                        card16.setCardBackgroundColor(Color.WHITE);
                        card16.setCardElevation(8);
                        image16.setImageResource(R.mipmap.next_offical);
                    }
                    SharedPreferences sharedPreferences17 = context.getSharedPreferences("LuyenTapBay", MODE_PRIVATE);
                    String tex17 = sharedPreferences17.getString(TEXT, "");
                    text17.setText(tex17);
                    if( text17.getText().toString().length() > 0 ) {
                        card17.setCardBackgroundColor(0xFFEDEDED);
                        card17.setCardElevation(0);
                        image17.setImageResource(R.mipmap.tick_xanhs1);
                    }else{
                        card17.setCardBackgroundColor(Color.WHITE);
                        card17.setCardElevation(8);
                        image17.setImageResource(R.mipmap.next_offical);
                    }
                    SharedPreferences sharedPreferences18 = context.getSharedPreferences("TuongLaiHT", MODE_PRIVATE);
                    String tex18 = sharedPreferences18.getString(TEXT, "");
                    text18.setText(tex18);
                    if( text18.getText().toString().length() > 0 ) {
                        card18.setCardBackgroundColor(0xFFEDEDED);
                        card18.setCardElevation(0);
                        image18.setImageResource(R.mipmap.tick_xanhs1);
                    }else{
                        card18.setCardBackgroundColor(Color.WHITE);
                        card18.setCardElevation(8);
                        image18.setImageResource(R.mipmap.next_offical);
                    }
                    SharedPreferences sharedPreferences19 = context.getSharedPreferences("TuongLaiHTTD", MODE_PRIVATE);
                    String tex19 = sharedPreferences19.getString(TEXT, "");
                    text19.setText(tex19);
                    if( text19.getText().toString().length() > 0 ) {
                        card19.setCardBackgroundColor(0xFFEDEDED);
                        card19.setCardElevation(0);
                        image19.setImageResource(R.mipmap.tick_xanhs1);
                    }else{
                        card19.setCardBackgroundColor(Color.WHITE);
                        card19.setCardElevation(8);
                        image19.setImageResource(R.mipmap.next_offical);
                    }
                    SharedPreferences sharedPreferences20 = context.getSharedPreferences("LuyenTapTam", MODE_PRIVATE);
                    String tex20 = sharedPreferences20.getString(TEXT, "");
                    text20.setText(tex20);
                    if( text20.getText().toString().length() > 0 ) {
                        card20.setCardBackgroundColor(0xFFEDEDED);
                        card20.setCardElevation(0);
                        image20.setImageResource(R.mipmap.tick_xanhs1);
                    }else{
                        card20.setCardBackgroundColor(Color.WHITE);
                        card20.setCardElevation(8);
                        image20.setImageResource(R.mipmap.next_offical);
                    }
                    SharedPreferences sharedPreferences21 = context.getSharedPreferences("LuyenTapChin", MODE_PRIVATE);
                    String tex21 = sharedPreferences21.getString(TEXT, "");
                    text21.setText(tex21);
                    if( text21.getText().toString().length() > 0 ) {
                        card21.setCardBackgroundColor(0xFFEDEDED);
                        card21.setCardElevation(0);
                        image21.setImageResource(R.mipmap.tick_xanhs1);
                    }else{
                        card21.setCardBackgroundColor(Color.WHITE);
                        card21.setCardElevation(8);
                        image21.setImageResource(R.mipmap.next_offical);
                    }
                    SharedPreferences sharedPreferences22 = context.getSharedPreferences("LuyenTapMuoi", MODE_PRIVATE);
                    String tex22 = sharedPreferences22.getString(TEXT, "");
                    text22.setText(tex22);
                    if( text22.getText().toString().length() > 0 ) {
                        card22.setCardBackgroundColor(0xFFEDEDED);
                        card22.setCardElevation(0);
                        image22.setImageResource(R.mipmap.tick_xanhs1);
                    }else{
                        card22.setCardBackgroundColor(Color.WHITE);
                        card22.setCardElevation(8);
                        image22.setImageResource(R.mipmap.next_offical);
                    }
                }
            });
            button16.setOnClickListener(new View.OnClickListener(){
                @Override
                public void onClick(View v) {
                    Intent i = new Intent(v.getContext(), TuongLaiTD.class);
                    v.getContext().startActivity(i);
                    SharedPreferences sharedPreferences9 = context.getSharedPreferences("QuaKhuTD", MODE_PRIVATE);
                    String tex9 = sharedPreferences9.getString(TEXT, "");
                    text9.setText(tex9);
                    if( text9.getText().toString().length() > 0 ) {
                        card9.setCardBackgroundColor(0xFFEDEDED);
                        card9.setCardElevation(0);
                        image9.setImageResource(R.mipmap.tick_xanhs1);
                    }else{
                        card9.setCardBackgroundColor(Color.WHITE);
                        card9.setCardElevation(8);
                        image9.setImageResource(R.mipmap.next_offical);
                    }
                    SharedPreferences sharedPreferences10 = context.getSharedPreferences("LuyenTapBon", MODE_PRIVATE);
                    String tex10 = sharedPreferences10.getString(TEXT, "");
                    text10.setText(tex10);
                    if( text10.getText().toString().length() > 0 ) {
                        card10.setCardBackgroundColor(0xFFEDEDED);
                        card10.setCardElevation(0);
                        image10.setImageResource(R.mipmap.tick_xanhs1);
                    }else{
                        card10.setCardBackgroundColor(Color.WHITE);
                        card10.setCardElevation(8);
                        image10.setImageResource(R.mipmap.next_offical);
                    }
                    SharedPreferences sharedPreferences11 = context.getSharedPreferences("QuaKhuHT", MODE_PRIVATE);
                    String tex11 = sharedPreferences11.getString(TEXT, "");
                    text11.setText(tex11);
                    if( text11.getText().toString().length() > 0 ) {
                        card11.setCardBackgroundColor(0xFFEDEDED);
                        card11.setCardElevation(0);
                        image11.setImageResource(R.mipmap.tick_xanhs1);
                    }else{
                        card11.setCardBackgroundColor(Color.WHITE);
                        card11.setCardElevation(8);
                        image11.setImageResource(R.mipmap.next_offical);
                    }
                    SharedPreferences sharedPreferences12 = context.getSharedPreferences("QuaKhuHTTD", MODE_PRIVATE);
                    String tex12 = sharedPreferences12.getString(TEXT, "");
                    text12.setText(tex12);
                    if( text12.getText().toString().length() > 0 ) {
                        card12.setCardBackgroundColor(0xFFEDEDED);
                        card12.setCardElevation(0);
                        image12.setImageResource(R.mipmap.tick_xanhs1);
                    }else{
                        card12.setCardBackgroundColor(Color.WHITE);
                        card12.setCardElevation(8);
                        image12.setImageResource(R.mipmap.next_offical);
                    }
                    SharedPreferences sharedPreferences13 = context.getSharedPreferences("LuyenTapNam", MODE_PRIVATE);
                    String tex13 = sharedPreferences13.getString(TEXT, "");
                    text13.setText(tex13);
                    if( text13.getText().toString().length() > 0 ) {
                        card13.setCardBackgroundColor(0xFFEDEDED);
                        card13.setCardElevation(0);
                        image13.setImageResource(R.mipmap.tick_xanhs1);
                    }else{
                        card13.setCardBackgroundColor(Color.WHITE);
                        card13.setCardElevation(8);
                        image13.setImageResource(R.mipmap.next_offical);
                    }
                    SharedPreferences sharedPreferences14 = context.getSharedPreferences("LuyenTapSau", MODE_PRIVATE);
                    String tex14 = sharedPreferences14.getString(TEXT, "");
                    text14.setText(tex14);
                    if( text14.getText().toString().length() > 0 ) {
                        card14.setCardBackgroundColor(0xFFEDEDED);
                        card14.setCardElevation(0);
                        image14.setImageResource(R.mipmap.tick_xanhs1);
                    }else{
                        card14.setCardBackgroundColor(Color.WHITE);
                        card14.setCardElevation(8);
                        image14.setImageResource(R.mipmap.next_offical);
                    }
                    SharedPreferences sharedPreferences15 = context.getSharedPreferences("TuongLaiD", MODE_PRIVATE);
                    String tex15 = sharedPreferences15.getString(TEXT, "");
                    text15.setText(tex15);
                    if( text15.getText().toString().length() > 0 ) {
                        card15.setCardBackgroundColor(0xFFEDEDED);
                        card15.setCardElevation(0);
                        image15.setImageResource(R.mipmap.tick_xanhs1);
                    }else{
                        card15.setCardBackgroundColor(Color.WHITE);
                        card15.setCardElevation(8);
                        image15.setImageResource(R.mipmap.next_offical);
                    }
                    SharedPreferences sharedPreferences16 = context.getSharedPreferences("TuongLaiTD", MODE_PRIVATE);
                    String tex16 = sharedPreferences16.getString(TEXT, "");
                    text16.setText(tex16);
                    if( text16.getText().toString().length() > 0 ) {
                        card16.setCardBackgroundColor(0xFFEDEDED);
                        card16.setCardElevation(0);
                        image16.setImageResource(R.mipmap.tick_xanhs1);
                    }else{
                        card16.setCardBackgroundColor(Color.WHITE);
                        card16.setCardElevation(8);
                        image16.setImageResource(R.mipmap.next_offical);
                    }
                    SharedPreferences sharedPreferences17 = context.getSharedPreferences("LuyenTapBay", MODE_PRIVATE);
                    String tex17 = sharedPreferences17.getString(TEXT, "");
                    text17.setText(tex17);
                    if( text17.getText().toString().length() > 0 ) {
                        card17.setCardBackgroundColor(0xFFEDEDED);
                        card17.setCardElevation(0);
                        image17.setImageResource(R.mipmap.tick_xanhs1);
                    }else{
                        card17.setCardBackgroundColor(Color.WHITE);
                        card17.setCardElevation(8);
                        image17.setImageResource(R.mipmap.next_offical);
                    }
                    SharedPreferences sharedPreferences18 = context.getSharedPreferences("TuongLaiHT", MODE_PRIVATE);
                    String tex18 = sharedPreferences18.getString(TEXT, "");
                    text18.setText(tex18);
                    if( text18.getText().toString().length() > 0 ) {
                        card18.setCardBackgroundColor(0xFFEDEDED);
                        card18.setCardElevation(0);
                        image18.setImageResource(R.mipmap.tick_xanhs1);
                    }else{
                        card18.setCardBackgroundColor(Color.WHITE);
                        card18.setCardElevation(8);
                        image18.setImageResource(R.mipmap.next_offical);
                    }
                    SharedPreferences sharedPreferences19 = context.getSharedPreferences("TuongLaiHTTD", MODE_PRIVATE);
                    String tex19 = sharedPreferences19.getString(TEXT, "");
                    text19.setText(tex19);
                    if( text19.getText().toString().length() > 0 ) {
                        card19.setCardBackgroundColor(0xFFEDEDED);
                        card19.setCardElevation(0);
                        image19.setImageResource(R.mipmap.tick_xanhs1);
                    }else{
                        card19.setCardBackgroundColor(Color.WHITE);
                        card19.setCardElevation(8);
                        image19.setImageResource(R.mipmap.next_offical);
                    }
                    SharedPreferences sharedPreferences20 = context.getSharedPreferences("LuyenTapTam", MODE_PRIVATE);
                    String tex20 = sharedPreferences20.getString(TEXT, "");
                    text20.setText(tex20);
                    if( text20.getText().toString().length() > 0 ) {
                        card20.setCardBackgroundColor(0xFFEDEDED);
                        card20.setCardElevation(0);
                        image20.setImageResource(R.mipmap.tick_xanhs1);
                    }else{
                        card20.setCardBackgroundColor(Color.WHITE);
                        card20.setCardElevation(8);
                        image20.setImageResource(R.mipmap.next_offical);
                    }
                    SharedPreferences sharedPreferences21 = context.getSharedPreferences("LuyenTapChin", MODE_PRIVATE);
                    String tex21 = sharedPreferences21.getString(TEXT, "");
                    text21.setText(tex21);
                    if( text21.getText().toString().length() > 0 ) {
                        card21.setCardBackgroundColor(0xFFEDEDED);
                        card21.setCardElevation(0);
                        image21.setImageResource(R.mipmap.tick_xanhs1);
                    }else{
                        card21.setCardBackgroundColor(Color.WHITE);
                        card21.setCardElevation(8);
                        image21.setImageResource(R.mipmap.next_offical);
                    }
                    SharedPreferences sharedPreferences22 = context.getSharedPreferences("LuyenTapMuoi", MODE_PRIVATE);
                    String tex22 = sharedPreferences22.getString(TEXT, "");
                    text22.setText(tex22);
                    if( text22.getText().toString().length() > 0 ) {
                        card22.setCardBackgroundColor(0xFFEDEDED);
                        card22.setCardElevation(0);
                        image22.setImageResource(R.mipmap.tick_xanhs1);
                    }else{
                        card22.setCardBackgroundColor(Color.WHITE);
                        card22.setCardElevation(8);
                        image22.setImageResource(R.mipmap.next_offical);
                    }
                }
            });
            button17.setOnClickListener(new View.OnClickListener(){
                @Override
                public void onClick(View v) {
                    id_interstitial=17;
                    if (mInterstitialAd.isLoaded()) {
                        mInterstitialAd.show();
                    } else {
                        Intent i = new Intent(v.getContext(), LuyenTapBay.class);
                        v.getContext().startActivity(i);
                    }
                    SharedPreferences sharedPreferences10 = context.getSharedPreferences("LuyenTapBon", MODE_PRIVATE);
                    String tex10 = sharedPreferences10.getString(TEXT, "");
                    text10.setText(tex10);
                    if( text10.getText().toString().length() > 0 ) {
                        card10.setCardBackgroundColor(0xFFEDEDED);
                        card10.setCardElevation(0);
                        image10.setImageResource(R.mipmap.tick_xanhs1);
                    }else{
                        card10.setCardBackgroundColor(Color.WHITE);
                        card10.setCardElevation(8);
                        image10.setImageResource(R.mipmap.next_offical);
                    }
                    SharedPreferences sharedPreferences11 = context.getSharedPreferences("QuaKhuHT", MODE_PRIVATE);
                    String tex11 = sharedPreferences11.getString(TEXT, "");
                    text11.setText(tex11);
                    if( text11.getText().toString().length() > 0 ) {
                        card11.setCardBackgroundColor(0xFFEDEDED);
                        card11.setCardElevation(0);
                        image11.setImageResource(R.mipmap.tick_xanhs1);
                    }else{
                        card11.setCardBackgroundColor(Color.WHITE);
                        card11.setCardElevation(8);
                        image11.setImageResource(R.mipmap.next_offical);
                    }
                    SharedPreferences sharedPreferences12 = context.getSharedPreferences("QuaKhuHTTD", MODE_PRIVATE);
                    String tex12 = sharedPreferences12.getString(TEXT, "");
                    text12.setText(tex12);
                    if( text12.getText().toString().length() > 0 ) {
                        card12.setCardBackgroundColor(0xFFEDEDED);
                        card12.setCardElevation(0);
                        image12.setImageResource(R.mipmap.tick_xanhs1);
                    }else{
                        card12.setCardBackgroundColor(Color.WHITE);
                        card12.setCardElevation(8);
                        image12.setImageResource(R.mipmap.next_offical);
                    }
                    SharedPreferences sharedPreferences13 = context.getSharedPreferences("LuyenTapNam", MODE_PRIVATE);
                    String tex13 = sharedPreferences13.getString(TEXT, "");
                    text13.setText(tex13);
                    if( text13.getText().toString().length() > 0 ) {
                        card13.setCardBackgroundColor(0xFFEDEDED);
                        card13.setCardElevation(0);
                        image13.setImageResource(R.mipmap.tick_xanhs1);
                    }else{
                        card13.setCardBackgroundColor(Color.WHITE);
                        card13.setCardElevation(8);
                        image13.setImageResource(R.mipmap.next_offical);
                    }
                    SharedPreferences sharedPreferences14 = context.getSharedPreferences("LuyenTapSau", MODE_PRIVATE);
                    String tex14 = sharedPreferences14.getString(TEXT, "");
                    text14.setText(tex14);
                    if( text14.getText().toString().length() > 0 ) {
                        card14.setCardBackgroundColor(0xFFEDEDED);
                        card14.setCardElevation(0);
                        image14.setImageResource(R.mipmap.tick_xanhs1);
                    }else{
                        card14.setCardBackgroundColor(Color.WHITE);
                        card14.setCardElevation(8);
                        image14.setImageResource(R.mipmap.next_offical);
                    }
                    SharedPreferences sharedPreferences15 = context.getSharedPreferences("TuongLaiD", MODE_PRIVATE);
                    String tex15 = sharedPreferences15.getString(TEXT, "");
                    text15.setText(tex15);
                    if( text15.getText().toString().length() > 0 ) {
                        card15.setCardBackgroundColor(0xFFEDEDED);
                        card15.setCardElevation(0);
                        image15.setImageResource(R.mipmap.tick_xanhs1);
                    }else{
                        card15.setCardBackgroundColor(Color.WHITE);
                        card15.setCardElevation(8);
                        image15.setImageResource(R.mipmap.next_offical);
                    }
                    SharedPreferences sharedPreferences16 = context.getSharedPreferences("TuongLaiTD", MODE_PRIVATE);
                    String tex16 = sharedPreferences16.getString(TEXT, "");
                    text16.setText(tex16);
                    if( text16.getText().toString().length() > 0 ) {
                        card16.setCardBackgroundColor(0xFFEDEDED);
                        card16.setCardElevation(0);
                        image16.setImageResource(R.mipmap.tick_xanhs1);
                    }else{
                        card16.setCardBackgroundColor(Color.WHITE);
                        card16.setCardElevation(8);
                        image16.setImageResource(R.mipmap.next_offical);
                    }
                    SharedPreferences sharedPreferences17 = context.getSharedPreferences("LuyenTapBay", MODE_PRIVATE);
                    String tex17 = sharedPreferences17.getString(TEXT, "");
                    text17.setText(tex17);
                    if( text17.getText().toString().length() > 0 ) {
                        card17.setCardBackgroundColor(0xFFEDEDED);
                        card17.setCardElevation(0);
                        image17.setImageResource(R.mipmap.tick_xanhs1);
                    }else{
                        card17.setCardBackgroundColor(Color.WHITE);
                        card17.setCardElevation(8);
                        image17.setImageResource(R.mipmap.next_offical);
                    }
                    SharedPreferences sharedPreferences18 = context.getSharedPreferences("TuongLaiHT", MODE_PRIVATE);
                    String tex18 = sharedPreferences18.getString(TEXT, "");
                    text18.setText(tex18);
                    if( text18.getText().toString().length() > 0 ) {
                        card18.setCardBackgroundColor(0xFFEDEDED);
                        card18.setCardElevation(0);
                        image18.setImageResource(R.mipmap.tick_xanhs1);
                    }else{
                        card18.setCardBackgroundColor(Color.WHITE);
                        card18.setCardElevation(8);
                        image18.setImageResource(R.mipmap.next_offical);
                    }
                    SharedPreferences sharedPreferences19 = context.getSharedPreferences("TuongLaiHTTD", MODE_PRIVATE);
                    String tex19 = sharedPreferences19.getString(TEXT, "");
                    text19.setText(tex19);
                    if( text19.getText().toString().length() > 0 ) {
                        card19.setCardBackgroundColor(0xFFEDEDED);
                        card19.setCardElevation(0);
                        image19.setImageResource(R.mipmap.tick_xanhs1);
                    }else{
                        card19.setCardBackgroundColor(Color.WHITE);
                        card19.setCardElevation(8);
                        image19.setImageResource(R.mipmap.next_offical);
                    }
                    SharedPreferences sharedPreferences20 = context.getSharedPreferences("LuyenTapTam", MODE_PRIVATE);
                    String tex20 = sharedPreferences20.getString(TEXT, "");
                    text20.setText(tex20);
                    if( text20.getText().toString().length() > 0 ) {
                        card20.setCardBackgroundColor(0xFFEDEDED);
                        card20.setCardElevation(0);
                        image20.setImageResource(R.mipmap.tick_xanhs1);
                    }else{
                        card20.setCardBackgroundColor(Color.WHITE);
                        card20.setCardElevation(8);
                        image20.setImageResource(R.mipmap.next_offical);
                    }
                    SharedPreferences sharedPreferences21 = context.getSharedPreferences("LuyenTapChin", MODE_PRIVATE);
                    String tex21 = sharedPreferences21.getString(TEXT, "");
                    text21.setText(tex21);
                    if( text21.getText().toString().length() > 0 ) {
                        card21.setCardBackgroundColor(0xFFEDEDED);
                        card21.setCardElevation(0);
                        image21.setImageResource(R.mipmap.tick_xanhs1);
                    }else{
                        card21.setCardBackgroundColor(Color.WHITE);
                        card21.setCardElevation(8);
                        image21.setImageResource(R.mipmap.next_offical);
                    }
                    SharedPreferences sharedPreferences22 = context.getSharedPreferences("LuyenTapMuoi", MODE_PRIVATE);
                    String tex22 = sharedPreferences22.getString(TEXT, "");
                    text22.setText(tex22);
                    if( text22.getText().toString().length() > 0 ) {
                        card22.setCardBackgroundColor(0xFFEDEDED);
                        card22.setCardElevation(0);
                        image22.setImageResource(R.mipmap.tick_xanhs1);
                    }else{
                        card22.setCardBackgroundColor(Color.WHITE);
                        card22.setCardElevation(8);
                        image22.setImageResource(R.mipmap.next_offical);
                    }
                }
            });
            button18.setOnClickListener(new View.OnClickListener(){
                @Override
                public void onClick(View v) {
                    Intent i = new Intent(v.getContext(), TuongLaiHT.class);
                    v.getContext().startActivity(i);
                    SharedPreferences sharedPreferences11 = context.getSharedPreferences("QuaKhuHT", MODE_PRIVATE);
                    String tex11 = sharedPreferences11.getString(TEXT, "");
                    text11.setText(tex11);
                    if( text11.getText().toString().length() > 0 ) {
                        card11.setCardBackgroundColor(0xFFEDEDED);
                        card11.setCardElevation(0);
                        image11.setImageResource(R.mipmap.tick_xanhs1);
                    }else{
                        card11.setCardBackgroundColor(Color.WHITE);
                        card11.setCardElevation(8);
                        image11.setImageResource(R.mipmap.next_offical);
                    }
                    SharedPreferences sharedPreferences12 = context.getSharedPreferences("QuaKhuHTTD", MODE_PRIVATE);
                    String tex12 = sharedPreferences12.getString(TEXT, "");
                    text12.setText(tex12);
                    if( text12.getText().toString().length() > 0 ) {
                        card12.setCardBackgroundColor(0xFFEDEDED);
                        card12.setCardElevation(0);
                        image12.setImageResource(R.mipmap.tick_xanhs1);
                    }else{
                        card12.setCardBackgroundColor(Color.WHITE);
                        card12.setCardElevation(8);
                        image12.setImageResource(R.mipmap.next_offical);
                    }
                    SharedPreferences sharedPreferences13 = context.getSharedPreferences("LuyenTapNam", MODE_PRIVATE);
                    String tex13 = sharedPreferences13.getString(TEXT, "");
                    text13.setText(tex13);
                    if( text13.getText().toString().length() > 0 ) {
                        card13.setCardBackgroundColor(0xFFEDEDED);
                        card13.setCardElevation(0);
                        image13.setImageResource(R.mipmap.tick_xanhs1);
                    }else{
                        card13.setCardBackgroundColor(Color.WHITE);
                        card13.setCardElevation(8);
                        image13.setImageResource(R.mipmap.next_offical);
                    }
                    SharedPreferences sharedPreferences14 = context.getSharedPreferences("LuyenTapSau", MODE_PRIVATE);
                    String tex14 = sharedPreferences14.getString(TEXT, "");
                    text14.setText(tex14);
                    if( text14.getText().toString().length() > 0 ) {
                        card14.setCardBackgroundColor(0xFFEDEDED);
                        card14.setCardElevation(0);
                        image14.setImageResource(R.mipmap.tick_xanhs1);
                    }else{
                        card14.setCardBackgroundColor(Color.WHITE);
                        card14.setCardElevation(8);
                        image14.setImageResource(R.mipmap.next_offical);
                    }
                    SharedPreferences sharedPreferences15 = context.getSharedPreferences("TuongLaiD", MODE_PRIVATE);
                    String tex15 = sharedPreferences15.getString(TEXT, "");
                    text15.setText(tex15);
                    if( text15.getText().toString().length() > 0 ) {
                        card15.setCardBackgroundColor(0xFFEDEDED);
                        card15.setCardElevation(0);
                        image15.setImageResource(R.mipmap.tick_xanhs1);
                    }else{
                        card15.setCardBackgroundColor(Color.WHITE);
                        card15.setCardElevation(8);
                        image15.setImageResource(R.mipmap.next_offical);
                    }
                    SharedPreferences sharedPreferences16 = context.getSharedPreferences("TuongLaiTD", MODE_PRIVATE);
                    String tex16 = sharedPreferences16.getString(TEXT, "");
                    text16.setText(tex16);
                    if( text16.getText().toString().length() > 0 ) {
                        card16.setCardBackgroundColor(0xFFEDEDED);
                        card16.setCardElevation(0);
                        image16.setImageResource(R.mipmap.tick_xanhs1);
                    }else{
                        card16.setCardBackgroundColor(Color.WHITE);
                        card16.setCardElevation(8);
                        image16.setImageResource(R.mipmap.next_offical);
                    }
                    SharedPreferences sharedPreferences17 = context.getSharedPreferences("LuyenTapBay", MODE_PRIVATE);
                    String tex17 = sharedPreferences17.getString(TEXT, "");
                    text17.setText(tex17);
                    if( text17.getText().toString().length() > 0 ) {
                        card17.setCardBackgroundColor(0xFFEDEDED);
                        card17.setCardElevation(0);
                        image17.setImageResource(R.mipmap.tick_xanhs1);
                    }else{
                        card17.setCardBackgroundColor(Color.WHITE);
                        card17.setCardElevation(8);
                        image17.setImageResource(R.mipmap.next_offical);
                    }
                    SharedPreferences sharedPreferences18 = context.getSharedPreferences("TuongLaiHT", MODE_PRIVATE);
                    String tex18 = sharedPreferences18.getString(TEXT, "");
                    text18.setText(tex18);
                    if( text18.getText().toString().length() > 0 ) {
                        card18.setCardBackgroundColor(0xFFEDEDED);
                        card18.setCardElevation(0);
                        image18.setImageResource(R.mipmap.tick_xanhs1);
                    }else{
                        card18.setCardBackgroundColor(Color.WHITE);
                        card18.setCardElevation(8);
                        image18.setImageResource(R.mipmap.next_offical);
                    }
                    SharedPreferences sharedPreferences19 = context.getSharedPreferences("TuongLaiHTTD", MODE_PRIVATE);
                    String tex19 = sharedPreferences19.getString(TEXT, "");
                    text19.setText(tex19);
                    if( text19.getText().toString().length() > 0 ) {
                        card19.setCardBackgroundColor(0xFFEDEDED);
                        card19.setCardElevation(0);
                        image19.setImageResource(R.mipmap.tick_xanhs1);
                    }else{
                        card19.setCardBackgroundColor(Color.WHITE);
                        card19.setCardElevation(8);
                        image19.setImageResource(R.mipmap.next_offical);
                    }
                    SharedPreferences sharedPreferences20 = context.getSharedPreferences("LuyenTapTam", MODE_PRIVATE);
                    String tex20 = sharedPreferences20.getString(TEXT, "");
                    text20.setText(tex20);
                    if( text20.getText().toString().length() > 0 ) {
                        card20.setCardBackgroundColor(0xFFEDEDED);
                        card20.setCardElevation(0);
                        image20.setImageResource(R.mipmap.tick_xanhs1);
                    }else{
                        card20.setCardBackgroundColor(Color.WHITE);
                        card20.setCardElevation(8);
                        image20.setImageResource(R.mipmap.next_offical);
                    }
                    SharedPreferences sharedPreferences21 = context.getSharedPreferences("LuyenTapChin", MODE_PRIVATE);
                    String tex21 = sharedPreferences21.getString(TEXT, "");
                    text21.setText(tex21);
                    if( text21.getText().toString().length() > 0 ) {
                        card21.setCardBackgroundColor(0xFFEDEDED);
                        card21.setCardElevation(0);
                        image21.setImageResource(R.mipmap.tick_xanhs1);
                    }else{
                        card21.setCardBackgroundColor(Color.WHITE);
                        card21.setCardElevation(8);
                        image21.setImageResource(R.mipmap.next_offical);
                    }
                    SharedPreferences sharedPreferences22 = context.getSharedPreferences("LuyenTapMuoi", MODE_PRIVATE);
                    String tex22 = sharedPreferences22.getString(TEXT, "");
                    text22.setText(tex22);
                    if( text22.getText().toString().length() > 0 ) {
                        card22.setCardBackgroundColor(0xFFEDEDED);
                        card22.setCardElevation(0);
                        image22.setImageResource(R.mipmap.tick_xanhs1);
                    }else{
                        card22.setCardBackgroundColor(Color.WHITE);
                        card22.setCardElevation(8);
                        image22.setImageResource(R.mipmap.next_offical);
                    }
                }
            });
            button19.setOnClickListener(new View.OnClickListener(){
                @Override
                public void onClick(View v) {
                    Intent i = new Intent(v.getContext(), TuongLaiHTTD.class);
                    v.getContext().startActivity(i);
                    SharedPreferences sharedPreferences12 = context.getSharedPreferences("QuaKhuHTTD", MODE_PRIVATE);
                    String tex12 = sharedPreferences12.getString(TEXT, "");
                    text12.setText(tex12);
                    if( text12.getText().toString().length() > 0 ) {
                        card12.setCardBackgroundColor(0xFFEDEDED);
                        card12.setCardElevation(0);
                        image12.setImageResource(R.mipmap.tick_xanhs1);
                    }else{
                        card12.setCardBackgroundColor(Color.WHITE);
                        card12.setCardElevation(8);
                        image12.setImageResource(R.mipmap.next_offical);
                    }
                    SharedPreferences sharedPreferences13 = context.getSharedPreferences("LuyenTapNam", MODE_PRIVATE);
                    String tex13 = sharedPreferences13.getString(TEXT, "");
                    text13.setText(tex13);
                    if( text13.getText().toString().length() > 0 ) {
                        card13.setCardBackgroundColor(0xFFEDEDED);
                        card13.setCardElevation(0);
                        image13.setImageResource(R.mipmap.tick_xanhs1);
                    }else{
                        card13.setCardBackgroundColor(Color.WHITE);
                        card13.setCardElevation(8);
                        image13.setImageResource(R.mipmap.next_offical);
                    }
                    SharedPreferences sharedPreferences14 = context.getSharedPreferences("LuyenTapSau", MODE_PRIVATE);
                    String tex14 = sharedPreferences14.getString(TEXT, "");
                    text14.setText(tex14);
                    if( text14.getText().toString().length() > 0 ) {
                        card14.setCardBackgroundColor(0xFFEDEDED);
                        card14.setCardElevation(0);
                        image14.setImageResource(R.mipmap.tick_xanhs1);
                    }else{
                        card14.setCardBackgroundColor(Color.WHITE);
                        card14.setCardElevation(8);
                        image14.setImageResource(R.mipmap.next_offical);
                    }
                    SharedPreferences sharedPreferences15 = context.getSharedPreferences("TuongLaiD", MODE_PRIVATE);
                    String tex15 = sharedPreferences15.getString(TEXT, "");
                    text15.setText(tex15);
                    if( text15.getText().toString().length() > 0 ) {
                        card15.setCardBackgroundColor(0xFFEDEDED);
                        card15.setCardElevation(0);
                        image15.setImageResource(R.mipmap.tick_xanhs1);
                    }else{
                        card15.setCardBackgroundColor(Color.WHITE);
                        card15.setCardElevation(8);
                        image15.setImageResource(R.mipmap.next_offical);
                    }
                    SharedPreferences sharedPreferences16 = context.getSharedPreferences("TuongLaiTD", MODE_PRIVATE);
                    String tex16 = sharedPreferences16.getString(TEXT, "");
                    text16.setText(tex16);
                    if( text16.getText().toString().length() > 0 ) {
                        card16.setCardBackgroundColor(0xFFEDEDED);
                        card16.setCardElevation(0);
                        image16.setImageResource(R.mipmap.tick_xanhs1);
                    }else{
                        card16.setCardBackgroundColor(Color.WHITE);
                        card16.setCardElevation(8);
                        image16.setImageResource(R.mipmap.next_offical);
                    }
                    SharedPreferences sharedPreferences17 = context.getSharedPreferences("LuyenTapBay", MODE_PRIVATE);
                    String tex17 = sharedPreferences17.getString(TEXT, "");
                    text17.setText(tex17);
                    if( text17.getText().toString().length() > 0 ) {
                        card17.setCardBackgroundColor(0xFFEDEDED);
                        card17.setCardElevation(0);
                        image17.setImageResource(R.mipmap.tick_xanhs1);
                    }else{
                        card17.setCardBackgroundColor(Color.WHITE);
                        card17.setCardElevation(8);
                        image17.setImageResource(R.mipmap.next_offical);
                    }
                    SharedPreferences sharedPreferences18 = context.getSharedPreferences("TuongLaiHT", MODE_PRIVATE);
                    String tex18 = sharedPreferences18.getString(TEXT, "");
                    text18.setText(tex18);
                    if( text18.getText().toString().length() > 0 ) {
                        card18.setCardBackgroundColor(0xFFEDEDED);
                        card18.setCardElevation(0);
                        image18.setImageResource(R.mipmap.tick_xanhs1);
                    }else{
                        card18.setCardBackgroundColor(Color.WHITE);
                        card18.setCardElevation(8);
                        image18.setImageResource(R.mipmap.next_offical);
                    }
                    SharedPreferences sharedPreferences19 = context.getSharedPreferences("TuongLaiHTTD", MODE_PRIVATE);
                    String tex19 = sharedPreferences19.getString(TEXT, "");
                    text19.setText(tex19);
                    if( text19.getText().toString().length() > 0 ) {
                        card19.setCardBackgroundColor(0xFFEDEDED);
                        card19.setCardElevation(0);
                        image19.setImageResource(R.mipmap.tick_xanhs1);
                    }else{
                        card19.setCardBackgroundColor(Color.WHITE);
                        card19.setCardElevation(8);
                        image19.setImageResource(R.mipmap.next_offical);
                    }
                    SharedPreferences sharedPreferences20 = context.getSharedPreferences("LuyenTapTam", MODE_PRIVATE);
                    String tex20 = sharedPreferences20.getString(TEXT, "");
                    text20.setText(tex20);
                    if( text20.getText().toString().length() > 0 ) {
                        card20.setCardBackgroundColor(0xFFEDEDED);
                        card20.setCardElevation(0);
                        image20.setImageResource(R.mipmap.tick_xanhs1);
                    }else{
                        card20.setCardBackgroundColor(Color.WHITE);
                        card20.setCardElevation(8);
                        image20.setImageResource(R.mipmap.next_offical);
                    }
                    SharedPreferences sharedPreferences21 = context.getSharedPreferences("LuyenTapChin", MODE_PRIVATE);
                    String tex21 = sharedPreferences21.getString(TEXT, "");
                    text21.setText(tex21);
                    if( text21.getText().toString().length() > 0 ) {
                        card21.setCardBackgroundColor(0xFFEDEDED);
                        card21.setCardElevation(0);
                        image21.setImageResource(R.mipmap.tick_xanhs1);
                    }else{
                        card21.setCardBackgroundColor(Color.WHITE);
                        card21.setCardElevation(8);
                        image21.setImageResource(R.mipmap.next_offical);
                    }
                    SharedPreferences sharedPreferences22 = context.getSharedPreferences("LuyenTapMuoi", MODE_PRIVATE);
                    String tex22 = sharedPreferences22.getString(TEXT, "");
                    text22.setText(tex22);
                    if( text22.getText().toString().length() > 0 ) {
                        card22.setCardBackgroundColor(0xFFEDEDED);
                        card22.setCardElevation(0);
                        image22.setImageResource(R.mipmap.tick_xanhs1);
                    }else{
                        card22.setCardBackgroundColor(Color.WHITE);
                        card22.setCardElevation(8);
                        image22.setImageResource(R.mipmap.next_offical);
                    }
                }
            });
            button20.setOnClickListener(new View.OnClickListener(){
                @Override
                public void onClick(View v) {
                    id_interstitial=20;
                    if (mInterstitialAd.isLoaded()) {
                        mInterstitialAd.show();
                    } else {
                        Intent i = new Intent(v.getContext(), LuyenTapTam.class);
                        v.getContext().startActivity(i);
                    }
                    SharedPreferences sharedPreferences13 = context.getSharedPreferences("LuyenTapNam", MODE_PRIVATE);
                    String tex13 = sharedPreferences13.getString(TEXT, "");
                    text13.setText(tex13);
                    if( text13.getText().toString().length() > 0 ) {
                        card13.setCardBackgroundColor(0xFFEDEDED);
                        card13.setCardElevation(0);
                        image13.setImageResource(R.mipmap.tick_xanhs1);
                    }else{
                        card13.setCardBackgroundColor(Color.WHITE);
                        card13.setCardElevation(8);
                        image13.setImageResource(R.mipmap.next_offical);
                    }
                    SharedPreferences sharedPreferences14 = context.getSharedPreferences("LuyenTapSau", MODE_PRIVATE);
                    String tex14 = sharedPreferences14.getString(TEXT, "");
                    text14.setText(tex14);
                    if( text14.getText().toString().length() > 0 ) {
                        card14.setCardBackgroundColor(0xFFEDEDED);
                        card14.setCardElevation(0);
                        image14.setImageResource(R.mipmap.tick_xanhs1);
                    }else{
                        card14.setCardBackgroundColor(Color.WHITE);
                        card14.setCardElevation(8);
                        image14.setImageResource(R.mipmap.next_offical);
                    }
                    SharedPreferences sharedPreferences15 = context.getSharedPreferences("TuongLaiD", MODE_PRIVATE);
                    String tex15 = sharedPreferences15.getString(TEXT, "");
                    text15.setText(tex15);
                    if( text15.getText().toString().length() > 0 ) {
                        card15.setCardBackgroundColor(0xFFEDEDED);
                        card15.setCardElevation(0);
                        image15.setImageResource(R.mipmap.tick_xanhs1);
                    }else{
                        card15.setCardBackgroundColor(Color.WHITE);
                        card15.setCardElevation(8);
                        image15.setImageResource(R.mipmap.next_offical);
                    }
                    SharedPreferences sharedPreferences16 = context.getSharedPreferences("TuongLaiTD", MODE_PRIVATE);
                    String tex16 = sharedPreferences16.getString(TEXT, "");
                    text16.setText(tex16);
                    if( text16.getText().toString().length() > 0 ) {
                        card16.setCardBackgroundColor(0xFFEDEDED);
                        card16.setCardElevation(0);
                        image16.setImageResource(R.mipmap.tick_xanhs1);
                    }else{
                        card16.setCardBackgroundColor(Color.WHITE);
                        card16.setCardElevation(8);
                        image16.setImageResource(R.mipmap.next_offical);
                    }
                    SharedPreferences sharedPreferences17 = context.getSharedPreferences("LuyenTapBay", MODE_PRIVATE);
                    String tex17 = sharedPreferences17.getString(TEXT, "");
                    text17.setText(tex17);
                    if( text17.getText().toString().length() > 0 ) {
                        card17.setCardBackgroundColor(0xFFEDEDED);
                        card17.setCardElevation(0);
                        image17.setImageResource(R.mipmap.tick_xanhs1);
                    }else{
                        card17.setCardBackgroundColor(Color.WHITE);
                        card17.setCardElevation(8);
                        image17.setImageResource(R.mipmap.next_offical);
                    }
                    SharedPreferences sharedPreferences18 = context.getSharedPreferences("TuongLaiHT", MODE_PRIVATE);
                    String tex18 = sharedPreferences18.getString(TEXT, "");
                    text18.setText(tex18);
                    if( text18.getText().toString().length() > 0 ) {
                        card18.setCardBackgroundColor(0xFFEDEDED);
                        card18.setCardElevation(0);
                        image18.setImageResource(R.mipmap.tick_xanhs1);
                    }else{
                        card18.setCardBackgroundColor(Color.WHITE);
                        card18.setCardElevation(8);
                        image18.setImageResource(R.mipmap.next_offical);
                    }
                    SharedPreferences sharedPreferences19 = context.getSharedPreferences("TuongLaiHTTD", MODE_PRIVATE);
                    String tex19 = sharedPreferences19.getString(TEXT, "");
                    text19.setText(tex19);
                    if( text19.getText().toString().length() > 0 ) {
                        card19.setCardBackgroundColor(0xFFEDEDED);
                        card19.setCardElevation(0);
                        image19.setImageResource(R.mipmap.tick_xanhs1);
                    }else{
                        card19.setCardBackgroundColor(Color.WHITE);
                        card19.setCardElevation(8);
                        image19.setImageResource(R.mipmap.next_offical);
                    }
                    SharedPreferences sharedPreferences20 = context.getSharedPreferences("LuyenTapTam", MODE_PRIVATE);
                    String tex20 = sharedPreferences20.getString(TEXT, "");
                    text20.setText(tex20);
                    if( text20.getText().toString().length() > 0 ) {
                        card20.setCardBackgroundColor(0xFFEDEDED);
                        card20.setCardElevation(0);
                        image20.setImageResource(R.mipmap.tick_xanhs1);
                    }else{
                        card20.setCardBackgroundColor(Color.WHITE);
                        card20.setCardElevation(8);
                        image20.setImageResource(R.mipmap.next_offical);
                    }
                    SharedPreferences sharedPreferences21 = context.getSharedPreferences("LuyenTapChin", MODE_PRIVATE);
                    String tex21 = sharedPreferences21.getString(TEXT, "");
                    text21.setText(tex21);
                    if( text21.getText().toString().length() > 0 ) {
                        card21.setCardBackgroundColor(0xFFEDEDED);
                        card21.setCardElevation(0);
                        image21.setImageResource(R.mipmap.tick_xanhs1);
                    }else{
                        card21.setCardBackgroundColor(Color.WHITE);
                        card21.setCardElevation(8);
                        image21.setImageResource(R.mipmap.next_offical);
                    }
                    SharedPreferences sharedPreferences22 = context.getSharedPreferences("LuyenTapMuoi", MODE_PRIVATE);
                    String tex22 = sharedPreferences22.getString(TEXT, "");
                    text22.setText(tex22);
                    if( text22.getText().toString().length() > 0 ) {
                        card22.setCardBackgroundColor(0xFFEDEDED);
                        card22.setCardElevation(0);
                        image22.setImageResource(R.mipmap.tick_xanhs1);
                    }else{
                        card22.setCardBackgroundColor(Color.WHITE);
                        card22.setCardElevation(8);
                        image22.setImageResource(R.mipmap.next_offical);
                    }
                }
            });
            button21.setOnClickListener(new View.OnClickListener(){
                @Override
                public void onClick(View v) {
                    Intent i = new Intent(v.getContext(), LuyenTapChin.class);
                    v.getContext().startActivity(i);
                    SharedPreferences sharedPreferences14 = context.getSharedPreferences("LuyenTapSau", MODE_PRIVATE);
                    String tex14 = sharedPreferences14.getString(TEXT, "");
                    text14.setText(tex14);
                    if( text14.getText().toString().length() > 0 ) {
                        card14.setCardBackgroundColor(0xFFEDEDED);
                        card14.setCardElevation(0);
                        image14.setImageResource(R.mipmap.tick_xanhs1);
                    }else{
                        card14.setCardBackgroundColor(Color.WHITE);
                        card14.setCardElevation(8);
                        image14.setImageResource(R.mipmap.next_offical);
                    }
                    SharedPreferences sharedPreferences15 = context.getSharedPreferences("TuongLaiD", MODE_PRIVATE);
                    String tex15 = sharedPreferences15.getString(TEXT, "");
                    text15.setText(tex15);
                    if( text15.getText().toString().length() > 0 ) {
                        card15.setCardBackgroundColor(0xFFEDEDED);
                        card15.setCardElevation(0);
                        image15.setImageResource(R.mipmap.tick_xanhs1);
                    }else{
                        card15.setCardBackgroundColor(Color.WHITE);
                        card15.setCardElevation(8);
                        image15.setImageResource(R.mipmap.next_offical);
                    }
                    SharedPreferences sharedPreferences16 = context.getSharedPreferences("TuongLaiTD", MODE_PRIVATE);
                    String tex16 = sharedPreferences16.getString(TEXT, "");
                    text16.setText(tex16);
                    if( text16.getText().toString().length() > 0 ) {
                        card16.setCardBackgroundColor(0xFFEDEDED);
                        card16.setCardElevation(0);
                        image16.setImageResource(R.mipmap.tick_xanhs1);
                    }else{
                        card16.setCardBackgroundColor(Color.WHITE);
                        card16.setCardElevation(8);
                        image16.setImageResource(R.mipmap.next_offical);
                    }
                    SharedPreferences sharedPreferences17 = context.getSharedPreferences("LuyenTapBay", MODE_PRIVATE);
                    String tex17 = sharedPreferences17.getString(TEXT, "");
                    text17.setText(tex17);
                    if( text17.getText().toString().length() > 0 ) {
                        card17.setCardBackgroundColor(0xFFEDEDED);
                        card17.setCardElevation(0);
                        image17.setImageResource(R.mipmap.tick_xanhs1);
                    }else{
                        card17.setCardBackgroundColor(Color.WHITE);
                        card17.setCardElevation(8);
                        image17.setImageResource(R.mipmap.next_offical);
                    }
                    SharedPreferences sharedPreferences18 = context.getSharedPreferences("TuongLaiHT", MODE_PRIVATE);
                    String tex18 = sharedPreferences18.getString(TEXT, "");
                    text18.setText(tex18);
                    if( text18.getText().toString().length() > 0 ) {
                        card18.setCardBackgroundColor(0xFFEDEDED);
                        card18.setCardElevation(0);
                        image18.setImageResource(R.mipmap.tick_xanhs1);
                    }else{
                        card18.setCardBackgroundColor(Color.WHITE);
                        card18.setCardElevation(8);
                        image18.setImageResource(R.mipmap.next_offical);
                    }
                    SharedPreferences sharedPreferences19 = context.getSharedPreferences("TuongLaiHTTD", MODE_PRIVATE);
                    String tex19 = sharedPreferences19.getString(TEXT, "");
                    text19.setText(tex19);
                    if( text19.getText().toString().length() > 0 ) {
                        card19.setCardBackgroundColor(0xFFEDEDED);
                        card19.setCardElevation(0);
                        image19.setImageResource(R.mipmap.tick_xanhs1);
                    }else{
                        card19.setCardBackgroundColor(Color.WHITE);
                        card19.setCardElevation(8);
                        image19.setImageResource(R.mipmap.next_offical);
                    }
                    SharedPreferences sharedPreferences20 = context.getSharedPreferences("LuyenTapTam", MODE_PRIVATE);
                    String tex20 = sharedPreferences20.getString(TEXT, "");
                    text20.setText(tex20);
                    if( text20.getText().toString().length() > 0 ) {
                        card20.setCardBackgroundColor(0xFFEDEDED);
                        card20.setCardElevation(0);
                        image20.setImageResource(R.mipmap.tick_xanhs1);
                    }else{
                        card20.setCardBackgroundColor(Color.WHITE);
                        card20.setCardElevation(8);
                        image20.setImageResource(R.mipmap.next_offical);
                    }
                    SharedPreferences sharedPreferences21 = context.getSharedPreferences("LuyenTapChin", MODE_PRIVATE);
                    String tex21 = sharedPreferences21.getString(TEXT, "");
                    text21.setText(tex21);
                    if( text21.getText().toString().length() > 0 ) {
                        card21.setCardBackgroundColor(0xFFEDEDED);
                        card21.setCardElevation(0);
                        image21.setImageResource(R.mipmap.tick_xanhs1);
                    }else{
                        card21.setCardBackgroundColor(Color.WHITE);
                        card21.setCardElevation(8);
                        image21.setImageResource(R.mipmap.next_offical);
                    }
                    SharedPreferences sharedPreferences22 = context.getSharedPreferences("LuyenTapMuoi", MODE_PRIVATE);
                    String tex22 = sharedPreferences22.getString(TEXT, "");
                    text22.setText(tex22);
                    if( text22.getText().toString().length() > 0 ) {
                        card22.setCardBackgroundColor(0xFFEDEDED);
                        card22.setCardElevation(0);
                        image22.setImageResource(R.mipmap.tick_xanhs1);
                    }else{
                        card22.setCardBackgroundColor(Color.WHITE);
                        card22.setCardElevation(8);
                        image22.setImageResource(R.mipmap.next_offical);
                    }
                }
            });
            button22.setOnClickListener(new View.OnClickListener(){
                @Override
                public void onClick(View v) {
                    id_interstitial=22;
                    if (mInterstitialAd.isLoaded()) {
                        mInterstitialAd.show();
                    } else {
                        Intent i = new Intent(v.getContext(), LuyenTapMuoi.class);
                        v.getContext().startActivity(i);
                    }
                    SharedPreferences sharedPreferences15 = context.getSharedPreferences("TuongLaiD", MODE_PRIVATE);
                    String tex15 = sharedPreferences15.getString(TEXT, "");
                    text15.setText(tex15);
                    if( text15.getText().toString().length() > 0 ) {
                        card15.setCardBackgroundColor(0xFFEDEDED);
                        card15.setCardElevation(0);
                        image15.setImageResource(R.mipmap.tick_xanhs1);
                    }else{
                        card15.setCardBackgroundColor(Color.WHITE);
                        card15.setCardElevation(8);
                        image15.setImageResource(R.mipmap.next_offical);
                    }
                    SharedPreferences sharedPreferences16 = context.getSharedPreferences("TuongLaiTD", MODE_PRIVATE);
                    String tex16 = sharedPreferences16.getString(TEXT, "");
                    text16.setText(tex16);
                    if( text16.getText().toString().length() > 0 ) {
                        card16.setCardBackgroundColor(0xFFEDEDED);
                        card16.setCardElevation(0);
                        image16.setImageResource(R.mipmap.tick_xanhs1);
                    }else{
                        card16.setCardBackgroundColor(Color.WHITE);
                        card16.setCardElevation(8);
                        image16.setImageResource(R.mipmap.next_offical);
                    }
                    SharedPreferences sharedPreferences17 = context.getSharedPreferences("LuyenTapBay", MODE_PRIVATE);
                    String tex17 = sharedPreferences17.getString(TEXT, "");
                    text17.setText(tex17);
                    if( text17.getText().toString().length() > 0 ) {
                        card17.setCardBackgroundColor(0xFFEDEDED);
                        card17.setCardElevation(0);
                        image17.setImageResource(R.mipmap.tick_xanhs1);
                    }else{
                        card17.setCardBackgroundColor(Color.WHITE);
                        card17.setCardElevation(8);
                        image17.setImageResource(R.mipmap.next_offical);
                    }
                    SharedPreferences sharedPreferences18 = context.getSharedPreferences("TuongLaiHT", MODE_PRIVATE);
                    String tex18 = sharedPreferences18.getString(TEXT, "");
                    text18.setText(tex18);
                    if( text18.getText().toString().length() > 0 ) {
                        card18.setCardBackgroundColor(0xFFEDEDED);
                        card18.setCardElevation(0);
                        image18.setImageResource(R.mipmap.tick_xanhs1);
                    }else{
                        card18.setCardBackgroundColor(Color.WHITE);
                        card18.setCardElevation(8);
                        image18.setImageResource(R.mipmap.next_offical);
                    }
                    SharedPreferences sharedPreferences19 = context.getSharedPreferences("TuongLaiHTTD", MODE_PRIVATE);
                    String tex19 = sharedPreferences19.getString(TEXT, "");
                    text19.setText(tex19);
                    if( text19.getText().toString().length() > 0 ) {
                        card19.setCardBackgroundColor(0xFFEDEDED);
                        card19.setCardElevation(0);
                        image19.setImageResource(R.mipmap.tick_xanhs1);
                    }else{
                        card19.setCardBackgroundColor(Color.WHITE);
                        card19.setCardElevation(8);
                        image19.setImageResource(R.mipmap.next_offical);
                    }
                    SharedPreferences sharedPreferences20 = context.getSharedPreferences("LuyenTapTam", MODE_PRIVATE);
                    String tex20 = sharedPreferences20.getString(TEXT, "");
                    text20.setText(tex20);
                    if( text20.getText().toString().length() > 0 ) {
                        card20.setCardBackgroundColor(0xFFEDEDED);
                        card20.setCardElevation(0);
                        image20.setImageResource(R.mipmap.tick_xanhs1);
                    }else{
                        card20.setCardBackgroundColor(Color.WHITE);
                        card20.setCardElevation(8);
                        image20.setImageResource(R.mipmap.next_offical);
                    }
                    SharedPreferences sharedPreferences21 = context.getSharedPreferences("LuyenTapChin", MODE_PRIVATE);
                    String tex21 = sharedPreferences21.getString(TEXT, "");
                    text21.setText(tex21);
                    if( text21.getText().toString().length() > 0 ) {
                        card21.setCardBackgroundColor(0xFFEDEDED);
                        card21.setCardElevation(0);
                        image21.setImageResource(R.mipmap.tick_xanhs1);
                    }else{
                        card21.setCardBackgroundColor(Color.WHITE);
                        card21.setCardElevation(8);
                        image21.setImageResource(R.mipmap.next_offical);
                    }
                    SharedPreferences sharedPreferences22 = context.getSharedPreferences("LuyenTapMuoi", MODE_PRIVATE);
                    String tex22 = sharedPreferences22.getString(TEXT, "");
                    text22.setText(tex22);
                    if( text22.getText().toString().length() > 0 ) {
                        card22.setCardBackgroundColor(0xFFEDEDED);
                        card22.setCardElevation(0);
                        image22.setImageResource(R.mipmap.tick_xanhs1);
                    }else{
                        card22.setCardBackgroundColor(Color.WHITE);
                        card22.setCardElevation(8);
                        image22.setImageResource(R.mipmap.next_offical);
                    }
                }
            });

            layout.setOnClickListener(new View.OnClickListener(){
                @Override
                public void onClick(View v) {
                    SharedPreferences sharedPreferences6 = context.getSharedPreferences("LuyenTapHai", MODE_PRIVATE);
                    String tex6 = sharedPreferences6.getString(TEXT, "");
                    text6.setText(tex6);
                    if( text6.getText().toString().length() > 0 ) {
                        card6.setCardBackgroundColor(0xFFEDEDED);
                        card6.setCardElevation(0);
                        image6.setImageResource(R.mipmap.tick_xanhs1);
                    }else{
                        card6.setCardBackgroundColor(Color.WHITE);
                        card6.setCardElevation(8);
                        image6.setImageResource(R.mipmap.next_offical);
                    }
                    SharedPreferences sharedPreferences7 = context.getSharedPreferences("LuyenTapBa", MODE_PRIVATE);
                    String tex7 = sharedPreferences7.getString(TEXT, "");
                    text7.setText(tex7);
                    if( text7.getText().toString().length() > 0 ) {
                        card7.setCardBackgroundColor(0xFFEDEDED);
                        card7.setCardElevation(0);
                        image7.setImageResource(R.mipmap.tick_xanhs1);
                    }else{
                        card7.setCardBackgroundColor(Color.WHITE);
                        card7.setCardElevation(8);
                        image7.setImageResource(R.mipmap.next_offical);
                    }
                    SharedPreferences sharedPreferences8 = context.getSharedPreferences("QuaKhuD", MODE_PRIVATE);
                    String tex8 = sharedPreferences8.getString(TEXT, "");
                    text8.setText(tex8);
                    if( text8.getText().toString().length() > 0 ) {
                        card8.setCardBackgroundColor(0xFFEDEDED);
                        card8.setCardElevation(0);
                        image8.setImageResource(R.mipmap.tick_xanhs1);
                    }else{
                        card8.setCardBackgroundColor(Color.WHITE);
                        card8.setCardElevation(8);
                        image8.setImageResource(R.mipmap.next_offical);
                    }
                    SharedPreferences sharedPreferences9 = context.getSharedPreferences("QuaKhuTD", MODE_PRIVATE);
                    String tex9 = sharedPreferences9.getString(TEXT, "");
                    text9.setText(tex9);
                    if( text9.getText().toString().length() > 0 ) {
                        card9.setCardBackgroundColor(0xFFEDEDED);
                        card9.setCardElevation(0);
                        image9.setImageResource(R.mipmap.tick_xanhs1);
                    }else{
                        card9.setCardBackgroundColor(Color.WHITE);
                        card9.setCardElevation(8);
                        image9.setImageResource(R.mipmap.next_offical);
                    }
                    SharedPreferences sharedPreferences10 = context.getSharedPreferences("LuyenTapBon", MODE_PRIVATE);
                    String tex10 = sharedPreferences10.getString(TEXT, "");
                    text10.setText(tex10);
                    if( text10.getText().toString().length() > 0 ) {
                        card10.setCardBackgroundColor(0xFFEDEDED);
                        card10.setCardElevation(0);
                        image10.setImageResource(R.mipmap.tick_xanhs1);
                    }else{
                        card10.setCardBackgroundColor(Color.WHITE);
                        card10.setCardElevation(8);
                        image10.setImageResource(R.mipmap.next_offical);
                    }
                    SharedPreferences sharedPreferences11 = context.getSharedPreferences("QuaKhuHT", MODE_PRIVATE);
                    String tex11 = sharedPreferences11.getString(TEXT, "");
                    text11.setText(tex11);
                    if( text11.getText().toString().length() > 0 ) {
                        card11.setCardBackgroundColor(0xFFEDEDED);
                        card11.setCardElevation(0);
                        image11.setImageResource(R.mipmap.tick_xanhs1);
                    }else{
                        card11.setCardBackgroundColor(Color.WHITE);
                        card11.setCardElevation(8);
                        image11.setImageResource(R.mipmap.next_offical);
                    }
                    SharedPreferences sharedPreferences12 = context.getSharedPreferences("QuaKhuHTTD", MODE_PRIVATE);
                    String tex12 = sharedPreferences12.getString(TEXT, "");
                    text12.setText(tex12);
                    if( text12.getText().toString().length() > 0 ) {
                        card12.setCardBackgroundColor(0xFFEDEDED);
                        card12.setCardElevation(0);
                        image12.setImageResource(R.mipmap.tick_xanhs1);
                    }else{
                        card12.setCardBackgroundColor(Color.WHITE);
                        card12.setCardElevation(8);
                        image12.setImageResource(R.mipmap.next_offical);
                    }
                    SharedPreferences sharedPreferences13 = context.getSharedPreferences("LuyenTapNam", MODE_PRIVATE);
                    String tex13 = sharedPreferences13.getString(TEXT, "");
                    text13.setText(tex13);
                    if( text13.getText().toString().length() > 0 ) {
                        card13.setCardBackgroundColor(0xFFEDEDED);
                        card13.setCardElevation(0);
                        image13.setImageResource(R.mipmap.tick_xanhs1);
                    }else{
                        card13.setCardBackgroundColor(Color.WHITE);
                        card13.setCardElevation(8);
                        image13.setImageResource(R.mipmap.next_offical);
                    }
                    SharedPreferences sharedPreferences14 = context.getSharedPreferences("LuyenTapSau", MODE_PRIVATE);
                    String tex14 = sharedPreferences14.getString(TEXT, "");
                    text14.setText(tex14);
                    if( text14.getText().toString().length() > 0 ) {
                        card14.setCardBackgroundColor(0xFFEDEDED);
                        card14.setCardElevation(0);
                        image14.setImageResource(R.mipmap.tick_xanhs1);
                    }else{
                        card14.setCardBackgroundColor(Color.WHITE);
                        card14.setCardElevation(8);
                        image14.setImageResource(R.mipmap.next_offical);
                    }
                    SharedPreferences sharedPreferences15 = context.getSharedPreferences("TuongLaiD", MODE_PRIVATE);
                    String tex15 = sharedPreferences15.getString(TEXT, "");
                    text15.setText(tex15);
                    if( text15.getText().toString().length() > 0 ) {
                        card15.setCardBackgroundColor(0xFFEDEDED);
                        card15.setCardElevation(0);
                        image15.setImageResource(R.mipmap.tick_xanhs1);
                    }else{
                        card15.setCardBackgroundColor(Color.WHITE);
                        card15.setCardElevation(8);
                        image15.setImageResource(R.mipmap.next_offical);
                    }
                    SharedPreferences sharedPreferences16 = context.getSharedPreferences("TuongLaiTD", MODE_PRIVATE);
                    String tex16 = sharedPreferences16.getString(TEXT, "");
                    text16.setText(tex16);
                    if( text16.getText().toString().length() > 0 ) {
                        card16.setCardBackgroundColor(0xFFEDEDED);
                        card16.setCardElevation(0);
                        image16.setImageResource(R.mipmap.tick_xanhs1);
                    }else{
                        card16.setCardBackgroundColor(Color.WHITE);
                        card16.setCardElevation(8);
                        image16.setImageResource(R.mipmap.next_offical);
                    }
                    SharedPreferences sharedPreferences17 = context.getSharedPreferences("LuyenTapBay", MODE_PRIVATE);
                    String tex17 = sharedPreferences17.getString(TEXT, "");
                    text17.setText(tex17);
                    if( text17.getText().toString().length() > 0 ) {
                        card17.setCardBackgroundColor(0xFFEDEDED);
                        card17.setCardElevation(0);
                        image17.setImageResource(R.mipmap.tick_xanhs1);
                    }else{
                        card17.setCardBackgroundColor(Color.WHITE);
                        card17.setCardElevation(8);
                        image17.setImageResource(R.mipmap.next_offical);
                    }
                    SharedPreferences sharedPreferences18 = context.getSharedPreferences("TuongLaiHT", MODE_PRIVATE);
                    String tex18 = sharedPreferences18.getString(TEXT, "");
                    text18.setText(tex18);
                    if( text18.getText().toString().length() > 0 ) {
                        card18.setCardBackgroundColor(0xFFEDEDED);
                        card18.setCardElevation(0);
                        image18.setImageResource(R.mipmap.tick_xanhs1);
                    }else{
                        card18.setCardBackgroundColor(Color.WHITE);
                        card18.setCardElevation(8);
                        image18.setImageResource(R.mipmap.next_offical);
                    }
                    SharedPreferences sharedPreferences19 = context.getSharedPreferences("TuongLaiHTTD", MODE_PRIVATE);
                    String tex19 = sharedPreferences19.getString(TEXT, "");
                    text19.setText(tex19);
                    if( text19.getText().toString().length() > 0 ) {
                        card19.setCardBackgroundColor(0xFFEDEDED);
                        card19.setCardElevation(0);
                        image19.setImageResource(R.mipmap.tick_xanhs1);
                    }else{
                        card19.setCardBackgroundColor(Color.WHITE);
                        card19.setCardElevation(8);
                        image19.setImageResource(R.mipmap.next_offical);
                    }
                    SharedPreferences sharedPreferences20 = context.getSharedPreferences("LuyenTapTam", MODE_PRIVATE);
                    String tex20 = sharedPreferences20.getString(TEXT, "");
                    text20.setText(tex20);
                    if( text20.getText().toString().length() > 0 ) {
                        card20.setCardBackgroundColor(0xFFEDEDED);
                        card20.setCardElevation(0);
                        image20.setImageResource(R.mipmap.tick_xanhs1);
                    }else{
                        card20.setCardBackgroundColor(Color.WHITE);
                        card20.setCardElevation(8);
                        image20.setImageResource(R.mipmap.next_offical);
                    }
                    SharedPreferences sharedPreferences21 = context.getSharedPreferences("LuyenTapChin", MODE_PRIVATE);
                    String tex21 = sharedPreferences21.getString(TEXT, "");
                    text21.setText(tex21);
                    if( text21.getText().toString().length() > 0 ) {
                        card21.setCardBackgroundColor(0xFFEDEDED);
                        card21.setCardElevation(0);
                        image21.setImageResource(R.mipmap.tick_xanhs1);
                    }else{
                        card21.setCardBackgroundColor(Color.WHITE);
                        card21.setCardElevation(8);
                        image21.setImageResource(R.mipmap.next_offical);
                    }
                    SharedPreferences sharedPreferences22 = context.getSharedPreferences("LuyenTapMuoi", MODE_PRIVATE);
                    String tex22 = sharedPreferences22.getString(TEXT, "");
                    text22.setText(tex22);
                    if( text22.getText().toString().length() > 0 ) {
                        card22.setCardBackgroundColor(0xFFEDEDED);
                        card22.setCardElevation(0);
                        image22.setImageResource(R.mipmap.tick_xanhs1);
                    }else{
                        card22.setCardBackgroundColor(Color.WHITE);
                        card22.setCardElevation(8);
                        image22.setImageResource(R.mipmap.next_offical);
                    }
                }
            });
            layout.setOnTouchListener(new View.OnTouchListener() {
                @Override
                public boolean onTouch(View v, MotionEvent event) {
                    SharedPreferences sharedPreferences6 = context.getSharedPreferences("LuyenTapHai", MODE_PRIVATE);
                    String tex6 = sharedPreferences6.getString(TEXT, "");
                    text6.setText(tex6);
                    if( text6.getText().toString().length() > 0 ) {
                        card6.setCardBackgroundColor(0xFFEDEDED);
                        card6.setCardElevation(0);
                        image6.setImageResource(R.mipmap.tick_xanhs1);
                    }else{
                        card6.setCardBackgroundColor(Color.WHITE);
                        card6.setCardElevation(8);
                        image6.setImageResource(R.mipmap.next_offical);
                    }
                    SharedPreferences sharedPreferences7 = context.getSharedPreferences("LuyenTapBa", MODE_PRIVATE);
                    String tex7 = sharedPreferences7.getString(TEXT, "");
                    text7.setText(tex7);
                    if( text7.getText().toString().length() > 0 ) {
                        card7.setCardBackgroundColor(0xFFEDEDED);
                        card7.setCardElevation(0);
                        image7.setImageResource(R.mipmap.tick_xanhs1);
                    }else{
                        card7.setCardBackgroundColor(Color.WHITE);
                        card7.setCardElevation(8);
                        image7.setImageResource(R.mipmap.next_offical);
                    }
                    SharedPreferences sharedPreferences8 = context.getSharedPreferences("QuaKhuD", MODE_PRIVATE);
                    String tex8 = sharedPreferences8.getString(TEXT, "");
                    text8.setText(tex8);
                    if( text8.getText().toString().length() > 0 ) {
                        card8.setCardBackgroundColor(0xFFEDEDED);
                        card8.setCardElevation(0);
                        image8.setImageResource(R.mipmap.tick_xanhs1);
                    }else{
                        card8.setCardBackgroundColor(Color.WHITE);
                        card8.setCardElevation(8);
                        image8.setImageResource(R.mipmap.next_offical);
                    }
                    SharedPreferences sharedPreferences9 = context.getSharedPreferences("QuaKhuTD", MODE_PRIVATE);
                    String tex9 = sharedPreferences9.getString(TEXT, "");
                    text9.setText(tex9);
                    if( text9.getText().toString().length() > 0 ) {
                        card9.setCardBackgroundColor(0xFFEDEDED);
                        card9.setCardElevation(0);
                        image9.setImageResource(R.mipmap.tick_xanhs1);
                    }else{
                        card9.setCardBackgroundColor(Color.WHITE);
                        card9.setCardElevation(8);
                        image9.setImageResource(R.mipmap.next_offical);
                    }
                    SharedPreferences sharedPreferences10 = context.getSharedPreferences("LuyenTapBon", MODE_PRIVATE);
                    String tex10 = sharedPreferences10.getString(TEXT, "");
                    text10.setText(tex10);
                    if( text10.getText().toString().length() > 0 ) {
                        card10.setCardBackgroundColor(0xFFEDEDED);
                        card10.setCardElevation(0);
                        image10.setImageResource(R.mipmap.tick_xanhs1);
                    }else{
                        card10.setCardBackgroundColor(Color.WHITE);
                        card10.setCardElevation(8);
                        image10.setImageResource(R.mipmap.next_offical);
                    }
                    SharedPreferences sharedPreferences11 = context.getSharedPreferences("QuaKhuHT", MODE_PRIVATE);
                    String tex11 = sharedPreferences11.getString(TEXT, "");
                    text11.setText(tex11);
                    if( text11.getText().toString().length() > 0 ) {
                        card11.setCardBackgroundColor(0xFFEDEDED);
                        card11.setCardElevation(0);
                        image11.setImageResource(R.mipmap.tick_xanhs1);
                    }else{
                        card11.setCardBackgroundColor(Color.WHITE);
                        card11.setCardElevation(8);
                        image11.setImageResource(R.mipmap.next_offical);
                    }
                    SharedPreferences sharedPreferences12 = context.getSharedPreferences("QuaKhuHTTD", MODE_PRIVATE);
                    String tex12 = sharedPreferences12.getString(TEXT, "");
                    text12.setText(tex12);
                    if( text12.getText().toString().length() > 0 ) {
                        card12.setCardBackgroundColor(0xFFEDEDED);
                        card12.setCardElevation(0);
                        image12.setImageResource(R.mipmap.tick_xanhs1);
                    }else{
                        card12.setCardBackgroundColor(Color.WHITE);
                        card12.setCardElevation(8);
                        image12.setImageResource(R.mipmap.next_offical);
                    }
                    SharedPreferences sharedPreferences13 = context.getSharedPreferences("LuyenTapNam", MODE_PRIVATE);
                    String tex13 = sharedPreferences13.getString(TEXT, "");
                    text13.setText(tex13);
                    if( text13.getText().toString().length() > 0 ) {
                        card13.setCardBackgroundColor(0xFFEDEDED);
                        card13.setCardElevation(0);
                        image13.setImageResource(R.mipmap.tick_xanhs1);
                    }else{
                        card13.setCardBackgroundColor(Color.WHITE);
                        card13.setCardElevation(8);
                        image13.setImageResource(R.mipmap.next_offical);
                    }
                    SharedPreferences sharedPreferences14 = context.getSharedPreferences("LuyenTapSau", MODE_PRIVATE);
                    String tex14 = sharedPreferences14.getString(TEXT, "");
                    text14.setText(tex14);
                    if( text14.getText().toString().length() > 0 ) {
                        card14.setCardBackgroundColor(0xFFEDEDED);
                        card14.setCardElevation(0);
                        image14.setImageResource(R.mipmap.tick_xanhs1);
                    }else{
                        card14.setCardBackgroundColor(Color.WHITE);
                        card14.setCardElevation(8);
                        image14.setImageResource(R.mipmap.next_offical);
                    }
                    SharedPreferences sharedPreferences15 = context.getSharedPreferences("TuongLaiD", MODE_PRIVATE);
                    String tex15 = sharedPreferences15.getString(TEXT, "");
                    text15.setText(tex15);
                    if( text15.getText().toString().length() > 0 ) {
                        card15.setCardBackgroundColor(0xFFEDEDED);
                        card15.setCardElevation(0);
                        image15.setImageResource(R.mipmap.tick_xanhs1);
                    }else{
                        card15.setCardBackgroundColor(Color.WHITE);
                        card15.setCardElevation(8);
                        image15.setImageResource(R.mipmap.next_offical);
                    }
                    SharedPreferences sharedPreferences16 = context.getSharedPreferences("TuongLaiTD", MODE_PRIVATE);
                    String tex16 = sharedPreferences16.getString(TEXT, "");
                    text16.setText(tex16);
                    if( text16.getText().toString().length() > 0 ) {
                        card16.setCardBackgroundColor(0xFFEDEDED);
                        card16.setCardElevation(0);
                        image16.setImageResource(R.mipmap.tick_xanhs1);
                    }else{
                        card16.setCardBackgroundColor(Color.WHITE);
                        card16.setCardElevation(8);
                        image16.setImageResource(R.mipmap.next_offical);
                    }
                    SharedPreferences sharedPreferences17 = context.getSharedPreferences("LuyenTapBay", MODE_PRIVATE);
                    String tex17 = sharedPreferences17.getString(TEXT, "");
                    text17.setText(tex17);
                    if( text17.getText().toString().length() > 0 ) {
                        card17.setCardBackgroundColor(0xFFEDEDED);
                        card17.setCardElevation(0);
                        image17.setImageResource(R.mipmap.tick_xanhs1);
                    }else{
                        card17.setCardBackgroundColor(Color.WHITE);
                        card17.setCardElevation(8);
                        image17.setImageResource(R.mipmap.next_offical);
                    }
                    SharedPreferences sharedPreferences18 = context.getSharedPreferences("TuongLaiHT", MODE_PRIVATE);
                    String tex18 = sharedPreferences18.getString(TEXT, "");
                    text18.setText(tex18);
                    if( text18.getText().toString().length() > 0 ) {
                        card18.setCardBackgroundColor(0xFFEDEDED);
                        card18.setCardElevation(0);
                        image18.setImageResource(R.mipmap.tick_xanhs1);
                    }else{
                        card18.setCardBackgroundColor(Color.WHITE);
                        card18.setCardElevation(8);
                        image18.setImageResource(R.mipmap.next_offical);
                    }
                    SharedPreferences sharedPreferences19 = context.getSharedPreferences("TuongLaiHTTD", MODE_PRIVATE);
                    String tex19 = sharedPreferences19.getString(TEXT, "");
                    text19.setText(tex19);
                    if( text19.getText().toString().length() > 0 ) {
                        card19.setCardBackgroundColor(0xFFEDEDED);
                        card19.setCardElevation(0);
                        image19.setImageResource(R.mipmap.tick_xanhs1);
                    }else{
                        card19.setCardBackgroundColor(Color.WHITE);
                        card19.setCardElevation(8);
                        image19.setImageResource(R.mipmap.next_offical);
                    }
                    SharedPreferences sharedPreferences20 = context.getSharedPreferences("LuyenTapTam", MODE_PRIVATE);
                    String tex20 = sharedPreferences20.getString(TEXT, "");
                    text20.setText(tex20);
                    if( text20.getText().toString().length() > 0 ) {
                        card20.setCardBackgroundColor(0xFFEDEDED);
                        card20.setCardElevation(0);
                        image20.setImageResource(R.mipmap.tick_xanhs1);
                    }else{
                        card20.setCardBackgroundColor(Color.WHITE);
                        card20.setCardElevation(8);
                        image20.setImageResource(R.mipmap.next_offical);
                    }
                    SharedPreferences sharedPreferences21 = context.getSharedPreferences("LuyenTapChin", MODE_PRIVATE);
                    String tex21 = sharedPreferences21.getString(TEXT, "");
                    text21.setText(tex21);
                    if( text21.getText().toString().length() > 0 ) {
                        card21.setCardBackgroundColor(0xFFEDEDED);
                        card21.setCardElevation(0);
                        image21.setImageResource(R.mipmap.tick_xanhs1);
                    }else{
                        card21.setCardBackgroundColor(Color.WHITE);
                        card21.setCardElevation(8);
                        image21.setImageResource(R.mipmap.next_offical);
                    }
                    SharedPreferences sharedPreferences22 = context.getSharedPreferences("LuyenTapMuoi", MODE_PRIVATE);
                    String tex22 = sharedPreferences22.getString(TEXT, "");
                    text22.setText(tex22);
                    if( text22.getText().toString().length() > 0 ) {
                        card22.setCardBackgroundColor(0xFFEDEDED);
                        card22.setCardElevation(0);
                        image22.setImageResource(R.mipmap.tick_xanhs1);
                    }else{
                        card22.setCardBackgroundColor(Color.WHITE);
                        card22.setCardElevation(8);
                        image22.setImageResource(R.mipmap.next_offical);
                    }
                    return false;
                }
            });

            SharedPreferences sharedPreferences = context.getSharedPreferences(SHARED_PREFS, MODE_PRIVATE);
            String tex1 = sharedPreferences.getString(TEXT, "");
            text1.setText(tex1);
           if( text1.getText().toString().length() > 0 ) {
                card1.setCardBackgroundColor(0xFFEDEDED);
                card1.setCardElevation(0);
                image1.setImageResource(R.mipmap.tick_xanhs1);
           }else{
               card1.setCardBackgroundColor(Color.WHITE);
               card1.setCardElevation(8);
               image1.setImageResource(R.mipmap.next_offical);
           }
           SharedPreferences sharedPreferences2 = context.getSharedPreferences("HienTaiTD", MODE_PRIVATE);
            String tex2 = sharedPreferences2.getString(TEXT, "");
            text2.setText(tex2);
           if( text2.getText().toString().length() > 0 ) {
                card2.setCardBackgroundColor(0xFFEDEDED);
                card2.setCardElevation(0);
                image2.setImageResource(R.mipmap.tick_xanhs1);
           }else{
               card2.setCardBackgroundColor(Color.WHITE);
               card2.setCardElevation(8);
               image2.setImageResource(R.mipmap.next_offical);
           }
            SharedPreferences sharedPreferences3 = context.getSharedPreferences("LuyenTapMot", MODE_PRIVATE);
            String tex3 = sharedPreferences3.getString(TEXT, "");
            text3.setText(tex3);
            if( text3.getText().toString().length() > 0 ) {
                card3.setCardBackgroundColor(0xFFEDEDED);
                card3.setCardElevation(0);
                image3.setImageResource(R.mipmap.tick_xanhs1);
            }else{
                card3.setCardBackgroundColor(Color.WHITE);
                card3.setCardElevation(8);
                image3.setImageResource(R.mipmap.next_offical);
            }
            SharedPreferences sharedPreferences4 = context.getSharedPreferences("HienTaiHT", MODE_PRIVATE);
            String tex4 = sharedPreferences4.getString(TEXT, "");
            text4.setText(tex4);
            if( text4.getText().toString().length() > 0 ) {
                card4.setCardBackgroundColor(0xFFEDEDED);
                card4.setCardElevation(0);
                image4.setImageResource(R.mipmap.tick_xanhs1);
            }else{
                card4.setCardBackgroundColor(Color.WHITE);
                card4.setCardElevation(8);
                image4.setImageResource(R.mipmap.next_offical);
            }
            SharedPreferences sharedPreferences5 = context.getSharedPreferences("HienTaiHTTD", MODE_PRIVATE);
            String tex5 = sharedPreferences5.getString(TEXT, "");
            text5.setText(tex5);
            if( text5.getText().toString().length() > 0 ) {
                card5.setCardBackgroundColor(0xFFEDEDED);
                card5.setCardElevation(0);
                image5.setImageResource(R.mipmap.tick_xanhs1);
            }else{
                card5.setCardBackgroundColor(Color.WHITE);
                card5.setCardElevation(8);
                image5.setImageResource(R.mipmap.next_offical);
            }
            SharedPreferences sharedPreferences6 = context.getSharedPreferences("LuyenTapHai", MODE_PRIVATE);
            String tex6 = sharedPreferences6.getString(TEXT, "");
            text6.setText(tex6);
            if( text6.getText().toString().length() > 0 ) {
                card6.setCardBackgroundColor(0xFFEDEDED);
                card6.setCardElevation(0);
                image6.setImageResource(R.mipmap.tick_xanhs1);
            }else{
                card6.setCardBackgroundColor(Color.WHITE);
                card6.setCardElevation(8);
                image6.setImageResource(R.mipmap.next_offical);
            }
            SharedPreferences sharedPreferences7 = context.getSharedPreferences("LuyenTapBa", MODE_PRIVATE);
            String tex7 = sharedPreferences7.getString(TEXT, "");
            text7.setText(tex7);
            if( text7.getText().toString().length() > 0 ) {
                card7.setCardBackgroundColor(0xFFEDEDED);
                card7.setCardElevation(0);
                image7.setImageResource(R.mipmap.tick_xanhs1);
            }else{
                card7.setCardBackgroundColor(Color.WHITE);
                card7.setCardElevation(8);
                image7.setImageResource(R.mipmap.next_offical);
            }
            SharedPreferences sharedPreferences8 = context.getSharedPreferences("QuaKhuD", MODE_PRIVATE);
            String tex8 = sharedPreferences8.getString(TEXT, "");
            text8.setText(tex8);
            if( text8.getText().toString().length() > 0 ) {
                card8.setCardBackgroundColor(0xFFEDEDED);
                card8.setCardElevation(0);
                image8.setImageResource(R.mipmap.tick_xanhs1);
            }else{
                card8.setCardBackgroundColor(Color.WHITE);
                card8.setCardElevation(8);
                image8.setImageResource(R.mipmap.next_offical);
            }
            SharedPreferences sharedPreferences9 = context.getSharedPreferences("QuaKhuTD", MODE_PRIVATE);
            String tex9 = sharedPreferences9.getString(TEXT, "");
            text9.setText(tex9);
            if( text9.getText().toString().length() > 0 ) {
                card9.setCardBackgroundColor(0xFFEDEDED);
                card9.setCardElevation(0);
                image9.setImageResource(R.mipmap.tick_xanhs1);
            }else{
                card9.setCardBackgroundColor(Color.WHITE);
                card9.setCardElevation(8);
                image9.setImageResource(R.mipmap.next_offical);
            }
            SharedPreferences sharedPreferences10 = context.getSharedPreferences("LuyenTapBon", MODE_PRIVATE);
            String tex10 = sharedPreferences10.getString(TEXT, "");
            text10.setText(tex10);
            if( text10.getText().toString().length() > 0 ) {
                card10.setCardBackgroundColor(0xFFEDEDED);
                card10.setCardElevation(0);
                image10.setImageResource(R.mipmap.tick_xanhs1);
            }else{
                card10.setCardBackgroundColor(Color.WHITE);
                card10.setCardElevation(8);
                image10.setImageResource(R.mipmap.next_offical);
            }
            SharedPreferences sharedPreferences11 = context.getSharedPreferences("QuaKhuHT", MODE_PRIVATE);
            String tex11 = sharedPreferences11.getString(TEXT, "");
            text11.setText(tex11);
            if( text11.getText().toString().length() > 0 ) {
                card11.setCardBackgroundColor(0xFFEDEDED);
                card11.setCardElevation(0);
                image11.setImageResource(R.mipmap.tick_xanhs1);
            }else{
                card11.setCardBackgroundColor(Color.WHITE);
                card11.setCardElevation(8);
                image11.setImageResource(R.mipmap.next_offical);
            }
            SharedPreferences sharedPreferences12 = context.getSharedPreferences("QuaKhuHTTD", MODE_PRIVATE);
            String tex12 = sharedPreferences12.getString(TEXT, "");
            text12.setText(tex12);
            if( text12.getText().toString().length() > 0 ) {
                card12.setCardBackgroundColor(0xFFEDEDED);
                card12.setCardElevation(0);
                image12.setImageResource(R.mipmap.tick_xanhs1);
            }else{
                card12.setCardBackgroundColor(Color.WHITE);
                card12.setCardElevation(8);
                image12.setImageResource(R.mipmap.next_offical);
            }
            SharedPreferences sharedPreferences13 = context.getSharedPreferences("LuyenTapNam", MODE_PRIVATE);
            String tex13 = sharedPreferences13.getString(TEXT, "");
            text13.setText(tex13);
            if( text13.getText().toString().length() > 0 ) {
                card13.setCardBackgroundColor(0xFFEDEDED);
                card13.setCardElevation(0);
                image13.setImageResource(R.mipmap.tick_xanhs1);
            }else{
                card13.setCardBackgroundColor(Color.WHITE);
                card13.setCardElevation(8);
                image13.setImageResource(R.mipmap.next_offical);
            }
            SharedPreferences sharedPreferences14 = context.getSharedPreferences("LuyenTapSau", MODE_PRIVATE);
            String tex14 = sharedPreferences14.getString(TEXT, "");
            text14.setText(tex14);
            if( text14.getText().toString().length() > 0 ) {
                card14.setCardBackgroundColor(0xFFEDEDED);
                card14.setCardElevation(0);
                image14.setImageResource(R.mipmap.tick_xanhs1);
            }else{
                card14.setCardBackgroundColor(Color.WHITE);
                card14.setCardElevation(8);
                image14.setImageResource(R.mipmap.next_offical);
            }
            SharedPreferences sharedPreferences15 = context.getSharedPreferences("TuongLaiD", MODE_PRIVATE);
            String tex15 = sharedPreferences15.getString(TEXT, "");
            text15.setText(tex15);
            if( text15.getText().toString().length() > 0 ) {
                card15.setCardBackgroundColor(0xFFEDEDED);
                card15.setCardElevation(0);
                image15.setImageResource(R.mipmap.tick_xanhs1);
            }else{
                card15.setCardBackgroundColor(Color.WHITE);
                card15.setCardElevation(8);
                image15.setImageResource(R.mipmap.next_offical);
            }
            SharedPreferences sharedPreferences16 = context.getSharedPreferences("TuongLaiTD", MODE_PRIVATE);
            String tex16 = sharedPreferences16.getString(TEXT, "");
            text16.setText(tex16);
            if( text16.getText().toString().length() > 0 ) {
                card16.setCardBackgroundColor(0xFFEDEDED);
                card16.setCardElevation(0);
                image16.setImageResource(R.mipmap.tick_xanhs1);
            }else{
                card16.setCardBackgroundColor(Color.WHITE);
                card16.setCardElevation(8);
                image16.setImageResource(R.mipmap.next_offical);
            }
            SharedPreferences sharedPreferences17 = context.getSharedPreferences("LuyenTapBay", MODE_PRIVATE);
            String tex17 = sharedPreferences17.getString(TEXT, "");
            text17.setText(tex17);
            if( text17.getText().toString().length() > 0 ) {
                card17.setCardBackgroundColor(0xFFEDEDED);
                card17.setCardElevation(0);
                image17.setImageResource(R.mipmap.tick_xanhs1);
            }else{
                card17.setCardBackgroundColor(Color.WHITE);
                card17.setCardElevation(8);
                image17.setImageResource(R.mipmap.next_offical);
            }
            SharedPreferences sharedPreferences18 = context.getSharedPreferences("TuongLaiHT", MODE_PRIVATE);
            String tex18 = sharedPreferences18.getString(TEXT, "");
            text18.setText(tex18);
            if( text18.getText().toString().length() > 0 ) {
                card18.setCardBackgroundColor(0xFFEDEDED);
                card18.setCardElevation(0);
                image18.setImageResource(R.mipmap.tick_xanhs1);
            }else{
                card18.setCardBackgroundColor(Color.WHITE);
                card18.setCardElevation(8);
                image18.setImageResource(R.mipmap.next_offical);
            }
            SharedPreferences sharedPreferences19 = context.getSharedPreferences("TuongLaiHTTD", MODE_PRIVATE);
            String tex19 = sharedPreferences19.getString(TEXT, "");
            text19.setText(tex19);
            if( text19.getText().toString().length() > 0 ) {
                card19.setCardBackgroundColor(0xFFEDEDED);
                card19.setCardElevation(0);
                image19.setImageResource(R.mipmap.tick_xanhs1);
            }else{
                card19.setCardBackgroundColor(Color.WHITE);
                card19.setCardElevation(8);
                image19.setImageResource(R.mipmap.next_offical);
            }
            SharedPreferences sharedPreferences20 = context.getSharedPreferences("LuyenTapTam", MODE_PRIVATE);
            String tex20 = sharedPreferences20.getString(TEXT, "");
            text20.setText(tex20);
            if( text20.getText().toString().length() > 0 ) {
                card20.setCardBackgroundColor(0xFFEDEDED);
                card20.setCardElevation(0);
                image20.setImageResource(R.mipmap.tick_xanhs1);
            }else{
                card20.setCardBackgroundColor(Color.WHITE);
                card20.setCardElevation(8);
                image20.setImageResource(R.mipmap.next_offical);
            }
            SharedPreferences sharedPreferences21 = context.getSharedPreferences("LuyenTapChin", MODE_PRIVATE);
            String tex21 = sharedPreferences21.getString(TEXT, "");
            text21.setText(tex21);
            if( text21.getText().toString().length() > 0 ) {
                card21.setCardBackgroundColor(0xFFEDEDED);
                card21.setCardElevation(0);
                image21.setImageResource(R.mipmap.tick_xanhs1);
            }else{
                card21.setCardBackgroundColor(Color.WHITE);
                card21.setCardElevation(8);
                image21.setImageResource(R.mipmap.next_offical);
            }
            SharedPreferences sharedPreferences22 = context.getSharedPreferences("LuyenTapMuoi", MODE_PRIVATE);
            String tex22 = sharedPreferences22.getString(TEXT, "");
            text22.setText(tex22);
            if( text22.getText().toString().length() > 0 ) {
                card22.setCardBackgroundColor(0xFFEDEDED);
                card22.setCardElevation(0);
                image22.setImageResource(R.mipmap.tick_xanhs1);
            }else{
                card22.setCardBackgroundColor(Color.WHITE);
                card22.setCardElevation(8);
                image22.setImageResource(R.mipmap.next_offical);
            }
        }
    }
}
