package com.hritvik.miwok;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.core.content.ContextCompat;

import java.util.ArrayList;


public class WordAdapter extends ArrayAdapter<Word> {

    // resource id for the background color for this list of words
    private  int mColorResourceId;


    public WordAdapter(@NonNull Context context, @NonNull ArrayList<Word> objects, int colorResourceId) {
        super(context, 0, objects);
        mColorResourceId = colorResourceId;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
       Word currentWord = getItem(position);

       View listItemView = convertView;
       if (listItemView == null){
           listItemView = LayoutInflater.from(getContext()).inflate(R.layout.list_item,parent,false);

       }

        TextView mainText = listItemView.findViewById(R.id.mainText);
        mainText.setText(currentWord.getDefaultTranslation());

        TextView secondaryText = listItemView.findViewById(R.id.secondaryText);
        secondaryText.setText(currentWord.getMiwokTranslation());

        ImageView iconView = listItemView.findViewById(R.id.image);

        if (currentWord.hasImage()) {
            iconView.setImageResource(currentWord.getImageResourceId());
        }
        else {
            iconView.setVisibility(View.GONE);
        }


        View textContainer = listItemView.findViewById(R.id.text_container);
        int color = ContextCompat.getColor(getContext(), mColorResourceId);
        textContainer.setBackgroundColor(color);


        return listItemView;
    }
}
