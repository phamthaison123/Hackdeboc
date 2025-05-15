package B;

import F.U;
import S.B;
import S.P;
import S.c0;
import android.animation.Animator;
import android.animation.AnimatorInflater;
import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.app.Activity;
import android.app.AppOpsManager;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.Color;
import android.graphics.Rect;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Binder;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.ParcelFileDescriptor;
import android.os.Process;
import android.os.Trace;
import android.text.TextUtils;
import android.util.Base64;
import android.util.Log;
import android.util.SparseArray;
import android.util.TypedValue;
import android.util.Xml;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.EdgeEffect;
import android.widget.TextView;
import androidx.appcompat.widget.Toolbar;
import androidx.fragment.app.AbstractComponentCallbacksC0075p;
import androidx.fragment.app.C0073n;
import androidx.fragment.app.C0080v;
import e.z;
import g.C0107g;
import h0.k;
import i.C0181y0;
import i.RunnableC0151j;
import i.r;
import java.io.FileInputStream;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.MappedByteBuffer;
import java.nio.channels.FileChannel;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import java.util.WeakHashMap;
import m0.v;
import org.xmlpull.v1.XmlPullParserException;
import t.AbstractC0222a;
import u.AbstractC0227e;
import x.d;
import x.e;
import x.f;
import x.g;
import x.h;
import x.i;
import x.j;
import y.AbstractC0237a;

/* loaded from: /home/sonpt/Hackdeboc/bigbang.htb/apk/classes.dex */
public abstract class a implements U {

    /* renamed from: a, reason: collision with root package name */
    public static long f0a;

    /* renamed from: b, reason: collision with root package name */
    public static Method f1b;

    public static Drawable A(Context context, int i2) {
        return C0181y0.c().e(context, i2);
    }

    public static Intent B(Activity activity) {
        Intent parentActivityIntent = activity.getParentActivityIntent();
        if (parentActivityIntent != null) {
            return parentActivityIntent;
        }
        try {
            String D2 = D(activity, activity.getComponentName());
            if (D2 == null) {
                return null;
            }
            ComponentName componentName = new ComponentName(activity, D2);
            try {
                return D(activity, componentName) == null ? Intent.makeMainActivity(componentName) : new Intent().setComponent(componentName);
            } catch (PackageManager.NameNotFoundException unused) {
                Log.e("NavUtils", "getParentActivityIntent: bad parentActivityName '" + D2 + "' in manifest");
                return null;
            }
        } catch (PackageManager.NameNotFoundException e2) {
            throw new IllegalArgumentException(e2);
        }
    }

    public static Intent C(Context context, ComponentName componentName) {
        String D2 = D(context, componentName);
        if (D2 == null) {
            return null;
        }
        ComponentName componentName2 = new ComponentName(componentName.getPackageName(), D2);
        return D(context, componentName2) == null ? Intent.makeMainActivity(componentName2) : new Intent().setComponent(componentName2);
    }

    public static String D(Context context, ComponentName componentName) {
        String string;
        ActivityInfo activityInfo = context.getPackageManager().getActivityInfo(componentName, 269222528);
        String str = activityInfo.parentActivityName;
        if (str != null) {
            return str;
        }
        Bundle bundle = activityInfo.metaData;
        if (bundle == null || (string = bundle.getString("android.support.PARENT_ACTIVITY")) == null) {
            return null;
        }
        if (string.charAt(0) != '.') {
            return string;
        }
        return context.getPackageName() + string;
    }

    public static TextView E(Toolbar toolbar, CharSequence charSequence) {
        for (int i2 = 0; i2 < toolbar.getChildCount(); i2++) {
            View childAt = toolbar.getChildAt(i2);
            if (childAt instanceof TextView) {
                TextView textView = (TextView) childAt;
                if (TextUtils.equals(textView.getText(), charSequence)) {
                    return textView;
                }
            }
        }
        return null;
    }

    public static boolean H() {
        if (Build.VERSION.SDK_INT < 31) {
            String str = Build.VERSION.CODENAME;
            if ("REL".equals(str) || str.compareTo("S") < 0) {
                return false;
            }
        }
        return true;
    }

