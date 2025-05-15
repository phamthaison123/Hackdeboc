package q;

import android.content.Context;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.util.TypedValue;
import android.util.Xml;
import java.util.HashMap;
import n.AbstractC0204j;

/* renamed from: q.a, reason: case insensitive filesystem */
/* loaded from: /home/sonpt/Hackdeboc/bigbang.htb/apk/classes.dex */
public final class C0212a {

    /* renamed from: a, reason: collision with root package name */
    public int f3487a;

    /* renamed from: b, reason: collision with root package name */
    public int f3488b;

    /* renamed from: c, reason: collision with root package name */
    public float f3489c;

    /* renamed from: d, reason: collision with root package name */
    public String f3490d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f3491e;

    /* renamed from: f, reason: collision with root package name */
    public int f3492f;

    public C0212a(C0212a c0212a, Object obj) {
        c0212a.getClass();
        this.f3487a = c0212a.f3487a;
        b(obj);
    }

    public static void a(Context context, XmlResourceParser xmlResourceParser, HashMap hashMap) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(Xml.asAttributeSet(xmlResourceParser), q.f3677c);
        int indexCount = obtainStyledAttributes.getIndexCount();
        String str = null;
        int i2 = 0;
        Object obj = null;
        for (int i3 = 0; i3 < indexCount; i3++) {
            int index = obtainStyledAttributes.getIndex(i3);
            if (index == 0) {
                str = obtainStyledAttributes.getString(index);
                if (str != null && str.length() > 0) {
                    str = Character.toUpperCase(str.charAt(0)) + str.substring(1);
                }
            } else if (index == 1) {
                obj = Boolean.valueOf(obtainStyledAttributes.getBoolean(index, false));
                i2 = 6;
            } else {
                int i4 = 3;
                if (index == 3) {
                    obj = Integer.valueOf(obtainStyledAttributes.getColor(index, 0));
                } else {
                    i4 = 4;
                    if (index == 2) {
                        obj = Integer.valueOf(obtainStyledAttributes.getColor(index, 0));
                    } else {
                        if (index == 7) {
                            obj = Float.valueOf(TypedValue.applyDimension(1, obtainStyledAttributes.getDimension(index, 0.0f), context.getResources().getDisplayMetrics()));
                        } else if (index == 4) {
                            obj = Float.valueOf(obtainStyledAttributes.getDimension(index, 0.0f));
                        } else {
                            i4 = 5;
                            if (index == 5) {
                                obj = Float.valueOf(obtainStyledAttributes.getFloat(index, Float.NaN));
                                i2 = 2;
                            } else if (index == 6) {
                                obj = Integer.valueOf(obtainStyledAttributes.getInteger(index, -1));
                                i2 = 1;
                            } else if (index == 8) {
                                obj = obtainStyledAttributes.getString(index);
                            }
                        }
                        i2 = 7;
                    }
                }
                i2 = i4;
            }
        }
        if (str != null && obj != null) {
            C0212a c0212a = new C0212a();
            c0212a.f3487a = i2;
            c0212a.b(obj);
            hashMap.put(str, c0212a);
        }
        obtainStyledAttributes.recycle();
    }

    public final void b(Object obj) {
        switch (AbstractC0204j.a(this.f3487a)) {
            case 0:
                this.f3488b = ((Integer) obj).intValue();
                break;
            case 1:
                this.f3489c = ((Float) obj).floatValue();
                break;
            case 2:
            case 3:
                this.f3492f = ((Integer) obj).intValue();
                break;
            case 4:
                this.f3490d = (String) obj;
                break;
            case 5:
                this.f3491e = ((Boolean) obj).booleanValue();
                break;
            case 6:
                this.f3489c = ((Float) obj).floatValue();
                break;
        }
    }
}
