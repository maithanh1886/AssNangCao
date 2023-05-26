package thanhmdph29909.fpoly.assnangcao;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class Activity_ManHinhChinh extends AppCompatActivity {
    ImageView ImaCaidat, ImaQuanLy, ImaNghenhac, ImaDocSach;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_man_hinh_chinh);
        ImaCaidat = findViewById(R.id.ImaCaidat);
        ImaNghenhac = findViewById(R.id.ImaNghenhac);
        ImaDocSach = findViewById(R.id.ImaDocSach);
        ImaQuanLy = findViewById(R.id.ImaQuanly);
        ImaNghenhac.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent mIntent = new Intent(Activity_ManHinhChinh.this, ActivityNgheNhac.class);
                startActivity(mIntent);
            }
        });
        ImaDocSach.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent mIntent = new Intent(Activity_ManHinhChinh.this, ActivityDocSach.class);
                startActivity(mIntent);
            }
        });
        ImaCaidat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent mIntent = new Intent(Activity_ManHinhChinh.this, ActivityCaiDat.class);
                startActivity(mIntent);
            }
        });
        ImaQuanLy.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent mIntent = new Intent(Activity_ManHinhChinh.this, ActivityThongTinNguoiDung.class);
                startActivity(mIntent);
            }
        });
    }
}