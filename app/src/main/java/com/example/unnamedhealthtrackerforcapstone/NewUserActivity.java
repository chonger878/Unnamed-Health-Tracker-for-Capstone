package com.example.unnamedhealthtrackerforcapstone;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class NewUserActivity extends AppCompatActivity implements View.OnClickListener{
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.new_user_activity);
    }

    @Override
    public void onClick(View v) {
        switch(v.getId()){
            case R.id.submit_new_user:
                Intent moveFwd= new Intent(NewUserActivity.this, NewUserInterstitial.class);
                startActivity(moveFwd);
                break;
            case R.id.go_back_btn:
                Intent moveBack = new Intent(NewUserActivity.this, NewUserActivity.class);
                startActivity(moveBack);
                break;

        }

    }
}