    public static boolean I(int i2, Rect rect, Rect rect2) {
        if (i2 == 17) {
            int i3 = rect.right;
            int i4 = rect2.right;
            return (i3 > i4 || rect.left >= i4) && rect.left > rect2.left;
        }
        if (i2 == 33) {
            int i5 = rect.bottom;
            int i6 = rect2.bottom;
            return (i5 > i6 || rect.top >= i6) && rect.top > rect2.top;
        }
        if (i2 == 66) {
            int i7 = rect.left;
            int i8 = rect2.left;
            return (i7 < i8 || rect.right <= i8) && rect.right < rect2.right;
        }
        if (i2 != 130) {
            throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
        }
        int i9 = rect.top;
        int i10 = rect2.top;
        return (i9 < i10 || rect.bottom <= i10) && rect.bottom < rect2.bottom;
    }

    public static boolean J() {
        try {
            if (f1b == null) {
                return Trace.isEnabled();
            }
        } catch (NoClassDefFoundError | NoSuchMethodError unused) {
        }
        try {
            if (f1b == null) {
                f0a = Trace.class.getField("TRACE_TAG_APP").getLong(null);
                f1b = Trace.class.getMethod("isTagEnabled", Long.TYPE);
            }
            return ((Boolean) f1b.invoke(null, Long.valueOf(f0a))).booleanValue();
        } catch (Exception e2) {
            if (!(e2 instanceof InvocationTargetException)) {
                Log.v("Trace", "Unable to call isTagEnabled via reflection", e2);
                return false;
            }
            Throwable cause = e2.getCause();
            if (cause instanceof RuntimeException) {
                throw ((RuntimeException) cause);
            }
            throw new RuntimeException(cause);
        }
    }

    public static int K(int i2, int i3, float f2) {
        return AbstractC0237a.b(AbstractC0237a.d(i3, Math.round(Color.alpha(i3) * f2)), i2);
    }

    public static C0080v L(Context context, AbstractComponentCallbacksC0075p abstractComponentCallbacksC0075p, boolean z2, boolean z3) {
        int i2;
        C0073n c0073n = abstractComponentCallbacksC0075p.f1377H;
        int i3 = c0073n == null ? 0 : c0073n.f1361h;
        if (z3) {
            if (z2) {
                if (c0073n != null) {
                    i2 = c0073n.f1359f;
                }
                i2 = 0;
            } else {
                if (c0073n != null) {
                    i2 = c0073n.f1360g;
                }
                i2 = 0;
            }
        } else if (z2) {
            if (c0073n != null) {
                i2 = c0073n.f1357d;
            }
            i2 = 0;
        } else {
            if (c0073n != null) {
                i2 = c0073n.f1358e;
            }
            i2 = 0;
        }
        abstractComponentCallbacksC0075p.D(0, 0, 0, 0);
        ViewGroup viewGroup = abstractComponentCallbacksC0075p.f1373D;
        if (viewGroup != null && viewGroup.getTag(2131296690) != null) {
            abstractComponentCallbacksC0075p.f1373D.setTag(2131296690, null);
        }
        ViewGroup viewGroup2 = abstractComponentCallbacksC0075p.f1373D;
        if (viewGroup2 != null && viewGroup2.getLayoutTransition() != null) {
            return null;
        }
        if (i2 == 0 && i3 != 0) {
            i2 = i3 != 4097 ? i3 != 4099 ? i3 != 8194 ? -1 : z2 ? 2130837507 : 2130837508 : z2 ? 2130837509 : 2130837510 : z2 ? 2130837511 : 2130837512;
        }
        if (i2 != 0) {
            boolean equals = "anim".equals(context.getResources().getResourceTypeName(i2));
            if (equals) {
                try {
                    Animation loadAnimation = AnimationUtils.loadAnimation(context, i2);
                    if (loadAnimation != null) {
                        return new C0080v(loadAnimation);
                    }
                } catch (Resources.NotFoundException e2) {
                    throw e2;
                } catch (RuntimeException unused) {
                }
            }
            try {
                Animator loadAnimator = AnimatorInflater.loadAnimator(context, i2);
                if (loadAnimator != null) {
                    return new C0080v(loadAnimator);
                }
            } catch (RuntimeException e3) {
                if (equals) {
                    throw e3;
                }
                Animation loadAnimation2 = AnimationUtils.loadAnimation(context, i2);
                if (loadAnimation2 != null) {
                    return new C0080v(loadAnimation2);
                }
            }
        }
        return null;
    }

