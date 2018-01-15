package com.example.eliotshort.tudu.Activities;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.example.eliotshort.tudu.R;
import com.example.eliotshort.tudu.TuduObjects.InstructionSet;

public class StepEntryActivity extends AppCompatActivity {

    EditText stepEntry;
    Button addStepButton;
    Button finishListButton;
    InstructionSet instructionSet;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_step_entry);

        stepEntry = findViewById(R.id.tuduNamer);
        addStepButton = findViewById(R.id.addStepButton);
        finishListButton = findViewById(R.id.nameListButton);

        instructionSet = null;

        Intent intent = this.getIntent();
        Bundle bundle = intent.getExtras();

        assert bundle != null;
        InstructionSet instructionSet = (InstructionSet)bundle.getSerializable("value");

    }

    public void onClickAddStepButton(View view){
        String result = stepEntry.getText().toString();
        instructionSet.addInstructionToList(result);
        Intent intent = new Intent(this, StepEntryActivity.class);
        Bundle bundle = new Bundle();
        bundle.putSerializable("value", instructionSet);
        intent.putExtras(bundle);
        startActivity(intent);
    }

    public void onClickFinishListButton(View view){
        String result = stepEntry.getText().toString();
        instructionSet.addInstructionToList(result);
        Intent intent = new Intent(this, MainMenuActivity.class);
        Bundle bundle = new Bundle();
        bundle.putSerializable("value", instructionSet);
        intent.putExtras(bundle);
        startActivity(intent);
    }


}
