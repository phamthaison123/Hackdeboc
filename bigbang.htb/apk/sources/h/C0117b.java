package h;

import androidx.appcompat.view.menu.ActionMenuItemView;
import i.AbstractViewOnTouchListenerC0156l0;
import i.C0147h;
import i.C0149i;

/* renamed from: h.b, reason: case insensitive filesystem */
/* loaded from: /home/sonpt/Hackdeboc/bigbang.htb/apk/classes.dex */
public final class C0117b extends AbstractViewOnTouchListenerC0156l0 {

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ ActionMenuItemView f2393j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0117b(ActionMenuItemView actionMenuItemView) {
        super(actionMenuItemView);
        this.f2393j = actionMenuItemView;
    }

    @Override // i.AbstractViewOnTouchListenerC0156l0
    public final F b() {
        C0147h c0147h;
        AbstractC0118c abstractC0118c = this.f2393j.f787k;
        if (abstractC0118c == null || (c0147h = ((C0149i) abstractC0118c).f2796a.f2847t) == null) {
            return null;
        }
        return c0147h.a();
    }

    @Override // i.AbstractViewOnTouchListenerC0156l0
    public final boolean c() {
        F b2;
        ActionMenuItemView actionMenuItemView = this.f2393j;
        n nVar = actionMenuItemView.f785i;
        return nVar != null && nVar.e(actionMenuItemView.f782f) && (b2 = b()) != null && b2.a();
    }
}
