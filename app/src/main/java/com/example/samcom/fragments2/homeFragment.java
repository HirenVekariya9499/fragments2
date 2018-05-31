package com.example.samcom.fragments2;


import android.annotation.SuppressLint;
import android.app.FragmentTransaction;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;


/**
 * A simple {@link Fragment} subclass.
 */
public class homeFragment extends Fragment {


    public homeFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             final Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v = inflater.inflate(R.layout.fragment_home, container, false);
        Button btn1=(Button)v.findViewById(R.id.india);
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                    innerFragment second=new innerFragment();
                    Bundle bundle=new Bundle();
                    bundle.putString("name","India" );
                    second.setArguments(bundle);
                    FragmentManager manager=getFragmentManager();
                    manager.beginTransaction().replace(R.id.hn,second).addToBackStack( null ).commit();

                }


        });

        Button btn2=(Button)v.findViewById(R.id.USA);
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                innerFragment second=new innerFragment();
                Bundle bundle=new Bundle();
                bundle.putString("name","USA" );
                second.setArguments(bundle);
                FragmentManager manager=getFragmentManager();
                manager.beginTransaction().replace(R.id.hn,second).addToBackStack( null ).commit();

            }


        });

        Button btn3=(Button)v.findViewById(R.id.Canada);
        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                innerFragment second=new innerFragment();
                Bundle bundle=new Bundle();
                bundle.putString("name","Canada" );
                second.setArguments(bundle);
                FragmentManager manager=getFragmentManager();
                manager.beginTransaction().replace(R.id.hn,second).addToBackStack( null ).commit();

            }


        });

        Button btn4=(Button)v.findViewById(R.id.Japan);
        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                innerFragment second=new innerFragment();
                Bundle bundle=new Bundle();
                bundle.putString("name","Japan" );
                second.setArguments(bundle);
                FragmentManager manager=getFragmentManager();
                manager.beginTransaction().replace(R.id.hn,second).addToBackStack( null ).commit();

            }


        });
        return v;

    }

}