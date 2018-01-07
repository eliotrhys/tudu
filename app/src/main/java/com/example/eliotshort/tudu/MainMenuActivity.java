package com.example.eliotshort.tudu;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ListView;

import java.util.ArrayList;

public class MainMenuActivity extends AppCompatActivity {

    Button createNewTuduButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_menu);

        createNewTuduButton = findViewById(R.id.createNewTuduButton);

        InstructionList instructionList = new InstructionList();
        ArrayList<InstructionSet> list = instructionList.getInstructionList();

        InstructionListAdapter instructionListAdapter = new InstructionListAdapter(this, list);

        ListView listView = (ListView) findViewById(R.id.mainMenuList);
        listView.setAdapter(instructionListAdapter);

    }

    public void onCreateListButtonClick(View view){
        Intent intent = new Intent(this, NameTheListActivity.class);
        startActivity(intent);
    }





}
