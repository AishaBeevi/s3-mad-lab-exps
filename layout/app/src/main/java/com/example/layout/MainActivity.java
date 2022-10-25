package com.example.layout;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.widget.Switch;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        }
        public void click (View view){
        boolean checked = ((RadioButton) view).isChecked();
        switch (view.getId()){
            case R.id.r1:
                if (checked){
                    Intent n = new Intent(MainActivity.this, MainActivity2.class);
                    startActivity(n);
                }
                break;
            case R.id.r2:
                if (checked){
                    Intent n = new Intent(MainActivity.this, MainActivity3.class);
                    startActivity(n);
                }
                break;
            case R.id.r3:
                if (checked){
                    Intent n = new Intent(MainActivity.this, MainActivity4.class);
                    startActivity(n);
                }
                break;
            case R.id.r4:
                if (checked){
                    Intent n = new Intent(MainActivity.this, MainActivity5.class);
                    startActivity(n);
                }
                break;
            case R.id.r5:
                if (checked){
                    Intent n = new Intent(MainActivity.this, MainActivity6.class);
                    startActivity(n);
                }
                break;
        }

    }
}