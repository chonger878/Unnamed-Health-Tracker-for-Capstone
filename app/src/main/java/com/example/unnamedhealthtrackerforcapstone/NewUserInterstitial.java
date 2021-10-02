package com.example.unnamedhealthtrackerforcapstone;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class NewUserInterstitial extends AppCompatActivity implements View.OnClickListener{
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.new_user_interstitial);
    }

    @Override
    public void onClick(View v) {
        switch(v.getId()){
            case R.id.enter_data_btn:
                Intent putData = new Intent(NewUserInterstitial.this, DataEntryActivity.class);
                startActivity(putData);
                break;
            case R.id.not_now_btn:
                Intent goHome = new Intent(NewUserInterstitial.this, MainActivity.class);
                startActivity(goHome);
                break;

        }

    }
}
