package com.example.fernandoc10.firstandroidapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class HomeActivity extends AppCompatActivity {

    Button clickMeButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        clickMeButton = (Button) findViewById(R.id.click_me_button);

        clickMeButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(view.getContext(), "Did it!!!", Toast.LENGTH_SHORT).show();
            }
        });
    }

    public void onNextScreenButtonClicked(View view){
        Toast.makeText(this, "Did it again!!", Toast.LENGTH_SHORT).show();
        Intent intent = new Intent(this, AboutActivity.class);
        startActivity(intent);
    }
}
