package com.example.koala.romeunknown;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;


public class FoodFragment extends Fragment {

    public FoodFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.word_list_food_drink, container, false);


        // Create a list_item of places
        final ArrayList<Places> food = new ArrayList<Places>();

        food.add(new Places(
                R.string.food_shopName_orfeo,
                R.string.food_description_Sandwich,
                R.string.food_timetable_orfeo,
                R.string.food_address_tiburtina_140,
                R.drawable.orfeo
        ));

        food.add(new Places(
                R.string.food_shopName_casa,
                R.string.food_description_street_food_suppli,
                R.string.food_timetable_casa,
                R.string.food_address_re_di_roma,
                R.drawable.suppli
        ));

        food.add(new Places(
                R.string.food_shopName_said,
                R.string.food_description_chocolate,
                R.string.food_timetable,
                R.string.food_address_tiburtina,
                R.drawable.said
        ));

        food.add(new Places(
                R.string.food_shopName_fracescana,
                R.string.food_description_restaurant,
                R.string.food_timetable_francescana,
                R.string.food_address_gp_palestrina,
                R.drawable.francescana
        ));

        food.add(new Places(
                R.string.food_shopName_max,
                R.string.food_description_bakery,
                R.string.food_timetable_max,
                R.string.food_address_papirio,
                R.drawable.max
        ));

        // Create an {@link PlacesAdapter}, whose data source is a list_item of {@link Places}s. The
        // adapter knows how to create list_item items for each item in the list_item.
        PlacesAdapterFoodDrink adapter = new PlacesAdapterFoodDrink(getActivity(), food);

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
