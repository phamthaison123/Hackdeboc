package i;

import android.graphics.Typeface;
import android.widget.TextView;

/* loaded from: /home/sonpt/Hackdeboc/bigbang.htb/apk/classes.dex */
public final class V implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ TextView f2726a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Typeface f2727b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f2728c;

    public V(TextView textView, Typeface typeface, int i2) {
        this.f2726a = textView;
        this.f2727b = typeface;
        this.f2728c = i2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f2726a.setTypeface(this.f2727b, this.f2728c);
    }
}
