package com.example.hanghang;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;

public class FindClothActivity extends Activity {

    @Override
    protected void onCreate(Bundle saveInstanceState) {
        super.onCreate(saveInstanceState);
        setContentView(R.layout.activity_find_cloth);

    }

    public void onClickBackButton(View v) {
        finish();
    }

}
