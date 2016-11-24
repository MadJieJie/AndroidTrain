package com.example.androidtrain;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.Window;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends Activity {
	//点击组件添加包
	private EditText account_EditText_main,password_EditText_main;
	private Button enter_button_main;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		requestWindowFeature(Window.FEATURE_NO_TITLE);		//要求无标题
		setContentView(R.layout.activity_main);				//加载静态布局
		//实例化
		account_EditText_main = (EditText) findViewById(R.id.account_EditText_main);
		password_EditText_main = (EditText) findViewById(R.id.password_EditText_main);
		
		enter_button_main = (Button) findViewById(R.id.enter_button_main);
		enter_button_main.setOnClickListener(new OnClickListener() {		//点击事件监听
			//匿名内部
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				if(account_EditText_main.getText().toString().equals("123456") &&
						password_EditText_main.getText().toString().equals("123456"))
					Toast.makeText(getApplicationContext(), "登入成功", Toast.LENGTH_LONG).show();
				else
					Toast.makeText(getApplicationContext(), "登入失败", Toast.LENGTH_LONG).show();
			}
		});
		
		
	}
	
//	//实现点击事件接口
//	private class onClickListener implements OnClickListener {
//
//		@Override
//		public void onClick(View v) {
//			// TODO Auto-generated method stub
//			
//		}
//		
//	}
	

}
