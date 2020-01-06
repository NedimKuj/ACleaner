package dev.nedkuj.acleaner.sample;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.Toast;

import dev.nedkuj.acleaner.ACleaner;

public class MainActivity extends AppCompatActivity {

    ACleaner aCleaner;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        /*
        Use:
        - new ACleaner(this, getApplicationContext()) if you need to relaunch with a message
        - new ACleaner(this) if you need no message, just relaunch
         */

        aCleaner = new ACleaner(this, getApplicationContext());

        findViewById(R.id.relaunchWmsgBtn).setOnClickListener(v -> {
            aCleaner.relaunchAppWithMessage("Application relaunched by clicking the buton!");
        });

        findViewById(R.id.relaunchNoMsgBtn).setOnClickListener(v -> {
            aCleaner.relaunchApp();
        });
    }
}
