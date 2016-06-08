package name.wxz.ui;

import android.app.Activity;
import android.os.Bundle;
import android.view.Window;
import android.widget.TextView;

import com.example.vehicle_networking.R;

import cn.bmob.v3.BmobUser;

/**
 * Created by Nikcn on 2016/6/1.
 */
public class FixActivity extends Activity{
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.activity_fix);



        TextView number1;
        TextView oilclass1;
        TextView vehcleclass1;
        number1=(TextView)findViewById(R.id.number1);
        oilclass1=(TextView)findViewById(R.id.oilclass1);
        vehcleclass1=(TextView)findViewById(R.id.vehcleclass1);

        TextView number2;
        TextView oilclass2;
        TextView vehcleclass2;
        number2=(TextView)findViewById(R.id.number2);
        oilclass2=(TextView)findViewById(R.id.oilclass2);
        vehcleclass2=(TextView)findViewById(R.id.vehcleclass2);

        TextView number3;
        TextView oilclass3;
        TextView vehcleclass3;
        number3=(TextView)findViewById(R.id.number3);
        oilclass3=(TextView)findViewById(R.id.oilclass3);
        vehcleclass3=(TextView)findViewById(R.id.vehcleclass3);

        String vehclenumbertext1 = (String) BmobUser.getObjectByKey(this, "vehclenumber1");
        String vehcleclasstext1 = (String) BmobUser.getObjectByKey(this, "vehcleclass1");
        String oilclasstext1 = (String) BmobUser.getObjectByKey(this, "oilclass1");

        String vehclenumbertext2 = (String) BmobUser.getObjectByKey(this, "vehclenumber2");
        String vehcleclasstext2 = (String) BmobUser.getObjectByKey(this, "vehcleclass2");
        String oilclasstext2 = (String) BmobUser.getObjectByKey(this, "oilclass2");

        String vehclenumbertext3 = (String) BmobUser.getObjectByKey(this, "vehclenumber3");
        String vehcleclasstext3 = (String) BmobUser.getObjectByKey(this, "vehcleclass3");
        String oilclasstext3 = (String) BmobUser.getObjectByKey(this, "oilclass3");

        if(vehclenumbertext1==null){
            number1.setText("车牌：未设置");
        }
        else
        {
            number1.setText("车牌："+vehclenumbertext1);
        }


        if(vehcleclasstext1==null){
            vehcleclass1.setText("车型：未设置");
        }
        else{
            vehcleclass1.setText("车型："+vehcleclasstext1);
        }
        if (oilclasstext1== null) {
            oilclass1.setText("油型：未设置");
        }
        else{
            oilclass1.setText("油型："+oilclasstext1);
        }

        if(vehclenumbertext2==null){
            number2.setText("车牌：未设置");
        }
        else
        {
            number2.setText("车牌："+vehclenumbertext2);
        }


        if(vehcleclasstext2==null){
            vehcleclass2.setText("车型：未设置");
        }
        else{
            vehcleclass2.setText("车型："+vehcleclasstext2);
        }
        if (oilclasstext2== null) {
            oilclass2.setText("油型：未设置");
        }
        else{
            oilclass2.setText("油型："+oilclasstext2);
        }

        if(vehclenumbertext3==null){
            number3.setText("车牌：未设置");
        }
        else
        {
            number3.setText("车牌："+vehclenumbertext3);
        }


        if(vehcleclasstext3==null){
            vehcleclass3.setText("车型：未设置");
        }
        else{
            vehcleclass3.setText("车型："+vehcleclasstext3);
        }
        if (oilclasstext3== null) {
            oilclass3.setText("油型：未设置");
        }
        else{
            oilclass3.setText("油型："+oilclasstext3);
        }

    }
}
