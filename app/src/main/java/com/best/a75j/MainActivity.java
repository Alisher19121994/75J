package com.best.a75j;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.text.Spannable;
import android.text.SpannableString;
import android.text.style.ForegroundColorSpan;
import android.widget.TextView;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MainActivity extends AppCompatActivity {
    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textView = findViewById(R.id.textBtn);
        getData();
    }

    public void getData() {
        String text = "Please, visit this social media sites #Twitter and #Instagram";
        Spannable spannable = new SpannableString(text);
        Matcher pattern = Pattern.compile("#([A-Za-z0-9_-]+)").matcher(text);
        while (pattern.find()) {
            spannable.setSpan(new ForegroundColorSpan(Color.GREEN), pattern.start(), pattern.end(), 0);
        }
        textView.setText(spannable);
    }
}