package com.example.unnamedhealthtrackerforcapstone;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

public class LoginActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login_activity);

        //
    }

    /*
    *     @Override
    public void onClick(View v) {
        switch(v.getId()){
            case R.id.loginbtn:
                Intent login = new Intent(LoginActivity.this, DataEntryActivity.class);
                startActivity(login);
                break;
            case R.id.go_back_btn:
                Intent goHome = new Intent(LoginActivity.this, MainActivity.class);
                startActivity(goHome);
                break;

        }

    }
    *
    * */
}
