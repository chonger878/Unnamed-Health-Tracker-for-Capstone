package com.example.unnamedhealthtrackerforcapstone;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class DataEntryActivity extends AppCompatActivity implements View.OnClickListener{
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.data_entry_activity);
    }

    @Override
    public void onClick(View v) {
        switch(v.getId()){
            case R.id.submit_symptoms_btn:
                Intent moveFwd= new Intent(DataEntryActivity.this, DataEntryInterstitial.class);
                startActivity(moveFwd);
                break;
            case R.id.go_back_btn:
                Intent moveBack = new Intent(DataEntryActivity.this, MainActivity.class);
                startActivity(moveBack);
                break;

        }

    }
}
