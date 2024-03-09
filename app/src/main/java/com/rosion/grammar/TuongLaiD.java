package com.rosion.grammar;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;

import com.google.android.gms.ads.AdListener;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdSize;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.InterstitialAd;
import com.google.android.gms.ads.LoadAdError;
import com.google.android.gms.ads.MobileAds;
import com.google.android.gms.ads.initialization.InitializationStatus;
import com.google.android.gms.ads.initialization.OnInitializationCompleteListener;
import com.rosion.grammar.adapter.HapTuongLaiD;

public class TuongLaiD extends AppCompatActivity  {
    RecyclerView recyclerHtdon;
    private final static String TAG = "Banner";
    private FrameLayout adContainerView;
    private AdView adView;
    private InterstitialAd mInterstitialAd;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_htd);

        //textView2 = findViewById(R.id.textView2);
        recyclerHtdon = findViewById(R.id.recyclerHtdon);
        recyclerHtdon.setHasFixedSize(true);
        recyclerHtdon.setLayoutManager(new LinearLayoutManager(this));

        MyData[] myData = new MyData[]{
                new MyData("TƯƠNG LAI ĐƠN")
        };

        HapTuongLaiD myAdapter= new HapTuongLaiD(myData , TuongLaiD.this);
        recyclerHtdon.setAdapter(myAdapter);

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
        //Toast.makeText(getApplicationContext(),id,Toast.LENGTH_LONG).show();
        //loadInvoice(id);

        MobileAds.initialize(this,
                getString(R.string.app_ad_unit_id));

        mInterstitialAd = new InterstitialAd(this);
        mInterstitialAd.setAdUnitId(getString(R.string.interstitial_ad_unit_id));
        mInterstitialAd.loadAd(new AdRequest.Builder().build());
        mInterstitialAd.setAdListener(new AdListener() {
            @Override
            public void onAdClosed() {
                // Load the next interstitial.
                mInterstitialAd.loadAd(new AdRequest.Builder().build());
            }
        });
    }
    @Override
    public void onBackPressed() {
        super.onBackPressed();
        if (mInterstitialAd.isLoaded()) {
            mInterstitialAd.show();
        }
    }
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
}