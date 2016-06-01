package name.wxz.ui;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.Button;
import android.widget.RelativeLayout;

import com.example.vehicle_networking.R;

import cn.bmob.v3.BmobUser;
import name.wxz.Set.SetPerson;

/**
 * Created by Nikcn on 2016/5/31.
 */
public class SetActivity extends Activity {
    private  Button logout;
    private RelativeLayout person;
    public Context mContext = this;
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.activity_set);
        logout=(Button)findViewById(R.id.btn_logout);
        person=(RelativeLayout)findViewById(R.id.layout_info);
        logout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                BmobUser.logOut(mContext);   //清除缓存用户对象
                BmobUser currentUser = BmobUser.getCurrentUser(mContext); // 现在的currentUser是null了
                Intent logout=new Intent(SetActivity.this,LoginActivity.class);
                startActivity(logout);
                finish();
            }
        });
        person.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent person=new Intent(SetActivity.this,SetPerson.class);
                startActivity(person);
            }
        });
    }
}