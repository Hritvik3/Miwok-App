package com.hritvik.miwok;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.List;

public class WordAdapter extends ArrayAdapter<Word> {
    public WordAdapter(@NonNull Context context, @NonNull List<Word> objects) {
        super(context, 0, objects);
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




        return listItemView;
    }
}
