package androidx.emoji2.text;

import android.content.Context;
import android.os.Looper;
import androidx.lifecycle.InterfaceC0088d;
import androidx.lifecycle.ProcessLifecycleInitializer;
import g.C0101a;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;

/* loaded from: /home/sonpt/Hackdeboc/bigbang.htb/apk/classes.dex */
public class EmojiCompatInitializer implements T.b {
    @Override // T.b
    public final List a() {
        return Collections.singletonList(ProcessLifecycleInitializer.class);
    }

    @Override // T.b
    public final /* bridge */ /* synthetic */ Object b(Context context) {
        c(context);
        return Boolean.TRUE;
    }

    public final void c(Context context) {
        s sVar = new s(new C0101a(context, 1));
        sVar.f1089b = 1;
        if (i.f1092j == null) {
            synchronized (i.f1091i) {
                try {
                    if (i.f1092j == null) {
                        i.f1092j = new i(sVar);
                    }
                } finally {
                }
            }
        }
        T.a b2 = T.a.b(context);
        b2.getClass();
        final androidx.lifecycle.q d2 = ((androidx.lifecycle.o) b2.a(ProcessLifecycleInitializer.class, new HashSet())).d();
        d2.a(new InterfaceC0088d() { // from class: androidx.emoji2.text.EmojiCompatInitializer.1
            @Override // androidx.lifecycle.InterfaceC0088d
            public final void a() {
                EmojiCompatInitializer.this.getClass();
                b.a(Looper.getMainLooper()).postDelayed(new l(), 500L);
                d2.d(this);
            }
        });
    }
}
