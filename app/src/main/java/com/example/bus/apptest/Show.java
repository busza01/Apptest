package com.example.bus.apptest;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class Show extends AppCompatActivity {



    String Name;
    TextView HeadTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_show);
        HeadTextView = (TextView) findViewById(R.id.showdata);

        Name = getIntent().getStringExtra("Name");
        HeadTextView.setText("ยินดีตอนรับ "+Name+" เข้าสู้ระบบ");





    }
}

