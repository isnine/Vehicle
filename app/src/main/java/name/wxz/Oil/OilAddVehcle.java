package name.wxz.Oil;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
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
public class OilAddVehcle extends Activity {
    EditText edit_number;
    EditText edit_vehcleclass;
    EditText edit_oilclass;
    String vehcles;
    String number;
    String vehcleclass;
    String oilclass;
    Button chat;

    private Context mContext = this;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.oil_addvehicle);

        edit_number = (EditText) findViewById(R.id.edit_number);
        edit_vehcleclass = (EditText) findViewById(R.id.edit_vehcleclass);
        edit_oilclass = (EditText) findViewById(R.id.edit_oilclass);

        chat=(Button)findViewById(R.id.btn_chat);

       chat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                add();



            }
        });
    }

    public void add(){
        String vehcle1 = (String) BmobUser.getObjectByKey(mContext, "vehclenumber1");
        String vehcle2 = (String) BmobUser.getObjectByKey(mContext, "vehclenumber2");
        String vehcle3 = (String) BmobUser.getObjectByKey(mContext, "vehclenumber3");

        if(vehcle1==null){
            number=edit_number.getText().toString();
            vehcleclass=edit_vehcleclass.getText().toString();
            oilclass=edit_oilclass.getText().toString();
            if (TextUtils.isEmpty(number)) {
                toast("车牌不能为空");
                return;

            }
            if (TextUtils.isEmpty(vehcleclass)) {
                toast("车辆类型不能为空");
                return;
            }
            if (TextUtils.isEmpty(oilclass)) {
                toast("加油类型不能为空");
                return;
            }
            Person newUser = new Person();
            newUser.setVehcleNumber1(number);
            newUser.setVehcleclass1(vehcleclass);
            newUser.setOilclass1(oilclass);

            BmobUser bmobUser = BmobUser.getCurrentUser(mContext);
            newUser.update(mContext,bmobUser.getObjectId(),new UpdateListener() {
                @Override
                public void onSuccess() {
                    // TODO Auto-generated method stub
                    toast("车辆添加成功:");
                }
                @Override
                public void onFailure(int code, String msg) {
                    // TODO Auto-generated method stub
                    toast("车辆添加失败:" + msg);
                }
            });
        }
        else if(vehcle1!=null&&vehcle2==null){
            number=edit_number.getText().toString();
            vehcleclass=edit_vehcleclass.getText().toString();
            oilclass=edit_oilclass.getText().toString();
            if (TextUtils.isEmpty(number)) {
                toast("车牌不能为空");
                return;
            }
            if (TextUtils.isEmpty(vehcleclass)) {
                toast("车辆类型不能为空");
                return;
            }
            if (TextUtils.isEmpty(oilclass)) {
                toast("加油类型不能为空");
                return;
            }
            Person newUser = new Person();
            newUser.setVehcleNumber2(number);
            newUser.setVehcleclass2(vehcleclass);
            newUser.setOilclass2(oilclass);

            BmobUser bmobUser = BmobUser.getCurrentUser(mContext);
            newUser.update(mContext,bmobUser.getObjectId(),new UpdateListener() {
                @Override
                public void onSuccess() {
                    // TODO Auto-generated method stub
                    toast("车辆添加成功:");
                }
                @Override
                public void onFailure(int code, String msg) {
                    // TODO Auto-generated method stub
                    toast("车辆添加失败:" + msg);
                }
            });
        }
        else if(vehcle1!=null &&vehcle2!=null&&vehcle3==null){
            number=edit_number.getText().toString();
            vehcleclass=edit_vehcleclass.getText().toString();
            oilclass=edit_oilclass.getText().toString();
            if (TextUtils.isEmpty(number)) {
                toast("车牌不能为空");
                return;
            }
            if (TextUtils.isEmpty(vehcleclass)) {
                toast("车辆类型不能为空");
                return;
            }
            if (TextUtils.isEmpty(oilclass)) {
                toast("加油类型不能为空");
                return;
            }
            Person newUser = new Person();
            newUser.setVehcleNumber3(number);
            newUser.setVehcleclass3(vehcleclass);
            newUser.setOilclass3(oilclass);

            BmobUser bmobUser = BmobUser.getCurrentUser(mContext);
            newUser.update(mContext,bmobUser.getObjectId(),new UpdateListener() {
                @Override
                public void onSuccess() {
                    // TODO Auto-generated method stub
                    toast("车辆添加成功:");
                }
                @Override
                public void onFailure(int code, String msg) {
                    // TODO Auto-generated method stub
                    toast("车辆添加失败:" + msg);
                }
            });
        }
        else if(vehcle1!=null &&vehcle2!=null&&vehcle3!=null){
            number=edit_number.getText().toString();
            vehcleclass=edit_vehcleclass.getText().toString();
            oilclass=edit_oilclass.getText().toString();
            if (TextUtils.isEmpty(number)) {
                toast("车牌不能为空");
                return;
            }
            if (TextUtils.isEmpty(vehcleclass)) {
                toast("车辆类型不能为空");
                return;
            }
            if (TextUtils.isEmpty(oilclass)) {
                toast("加油类型不能为空");
                return;
            }
            toast("已达到车辆最大数目");
        }
    }
    public void toast(String toast) {
        Toast.makeText(this, toast, Toast.LENGTH_SHORT).show();
    }

}
