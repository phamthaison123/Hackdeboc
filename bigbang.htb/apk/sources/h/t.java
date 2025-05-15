package h;

import android.view.CollapsibleActionView;
import android.view.View;
import android.widget.FrameLayout;
import g.InterfaceC0104d;

/* loaded from: /home/sonpt/Hackdeboc/bigbang.htb/apk/classes.dex */
public final class t extends FrameLayout implements InterfaceC0104d {

    /* renamed from: a, reason: collision with root package name */
    public final CollapsibleActionView f2509a;

    /* JADX WARN: Multi-variable type inference failed */
    public t(View view) {
        super(view.getContext());
        this.f2509a = (CollapsibleActionView) view;
        addView(view);
    }

    @Override // g.InterfaceC0104d
    public final void a() {
        this.f2509a.onActionViewExpanded();
    }

    @Override // g.InterfaceC0104d
    public final void d() {
        this.f2509a.onActionViewCollapsed();
    }
}
