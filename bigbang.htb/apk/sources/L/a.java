package L;

import F.AbstractC0023y;
import F.O;
import android.os.Bundle;
import android.view.View;
import android.view.accessibility.AccessibilityManager;
import android.view.accessibility.AccessibilityNodeInfo;
import com.google.android.material.chip.Chip;
import e.z;
import java.util.WeakHashMap;

/* loaded from: /home/sonpt/Hackdeboc/bigbang.htb/apk/classes.dex */
public final class a extends z {

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ b f174c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(b bVar) {
        super(14);
        this.f174c = bVar;
    }

    @Override // e.z
    public final G.d r(int i2) {
        return new G.d(AccessibilityNodeInfo.obtain(this.f174c.n(i2).f129a));
    }

    @Override // e.z
    public final G.d s(int i2) {
        b bVar = this.f174c;
        int i3 = i2 == 2 ? bVar.f185k : bVar.f186l;
        if (i3 == Integer.MIN_VALUE) {
            return null;
        }
        return r(i3);
    }

    @Override // e.z
    public final boolean t(int i2, int i3, Bundle bundle) {
        int i4;
        b bVar = this.f174c;
        View view = bVar.f183i;
        if (i2 == -1) {
            WeakHashMap weakHashMap = O.f58a;
            return AbstractC0023y.j(view, i3, bundle);
        }
        boolean z2 = true;
        if (i3 == 1) {
            return bVar.p(i2);
        }
        if (i3 == 2) {
            return bVar.j(i2);
        }
        boolean z3 = false;
        if (i3 == 64) {
            AccessibilityManager accessibilityManager = bVar.f182h;
            if (accessibilityManager.isEnabled() && accessibilityManager.isTouchExplorationEnabled() && (i4 = bVar.f185k) != i2) {
                if (i4 != Integer.MIN_VALUE) {
                    bVar.f185k = Integer.MIN_VALUE;
                    bVar.f183i.invalidate();
                    bVar.q(i4, 65536);
                }
                bVar.f185k = i2;
                view.invalidate();
                bVar.q(i2, 32768);
            }
            z2 = false;
        } else {
            if (i3 != 128) {
                e0.c cVar = (e0.c) bVar;
                if (i3 != 16) {
                    return false;
                }
                Chip chip = cVar.f2225q;
                if (i2 == 0) {
                    return chip.performClick();
                }
                if (i2 != 1) {
                    return false;
                }
                chip.playSoundEffect(0);
                View.OnClickListener onClickListener = chip.f1761h;
                if (onClickListener != null) {
                    onClickListener.onClick(chip);
                    z3 = true;
                }
                if (!chip.f1771r) {
                    return z3;
                }
                chip.f1770q.q(1, 1);
                return z3;
            }
            if (bVar.f185k == i2) {
                bVar.f185k = Integer.MIN_VALUE;
                view.invalidate();
                bVar.q(i2, 65536);
            }
            z2 = false;
        }
        return z2;
    }
}
