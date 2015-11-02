package com.iia.jgodar.qcm;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.widget.Toast;

import com.iia.jgodar.qcm.entity.user;

/**
 * Created by jgodar on 08/10/2015.
 */
public class SecondActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        this.setContentView(R.layout.activity_second_qcm);

        user titi = ((user) this.getIntent().getExtras().getSerializable(user.SERIAL));

        int duration = Toast.LENGTH_SHORT;
        Context context = SecondActivity.this;

        Toast toast = Toast.makeText(context, titi.getLogin(), duration);
        toast.show();
    }
}
