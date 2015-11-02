package com.iia.jgodar.qcm;

import android.app.Fragment;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.provider.MediaStore;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.iia.jgodar.qcm.entity.user;

import java.util.zip.Inflater;

/**
 * Created by jgodar on 09/10/2015.
 */
public class User_login_fragment extends Fragment implements View.OnClickListener {

    private  EditText loginUser;
    private  EditText password;

    @Nullable
    @Override


    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_user_login,container);
        this.password = (EditText)view.findViewById(R.id.text_default_prenom);
        this.loginUser = (EditText)view.findViewById(R.id.text_qcm);

        Button button = (Button)view.findViewById(R.id.button_login);
        button.setOnClickListener(this);

        return view;
    }

    public void onClick(View v) {

        switch (v.getId()){
            case R.id.button_login:

                Context context = this.getActivity();
                int duration = Toast.LENGTH_SHORT;

                String result =  String.format(User_login_fragment.this.getString(R.string.show_ident),this.loginUser.getText().toString(),this.password.getText().toString());

                Toast  toast =  Toast.makeText(context,result,duration);
                toast.show();

                user User = new user();
                User.setLogin(this.loginUser.getText().toString());

//                //appeler un nouveau contexte
//                Intent intent = new Intent(this.getActivity(),SecondActivity.class);
//
//                Bundle b = new Bundle();
//
//                //Passer des paramètres au bundle pour le prochaine activity
//                b.putSerializable(user.SERIAL,User);
//
//                intent.putExtras(b);
                Intent intent = new Intent(android.provider.MediaStore.ACTION_IMAGE_CAPTURE);


                this.startActivityForResult(intent, 10);

                break;
            default:
                break;
        }
    }

    @Override
    public void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);

       if (resultCode == getActivity().RESULT_OK){
            switch (requestCode){
                case 10:
                    Toast.makeText(this.getActivity(),"retour ok", Toast.LENGTH_LONG).show();

                    break;

                default:

                    break;
            }

        }


    }
}
