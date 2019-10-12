package com.example.projectsplashscrren;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    Animation fromtop;
    Animation fromleft;
    Animation fromright;
    Animation frombottom;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate (savedInstanceState);
        setContentView (R.layout.activity_main);
        Button button = (Button) findViewById (R.id.sub);
        ImageView s = (ImageView) findViewById (R.id.s);
        ImageView ss = (ImageView) findViewById (R.id.ss);
        ImageView o = (ImageView) findViewById (R.id.o);
        frombottom = AnimationUtils.loadAnimation (this,R.anim.frombottom);
        fromtop = AnimationUtils.loadAnimation (this,R.anim.fromtop);
        fromleft = AnimationUtils.loadAnimation (this,R.anim.fromleft);
        fromright= AnimationUtils.loadAnimation (this,R.anim.fromright);
        button.setAnimation (frombottom);
        s.setAnimation (fromleft);
        o.setAnimation (fromtop);
        ss.setAnimation (fromright);
    }
}
