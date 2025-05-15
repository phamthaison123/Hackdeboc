package F;

import android.os.Build;
import android.view.View;

/* renamed from: F.w, reason: case insensitive filesystem */
/* loaded from: /home/sonpt/Hackdeboc/bigbang.htb/apk/classes.dex */
public abstract class AbstractC0021w {

    /* renamed from: a, reason: collision with root package name */
    public final int f109a;

    /* renamed from: b, reason: collision with root package name */
    public final Class f110b;

    /* renamed from: c, reason: collision with root package name */
    public final int f111c;

    /* renamed from: d, reason: collision with root package name */
    public final int f112d;

    public AbstractC0021w(int i2, Class cls, int i3, int i4) {
        this.f109a = i2;
        this.f110b = cls;
        this.f112d = i3;
        this.f111c = i4;
    }

    public final Object a(View view) {
        if (Build.VERSION.SDK_INT < this.f111c) {
            Object tag = view.getTag(this.f109a);
            if (this.f110b.isInstance(tag)) {
                return tag;
            }
            return null;
        }
        int i2 = ((C0019u) this).f107e;
        switch (i2) {
            case 0:
                switch (i2) {
                    case 0:
                        return Boolean.valueOf(I.d(view));
                    default:
                        return Boolean.valueOf(I.c(view));
                }
            case 1:
                switch (i2) {
                    case 1:
                        return I.b(view);
                    default:
                        return K.a(view);
                }
            case 2:
                switch (i2) {
                    case 1:
                        return I.b(view);
                    default:
                        return K.a(view);
                }
            default:
                switch (i2) {
                    case 0:
                        return Boolean.valueOf(I.d(view));
                    default:
                        return Boolean.valueOf(I.c(view));
                }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:101:0x0102, code lost:
    
        if (r0 == r1) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x0085, code lost:
    
        if (r0 == r1) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x0087, code lost:
    
        r2 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x00a2, code lost:
    
        if (r0 == r1) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:90:0x00e9, code lost:
    
        if (r0 == r1) goto L37;
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:31:0x0064. Please report as an issue. */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void b(android.view.View r6, java.lang.Object r7) {
        /*
            Method dump skipped, instructions count: 378
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: F.AbstractC0021w.b(android.view.View, java.lang.Object):void");
    }
}
