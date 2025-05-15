package C;

import android.content.Context;
import i.r;
import java.util.concurrent.Callable;

/* loaded from: /home/sonpt/Hackdeboc/bigbang.htb/apk/classes.dex */
public final class c implements Callable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f10a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f11b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Context f12c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ r f13d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f14e;

    public /* synthetic */ c(String str, Context context, r rVar, int i2, int i3) {
        this.f10a = i3;
        this.f11b = str;
        this.f12c = context;
        this.f13d = rVar;
        this.f14e = i2;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        String str = this.f11b;
        Context context = this.f12c;
        r rVar = this.f13d;
        int i2 = this.f14e;
        int i3 = this.f10a;
        switch (i3) {
            case 0:
                switch (i3) {
                }
            default:
                switch (i3) {
                }
        }
        return f.a(str, context, rVar, i2);
    }
}
