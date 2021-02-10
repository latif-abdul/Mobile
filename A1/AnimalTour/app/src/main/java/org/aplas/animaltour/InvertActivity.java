package org.aplas.animaltour;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityOptionsCompat;
import androidx.core.view.ViewCompat;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;

public class InvertActivity extends AppCompatActivity {
    private ImageView insectPic, arachnidPic, molluscPic, crustaceanPic;
    private ImageButton mediaButton, finishButton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_invert);
        insectPic = (ImageView)findViewById(R.id.insectsPic);
        arachnidPic = (ImageView)findViewById(R.id.arachnidPic);
        molluscPic = (ImageView)findViewById(R.id.molluscPic);
        crustaceanPic = (ImageView)findViewById(R.id.crustaceanPic);
        mediaButton = (ImageButton)findViewById(R.id.mediaButton);
        finishButton = (ImageButton)findViewById(R.id.finishButton);
        insectPic.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(),SubInvertActivity.class);
                intent.putExtra("TITLE_ANIMAL", "Insects");
                ActivityOptionsCompat options =
                        ActivityOptionsCompat.makeSceneTransitionAnimation(
                                InvertActivity.this, insectPic, ViewCompat.getTransitionName(insectPic));
                startActivity(intent, options.toBundle());
            }
        });
        arachnidPic.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(),SubInvertActivity.class);
                intent.putExtra("TITLE_ANIMAL", "Arachnids");
                ActivityOptionsCompat options =
                        ActivityOptionsCompat.makeSceneTransitionAnimation(
                                InvertActivity.this, arachnidPic, ViewCompat.getTransitionName(arachnidPic));
                startActivity(intent, options.toBundle());
            }
        });
        molluscPic.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(),SubInvertActivity.class);
                intent.putExtra("TITLE_ANIMAL", "Molluscs");
                ActivityOptionsCompat options =
                        ActivityOptionsCompat.makeSceneTransitionAnimation(
                                InvertActivity.this, molluscPic, ViewCompat.getTransitionName(molluscPic));
                startActivity(intent, options.toBundle());
            }
        });
        crustaceanPic.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(),SubInvertActivity.class);
                intent.putExtra("TITLE_ANIMAL", "Crustaceans");
                ActivityOptionsCompat options =
                        ActivityOptionsCompat.makeSceneTransitionAnimation(
                                InvertActivity.this, crustaceanPic, ViewCompat.getTransitionName(crustaceanPic));
                startActivity(intent, options.toBundle());
            }
        });
        mediaButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(),MediaActivity.class));
                overridePendingTransition(R.anim.slide_in_right, R.anim.slide_out_right);
            }
        });
        finishButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(),MainActivity.class));
                overridePendingTransition(R.anim.slide_in_right, R.anim.slide_out_right);
            }
        });
    }
}