package e;

import android.view.ViewGroup;

/* renamed from: e.a, reason: case insensitive filesystem */
/* loaded from: /home/sonpt/Hackdeboc/bigbang.htb/apk/classes.dex */
public abstract class AbstractC0095a extends ViewGroup.MarginLayoutParams {

    /* renamed from: a, reason: collision with root package name */
    public int f2074a;

    public AbstractC0095a(AbstractC0095a abstractC0095a) {
        super((ViewGroup.MarginLayoutParams) abstractC0095a);
        this.f2074a = 0;
        this.f2074a = abstractC0095a.f2074a;
    }

    public AbstractC0095a(ViewGroup.LayoutParams layoutParams) {
        super(layoutParams);
        this.f2074a = 0;
    }
}
