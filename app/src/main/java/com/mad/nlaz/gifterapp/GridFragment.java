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

        for (int i = 0; i < 20; ++i)
            titles.add("puppy" + i);

        adapter = new ImageAdapter(getActivity(), getActivity().getLayoutInflater(), titles);

        gridView = (GridView) rootView.findViewById(R.id.gridview);

        gridView.setAdapter(adapter);


        return rootView;
    }


}
