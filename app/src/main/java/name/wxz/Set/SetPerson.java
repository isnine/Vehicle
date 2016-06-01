package name.wxz.Set;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.RelativeLayout;

import com.example.vehicle_networking.R;

/**
 * Created by Nikcn on 2016/5/31.
 */
public class SetPerson extends Activity {
    private RelativeLayout name;
    private RelativeLayout sex;
    private RelativeLayout password;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.set_person);
       name=(RelativeLayout)findViewById(R.id.layout_nick);
        sex=(RelativeLayout)findViewById(R.id.layout_gender);
        password=(RelativeLayout)findViewById(R.id.layout_name);
        name.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent person=new Intent(SetPerson.this,SetName.class);
                startActivity(person);
            }
        });
        sex.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent sex=new Intent(SetPerson.this,SetSex.class);
                startActivity(sex);
            }
        });
        password.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent password=new Intent(SetPerson.this,SetPassword.class);
                startActivity(password);
            }
        });
    }
}
