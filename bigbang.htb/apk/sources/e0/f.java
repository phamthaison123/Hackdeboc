package e0;

import android.widget.CompoundButton;
import com.google.android.material.chip.ChipGroup;

/* loaded from: /home/sonpt/Hackdeboc/bigbang.htb/apk/classes.dex */
public final class f implements CompoundButton.OnCheckedChangeListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ChipGroup f2271a;

    public f(ChipGroup chipGroup) {
        this.f2271a = chipGroup;
    }

    @Override // android.widget.CompoundButton.OnCheckedChangeListener
    public final void onCheckedChanged(CompoundButton compoundButton, boolean z2) {
        ChipGroup chipGroup = this.f2271a;
        if (chipGroup.f1782l) {
            return;
        }
        if (chipGroup.getCheckedChipIds().isEmpty() && chipGroup.f1778h) {
            chipGroup.c(compoundButton.getId(), true);
            chipGroup.f1781k = compoundButton.getId();
            return;
        }
        int id = compoundButton.getId();
        if (!z2) {
            if (chipGroup.f1781k == id) {
                chipGroup.setCheckedId(-1);
            }
        } else {
            int i2 = chipGroup.f1781k;
            if (i2 != -1 && i2 != id && chipGroup.f1777g) {
                chipGroup.c(i2, false);
            }
            chipGroup.setCheckedId(id);
        }
    }
}
