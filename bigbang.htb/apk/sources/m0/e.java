package m0;

import android.graphics.Path;
import android.text.InputFilter;
import androidx.recyclerview.widget.RecyclerView;
import h.InterfaceC0114A;

/* loaded from: /home/sonpt/Hackdeboc/bigbang.htb/apk/classes.dex */
public class e implements InterfaceC0114A {

    /* renamed from: a, reason: collision with root package name */
    public static e f3070a;

    public e(int i2) {
    }

    public static Path c(float f2, float f3, float f4, float f5) {
        Path path = new Path();
        path.moveTo(f2, f3);
        path.lineTo(f4, f5);
        return path;
    }

    /* JADX WARN: Code restructure failed: missing block: B:36:0x004b, code lost:
    
        if (java.lang.Character.isHighSurrogate(r5) != false) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x0088, code lost:
    
        if (java.lang.Character.isLowSurrogate(r5) != false) goto L60;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x007b, code lost:
    
        if (r11 != false) goto L48;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean d(android.view.inputmethod.InputConnection r7, android.text.Editable r8, int r9, int r10, boolean r11) {
        /*
            Method dump skipped, instructions count: 246
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: m0.e.d(android.view.inputmethod.InputConnection, android.text.Editable, int, int, boolean):boolean");
    }

    public InputFilter[] a(InputFilter[] inputFilterArr) {
        return inputFilterArr;
    }

    @Override // h.InterfaceC0114A
    public void b(h.o oVar, boolean z2) {
    }

    public void e(boolean z2) {
    }

    public void f(boolean z2) {
    }

    @Override // h.InterfaceC0114A
    public boolean j(h.o oVar) {
        return false;
    }

    public e(RecyclerView recyclerView) {
    }
}
