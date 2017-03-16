package com.example.koala.romeunknown;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;

public class StreetArtFragment extends Fragment {


    public StreetArtFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.word_list, container, false);


        // Create a list_item of places
        final ArrayList<Places> streetArt = new ArrayList<Places>();

        streetArt.add(new Places(
                R.string.street_art_title_untitled,
                R.string.street_art_artist_blu,
                R.string.street_art_location_via_porto_fluviale,
                R.drawable.blu
        ));

        streetArt.add(new Places(
                R.string.street_art_title_wall,
                R.string.street_art_artist_jb,
                R.string.street_art_location_via_magazzini_generali,
                R.drawable.wall_of_fame
        ));

        streetArt.add(new Places(
                R.string.street_art_title_fish,
                R.string.street_art_artist_iacurci,
                R.string.street_art_location_via_del_porto_fluviale_65,
                R.drawable.iacurci
        ));

        streetArt.add(new Places(
                R.string.street_art_title_jumping,
                R.string.street_art_artist_roa,
                R.string.street_art_location_via_alessandro_volta,
                R.drawable.roa
        ));

        streetArt.add(new Places(
                R.string.street_art_title_its_a_new_day,
                R.string.street_art_artist_alice,
                R.string.street_art_location_via_ludovico_antinori,
                R.drawable.its
        ));

        // Create an {@link PlacesAdapter}, whose data source is a list_item of {@link Places}s. The
        // adapter knows how to create list_item items for each item in the list_item.
        PlacesAdapter adapter = new PlacesAdapter(getActivity(), streetArt);

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
