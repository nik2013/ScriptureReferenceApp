package com.example.nix.scripturereferenceapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    private EditText book;
    private EditText chapter;
    private EditText verse ;
    private Button submit ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        book = (EditText) findViewById(R.id.Scripture);
        chapter = (EditText) findViewById(R.id.Chapter);
        verse = (EditText) findViewById(R.id.Verse);
        submit = (Button) findViewById(R.id.button);

        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent nextActivity = new Intent(MainActivity.this, ScriptureDisplay.class);

                nextActivity.putExtra("book", book.getText().toString());
                nextActivity.putExtra("chapter", chapter.getText().toString());
                nextActivity.putExtra("verse", verse.getText().toString());

                startActivity(nextActivity);
            }
        });

    }
}
