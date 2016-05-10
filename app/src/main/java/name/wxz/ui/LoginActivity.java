package name.wxz.ui;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.Window;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.example.vehicle_networking.R;
import com.squareup.okhttp.internal.Util;

import cn.bmob.v3.Bmob;
import cn.bmob.v3.BmobQuery;
import cn.bmob.v3.listener.GetListener;
import cn.bmob.v3.listener.SaveListener;
import name.wxz.modle.Person;
import name.wxz.modle.User;

public class LoginActivity extends Activity{
    Button Login;
    TextView  Register;
    private EditText Username;
    private EditText Password;
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
                String username = Username.getText().toString();
                String password = Password.getText().toString();

                if (username.equals("") || password.equals("")) {
                    toast("请输入账号和密码");
                }
                else {
                    Person bu = new Person();
                    bu.setUsername(username);
                    bu.setPassword(password);
                    bu.login(mContext, new SaveListener() {
                        @Override
                        public void onSuccess() {
                            // TODO Auto-generated method stub
                            toast("登录成功");
                            Intent intent = new Intent(LoginActivity.this, MainActivity.class);
                            startActivity(intent);
                        }

                        @Override
                        public void onFailure(int code, String msg) {
                            // TODO Auto-generated method stub
                            toast("密码错误");
                        }
                    });
                }
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

        Username = (EditText) findViewById(R.id.et_username);
        Password = (EditText) findViewById(R.id.et_password);
    }
    public void toast(String toast) {
        Toast.makeText(this, toast, Toast.LENGTH_SHORT).show();
    }
}
