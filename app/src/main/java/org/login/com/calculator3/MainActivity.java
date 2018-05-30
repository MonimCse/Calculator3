package org.login.com.calculator3;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class MainActivity extends AppCompatActivity {


    @BindView(R.id.btn_one)
    Button mBtnOne;

    @BindView(R.id.btn_two)
    Button mBtntwo;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);

//        mBtnOne.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Toast.makeText(getApplicationContext(),"ONe",Toast.LENGTH_LONG).show();
//            }
//        });
    }

    @OnClick(R.id.btn_one)
    public void clickOne()
    {
        Toast.makeText(getApplicationContext(),mBtnOne.getText().toString(),Toast.LENGTH_LONG).show();
    }

    @OnClick(R.id.btn_two)
    public void clickTwo()
    {
        Toast.makeText(getApplicationContext(),mBtntwo.getText().toString(),Toast.LENGTH_LONG).show();
    }
}
