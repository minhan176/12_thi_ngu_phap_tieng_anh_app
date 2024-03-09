package com.rosion.grammar;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.TextView;

import com.google.android.gms.ads.AdListener;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdSize;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.LoadAdError;
import com.google.android.gms.ads.MobileAds;
import com.google.android.gms.ads.initialization.InitializationStatus;
import com.google.android.gms.ads.initialization.OnInitializationCompleteListener;
import com.rosion.grammar.adapter.AdapterHome;

import static com.rosion.grammar.adapter.HapHienTaiD.ViewHolder.SHARED_PREFS;
import static com.rosion.grammar.adapter.HapHienTaiD.ViewHolder.TEXT;

public class HomeActivity extends AppCompatActivity  {
    private final static String TAG = "Banner";
    private FrameLayout adContainerView;
    private AdView adView;
    RecyclerView recyclerView;
    TextView te11, te1, te33,te3,te22, te44, te55,te2,te4, te5;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        //getSupportActionBar().setDisplayOptions(ActionBar.DISPLAY_SHOW_CUSTOM);
        //getSupportActionBar().setCustomView(R.layout.layout_actionbar);

        te11 = findViewById(R.id.te11);
        te1 = findViewById(R.id.te1);
        te33 = findViewById(R.id.te33);
        te3 = findViewById(R.id.te3);
        te22 = findViewById(R.id.te22);
        te44 = findViewById(R.id.te44);
        te55 = findViewById(R.id.te55);
        te2 = findViewById(R.id.te2);
        te4 = findViewById(R.id.te4);
        te5 = findViewById(R.id.te5);
        recyclerView = findViewById(R.id.recyclerView);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        MyData[] meData = new MyData[]{
                new MyData("  Hiện tại đơn")
        };
        AdapterHome adapterHome = new AdapterHome(meData,HomeActivity.this);
        recyclerView.setAdapter(adapterHome);
        SharedPreferences sharedPreferences = getSharedPreferences(SHARED_PREFS, MODE_PRIVATE);
        String text = sharedPreferences.getString(TEXT, "");
        te11.setText(text);
        SharedPreferences sharedPreferences2 = getSharedPreferences("HienTaiTD", MODE_PRIVATE);
        String text22 = sharedPreferences2.getString(TEXT, "");
        te22.setText(text22);
        SharedPreferences sharedPreferences3 = getSharedPreferences("LuyenTapMot", MODE_PRIVATE);
        String text33 = sharedPreferences3.getString(TEXT, "");
        te33.setText(text33);
        SharedPreferences sharedPreferences4 = getSharedPreferences("HienTaiHT", MODE_PRIVATE);
        String text44 = sharedPreferences4.getString(TEXT, "");
        te44.setText(text44);
        SharedPreferences sharedPreferences5 = getSharedPreferences("HienTaiHTTD", MODE_PRIVATE);
        String text55 = sharedPreferences5.getString(TEXT, "");
        te55.setText(text55);
        adContainerView = findViewById(R.id.id_FrameLayout);
        adContainerView.setVisibility(View.GONE);
        adView = new AdView(this);
        adView.setAdUnitId(getString(R.string.adaptive_banner_ad_unit_id));
        adView.setAdSize(adSize());
        adContainerView.addView(adView);

        adView.setAdListener(new AdListener() {
            @Override
            public void onAdFailedToLoad(LoadAdError loadAdError) {
                adContainerView.setVisibility(View.GONE);
            }

            @Override
            public void onAdLoaded() {
                adContainerView.setVisibility(View.VISIBLE);
            }
        });

        MobileAds.initialize(this, new OnInitializationCompleteListener() {
            @Override
            public void onInitializationComplete(InitializationStatus initializationStatus) {
                loadBanner();
            }
        });
    }

    //Toast.makeText(getApplicationContext(),id,Toast.LENGTH_LONG).show();
    //loadInvoice(id);

    private void loadBanner() {
        AdRequest adRequest = new AdRequest.Builder().build();
        adView.loadAd(adRequest);
    }

    private AdSize adSize() {
        float widthPixels = getResources().getDisplayMetrics().widthPixels;
        float density = getResources().getDisplayMetrics().density;
        int adWidth = (int) (widthPixels / density);
        return AdSize.getCurrentOrientationAnchoredAdaptiveBannerAdSize(this, adWidth);
    }

    @Override
    protected void onResume()  {
        super.onResume();
        SharedPreferences sharedPreferences = getSharedPreferences(SHARED_PREFS, MODE_PRIVATE);
        String text11 = sharedPreferences.getString(TEXT, "");
        te1.setText(text11);
        if( te11.getText().toString().length() != te1.getText().toString().length()){
            MyData[] myData = new MyData[]{
                    new MyData("  Hiện tại đơn")
            };
            AdapterHome adapterHome = new AdapterHome(myData,HomeActivity.this);
            recyclerView.setAdapter(adapterHome);
            te11.setText(text11);
        }


        SharedPreferences sharedPreferences2 = getSharedPreferences("HienTaiTD", MODE_PRIVATE);
        String text22 = sharedPreferences2.getString(TEXT, "");
        te2.setText(text22);
        if( te22.getText().toString().length() != te2.getText().toString().length()){
            MyData[] myData = new MyData[]{
                    new MyData("  Hiện tại đơn")
            };
            AdapterHome adapterHome = new AdapterHome(myData,HomeActivity.this);
            recyclerView.setAdapter(adapterHome);
            te22.setText(text22);
        }
        SharedPreferences sharedPreferences3 = getSharedPreferences("LuyenTapMot", MODE_PRIVATE);
        String text33 = sharedPreferences3.getString(TEXT, "");
        te3.setText(text33);
        if( te33.getText().toString().length() != te3.getText().toString().length()){
            MyData[] myData = new MyData[]{
                    new MyData("  Hiện tại đơn")
            };
            AdapterHome adapterHome = new AdapterHome(myData,HomeActivity.this);
            recyclerView.setAdapter(adapterHome);
            te33.setText(text33);
        }
        SharedPreferences sharedPreferences4 = getSharedPreferences("HienTaiHT", MODE_PRIVATE);
        String text44 = sharedPreferences4.getString(TEXT, "");
        te4.setText(text44);
        if( te44.getText().toString().length() != te4.getText().toString().length()){
            MyData[] myData = new MyData[]{
                    new MyData("  Hiện tại đơn")
            };
            AdapterHome adapterHome = new AdapterHome(myData,HomeActivity.this);
            recyclerView.setAdapter(adapterHome);
            te44.setText(text44);
        }
        SharedPreferences sharedPreferences5 = getSharedPreferences("HienTaiHTTD", MODE_PRIVATE);
        String text55 = sharedPreferences5.getString(TEXT, "");
        te5.setText(text55);
        if( te55.getText().toString().length() != te5.getText().toString().length()){
            MyData[] myData = new MyData[]{
                    new MyData("  Hiện tại đơn")
            };
            AdapterHome adapterHome = new AdapterHome(myData,HomeActivity.this);
            recyclerView.setAdapter(adapterHome);
            te55.setText(text55);
        }
    }
}
