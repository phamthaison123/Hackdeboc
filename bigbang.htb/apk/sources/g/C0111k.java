package g;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.util.AttributeSet;
import android.util.Log;
import android.util.Xml;
import android.view.InflateException;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.SubMenu;
import d.AbstractC0092a;
import e.C0097c;
import h.r;
import i.AbstractC0146g0;
import java.io.IOException;
import org.xmlpull.v1.XmlPullParserException;

/* renamed from: g.k, reason: case insensitive filesystem */
/* loaded from: /home/sonpt/Hackdeboc/bigbang.htb/apk/classes.dex */
public final class C0111k extends MenuInflater {

    /* renamed from: e, reason: collision with root package name */
    public static final Class[] f2332e;

    /* renamed from: f, reason: collision with root package name */
    public static final Class[] f2333f;

    /* renamed from: a, reason: collision with root package name */
    public final Object[] f2334a;

    /* renamed from: b, reason: collision with root package name */
    public final Object[] f2335b;

    /* renamed from: c, reason: collision with root package name */
    public final Context f2336c;

    /* renamed from: d, reason: collision with root package name */
    public Object f2337d;

    static {
        Class[] clsArr = {Context.class};
        f2332e = clsArr;
        f2333f = clsArr;
    }

    public C0111k(Context context) {
        super(context);
        this.f2336c = context;
        Object[] objArr = {context};
        this.f2334a = objArr;
        this.f2335b = objArr;
    }

    public static Object a(Context context) {
        return (!(context instanceof Activity) && (context instanceof ContextWrapper)) ? a(((ContextWrapper) context).getBaseContext()) : context;
    }

