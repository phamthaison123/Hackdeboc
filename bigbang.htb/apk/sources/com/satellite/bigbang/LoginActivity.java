package com.satellite.bigbang;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import androidx.appcompat.app.AppCompatActivity;
import e.ViewOnClickListenerC0096b;

/* loaded from: /home/sonpt/Hackdeboc/bigbang.htb/apk/classes.dex */
public class LoginActivity extends AppCompatActivity {

    /* renamed from: n, reason: collision with root package name */
    public Button f1990n;

    /* renamed from: o, reason: collision with root package name */
    public EditText f1991o;

    /* renamed from: p, reason: collision with root package name */
    public EditText f1992p;

    /* renamed from: q, reason: collision with root package name */
    public String f1993q;

    /* renamed from: r, reason: collision with root package name */
    public long f1994r;

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(2131492893);
        this.f1990n = (Button) findViewById(2131296473);
        this.f1991o = (EditText) findViewById(2131296409);
        this.f1992p = (EditText) findViewById(2131296408);
        this.f1990n.setOnClickListener(new ViewOnClickListenerC0096b(6, this));
    }
}
