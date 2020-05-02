package com.shuvenduoffline.quiz;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import static com.shuvenduoffline.quiz.QuizActivity.EXTRA_SCORE;
import static com.shuvenduoffline.quiz.QuizActivity.EXTRA_TOTAL;

public class ResultActivity extends AppCompatActivity {

    TextView result;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);

        Intent intent = getIntent();

        int score = intent.getIntExtra(EXTRA_SCORE,0);

        result = findViewById(R.id.result);

        result.setText(String.valueOf(score));

    }

    public void PlayAgain(View view) {
        startActivity(new Intent(getApplicationContext(),QuizActivity.class));
        finish();
    }

    public void ExitApp(View view) {
        finish();
    }
}