    public final void b(XmlResourceParser xmlResourceParser, AttributeSet attributeSet, Menu menu) {
        int i2;
        ColorStateList colorStateList;
        C0110j c0110j = new C0110j(this, menu);
        int eventType = xmlResourceParser.getEventType();
        while (true) {
            i2 = 2;
            if (eventType == 2) {
                String name = xmlResourceParser.getName();
                if (!name.equals("menu")) {
                    throw new RuntimeException("Expecting menu, got ".concat(name));
                }
                eventType = xmlResourceParser.next();
            } else {
                eventType = xmlResourceParser.next();
                if (eventType == 1) {
                    break;
                }
            }
        }
        boolean z2 = false;
        boolean z3 = false;
        String str = null;
        while (!z2) {
            if (eventType == 1) {
                throw new RuntimeException("Unexpected end of document");
            }
            if (eventType != i2) {
                if (eventType == 3) {
                    String name2 = xmlResourceParser.getName();
                    if (z3 && name2.equals(str)) {
                        z3 = false;
                        str = null;
                        eventType = xmlResourceParser.next();
                        i2 = 2;
                        z2 = z2;
                        z3 = z3;
                    } else if (name2.equals("group")) {
                        c0110j.f2307b = 0;
                        c0110j.f2308c = 0;
                        c0110j.f2309d = 0;
                        c0110j.f2310e = 0;
                        c0110j.f2311f = true;
                        c0110j.f2312g = true;
                    } else if (name2.equals("item")) {
                        if (!c0110j.f2313h) {
                            r rVar = c0110j.f2331z;
                            if (rVar == null || !rVar.f2506a.hasSubMenu()) {
                                c0110j.f2313h = true;
                                c0110j.b(c0110j.f2306a.add(c0110j.f2307b, c0110j.f2314i, c0110j.f2315j, c0110j.f2316k));
                            } else {
                                c0110j.f2313h = true;
                                c0110j.b(c0110j.f2306a.addSubMenu(c0110j.f2307b, c0110j.f2314i, c0110j.f2315j, c0110j.f2316k).getItem());
                            }
                        }
                    } else if (name2.equals("menu")) {
                        z2 = true;
                    }
                }
                z2 = z2;
            } else {
                if (!z3) {
                    String name3 = xmlResourceParser.getName();
                    boolean equals = name3.equals("group");
                    C0111k c0111k = c0110j.f2305E;
                    if (equals) {
                        TypedArray obtainStyledAttributes = c0111k.f2336c.obtainStyledAttributes(attributeSet, AbstractC0092a.f2021p);
                        c0110j.f2307b = obtainStyledAttributes.getResourceId(1, 0);
                        c0110j.f2308c = obtainStyledAttributes.getInt(3, 0);
                        c0110j.f2309d = obtainStyledAttributes.getInt(4, 0);
                        c0110j.f2310e = obtainStyledAttributes.getInt(5, 0);
                        c0110j.f2311f = obtainStyledAttributes.getBoolean(2, true);
                        c0110j.f2312g = obtainStyledAttributes.getBoolean(0, true);
                        obtainStyledAttributes.recycle();
                    } else {
                        if (name3.equals("item")) {
                            Context context = c0111k.f2336c;
                            C0097c c0097c = new C0097c(context, context.obtainStyledAttributes(attributeSet, AbstractC0092a.f2022q));
                            c0110j.f2314i = c0097c.m(2, 0);
                            c0110j.f2315j = (c0097c.j(5, c0110j.f2308c) & (-65536)) | (c0097c.j(6, c0110j.f2309d) & 65535);
                            c0110j.f2316k = c0097c.p(7);
                            c0110j.f2317l = c0097c.p(8);
                            c0110j.f2318m = c0097c.m(0, 0);
                            String o2 = c0097c.o(9);
                            c0110j.f2319n = o2 == null ? (char) 0 : o2.charAt(0);
                            c0110j.f2320o = c0097c.j(16, 4096);
                            String o3 = c0097c.o(10);
                            c0110j.f2321p = o3 == null ? (char) 0 : o3.charAt(0);
                            c0110j.f2322q = c0097c.j(20, 4096);
                            if (c0097c.r(11)) {
                                c0110j.f2323r = c0097c.a(11, false) ? 1 : 0;
                            } else {
                                c0110j.f2323r = c0110j.f2310e;
                            }
                            c0110j.f2324s = c0097c.a(3, false);
                            c0110j.f2325t = c0097c.a(4, c0110j.f2311f);
                            c0110j.f2326u = c0097c.a(1, c0110j.f2312g);
                            c0110j.f2327v = c0097c.j(21, -1);
                            c0110j.f2330y = c0097c.o(12);
                            c0110j.f2328w = c0097c.m(13, 0);
                            c0110j.f2329x = c0097c.o(15);
                            String o4 = c0097c.o(14);
                            boolean z4 = o4 != null;
                            if (z4 && c0110j.f2328w == 0 && c0110j.f2329x == null) {
                                c0110j.f2331z = (r) c0110j.a(o4, f2333f, c0111k.f2335b);
                            } else {
                                if (z4) {
                                    Log.w("SupportMenuInflater", "Ignoring attribute 'actionProviderClass'. Action view already specified.");
                                }
                                c0110j.f2331z = null;
                            }
                            c0110j.f2301A = c0097c.p(17);
                            c0110j.f2302B = c0097c.p(22);
                            if (c0097c.r(19)) {
                                c0110j.f2304D = AbstractC0146g0.c(c0097c.j(19, -1), c0110j.f2304D);
                                colorStateList = null;
                            } else {
                                colorStateList = null;
                                c0110j.f2304D = null;
                            }
                            if (c0097c.r(18)) {
                                c0110j.f2303C = c0097c.b(18);
                            } else {
                                c0110j.f2303C = colorStateList;
                            }
                            c0097c.u();
                            c0110j.f2313h = false;
                        } else if (name3.equals("menu")) {
                            c0110j.f2313h = true;
                            SubMenu addSubMenu = c0110j.f2306a.addSubMenu(c0110j.f2307b, c0110j.f2314i, c0110j.f2315j, c0110j.f2316k);
                            c0110j.b(addSubMenu.getItem());
                            b(xmlResourceParser, attributeSet, addSubMenu);
                        } else {
                            str = name3;
                            z3 = true;
                        }
                        eventType = xmlResourceParser.next();
                        i2 = 2;
                        z2 = z2;
                        z3 = z3;
                    }
                }
                z2 = z2;
            }
            eventType = xmlResourceParser.next();
            i2 = 2;
            z2 = z2;
            z3 = z3;
        }
    }

    @Override // android.view.MenuInflater
    public final void inflate(int i2, Menu menu) {
        if (!(menu instanceof A.a)) {
            super.inflate(i2, menu);
            return;
        }
        XmlResourceParser xmlResourceParser = null;
        try {
            try {
                try {
                    xmlResourceParser = this.f2336c.getResources().getLayout(i2);
                    b(xmlResourceParser, Xml.asAttributeSet(xmlResourceParser), menu);
                    xmlResourceParser.close();
                } catch (IOException e2) {
                    throw new InflateException("Error inflating menu XML", e2);
                }
            } catch (XmlPullParserException e3) {
                throw new InflateException("Error inflating menu XML", e3);
            }
        } catch (Throwable th) {
            if (xmlResourceParser != null) {
                xmlResourceParser.close();
            }
            throw th;
        }
    }
}
