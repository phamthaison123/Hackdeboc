package n;

import com.google.android.material.button.MaterialButton;
import com.google.android.material.button.MaterialButtonToggleGroup;
import java.util.Comparator;

/* renamed from: n.g, reason: case insensitive filesystem */
/* loaded from: /home/sonpt/Hackdeboc/bigbang.htb/apk/classes.dex */
public final class C0201g implements Comparator {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3213a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f3214b;

    public /* synthetic */ C0201g(int i2, Object obj) {
        this.f3213a = i2;
        this.f3214b = obj;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        switch (this.f3213a) {
            case 0:
                return ((C0205k) obj).f3222b - ((C0205k) obj2).f3222b;
            default:
                MaterialButton materialButton = (MaterialButton) obj;
                MaterialButton materialButton2 = (MaterialButton) obj2;
                int compareTo = Boolean.valueOf(materialButton.f1741n).compareTo(Boolean.valueOf(materialButton2.f1741n));
                if (compareTo != 0) {
                    return compareTo;
                }
                int compareTo2 = Boolean.valueOf(materialButton.isPressed()).compareTo(Boolean.valueOf(materialButton2.isPressed()));
                if (compareTo2 != 0) {
                    return compareTo2;
                }
                MaterialButtonToggleGroup materialButtonToggleGroup = (MaterialButtonToggleGroup) this.f3214b;
                return Integer.valueOf(materialButtonToggleGroup.indexOfChild(materialButton)).compareTo(Integer.valueOf(materialButtonToggleGroup.indexOfChild(materialButton2)));
        }
    }
}
