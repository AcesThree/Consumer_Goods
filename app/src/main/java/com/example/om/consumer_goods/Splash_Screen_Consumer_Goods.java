package com.example.om.consumer_goods;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Window;
import android.view.WindowManager;

public class Splash_Screen_Consumer_Goods extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);


        requestWindowFeature(Window.FEATURE_NO_TITLE);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);

        setContentView(R.layout.activity_splash__screen__consumer__goods);

        consumer_Good_Splash_Screen logo = new consumer_Good_Splash_Screen();
        logo.splash();

    }

private class consumer_Good_Splash_Screen extends Thread{
        private void splash (){
            try {
                sleep(1000);
            } catch (InterruptedException om) {
                om.printStackTrace();
            }

            Intent myIntent = new Intent(Splash_Screen_Consumer_Goods.this, MainActivity.class);
            startActivity(myIntent);
            Splash_Screen_Consumer_Goods.this.finish();
        }


}


}
