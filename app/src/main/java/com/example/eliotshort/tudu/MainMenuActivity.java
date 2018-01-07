package com.example.eliotshort.tudu;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ListView;

import java.util.ArrayList;

public class MainMenuActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_menu);

        CompleteInstructionList instructionList = new CompleteInstructionList();
        ArrayList<InstructionSet> list = instructionList.getInstructionList();

        InstructionListAdapter instructionListAdapter = new InstructionListAdapter(this, list);

        ListView listView = (ListView) findViewById(R.id.mainMenuList);
        listView.setAdapter(instructionListAdapter);

    }

    public void getInstructionSet(View listItem){
        InstructionSet instructionSet = (InstructionSet) listItem.getTag();
        Intent intent = new Intent(this, instructionSet.getClass());
//        Intent.putExtra("instructionSet", instructionSet);
        startActivity(intent);
    }

    public void onCreateListButtonClick(View view){
        Intent intent = new Intent(this, NameTheListActivity.class);
        startActivity(intent);
    }





}
