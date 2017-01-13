package com.github.nnesterov.testprotobuf;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;

public class JavaActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_java);

        MessageOuterClass.Message message = MessageOuterClass.Message.newBuilder()
                .setId(248)
                .build();
        Log.d("JavaActivity", "Message Id : " + message.getId());
    }
}
