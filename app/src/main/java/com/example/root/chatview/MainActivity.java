package com.example.root.chatview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        for (int i=0;i<10;i++) {
            if (i % 2 == 0) {
                RecyclerView recyclerView = (RecyclerView) findViewById(R.id.programmingList);
                recyclerView.setLayoutManager(new LinearLayoutManager(this));
                String[] names = {"hiiiiii", "hello", "how are you?", "i am fine and u?", "i am also fine", "hmm", "can we go for a movie?", "ya ,sure", "Fukrey returns??", "done", "OMG i am excited", "hehe"};
                recyclerView.setAdapter(new ProgrammingAdapter(names));
            }
        }



    }
}
