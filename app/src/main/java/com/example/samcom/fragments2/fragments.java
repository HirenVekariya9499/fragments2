package com.example.samcom.fragments2;

import android.os.Bundle;
import android.support.v4.app.FragmentManager;
import android.support.v7.app.AppCompatActivity;

public class fragments extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fragments);



        homeFragment first=new homeFragment();
        FragmentManager manager;

        {
            manager = getSupportFragmentManager();
            manager.beginTransaction()
                    .replace( R.id.hn,first,first.getTag() )
                    .commit();
        }
}


}
