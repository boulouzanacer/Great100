package com.xdevpro.great100.ui.fragments;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.xdevpro.great100.R;
import com.xdevpro.great100.ui.MainActivityPlayer;
import com.xdevpro.great100.ui.adapters.RecyclerViewAdapter_Arabic;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import mehdi.sakout.aboutpage.AboutPage;
import mehdi.sakout.aboutpage.Element;

/**
 * Created by UK2015 on 02/08/2016.
 */
public class AboutFragment extends Fragment{

    private Context mContext;

    public AboutFragment() {
        // Required empty public constructor
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        //View rootView = inflater.inflate(R.layout.fragment_arabic, container, false);

        Element versionElement = new Element();
        versionElement.setTitle("Version 1.0.1");

        return new AboutPage(getActivity())
                .isRTL(false)
                .setDescription("Great 100 app is a videos resume of great 100 book of the author : Djihad El Torbani," +
                        " available with many versions (Arabic, French, English, Spanich),\n\n you will find videos subtitled in each tab.\n\n I have collect all this videos from youtube and orgonaized it here. Source code available on my GitHu") // or Typeface
                .setImage(R.drawable.ic_baseline_android_24)
                .addItem(versionElement)
                //.addItem(adsElement)
                .addGroup("Connect with us")
                .addEmail("boulouza.nacer@gmail.com")
                .addWebsite("https://cvrest.com/cv/boulouza_nacer")
                .addFacebook("khalwi.v.khtini")
                .addTwitter("007263cb77354cc")
                .addYoutube("UCh8aMPE3mwyLJaTtROaltiQ")
                .addPlayStore("com.xdevpro.great100")
                .addGitHub("boulouzanacer")
                .addInstagram("boulouza_nasser")
                .create();
    }

}
