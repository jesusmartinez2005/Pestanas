package com.example.jesusmartinez.pestanas;

import android.content.res.Resources;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TabHost;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Resources res = getResources();

        TabHost tabs=(TabHost)findViewById(android.R.id.tabhost);
        tabs.setup();

        TabHost.TabSpec spec=tabs.newTabSpec("mitab1");
        spec.setContent(R.id.tab1);
        spec.setIndicator("", res.getDrawable(android.R.drawable.ic_btn_speak_now));
        tabs.addTab(spec);

        spec=tabs.newTabSpec("mitab2");
        spec.setContent(R.id.tab2);
        spec.setIndicator("", res.getDrawable(android.R.drawable.ic_menu_compass));
        tabs.addTab(spec);

        spec=tabs.newTabSpec("la de la card");
        spec.setContent(R.id.tab3);
        spec.setIndicator("",res.getDrawable(android.R.drawable.ic_menu_camera));
        tabs.addTab(spec);

        tabs.setCurrentTab(2);
    }
}
