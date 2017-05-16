package com.example.bus.apptest;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText nametxt;
    EditText usertxt;
    EditText passtxt;

    String nameString;
    String strUsername;
    String strPassword;
    String User = "admin";
    String Pass = "1234";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }
    public void btnLOGIN(View view){

        nametxt = (EditText) findViewById(R.id.nametxt);
        usertxt = (EditText) findViewById(R.id.usertxt);
        passtxt = (EditText) findViewById(R.id.passtxt);

        nameString = nametxt.getText().toString();
        strUsername = usertxt.getText().toString();
        strPassword = passtxt.getText().toString();

        if(nametxt.equals("") || strUsername.equals("") || strPassword.equals("")){
            Toast.makeText(this, "กรอกข้อมูลให้ครบ", Toast.LENGTH_SHORT).show();
        }
        else if(!strUsername.equals(User) || !strPassword.equals(Pass)){
            Toast.makeText(this, "Username และ Password ผิดพลาาด \n    Login False", Toast.LENGTH_SHORT).show();
        }
        else{
            Toast.makeText(this, "Login Success", Toast.LENGTH_SHORT).show();
            Intent intent = new Intent(MainActivity.this,Show.class);
            intent.putExtra("Name",nameString);
            startActivity(intent);
        }
    }
}//main class
 //end metthod