    public static int M(int i2, Rect rect, Rect rect2) {
        int i3;
        int i4;
        if (i2 == 17) {
            i3 = rect.left;
            i4 = rect2.right;
        } else if (i2 == 33) {
            i3 = rect.top;
            i4 = rect2.bottom;
        } else if (i2 == 66) {
            i3 = rect2.left;
            i4 = rect.right;
        } else {
            if (i2 != 130) {
                throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
            }
            i3 = rect2.top;
            i4 = rect.bottom;
        }
        return Math.max(0, i3 - i4);
    }

    public static int N(int i2, Rect rect, Rect rect2) {
        if (i2 != 17) {
            if (i2 != 33) {
                if (i2 != 66) {
                    if (i2 != 130) {
                        throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
                    }
                }
            }
            return Math.abs(((rect.width() / 2) + rect.left) - ((rect2.width() / 2) + rect2.left));
        }
        return Math.abs(((rect.height() / 2) + rect.top) - ((rect2.height() / 2) + rect2.top));
    }

    public static MappedByteBuffer O(Context context, Uri uri) {
        try {
            ParcelFileDescriptor openFileDescriptor = context.getContentResolver().openFileDescriptor(uri, "r", null);
            if (openFileDescriptor == null) {
                if (openFileDescriptor != null) {
                    openFileDescriptor.close();
                }
                return null;
            }
            try {
                FileInputStream fileInputStream = new FileInputStream(openFileDescriptor.getFileDescriptor());
                try {
                    FileChannel channel = fileInputStream.getChannel();
                    MappedByteBuffer map = channel.map(FileChannel.MapMode.READ_ONLY, 0L, channel.size());
                    fileInputStream.close();
                    openFileDescriptor.close();
                    return map;
                } finally {
                }
            } finally {
            }
        } catch (IOException unused) {
            return null;
        }
    }

    public static void P(View view, EditorInfo editorInfo, InputConnection inputConnection) {
        if (inputConnection == null || editorInfo.hintText != null) {
            return;
        }
        for (ViewParent parent = view.getParent(); parent instanceof View; parent = parent.getParent()) {
        }
    }

    public static float X(EdgeEffect edgeEffect, float f2, float f3) {
        if (H()) {
            return I.b.c(edgeEffect, f2, f3);
        }
        edgeEffect.onPull(f2, f3);
        return f2;
    }

    public static d c0(XmlResourceParser xmlResourceParser, Resources resources) {
        int next;
        do {
            next = xmlResourceParser.next();
            if (next == 2) {
                break;
            }
        } while (next != 1);
        if (next != 2) {
            throw new XmlPullParserException("No start tag found");
        }
        xmlResourceParser.require(2, null, "font-family");
        if (xmlResourceParser.getName().equals("font-family")) {
            TypedArray obtainAttributes = resources.obtainAttributes(Xml.asAttributeSet(xmlResourceParser), AbstractC0222a.f3713b);
            String string = obtainAttributes.getString(0);
            String string2 = obtainAttributes.getString(4);
            String string3 = obtainAttributes.getString(5);
            int resourceId = obtainAttributes.getResourceId(1, 0);
            int integer = obtainAttributes.getInteger(2, 1);
            int integer2 = obtainAttributes.getInteger(3, 500);
            String string4 = obtainAttributes.getString(6);
            obtainAttributes.recycle();
            if (string != null && string2 != null && string3 != null) {
                while (xmlResourceParser.next() != 3) {
                    i0(xmlResourceParser);
                }
                return new g(new r(string, string2, string3, g0(resources, resourceId)), integer, integer2, string4);
            }
            ArrayList arrayList = new ArrayList();
            while (xmlResourceParser.next() != 3) {
                if (xmlResourceParser.getEventType() == 2) {
                    if (xmlResourceParser.getName().equals("font")) {
                        TypedArray obtainAttributes2 = resources.obtainAttributes(Xml.asAttributeSet(xmlResourceParser), AbstractC0222a.f3714c);
                        int i2 = obtainAttributes2.getInt(obtainAttributes2.hasValue(8) ? 8 : 1, 400);
                        boolean z2 = 1 == obtainAttributes2.getInt(obtainAttributes2.hasValue(6) ? 6 : 2, 0);
                        int i3 = obtainAttributes2.hasValue(9) ? 9 : 3;
                        String string5 = obtainAttributes2.getString(obtainAttributes2.hasValue(7) ? 7 : 4);
                        int i4 = obtainAttributes2.getInt(i3, 0);
                        int i5 = obtainAttributes2.hasValue(5) ? 5 : 0;
                        int resourceId2 = obtainAttributes2.getResourceId(i5, 0);
                        String string6 = obtainAttributes2.getString(i5);
                        obtainAttributes2.recycle();
                        while (xmlResourceParser.next() != 3) {
                            i0(xmlResourceParser);
                        }
                        arrayList.add(new f(string6, i2, z2, string5, i4, resourceId2));
                    } else {
                        i0(xmlResourceParser);
                    }
                }
            }
            if (!arrayList.isEmpty()) {
                return new e((f[]) arrayList.toArray(new f[arrayList.size()]));
            }
        } else {
            i0(xmlResourceParser);
        }
        return null;
    }

