package e0;

import F.AbstractC0024z;
import F.O;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.material.chip.Chip;
import com.google.android.material.chip.ChipGroup;
import java.util.WeakHashMap;

/* loaded from: /home/sonpt/Hackdeboc/bigbang.htb/apk/classes.dex */
public final class i implements ViewGroup.OnHierarchyChangeListener {

    /* renamed from: a, reason: collision with root package name */
    public ViewGroup.OnHierarchyChangeListener f2272a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ChipGroup f2273b;

    public i(ChipGroup chipGroup) {
        this.f2273b = chipGroup;
    }

    @Override // android.view.ViewGroup.OnHierarchyChangeListener
    public final void onChildViewAdded(View view, View view2) {
        ChipGroup chipGroup = this.f2273b;
        if (view == chipGroup && (view2 instanceof Chip)) {
            if (view2.getId() == -1) {
                WeakHashMap weakHashMap = O.f58a;
                view2.setId(AbstractC0024z.a());
            }
            Chip chip = (Chip) view2;
            if (chip.isChecked()) {
                ((ChipGroup) view).b(chip.getId());
            }
            chip.setOnCheckedChangeListenerInternal(chipGroup.f1779i);
        }
        ViewGroup.OnHierarchyChangeListener onHierarchyChangeListener = this.f2272a;
        if (onHierarchyChangeListener != null) {
            onHierarchyChangeListener.onChildViewAdded(view, view2);
        }
    }

    @Override // android.view.ViewGroup.OnHierarchyChangeListener
    public final void onChildViewRemoved(View view, View view2) {
        if (view == this.f2273b && (view2 instanceof Chip)) {
            ((Chip) view2).setOnCheckedChangeListenerInternal(null);
        }
        ViewGroup.OnHierarchyChangeListener onHierarchyChangeListener = this.f2272a;
        if (onHierarchyChangeListener != null) {
            onHierarchyChangeListener.onChildViewRemoved(view, view2);
        }
    }
}
