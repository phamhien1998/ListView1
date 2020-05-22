package com.example.listview;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.List;

public class AdapterContact  extends BaseAdapter {
    List<Contact> contactList;

    public AdapterContact(List<Contact> contactList) {
        this.contactList = contactList;
    }

    @Override
    public int getCount() {
        return contactList.size();
    }

    @Override
    public Object getItem(int position) {
        return contactList.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        LayoutInflater inflater =LayoutInflater.from(parent.getContext());
        View view=inflater.inflate(R.layout.item_contact,parent, false);

        Contact contact = contactList.get(position);

        TextView txtName =view.findViewById(R.id.txtName);
        TextView txtNumber = view.findViewById(R.id.txtNumber);
        txtName.setText(contact.getName());
        txtNumber.setText(String.valueOf(contact.getNumber()));

        return view;
    }
}
