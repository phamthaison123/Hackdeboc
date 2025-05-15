package N;

import android.widget.EditText;
import java.lang.ref.WeakReference;

/* loaded from: /home/sonpt/Hackdeboc/bigbang.htb/apk/classes.dex */
public final class j extends androidx.emoji2.text.g {

    /* renamed from: a, reason: collision with root package name */
    public final WeakReference f237a;

    public j(EditText editText) {
        this.f237a = new WeakReference(editText);
    }

    @Override // androidx.emoji2.text.g
    public final void a() {
        k.a((EditText) this.f237a.get(), 1);
    }
}
