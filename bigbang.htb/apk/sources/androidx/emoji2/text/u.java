package androidx.emoji2.text;

import android.text.Editable;
import android.text.SpanWatcher;
import android.text.Spannable;
import android.text.TextWatcher;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: /home/sonpt/Hackdeboc/bigbang.htb/apk/classes.dex */
public final class u implements TextWatcher, SpanWatcher {

    /* renamed from: a, reason: collision with root package name */
    public final Object f1135a;

    /* renamed from: b, reason: collision with root package name */
    public final AtomicInteger f1136b = new AtomicInteger(0);

    public u(Object obj) {
        this.f1135a = obj;
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        ((TextWatcher) this.f1135a).afterTextChanged(editable);
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i2, int i3, int i4) {
        ((TextWatcher) this.f1135a).beforeTextChanged(charSequence, i2, i3, i4);
    }

    @Override // android.text.SpanWatcher
    public final void onSpanAdded(Spannable spannable, Object obj, int i2, int i3) {
        if (this.f1136b.get() <= 0 || !(obj instanceof w)) {
            ((SpanWatcher) this.f1135a).onSpanAdded(spannable, obj, i2, i3);
        }
    }

    @Override // android.text.SpanWatcher
    public final void onSpanChanged(Spannable spannable, Object obj, int i2, int i3, int i4, int i5) {
        if (this.f1136b.get() <= 0 || !(obj instanceof w)) {
            ((SpanWatcher) this.f1135a).onSpanChanged(spannable, obj, i2, i3, i4, i5);
        }
    }

    @Override // android.text.SpanWatcher
    public final void onSpanRemoved(Spannable spannable, Object obj, int i2, int i3) {
        if (this.f1136b.get() <= 0 || !(obj instanceof w)) {
            ((SpanWatcher) this.f1135a).onSpanRemoved(spannable, obj, i2, i3);
        }
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i2, int i3, int i4) {
        ((TextWatcher) this.f1135a).onTextChanged(charSequence, i2, i3, i4);
    }
}
