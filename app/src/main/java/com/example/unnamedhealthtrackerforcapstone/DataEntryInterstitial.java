package com.example.unnamedhealthtrackerforcapstone;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class DataEntryInterstitial extends AppCompatActivity implements View.OnClickListener{
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.data_entry_interstitial);
    }

    @Override
    public void onClick(View v) {
        switch(v.getId()){
            case R.id.yes_another:
                Intent moreData= new Intent(DataEntryInterstitial.this, DataEntryActivity.class);
                startActivity(moreData);
                break;
            case R.id.go_back_btn:
                Intent moveBack = new Intent(DataEntryInterstitial.this, MainActivity.class);
                startActivity(moveBack);
                break;

        }

    }
}
