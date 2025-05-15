package e0;

import android.content.Context;
import android.graphics.Rect;
import android.text.TextUtils;
import android.view.accessibility.AccessibilityNodeInfo;
import com.google.android.material.chip.Chip;
import java.util.ArrayList;

/* loaded from: /home/sonpt/Hackdeboc/bigbang.htb/apk/classes.dex */
public final class c extends L.b {

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ Chip f2225q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(Chip chip, Chip chip2) {
        super(chip2);
        this.f2225q = chip;
    }

    @Override // L.b
    public final void l(ArrayList arrayList) {
        boolean z2 = false;
        arrayList.add(0);
        Rect rect = Chip.f1755v;
        Chip chip = this.f2225q;
        if (chip.c()) {
            e eVar = chip.f1758e;
            if (eVar != null && eVar.f2236K) {
                z2 = true;
            }
            if (!z2 || chip.f1761h == null) {
                return;
            }
            arrayList.add(1);
        }
    }

    @Override // L.b
    public final void o(int i2, G.d dVar) {
        Rect closeIconTouchBoundsInt;
        AccessibilityNodeInfo accessibilityNodeInfo = dVar.f129a;
        if (i2 != 1) {
            accessibilityNodeInfo.setContentDescription("");
            accessibilityNodeInfo.setBoundsInParent(Chip.f1755v);
            return;
        }
        Chip chip = this.f2225q;
        CharSequence closeIconContentDescription = chip.getCloseIconContentDescription();
        if (closeIconContentDescription != null) {
            accessibilityNodeInfo.setContentDescription(closeIconContentDescription);
        } else {
            CharSequence text = chip.getText();
            Context context = chip.getContext();
            Object[] objArr = new Object[1];
            objArr[0] = TextUtils.isEmpty(text) ? "" : text;
            accessibilityNodeInfo.setContentDescription(context.getString(2131755099, objArr).trim());
        }
        closeIconTouchBoundsInt = chip.getCloseIconTouchBoundsInt();
        accessibilityNodeInfo.setBoundsInParent(closeIconTouchBoundsInt);
        dVar.b(G.b.f116e);
        accessibilityNodeInfo.setEnabled(chip.isEnabled());
    }
}
