package com.example.hanghang;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class LoginActivity extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login_my_poop);
    }

    public void onButtonClicked(View v) {
        Intent intent = new Intent(LoginActivity.this, MainActivity.class);
        startActivity(intent);
        Toast.makeText(this, "실험중", Toast.LENGTH_SHORT).show();
        finish();
    }
}
