package com.example.koala.romeunknown;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * {@link PlacesAdapterFoodDrink} is an {@link ArrayAdapter} that can provide the layout for each list_item item
 * based on a data source, which is a list_item of {@link Places} objects.
 */
public class PlacesAdapterFoodDrink extends ArrayAdapter<Places>  {

    /**
     * Create a new {@link PlacesAdapterFoodDrink} object.
     *
     * @param context is the current context (i.e. Activity) that the adapter is being created in.
     * @param places is the list_item of {@link Places}s to be displayed.
     */
    public PlacesAdapterFoodDrink(Context context, ArrayList<Places> places) {
        super(context, 0, places);
    }


    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        // Check if an existing view is being reused, otherwise inflate the view
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_item_food_drink, parent, false);
        }

        // Get the {@link Places} object located at this position in the list_item_food_drink
        Places currentPlaces = getItem(position);

        // Find the TextView in the list_item_food_drink.xml layout with the ID default_text_view.
        TextView shopNameTextView = (TextView) listItemView.findViewById(R.id.shopName_text_view);
        // Get the shopName value from the currentPlaces
        shopNameTextView.setText(currentPlaces.getShopName());

        // Find the TextView in the list_item_food_drink.xml layout with the ID default_text_view.
        TextView descriptionTextView = (TextView) listItemView.findViewById(R.id.description_text_view);
        // Get the description value from the currentPlaces
        descriptionTextView.setText(currentPlaces.getDescription());

        // Find the TextView in the list_item_food_drink.xml layout with the ID default_text_view.
        TextView timetableTextView = (TextView) listItemView.findViewById(R.id.timetable_text_view);
        // Get the timetable value from the currentPlaces
        timetableTextView.setText(currentPlaces.getTimetable());

        // Find the TextView in the list_item_food_drink.xml layout with the ID default_text_view.
        TextView addressTextView = (TextView) listItemView.findViewById(R.id.address_text_view);
        // Get the Address value from the currentPlaces
        addressTextView.setText(currentPlaces.getAddress());

        // Find the ImageView in the list_item_food_drink.xml layout with the ID image.
        ImageView imageView = (ImageView) listItemView.findViewById(R.id.image_food_drink);
        // Check if an image is provided or not
        if (currentPlaces.hasImage()) {
            // If an image is available, display the provided image based on the resource ID
            imageView.setImageResource(currentPlaces.getImageResourceId());
            // Make sure the view is visible
            imageView.setVisibility(View.VISIBLE);
        } else {
            // Otherwise hide the ImageView (set visibility to GONE)
            imageView.setVisibility(View.GONE);
        }

        // Return the whole list_item_food_drink item layout so that it can be shown in
        // the ListView.
        return listItemView;
    }
}
