package com.example.soundsofuniverse;

import android.media.Image;
import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;


public class MainActivity extends AppCompatActivity {

    Buttom sun,voyager,saturn,plasma,mars,mistery,stop;
    int counter = 1;

    MediaPlayer mp;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

       sun = findViewById(R.id.sun);
       voyager = findViewById(R.id.voyager);
       saturn = findViewById(R.id.saturn);
       plasma = findViewById(R.id.plasma);
       mars = findViewById(R.id.mars);
       mistery = findViewById(R.id.mistery);
       stop = findViewById(R.id.stop);


        sun.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                    mp = MediaPlayer.create(MainActivity.this, R.raw.sun_sonification);
                    mp.setOnPreparedListener(new MediaPlayer.OnPreparedListener() {
                        @Override
                        public void onPrepared(MediaPlayer mp) {
                            mp.start();
                            //Animate(sun, R.raw.bandai_dokkan);
                        }
                    });


                    mp.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                        @Override
                        public void onCompletion(MediaPlayer mp) {
                            mp.release();
                        }
                    });
                }
        });


        voyager.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mp = MediaPlayer.create(MainActivity.this,R.raw.voyagertsunamiwaves);
                mp.setOnPreparedListener(new MediaPlayer.OnPreparedListener() {
                    @Override
                    public void onPrepared(MediaPlayer mp) {
                        mp.start();

                    }
                });

                mp.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                    @Override
                    public void onCompletion(MediaPlayer mp) {
                        mp.release();
                    }
                });
            }
        });


        saturn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mp = MediaPlayer.create(MainActivity.this,R.raw.saturnradiowaves);
                mp.setOnPreparedListener(new MediaPlayer.OnPreparedListener() {
                    @Override
                    public void onPrepared(MediaPlayer mp) {
                        mp.start();
                    }
                });

                mp.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                    @Override
                    public void onCompletion(MediaPlayer mp) {
                        mp.release();
                    }
                });
            }
        });

        plasma.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mp = MediaPlayer.create(MainActivity.this,R.raw.plasmawaves);
                mp.setOnPreparedListener(new MediaPlayer.OnPreparedListener() {
                    @Override
                    public void onPrepared(MediaPlayer mp) {
                        mp.start();
                    }
                });

                mp.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                    @Override
                    public void onCompletion(MediaPlayer mp) {
                        mp.release();
                    }
                });
            }
        });


        mars.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mp = MediaPlayer.create(MainActivity.this,R.raw.firstmarsrecord);
                mp.setOnPreparedListener(new MediaPlayer.OnPreparedListener() {
                    @Override
                    public void onPrepared(MediaPlayer mp) {
                        mp.start();
                    }
                });

                mp.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                    @Override
                    public void onCompletion(MediaPlayer mp) {
                        mp.release();
                    }
                });
            }
        });


        mistery.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mp = MediaPlayer.create(MainActivity.this,R.raw.interstellarplasmasounds);
                mp.setOnPreparedListener(new MediaPlayer.OnPreparedListener() {
                    @Override
                    public void onPrepared(MediaPlayer mp) {
                        mp.start();

                    }
                });

                mp.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                    @Override
                    public void onCompletion(MediaPlayer mp) {
                        mp.release();
                    }
                });
            }
        });

    stop.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            mp.stop();
            mp.release();
        }
    });


    }
    /*testing animacion con la biblioteca lottie de airbnb*/

    //public void Animate( LottieAnimationView ImageView, int anim) {
      //  if (counter>3){
       //     counter = 1;
        //    ImageView.setAnimation(anim);
         //   ImageView.playAnimation();
          //  ImageView.setImageResource(R.drawable.background);
       // }
       // else {

           /* ImageView.setAnimation(anim);
            ImageView.playAnimation();
            if (counter==2){
                ImageView.setImageResource(R.drawable.background2);
            if (counter==3){
                ImageView.setImageResource(R.drawable.background3);
            }
        }
            counter = counter + 1;
        }
    };*/


}
