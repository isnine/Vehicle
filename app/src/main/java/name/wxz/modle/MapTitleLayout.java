package name.wxz.modle;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;

import com.example.vehicle_networking.R;

import name.wxz.ui.MainActivity;
import name.wxz.ui.MapActivity;
import name.wxz.ui.MapFind;
import name.wxz.ui.OilActivity;

public class MapTitleLayout extends LinearLayout {

	public MapTitleLayout(Context context, AttributeSet attrs) {
		super(context, attrs);
		LayoutInflater.from(context).inflate(R.layout.maptitle, this);
		Button titleBack = (Button) findViewById(R.id.title_back);
        Button titlefind=(Button)findViewById(R.id.button);
		titleBack.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View v) {
				((Activity) getContext()).finish();
			}
		});

		titlefind.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View v) {
//                Context context;
//			//	super(getcontext);
//                Intent intent=new Intent("name.wxz.ui.MapFind");
				Intent openMainActivity=new Intent("android.intent.action.MAPFIND");
				getContext().startActivity(openMainActivity);
			//	((MainActivity) activity).startActivity(intent);


/*                Intent intent = new Intent(MapActivity.this, MapFind.class);

                MapActivity.this.startActivity(intent);*/
            }

		});



	}



}
