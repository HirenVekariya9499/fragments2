package com.example.samcom.fragments2;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;


/**
 * A simple {@link Fragment} subclass.
 */
public class innerFragment extends Fragment {


    public innerFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        Bundle bundle=getArguments();
        if (bundle != null){
            String name=bundle.getString( "name" );
               Toast.makeText(getContext(),"You Selected : " +name,Toast.LENGTH_LONG).show();
        }
        return inflater.inflate(R.layout.fragment_inner, container, false);
    }

}