    public static void e0(AnimatorSet animatorSet, ArrayList arrayList) {
        int size = arrayList.size();
        long j2 = 0;
        for (int i2 = 0; i2 < size; i2++) {
            Animator animator = (Animator) arrayList.get(i2);
            j2 = Math.max(j2, animator.getDuration() + animator.getStartDelay());
        }
        ValueAnimator ofInt = ValueAnimator.ofInt(0, 0);
        ofInt.setDuration(j2);
        arrayList.add(0, ofInt);
        animatorSet.playTogether(arrayList);
    }

    public static M.b f0(MappedByteBuffer mappedByteBuffer) {
        long j2;
        ByteBuffer duplicate = mappedByteBuffer.duplicate();
        z zVar = new z(duplicate);
        zVar.v(4);
        int i2 = ((ByteBuffer) zVar.f2221b).getShort() & 65535;
        if (i2 > 100) {
            throw new IOException("Cannot read metadata.");
        }
        zVar.v(6);
        int i3 = 0;
        while (true) {
            if (i3 >= i2) {
                j2 = -1;
                break;
            }
            int i4 = ((ByteBuffer) zVar.f2221b).getInt();
            zVar.v(4);
            j2 = zVar.u();
            zVar.v(4);
            if (1835365473 == i4) {
                break;
            }
            i3++;
        }
        if (j2 != -1) {
            zVar.v((int) (j2 - ((ByteBuffer) zVar.f2221b).position()));
            zVar.v(12);
            long u2 = zVar.u();
            for (int i5 = 0; i5 < u2; i5++) {
                int i6 = ((ByteBuffer) zVar.f2221b).getInt();
                long u3 = zVar.u();
                zVar.u();
                if (1164798569 == i6 || 1701669481 == i6) {
                    duplicate.position((int) (u3 + j2));
                    M.b bVar = new M.b();
                    duplicate.order(ByteOrder.LITTLE_ENDIAN);
                    int position = duplicate.position() + duplicate.getInt(duplicate.position());
                    bVar.f216b = duplicate;
                    bVar.f215a = position;
                    int i7 = position - duplicate.getInt(position);
                    bVar.f217c = i7;
                    bVar.f218d = bVar.f216b.getShort(i7);
                    return bVar;
                }
            }
        }
        throw new IOException("Cannot read metadata.");
    }

