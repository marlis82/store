package com.google.firebase.codelab.friendlychat.activity;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.TextView;

import com.firebase.ui.database.FirebaseListAdapter;
import com.google.firebase.codelab.friendlychat.FriendlyMessage;
import com.google.firebase.codelab.friendlychat.MainActivity;
import com.google.firebase.codelab.friendlychat.R;
import com.google.firebase.codelab.friendlychat.model.Tovar;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.Query;
import com.google.firebase.database.ValueEventListener;

import java.util.ArrayList;

public class OrderListActivity extends AppCompatActivity {
    private static final String TAG = "LOG";
    private Tovar tovar;
    private DatabaseReference mDatabase;
    private ListView listView;

    private FirebaseDatabase database = FirebaseDatabase.getInstance();
    private DatabaseReference mDatabaseReference = database.getReference();
// ...


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_order_list);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        final ListView personsView = (ListView) findViewById(R.id.tovarView);
//        DatabaseReference ref = FirebaseDatabase.getInstance().getReference();
//        FirebaseListAdapter<FriendlyMessage> mAdapter =
//                new FirebaseListAdapter<FriendlyMessage>(this, FriendlyMessage.class, R.layout.content_order_list, ref) {
//            @Override
//            protected void populateView(View v, FriendlyMessage model, int position) {
//            }
//
//        };
//        personsView.setAdapter(mAdapter);


        DatabaseReference mRef = null;
        ListAdapter adapter = new FirebaseListAdapter<FriendlyMessage>(this, FriendlyMessage.class, android.R.layout.activity_list_item, mRef)
        {
            @Override
            protected void populateView(View v, FriendlyMessage model, int position) {
                ((TextView)personsView.findViewById(android.R.id.text1)).setText(model.getName());
                ((TextView)personsView.findViewById(android.R.id.text2)).setText(model.getText());
            }
        };
        personsView.setAdapter(adapter);



    }

}
