package S;

import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import n.C0200f;

/* renamed from: S.b, reason: case insensitive filesystem */
/* loaded from: /home/sonpt/Hackdeboc/bigbang.htb/apk/classes.dex */
public final class C0026b {

    /* renamed from: d, reason: collision with root package name */
    public final F f330d;

    /* renamed from: a, reason: collision with root package name */
    public final C0200f f327a = new C0200f(30, 1);

    /* renamed from: b, reason: collision with root package name */
    public final ArrayList f328b = new ArrayList();

    /* renamed from: c, reason: collision with root package name */
    public final ArrayList f329c = new ArrayList();

    /* renamed from: e, reason: collision with root package name */
    public final N f331e = new N(2, this);

    public C0026b(F f2) {
        this.f330d = f2;
    }

    public final boolean a(int i2) {
        ArrayList arrayList = this.f329c;
        int size = arrayList.size();
        for (int i3 = 0; i3 < size; i3++) {
            C0025a c0025a = (C0025a) arrayList.get(i3);
            int i4 = c0025a.f316a;
            if (i4 == 8) {
                if (f(c0025a.f319d, i3 + 1) == i2) {
                    return true;
                }
            } else if (i4 == 1) {
                int i5 = c0025a.f317b;
                int i6 = c0025a.f319d + i5;
                while (i5 < i6) {
                    if (f(i5, i3 + 1) == i2) {
                        return true;
                    }
                    i5++;
                }
            } else {
                continue;
            }
        }
        return false;
    }

