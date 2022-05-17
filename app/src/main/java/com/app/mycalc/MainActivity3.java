package com.app.mycalc;

import androidx.appcompat.app.AppCompatActivity;

import android.app.PendingIntent;
import android.content.Intent;
import android.net.MailTo;
import android.net.Uri;
import android.os.Bundle;
import android.telephony.SmsManager;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity3 extends AppCompatActivity {
    TextView tv, tv1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);

//        tv = findViewById(R.id.textView5);
//        tv1 = findViewById(R.id.textView6);
//
//        Intent intent = getIntent();
//        String message = intent.getStringExtra("myMessage");
//        User u = (User) intent.getSerializableExtra("person");
//        tv.setText(message + " " + u.getName());
//        tv1.setText(u.getSalary().toString());

        //explicit intent
        //call intent
//        Intent intent2 = new Intent(Intent.ACTION_CALL, Uri.parse("tel:" + "9016612749"));
//        startActivity(intent2);

        //send sms pending intent
                PendingIntent sent = PendingIntent.getBroadcast(getBaseContext(), 0, new Intent("sent"), 0);
                PendingIntent deliver = PendingIntent.getBroadcast(getBaseContext(), 0, new Intent("delivered"), 0);

                SmsManager smsManager = SmsManager.getDefault();
                smsManager.sendTextMessage("+919586309151", null, "testsms", sent, deliver);

                Toast.makeText(getApplicationContext(), "Sent Message", Toast.LENGTH_SHORT).show();

        //send sms
//        Intent intent = new Intent(Intent.ACTION_SENDTO);
//        intent.setData(Uri.parse("smsto:9016612749"));
//        intent.putExtra("sms_body", "Hello");
//        startActivity(intent);



        //email intent
//        Intent email = new Intent(Intent.ACTION_SEND);
//        email.putExtra(Intent.EXTRA_EMAIL, new String[]{"jay.07.dedaniya@gmail.com"});
//        email.putExtra(Intent.EXTRA_SUBJECT, "This is subject Android Intent");
//        email.putExtra(Intent.EXTRA_TEXT, "No message will be delivered");
//
//        //need this to prompts email client only
//        email.setType("message/rfc822");
//
////        startActivity(Intent.createChooser(email, "Choose an Email client :"));
//        startActivity(Intent.createChooser(email, "Choose an Email client :", null));
    }
}