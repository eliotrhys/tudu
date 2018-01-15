package com.example.eliotshort.tudu.Activities;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.example.eliotshort.tudu.TuduObjects.InstructionSet;
import com.example.eliotshort.tudu.R;

import java.util.ArrayList;

public class NameTheListActivity extends AppCompatActivity {

    EditText tuduNamer;
    InstructionSet instructionSet;
    Button nameButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_name_the_list);

        nameButton = findViewById(R.id.nameListButton);
        tuduNamer = findViewById(R.id.tuduNamer);

        instructionSet = new InstructionSet("Placeholder", new ArrayList());
    }

    public void onNameButtonClick(View view){
        String result = tuduNamer.getText().toString();
        instructionSet.setInstructionSetName(result);
        Intent intent = new Intent(this, StepEntryActivity.class);
        intent.putExtra("MySet", instructionSet);
        startActivity(intent);
    }

}
