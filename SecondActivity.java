package com.example.lifecyclebidirectionalapp;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class SecondActivity extends AppCompatActivity {

    private static final String TAG = "LifecycleCallback";
    private EditText etReply;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        Log.d(TAG, "SecondActivity: onCreate()");

        TextView tvReceivedMessage = findViewById(R.id.tvReceivedMessage);
        etReply = findViewById(R.id.etReply);
        Button btnReply = findViewById(R.id.btnReply);

        // Receive data from MainActivity
        Intent intent = getIntent();
        if (intent != null && intent.hasExtra("message_key")) {
            String message = intent.getStringExtra("message_key");
            tvReceivedMessage.setText(message);
        }

        // Reply button click listener
        btnReply.setOnClickListener(v -> {
            String replyString = etReply.getText().toString().trim();
            Intent resultIntent = new Intent();
            resultIntent.putExtra("reply_key", replyString);
            setResult(RESULT_OK, resultIntent);
            finish(); // Closes SecondActivity and sends data back
        });
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d(TAG, "SecondActivity: onStart()");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d(TAG, "SecondActivity: onResume()");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d(TAG, "SecondActivity: onPause()");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d(TAG, "SecondActivity: onStop()");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d(TAG, "SecondActivity: onRestart()");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d(TAG, "SecondActivity: onDestroy()");
    }
                                    }
  
