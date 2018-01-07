package com.example.eliotshort.tudu;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import java.util.ArrayList;

public class NameTheListActivity extends AppCompatActivity {

    EditText tuduNamer;
    InstructionSet instructionSet;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_name_the_list);

        instructionSet = new InstructionSet("Placeholder", new ArrayList());

        tuduNamer = findViewById(R.id.tuduNamer);

    }

    public void onNameButtonClick(View view){
        Intent intent = new Intent(this, StepEntryActivity.class);
        String result = tuduNamer.getText().toString();
        instructionSet.setInstructionSetName(result);
        startActivity(intent);
    }
}