    public static List g0(Resources resources, int i2) {
        if (i2 == 0) {
            return Collections.emptyList();
        }
        TypedArray obtainTypedArray = resources.obtainTypedArray(i2);
        try {
            if (obtainTypedArray.length() == 0) {
                return Collections.emptyList();
            }
            ArrayList arrayList = new ArrayList();
            if (obtainTypedArray.getType(0) == 1) {
                for (int i3 = 0; i3 < obtainTypedArray.length(); i3++) {
                    int resourceId = obtainTypedArray.getResourceId(i3, 0);
                    if (resourceId != 0) {
                        String[] stringArray = resources.getStringArray(resourceId);
                        ArrayList arrayList2 = new ArrayList();
                        for (String str : stringArray) {
                            arrayList2.add(Base64.decode(str, 0));
                        }
                        arrayList.add(arrayList2);
                    }
                }
            } else {
                String[] stringArray2 = resources.getStringArray(i2);
                ArrayList arrayList3 = new ArrayList();
                for (String str2 : stringArray2) {
                    arrayList3.add(Base64.decode(str2, 0));
                }
                arrayList.add(arrayList3);
            }
            return arrayList;
        } finally {
            obtainTypedArray.recycle();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:145:0x0262, code lost:
    
        if (r2.f3274b == r7) goto L174;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0105, code lost:
    
        if (r4.f3274b == r12) goto L73;
     */
    /* JADX WARN: Removed duplicated region for block: B:174:0x02e5  */
    /* JADX WARN: Removed duplicated region for block: B:177:0x0300  */
    /* JADX WARN: Removed duplicated region for block: B:186:0x031b  */
    /* JADX WARN: Removed duplicated region for block: B:224:0x041f  */
    /* JADX WARN: Removed duplicated region for block: B:229:0x0492 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:296:0x06bc A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:303:0x06d0  */
    /* JADX WARN: Removed duplicated region for block: B:306:0x06d9  */
    /* JADX WARN: Removed duplicated region for block: B:308:0x06e0  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00ed  */
    /* JADX WARN: Removed duplicated region for block: B:313:0x06f0  */
    /* JADX WARN: Removed duplicated region for block: B:315:0x06f4 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:319:0x0711 A[ADDED_TO_REGION, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:320:0x06dc  */
    /* JADX WARN: Removed duplicated region for block: B:321:0x06d3  */
    /* JADX WARN: Removed duplicated region for block: B:327:0x0593 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:335:0x05a6  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00f9  */
    /* JADX WARN: Removed duplicated region for block: B:384:0x0678  */
    /* JADX WARN: Removed duplicated region for block: B:389:0x06aa A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x010c  */
    /* JADX WARN: Removed duplicated region for block: B:411:0x0489  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x010f A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void h(o.e r37, n.C0199e r38, int r39) {
        /*
            Method dump skipped, instructions count: 1821
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: B.a.h(o.e, n.e, int):void");
    }

    public static boolean h0(int[] iArr) {
        boolean z2 = false;
        boolean z3 = false;
        for (int i2 : iArr) {
            if (i2 == 16842910) {
                z2 = true;
            } else if (i2 == 16842908 || i2 == 16842919 || i2 == 16843623) {
                z3 = true;
            }
        }
        return z2 && z3;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0026, code lost:
    
        if (r10.bottom <= r12.top) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0043, code lost:
    
        if (r9 == 17) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0045, code lost:
    
        if (r9 != 66) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0048, code lost:
    
        r11 = M(r9, r10, r11);
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x004c, code lost:
    
        if (r9 == 17) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x004e, code lost:
    
        if (r9 == 33) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0050, code lost:
    
        if (r9 == 66) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0052, code lost:
    
        if (r9 != 130) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0054, code lost:
    
        r9 = r12.bottom;
        r10 = r10.bottom;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0073, code lost:
    
        if (r11 >= java.lang.Math.max(1, r9 - r10)) goto L45;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0076, code lost:
    
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:?, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x005f, code lost:
    
        throw new java.lang.IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0060, code lost:
    
        r9 = r12.right;
        r10 = r10.right;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0065, code lost:
    
        r9 = r10.top;
        r10 = r12.top;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x006a, code lost:
    
        r9 = r10.left;
        r10 = r12.left;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0033, code lost:
    
        if (r10.right <= r12.left) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x003a, code lost:
    
        if (r10.top >= r12.bottom) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x0041, code lost:
    
        if (r10.left >= r12.right) goto L24;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean i(int r9, android.graphics.Rect r10, android.graphics.Rect r11, android.graphics.Rect r12) {
        /*
            boolean r0 = j(r9, r10, r11)
            boolean r1 = j(r9, r10, r12)
            r2 = 0
            if (r1 != 0) goto L78
            if (r0 != 0) goto Lf
            goto L78
        Lf:
            java.lang.String r0 = "direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}."
            r1 = 130(0x82, float:1.82E-43)
            r3 = 33
            r4 = 66
            r5 = 17
            r6 = 1
            if (r9 == r5) goto L3d
            if (r9 == r3) goto L36
            if (r9 == r4) goto L2f
            if (r9 != r1) goto L29
            int r7 = r10.bottom
            int r8 = r12.top
            if (r7 > r8) goto L77
            goto L43
        L29:
            java.lang.IllegalArgumentException r9 = new java.lang.IllegalArgumentException
            r9.<init>(r0)
            throw r9
        L2f:
            int r7 = r10.right
            int r8 = r12.left
            if (r7 > r8) goto L77
            goto L43
        L36:
            int r7 = r10.top
            int r8 = r12.bottom
            if (r7 < r8) goto L77
            goto L43
        L3d:
            int r7 = r10.left
            int r8 = r12.right
            if (r7 < r8) goto L77
        L43:
            if (r9 == r5) goto L77
            if (r9 != r4) goto L48
            goto L77
        L48:
            int r11 = M(r9, r10, r11)
            if (r9 == r5) goto L6a
            if (r9 == r3) goto L65
            if (r9 == r4) goto L60
            if (r9 != r1) goto L5a
            int r9 = r12.bottom
            int r10 = r10.bottom
        L58:
            int r9 = r9 - r10
            goto L6f
        L5a:
            java.lang.IllegalArgumentException r9 = new java.lang.IllegalArgumentException
            r9.<init>(r0)
            throw r9
        L60:
            int r9 = r12.right
            int r10 = r10.right
            goto L58
        L65:
            int r9 = r10.top
            int r10 = r12.top
            goto L58
        L6a:
            int r9 = r10.left
            int r10 = r12.left
            goto L58
        L6f:
            int r9 = java.lang.Math.max(r6, r9)
            if (r11 >= r9) goto L76
            r2 = r6
        L76:
            return r2
        L77:
            return r6
        L78:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: B.a.i(int, android.graphics.Rect, android.graphics.Rect, android.graphics.Rect):boolean");
    }

    public static void i0(XmlResourceParser xmlResourceParser) {
        int i2 = 1;
        while (i2 > 0) {
            int next = xmlResourceParser.next();
            if (next == 2) {
                i2++;
            } else if (next == 3) {
                i2--;
            }
        }
    }

    public static boolean j(int i2, Rect rect, Rect rect2) {
        if (i2 != 17) {
            if (i2 != 33) {
                if (i2 != 66) {
                    if (i2 != 130) {
                        throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
                    }
                }
            }
            return rect2.right >= rect.left && rect2.left <= rect.right;
        }
        return rect2.bottom >= rect.top && rect2.top <= rect.bottom;
    }

    public static void m(boolean z2, String str) {
        if (!z2) {
            throw new IllegalArgumentException(str);
        }
    }

    public static void n(int i2) {
        if (i2 < 0) {
            throw new IllegalArgumentException();
        }
    }

    public static void o(Object obj, String str) {
        if (obj == null) {
            throw new NullPointerException(str);
        }
    }

    public static int p(Context context, String str) {
        int noteProxyOpNoThrow;
        int myPid = Process.myPid();
        int myUid = Process.myUid();
        String packageName = context.getPackageName();
        if (context.checkPermission(str, myPid, myUid) == -1) {
            return -1;
        }
        String permissionToOp = AppOpsManager.permissionToOp(str);
        if (permissionToOp != null) {
            if (packageName == null) {
                String[] packagesForUid = context.getPackageManager().getPackagesForUid(myUid);
                if (packagesForUid == null || packagesForUid.length <= 0) {
                    return -1;
                }
                packageName = packagesForUid[0];
            }
            int myUid2 = Process.myUid();
            String packageName2 = context.getPackageName();
            if (myUid2 == myUid && Objects.equals(packageName2, packageName)) {
                AppOpsManager c2 = AbstractC0227e.c(context);
                noteProxyOpNoThrow = AbstractC0227e.a(c2, permissionToOp, Binder.getCallingUid(), packageName);
                if (noteProxyOpNoThrow == 0) {
                    noteProxyOpNoThrow = AbstractC0227e.a(c2, permissionToOp, myUid, AbstractC0227e.b(context));
                }
            } else {
                noteProxyOpNoThrow = ((AppOpsManager) context.getSystemService(AppOpsManager.class)).noteProxyOpNoThrow(permissionToOp, packageName);
            }
            if (noteProxyOpNoThrow != 0) {
                return -2;
            }
        }
        return 0;
    }

    public static int s(c0 c0Var, B b2, View view, View view2, P p2, boolean z2) {
        if (p2.v() == 0 || c0Var.b() == 0 || view == null || view2 == null) {
            return 0;
        }
        if (!z2) {
            return Math.abs(P.D(view) - P.D(view2)) + 1;
        }
        return Math.min(b2.g(), b2.b(view2) - b2.d(view));
    }

    public static int t(c0 c0Var, B b2, View view, View view2, P p2, boolean z2, boolean z3) {
        if (p2.v() == 0 || c0Var.b() == 0 || view == null || view2 == null) {
            return 0;
        }
        int max = z3 ? Math.max(0, (c0Var.b() - Math.max(P.D(view), P.D(view2))) - 1) : Math.max(0, Math.min(P.D(view), P.D(view2)));
        if (z2) {
            return Math.round((max * (Math.abs(b2.b(view2) - b2.d(view)) / (Math.abs(P.D(view) - P.D(view2)) + 1))) + (b2.f() - b2.d(view)));
        }
        return max;
    }

    public static int u(c0 c0Var, B b2, View view, View view2, P p2, boolean z2) {
        if (p2.v() == 0 || c0Var.b() == 0 || view == null || view2 == null) {
            return 0;
        }
        if (!z2) {
            return c0Var.b();
        }
        return (int) (((b2.b(view2) - b2.d(view)) / (Math.abs(P.D(view) - P.D(view2)) + 1)) * c0Var.b());
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:19:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static androidx.emoji2.text.s v(android.content.Context r8) {
        /*
            android.content.pm.PackageManager r0 = r8.getPackageManager()
            java.lang.String r1 = "Package manager required to locate emoji font provider"
            o(r0, r1)
            android.content.Intent r1 = new android.content.Intent
            java.lang.String r2 = "androidx.content.action.LOAD_EMOJI_FONT"
            r1.<init>(r2)
            r2 = 0
            java.util.List r1 = r0.queryIntentContentProviders(r1, r2)
            java.util.Iterator r1 = r1.iterator()
        L19:
            boolean r3 = r1.hasNext()
            r4 = 0
            if (r3 == 0) goto L35
            java.lang.Object r3 = r1.next()
            android.content.pm.ResolveInfo r3 = (android.content.pm.ResolveInfo) r3
            android.content.pm.ProviderInfo r3 = r3.providerInfo
            if (r3 == 0) goto L19
            android.content.pm.ApplicationInfo r5 = r3.applicationInfo
            if (r5 == 0) goto L19
            int r5 = r5.flags
            r6 = 1
            r5 = r5 & r6
            if (r5 != r6) goto L19
            goto L36
        L35:
            r3 = r4
        L36:
            if (r3 != 0) goto L3a
        L38:
            r2 = r4
            goto L6d
        L3a:
            java.lang.String r1 = r3.authority     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L66
            java.lang.String r3 = r3.packageName     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L66
            r5 = 64
            android.content.pm.PackageInfo r0 = r0.getPackageInfo(r3, r5)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L66
            android.content.pm.Signature[] r0 = r0.signatures     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L66
            java.util.ArrayList r5 = new java.util.ArrayList     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L66
            r5.<init>()     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L66
            int r6 = r0.length     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L66
        L4c:
            if (r2 >= r6) goto L5a
            r7 = r0[r2]     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L66
            byte[] r7 = r7.toByteArray()     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L66
            r5.add(r7)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L66
            int r2 = r2 + 1
            goto L4c
        L5a:
            java.util.List r0 = java.util.Collections.singletonList(r5)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L66
            i.r r2 = new i.r     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L66
            java.lang.String r5 = "emojicompat-emoji-font"
            r2.<init>(r1, r3, r5, r0)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L66
            goto L6d
        L66:
            r0 = move-exception
            java.lang.String r1 = "emoji2.text.DefaultEmojiConfig"
            android.util.Log.wtf(r1, r0)
            goto L38
        L6d:
            if (r2 != 0) goto L70
            goto L7a
        L70:
            androidx.emoji2.text.s r4 = new androidx.emoji2.text.s
            androidx.emoji2.text.r r0 = new androidx.emoji2.text.r
            r0.<init>(r8, r2)
            r4.<init>(r0)
        L7a:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: B.a.v(android.content.Context):androidx.emoji2.text.s");
    }

    public static int w(View view, int i2) {
        return k.m(view.getContext(), i2, view.getClass().getCanonicalName());
    }

    public static ColorStateList x(Context context, int i2) {
        ColorStateList colorStateList;
        ColorStateList colorStateList2;
        h hVar;
        Object obj = w.e.f3731a;
        Resources resources = context.getResources();
        Resources.Theme theme = context.getTheme();
        i iVar = new i(resources, theme);
        synchronized (x.k.f3764c) {
            try {
                SparseArray sparseArray = (SparseArray) x.k.f3763b.get(iVar);
                colorStateList = null;
                if (sparseArray != null && sparseArray.size() > 0 && (hVar = (h) sparseArray.get(i2)) != null) {
                    if (hVar.f3756b.equals(resources.getConfiguration())) {
                        colorStateList2 = hVar.f3755a;
                    } else {
                        sparseArray.remove(i2);
                    }
                }
                colorStateList2 = null;
            } finally {
            }
        }
        if (colorStateList2 != null) {
            return colorStateList2;
        }
        ThreadLocal threadLocal = x.k.f3762a;
        TypedValue typedValue = (TypedValue) threadLocal.get();
        if (typedValue == null) {
            typedValue = new TypedValue();
            threadLocal.set(typedValue);
        }
        resources.getValue(i2, typedValue, true);
        int i3 = typedValue.type;
        if (i3 < 28 || i3 > 31) {
            try {
                colorStateList = x.c.a(resources, resources.getXml(i2), theme);
            } catch (Exception e2) {
                Log.w("ResourcesCompat", "Failed to inflate ColorStateList, leaving it to the framework", e2);
            }
        }
        if (colorStateList == null) {
            return resources.getColorStateList(i2, theme);
        }
        synchronized (x.k.f3764c) {
            try {
                WeakHashMap weakHashMap = x.k.f3763b;
                SparseArray sparseArray2 = (SparseArray) weakHashMap.get(iVar);
                if (sparseArray2 == null) {
                    sparseArray2 = new SparseArray();
                    weakHashMap.put(iVar, sparseArray2);
                }
                sparseArray2.append(i2, new h(colorStateList, iVar.f3757a.getConfiguration()));
            } finally {
            }
        }
        return colorStateList;
    }

    public static float z(EdgeEffect edgeEffect) {
        if (H()) {
            return I.b.b(edgeEffect);
        }
        return 0.0f;
    }

    public int F(View view) {
        return 0;
    }

    public int G() {
        return 0;
    }

    public abstract void Q(Throwable th);

    public abstract View R(int i2);

    public abstract void S(int i2);

    public abstract void T(Typeface typeface);

    public abstract void U(Typeface typeface, boolean z2);

    public abstract boolean V();

    public abstract void W(C0107g c0107g);

    public void Y(View view, int i2) {
    }

    public abstract void Z(int i2);

    public abstract void a0(View view, int i2, int i3);

    public abstract void b0(View view, float f2, float f3);

    public abstract Object d0(Intent intent, int i2);

    @Override // F.U
    public void e(View view) {
    }

    @Override // F.U
    public void g() {
    }

    public abstract boolean j0(View view, int i2);

    public void k(int i2) {
        new Handler(Looper.getMainLooper()).post(new j(i2, 0, this));
    }

    public void l(Typeface typeface) {
        new Handler(Looper.getMainLooper()).post(new RunnableC0151j(4, this, typeface));
    }

    public abstract int q(View view, int i2);

    public abstract int r(View view, int i2);

    public abstract void y(float f2, float f3, v vVar);
}
