package com.alex7498.fakelogin;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText ET1;
    EditText ET2;
    Button LI;
    TextView TV1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ET1 = findViewById(R.id.username);
        ET2 = findViewById(R.id.password);

        LI = findViewById(R.id.login);

        TV1 = findViewById(R.id.resText);

        LI.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TV1.setText(ET1.getText());
            }
        });

        LI.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                TV1.setText(ET2.getText());
                return true;
            }
        });



    }
}
