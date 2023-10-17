package com.example.telegramdemo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class Users extends AppCompatActivity {

private EditText fullName,email,higQua;
private  TextView welText;
private Button sub;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detailes);
        Intent intent = new Intent();
        String a= getIntent().getStringExtra("key");

        fullName=findViewById(R.id.fname);
        email=findViewById(R.id.email);
        welText = findViewById(R.id.weltext);
        welText.setText("Welcome " + a);
//        higQua=findViewById(R.id.quali);
        Button sub=findViewById(R.id.button2);
        sub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String fulName=fullName.getText().toString();
                String edTxtEmail=email.getText().toString();
                String txtFullName=fullName.getText().toString();
                Intent intent=new Intent(Users.this,Profile.class);
                intent.putExtra("key1",fulName);
                intent.putExtra("key2",edTxtEmail);
//                intent.putExtra("key",a);
                Toast.makeText(Users.this,"Data Saved",Toast.LENGTH_SHORT).show();
                startActivity(intent);

            }
        });

    }
}