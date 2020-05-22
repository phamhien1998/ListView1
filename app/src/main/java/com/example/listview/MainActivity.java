package com.example.listview;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    Button btnAdd;
    ListView lvContact;
    Contact contact1, contact2, contact3, contact4, contact5, contact6, contact7, contact8, contact9, contact10;
    AdapterContact adapterContact;
    List<Contact> contactList;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lvContact = findViewById(R.id.lvContact);
        contactList = new ArrayList<>();

        contact1 = new Contact("Mr A", 123456789);
        contact2 = new Contact("Mr B", 646464646);
        contact3 = new Contact("Mr C", 646464646);
        contact4 = new Contact("Mr D", 646464646);
        contact5 = new Contact("Mr E", 646464646);
        contact6 = new Contact("Mr F", 646464646);
        contact7 = new Contact("Mr G", 646464646);
        contact8 = new Contact("Mr H", 646464646);
        contact9 = new Contact("Mr I", 646464646);
        contact10 = new Contact("Mr K", 646464646);

        contactList.add(contact1);
        contactList.add(contact2);
        contactList.add(contact3);
        contactList.add(contact4);
        contactList.add(contact5);
        contactList.add(contact6);
        contactList.add(contact7);
        contactList.add(contact8);
        contactList.add(contact9);
        contactList.add(contact10);

        adapterContact = new AdapterContact(contactList);
        lvContact.setAdapter(adapterContact);

        btnAdd = findViewById(R.id.btnAdd);
        btnAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getBaseContext(), AddContact.class);
                startActivity(intent);
            }
        });
    }
}
