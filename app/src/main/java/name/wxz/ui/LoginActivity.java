package name.wxz.ui;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.Window;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import com.example.vehicle_networking.R;

import cn.bmob.v3.Bmob;
import cn.bmob.v3.BmobQuery;
import cn.bmob.v3.listener.GetListener;
import cn.bmob.v3.listener.SaveListener;
import name.wxz.modle.Person;

public class LoginActivity extends Activity{
    Button Login;
    TextView  Register;
    private Context mContext = this;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.activity_login);
        Bmob.initialize(this, "6629c4f9eb067b6d188d85f8d3bf1ab5");

        init();

        Login.setOnClickListener(new OnClickListener(){

            @Override
            public void onClick(View v) {

                Intent intent=new Intent(LoginActivity.this,MainActivity.class);
                startActivity(intent);


/*                Person p2 = new Person();
                p2.setName("2");
                p2.setAddress("3");
                p2.save(mContext, new SaveListener() {
                    @Override
                    public void onSuccess() {
                        // TODO Auto-generated method stub
                        toast("成功");
                    }

                    @Override
                    public void onFailure(int code, String msg) {
                        // TODO Auto-generated method stub
                        toast("失败");
                    }
                });  //保存数据*/
            }

        });

       Register.setOnClickListener(new OnClickListener() {

            @Override
            public void onClick(View arg0) {
                // TODO Auto-generated method stub
                Intent intent=new Intent(LoginActivity.this,RegisterActivity.class);
                startActivity(intent);
            }
        });
    }
    public void init(){
        Login=(Button)findViewById(R.id.btn_login);
        Register=(TextView)findViewById(R.id.btn_register);
    }
    public void toast(String toast) {
        Toast.makeText(this, toast, Toast.LENGTH_SHORT).show();
    }
}
