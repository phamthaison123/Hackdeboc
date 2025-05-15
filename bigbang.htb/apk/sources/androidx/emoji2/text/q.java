package androidx.emoji2.text;

import android.content.Context;
import android.graphics.Typeface;
import android.os.Trace;
import androidx.appcompat.widget.Toolbar;
import g.C0107g;
import java.nio.MappedByteBuffer;

/* loaded from: /home/sonpt/Hackdeboc/bigbang.htb/apk/classes.dex */
public final /* synthetic */ class q implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1121a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f1122b;

    public /* synthetic */ q(int i2, Object obj) {
        this.f1121a = i2;
        this.f1122b = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i2 = this.f1121a;
        Object obj = this.f1122b;
        switch (i2) {
            case 0:
                r rVar = (r) obj;
                synchronized (rVar.f1126d) {
                    try {
                        if (rVar.f1130h == null) {
                            return;
                        }
                        try {
                            C.g d2 = rVar.d();
                            int i3 = d2.f27e;
                            if (i3 == 2) {
                                synchronized (rVar.f1126d) {
                                }
                            }
                            if (i3 != 0) {
                                throw new RuntimeException("fetchFonts result is not OK. (" + i3 + ")");
                            }
                            try {
                                Trace.beginSection("EmojiCompat.FontRequestEmojiCompatConfig.buildTypeface");
                                m0.e eVar = rVar.f1125c;
                                Context context = rVar.f1123a;
                                eVar.getClass();
                                Typeface w2 = y.d.f3782a.w(context, new C.g[]{d2}, 0);
                                MappedByteBuffer O2 = B.a.O(rVar.f1123a, d2.f23a);
                                if (O2 == null || w2 == null) {
                                    throw new RuntimeException("Unable to open file.");
                                }
                                try {
                                    Trace.beginSection("EmojiCompat.MetadataRepo.create");
                                    C0107g c0107g = new C0107g(w2, B.a.f0(O2));
                                    Trace.endSection();
                                    synchronized (rVar.f1126d) {
                                        try {
                                            B.a aVar = rVar.f1130h;
                                            if (aVar != null) {
                                                aVar.W(c0107g);
                                            }
                                        } finally {
                                        }
                                    }
                                    rVar.b();
                                    return;
                                } finally {
                                    Trace.endSection();
                                }
                            } catch (Throwable th) {
                                throw th;
                            }
                        } catch (Throwable th2) {
                            synchronized (rVar.f1126d) {
                                try {
                                    B.a aVar2 = rVar.f1130h;
                                    if (aVar2 != null) {
                                        aVar2.Q(th2);
                                    }
                                    rVar.b();
                                    return;
                                } finally {
                                }
                            }
                        }
                    } finally {
                    }
                }
            case 1:
                ((r) obj).c();
                return;
            default:
                ((Toolbar) obj).n();
                return;
        }
    }
}
