package androidx.appcompat.widget;

import F.T;
import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.widget.FrameLayout;
import e.m;
import e.v;
import h.o;
import i.C0147h;
import i.C0157m;
import i.InterfaceC0140d0;
import i.InterfaceC0142e0;
import i.Y0;

/* loaded from: /home/sonpt/Hackdeboc/bigbang.htb/apk/classes.dex */
public class ContentFrameLayout extends FrameLayout {

    /* renamed from: a, reason: collision with root package name */
    public TypedValue f885a;

    /* renamed from: b, reason: collision with root package name */
    public TypedValue f886b;

    /* renamed from: c, reason: collision with root package name */
    public TypedValue f887c;

    /* renamed from: d, reason: collision with root package name */
    public TypedValue f888d;

    /* renamed from: e, reason: collision with root package name */
    public TypedValue f889e;

    /* renamed from: f, reason: collision with root package name */
    public TypedValue f890f;

    /* renamed from: g, reason: collision with root package name */
    public final Rect f891g;

    /* renamed from: h, reason: collision with root package name */
    public InterfaceC0140d0 f892h;

    public ContentFrameLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.f891g = new Rect();
    }

    public TypedValue getFixedHeightMajor() {
        if (this.f889e == null) {
            this.f889e = new TypedValue();
        }
        return this.f889e;
    }

    public TypedValue getFixedHeightMinor() {
        if (this.f890f == null) {
            this.f890f = new TypedValue();
        }
        return this.f890f;
    }

    public TypedValue getFixedWidthMajor() {
        if (this.f887c == null) {
            this.f887c = new TypedValue();
        }
        return this.f887c;
    }

    public TypedValue getFixedWidthMinor() {
        if (this.f888d == null) {
            this.f888d = new TypedValue();
        }
        return this.f888d;
    }

    public TypedValue getMinWidthMajor() {
        if (this.f885a == null) {
            this.f885a = new TypedValue();
        }
        return this.f885a;
    }

    public TypedValue getMinWidthMinor() {
        if (this.f886b == null) {
            this.f886b = new TypedValue();
        }
        return this.f886b;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        InterfaceC0140d0 interfaceC0140d0 = this.f892h;
        if (interfaceC0140d0 != null) {
            interfaceC0140d0.getClass();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        C0157m c0157m;
        super.onDetachedFromWindow();
        InterfaceC0140d0 interfaceC0140d0 = this.f892h;
        if (interfaceC0140d0 != null) {
            v vVar = ((m) interfaceC0140d0).f2127b;
            InterfaceC0142e0 interfaceC0142e0 = vVar.f2194k;
            if (interfaceC0142e0 != null) {
                ActionBarOverlayLayout actionBarOverlayLayout = (ActionBarOverlayLayout) interfaceC0142e0;
                actionBarOverlayLayout.k();
                ActionMenuView actionMenuView = ((Y0) actionBarOverlayLayout.f847e).f2750a.f954a;
                if (actionMenuView != null && (c0157m = actionMenuView.f874t) != null) {
                    c0157m.f();
                    C0147h c0147h = c0157m.f2847t;
                    if (c0147h != null && c0147h.b()) {
                        c0147h.f2527j.dismiss();
                    }
                }
            }
            if (vVar.f2199p != null) {
                vVar.f2188e.getDecorView().removeCallbacks(vVar.f2200q);
                if (vVar.f2199p.isShowing()) {
                    try {
                        vVar.f2199p.dismiss();
                    } catch (IllegalArgumentException unused) {
                    }
                }
                vVar.f2199p = null;
            }
            T t2 = vVar.f2201r;
            if (t2 != null) {
                t2.b();
            }
            o oVar = vVar.u(0).f2148h;
            if (oVar != null) {
                oVar.c(true);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00ac A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00d1  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00d9  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00e1  */
    /* JADX WARN: Removed duplicated region for block: B:46:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00c3  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00b3  */
    @Override // android.widget.FrameLayout, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onMeasure(int r17, int r18) {
        /*
            Method dump skipped, instructions count: 229
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.ContentFrameLayout.onMeasure(int, int):void");
    }

    public void setAttachListener(InterfaceC0140d0 interfaceC0140d0) {
        this.f892h = interfaceC0140d0;
    }
}
