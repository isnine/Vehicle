package name.wxz.ui;

import android.app.Activity;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.example.vehicle_networking.R;

/**
 * Created by Nikcn on 2016/5/10.
 */
public class RegisterActivity extends Activity {
    private Button Register;
    private EditText Username;
    private EditText Password;
    private EditText Password2;

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
     		String name = Username.getText().toString();
     		String password = Password.getText().toString();
     		String pwd_again = Password2.getText().toString();


        if (TextUtils.isEmpty(name)) {
            toast("用户名不能为空");
            return;
        }

        if (TextUtils.isEmpty(password)) {
            toast("密码不能为空");
            return;
        }
        if (!pwd_again.equals(password)) {
            toast("确认密码与密码不同");
            return;
        }


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


