package D;

import androidx.lifecycle.n;

/* loaded from: /home/sonpt/Hackdeboc/bigbang.htb/apk/classes.dex */
public abstract class g {

    /* renamed from: a, reason: collision with root package name */
    public Object f48a;

    public g(e eVar) {
        this.f48a = eVar;
    }

    public abstract void a(n nVar);

    public abstract boolean b();

    public final boolean c(CharSequence charSequence, int i2) {
        if (charSequence == null || i2 < 0 || charSequence.length() - i2 < 0) {
            throw new IllegalArgumentException();
        }
        f fVar = (f) this.f48a;
        if (fVar == null) {
            return b();
        }
        int a2 = fVar.a(charSequence, i2);
        if (a2 == 0) {
            return true;
        }
        if (a2 != 1) {
            return b();
        }
        return false;
    }

    public abstract void d(n nVar);
}
