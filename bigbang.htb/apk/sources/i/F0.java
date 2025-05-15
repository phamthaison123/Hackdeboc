package i;

import android.content.res.Resources;
import android.graphics.Rect;
import android.view.View;
import androidx.appcompat.widget.SearchView;
import com.google.android.material.bottomappbar.BottomAppBar$Behavior;

/* loaded from: /home/sonpt/Hackdeboc/bigbang.htb/apk/classes.dex */
public final class F0 implements View.OnLayoutChangeListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2634a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f2635b;

    public /* synthetic */ F0(int i2, Object obj) {
        this.f2634a = i2;
        this.f2635b = obj;
    }

    @Override // android.view.View.OnLayoutChangeListener
    public final void onLayoutChange(View view, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9) {
        int i10 = this.f2634a;
        Object obj = this.f2635b;
        switch (i10) {
            case 0:
                SearchView searchView = (SearchView) obj;
                View view2 = searchView.f933x;
                if (view2.getWidth() > 1) {
                    Resources resources = searchView.getContext().getResources();
                    int paddingLeft = searchView.f927r.getPaddingLeft();
                    Rect rect = new Rect();
                    boolean a2 = b1.a(searchView);
                    int dimensionPixelSize = searchView.f908M ? resources.getDimensionPixelSize(2131165226) + resources.getDimensionPixelSize(2131165225) : 0;
                    SearchView.SearchAutoComplete searchAutoComplete = searchView.f925p;
                    searchAutoComplete.getDropDownBackground().getPadding(rect);
                    searchAutoComplete.setDropDownHorizontalOffset(a2 ? -rect.left : paddingLeft - (rect.left + dimensionPixelSize));
                    searchAutoComplete.setDropDownWidth((((view2.getWidth() + rect.left) + rect.right) + dimensionPixelSize) - paddingLeft);
                    return;
                }
                return;
            default:
                ((BottomAppBar$Behavior) obj).getClass();
                throw null;
        }
    }
}
