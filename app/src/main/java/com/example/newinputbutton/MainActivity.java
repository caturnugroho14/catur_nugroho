package com.example.newinputbutton;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private Button Button1, Button2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button1 = findViewById(R.id.Button1);
        Button2 = findViewById(R.id.Button2);

        Button1.setOnClickListener(this);
        Button2.setOnClickListener(this);
    }

    @Override
    public void onClick(View View){
        switch (View.getId()){

            case R.id.Button1:
                Toast.makeText(getApplicationContext(), "Button1 Di Klik",Toast.LENGTH_SHORT).show();
                break;

            case R.id.Button2:
                Toast.makeText(getApplicationContext(), "Button2 Di Klik",Toast.LENGTH_SHORT).show();
                break;

            default:
                break;
        }
    }
}
