package com.example.beebuzz;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class bee_buzz_summer extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bee_buzz_summer);
    }

    public void changeSeason(View view) {
        Intent autumn = new Intent(this, bee_buzz_autumn.class);
        startActivity(autumn);
    }
}
