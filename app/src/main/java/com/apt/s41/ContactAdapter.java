package com.apt.s41;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import org.w3c.dom.Text;

import java.util.List;

public class ContactAdapter extends BaseAdapter {

    private Activity activity;
    private List<User> listUser;

    public ContactAdapter(Activity activity, List<User> listUser) {
        this.activity = activity;
        this.listUser = listUser;
    }

    @Override
    public int getCount() {
        return listUser.size();
    }

    @Override
    public Object getItem(int i) {
        return null;
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        LayoutInflater layoutInflater = activity.getLayoutInflater();
        view = layoutInflater.inflate(R.layout.item_contact, viewGroup, false);
        ImageView ivAvatar = view.findViewById(R.id.ivAvatar);
        TextView tvName = view.findViewById(R.id.tvName);
        TextView tvPhone = view.findViewById(R.id.tvPhone);

        User model = listUser.get(i);
        tvName.setText(model.getName());
        tvPhone.setText(model.getPhone());
        ivAvatar.setImageResource(model.getAvatar());

        return view;
    }
}
