package androidx.emoji2.text;

import android.text.Editable;
import android.text.Selection;
import android.text.TextPaint;
import android.view.KeyEvent;
import g.C0107g;
import y.AbstractC0239c;

/* loaded from: /home/sonpt/Hackdeboc/bigbang.htb/apk/classes.dex */
public final class p {

    /* renamed from: a, reason: collision with root package name */
    public final m0.e f1118a;

    /* renamed from: b, reason: collision with root package name */
    public final C0107g f1119b;

    /* renamed from: c, reason: collision with root package name */
    public final f f1120c;

    public p(C0107g c0107g, m0.e eVar, n nVar) {
        this.f1118a = eVar;
        this.f1119b = c0107g;
        this.f1120c = nVar;
    }

    public static boolean a(Editable editable, KeyEvent keyEvent, boolean z2) {
        w[] wVarArr;
        if (!KeyEvent.metaStateHasNoModifiers(keyEvent.getMetaState())) {
            return false;
        }
        int selectionStart = Selection.getSelectionStart(editable);
        int selectionEnd = Selection.getSelectionEnd(editable);
        if (selectionStart != -1 && selectionEnd != -1 && selectionStart == selectionEnd && (wVarArr = (w[]) editable.getSpans(selectionStart, selectionEnd, w.class)) != null && wVarArr.length > 0) {
            for (w wVar : wVarArr) {
                int spanStart = editable.getSpanStart(wVar);
                int spanEnd = editable.getSpanEnd(wVar);
                if ((z2 && spanStart == selectionStart) || ((!z2 && spanEnd == selectionStart) || (selectionStart > spanStart && selectionStart < spanEnd))) {
                    editable.delete(spanStart, spanEnd);
                    return true;
                }
            }
        }
        return false;
    }

    public final boolean b(CharSequence charSequence, int i2, int i3, m mVar) {
        if (mVar.f1109c == 0) {
            f fVar = this.f1120c;
            M.a c2 = mVar.c();
            int a2 = c2.a(8);
            if (a2 != 0) {
                c2.f216b.getShort(a2 + c2.f215a);
            }
            n nVar = (n) fVar;
            nVar.getClass();
            ThreadLocal threadLocal = n.f1110b;
            if (threadLocal.get() == null) {
                threadLocal.set(new StringBuilder());
            }
            StringBuilder sb = (StringBuilder) threadLocal.get();
            sb.setLength(0);
            while (i2 < i3) {
                sb.append(charSequence.charAt(i2));
                i2++;
            }
            TextPaint textPaint = nVar.f1111a;
            String sb2 = sb.toString();
            int i4 = AbstractC0239c.f3781a;
            mVar.f1109c = textPaint.hasGlyph(sb2) ? 2 : 1;
        }
        return mVar.f1109c == 2;
    }
}
