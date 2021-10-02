package com.example.unnamedhealthtrackerforcapstone;

import androidx.appcompat.app.AppCompatActivity;
import android.view.View;
import android.os.Bundle;
import android.content.Intent;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }


    @Override
    public void onClick(View v) {
        switch(v.getId()){
            case R.id.loginbtn:
                Intent login = new Intent(MainActivity.this, LoginActivity.class);
                startActivity(login);
                break;
            case R.id.newuserbtn:
                Intent new_user_login = new Intent(MainActivity.this, NewUserActivity.class);
                startActivity(new_user_login);
                break;

        }

    }
}