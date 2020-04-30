package com.doane.charactersheetfragment;

import android.content.Intent;
import android.graphics.Paint;
import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.ListFragment;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

/**
 * A simple {@link Fragment} subclass.
 */
public class ClassesFragment extends Fragment {

    public ClassesFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        RecyclerView classesRecylcer = (RecyclerView) inflater.inflate(
                R.layout.fragment_character_class, container, false);

        String[] classNames = new String[CharacterClass.classes.length];
        for (int i = 0; i < classNames.length; i++) {
            classNames[i] = CharacterClass.classes[i].getName();
        }

        int[] classImages = new int[CharacterClass.classes.length];
        for (int i = 0; i < classImages.length; i++) {
            classImages[i] = CharacterClass.classes[i].getImageResourceId();
        }

        CaptionedImagesAdapter adapter = new CaptionedImagesAdapter(classNames, classImages);
        classesRecylcer.setAdapter(adapter);

        GridLayoutManager layoutManager = new GridLayoutManager(getActivity(), 2);
        classesRecylcer.setLayoutManager(layoutManager);

        adapter.setListener(new CaptionedImagesAdapter.Listener() {
            @Override
            public void onClick(int position) {
                Intent intent = new Intent(getActivity(), ClassDetailActivity.class);
                intent.putExtra(ClassDetailActivity.EXTRA_CLASS_ID, position);
                getActivity().startActivity(intent);
            }
        });

        return classesRecylcer;
    }
}
