package thanhmdph29909.fpoly.assnangcao;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Activity_Dangky extends AppCompatActivity {
    Button btnDangky2;
    TextView btnThoat;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dangky);
        btnDangky2 = findViewById(R.id.btnDangKy2);
        btnThoat = findViewById(R.id.btnThoat);
        btnDangky2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent mIntent = new Intent(Activity_Dangky.this, MainActivity.class);
                startActivity(mIntent);
            }
        });
        btnThoat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent mIntent = new Intent(Activity_Dangky.this, MainActivity.class);
                startActivity(mIntent);
            }
        });
    }
}