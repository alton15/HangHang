package com.example.hanghang;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;

public class CodyActivity extends Activity {

    @Override
    protected void onCreate(Bundle saveInstanceState) {
        super.onCreate(saveInstanceState);
        setContentView(R.layout.activity_my_cody);

    }

    public void onClickBackButton(View view) {
        finish();
    }

}
