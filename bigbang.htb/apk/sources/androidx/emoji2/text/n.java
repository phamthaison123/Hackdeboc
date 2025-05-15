package androidx.emoji2.text;

import android.text.TextPaint;

/* loaded from: /home/sonpt/Hackdeboc/bigbang.htb/apk/classes.dex */
public final class n implements f {

    /* renamed from: b, reason: collision with root package name */
    public static final ThreadLocal f1110b = new ThreadLocal();

    /* renamed from: a, reason: collision with root package name */
    public final TextPaint f1111a;

    public n() {
        TextPaint textPaint = new TextPaint();
        this.f1111a = textPaint;
        textPaint.setTextSize(10.0f);
    }
}
