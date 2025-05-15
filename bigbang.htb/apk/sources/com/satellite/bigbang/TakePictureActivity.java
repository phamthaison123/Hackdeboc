package com.satellite.bigbang;

import android.R;
import android.os.Bundle;
import android.os.Process;
import android.text.TextUtils;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.SpinnerAdapter;
import androidx.appcompat.app.AppCompatActivity;
import e.ViewOnClickListenerC0096b;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import u.AbstractC0225c;
import w.e;

/* loaded from: /home/sonpt/Hackdeboc/bigbang.htb/apk/classes.dex */
public class TakePictureActivity extends AppCompatActivity {

    /* renamed from: n, reason: collision with root package name */
    public Spinner f2001n;

    /* renamed from: o, reason: collision with root package name */
    public Button f2002o;

    /* renamed from: p, reason: collision with root package name */
    public String f2003p;

    /* renamed from: q, reason: collision with root package name */
    public HashMap f2004q;

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(2131492895);
        this.f2001n = (Spinner) findViewById(2131296472);
        this.f2002o = (Button) findViewById(2131296629);
        HashMap hashMap = new HashMap();
        this.f2004q = hashMap;
        hashMap.put("Branchal Road", "1");
        this.f2004q.put("Uist Way", "2");
        this.f2004q.put("Crop field", "3");
        this.f2004q.put("Clearing", "4");
        this.f2004q.put("Lake", "5");
        this.f2004q.put("Kyle Drive", "6");
        this.f2004q.put("Northwood Path", "7");
        ArrayAdapter arrayAdapter = new ArrayAdapter(this, R.layout.simple_spinner_item, new ArrayList(this.f2004q.keySet()));
        arrayAdapter.setDropDownViewResource(R.layout.simple_spinner_dropdown_item);
        this.f2001n.setAdapter((SpinnerAdapter) arrayAdapter);
        this.f2003p = getIntent().getStringExtra("access_token");
        Object obj = e.f3731a;
        if (checkPermission("android.permission.WRITE_EXTERNAL_STORAGE", Process.myPid(), Process.myUid()) != 0) {
            String[] strArr = {"android.permission.WRITE_EXTERNAL_STORAGE"};
            int i2 = AbstractC0225c.f3719b;
            if (TextUtils.isEmpty(strArr[0])) {
                throw new IllegalArgumentException("Permission request for permissions " + Arrays.toString(strArr) + " must not contain null or empty values");
            }
            requestPermissions(strArr, 1);
        }
        this.f2002o.setOnClickListener(new ViewOnClickListenerC0096b(8, this));
    }
}
