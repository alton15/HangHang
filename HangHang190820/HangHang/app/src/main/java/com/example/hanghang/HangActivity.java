package com.example.hanghang;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;

public class HangActivity extends Activity {

    @Override
    protected void onCreate(Bundle saveInstanceState) {
        super.onCreate(saveInstanceState);
        setContentView(R.layout.activity_hang_cloth);

    }

    public void onClickBackButton(View v) {
        finish();
    }

}
