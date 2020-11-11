package com.example.project_imagelist;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    private int[] imgId = {R.drawable.img_1, R.drawable.img_2, R.drawable.img_3,
            R.drawable.img_4, R.drawable.img_5, R.drawable.img_6,
            R.drawable.img_7, R.drawable.img_8, R.drawable.img_9, R.drawable.img_10,
            R.drawable.img_11,R.drawable.img_12};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button button = (Button)findViewById(R.id.btn_ImgView);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EditText number = (EditText)findViewById(R.id.value);
                ImageView img = (ImageView)findViewById(R.id.display);
                int num = Integer.parseInt(number.getText().toString());

                if (num == 1){
                    img.setImageResource(imgId[0]);
                }
                else if (num == 2){
                    img.setImageResource(imgId[1]);
                }
                else if (num == 3){
                    img.setImageResource(imgId[2]);
                }
                else if (num == 4){
                    img.setImageResource(imgId[3]);
                }
                else if (num == 5){
                    img.setImageResource(imgId[4]);
                }
                else if (num == 6){
                    img.setImageResource(imgId[5]);
                }
                else if (num == 7){
                    img.setImageResource(imgId[6]);
                }
                else if (num == 8){
                    img.setImageResource(imgId[7]);
                }
                else if (num == 9){
                    img.setImageResource(imgId[8]);
                }
                else if (num == 10){
                    img.setImageResource(imgId[9]);
                }
                else if (num == 11) {
                    img.setImageResource(imgId[10]);
                }
                else if (num == 12) {
                    img.setImageResource(imgId[11]);
                }
            }
        });
    }
}