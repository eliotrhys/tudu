package com.example.eliotshort.tudu.Activities;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import com.example.eliotshort.tudu.TuduObjects.CompleteInstructionList;
import com.example.eliotshort.tudu.TuduObjects.InstructionSet;
import com.example.eliotshort.tudu.R;

import java.util.ArrayList;

public class NameTheListActivity extends AppCompatActivity {

    EditText tuduNamer;
    InstructionSet instructionSet;
    CompleteInstructionList instructionList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_name_the_list);

        instructionSet = new InstructionSet("Placeholder", new ArrayList());

        Intent intent = this.getIntent();
        Bundle bundle = intent.getExtras();

        CompleteInstructionList instructionList = (CompleteInstructionList) bundle.getSerializable("value");

        tuduNamer = findViewById(R.id.stepEntry);

    }

    public void onNameButtonClick(View view){
        String result = tuduNamer.getText().toString();
        instructionSet.setInstructionSetName(result);
        Intent intent = new Intent(this, StepEntryActivity.class);
        Bundle bundle = new Bundle();
        intent.putExtra("serialize_data", instructionSet);
        bundle.putSerializable("value", instructionList);
        intent.putExtras(bundle);
        startActivity(intent);
    }
}
