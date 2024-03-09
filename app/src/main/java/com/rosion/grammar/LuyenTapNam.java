package com.rosion.grammar;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.View;
import android.widget.FrameLayout;

import com.google.android.gms.ads.AdListener;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdSize;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.InterstitialAd;
import com.google.android.gms.ads.LoadAdError;
import com.google.android.gms.ads.MobileAds;
import com.google.android.gms.ads.initialization.InitializationStatus;
import com.google.android.gms.ads.initialization.OnInitializationCompleteListener;
import com.rosion.grammar.adapter.LTapName;

public class LuyenTapNam extends AppCompatActivity  {
    RecyclerView recyclerView3;
    private final static String TAG = "Banner";
    private FrameLayout adContainerView;
    private AdView adView;
    private InterstitialAd mInterstitialAd;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_luyen_tap_mot);
        recyclerView3 = findViewById(R.id.recyclerView3);
        recyclerView3.setHasFixedSize(true);
        recyclerView3.setLayoutManager(new LinearLayoutManager(this));

        MyData[] myData = new MyData[]{
                new MyData("LUYỆN TẬP QKHT + QKHTTD")
        };

        LTapName myAdapter= new LTapName(myData , LuyenTapNam.this);
        recyclerView3.setAdapter(myAdapter);
        //Toast.makeText(getApplicationContext(),id,Toast.LENGTH_LONG).show();
        //loadInvoice(id);
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
}