package com.example.telegramdemo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class LoginActivity extends AppCompatActivity {

    private EditText userName,password;
    private Button add;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        userName= findViewById(R.id.editTextText);
        password= findViewById(R.id.editTextText2);
        add=findViewById(R.id.button);
        Button btn=findViewById(R.id.button);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String edTxtName=userName.getText().toString();
                String pass=password.getText().toString();
                if(!edTxtName.isEmpty())
                {
                    if("999".equals(pass)){
                        Intent intent=new Intent(LoginActivity.this, Users.class);
                        intent.putExtra("key",edTxtName);
                        Toast.makeText(LoginActivity.this,edTxtName,Toast.LENGTH_SHORT).show();
                        startActivity(intent);
                    }
                    else {
                        password.setError("invalid password");
                        password.requestFocus();
                        Toast.makeText(LoginActivity.this,"Invalid Password",Toast.LENGTH_SHORT).show();
                    }
                }
                else {
                    userName.setError("invalid userName");
                    userName.requestFocus();
                    Toast.makeText(LoginActivity.this,"Invalid User name",Toast.LENGTH_SHORT).show();
                }


            }
        });

    }
}