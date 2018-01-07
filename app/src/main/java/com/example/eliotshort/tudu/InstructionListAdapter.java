package com.example.eliotshort.tudu;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by eliotshort on 07/01/2018.
 */

public class InstructionListAdapter extends ArrayAdapter<InstructionSet> {

    public InstructionListAdapter(Context context, ArrayList<InstructionSet> instructionSets){
        super(context, 0, instructionSets);
    }

    @Override
    public View getView(int position, View listItemView, ViewGroup parent) {
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(R.layout.menu_item, parent, false);
        }

        InstructionSet currentInstructionSet = getItem(position);

        TextView mainRow = (TextView) listItemView.findViewById(R.id.mainRow);
        mainRow.setText(currentInstructionSet.getInstructionSetName());

        listItemView.setTag(currentInstructionSet);

        return listItemView;

    }

}
