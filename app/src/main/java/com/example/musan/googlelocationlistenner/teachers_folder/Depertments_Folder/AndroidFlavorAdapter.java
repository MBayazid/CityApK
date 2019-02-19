package com.example.musan.googlelocationlistenner.teachers_folder.Depertments_Folder;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.musan.googlelocationlistenner.R;
import com.example.musan.googlelocationlistenner.teachers_folder.Custome_Fragment_Activity;

import java.util.ArrayList;

public class AndroidFlavorAdapter extends ArrayAdapter<Custome_Fragment_Activity.AndroidFlavor> {
    private static final String LOG_TAG = AndroidFlavorAdapter.class.getSimpleName();
    public AndroidFlavorAdapter(Activity context, ArrayList<Custome_Fragment_Activity.AndroidFlavor> androidFlavors) {
        super(context, 0, androidFlavors);
    }
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        // Check if the existing view is being reused, otherwise inflate the view
        View listItemView = convertView;
        if(listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(R.layout.list_layout_for_fragment, parent, false);
        }

        Custome_Fragment_Activity.AndroidFlavor currentAndroidFlavor = getItem(position);
        TextView nameTextView = (TextView) listItemView.findViewById(R.id.version_name);
        nameTextView.setText(currentAndroidFlavor.getVersionName());
        TextView numberTextView = (TextView) listItemView.findViewById(R.id.version_number);
        numberTextView.setText(currentAndroidFlavor.getVersionNumber());
        ImageView iconView = (ImageView) listItemView.findViewById(R.id.list_item_icon);
        iconView.setImageResource(currentAndroidFlavor.getImageResourceId());
        return listItemView;
    }


}

