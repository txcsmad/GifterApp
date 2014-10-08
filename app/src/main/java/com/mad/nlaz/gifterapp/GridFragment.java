package com.mad.nlaz.gifterapp;


import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.GridView;

import java.util.ArrayList;


/**
 * A simple {@link Fragment} subclass.
 *
 */
public class GridFragment extends Fragment {


    GridView gridView;
    ArrayList<String> titles;
    ImageAdapter adapter;

    public GridFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_gridview, container, false);

        titles = new ArrayList<String>();

        titles.add("https://d13yacurqjgara.cloudfront.net/users/274842/screenshots/1752760/stacked.png");
        titles.add("https://d13yacurqjgara.cloudfront.net/users/274842/screenshots/1752461/untitled-1.png");
        titles.add("https://d13yacurqjgara.cloudfront.net/users/274842/screenshots/1749100/untitled-3.jpg");
        titles.add("https://d13yacurqjgara.cloudfront.net/users/274842/screenshots/1723169/jeangrey.png");
        titles.add("https://d13yacurqjgara.cloudfront.net/users/329021/screenshots/1750710/workshop_2_javascript_notext-01.png");
        titles.add("https://d13yacurqjgara.cloudfront.net/users/268640/screenshots/1748750/screen_shot_2014-10-01_at_7.40.49_pm.png");
        titles.add("https://d13yacurqjgara.cloudfront.net/users/39645/screenshots/1633764/beachhouse3-01.png");
        titles.add("https://d13yacurqjgara.cloudfront.net/users/232416/screenshots/1627824/bob_dr.png");
        titles.add("https://d13yacurqjgara.cloudfront.net/users/39645/screenshots/1612176/screen_shot_2014-06-23_at_2.25.54_pm.png");

//        for (int i = 0; i < 20; ++i)
//            titles.add("puppy" + i);

        adapter = new ImageAdapter(getActivity(), getActivity().getLayoutInflater(), titles);

        gridView = (GridView) rootView.findViewById(R.id.gridview);

        gridView.setAdapter(adapter);


        return rootView;
    }


}
