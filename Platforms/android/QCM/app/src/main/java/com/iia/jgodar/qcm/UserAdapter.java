package com.iia.jgodar.qcm;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import com.iia.jgodar.qcm.entity.user;

import java.util.ArrayList;

/**
 * Created by jgodar on 09/10/2015.
 */
public class UserAdapter extends BaseAdapter {


    private Context context;
    private ArrayList<user> users ;

    public UserAdapter(Context context, ArrayList<user> users) {
        this.context = context;
        this.users = users;
    }

    @Override
    public int getCount() {
        return this.users.size();
    }

    @Override
    public Object getItem(int position) {
        this.users.get(position);
        return users.get(position);
    }

    @Override
    public long getItemId(int position) {
        return this.users.indexOf(this.getItem(position));
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        if (convertView == null){
            LayoutInflater inflater = (LayoutInflater) this.context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            convertView = inflater.inflate(R.layout.row_user, parent,false);
    }

        user userP = this.users.get(position);
        TextView tvLogin = (TextView) convertView.findViewById(R.id.text_login);

        tvLogin.setText(userP.getLogin());

        return convertView;
    }
}
