package N;

import android.text.Editable;
import androidx.emoji2.text.v;

/* loaded from: /home/sonpt/Hackdeboc/bigbang.htb/apk/classes.dex */
public final class c extends Editable.Factory {

    /* renamed from: a, reason: collision with root package name */
    public static final Object f222a = new Object();

    /* renamed from: b, reason: collision with root package name */
    public static volatile c f223b;

    /* renamed from: c, reason: collision with root package name */
    public static Class f224c;

    @Override // android.text.Editable.Factory
    public final Editable newEditable(CharSequence charSequence) {
        Class cls = f224c;
        return cls != null ? new v(cls, charSequence) : super.newEditable(charSequence);
    }
}
