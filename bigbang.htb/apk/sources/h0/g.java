package h0;

import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextDirectionHeuristics;
import android.text.TextPaint;
import android.text.TextUtils;

/* loaded from: /home/sonpt/Hackdeboc/bigbang.htb/apk/classes.dex */
public final class g {

    /* renamed from: a, reason: collision with root package name */
    public CharSequence f2585a;

    /* renamed from: b, reason: collision with root package name */
    public final TextPaint f2586b;

    /* renamed from: c, reason: collision with root package name */
    public final int f2587c;

    /* renamed from: d, reason: collision with root package name */
    public int f2588d;

    /* renamed from: k, reason: collision with root package name */
    public boolean f2595k;

    /* renamed from: e, reason: collision with root package name */
    public Layout.Alignment f2589e = Layout.Alignment.ALIGN_NORMAL;

    /* renamed from: f, reason: collision with root package name */
    public int f2590f = Integer.MAX_VALUE;

    /* renamed from: g, reason: collision with root package name */
    public float f2591g = 0.0f;

    /* renamed from: h, reason: collision with root package name */
    public float f2592h = 1.0f;

    /* renamed from: i, reason: collision with root package name */
    public int f2593i = 1;

    /* renamed from: j, reason: collision with root package name */
    public boolean f2594j = true;

    /* renamed from: l, reason: collision with root package name */
    public TextUtils.TruncateAt f2596l = null;

    public g(CharSequence charSequence, TextPaint textPaint, int i2) {
        this.f2585a = charSequence;
        this.f2586b = textPaint;
        this.f2587c = i2;
        this.f2588d = charSequence.length();
    }

    public final StaticLayout a() {
        if (this.f2585a == null) {
            this.f2585a = "";
        }
        int max = Math.max(0, this.f2587c);
        CharSequence charSequence = this.f2585a;
        int i2 = this.f2590f;
        TextPaint textPaint = this.f2586b;
        if (i2 == 1) {
            charSequence = TextUtils.ellipsize(charSequence, textPaint, max, this.f2596l);
        }
        int min = Math.min(charSequence.length(), this.f2588d);
        this.f2588d = min;
        if (this.f2595k && this.f2590f == 1) {
            this.f2589e = Layout.Alignment.ALIGN_OPPOSITE;
        }
        StaticLayout.Builder obtain = StaticLayout.Builder.obtain(charSequence, 0, min, textPaint, max);
        obtain.setAlignment(this.f2589e);
        obtain.setIncludePad(this.f2594j);
        obtain.setTextDirection(this.f2595k ? TextDirectionHeuristics.RTL : TextDirectionHeuristics.LTR);
        TextUtils.TruncateAt truncateAt = this.f2596l;
        if (truncateAt != null) {
            obtain.setEllipsize(truncateAt);
        }
        obtain.setMaxLines(this.f2590f);
        float f2 = this.f2591g;
        if (f2 != 0.0f || this.f2592h != 1.0f) {
            obtain.setLineSpacing(f2, this.f2592h);
        }
        if (this.f2590f > 1) {
            obtain.setHyphenationFrequency(this.f2593i);
        }
        return obtain.build();
    }
}
