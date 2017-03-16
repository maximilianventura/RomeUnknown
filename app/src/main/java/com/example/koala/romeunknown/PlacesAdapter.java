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
 * {@link PlacesAdapter} is an {@link ArrayAdapter} that can provide the layout for each list_item item
 * based on a data source, which is a list_item of {@link Places} objects.
 */
public class PlacesAdapter extends ArrayAdapter<Places>  {

    /**
     * Create a new {@link PlacesAdapter} object.
     *
     * @param context is the current context (i.e. Activity) that the adapter is being created in.
     * @param places is the list_item of {@link Places}s to be displayed.
     */
    public PlacesAdapter(Context context, ArrayList<Places> places) {
        super(context, 0, places);
    }


    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        // Check if an existing view is being reused, otherwise inflate the view
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_item, parent, false);
        }

        // Get the {@link Places} object located at this position in the list_item
        Places currentPlaces = getItem(position);

        // Find the TextView in the list_item.xml layout with the ID title_text_view.
        TextView titleTextView = (TextView) listItemView.findViewById(R.id.title_text_view);
        // Get the Title value from the currentPlaces
        titleTextView.setText(currentPlaces.getTitle());

        // Find the TextView in the list_item.xml layout with the ID artist_text_view.
        TextView artistTextView = (TextView) listItemView.findViewById(R.id.artist_text_view);
        // Get the Artist value from the currentPlaces
        artistTextView.setText(currentPlaces.getArtist());

        // Find the TextView in the list_item.xml layout with the ID location_text_view.
        TextView locationTextView = (TextView) listItemView.findViewById(R.id.location_text_view);
        // Get the Location value from the currentPlaces
        locationTextView.setText(currentPlaces.getLocation());


        // Find the ImageView in the list_item.xml layout with the ID image.
        ImageView imageView = (ImageView) listItemView.findViewById(R.id.image);
        // Check if an image is provided for this word or not
        if (currentPlaces.hasImage()) {
            // If an image is available, display the provided image based on the resource ID
            imageView.setImageResource(currentPlaces.getImageResourceId());
            // Make sure the view is visible
            imageView.setVisibility(View.VISIBLE);
        } else {
            // Otherwise hide the ImageView (set visibility to GONE)
            imageView.setVisibility(View.GONE);
        }

        // Return the whole list_item item layout so that it can be shown in
        // the ListView.
        return listItemView;
    }




}
