package com.example.basicanimations;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

public  void fade(View view) {
int k=0;
    Log.i("info","pressed" );
    ImageView imageView3=findViewById(R.id.imageView3);
    ImageView imageView4=findViewById(R.id.imageView4);
      if (k%2==0){
    imageView4.animate().alpha(1).scaleX(1.5f).scaleY(1.5f).setDuration(1000);k++;

        }
else {
    k++;
    imageView4.animate().alpha(0).scaleX(1.0f).scaleY(1.0f).setDuration(1000);
    imageView3.animate().alpha(1).setDuration(1000);
}



}
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ImageView imageView3=findViewById(R.id.imageView3);
        imageView3.setX(-1000);
        imageView3.animate().translationXBy(1000).rotation(1800).setDuration(1000);

    }
}