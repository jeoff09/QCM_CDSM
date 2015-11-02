package com.iia.jgodar.qcm;

import android.app.ListFragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import android.widget.Toast;

import com.iia.jgodar.qcm.entity.user;

import java.util.ArrayList;

/**
 * Created by jgodar on 09/10/2015.
 */
public class User_list_fragment extends ListFragment {


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_user_list,container);
    }

    @Override
    public void onActivityCreated(Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);

        ArrayList<user> users = new ArrayList<>();

        for (int i = 0; i < 10 ; i++) {
            user userP = new user();
            userP.setLogin("user" + i);
            users.add(userP);

        }

        UserAdapter adapter = new UserAdapter(this.getActivity(),users);

        this.setListAdapter(adapter);
    }

    @Override
    public void onListItemClick(ListView l, View v, int position, long id) {

        user user = (user)l.getItemAtPosition(position);
        Toast.makeText(this.getActivity(),user.getLogin(),Toast.LENGTH_SHORT).show();




    }
}
