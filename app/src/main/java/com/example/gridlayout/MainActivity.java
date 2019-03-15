package com.example.gridlayout;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    ImageView fim, sim, tim, i1, i2, i3, i4, i5, i6;
    int cont, cont1, cont2 =0;
    int[] imgs = {
            R.drawable.icon4,
            R.drawable.icon2,
            R.drawable.icon3,
            R.drawable.icon4,
            R.drawable.icon5,
            R.drawable.icon6,
            R.drawable.icon7
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        fim = (ImageView) findViewById(R.id.one);
        fim.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                fim.setImageResource(imgs[cont]);
                cont++;
                if(cont==3){
                    cont=0;
                }

            }
        });

        sim = (ImageView) findViewById(R.id.two);
        sim.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                sim.setImageResource(imgs[cont1]);
                cont++;
                if(cont==3){
                    cont=0;
                }

            }
        });

        tim = (ImageView) findViewById(R.id.three);
        tim.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tim.setImageResource(imgs[cont]);
                cont++;
                if(cont==3){
                    cont=0;
                }

            }
        });

        i1 = (ImageView) findViewById(R.id.four);
        i1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                i1.setImageResource(imgs[cont]);
                cont++;
                if(cont==3){
                    cont=0;
                }

            }
        });

        i2 = (ImageView) findViewById(R.id.five);
        i2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                i2.setImageResource(imgs[cont]);
                cont++;
                if(cont==3){
                    cont=0;
                }

            }
        });

        i3 = (ImageView) findViewById(R.id.six);
        i3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                i3.setImageResource(imgs[cont]);
                cont++;
                if(cont==3){
                    cont=0;
                }

            }
        });

        i4 = (ImageView) findViewById(R.id.seven);
        i4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                i4.setImageResource(imgs[cont]);
                cont++;
                if(cont==3){
                    cont=0;
                }

            }
        });

        i5 = (ImageView) findViewById(R.id.eight);
        i5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                i5.setImageResource(imgs[cont]);
                cont++;
                if(cont==3){
                    cont=0;
                }

            }
        });

        i6 = (ImageView) findViewById(R.id.nine);
        i6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                i6.setImageResource(imgs[cont]);
                cont++;
                if(cont==3){
                    cont=0;
                }

            }
        });
    }
}
