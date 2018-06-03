package com.example.adityamalik.fireapp;

import android.app.Notification;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.support.v4.app.NotificationCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

public class MainActivity extends AppCompatActivity {
    private ImageView dustbin1,dustbin2,dustbin3,dustbin4;
    private TextView tv1,tv2,tv3,tv4;
    private FirebaseDatabase database;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        dustbin1 = (ImageView)findViewById(R.id.imageView1);
        dustbin2 = (ImageView)findViewById(R.id.imageView);
        dustbin3 = (ImageView)findViewById(R.id.imageView2);
        dustbin4 = (ImageView)findViewById(R.id.imageView3);
        tv1 = (TextView)findViewById(R.id.textView);
        tv2 = (TextView)findViewById(R.id.textView2);
        tv3 = (TextView)findViewById(R.id.textView3);
        tv4 = (TextView)findViewById(R.id.textView4);
        database = FirebaseDatabase.getInstance();
        DatabaseReference mRef = database.getReference();
        mRef.child("id").child("1").addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                int post = dataSnapshot.getValue(Integer.class);
                if (post >= 10 && post <= 70) {
                    int per = (post-10)*100/60;
                    if (per >= 80)
                        addNotification(R.drawable.icon_1, "1");
                    if (per >= 0 && per < 10)
                        setImage(R.drawable.dustbin, dustbin1);
                    else if (per >= 10 && per < 20)
                        setImage(R.drawable.dustbin10, dustbin1);
                    else if (per >= 20 && per < 30)
                        setImage(R.drawable.dustbin20, dustbin1);
                    else if (per >= 30 && per < 40)
                        setImage(R.drawable.dustbin30, dustbin1);
                    else if (per >= 40 && per < 50)
                        setImage(R.drawable.dustbin40, dustbin1);
                    else if (per >= 50 && per < 60)
                        setImage(R.drawable.dustbin50, dustbin1);
                    else if (per >= 60 && per < 70)
                        setImage(R.drawable.dustbin60, dustbin1);
                    else if (per >= 70 && per < 80)
                        setImage(R.drawable.dustbin70, dustbin1);
                    else if (per >= 80 && per < 90)
                        setImage(R.drawable.dustbin80, dustbin1);
                    else if (per >= 90 && per < 100)
                        setImage(R.drawable.dustbin90, dustbin1);
                    else
                        setImage(R.drawable.dustbin100, dustbin1);
                }
            }

            @Override
            public void onCancelled(DatabaseError databaseError) {

            }
        });


        mRef.child("id").child("2").addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                int post = dataSnapshot.getValue(Integer.class);
                if (post >= 10 && post <= 70) {
                    int per = (post-10)*100/60;
                    if (per >= 80)
                        addNotification(R.drawable.icon_2, "2");
                    if (per >= 0 && per < 10)
                        setImage(R.drawable.dustbin, dustbin2);
                    else if (per >= 10 && per < 20)
                        setImage(R.drawable.dustbin10, dustbin2);
                    else if (per >= 20 && per < 30)
                        setImage(R.drawable.dustbin20, dustbin2);
                    else if (per >= 30 && per < 40)
                        setImage(R.drawable.dustbin30, dustbin2);
                    else if (per >= 40 && per < 50)
                        setImage(R.drawable.dustbin40, dustbin2);
                    else if (per >= 50 && per < 60)
                        setImage(R.drawable.dustbin50, dustbin2);
                    else if (per >= 60 && per < 70)
                        setImage(R.drawable.dustbin60, dustbin2);
                    else if (per >= 70 && per < 80)
                        setImage(R.drawable.dustbin70, dustbin2);
                    else if (per >= 80 && per < 90)
                        setImage(R.drawable.dustbin80, dustbin2);
                    else if (per >= 90 && per < 100)
                        setImage(R.drawable.dustbin90, dustbin2);
                    else
                        setImage(R.drawable.dustbin100, dustbin2);
                }
            }

            @Override
            public void onCancelled(DatabaseError databaseError) {

            }
        });


        mRef.child("id").child("3").addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                int post = dataSnapshot.getValue(Integer.class);
                if (post >= 10 && post <= 70) {
                    int per = (post-10)*100/60;
                    if (per >= 80)
                        addNotification(R.drawable.icon_3, "3");
                    if (per >= 0 && per < 10)
                        setImage(R.drawable.dustbin, dustbin3);
                    else if (per >= 10 && per < 20)
                        setImage(R.drawable.dustbin10, dustbin3);
                    else if (per >= 20 && per < 30)
                        setImage(R.drawable.dustbin20, dustbin3);
                    else if (per >= 30 && per < 40)
                        setImage(R.drawable.dustbin30, dustbin3);
                    else if (per >= 40 && per < 50)
                        setImage(R.drawable.dustbin40, dustbin3);
                    else if (per >= 50 && per < 60)
                        setImage(R.drawable.dustbin50, dustbin3);
                    else if (per >= 60 && per < 70)
                        setImage(R.drawable.dustbin60, dustbin3);
                    else if (per >= 70 && per < 80)
                        setImage(R.drawable.dustbin70, dustbin3);
                    else if (per >= 80 && per < 90)
                        setImage(R.drawable.dustbin80, dustbin3);
                    else if (per >= 90 && per < 100)
                        setImage(R.drawable.dustbin90, dustbin3);
                    else
                        setImage(R.drawable.dustbin100, dustbin3);
                }
            }

            @Override
            public void onCancelled(DatabaseError databaseError) {

            }
        });


        mRef.child("id").child("4").addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                int post = dataSnapshot.getValue(Integer.class);
                if (post >= 10 && post <= 70) {
                    int per = (post-10)*100/60;
                    if (per >= 80)
                        addNotification(R.drawable.icon_4, "4");
                    if (per >= 0 && per < 10)
                        setImage(R.drawable.dustbin, dustbin4);
                    else if (per >= 10 && per < 20)
                        setImage(R.drawable.dustbin10, dustbin4);
                    else if (per >= 20 && per < 30)
                        setImage(R.drawable.dustbin20, dustbin4);
                    else if (per >= 30 && per < 40)
                        setImage(R.drawable.dustbin30, dustbin4);
                    else if (per >= 40 && per < 50)
                        setImage(R.drawable.dustbin40, dustbin4);
                    else if (per >= 50 && per < 60)
                        setImage(R.drawable.dustbin50, dustbin4);
                    else if (per >= 60 && per < 70)
                        setImage(R.drawable.dustbin60, dustbin4);
                    else if (per >= 70 && per < 80)
                        setImage(R.drawable.dustbin70, dustbin4);
                    else if (per >= 80 && per < 90)
                        setImage(R.drawable.dustbin80, dustbin4);
                    else if (per >= 90 && per < 100)
                        setImage(R.drawable.dustbin90, dustbin4);
                    else
                        setImage(R.drawable.dustbin100, dustbin4);
                }
            }

            @Override
            public void onCancelled(DatabaseError databaseError) {

            }
        });
    }
    private void addNotification(int image,String number) {
        Intent notificationIntent = new Intent(this, MainActivity.class);
        PendingIntent contentIntent = PendingIntent.getActivity(this, 0, notificationIntent,
                PendingIntent.FLAG_UPDATE_CURRENT);
        NotificationCompat.InboxStyle inboxStyle = new NotificationCompat.InboxStyle();

        NotificationCompat.Builder builder =
                new NotificationCompat.Builder(this)
                        .setSmallIcon(image)
                        .setContentTitle("Dustbin Nearly Full")
                        .setContentText("Dustbin " + number + " over 80%")
                        .setPriority(NotificationCompat.PRIORITY_HIGH)
                        .setCategory(Notification.CATEGORY_MESSAGE)
                        .setAutoCancel(true)
                        .setDefaults(Notification.DEFAULT_ALL)
                        ;
        inboxStyle.setBigContentTitle("Big Title Details:");

        builder.setContentIntent(contentIntent);

        // Add as notification
        NotificationManager manager = (NotificationManager) getSystemService(Context.NOTIFICATION_SERVICE);
        manager.notify(0, builder.build());
    }
    public void setImage(int id, ImageView src){
        src.setImageResource(id);
    }
}
