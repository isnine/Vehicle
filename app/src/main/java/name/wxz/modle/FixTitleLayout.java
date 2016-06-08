package name.wxz.modle;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;

import com.example.vehicle_networking.R;

public class FixTitleLayout extends LinearLayout {

    public FixTitleLayout(Context context, AttributeSet attrs) {
        super(context, attrs);
        LayoutInflater.from(context).inflate(R.layout.fixtitle, this);
        Button titleAdd= (Button) findViewById(R.id.button);
        Button titleBack = (Button) findViewById(R.id.title_back);

        titleBack.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
               ((Activity) getContext()).finish();

            }
        });

        titleAdd.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent openMainActivity=new Intent("android.intent.action.OILFIND");
                getContext().startActivity(openMainActivity);
            }
        });
    }

}
