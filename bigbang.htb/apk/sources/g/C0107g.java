package g;

import android.content.Context;
import android.graphics.Typeface;
import android.os.Handler;
import android.os.Looper;
import android.util.SparseArray;
import android.view.ActionMode;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import androidx.emoji2.text.t;
import androidx.fragment.app.C0065f;
import h.E;
import h.o;
import h.w;
import java.util.ArrayList;
import java.util.HashSet;
import l.C0190b;
import l.C0193e;
import n.C0200f;
import n.C0205k;

/* renamed from: g.g, reason: case insensitive filesystem */
/* loaded from: /home/sonpt/Hackdeboc/bigbang.htb/apk/classes.dex */
public final class C0107g implements InterfaceC0102b, B.b {

    /* renamed from: e, reason: collision with root package name */
    public static C0107g f2291e;

    /* renamed from: a, reason: collision with root package name */
    public Object f2292a;

    /* renamed from: b, reason: collision with root package name */
    public Object f2293b;

    /* renamed from: c, reason: collision with root package name */
    public Object f2294c;

    /* renamed from: d, reason: collision with root package name */
    public Object f2295d;

    public C0107g(int i2) {
        if (i2 == 2) {
            this.f2292a = new C0200f(10, 1);
            this.f2295d = new l.k();
            this.f2294c = new ArrayList();
            this.f2293b = new HashSet();
            return;
        }
        if (i2 == 5) {
            this.f2292a = new C0190b();
            this.f2293b = new SparseArray();
            this.f2294c = new C0193e();
            this.f2295d = new C0190b();
            return;
        }
        if (i2 == 6) {
            this.f2292a = new Object();
            this.f2293b = new Handler(Looper.getMainLooper(), new n0.e(this));
        } else {
            this.f2292a = new C0200f(256, 0);
            this.f2293b = new C0200f(256, 0);
            this.f2294c = new C0200f(256, 0);
            this.f2295d = new C0205k[32];
        }
    }

    @Override // g.InterfaceC0102b
    public final boolean a(AbstractC0103c abstractC0103c, o oVar) {
        return ((ActionMode.Callback) this.f2292a).onPrepareActionMode(g(abstractC0103c), h(oVar));
    }

    @Override // g.InterfaceC0102b
    public final void b(AbstractC0103c abstractC0103c) {
        ((ActionMode.Callback) this.f2292a).onDestroyActionMode(g(abstractC0103c));
    }

    @Override // g.InterfaceC0102b
    public final boolean c(AbstractC0103c abstractC0103c, o oVar) {
        return ((ActionMode.Callback) this.f2292a).onCreateActionMode(g(abstractC0103c), h(oVar));
    }

    @Override // B.b
    public final void d() {
        ((View) this.f2292a).clearAnimation();
        ((ViewGroup) this.f2293b).endViewTransition((View) this.f2292a);
        ((C0065f) this.f2294c).b();
    }

    @Override // g.InterfaceC0102b
    public final boolean e(AbstractC0103c abstractC0103c, MenuItem menuItem) {
        return ((ActionMode.Callback) this.f2292a).onActionItemClicked(g(abstractC0103c), new w((Context) this.f2293b, (A.b) menuItem));
    }

    public final void f(Object obj, ArrayList arrayList, HashSet hashSet) {
        if (arrayList.contains(obj)) {
            return;
        }
        if (hashSet.contains(obj)) {
            throw new RuntimeException("This graph contains cyclic dependencies");
        }
        hashSet.add(obj);
        ArrayList arrayList2 = (ArrayList) ((l.k) this.f2295d).getOrDefault(obj, null);
        if (arrayList2 != null) {
            int size = arrayList2.size();
            for (int i2 = 0; i2 < size; i2++) {
                f(arrayList2.get(i2), arrayList, hashSet);
            }
        }
        hashSet.remove(obj);
        arrayList.add(obj);
    }

    public final C0108h g(AbstractC0103c abstractC0103c) {
        int size = ((ArrayList) this.f2294c).size();
        for (int i2 = 0; i2 < size; i2++) {
            C0108h c0108h = (C0108h) ((ArrayList) this.f2294c).get(i2);
            if (c0108h != null && c0108h.f2297b == abstractC0103c) {
                return c0108h;
            }
        }
        C0108h c0108h2 = new C0108h((Context) this.f2293b, abstractC0103c);
        ((ArrayList) this.f2294c).add(c0108h2);
        return c0108h2;
    }

    public final Menu h(o oVar) {
        Menu menu = (Menu) ((l.k) this.f2295d).getOrDefault(oVar, null);
        if (menu != null) {
            return menu;
        }
        E e2 = new E((Context) this.f2293b, oVar);
        ((l.k) this.f2295d).put(oVar, e2);
        return e2;
    }

    public C0107g(Typeface typeface, M.b bVar) {
        int i2;
        int i3;
        this.f2295d = typeface;
        this.f2292a = bVar;
        this.f2294c = new t(1024);
        M.b bVar2 = (M.b) this.f2292a;
        int a2 = bVar2.a(6);
        if (a2 != 0) {
            int i4 = a2 + bVar2.f215a;
            i2 = bVar2.f216b.getInt(bVar2.f216b.getInt(i4) + i4);
        } else {
            i2 = 0;
        }
        this.f2293b = new char[i2 * 2];
        M.b bVar3 = (M.b) this.f2292a;
        int a3 = bVar3.a(6);
        if (a3 != 0) {
            int i5 = a3 + bVar3.f215a;
            i3 = bVar3.f216b.getInt(bVar3.f216b.getInt(i5) + i5);
        } else {
            i3 = 0;
        }
        for (int i6 = 0; i6 < i3; i6++) {
            androidx.emoji2.text.m mVar = new androidx.emoji2.text.m(this, i6);
            M.a c2 = mVar.c();
            int a4 = c2.a(4);
            Character.toChars(a4 != 0 ? c2.f216b.getInt(a4 + c2.f215a) : 0, (char[]) this.f2293b, i6 * 2);
            B.a.m(mVar.b() > 0, "invalid metadata codepoint length");
            ((t) this.f2294c).a(mVar, 0, mVar.b() - 1);
        }
    }
}
