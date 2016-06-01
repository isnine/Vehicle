package name.wxz.Set;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.example.vehicle_networking.R;

import cn.bmob.v3.BmobUser;
import cn.bmob.v3.listener.UpdateListener;
import name.wxz.modle.Person;

/**
 * Created by Nikcn on 2016/6/1.
 */
public class SetSex extends Activity {
    EditText edit_name;
    EditText edit_sex;
    String name;
    String sex;
    Button chat;

    private Context mContext = this;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.set_sex);

        edit_sex = (EditText) findViewById(R.id.edit_sex);
        chat=(Button)findViewById(R.id.btn_chat);

        chat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                sex=edit_sex.getText().toString();
                Person newUser = new Person();

                newUser.setSex(sex);
                BmobUser bmobUser = BmobUser.getCurrentUser(mContext);
                newUser.update(mContext,bmobUser.getObjectId(),new UpdateListener() {
                    @Override
                    public void onSuccess() {
                        // TODO Auto-generated method stub
                        toast("性别修改成功:");
                    }
                    @Override
                    public void onFailure(int code, String msg) {
                        // TODO Auto-generated method stub
                        toast("性别修改失败:" + msg);
                    }
                });
            }
        });
    }
    public void toast(String toast) {
        Toast.makeText(this, toast, Toast.LENGTH_SHORT).show();
    }

}
