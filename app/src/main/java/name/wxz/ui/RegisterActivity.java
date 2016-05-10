package name.wxz.ui;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.example.vehicle_networking.R;

import cn.bmob.v3.listener.SaveListener;
import name.wxz.modle.Person;
import name.wxz.modle.User;

/**
 * Created by Nikcn on 2016/5/10.
 */
public class RegisterActivity extends Activity {

    @SuppressWarnings("unused")
    private Button Register;
    private EditText Username;
    private EditText Password;
    private EditText Password2;
    private Context mContext = this;
    private static final String TAG = "RegisterActivity";

    private String username = null;
    private String password = null;
    private String comfirmPsd = null;
    private String phone = null;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);
        init();

        Register.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                register();
            }
        });
    }

    private void register() {
     		username = Username.getText().toString();
     		password = Password.getText().toString();
            comfirmPsd = Password2.getText().toString();


        if (TextUtils.isEmpty(username)) {
            toast("用户名不能为空");
            return;
        }

        if (TextUtils.isEmpty(password)) {
            toast("密码不能为空");
            return;
        }
        if (!comfirmPsd.equals(password)) {
            toast("确认密码与密码不同");
            return;
        }

        User p2 = new User();
        p2.setUsername(username);
        p2.setPassword(password);

        p2.signUp(this, new SaveListener() {
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
        });
    }

    private void init() {
        Register = (Button) findViewById(R.id.btn_register);
        Username = (EditText) findViewById(R.id.et_username);
        Password = (EditText) findViewById(R.id.et_password);
        Password2 = (EditText) findViewById(R.id.et_password2);
    }

    public void toast(String toast) {
        Toast.makeText(this, toast, Toast.LENGTH_SHORT).show();
    }


}


