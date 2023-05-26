package thanhmdph29909.fpoly.assnangcao;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.widget.ImageView;

import com.bumptech.glide.Glide;

public class Activity_Manhinhchao extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_manhinhchao);
        ImageView imglogo = findViewById(R.id.gipp);
        Glide.with(Activity_Manhinhchao.this).load(R.mipmap.giphy).into(imglogo);
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                startActivity(new Intent(Activity_Manhinhchao.this, MainActivity.class));
                finish();
            }
        }, 2400);
    }
}