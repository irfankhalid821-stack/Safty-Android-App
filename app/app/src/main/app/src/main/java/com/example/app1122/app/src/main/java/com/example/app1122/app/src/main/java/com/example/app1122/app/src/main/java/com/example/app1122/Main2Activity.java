package com.example.app1122;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Thread thh = new Thread() {
            public void run() {
                try {
                    sleep(3000);
                } catch (Exception ex) {
                    Toast.makeText(getApplicationContext(), ex.toString(), Toast.LENGTH_LONG).show();
                }
                startActivity(new Intent(MainActivity.this, Login.class));
                finish();
            }
        };
        thh.start();
    }
}
