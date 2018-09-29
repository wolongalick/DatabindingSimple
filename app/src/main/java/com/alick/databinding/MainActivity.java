package com.alick.databinding;

import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Toast;

import com.alick.databinding.databinding.ActivityMainBinding;


public class MainActivity extends AppCompatActivity {
    private static final String TAG = "MainActivity";
    private ActivityMainBinding binding;
    final UserInfo userInfo = new UserInfo();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main);

        userInfo.setUsername("cxw22");
        userInfo.setAge(28);
        userInfo.setSex(true);

        binding.setUserInfo(userInfo);
        binding.setName1("alick");
        binding.setStr1("嘤嘤嘤");

        binding.setPresenter(new Presenter());

        binding.setClickListener1(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(),userInfo.getUsername(),Toast.LENGTH_SHORT).show();
            }
        });

        binding.setClickListener2(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(),"btn2",Toast.LENGTH_SHORT).show();

                userInfo.setUsername("崔兴旺");
                binding.setUserInfo(userInfo);
            }
        });

    }


    public class Presenter{
        public void onTextChanged(CharSequence s, int start, int before, int count){
            userInfo.setUsername(s.toString());
            binding.setUserInfo(userInfo);
        }

        public void onGetUserinfo(UserInfo userInfo){
            Toast.makeText(getApplicationContext(),userInfo.toString(),Toast.LENGTH_SHORT).show();
        }

        public void getStr(String str){
            Toast.makeText(getApplicationContext(),str,Toast.LENGTH_SHORT).show();
        }
    }

}
