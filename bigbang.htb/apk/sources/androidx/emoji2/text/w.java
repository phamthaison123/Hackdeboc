package androidx.emoji2.text;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Typeface;
import android.text.style.ReplacementSpan;
import g.C0107g;

/* loaded from: /home/sonpt/Hackdeboc/bigbang.htb/apk/classes.dex */
public final class w extends ReplacementSpan {

    /* renamed from: b, reason: collision with root package name */
    public final m f1140b;

    /* renamed from: a, reason: collision with root package name */
    public final Paint.FontMetricsInt f1139a = new Paint.FontMetricsInt();

    /* renamed from: c, reason: collision with root package name */
    public float f1141c = 1.0f;

    public w(m mVar) {
        B.a.o(mVar, "metadata cannot be null");
        this.f1140b = mVar;
    }

    @Override // android.text.style.ReplacementSpan
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final int getSize(Paint paint, CharSequence charSequence, int i2, int i3, Paint.FontMetricsInt fontMetricsInt) {
        Paint.FontMetricsInt fontMetricsInt2 = this.f1139a;
        paint.getFontMetricsInt(fontMetricsInt2);
        float abs = Math.abs(fontMetricsInt2.descent - fontMetricsInt2.ascent) * 1.0f;
        m mVar = this.f1140b;
        this.f1141c = abs / (mVar.c().a(14) != 0 ? r8.f216b.getShort(r1 + r8.f215a) : (short) 0);
        M.a c2 = mVar.c();
        int a2 = c2.a(14);
        if (a2 != 0) {
            c2.f216b.getShort(a2 + c2.f215a);
        }
        short s2 = (short) ((mVar.c().a(12) != 0 ? r5.f216b.getShort(r7 + r5.f215a) : (short) 0) * this.f1141c);
        if (fontMetricsInt != null) {
            fontMetricsInt.ascent = fontMetricsInt2.ascent;
            fontMetricsInt.descent = fontMetricsInt2.descent;
            fontMetricsInt.top = fontMetricsInt2.top;
            fontMetricsInt.bottom = fontMetricsInt2.bottom;
        }
        return s2;
    }

    @Override // android.text.style.ReplacementSpan
    public final void draw(Canvas canvas, CharSequence charSequence, int i2, int i3, float f2, int i4, int i5, int i6, Paint paint) {
        i.a().getClass();
        m mVar = this.f1140b;
        C0107g c0107g = mVar.f1108b;
        Typeface typeface = (Typeface) c0107g.f2295d;
        Typeface typeface2 = paint.getTypeface();
        paint.setTypeface(typeface);
        canvas.drawText((char[]) c0107g.f2293b, mVar.f1107a * 2, 2, f2, i5, paint);
        paint.setTypeface(typeface2);
    }
}
