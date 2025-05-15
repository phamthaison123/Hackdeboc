package androidx.constraintlayout.widget;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import n.C0199e;
import o.e;
import org.xmlpull.v1.XmlPullParserException;
import q.b;
import q.c;
import q.d;
import q.f;
import q.g;
import q.h;
import q.n;
import q.o;
import q.q;

/* loaded from: /home/sonpt/Hackdeboc/bigbang.htb/apk/classes.dex */
public class ConstraintLayout extends ViewGroup {

    /* renamed from: a, reason: collision with root package name */
    public final SparseArray f990a;

    /* renamed from: b, reason: collision with root package name */
    public final ArrayList f991b;

    /* renamed from: c, reason: collision with root package name */
    public final e f992c;

    /* renamed from: d, reason: collision with root package name */
    public int f993d;

    /* renamed from: e, reason: collision with root package name */
    public int f994e;

    /* renamed from: f, reason: collision with root package name */
    public int f995f;

    /* renamed from: g, reason: collision with root package name */
    public int f996g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f997h;

    /* renamed from: i, reason: collision with root package name */
    public int f998i;

    /* renamed from: j, reason: collision with root package name */
    public n f999j;

    /* renamed from: k, reason: collision with root package name */
    public h f1000k;

    /* renamed from: l, reason: collision with root package name */
    public int f1001l;

    /* renamed from: m, reason: collision with root package name */
    public HashMap f1002m;

    /* renamed from: n, reason: collision with root package name */
    public final SparseArray f1003n;

    /* renamed from: o, reason: collision with root package name */
    public final q.e f1004o;

