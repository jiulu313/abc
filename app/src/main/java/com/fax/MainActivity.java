package com.fax;

import android.content.DialogInterface;
import android.support.v7.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.baselib.dialog.AlertDialog;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        findViewById(R.id.tv_hello).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onHello();
            }
        });


    }

    private void onHello() {
//        AlertDialog.Builder builder = new AlertDialog.Builder(this)
//                .setTitle("Title")
//                .setMessage("message")
//                .create()
//                .show();
//

//        new AlertDialog.Builder(this)
//                .setTitle("你好")
//                .setMessage("需要喝水吗？")
//                .create()
//                .show();

//        new AlertDialog.Builder(this)
////                .addDefaultAnimation()
////                .formBottom(true)
////                .fullWidth()
////                .setContentView(R.layout.detail_comment_dialog)
////                .create()
////                .show();


        new AlertDialog.Builder(this)
                .addDefaultAnimation()
                .fullWidth()
                .setContentView(R.layout.dialog_two_button)
                .setOnClickListener(R.id.btn_cancel, new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Toast.makeText(MainActivity.this,"取消",Toast.LENGTH_SHORT).show();
                    }
                })
                .setOnClickListener(R.id.btn_ok, new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Toast.makeText(MainActivity.this,"确定",Toast.LENGTH_SHORT).show();
                    }
                })
                .create()
                .show();


    }
}
