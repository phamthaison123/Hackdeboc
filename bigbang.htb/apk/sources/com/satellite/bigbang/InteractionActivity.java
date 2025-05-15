package com.satellite.bigbang;

import android.os.Bundle;
import android.widget.Button;
import androidx.appcompat.app.AppCompatActivity;
import q0.a;

/* loaded from: /home/sonpt/Hackdeboc/bigbang.htb/apk/classes.dex */
public class InteractionActivity extends AppCompatActivity {

    /* renamed from: r, reason: collision with root package name */
    public static final /* synthetic */ int f1985r = 0;

    /* renamed from: n, reason: collision with root package name */
    public Button f1986n;

    /* renamed from: o, reason: collision with root package name */
    public Button f1987o;

    /* renamed from: p, reason: collision with root package name */
    public String f1988p;

    /* renamed from: q, reason: collision with root package name */
    public long f1989q;

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(2131492892);
        this.f1988p = getIntent().getStringExtra("access_token");
        this.f1989q = getIntent().getLongExtra("token_expiry_time", 0L);
        this.f1986n = (Button) findViewById(2131296345);
        this.f1987o = (Button) findViewById(2131296346);
        this.f1986n.setOnClickListener(new a(this, 0));
        this.f1987o.setOnClickListener(new a(this, 1));
    }
}