    public ConstraintLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f990a = new SparseArray();
        this.f991b = new ArrayList(4);
        this.f992c = new e();
        this.f993d = 0;
        this.f994e = 0;
        this.f995f = Integer.MAX_VALUE;
        this.f996g = Integer.MAX_VALUE;
        this.f997h = true;
        this.f998i = 263;
        this.f999j = null;
        this.f1000k = null;
        this.f1001l = -1;
        this.f1002m = new HashMap();
        this.f1003n = new SparseArray();
        this.f1004o = new q.e(this);
        c(attributeSet, 0);
    }

    public static d a() {
        d dVar = new d(-2, -2);
        dVar.f3526a = -1;
        dVar.f3528b = -1;
        dVar.f3530c = -1.0f;
        dVar.f3532d = -1;
        dVar.f3534e = -1;
        dVar.f3536f = -1;
        dVar.f3538g = -1;
        dVar.f3540h = -1;
        dVar.f3542i = -1;
        dVar.f3544j = -1;
        dVar.f3546k = -1;
        dVar.f3547l = -1;
        dVar.f3548m = -1;
        dVar.f3549n = 0;
        dVar.f3550o = 0.0f;
        dVar.f3551p = -1;
        dVar.f3552q = -1;
        dVar.f3553r = -1;
        dVar.f3554s = -1;
        dVar.f3555t = -1;
        dVar.f3556u = -1;
        dVar.f3557v = -1;
        dVar.f3558w = -1;
        dVar.f3559x = -1;
        dVar.f3560y = -1;
        dVar.f3561z = 0.5f;
        dVar.f3500A = 0.5f;
        dVar.f3501B = null;
        dVar.f3502C = 1;
        dVar.f3503D = -1.0f;
        dVar.f3504E = -1.0f;
        dVar.f3505F = 0;
        dVar.f3506G = 0;
        dVar.f3507H = 0;
        dVar.f3508I = 0;
        dVar.f3509J = 0;
        dVar.f3510K = 0;
        dVar.f3511L = 0;
        dVar.f3512M = 0;
        dVar.f3513N = 1.0f;
        dVar.f3514O = 1.0f;
        dVar.f3515P = -1;
        dVar.f3516Q = -1;
        dVar.f3517R = -1;
        dVar.f3518S = false;
        dVar.f3519T = false;
        dVar.f3520U = null;
        dVar.f3521V = true;
        dVar.f3522W = true;
        dVar.f3523X = false;
        dVar.f3524Y = false;
        dVar.f3525Z = false;
        dVar.f3527a0 = -1;
        dVar.f3529b0 = -1;
        dVar.f3531c0 = -1;
        dVar.f3533d0 = -1;
        dVar.f3535e0 = -1;
        dVar.f3537f0 = -1;
        dVar.f3539g0 = 0.5f;
        dVar.k0 = new o.d();
        return dVar;
    }

    private int getPaddingWidth() {
        int max = Math.max(0, getPaddingRight()) + Math.max(0, getPaddingLeft());
        int max2 = Math.max(0, getPaddingEnd()) + Math.max(0, getPaddingStart());
        return max2 > 0 ? max2 : max;
    }

    @Override // android.view.ViewGroup
    public void addView(View view, int i2, ViewGroup.LayoutParams layoutParams) {
        super.addView(view, i2, layoutParams);
    }

    public final o.d b(View view) {
        if (view == this) {
            return this.f992c;
        }
        if (view == null) {
            return null;
        }
        return ((d) view.getLayoutParams()).k0;
    }

    public final void c(AttributeSet attributeSet, int i2) {
        e eVar = this.f992c;
        eVar.f3300U = this;
        q.e eVar2 = this.f1004o;
        eVar.f3338g0 = eVar2;
        eVar.f3337f0.f3454f = eVar2;
        this.f990a.put(getId(), this);
        this.f999j = null;
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, q.f3676b, i2, 0);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i3 = 0; i3 < indexCount; i3++) {
                int index = obtainStyledAttributes.getIndex(i3);
                if (index == 9) {
                    this.f993d = obtainStyledAttributes.getDimensionPixelOffset(index, this.f993d);
                } else if (index == 10) {
                    this.f994e = obtainStyledAttributes.getDimensionPixelOffset(index, this.f994e);
                } else if (index == 7) {
                    this.f995f = obtainStyledAttributes.getDimensionPixelOffset(index, this.f995f);
                } else if (index == 8) {
                    this.f996g = obtainStyledAttributes.getDimensionPixelOffset(index, this.f996g);
                } else if (index == 89) {
                    this.f998i = obtainStyledAttributes.getInt(index, this.f998i);
                } else if (index == 38) {
                    int resourceId = obtainStyledAttributes.getResourceId(index, 0);
                    if (resourceId != 0) {
                        try {
                            d(resourceId);
                        } catch (Resources.NotFoundException unused) {
                            this.f1000k = null;
                        }
                    }
                } else if (index == 18) {
                    int resourceId2 = obtainStyledAttributes.getResourceId(index, 0);
                    try {
                        n nVar = new n();
                        this.f999j = nVar;
                        nVar.e(getContext(), resourceId2);
                    } catch (Resources.NotFoundException unused2) {
                        this.f999j = null;
                    }
                    this.f1001l = resourceId2;
                }
            }
            obtainStyledAttributes.recycle();
        }
        int i4 = this.f998i;
        eVar.f3346p0 = i4;
        C0199e.f3195p = (i4 & 256) == 256;
    }

    @Override // android.view.ViewGroup
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof d;
    }

    public final void d(int i2) {
        char c2;
        Context context = getContext();
        h hVar = new h();
        hVar.f3578a = new SparseArray();
        hVar.f3579b = new SparseArray();
        XmlResourceParser xml = context.getResources().getXml(i2);
        try {
            f fVar = null;
            for (int eventType = xml.getEventType(); eventType != 1; eventType = xml.next()) {
                if (eventType == 0) {
                    xml.getName();
                } else if (eventType == 2) {
                    String name = xml.getName();
                    switch (name.hashCode()) {
                        case -1349929691:
                            if (name.equals("ConstraintSet")) {
                                c2 = 4;
                                break;
                            }
                            c2 = 65535;
                            break;
                        case 80204913:
                            if (name.equals("State")) {
                                c2 = 2;
                                break;
                            }
                            c2 = 65535;
                            break;
                        case 1382829617:
                            if (name.equals("StateSet")) {
                                c2 = 1;
                                break;
                            }
                            c2 = 65535;
                            break;
                        case 1657696882:
                            if (name.equals("layoutDescription")) {
                                c2 = 0;
                                break;
                            }
                            c2 = 65535;
                            break;
                        case 1901439077:
                            if (name.equals("Variant")) {
                                c2 = 3;
                                break;
                            }
                            c2 = 65535;
                            break;
                        default:
                            c2 = 65535;
                            break;
                    }
                    if (c2 != 0 && c2 != 1) {
                        if (c2 == 2) {
                            fVar = new f(context, xml);
                            hVar.f3578a.put(fVar.f3569a, fVar);
                        } else if (c2 == 3) {
                            g gVar = new g(context, xml);
                            if (fVar != null) {
                                ((ArrayList) fVar.f3571c).add(gVar);
                            }
                        } else if (c2 != 4) {
                            Log.v("ConstraintLayoutStates", "unknown tag " + name);
                        } else {
                            hVar.a(context, xml);
                        }
                    }
                }
            }
        } catch (IOException e2) {
            e2.printStackTrace();
        } catch (XmlPullParserException e3) {
            e3.printStackTrace();
        }
        this.f1000k = hVar;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        Object tag;
        int size;
        ArrayList arrayList = this.f991b;
        if (arrayList != null && (size = arrayList.size()) > 0) {
            for (int i2 = 0; i2 < size; i2++) {
                ((b) arrayList.get(i2)).getClass();
            }
        }
        super.dispatchDraw(canvas);
        if (isInEditMode()) {
            int childCount = getChildCount();
            float width = getWidth();
            float height = getHeight();
            for (int i3 = 0; i3 < childCount; i3++) {
                View childAt = getChildAt(i3);
                if (childAt.getVisibility() != 8 && (tag = childAt.getTag()) != null && (tag instanceof String)) {
                    String[] split = ((String) tag).split(",");
                    if (split.length == 4) {
                        int parseInt = Integer.parseInt(split[0]);
                        int parseInt2 = Integer.parseInt(split[1]);
                        int parseInt3 = Integer.parseInt(split[2]);
                        int i4 = (int) ((parseInt / 1080.0f) * width);
                        int i5 = (int) ((parseInt2 / 1920.0f) * height);
                        Paint paint = new Paint();
                        paint.setColor(-65536);
                        float f2 = i4;
                        float f3 = i5;
                        float f4 = i4 + ((int) ((parseInt3 / 1080.0f) * width));
                        canvas.drawLine(f2, f3, f4, f3, paint);
                        float parseInt4 = i5 + ((int) ((Integer.parseInt(split[3]) / 1920.0f) * height));
                        canvas.drawLine(f4, f3, f4, parseInt4, paint);
                        canvas.drawLine(f4, parseInt4, f2, parseInt4, paint);
                        canvas.drawLine(f2, parseInt4, f2, f3, paint);
                        paint.setColor(-16711936);
                        canvas.drawLine(f2, f3, f4, parseInt4, paint);
                        canvas.drawLine(f2, parseInt4, f4, f3, paint);
                    }
                }
            }
        }
    }

    public final void e(int i2, int i3, int i4, int i5, boolean z2, boolean z3) {
        q.e eVar = this.f1004o;
        int i6 = eVar.f3566e;
        int resolveSizeAndState = View.resolveSizeAndState(i4 + eVar.f3565d, i2, 0);
        int resolveSizeAndState2 = View.resolveSizeAndState(i5 + i6, i3, 0) & 16777215;
        int min = Math.min(this.f995f, resolveSizeAndState & 16777215);
        int min2 = Math.min(this.f996g, resolveSizeAndState2);
        if (z2) {
            min |= 16777216;
        }
        if (z3) {
            min2 |= 16777216;
        }
        setMeasuredDimension(min, min2);
    }

    @Override // android.view.View
    public final void forceLayout() {
        this.f997h = true;
        super.forceLayout();
    }

    @Override // android.view.ViewGroup
    public final /* bridge */ /* synthetic */ ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return a();
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        int i2;
        Context context = getContext();
        d dVar = new d(context, attributeSet);
        dVar.f3526a = -1;
        dVar.f3528b = -1;
        dVar.f3530c = -1.0f;
        dVar.f3532d = -1;
        dVar.f3534e = -1;
        dVar.f3536f = -1;
        dVar.f3538g = -1;
        dVar.f3540h = -1;
        dVar.f3542i = -1;
        dVar.f3544j = -1;
        dVar.f3546k = -1;
        dVar.f3547l = -1;
        dVar.f3548m = -1;
        dVar.f3549n = 0;
        dVar.f3550o = 0.0f;
        dVar.f3551p = -1;
        dVar.f3552q = -1;
        dVar.f3553r = -1;
        dVar.f3554s = -1;
        dVar.f3555t = -1;
        dVar.f3556u = -1;
        dVar.f3557v = -1;
        dVar.f3558w = -1;
        dVar.f3559x = -1;
        dVar.f3560y = -1;
        dVar.f3561z = 0.5f;
        dVar.f3500A = 0.5f;
        dVar.f3501B = null;
        dVar.f3502C = 1;
        dVar.f3503D = -1.0f;
        dVar.f3504E = -1.0f;
        dVar.f3505F = 0;
        dVar.f3506G = 0;
        dVar.f3507H = 0;
        dVar.f3508I = 0;
        dVar.f3509J = 0;
        dVar.f3510K = 0;
        dVar.f3511L = 0;
        dVar.f3512M = 0;
        dVar.f3513N = 1.0f;
        dVar.f3514O = 1.0f;
        dVar.f3515P = -1;
        dVar.f3516Q = -1;
        dVar.f3517R = -1;
        dVar.f3518S = false;
        dVar.f3519T = false;
        dVar.f3520U = null;
        dVar.f3521V = true;
        dVar.f3522W = true;
        dVar.f3523X = false;
        dVar.f3524Y = false;
        dVar.f3525Z = false;
        dVar.f3527a0 = -1;
        dVar.f3529b0 = -1;
        dVar.f3531c0 = -1;
        dVar.f3533d0 = -1;
        dVar.f3535e0 = -1;
        dVar.f3537f0 = -1;
        dVar.f3539g0 = 0.5f;
        dVar.k0 = new o.d();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, q.f3676b);
        int indexCount = obtainStyledAttributes.getIndexCount();
        for (int i3 = 0; i3 < indexCount; i3++) {
            int index = obtainStyledAttributes.getIndex(i3);
            int i4 = c.f3499a.get(index);
            switch (i4) {
                case 1:
                    dVar.f3517R = obtainStyledAttributes.getInt(index, dVar.f3517R);
                    break;
                case 2:
                    int resourceId = obtainStyledAttributes.getResourceId(index, dVar.f3548m);
                    dVar.f3548m = resourceId;
                    if (resourceId == -1) {
                        dVar.f3548m = obtainStyledAttributes.getInt(index, -1);
                        break;
                    } else {
                        break;
                    }
                case 3:
                    dVar.f3549n = obtainStyledAttributes.getDimensionPixelSize(index, dVar.f3549n);
                    break;
                case 4:
                    float f2 = obtainStyledAttributes.getFloat(index, dVar.f3550o) % 360.0f;
                    dVar.f3550o = f2;
                    if (f2 < 0.0f) {
                        dVar.f3550o = (360.0f - f2) % 360.0f;
                        break;
                    } else {
                        break;
                    }
                case 5:
                    dVar.f3526a = obtainStyledAttributes.getDimensionPixelOffset(index, dVar.f3526a);
                    break;
                case 6:
                    dVar.f3528b = obtainStyledAttributes.getDimensionPixelOffset(index, dVar.f3528b);
                    break;
                case 7:
                    dVar.f3530c = obtainStyledAttributes.getFloat(index, dVar.f3530c);
                    break;
                case 8:
                    int resourceId2 = obtainStyledAttributes.getResourceId(index, dVar.f3532d);
                    dVar.f3532d = resourceId2;
                    if (resourceId2 == -1) {
                        dVar.f3532d = obtainStyledAttributes.getInt(index, -1);
                        break;
                    } else {
                        break;
                    }
                case 9:
                    int resourceId3 = obtainStyledAttributes.getResourceId(index, dVar.f3534e);
                    dVar.f3534e = resourceId3;
                    if (resourceId3 == -1) {
                        dVar.f3534e = obtainStyledAttributes.getInt(index, -1);
                        break;
                    } else {
                        break;
                    }
                case 10:
                    int resourceId4 = obtainStyledAttributes.getResourceId(index, dVar.f3536f);
                    dVar.f3536f = resourceId4;
                    if (resourceId4 == -1) {
                        dVar.f3536f = obtainStyledAttributes.getInt(index, -1);
                        break;
                    } else {
                        break;
                    }
                case 11:
                    int resourceId5 = obtainStyledAttributes.getResourceId(index, dVar.f3538g);
                    dVar.f3538g = resourceId5;
                    if (resourceId5 == -1) {
                        dVar.f3538g = obtainStyledAttributes.getInt(index, -1);
                        break;
                    } else {
                        break;
                    }
                case 12:
                    int resourceId6 = obtainStyledAttributes.getResourceId(index, dVar.f3540h);
                    dVar.f3540h = resourceId6;
                    if (resourceId6 == -1) {
                        dVar.f3540h = obtainStyledAttributes.getInt(index, -1);
                        break;
                    } else {
                        break;
                    }
                case 13:
                    int resourceId7 = obtainStyledAttributes.getResourceId(index, dVar.f3542i);
                    dVar.f3542i = resourceId7;
                    if (resourceId7 == -1) {
                        dVar.f3542i = obtainStyledAttributes.getInt(index, -1);
                        break;
                    } else {
                        break;
                    }
                case 14:
                    int resourceId8 = obtainStyledAttributes.getResourceId(index, dVar.f3544j);
                    dVar.f3544j = resourceId8;
                    if (resourceId8 == -1) {
                        dVar.f3544j = obtainStyledAttributes.getInt(index, -1);
                        break;
                    } else {
                        break;
                    }
                case 15:
                    int resourceId9 = obtainStyledAttributes.getResourceId(index, dVar.f3546k);
                    dVar.f3546k = resourceId9;
                    if (resourceId9 == -1) {
                        dVar.f3546k = obtainStyledAttributes.getInt(index, -1);
                        break;
                    } else {
                        break;
                    }
                case 16:
                    int resourceId10 = obtainStyledAttributes.getResourceId(index, dVar.f3547l);
                    dVar.f3547l = resourceId10;
                    if (resourceId10 == -1) {
                        dVar.f3547l = obtainStyledAttributes.getInt(index, -1);
                        break;
                    } else {
                        break;
                    }
                case 17:
                    int resourceId11 = obtainStyledAttributes.getResourceId(index, dVar.f3551p);
                    dVar.f3551p = resourceId11;
                    if (resourceId11 == -1) {
                        dVar.f3551p = obtainStyledAttributes.getInt(index, -1);
                        break;
                    } else {
                        break;
                    }
                case 18:
                    int resourceId12 = obtainStyledAttributes.getResourceId(index, dVar.f3552q);
                    dVar.f3552q = resourceId12;
                    if (resourceId12 == -1) {
                        dVar.f3552q = obtainStyledAttributes.getInt(index, -1);
                        break;
                    } else {
                        break;
                    }
                case 19:
                    int resourceId13 = obtainStyledAttributes.getResourceId(index, dVar.f3553r);
                    dVar.f3553r = resourceId13;
                    if (resourceId13 == -1) {
                        dVar.f3553r = obtainStyledAttributes.getInt(index, -1);
                        break;
                    } else {
                        break;
                    }
                case 20:
                    int resourceId14 = obtainStyledAttributes.getResourceId(index, dVar.f3554s);
                    dVar.f3554s = resourceId14;
                    if (resourceId14 == -1) {
                        dVar.f3554s = obtainStyledAttributes.getInt(index, -1);
                        break;
                    } else {
                        break;
                    }
                case 21:
                    dVar.f3555t = obtainStyledAttributes.getDimensionPixelSize(index, dVar.f3555t);
                    break;
                case 22:
                    dVar.f3556u = obtainStyledAttributes.getDimensionPixelSize(index, dVar.f3556u);
                    break;
                case 23:
                    dVar.f3557v = obtainStyledAttributes.getDimensionPixelSize(index, dVar.f3557v);
                    break;
                case 24:
                    dVar.f3558w = obtainStyledAttributes.getDimensionPixelSize(index, dVar.f3558w);
                    break;
                case 25:
                    dVar.f3559x = obtainStyledAttributes.getDimensionPixelSize(index, dVar.f3559x);
                    break;
                case 26:
                    dVar.f3560y = obtainStyledAttributes.getDimensionPixelSize(index, dVar.f3560y);
                    break;
                case 27:
                    dVar.f3518S = obtainStyledAttributes.getBoolean(index, dVar.f3518S);
                    break;
                case 28:
                    dVar.f3519T = obtainStyledAttributes.getBoolean(index, dVar.f3519T);
                    break;
                case 29:
                    dVar.f3561z = obtainStyledAttributes.getFloat(index, dVar.f3561z);
                    break;
                case 30:
                    dVar.f3500A = obtainStyledAttributes.getFloat(index, dVar.f3500A);
                    break;
                case 31:
                    int i5 = obtainStyledAttributes.getInt(index, 0);
                    dVar.f3507H = i5;
                    if (i5 == 1) {
                        Log.e("ConstraintLayout", "layout_constraintWidth_default=\"wrap\" is deprecated.\nUse layout_width=\"WRAP_CONTENT\" and layout_constrainedWidth=\"true\" instead.");
                        break;
                    } else {
                        break;
                    }
                case 32:
                    int i6 = obtainStyledAttributes.getInt(index, 0);
                    dVar.f3508I = i6;
                    if (i6 == 1) {
                        Log.e("ConstraintLayout", "layout_constraintHeight_default=\"wrap\" is deprecated.\nUse layout_height=\"WRAP_CONTENT\" and layout_constrainedHeight=\"true\" instead.");
                        break;
                    } else {
                        break;
                    }
                case 33:
                    try {
                        dVar.f3509J = obtainStyledAttributes.getDimensionPixelSize(index, dVar.f3509J);
                        break;
                    } catch (Exception unused) {
                        if (obtainStyledAttributes.getInt(index, dVar.f3509J) == -2) {
                            dVar.f3509J = -2;
                            break;
                        } else {
                            break;
                        }
                    }
                case 34:
                    try {
                        dVar.f3511L = obtainStyledAttributes.getDimensionPixelSize(index, dVar.f3511L);
                        break;
                    } catch (Exception unused2) {
                        if (obtainStyledAttributes.getInt(index, dVar.f3511L) == -2) {
                            dVar.f3511L = -2;
                            break;
                        } else {
                            break;
                        }
                    }
                case 35:
                    dVar.f3513N = Math.max(0.0f, obtainStyledAttributes.getFloat(index, dVar.f3513N));
                    dVar.f3507H = 2;
                    break;
                case 36:
                    try {
                        dVar.f3510K = obtainStyledAttributes.getDimensionPixelSize(index, dVar.f3510K);
                        break;
                    } catch (Exception unused3) {
                        if (obtainStyledAttributes.getInt(index, dVar.f3510K) == -2) {
                            dVar.f3510K = -2;
                            break;
                        } else {
                            break;
                        }
                    }
                case 37:
                    try {
                        dVar.f3512M = obtainStyledAttributes.getDimensionPixelSize(index, dVar.f3512M);
                        break;
                    } catch (Exception unused4) {
                        if (obtainStyledAttributes.getInt(index, dVar.f3512M) == -2) {
                            dVar.f3512M = -2;
                            break;
                        } else {
                            break;
                        }
                    }
                case 38:
                    dVar.f3514O = Math.max(0.0f, obtainStyledAttributes.getFloat(index, dVar.f3514O));
                    dVar.f3508I = 2;
                    break;
                default:
                    switch (i4) {
                        case 44:
                            String string = obtainStyledAttributes.getString(index);
                            dVar.f3501B = string;
                            dVar.f3502C = -1;
                            if (string != null) {
                                int length = string.length();
                                int indexOf = dVar.f3501B.indexOf(44);
                                if (indexOf <= 0 || indexOf >= length - 1) {
                                    i2 = 0;
                                } else {
                                    String substring = dVar.f3501B.substring(0, indexOf);
                                    if (substring.equalsIgnoreCase("W")) {
                                        dVar.f3502C = 0;
                                    } else if (substring.equalsIgnoreCase("H")) {
                                        dVar.f3502C = 1;
                                    }
                                    i2 = indexOf + 1;
                                }
                                int indexOf2 = dVar.f3501B.indexOf(58);
                                if (indexOf2 < 0 || indexOf2 >= length - 1) {
                                    String substring2 = dVar.f3501B.substring(i2);
                                    if (substring2.length() > 0) {
                                        Float.parseFloat(substring2);
                                        break;
                                    } else {
                                        break;
                                    }
                                } else {
                                    String substring3 = dVar.f3501B.substring(i2, indexOf2);
                                    String substring4 = dVar.f3501B.substring(indexOf2 + 1);
                                    if (substring3.length() > 0 && substring4.length() > 0) {
                                        try {
                                            float parseFloat = Float.parseFloat(substring3);
                                            float parseFloat2 = Float.parseFloat(substring4);
                                            if (parseFloat > 0.0f && parseFloat2 > 0.0f) {
                                                if (dVar.f3502C == 1) {
                                                    Math.abs(parseFloat2 / parseFloat);
                                                    break;
                                                } else {
                                                    Math.abs(parseFloat / parseFloat2);
                                                    break;
                                                }
                                            }
                                        } catch (NumberFormatException unused5) {
                                            break;
                                        }
                                    }
                                }
                            } else {
                                break;
                            }
                            break;
                        case 45:
                            dVar.f3503D = obtainStyledAttributes.getFloat(index, dVar.f3503D);
                            break;
                        case 46:
                            dVar.f3504E = obtainStyledAttributes.getFloat(index, dVar.f3504E);
                            break;
                        case 47:
                            dVar.f3505F = obtainStyledAttributes.getInt(index, 0);
                            break;
                        case 48:
                            dVar.f3506G = obtainStyledAttributes.getInt(index, 0);
                            break;
                        case 49:
                            dVar.f3515P = obtainStyledAttributes.getDimensionPixelOffset(index, dVar.f3515P);
                            break;
                        case 50:
                            dVar.f3516Q = obtainStyledAttributes.getDimensionPixelOffset(index, dVar.f3516Q);
                            break;
                        case 51:
                            dVar.f3520U = obtainStyledAttributes.getString(index);
                            break;
                    }
            }
        }
        obtainStyledAttributes.recycle();
        dVar.a();
        return dVar;
    }

    public int getMaxHeight() {
        return this.f996g;
    }

    public int getMaxWidth() {
        return this.f995f;
    }

    public int getMinHeight() {
        return this.f994e;
    }

    public int getMinWidth() {
        return this.f993d;
    }

    public int getOptimizationLevel() {
        return this.f992c.f3346p0;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean z2, int i2, int i3, int i4, int i5) {
        int childCount = getChildCount();
        boolean isInEditMode = isInEditMode();
        for (int i6 = 0; i6 < childCount; i6++) {
            View childAt = getChildAt(i6);
            d dVar = (d) childAt.getLayoutParams();
            o.d dVar2 = dVar.k0;
            if (childAt.getVisibility() != 8 || dVar.f3524Y || dVar.f3525Z || isInEditMode) {
                int k2 = dVar2.k();
                int l2 = dVar2.l();
                childAt.layout(k2, l2, dVar2.j() + k2, dVar2.g() + l2);
            }
        }
        ArrayList arrayList = this.f991b;
        int size = arrayList.size();
        if (size > 0) {
            for (int i7 = 0; i7 < size; i7++) {
                ((b) arrayList.get(i7)).getClass();
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:589:0x0c1b, code lost:
    
        if (r0 != false) goto L650;
     */
    /* JADX WARN: Removed duplicated region for block: B:274:0x0328  */
    /* JADX WARN: Removed duplicated region for block: B:279:0x0358  */
    /* JADX WARN: Removed duplicated region for block: B:284:0x0391  */
    /* JADX WARN: Removed duplicated region for block: B:289:0x03c3  */
    /* JADX WARN: Removed duplicated region for block: B:298:0x041c  */
    /* JADX WARN: Removed duplicated region for block: B:301:0x0424  */
    /* JADX WARN: Removed duplicated region for block: B:303:0x0413  */
    /* JADX WARN: Removed duplicated region for block: B:304:0x03a7  */
    /* JADX WARN: Removed duplicated region for block: B:309:0x0374  */
    /* JADX WARN: Removed duplicated region for block: B:314:0x033d  */
    /* JADX WARN: Removed duplicated region for block: B:355:0x06b4  */
    /* JADX WARN: Removed duplicated region for block: B:362:0x06eb  */
    /* JADX WARN: Removed duplicated region for block: B:367:0x0724  */
    /* JADX WARN: Removed duplicated region for block: B:370:0x072e  */
    /* JADX WARN: Removed duplicated region for block: B:373:0x0752  */
    /* JADX WARN: Removed duplicated region for block: B:375:0x0757  */
    /* JADX WARN: Removed duplicated region for block: B:379:0x0762  */
    /* JADX WARN: Removed duplicated region for block: B:399:0x07bc A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:403:0x07c6  */
    /* JADX WARN: Removed duplicated region for block: B:435:0x0919  */
    /* JADX WARN: Removed duplicated region for block: B:449:0x0936  */
    /* JADX WARN: Removed duplicated region for block: B:472:0x0a30  */
    /* JADX WARN: Removed duplicated region for block: B:478:0x0a35  */
    /* JADX WARN: Removed duplicated region for block: B:513:0x0ac0  */
    /* JADX WARN: Removed duplicated region for block: B:515:0x0ac5  */
    /* JADX WARN: Removed duplicated region for block: B:596:0x0c29  */
    /* JADX WARN: Removed duplicated region for block: B:598:0x0c2b  */
    /* JADX WARN: Removed duplicated region for block: B:599:0x0aae  */
    /* JADX WARN: Removed duplicated region for block: B:665:0x0a21  */
    /* JADX WARN: Removed duplicated region for block: B:686:0x0754  */
    /* JADX WARN: Removed duplicated region for block: B:687:0x0731  */
    /* JADX WARN: Removed duplicated region for block: B:688:0x0727  */
    /* JADX WARN: Removed duplicated region for block: B:696:0x06d5  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onMeasure(int r40, int r41) {
        /*
            Method dump skipped, instructions count: 3142
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.widget.ConstraintLayout.onMeasure(int, int):void");
    }

    @Override // android.view.ViewGroup
    public final void onViewAdded(View view) {
        super.onViewAdded(view);
        o.d b2 = b(view);
        if ((view instanceof Guideline) && !(b2 instanceof o.f)) {
            d dVar = (d) view.getLayoutParams();
            o.f fVar = new o.f();
            dVar.k0 = fVar;
            dVar.f3524Y = true;
            fVar.y(dVar.f3517R);
        }
        if (view instanceof b) {
            b bVar = (b) view;
            bVar.d();
            ((d) view.getLayoutParams()).f3525Z = true;
            ArrayList arrayList = this.f991b;
            if (!arrayList.contains(bVar)) {
                arrayList.add(bVar);
            }
        }
        this.f990a.put(view.getId(), view);
        this.f997h = true;
    }

    @Override // android.view.ViewGroup
    public void onViewRemoved(View view) {
        super.onViewRemoved(view);
        this.f990a.remove(view.getId());
        o.d b2 = b(view);
        this.f992c.f3335d0.remove(b2);
        b2.f3288I = null;
        this.f991b.remove(view);
        this.f997h = true;
    }

    @Override // android.view.ViewGroup, android.view.ViewManager
    public final void removeView(View view) {
        super.removeView(view);
    }

    @Override // android.view.View, android.view.ViewParent
    public final void requestLayout() {
        this.f997h = true;
        super.requestLayout();
    }

    public void setConstraintSet(n nVar) {
        this.f999j = nVar;
    }

    @Override // android.view.View
    public void setId(int i2) {
        int id = getId();
        SparseArray sparseArray = this.f990a;
        sparseArray.remove(id);
        super.setId(i2);
        sparseArray.put(getId(), this);
    }

    public void setMaxHeight(int i2) {
        if (i2 == this.f996g) {
            return;
        }
        this.f996g = i2;
        requestLayout();
    }

    public void setMaxWidth(int i2) {
        if (i2 == this.f995f) {
            return;
        }
        this.f995f = i2;
        requestLayout();
    }

    public void setMinHeight(int i2) {
        if (i2 == this.f994e) {
            return;
        }
        this.f994e = i2;
        requestLayout();
    }

    public void setMinWidth(int i2) {
        if (i2 == this.f993d) {
            return;
        }
        this.f993d = i2;
        requestLayout();
    }

    public void setOnConstraintsChanged(o oVar) {
        h hVar = this.f1000k;
        if (hVar != null) {
            hVar.getClass();
        }
    }

    public void setOptimizationLevel(int i2) {
        this.f998i = i2;
        this.f992c.f3346p0 = i2;
        C0199e.f3195p = (i2 & 256) == 256;
    }

    @Override // android.view.ViewGroup
    public final boolean shouldDelayChildPressedState() {
        return false;
    }

    public ConstraintLayout(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        this.f990a = new SparseArray();
        this.f991b = new ArrayList(4);
        this.f992c = new e();
        this.f993d = 0;
        this.f994e = 0;
        this.f995f = Integer.MAX_VALUE;
        this.f996g = Integer.MAX_VALUE;
        this.f997h = true;
        this.f998i = 263;
        this.f999j = null;
        this.f1000k = null;
        this.f1001l = -1;
        this.f1002m = new HashMap();
        this.f1003n = new SparseArray();
        this.f1004o = new q.e(this);
        c(attributeSet, i2);
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        d dVar = new d(layoutParams);
        dVar.f3526a = -1;
        dVar.f3528b = -1;
        dVar.f3530c = -1.0f;
        dVar.f3532d = -1;
        dVar.f3534e = -1;
        dVar.f3536f = -1;
        dVar.f3538g = -1;
        dVar.f3540h = -1;
        dVar.f3542i = -1;
        dVar.f3544j = -1;
        dVar.f3546k = -1;
        dVar.f3547l = -1;
        dVar.f3548m = -1;
        dVar.f3549n = 0;
        dVar.f3550o = 0.0f;
        dVar.f3551p = -1;
        dVar.f3552q = -1;
        dVar.f3553r = -1;
        dVar.f3554s = -1;
        dVar.f3555t = -1;
        dVar.f3556u = -1;
        dVar.f3557v = -1;
        dVar.f3558w = -1;
        dVar.f3559x = -1;
        dVar.f3560y = -1;
        dVar.f3561z = 0.5f;
        dVar.f3500A = 0.5f;
        dVar.f3501B = null;
        dVar.f3502C = 1;
        dVar.f3503D = -1.0f;
        dVar.f3504E = -1.0f;
        dVar.f3505F = 0;
        dVar.f3506G = 0;
        dVar.f3507H = 0;
        dVar.f3508I = 0;
        dVar.f3509J = 0;
        dVar.f3510K = 0;
        dVar.f3511L = 0;
        dVar.f3512M = 0;
        dVar.f3513N = 1.0f;
        dVar.f3514O = 1.0f;
        dVar.f3515P = -1;
        dVar.f3516Q = -1;
        dVar.f3517R = -1;
        dVar.f3518S = false;
        dVar.f3519T = false;
        dVar.f3520U = null;
        dVar.f3521V = true;
        dVar.f3522W = true;
        dVar.f3523X = false;
        dVar.f3524Y = false;
        dVar.f3525Z = false;
        dVar.f3527a0 = -1;
        dVar.f3529b0 = -1;
        dVar.f3531c0 = -1;
        dVar.f3533d0 = -1;
        dVar.f3535e0 = -1;
        dVar.f3537f0 = -1;
        dVar.f3539g0 = 0.5f;
        dVar.k0 = new o.d();
        return dVar;
    }
}
