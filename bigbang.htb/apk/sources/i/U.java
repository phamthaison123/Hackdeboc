package i;

import android.graphics.Typeface;
import android.widget.TextView;
import java.lang.ref.WeakReference;
import java.util.WeakHashMap;

/* loaded from: /home/sonpt/Hackdeboc/bigbang.htb/apk/classes.dex */
public final class U extends B.a {

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f2719c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f2720d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ WeakReference f2721e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ W f2722f;

    public U(W w2, int i2, int i3, WeakReference weakReference) {
        this.f2722f = w2;
        this.f2719c = i2;
        this.f2720d = i3;
        this.f2721e = weakReference;
    }

    @Override // B.a
    public final void S(int i2) {
    }

    @Override // B.a
    public final void T(Typeface typeface) {
        int i2 = this.f2719c;
        if (i2 != -1) {
            typeface = Typeface.create(typeface, i2, (this.f2720d & 2) != 0);
        }
        W w2 = this.f2722f;
        if (w2.f2742m) {
            w2.f2741l = typeface;
            TextView textView = (TextView) this.f2721e.get();
            if (textView != null) {
                WeakHashMap weakHashMap = F.O.f58a;
                if (F.B.b(textView)) {
                    textView.post(new V(textView, typeface, w2.f2739j));
                } else {
                    textView.setTypeface(typeface, w2.f2739j);
                }
            }
        }
    }
}
