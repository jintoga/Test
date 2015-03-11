package com.example.kg1;

import android.app.Activity;
import android.graphics.Paint;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class MainActivity extends Activity {

	Button btnRotateX_P, btnRotateY_P, btnRotateZ_P, btnRotateX_M,
			btnRotateY_M, btnRotateZ_M, btnScaleP, btnScaleM, btnX_P, btnX_M,
			btnY_P, btnY_M, btnZ_P, btnZ_M, btnJump_P, btnJump_M;

	MyDrawView drawView;

	Paint paint;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);

		setContentView(R.layout.activity_main);
		getID();
		setEvents();
		drawView = (MyDrawView) findViewById(R.id.drawLayout);

	}

	private void setEvents() {
		// TODO Auto-generated method stub
		btnX_M.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				drawView.doTransX_M();
			}
		});

		btnX_P.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				drawView.doTransX_P();
			}
		});

		btnY_M.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				drawView.doTransY_M();
			}
		});

		btnY_P.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				drawView.doTransY_P();
			}
		});

		btnZ_M.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				drawView.doTransZ_M();
			}
		});

		btnZ_P.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				drawView.doTransZ_P();
			}
		});

		btnRotateX_P.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				drawView.doRotX_P();
			}
		});

		btnRotateX_M.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				drawView.doRotX_M();
			}
		});

		btnRotateY_P.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				drawView.doRotY_P();
			}
		});

		btnRotateY_M.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				drawView.doRotY_M();
			}
		});

		btnRotateZ_P.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				drawView.doRotZ_P();
			}
		});

		btnRotateZ_M.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				drawView.doRotZ_M();
			}
		});

		btnScaleP.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				drawView.doScaleP();

			}
		});

		btnScaleM.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				drawView.doScaleM();
			}
		});

		btnJump_P.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub

				drawView.doTaskP();

			}
		});

		btnJump_M.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				drawView.doTaskM();
			}
		});
		
	}

	private void getID() {
		// TODO Auto-generated method stub
		btnRotateX_P = (Button) findViewById(R.id.btnRotateX_P);
		btnRotateY_P = (Button) findViewById(R.id.btnRotateY_P);
		btnRotateZ_P = (Button) findViewById(R.id.btnRotateZ_P);
		btnRotateX_M = (Button) findViewById(R.id.btnRotateX_M);
		btnRotateY_M = (Button) findViewById(R.id.btnRotateY_M);
		btnRotateZ_M = (Button) findViewById(R.id.btnRotateZ_M);

		btnScaleM = (Button) findViewById(R.id.btnScaleM);
		btnScaleP = (Button) findViewById(R.id.btnScaleP);

		btnX_M = (Button) findViewById(R.id.btnX_M);
		btnX_P = (Button) findViewById(R.id.btnX_P);

		btnZ_M = (Button) findViewById(R.id.btnZ_M);
		btnZ_P = (Button) findViewById(R.id.btnZ_P);

		btnY_M = (Button) findViewById(R.id.btnY_M);
		btnY_P = (Button) findViewById(R.id.btnY_P);

		btnJump_P = (Button) findViewById(R.id.btnJumpP);
		btnJump_M = (Button) findViewById(R.id.btnJumpM);
	}

}
