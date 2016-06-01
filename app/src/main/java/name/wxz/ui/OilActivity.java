package name.wxz.ui;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.example.vehicle_networking.R;

import name.wxz.Oil.OilAddVehcle;

/**
 * Created by Nikcn on 2016/5/10.
 */
public class OilActivity extends Activity {
    private TextView User;
    private RelativeLayout AddVehcle;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.activity_oil);

        AddVehcle=(RelativeLayout)findViewById(R.id.layout_info);
AddVehcle.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View v) {
        Intent add=new Intent(OilActivity.this,OilAddVehcle.class);
        startActivity(add);
    }
});
    }
}
