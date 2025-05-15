package com.satellite.bigbang;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import androidx.appcompat.app.AppCompatActivity;
import e.ViewOnClickListenerC0096b;

/* loaded from: /home/sonpt/Hackdeboc/bigbang.htb/apk/classes.dex */
public class MoveCommandActivity extends AppCompatActivity {

    /* renamed from: s, reason: collision with root package name */
    public static final /* synthetic */ int f1995s = 0;

    /* renamed from: n, reason: collision with root package name */
    public EditText f1996n;

    /* renamed from: o, reason: collision with root package name */
    public EditText f1997o;

    /* renamed from: p, reason: collision with root package name */
    public EditText f1998p;

    /* renamed from: q, reason: collision with root package name */
    public String f1999q;

    /* renamed from: r, reason: collision with root package name */
    public long f2000r;

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(2131492894);
        this.f1999q = getIntent().getStringExtra("access_token");
        this.f2000r = getIntent().getLongExtra("token_expiry_time", 0L);
        this.f1996n = (EditText) findViewById(2131296410);
        this.f1997o = (EditText) findViewById(2131296411);
        this.f1998p = (EditText) findViewById(2131296412);
        ((Button) findViewById(2131296596)).setOnClickListener(new ViewOnClickListenerC0096b(7, this));
    }
}