    public final void b() {
        ArrayList arrayList = this.f329c;
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            this.f330d.a((C0025a) arrayList.get(i2));
        }
        l(arrayList);
    }

    public final void c() {
        b();
        ArrayList arrayList = this.f328b;
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            C0025a c0025a = (C0025a) arrayList.get(i2);
            int i3 = c0025a.f316a;
            F f2 = this.f330d;
            if (i3 == 1) {
                f2.a(c0025a);
                f2.d(c0025a.f317b, c0025a.f319d);
            } else if (i3 == 2) {
                f2.a(c0025a);
                int i4 = c0025a.f317b;
                int i5 = c0025a.f319d;
                RecyclerView recyclerView = f2.f263a;
                recyclerView.O(i4, i5, true);
                recyclerView.f1559f0 = true;
                recyclerView.f1553c0.f336c += i5;
            } else if (i3 == 4) {
                f2.a(c0025a);
                f2.c(c0025a.f317b, c0025a.f319d, c0025a.f318c);
            } else if (i3 == 8) {
                f2.a(c0025a);
                f2.e(c0025a.f317b, c0025a.f319d);
            }
        }
        l(arrayList);
    }

    public final void d(C0025a c0025a) {
        int i2;
        int i3 = c0025a.f316a;
        if (i3 == 1 || i3 == 8) {
            throw new IllegalArgumentException("should not dispatch add or move for pre layout");
        }
        int m2 = m(c0025a.f317b, i3);
        int i4 = c0025a.f317b;
        int i5 = c0025a.f316a;
        if (i5 == 2) {
            i2 = 0;
        } else {
            if (i5 != 4) {
                throw new IllegalArgumentException("op should be remove or update." + c0025a);
            }
            i2 = 1;
        }
        int i6 = 1;
        for (int i7 = 1; i7 < c0025a.f319d; i7++) {
            int m3 = m((i2 * i7) + c0025a.f317b, c0025a.f316a);
            int i8 = c0025a.f316a;
            if (i8 == 2 ? m3 != m2 : !(i8 == 4 && m3 == m2 + 1)) {
                C0025a h2 = h(c0025a.f318c, i8, m2, i6);
                e(h2, i4);
                h2.f318c = null;
                this.f327a.b(h2);
                if (c0025a.f316a == 4) {
                    i4 += i6;
                }
                i6 = 1;
                m2 = m3;
            } else {
                i6++;
            }
        }
        Object obj = c0025a.f318c;
        c0025a.f318c = null;
        this.f327a.b(c0025a);
        if (i6 > 0) {
            C0025a h3 = h(obj, c0025a.f316a, m2, i6);
            e(h3, i4);
            h3.f318c = null;
            this.f327a.b(h3);
        }
    }

    public final void e(C0025a c0025a, int i2) {
        F f2 = this.f330d;
        f2.a(c0025a);
        int i3 = c0025a.f316a;
        if (i3 != 2) {
            if (i3 != 4) {
                throw new IllegalArgumentException("only remove and update ops can be dispatched in first pass");
            }
            f2.c(i2, c0025a.f319d, c0025a.f318c);
        } else {
            int i4 = c0025a.f319d;
            RecyclerView recyclerView = f2.f263a;
            recyclerView.O(i2, i4, true);
            recyclerView.f1559f0 = true;
            recyclerView.f1553c0.f336c += i4;
        }
    }

    public final int f(int i2, int i3) {
        ArrayList arrayList = this.f329c;
        int size = arrayList.size();
        while (i3 < size) {
            C0025a c0025a = (C0025a) arrayList.get(i3);
            int i4 = c0025a.f316a;
            if (i4 == 8) {
                int i5 = c0025a.f317b;
                if (i5 == i2) {
                    i2 = c0025a.f319d;
                } else {
                    if (i5 < i2) {
                        i2--;
                    }
                    if (c0025a.f319d <= i2) {
                        i2++;
                    }
                }
            } else {
                int i6 = c0025a.f317b;
                if (i6 > i2) {
                    continue;
                } else if (i4 == 2) {
                    int i7 = c0025a.f319d;
                    if (i2 < i6 + i7) {
                        return -1;
                    }
                    i2 -= i7;
                } else if (i4 == 1) {
                    i2 += c0025a.f319d;
                }
            }
            i3++;
        }
        return i2;
    }

    public final boolean g() {
        return this.f328b.size() > 0;
    }

    public final C0025a h(Object obj, int i2, int i3, int i4) {
        C0025a c0025a = (C0025a) this.f327a.a();
        if (c0025a != null) {
            c0025a.f316a = i2;
            c0025a.f317b = i3;
            c0025a.f319d = i4;
            c0025a.f318c = obj;
            return c0025a;
        }
        C0025a c0025a2 = new C0025a();
        c0025a2.f316a = i2;
        c0025a2.f317b = i3;
        c0025a2.f319d = i4;
        c0025a2.f318c = obj;
        return c0025a2;
    }

    public final void i(C0025a c0025a) {
        this.f329c.add(c0025a);
        int i2 = c0025a.f316a;
        F f2 = this.f330d;
        if (i2 == 1) {
            f2.d(c0025a.f317b, c0025a.f319d);
            return;
        }
        if (i2 == 2) {
            int i3 = c0025a.f317b;
            int i4 = c0025a.f319d;
            RecyclerView recyclerView = f2.f263a;
            recyclerView.O(i3, i4, false);
            recyclerView.f1559f0 = true;
            return;
        }
        if (i2 == 4) {
            f2.c(c0025a.f317b, c0025a.f319d, c0025a.f318c);
        } else if (i2 == 8) {
            f2.e(c0025a.f317b, c0025a.f319d);
        } else {
            throw new IllegalArgumentException("Unknown update op type for " + c0025a);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:119:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x00aa A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:130:0x0009 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:131:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0138 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0124 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void j() {
        /*
            Method dump skipped, instructions count: 689
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: S.C0026b.j():void");
    }

    public final void k(C0025a c0025a) {
        c0025a.f318c = null;
        this.f327a.b(c0025a);
    }

    public final void l(ArrayList arrayList) {
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            k((C0025a) arrayList.get(i2));
        }
        arrayList.clear();
    }

    public final int m(int i2, int i3) {
        int i4;
        int i5;
        ArrayList arrayList = this.f329c;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            C0025a c0025a = (C0025a) arrayList.get(size);
            int i6 = c0025a.f316a;
            if (i6 == 8) {
                int i7 = c0025a.f317b;
                int i8 = c0025a.f319d;
                if (i7 < i8) {
                    i5 = i7;
                    i4 = i8;
                } else {
                    i4 = i7;
                    i5 = i8;
                }
                if (i2 < i5 || i2 > i4) {
                    if (i2 < i7) {
                        if (i3 == 1) {
                            c0025a.f317b = i7 + 1;
                            c0025a.f319d = i8 + 1;
                        } else if (i3 == 2) {
                            c0025a.f317b = i7 - 1;
                            c0025a.f319d = i8 - 1;
                        }
                    }
                } else if (i5 == i7) {
                    if (i3 == 1) {
                        c0025a.f319d = i8 + 1;
                    } else if (i3 == 2) {
                        c0025a.f319d = i8 - 1;
                    }
                    i2++;
                } else {
                    if (i3 == 1) {
                        c0025a.f317b = i7 + 1;
                    } else if (i3 == 2) {
                        c0025a.f317b = i7 - 1;
                    }
                    i2--;
                }
            } else {
                int i9 = c0025a.f317b;
                if (i9 <= i2) {
                    if (i6 == 1) {
                        i2 -= c0025a.f319d;
                    } else if (i6 == 2) {
                        i2 += c0025a.f319d;
                    }
                } else if (i3 == 1) {
                    c0025a.f317b = i9 + 1;
                } else if (i3 == 2) {
                    c0025a.f317b = i9 - 1;
                }
            }
        }
        for (int size2 = arrayList.size() - 1; size2 >= 0; size2--) {
            C0025a c0025a2 = (C0025a) arrayList.get(size2);
            if (c0025a2.f316a == 8) {
                int i10 = c0025a2.f319d;
                if (i10 == c0025a2.f317b || i10 < 0) {
                    arrayList.remove(size2);
                    k(c0025a2);
                }
            } else if (c0025a2.f319d <= 0) {
                arrayList.remove(size2);
                k(c0025a2);
            }
        }
        return i2;
    }
}
