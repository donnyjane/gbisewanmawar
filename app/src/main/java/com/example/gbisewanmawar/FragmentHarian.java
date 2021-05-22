package com.example.gbisewanmawar;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListView;

import com.example.gbisewanmawar.ui.renungan.RenunganFragment;

/**
 * A simple {@link Fragment} subclass.

 */
public class FragmentHarian extends Fragment {



    public FragmentHarian() {
        // Required empty public constructor
    }

    private String[] hari = {"Senin", "Selasa", "Rabu", "Kamis", "Jumat", "Sabtu"};
    private Integer[] gambar = {R.drawable.ic_menu_gallery, R.drawable.ic_menu_gallery, R.drawable.ic_menu_gallery, R.drawable.ic_menu_gallery, R.drawable.ic_menu_gallery, R.drawable.ic_menu_gallery};
    private ListView lvhari;



    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_harian, null);

        lvhari = (ListView) view.findViewById(R.id.lvhari);

        CustomAdapter customAdapter = new CustomAdapter(getActivity(), hari, gambar);
        lvhari.setAdapter(customAdapter);

        return view;
    }
}