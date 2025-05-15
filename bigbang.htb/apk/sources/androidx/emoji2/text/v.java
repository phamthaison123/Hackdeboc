package androidx.emoji2.text;

import android.text.Editable;
import android.text.SpannableStringBuilder;
import java.lang.reflect.Array;
import java.util.ArrayList;

/* loaded from: /home/sonpt/Hackdeboc/bigbang.htb/apk/classes.dex */
public final class v extends SpannableStringBuilder {

    /* renamed from: a, reason: collision with root package name */
    public final Class f1137a;

    /* renamed from: b, reason: collision with root package name */
    public final ArrayList f1138b;

    public v(Class cls, CharSequence charSequence) {
        super(charSequence);
        this.f1138b = new ArrayList();
        B.a.o(cls, "watcherClass cannot be null");
        this.f1137a = cls;
    }

    public final void a() {
        int i2 = 0;
        while (true) {
            ArrayList arrayList = this.f1138b;
            if (i2 >= arrayList.size()) {
                return;
            }
            ((u) arrayList.get(i2)).f1136b.incrementAndGet();
            i2++;
        }
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable, java.lang.Appendable
    public final Editable append(CharSequence charSequence) {
        super.append(charSequence);
        return this;
    }

    public final void b() {
        e();
        int i2 = 0;
        while (true) {
            ArrayList arrayList = this.f1138b;
            if (i2 >= arrayList.size()) {
                return;
            }
            ((u) arrayList.get(i2)).onTextChanged(this, 0, length(), length());
            i2++;
        }
    }

    public final u c(Object obj) {
        int i2 = 0;
        while (true) {
            ArrayList arrayList = this.f1138b;
            if (i2 >= arrayList.size()) {
                return null;
            }
            u uVar = (u) arrayList.get(i2);
            if (uVar.f1135a == obj) {
                return uVar;
            }
            i2++;
        }
    }

    public final boolean d(Object obj) {
        if (obj != null) {
            if (this.f1137a == obj.getClass()) {
                return true;
            }
        }
        return false;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable
    public final Editable delete(int i2, int i3) {
        super.delete(i2, i3);
        return this;
    }

    public final void e() {
        int i2 = 0;
        while (true) {
            ArrayList arrayList = this.f1138b;
            if (i2 >= arrayList.size()) {
                return;
            }
            ((u) arrayList.get(i2)).f1136b.decrementAndGet();
            i2++;
        }
    }

    @Override // android.text.SpannableStringBuilder, android.text.Spanned
    public final int getSpanEnd(Object obj) {
        u c2;
        if (d(obj) && (c2 = c(obj)) != null) {
            obj = c2;
        }
        return super.getSpanEnd(obj);
    }

    @Override // android.text.SpannableStringBuilder, android.text.Spanned
    public final int getSpanFlags(Object obj) {
        u c2;
        if (d(obj) && (c2 = c(obj)) != null) {
            obj = c2;
        }
        return super.getSpanFlags(obj);
    }

    @Override // android.text.SpannableStringBuilder, android.text.Spanned
    public final int getSpanStart(Object obj) {
        u c2;
        if (d(obj) && (c2 = c(obj)) != null) {
            obj = c2;
        }
        return super.getSpanStart(obj);
    }

    @Override // android.text.SpannableStringBuilder, android.text.Spanned
    public final Object[] getSpans(int i2, int i3, Class cls) {
        if (this.f1137a != cls) {
            return super.getSpans(i2, i3, cls);
        }
        u[] uVarArr = (u[]) super.getSpans(i2, i3, u.class);
        Object[] objArr = (Object[]) Array.newInstance((Class<?>) cls, uVarArr.length);
        for (int i4 = 0; i4 < uVarArr.length; i4++) {
            objArr[i4] = uVarArr[i4].f1135a;
        }
        return objArr;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable
    public final Editable insert(int i2, CharSequence charSequence) {
        super.insert(i2, charSequence);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Spanned
    public final int nextSpanTransition(int i2, int i3, Class cls) {
        if (cls == null || this.f1137a == cls) {
            cls = u.class;
        }
        return super.nextSpanTransition(i2, i3, cls);
    }

    @Override // android.text.SpannableStringBuilder, android.text.Spannable
    public final void removeSpan(Object obj) {
        u uVar;
        if (d(obj)) {
            uVar = c(obj);
            if (uVar != null) {
                obj = uVar;
            }
        } else {
            uVar = null;
        }
        super.removeSpan(obj);
        if (uVar != null) {
            this.f1138b.remove(uVar);
        }
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable
    public final /* bridge */ /* synthetic */ Editable replace(int i2, int i3, CharSequence charSequence) {
        replace(i2, i3, charSequence);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Spannable
    public final void setSpan(Object obj, int i2, int i3, int i4) {
        if (d(obj)) {
            u uVar = new u(obj);
            this.f1138b.add(uVar);
            obj = uVar;
        }
        super.setSpan(obj, i2, i3, i4);
    }

    @Override // android.text.SpannableStringBuilder, java.lang.CharSequence
    public final CharSequence subSequence(int i2, int i3) {
        return new v(this.f1137a, this, i2, i3);
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable, java.lang.Appendable
    public final SpannableStringBuilder append(CharSequence charSequence) {
        super.append(charSequence);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable
    public final SpannableStringBuilder delete(int i2, int i3) {
        super.delete(i2, i3);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable
    public final SpannableStringBuilder insert(int i2, CharSequence charSequence) {
        super.insert(i2, charSequence);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable
    public final /* bridge */ /* synthetic */ Editable replace(int i2, int i3, CharSequence charSequence, int i4, int i5) {
        replace(i2, i3, charSequence, i4, i5);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable, java.lang.Appendable
    public final Appendable append(CharSequence charSequence) {
        super.append(charSequence);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable
    public final Editable insert(int i2, CharSequence charSequence, int i3, int i4) {
        super.insert(i2, charSequence, i3, i4);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable
    public final SpannableStringBuilder replace(int i2, int i3, CharSequence charSequence) {
        a();
        super.replace(i2, i3, charSequence);
        e();
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable, java.lang.Appendable
    public final Editable append(char c2) {
        super.append(c2);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable
    public final SpannableStringBuilder insert(int i2, CharSequence charSequence, int i3, int i4) {
        super.insert(i2, charSequence, i3, i4);
        return this;
    }

    public v(Class cls, CharSequence charSequence, int i2, int i3) {
        super(charSequence, i2, i3);
        this.f1138b = new ArrayList();
        B.a.o(cls, "watcherClass cannot be null");
        this.f1137a = cls;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable, java.lang.Appendable
    public final SpannableStringBuilder append(char c2) {
        super.append(c2);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable, java.lang.Appendable
    public final Appendable append(char c2) {
        super.append(c2);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable
    public final SpannableStringBuilder replace(int i2, int i3, CharSequence charSequence, int i4, int i5) {
        a();
        super.replace(i2, i3, charSequence, i4, i5);
        e();
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable, java.lang.Appendable
    public final Editable append(CharSequence charSequence, int i2, int i3) {
        super.append(charSequence, i2, i3);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable, java.lang.Appendable
    public final SpannableStringBuilder append(CharSequence charSequence, int i2, int i3) {
        super.append(charSequence, i2, i3);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable, java.lang.Appendable
    public final Appendable append(CharSequence charSequence, int i2, int i3) {
        super.append(charSequence, i2, i3);
        return this;
    }

    @Override // android.text.SpannableStringBuilder
    public final SpannableStringBuilder append(CharSequence charSequence, Object obj, int i2) {
        super.append(charSequence, obj, i2);
        return this;
    }
}
