package i;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AbsListView;
import android.widget.ListAdapter;
import android.widget.ListView;
import java.lang.reflect.Field;

/* renamed from: i.i0, reason: case insensitive filesystem */
/* loaded from: /home/sonpt/Hackdeboc/bigbang.htb/apk/classes.dex */
public class C0150i0 extends ListView {

    /* renamed from: a, reason: collision with root package name */
    public final Rect f2797a;

    /* renamed from: b, reason: collision with root package name */
    public int f2798b;

    /* renamed from: c, reason: collision with root package name */
    public int f2799c;

    /* renamed from: d, reason: collision with root package name */
    public int f2800d;

    /* renamed from: e, reason: collision with root package name */
    public int f2801e;

    /* renamed from: f, reason: collision with root package name */
    public int f2802f;

    /* renamed from: g, reason: collision with root package name */
    public final Field f2803g;

    /* renamed from: h, reason: collision with root package name */
    public C0148h0 f2804h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f2805i;

    /* renamed from: j, reason: collision with root package name */
    public final boolean f2806j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f2807k;

    /* renamed from: l, reason: collision with root package name */
    public I.c f2808l;

    /* renamed from: m, reason: collision with root package name */
    public androidx.activity.b f2809m;

    public C0150i0(Context context, boolean z2) {
        super(context, null, 2130968900);
        this.f2797a = new Rect();
        this.f2798b = 0;
        this.f2799c = 0;
        this.f2800d = 0;
        this.f2801e = 0;
        this.f2806j = z2;
        setCacheColorHint(0);
        try {
            Field declaredField = AbsListView.class.getDeclaredField("mIsChildViewEnabled");
            this.f2803g = declaredField;
            declaredField.setAccessible(true);
        } catch (NoSuchFieldException e2) {
            e2.printStackTrace();
        }
    }

    public final int a(int i2, int i3) {
        int listPaddingTop = getListPaddingTop();
        int listPaddingBottom = getListPaddingBottom();
        int dividerHeight = getDividerHeight();
        Drawable divider = getDivider();
        ListAdapter adapter = getAdapter();
        if (adapter == null) {
            return listPaddingTop + listPaddingBottom;
        }
        int i4 = listPaddingTop + listPaddingBottom;
        if (dividerHeight <= 0 || divider == null) {
            dividerHeight = 0;
        }
        int count = adapter.getCount();
        int i5 = 0;
        View view = null;
        for (int i6 = 0; i6 < count; i6++) {
            int itemViewType = adapter.getItemViewType(i6);
            if (itemViewType != i5) {
                view = null;
                i5 = itemViewType;
            }
            view = adapter.getView(i6, view, this);
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            if (layoutParams == null) {
                layoutParams = generateDefaultLayoutParams();
                view.setLayoutParams(layoutParams);
            }
            int i7 = layoutParams.height;
            view.measure(i2, i7 > 0 ? View.MeasureSpec.makeMeasureSpec(i7, 1073741824) : View.MeasureSpec.makeMeasureSpec(0, 0));
            view.forceLayout();
            if (i6 > 0) {
                i4 += dividerHeight;
            }
            i4 += view.getMeasuredHeight();
            if (i4 >= i3) {
                return i3;
            }
        }
        return i4;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0144  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0159  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x013f  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0127 A[ADDED_TO_REGION] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean b(android.view.MotionEvent r17, int r18) {
        /*
            Method dump skipped, instructions count: 360
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: i.C0150i0.b(android.view.MotionEvent, int):boolean");
    }

    @Override // android.widget.ListView, android.widget.AbsListView, android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        Drawable selector;
        Rect rect = this.f2797a;
        if (!rect.isEmpty() && (selector = getSelector()) != null) {
            selector.setBounds(rect);
            selector.draw(canvas);
        }
        super.dispatchDraw(canvas);
    }

    @Override // android.widget.AbsListView, android.view.ViewGroup, android.view.View
    public final void drawableStateChanged() {
        if (this.f2809m != null) {
            return;
        }
        super.drawableStateChanged();
        C0148h0 c0148h0 = this.f2804h;
        if (c0148h0 != null) {
            c0148h0.f2795b = true;
        }
        Drawable selector = getSelector();
        if (selector != null && this.f2807k && isPressed()) {
            selector.setState(getDrawableState());
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean hasFocus() {
        return this.f2806j || super.hasFocus();
    }

    @Override // android.view.View
    public final boolean hasWindowFocus() {
        return this.f2806j || super.hasWindowFocus();
    }

    @Override // android.view.View
    public final boolean isFocused() {
        return this.f2806j || super.isFocused();
    }

    @Override // android.view.View
    public final boolean isInTouchMode() {
        return (this.f2806j && this.f2805i) || super.isInTouchMode();
    }

    @Override // android.widget.ListView, android.widget.AbsListView, android.widget.AdapterView, android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        this.f2809m = null;
        super.onDetachedFromWindow();
    }

    @Override // android.view.View
    public boolean onHoverEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 10 && this.f2809m == null) {
            androidx.activity.b bVar = new androidx.activity.b(2, this);
            this.f2809m = bVar;
            post(bVar);
        }
        boolean onHoverEvent = super.onHoverEvent(motionEvent);
        if (actionMasked == 9 || actionMasked == 7) {
            int pointToPosition = pointToPosition((int) motionEvent.getX(), (int) motionEvent.getY());
            if (pointToPosition != -1 && pointToPosition != getSelectedItemPosition()) {
                View childAt = getChildAt(pointToPosition - getFirstVisiblePosition());
                if (childAt.isEnabled()) {
                    setSelectionFromTop(pointToPosition, childAt.getTop() - getTop());
                }
                Drawable selector = getSelector();
                if (selector != null && this.f2807k && isPressed()) {
                    selector.setState(getDrawableState());
                }
            }
        } else {
            setSelection(-1);
        }
        return onHoverEvent;
    }

    @Override // android.widget.AbsListView, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            this.f2802f = pointToPosition((int) motionEvent.getX(), (int) motionEvent.getY());
        }
        androidx.activity.b bVar = this.f2809m;
        if (bVar != null) {
            C0150i0 c0150i0 = (C0150i0) bVar.f754b;
            c0150i0.f2809m = null;
            c0150i0.removeCallbacks(bVar);
        }
        return super.onTouchEvent(motionEvent);
    }

    public void setListSelectionHidden(boolean z2) {
        this.f2805i = z2;
    }

    @Override // android.widget.AbsListView
    public void setSelector(Drawable drawable) {
        C0148h0 c0148h0 = null;
        if (drawable != null) {
            C0148h0 c0148h02 = new C0148h0();
            Drawable drawable2 = c0148h02.f2794a;
            if (drawable2 != null) {
                drawable2.setCallback(null);
            }
            c0148h02.f2794a = drawable;
            drawable.setCallback(c0148h02);
            c0148h02.f2795b = true;
            c0148h0 = c0148h02;
        }
        this.f2804h = c0148h0;
        super.setSelector(c0148h0);
        Rect rect = new Rect();
        if (drawable != null) {
            drawable.getPadding(rect);
        }
        this.f2798b = rect.left;
        this.f2799c = rect.top;
        this.f2800d = rect.right;
        this.f2801e = rect.bottom;
    }
}
