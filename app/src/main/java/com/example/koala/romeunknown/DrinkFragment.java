package com.example.koala.romeunknown;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;

public class DrinkFragment extends Fragment {


    public DrinkFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.word_list_food_drink, container, false);

        // Create a list_item of places
        final ArrayList<Places> drink = new ArrayList<Places>();


        drink.add(new Places(
                R.string.drink_shopName_baladin,
                R.string.drink_description_pub,
                R.string.drink_timetable_baladin,
                R.string.drink_address_specchi,
                R.drawable.baladin
        ));

        drink.add(new Places(
                R.string.drink_shopName_giansanti,
                R.string.drink_description_winebar,
                R.string.drink_timetable_giansanti,
                R.string.drink_address_ostiense,
                R.drawable.giansanti
        ));

        drink.add(new Places(
                R.string.drink_shopName_hopificio,
                R.string.drink_description_pub_hopificio,
                R.string.drink_timetable_hopificio,
                R.string.drink_address_cesare_baronio,
                R.drawable.hopificio
        ));

        drink.add(new Places(
                R.string.drink_shopName_hopside,
                R.string.drink_description_pub_hopside,
                R.string.drink_timetable_hopside,
                R.string.drink_address_francesco_negri,
                R.drawable.hopside
        ));

        drink.add(new Places(
                R.string.drink_shopName_peroni,
                R.string.drink_description_pub_peroni,
                R.string.drink_timetable_peroni,
                R.string.drink_address_marcello,
                R.drawable.peroni
        ));


        // Create an {@link PlacesAdapterFoodDrink}, whose data source is a list_item of {@link Places}s. The
        // adapter knows how to create list_item items for each item in the list_item.
        PlacesAdapterFoodDrink adapter = new PlacesAdapterFoodDrink(getActivity(), drink);

        // Find the {@link ListView} object in the view hierarchy of the {@link Activity}.
        // There should be a {@link ListView} with the view ID called list_item, which is declared in the
        // word_list_food_drink.xml layout file.
        ListView listView = (ListView) rootView.findViewById(R.id.list_food_drink);

        // Make the {@link ListView} use the {@link PlacesAdapter} we created above, so that the
        // {@link ListView} will display list_item items for each {@link Places} in the list_item.
        listView.setAdapter(adapter);

        return rootView;
    }
}