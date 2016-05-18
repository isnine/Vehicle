package name.wxz.ui;

import android.app.Activity;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.Window;
import android.widget.TextView;

import com.example.vehicle_networking.R;

import cn.bmob.v3.BmobUser;
import name.wxz.modle.Person;

/**
 * Created by Nikcn on 2016/5/10.
 */
public class OilActivity extends Activity {
    private TextView User;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.activity_oil);

        Person userInfo = BmobUser.getCurrentUser(this,Person.class);
        User=(TextView)findViewById(R.id.user);
        String username = (String) BmobUser.getObjectByKey(this, "username");
        User.setText("用户："+username);


    }
}
