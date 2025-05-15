package q;

import android.content.Context;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseIntArray;
import android.util.Xml;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.Barrier;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Guideline;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import m.AbstractC0194a;
import n.AbstractC0204j;
import org.xmlpull.v1.XmlPullParserException;

/* loaded from: /home/sonpt/Hackdeboc/bigbang.htb/apk/classes.dex */
public final class n {

    /* renamed from: d, reason: collision with root package name */
    public static final int[] f3670d = {0, 4, 8};

    /* renamed from: e, reason: collision with root package name */
    public static final SparseIntArray f3671e;

    /* renamed from: a, reason: collision with root package name */
    public final HashMap f3672a = new HashMap();

    /* renamed from: b, reason: collision with root package name */
    public final boolean f3673b = true;

    /* renamed from: c, reason: collision with root package name */
    public final HashMap f3674c = new HashMap();

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f3671e = sparseIntArray;
        sparseIntArray.append(76, 25);
        sparseIntArray.append(77, 26);
        sparseIntArray.append(79, 29);
        sparseIntArray.append(80, 30);
        sparseIntArray.append(86, 36);
        sparseIntArray.append(85, 35);
        sparseIntArray.append(58, 4);
        sparseIntArray.append(57, 3);
        sparseIntArray.append(55, 1);
        sparseIntArray.append(94, 6);
        sparseIntArray.append(95, 7);
        sparseIntArray.append(65, 17);
        sparseIntArray.append(66, 18);
        sparseIntArray.append(67, 19);
        sparseIntArray.append(0, 27);
        sparseIntArray.append(81, 32);
        sparseIntArray.append(82, 33);
        sparseIntArray.append(64, 10);
        sparseIntArray.append(63, 9);
        sparseIntArray.append(98, 13);
        sparseIntArray.append(101, 16);
        sparseIntArray.append(99, 14);
        sparseIntArray.append(96, 11);
        sparseIntArray.append(100, 15);
        sparseIntArray.append(97, 12);
        sparseIntArray.append(89, 40);
        sparseIntArray.append(74, 39);
        sparseIntArray.append(73, 41);
        sparseIntArray.append(88, 42);
        sparseIntArray.append(72, 20);
        sparseIntArray.append(87, 37);
        sparseIntArray.append(62, 5);
        sparseIntArray.append(75, 82);
        sparseIntArray.append(84, 82);
        sparseIntArray.append(78, 82);
        sparseIntArray.append(56, 82);
        sparseIntArray.append(54, 82);
        sparseIntArray.append(5, 24);
        sparseIntArray.append(7, 28);
        sparseIntArray.append(23, 31);
        sparseIntArray.append(24, 8);
        sparseIntArray.append(6, 34);
        sparseIntArray.append(8, 2);
        sparseIntArray.append(3, 23);
        sparseIntArray.append(4, 21);
        sparseIntArray.append(2, 22);
        sparseIntArray.append(13, 43);
        sparseIntArray.append(26, 44);
        sparseIntArray.append(21, 45);
        sparseIntArray.append(22, 46);
        sparseIntArray.append(20, 60);
        sparseIntArray.append(18, 47);
        sparseIntArray.append(19, 48);
        sparseIntArray.append(14, 49);
        sparseIntArray.append(15, 50);
        sparseIntArray.append(16, 51);
        sparseIntArray.append(17, 52);
        sparseIntArray.append(25, 53);
        sparseIntArray.append(90, 54);
        sparseIntArray.append(68, 55);
        sparseIntArray.append(91, 56);
        sparseIntArray.append(69, 57);
        sparseIntArray.append(92, 58);
        sparseIntArray.append(70, 59);
        sparseIntArray.append(59, 61);
        sparseIntArray.append(61, 62);
        sparseIntArray.append(60, 63);
        sparseIntArray.append(27, 64);
        sparseIntArray.append(106, 65);
        sparseIntArray.append(33, 66);
        sparseIntArray.append(107, 67);
        sparseIntArray.append(103, 79);
        sparseIntArray.append(1, 38);
        sparseIntArray.append(102, 68);
        sparseIntArray.append(93, 69);
        sparseIntArray.append(71, 70);
        sparseIntArray.append(31, 71);
        sparseIntArray.append(29, 72);
        sparseIntArray.append(30, 73);
        sparseIntArray.append(32, 74);
        sparseIntArray.append(28, 75);
        sparseIntArray.append(104, 76);
        sparseIntArray.append(83, 77);
        sparseIntArray.append(108, 78);
        sparseIntArray.append(53, 80);
        sparseIntArray.append(52, 81);
    }

    public static int[] c(Barrier barrier, String str) {
        int i2;
        HashMap hashMap;
        String[] split = str.split(",");
        Context context = barrier.getContext();
        int[] iArr = new int[split.length];
        int i3 = 0;
        int i4 = 0;
        while (i3 < split.length) {
            String trim = split[i3].trim();
            Object obj = null;
            try {
                i2 = p.class.getField(trim).getInt(null);
            } catch (Exception unused) {
                i2 = 0;
            }
            if (i2 == 0) {
                i2 = context.getResources().getIdentifier(trim, "id", context.getPackageName());
            }
            if (i2 == 0 && barrier.isInEditMode() && (barrier.getParent() instanceof ConstraintLayout)) {
                ConstraintLayout constraintLayout = (ConstraintLayout) barrier.getParent();
                constraintLayout.getClass();
                if ((trim instanceof String) && (hashMap = constraintLayout.f1002m) != null && hashMap.containsKey(trim)) {
                    obj = constraintLayout.f1002m.get(trim);
                }
                if (obj != null && (obj instanceof Integer)) {
                    i2 = ((Integer) obj).intValue();
                }
            }
            iArr[i4] = i2;
            i3++;
            i4++;
        }
        return i4 != split.length ? Arrays.copyOf(iArr, i4) : iArr;
    }

    public static i d(Context context, AttributeSet attributeSet) {
        i iVar = new i();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, q.f3675a);
        int indexCount = obtainStyledAttributes.getIndexCount();
        for (int i2 = 0; i2 < indexCount; i2++) {
            int index = obtainStyledAttributes.getIndex(i2);
            l lVar = iVar.f3581b;
            k kVar = iVar.f3582c;
            m mVar = iVar.f3584e;
            j jVar = iVar.f3583d;
            if (index != 1 && 23 != index && 24 != index) {
                kVar.getClass();
                jVar.getClass();
                lVar.getClass();
                mVar.getClass();
            }
            SparseIntArray sparseIntArray = f3671e;
            switch (sparseIntArray.get(index)) {
                case 1:
                    jVar.f3636o = f(obtainStyledAttributes, index, jVar.f3636o);
                    break;
                case 2:
                    jVar.f3592F = obtainStyledAttributes.getDimensionPixelSize(index, jVar.f3592F);
                    break;
                case 3:
                    jVar.f3635n = f(obtainStyledAttributes, index, jVar.f3635n);
                    break;
                case 4:
                    jVar.f3634m = f(obtainStyledAttributes, index, jVar.f3634m);
                    break;
                case 5:
                    jVar.f3643v = obtainStyledAttributes.getString(index);
                    break;
                case 6:
                    jVar.f3647z = obtainStyledAttributes.getDimensionPixelOffset(index, jVar.f3647z);
                    break;
                case 7:
                    jVar.f3587A = obtainStyledAttributes.getDimensionPixelOffset(index, jVar.f3587A);
                    break;
                case 8:
                    jVar.f3593G = obtainStyledAttributes.getDimensionPixelSize(index, jVar.f3593G);
                    break;
                case 9:
                    jVar.f3640s = f(obtainStyledAttributes, index, jVar.f3640s);
                    break;
                case 10:
                    jVar.f3639r = f(obtainStyledAttributes, index, jVar.f3639r);
                    break;
                case 11:
                    jVar.f3598L = obtainStyledAttributes.getDimensionPixelSize(index, jVar.f3598L);
                    break;
                case 12:
                    jVar.f3599M = obtainStyledAttributes.getDimensionPixelSize(index, jVar.f3599M);
                    break;
                case 13:
                    jVar.f3595I = obtainStyledAttributes.getDimensionPixelSize(index, jVar.f3595I);
                    break;
                case 14:
                    jVar.f3597K = obtainStyledAttributes.getDimensionPixelSize(index, jVar.f3597K);
                    break;
                case 15:
                    jVar.f3600N = obtainStyledAttributes.getDimensionPixelSize(index, jVar.f3600N);
                    break;
                case 16:
                    jVar.f3596J = obtainStyledAttributes.getDimensionPixelSize(index, jVar.f3596J);
                    break;
                case 17:
                    jVar.f3619d = obtainStyledAttributes.getDimensionPixelOffset(index, jVar.f3619d);
                    break;
                case 18:
                    jVar.f3621e = obtainStyledAttributes.getDimensionPixelOffset(index, jVar.f3621e);
                    break;
                case 19:
                    jVar.f3623f = obtainStyledAttributes.getFloat(index, jVar.f3623f);
                    break;
                case 20:
                    jVar.f3641t = obtainStyledAttributes.getFloat(index, jVar.f3641t);
                    break;
                case 21:
                    jVar.f3617c = obtainStyledAttributes.getLayoutDimension(index, jVar.f3617c);
                    break;
                case 22:
                    lVar.f3653a = f3670d[obtainStyledAttributes.getInt(index, lVar.f3653a)];
                    break;
                case 23:
                    jVar.f3615b = obtainStyledAttributes.getLayoutDimension(index, jVar.f3615b);
                    break;
                case 24:
                    jVar.f3589C = obtainStyledAttributes.getDimensionPixelSize(index, jVar.f3589C);
                    break;
                case 25:
                    jVar.f3625g = f(obtainStyledAttributes, index, jVar.f3625g);
                    break;
                case 26:
                    jVar.f3627h = f(obtainStyledAttributes, index, jVar.f3627h);
                    break;
                case 27:
                    jVar.f3588B = obtainStyledAttributes.getInt(index, jVar.f3588B);
                    break;
                case 28:
                    jVar.f3590D = obtainStyledAttributes.getDimensionPixelSize(index, jVar.f3590D);
                    break;
                case 29:
                    jVar.f3629i = f(obtainStyledAttributes, index, jVar.f3629i);
                    break;
                case 30:
                    jVar.f3631j = f(obtainStyledAttributes, index, jVar.f3631j);
                    break;
                case 31:
                    jVar.f3594H = obtainStyledAttributes.getDimensionPixelSize(index, jVar.f3594H);
                    break;
                case 32:
                    jVar.f3637p = f(obtainStyledAttributes, index, jVar.f3637p);
                    break;
                case 33:
                    jVar.f3638q = f(obtainStyledAttributes, index, jVar.f3638q);
                    break;
                case 34:
                    jVar.f3591E = obtainStyledAttributes.getDimensionPixelSize(index, jVar.f3591E);
                    break;
                case 35:
                    jVar.f3633l = f(obtainStyledAttributes, index, jVar.f3633l);
                    break;
                case 36:
                    jVar.f3632k = f(obtainStyledAttributes, index, jVar.f3632k);
                    break;
                case 37:
                    jVar.f3642u = obtainStyledAttributes.getFloat(index, jVar.f3642u);
                    break;
                case 38:
                    iVar.f3580a = obtainStyledAttributes.getResourceId(index, iVar.f3580a);
                    break;
                case 39:
                    jVar.f3602P = obtainStyledAttributes.getFloat(index, jVar.f3602P);
                    break;
                case 40:
                    jVar.f3601O = obtainStyledAttributes.getFloat(index, jVar.f3601O);
                    break;
                case 41:
                    jVar.f3603Q = obtainStyledAttributes.getInt(index, jVar.f3603Q);
                    break;
                case 42:
                    jVar.f3604R = obtainStyledAttributes.getInt(index, jVar.f3604R);
                    break;
                case 43:
                    lVar.f3655c = obtainStyledAttributes.getFloat(index, lVar.f3655c);
                    break;
                case 44:
                    mVar.f3668k = true;
                    mVar.f3669l = obtainStyledAttributes.getDimension(index, mVar.f3669l);
                    break;
                case 45:
                    mVar.f3659b = obtainStyledAttributes.getFloat(index, mVar.f3659b);
                    break;
                case 46:
                    mVar.f3660c = obtainStyledAttributes.getFloat(index, mVar.f3660c);
                    break;
                case 47:
                    mVar.f3661d = obtainStyledAttributes.getFloat(index, mVar.f3661d);
                    break;
                case 48:
                    mVar.f3662e = obtainStyledAttributes.getFloat(index, mVar.f3662e);
                    break;
                case 49:
                    mVar.f3663f = obtainStyledAttributes.getDimension(index, mVar.f3663f);
                    break;
                case 50:
                    mVar.f3664g = obtainStyledAttributes.getDimension(index, mVar.f3664g);
                    break;
                case 51:
                    mVar.f3665h = obtainStyledAttributes.getDimension(index, mVar.f3665h);
                    break;
                case 52:
                    mVar.f3666i = obtainStyledAttributes.getDimension(index, mVar.f3666i);
                    break;
                case 53:
                    mVar.f3667j = obtainStyledAttributes.getDimension(index, mVar.f3667j);
                    break;
                case 54:
                    jVar.f3605S = obtainStyledAttributes.getInt(index, jVar.f3605S);
                    break;
                case 55:
                    jVar.f3606T = obtainStyledAttributes.getInt(index, jVar.f3606T);
                    break;
                case 56:
                    jVar.f3607U = obtainStyledAttributes.getDimensionPixelSize(index, jVar.f3607U);
                    break;
                case 57:
                    jVar.f3608V = obtainStyledAttributes.getDimensionPixelSize(index, jVar.f3608V);
                    break;
                case 58:
                    jVar.f3609W = obtainStyledAttributes.getDimensionPixelSize(index, jVar.f3609W);
                    break;
                case 59:
                    jVar.f3610X = obtainStyledAttributes.getDimensionPixelSize(index, jVar.f3610X);
                    break;
                case 60:
                    mVar.f3658a = obtainStyledAttributes.getFloat(index, mVar.f3658a);
                    break;
                case 61:
                    jVar.f3644w = f(obtainStyledAttributes, index, jVar.f3644w);
                    break;
                case 62:
                    jVar.f3645x = obtainStyledAttributes.getDimensionPixelSize(index, jVar.f3645x);
                    break;
                case 63:
                    jVar.f3646y = obtainStyledAttributes.getFloat(index, jVar.f3646y);
                    break;
                case 64:
                    kVar.f3649a = f(obtainStyledAttributes, index, kVar.f3649a);
                    break;
                case 65:
                    if (obtainStyledAttributes.peekValue(index).type == 3) {
                        obtainStyledAttributes.getString(index);
                        kVar.getClass();
                        break;
                    } else {
                        String str = AbstractC0194a.f3066a[obtainStyledAttributes.getInteger(index, 0)];
                        kVar.getClass();
                        break;
                    }
                case 66:
                    obtainStyledAttributes.getInt(index, 0);
                    kVar.getClass();
                    break;
                case 67:
                    kVar.f3652d = obtainStyledAttributes.getFloat(index, kVar.f3652d);
                    break;
                case 68:
                    lVar.f3656d = obtainStyledAttributes.getFloat(index, lVar.f3656d);
                    break;
                case 69:
                    jVar.f3611Y = obtainStyledAttributes.getFloat(index, 1.0f);
                    break;
                case 70:
                    jVar.f3612Z = obtainStyledAttributes.getFloat(index, 1.0f);
                    break;
                case 71:
                    Log.e("ConstraintSet", "CURRENTLY UNSUPPORTED");
                    break;
                case 72:
                    jVar.f3614a0 = obtainStyledAttributes.getInt(index, jVar.f3614a0);
                    break;
                case 73:
                    jVar.f3616b0 = obtainStyledAttributes.getDimensionPixelSize(index, jVar.f3616b0);
                    break;
                case 74:
                    jVar.f3622e0 = obtainStyledAttributes.getString(index);
                    break;
                case 75:
                    jVar.f3630i0 = obtainStyledAttributes.getBoolean(index, jVar.f3630i0);
                    break;
                case 76:
                    kVar.f3650b = obtainStyledAttributes.getInt(index, kVar.f3650b);
                    break;
                case 77:
                    jVar.f3624f0 = obtainStyledAttributes.getString(index);
                    break;
                case 78:
                    lVar.f3654b = obtainStyledAttributes.getInt(index, lVar.f3654b);
                    break;
                case 79:
                    kVar.f3651c = obtainStyledAttributes.getFloat(index, kVar.f3651c);
                    break;
                case 80:
                    jVar.f3626g0 = obtainStyledAttributes.getBoolean(index, jVar.f3626g0);
                    break;
                case 81:
                    jVar.f3628h0 = obtainStyledAttributes.getBoolean(index, jVar.f3628h0);
                    break;
                case 82:
                    Log.w("ConstraintSet", "unused attribute 0x" + Integer.toHexString(index) + "   " + sparseIntArray.get(index));
                    break;
                default:
                    Log.w("ConstraintSet", "Unknown attribute 0x" + Integer.toHexString(index) + "   " + sparseIntArray.get(index));
                    break;
            }
        }
        obtainStyledAttributes.recycle();
        return iVar;
    }

    public static int f(TypedArray typedArray, int i2, int i3) {
        int resourceId = typedArray.getResourceId(i2, i3);
        return resourceId == -1 ? typedArray.getInt(i2, -1) : resourceId;
    }

    public final void a(ConstraintLayout constraintLayout) {
        ViewGroup viewGroup;
        int i2;
        HashMap hashMap;
        String str;
        n nVar = this;
        ConstraintLayout constraintLayout2 = constraintLayout;
        int childCount = constraintLayout.getChildCount();
        HashMap hashMap2 = nVar.f3674c;
        HashSet hashSet = new HashSet(hashMap2.keySet());
        int i3 = 0;
        while (i3 < childCount) {
            View childAt = constraintLayout2.getChildAt(i3);
            int id = childAt.getId();
            if (!hashMap2.containsKey(Integer.valueOf(id))) {
                StringBuilder sb = new StringBuilder("id unknown ");
                try {
                    str = childAt.getContext().getResources().getResourceEntryName(childAt.getId());
                } catch (Exception unused) {
                    str = "UNKNOWN";
                }
                sb.append(str);
                Log.w("ConstraintSet", sb.toString());
            } else {
                if (nVar.f3673b && id == -1) {
                    throw new RuntimeException("All children of ConstraintLayout must have ids to use ConstraintSet");
                }
                if (id != -1) {
                    if (hashMap2.containsKey(Integer.valueOf(id))) {
                        hashSet.remove(Integer.valueOf(id));
                        i iVar = (i) hashMap2.get(Integer.valueOf(id));
                        if (childAt instanceof Barrier) {
                            iVar.f3583d.f3618c0 = 1;
                        }
                        int i4 = iVar.f3583d.f3618c0;
                        if (i4 != -1 && i4 == 1) {
                            Barrier barrier = (Barrier) childAt;
                            barrier.setId(id);
                            j jVar = iVar.f3583d;
                            barrier.setType(jVar.f3614a0);
                            barrier.setMargin(jVar.f3616b0);
                            barrier.setAllowsGoneWidget(jVar.f3630i0);
                            int[] iArr = jVar.f3620d0;
                            if (iArr != null) {
                                barrier.setReferencedIds(iArr);
                            } else {
                                String str2 = jVar.f3622e0;
                                if (str2 != null) {
                                    int[] c2 = c(barrier, str2);
                                    jVar.f3620d0 = c2;
                                    barrier.setReferencedIds(c2);
                                }
                            }
                        }
                        d dVar = (d) childAt.getLayoutParams();
                        dVar.a();
                        iVar.a(dVar);
                        HashMap hashMap3 = iVar.f3585f;
                        Class<?> cls = childAt.getClass();
                        for (String str3 : hashMap3.keySet()) {
                            C0212a c0212a = (C0212a) hashMap3.get(str3);
                            int i5 = childCount;
                            String str4 = "set" + str3;
                            try {
                                switch (AbstractC0204j.a(c0212a.f3487a)) {
                                    case 0:
                                        hashMap = hashMap3;
                                        Class<?>[] clsArr = new Class[1];
                                        try {
                                            clsArr[0] = Integer.TYPE;
                                            cls.getMethod(str4, clsArr).invoke(childAt, Integer.valueOf(c0212a.f3488b));
                                        } catch (IllegalAccessException e2) {
                                            e = e2;
                                            Log.e("TransitionLayout", " Custom Attribute \"" + str3 + "\" not found on " + cls.getName());
                                            e.printStackTrace();
                                            childCount = i5;
                                            hashMap3 = hashMap;
                                        } catch (NoSuchMethodException e3) {
                                            e = e3;
                                            Log.e("TransitionLayout", e.getMessage());
                                            Log.e("TransitionLayout", " Custom Attribute \"" + str3 + "\" not found on " + cls.getName());
                                            Log.e("TransitionLayout", cls.getName() + " must have a method " + str4);
                                            childCount = i5;
                                            hashMap3 = hashMap;
                                        } catch (InvocationTargetException e4) {
                                            e = e4;
                                            Log.e("TransitionLayout", " Custom Attribute \"" + str3 + "\" not found on " + cls.getName());
                                            e.printStackTrace();
                                            childCount = i5;
                                            hashMap3 = hashMap;
                                        }
                                    case 1:
                                        hashMap = hashMap3;
                                        cls.getMethod(str4, Float.TYPE).invoke(childAt, Float.valueOf(c0212a.f3489c));
                                        break;
                                    case 2:
                                        hashMap = hashMap3;
                                        cls.getMethod(str4, Integer.TYPE).invoke(childAt, Integer.valueOf(c0212a.f3492f));
                                        break;
                                    case 3:
                                        hashMap = hashMap3;
                                        Method method = cls.getMethod(str4, Drawable.class);
                                        ColorDrawable colorDrawable = new ColorDrawable();
                                        colorDrawable.setColor(c0212a.f3492f);
                                        method.invoke(childAt, colorDrawable);
                                        break;
                                    case 4:
                                        hashMap = hashMap3;
                                        cls.getMethod(str4, CharSequence.class).invoke(childAt, c0212a.f3490d);
                                        break;
                                    case 5:
                                        hashMap = hashMap3;
                                        cls.getMethod(str4, Boolean.TYPE).invoke(childAt, Boolean.valueOf(c0212a.f3491e));
                                        break;
                                    case 6:
                                        hashMap = hashMap3;
                                        try {
                                            cls.getMethod(str4, Float.TYPE).invoke(childAt, Float.valueOf(c0212a.f3489c));
                                        } catch (IllegalAccessException e5) {
                                            e = e5;
                                            Log.e("TransitionLayout", " Custom Attribute \"" + str3 + "\" not found on " + cls.getName());
                                            e.printStackTrace();
                                            childCount = i5;
                                            hashMap3 = hashMap;
                                        } catch (NoSuchMethodException e6) {
                                            e = e6;
                                            Log.e("TransitionLayout", e.getMessage());
                                            Log.e("TransitionLayout", " Custom Attribute \"" + str3 + "\" not found on " + cls.getName());
                                            Log.e("TransitionLayout", cls.getName() + " must have a method " + str4);
                                            childCount = i5;
                                            hashMap3 = hashMap;
                                        } catch (InvocationTargetException e7) {
                                            e = e7;
                                            Log.e("TransitionLayout", " Custom Attribute \"" + str3 + "\" not found on " + cls.getName());
                                            e.printStackTrace();
                                            childCount = i5;
                                            hashMap3 = hashMap;
                                        }
                                    default:
                                        hashMap = hashMap3;
                                        break;
                                }
                            } catch (IllegalAccessException e8) {
                                e = e8;
                                hashMap = hashMap3;
                            } catch (NoSuchMethodException e9) {
                                e = e9;
                                hashMap = hashMap3;
                            } catch (InvocationTargetException e10) {
                                e = e10;
                                hashMap = hashMap3;
                            }
                            childCount = i5;
                            hashMap3 = hashMap;
                        }
                        i2 = childCount;
                        childAt.setLayoutParams(dVar);
                        l lVar = iVar.f3581b;
                        if (lVar.f3654b == 0) {
                            childAt.setVisibility(lVar.f3653a);
                        }
                        childAt.setAlpha(lVar.f3655c);
                        m mVar = iVar.f3584e;
                        childAt.setRotation(mVar.f3658a);
                        childAt.setRotationX(mVar.f3659b);
                        childAt.setRotationY(mVar.f3660c);
                        childAt.setScaleX(mVar.f3661d);
                        childAt.setScaleY(mVar.f3662e);
                        if (!Float.isNaN(mVar.f3663f)) {
                            childAt.setPivotX(mVar.f3663f);
                        }
                        if (!Float.isNaN(mVar.f3664g)) {
                            childAt.setPivotY(mVar.f3664g);
                        }
                        childAt.setTranslationX(mVar.f3665h);
                        childAt.setTranslationY(mVar.f3666i);
                        childAt.setTranslationZ(mVar.f3667j);
                        if (mVar.f3668k) {
                            childAt.setElevation(mVar.f3669l);
                        }
                    } else {
                        i2 = childCount;
                        Log.v("ConstraintSet", "WARNING NO CONSTRAINTS for view " + id);
                    }
                    i3++;
                    nVar = this;
                    constraintLayout2 = constraintLayout;
                    childCount = i2;
                }
            }
            i2 = childCount;
            i3++;
            nVar = this;
            constraintLayout2 = constraintLayout;
            childCount = i2;
        }
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            Integer num = (Integer) it.next();
            i iVar2 = (i) hashMap2.get(num);
            j jVar2 = iVar2.f3583d;
            int i6 = jVar2.f3618c0;
            if (i6 == -1) {
                viewGroup = constraintLayout;
            } else if (i6 != 1) {
                viewGroup = constraintLayout;
            } else {
                Barrier barrier2 = new Barrier(constraintLayout.getContext());
                barrier2.setId(num.intValue());
                int[] iArr2 = jVar2.f3620d0;
                if (iArr2 != null) {
                    barrier2.setReferencedIds(iArr2);
                } else {
                    String str5 = jVar2.f3622e0;
                    if (str5 != null) {
                        int[] c3 = c(barrier2, str5);
                        jVar2.f3620d0 = c3;
                        barrier2.setReferencedIds(c3);
                    }
                }
                barrier2.setType(jVar2.f3614a0);
                barrier2.setMargin(jVar2.f3616b0);
                d a2 = ConstraintLayout.a();
                barrier2.d();
                iVar2.a(a2);
                viewGroup = constraintLayout;
                viewGroup.addView(barrier2, a2);
            }
            if (jVar2.f3613a) {
                Guideline guideline = new Guideline(constraintLayout.getContext());
                guideline.setId(num.intValue());
                d a3 = ConstraintLayout.a();
                iVar2.a(a3);
                viewGroup.addView(guideline, a3);
            }
        }
    }

    public final void b(ConstraintLayout constraintLayout) {
        int i2;
        n nVar = this;
        int childCount = constraintLayout.getChildCount();
        HashMap hashMap = nVar.f3674c;
        hashMap.clear();
        int i3 = 0;
        while (i3 < childCount) {
            View childAt = constraintLayout.getChildAt(i3);
            d dVar = (d) childAt.getLayoutParams();
            int id = childAt.getId();
            if (nVar.f3673b && id == -1) {
                throw new RuntimeException("All children of ConstraintLayout must have ids to use ConstraintSet");
            }
            if (!hashMap.containsKey(Integer.valueOf(id))) {
                hashMap.put(Integer.valueOf(id), new i());
            }
            i iVar = (i) hashMap.get(Integer.valueOf(id));
            HashMap hashMap2 = nVar.f3672a;
            HashMap hashMap3 = new HashMap();
            Class<?> cls = childAt.getClass();
            for (String str : hashMap2.keySet()) {
                C0212a c0212a = (C0212a) hashMap2.get(str);
                try {
                    if (str.equals("BackgroundColor")) {
                        hashMap3.put(str, new C0212a(c0212a, Integer.valueOf(((ColorDrawable) childAt.getBackground()).getColor())));
                        i2 = childCount;
                    } else {
                        i2 = childCount;
                        try {
                            hashMap3.put(str, new C0212a(c0212a, cls.getMethod("getMap" + str, new Class[0]).invoke(childAt, new Object[0])));
                        } catch (IllegalAccessException e2) {
                            e = e2;
                            e.printStackTrace();
                            childCount = i2;
                        } catch (NoSuchMethodException e3) {
                            e = e3;
                            e.printStackTrace();
                            childCount = i2;
                        } catch (InvocationTargetException e4) {
                            e = e4;
                            e.printStackTrace();
                            childCount = i2;
                        }
                    }
                } catch (IllegalAccessException e5) {
                    e = e5;
                    i2 = childCount;
                } catch (NoSuchMethodException e6) {
                    e = e6;
                    i2 = childCount;
                } catch (InvocationTargetException e7) {
                    e = e7;
                    i2 = childCount;
                }
                childCount = i2;
            }
            int i4 = childCount;
            iVar.f3585f = hashMap3;
            iVar.f3580a = id;
            int i5 = dVar.f3532d;
            j jVar = iVar.f3583d;
            jVar.f3625g = i5;
            jVar.f3627h = dVar.f3534e;
            jVar.f3629i = dVar.f3536f;
            jVar.f3631j = dVar.f3538g;
            jVar.f3632k = dVar.f3540h;
            jVar.f3633l = dVar.f3542i;
            jVar.f3634m = dVar.f3544j;
            jVar.f3635n = dVar.f3546k;
            jVar.f3636o = dVar.f3547l;
            jVar.f3637p = dVar.f3551p;
            jVar.f3638q = dVar.f3552q;
            jVar.f3639r = dVar.f3553r;
            jVar.f3640s = dVar.f3554s;
            jVar.f3641t = dVar.f3561z;
            jVar.f3642u = dVar.f3500A;
            jVar.f3643v = dVar.f3501B;
            jVar.f3644w = dVar.f3548m;
            jVar.f3645x = dVar.f3549n;
            jVar.f3646y = dVar.f3550o;
            jVar.f3647z = dVar.f3515P;
            jVar.f3587A = dVar.f3516Q;
            jVar.f3588B = dVar.f3517R;
            jVar.f3623f = dVar.f3530c;
            jVar.f3619d = dVar.f3526a;
            jVar.f3621e = dVar.f3528b;
            jVar.f3615b = ((ViewGroup.MarginLayoutParams) dVar).width;
            jVar.f3617c = ((ViewGroup.MarginLayoutParams) dVar).height;
            jVar.f3589C = ((ViewGroup.MarginLayoutParams) dVar).leftMargin;
            jVar.f3590D = ((ViewGroup.MarginLayoutParams) dVar).rightMargin;
            jVar.f3591E = ((ViewGroup.MarginLayoutParams) dVar).topMargin;
            jVar.f3592F = ((ViewGroup.MarginLayoutParams) dVar).bottomMargin;
            jVar.f3601O = dVar.f3504E;
            jVar.f3602P = dVar.f3503D;
            jVar.f3604R = dVar.f3506G;
            jVar.f3603Q = dVar.f3505F;
            jVar.f3626g0 = dVar.f3518S;
            jVar.f3628h0 = dVar.f3519T;
            jVar.f3605S = dVar.f3507H;
            jVar.f3606T = dVar.f3508I;
            jVar.f3607U = dVar.f3511L;
            jVar.f3608V = dVar.f3512M;
            jVar.f3609W = dVar.f3509J;
            jVar.f3610X = dVar.f3510K;
            jVar.f3611Y = dVar.f3513N;
            jVar.f3612Z = dVar.f3514O;
            jVar.f3624f0 = dVar.f3520U;
            jVar.f3596J = dVar.f3556u;
            jVar.f3598L = dVar.f3558w;
            jVar.f3595I = dVar.f3555t;
            jVar.f3597K = dVar.f3557v;
            jVar.f3600N = dVar.f3559x;
            jVar.f3599M = dVar.f3560y;
            jVar.f3593G = dVar.getMarginEnd();
            jVar.f3594H = dVar.getMarginStart();
            int visibility = childAt.getVisibility();
            l lVar = iVar.f3581b;
            lVar.f3653a = visibility;
            lVar.f3655c = childAt.getAlpha();
            float rotation = childAt.getRotation();
            m mVar = iVar.f3584e;
            mVar.f3658a = rotation;
            mVar.f3659b = childAt.getRotationX();
            mVar.f3660c = childAt.getRotationY();
            mVar.f3661d = childAt.getScaleX();
            mVar.f3662e = childAt.getScaleY();
            float pivotX = childAt.getPivotX();
            float pivotY = childAt.getPivotY();
            if (pivotX != 0.0d || pivotY != 0.0d) {
                mVar.f3663f = pivotX;
                mVar.f3664g = pivotY;
            }
            mVar.f3665h = childAt.getTranslationX();
            mVar.f3666i = childAt.getTranslationY();
            mVar.f3667j = childAt.getTranslationZ();
            if (mVar.f3668k) {
                mVar.f3669l = childAt.getElevation();
            }
            if (childAt instanceof Barrier) {
                Barrier barrier = (Barrier) childAt;
                jVar.f3630i0 = barrier.f989i.f3254g0;
                jVar.f3620d0 = barrier.getReferencedIds();
                jVar.f3614a0 = barrier.getType();
                jVar.f3616b0 = barrier.getMargin();
            }
            i3++;
            nVar = this;
            childCount = i4;
        }
    }

    public final void e(Context context, int i2) {
        XmlResourceParser xml = context.getResources().getXml(i2);
        try {
            for (int eventType = xml.getEventType(); eventType != 1; eventType = xml.next()) {
                if (eventType == 0) {
                    xml.getName();
                } else if (eventType == 2) {
                    String name = xml.getName();
                    i d2 = d(context, Xml.asAttributeSet(xml));
                    if (name.equalsIgnoreCase("Guideline")) {
                        d2.f3583d.f3613a = true;
                    }
                    this.f3674c.put(Integer.valueOf(d2.f3580a), d2);
                }
            }
        } catch (IOException e2) {
            e2.printStackTrace();
        } catch (XmlPullParserException e3) {
            e3.printStackTrace();
        }
    }
}
