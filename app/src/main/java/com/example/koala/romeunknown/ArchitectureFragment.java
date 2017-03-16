package com.example.koala.romeunknown;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;

public class ArchitectureFragment extends Fragment {

    public ArchitectureFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.word_list, container, false);

        // Create a list_item of places
        final ArrayList<Places> architecure = new ArrayList<Places>();

        architecure.add(new Places(
                R.string.architecture_title_palazzo_zuccari,
                R.string.architecture_artist_zuccari,
                R.string.architecture_location_gregoriana,
                R.drawable.zuccari
        ));

        architecure.add(new Places(
                R.string.architecture_title_quartiere,
                R.string.architecture_artist_coppede,
                R.string.architecture_location_buenos_aires,
                R.drawable.coppede
        ));

        architecure.add(new Places(
                R.string.architecture_title_palazzo_sivo,
                R.string.architecture_artist_borromini,
                R.string.architecture_location_rinascimento,
                R.drawable.santivo
        ));

        architecure.add(new Places(
                R.string.architecture_title_palazzo_civilta,
                R.string.architecture_artist_glr,
                R.string.architecture_location_quadrato,
                R.drawable.palazzo_civilta
        ));

        architecure.add(new Places(
                R.string.architecture_title_casinacivette,
                R.string.architecture_artist_jappelli,
                R.string.architecture_location_nomentana,
                R.drawable.casinacivette
        ));




        // Create an {@link PlacesAdapter}, whose data source is a list_item of {@link Places}s. The
        // adapter knows how to create list_item items for each item in the list_item.
        PlacesAdapter adapter = new PlacesAdapter(getActivity(), architecure);

        // Find the {@link ListView} object in the view hierarchy of the {@link Activity}.
        // There should be a {@link ListView} with the view ID called list_item, which is declared in the
        // word_list.xml layout file.
        ListView listView = (ListView) rootView.findViewById(R.id.list);

        // Make the {@link ListView} use the {@link PlacesAdapter} we created above, so that the
        // {@link ListView} will display list_item items for each {@link Places} in the list_item.
        listView.setAdapter(adapter);

        return rootView;
    }
}