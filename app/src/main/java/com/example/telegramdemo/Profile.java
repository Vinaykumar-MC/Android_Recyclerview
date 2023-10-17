package com.example.telegramdemo;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class Profile extends AppCompatActivity {
    private RecyclerView rv;
    public List<User> items;

//    private String userName;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.profle_rview);
        Intent intent=new Intent();
       String name=getIntent().getStringExtra("key1");
       String email=getIntent().getStringExtra("key2");
       items= new ArrayList<User>();
//        items.add(new User(name,email));
        items.add(new User("Tarun","Tarun@gmail.com"));
        items.add(new User("Vinay","Vinay@gmail.com"));
        items.add(new User("Varun","Varun@gmail.com"));
        items.add(new User("Tarun","Tarun@gmail.com"));
        items.add(new User("Vinay","Vinay@gmail.com"));
        items.add(new User("Varun","Varun@gmail.com"));
        items.add(new User("Tarun","Tarun@gmail.com"));
        items.add(new User("Tarun","Tarun@gmail.com"));
        items.add(new User("Vinay","Vinay@gmail.com"));
        items.add(new User("Varun","Varun@gmail.com"));
        items.add(new User("Tarun","Tarun@gmail.com"));
        items.add(new User("Vinay","Vinay@gmail.com"));
        items.add(new User("Varun","Varun@gmail.com"));
        items.add(new User("Tarun","Tarun@gmail.com"));
        items.add(new User("Varun","Varun@gmail.com"));
        items.add(new User("Tarun","Tarun@gmail.com"));
        items.add(new User("Vinay","Vinay@gmail.com"));
        items.add(new User("Varun","Varun@gmail.com"));
        items.add(new User("Tarun","Tarun@gmail.com"));
//        Intent intent = new Intent();
//        userName=getIntent().getStringExtra("key");
        rv = findViewById(R.id.rview);
        rv.setLayoutManager(new LinearLayoutManager(this));
        rv.setAdapter(new Adopter(items));
    }
}