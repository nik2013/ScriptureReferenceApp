package com.example.nix.scripturereferenceapp;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.widget.EditText;

public class ScriptureDisplay extends AppCompatActivity {

    private static final String TAG = ScriptureDisplay.class.getSimpleName();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_scripture_display);

        String book = getIntent().getStringExtra("book");
        String chapter = getIntent().getStringExtra("chapter");
        String verse = getIntent().getStringExtra("verse");
        Log.i(TAG,"OnCreate book " + book ) ;
        Log.i(TAG,"OnCreate chapter " + chapter ) ;
        Log.i(TAG,"OnCreate verse " + verse ) ;

        //Your favorite scripture is:
        String statement = "Your favorite scripture is: " + book + " " + chapter + ":" + verse;

        EditText shareText = (EditText) findViewById(R.id.shareText);
        shareText.setLines(2);
        shareText.setText(statement);

    }
}
