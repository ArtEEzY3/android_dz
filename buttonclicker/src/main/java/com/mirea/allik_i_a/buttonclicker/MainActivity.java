package com.mirea.allik_i_a.buttonclicker;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextView tvOut = (TextView) findViewById(R.id.tvOut);
        Button btnWhoAmI = findViewById(R.id.btnWhoAmI);
        Button btnItIsNotMe = findViewById(R.id.btnItIsNotMe);
        View.OnClickListener oclBtnWhoAmI = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tvOut.setText("Мой номер по списку No 1");
            }
        };
        btnWhoAmI.setOnClickListener(oclBtnWhoAmI);
    }
    public void onItsNotMeClick(View view) {
        TextView tvOut = (TextView) findViewById(R.id.tvOut);
        tvOut.setText("Это сделал не я");
        CheckBox checkBox = findViewById(R.id.checkBox);
        checkBox.toggle();
    }
}