package S;

import android.view.View;
import java.util.Arrays;
import java.util.List;
import l.C0193e;

/* loaded from: /home/sonpt/Hackdeboc/bigbang.htb/apk/classes.dex */
public final class r0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f509a;

    /* renamed from: b, reason: collision with root package name */
    public Object f510b;

    /* renamed from: c, reason: collision with root package name */
    public Object f511c;

    public r0(int i2) {
        this.f509a = i2;
        if (i2 != 1) {
            this.f510b = new l.k();
            this.f511c = new C0193e();
        }
    }

    public final void a(f0 f0Var) {
        q0 q0Var = (q0) ((l.k) this.f510b).getOrDefault(f0Var, null);
        if (q0Var == null) {
            q0Var = q0.a();
            ((l.k) this.f510b).put(f0Var, q0Var);
        }
        q0Var.f501a |= 1;
    }

    public final void b(f0 f0Var, K k2) {
        q0 q0Var = (q0) ((l.k) this.f510b).getOrDefault(f0Var, null);
        if (q0Var == null) {
            q0Var = q0.a();
            ((l.k) this.f510b).put(f0Var, q0Var);
        }
        q0Var.f503c = k2;
        q0Var.f501a |= 8;
    }

    public final void c(f0 f0Var, K k2) {
        q0 q0Var = (q0) ((l.k) this.f510b).getOrDefault(f0Var, null);
        if (q0Var == null) {
            q0Var = q0.a();
            ((l.k) this.f510b).put(f0Var, q0Var);
        }
        q0Var.f502b = k2;
        q0Var.f501a |= 4;
    }

    public final void d() {
        switch (this.f509a) {
            case 0:
                ((l.k) this.f510b).clear();
                ((C0193e) this.f511c).a();
                break;
            default:
                int[] iArr = (int[]) this.f510b;
                if (iArr != null) {
                    Arrays.fill(iArr, -1);
                }
                this.f511c = null;
                break;
        }
    }

    public final void e(int i2) {
        Object obj = this.f510b;
        if (((int[]) obj) == null) {
            int[] iArr = new int[Math.max(i2, 10) + 1];
            this.f510b = iArr;
            Arrays.fill(iArr, -1);
        } else if (i2 >= ((int[]) obj).length) {
            int[] iArr2 = (int[]) obj;
            int length = ((int[]) obj).length;
            while (length <= i2) {
                length *= 2;
            }
            int[] iArr3 = new int[length];
            this.f510b = iArr3;
            System.arraycopy(iArr2, 0, iArr3, 0, iArr2.length);
            Object obj2 = this.f510b;
            Arrays.fill((int[]) obj2, iArr2.length, ((int[]) obj2).length, -1);
        }
    }

    public final View f(int i2, int i3, int i4, int i5) {
        int A2;
        int i6;
        int B2;
        View u2;
        N n2 = (N) ((p0) this.f510b);
        int i7 = n2.f276a;
        Object obj = n2.f277b;
        switch (i7) {
            case 0:
                A2 = ((P) obj).A();
                break;
            default:
                A2 = ((P) obj).C();
                break;
        }
        N n3 = (N) ((p0) this.f510b);
        int i8 = n3.f276a;
        Object obj2 = n3.f277b;
        switch (i8) {
            case 0:
                P p2 = (P) obj2;
                i6 = p2.f295n;
                B2 = p2.B();
                break;
            default:
                P p3 = (P) obj2;
                i6 = p3.f296o;
                B2 = p3.z();
                break;
        }
        int i9 = i6 - B2;
        int i10 = i3 > i2 ? 1 : -1;
        View view = null;
        while (i2 != i3) {
            N n4 = (N) ((p0) this.f510b);
            int i11 = n4.f276a;
            Object obj3 = n4.f277b;
            switch (i11) {
                case 0:
                    u2 = ((P) obj3).u(i2);
                    break;
                default:
                    u2 = ((P) obj3).u(i2);
                    break;
            }
            int c2 = ((N) ((p0) this.f510b)).c(u2);
            int b2 = ((N) ((p0) this.f510b)).b(u2);
            Object obj4 = this.f511c;
            o0 o0Var = (o0) obj4;
            o0Var.f462b = A2;
            o0Var.f463c = i9;
            o0Var.f464d = c2;
            o0Var.f465e = b2;
            if (i4 != 0) {
                ((o0) obj4).f461a = i4;
                if (((o0) obj4).a()) {
                    return u2;
                }
            }
            if (i5 != 0) {
                Object obj5 = this.f511c;
                ((o0) obj5).f461a = i5;
                if (((o0) obj5).a()) {
                    view = u2;
                }
            }
            i2 += i10;
        }
        return view;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0082  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int g(int r6) {
        /*
            r5 = this;
            java.lang.Object r0 = r5.f510b
            int[] r0 = (int[]) r0
            r1 = -1
            if (r0 != 0) goto L8
            return r1
        L8:
            int r0 = r0.length
            if (r6 < r0) goto Lc
            return r1
        Lc:
            java.lang.Object r0 = r5.f511c
            r2 = r0
            java.util.List r2 = (java.util.List) r2
            if (r2 != 0) goto L15
        L13:
            r0 = r1
            goto L72
        L15:
            java.util.List r0 = (java.util.List) r0
            r2 = 0
            if (r0 != 0) goto L1b
            goto L36
        L1b:
            int r0 = r0.size()
            int r0 = r0 + (-1)
        L21:
            if (r0 < 0) goto L36
            java.lang.Object r3 = r5.f511c
            java.util.List r3 = (java.util.List) r3
            java.lang.Object r3 = r3.get(r0)
            S.l0 r3 = (S.l0) r3
            int r4 = r3.f436a
            if (r4 != r6) goto L33
            r2 = r3
            goto L36
        L33:
            int r0 = r0 + (-1)
            goto L21
        L36:
            if (r2 == 0) goto L3f
            java.lang.Object r0 = r5.f511c
            java.util.List r0 = (java.util.List) r0
            r0.remove(r2)
        L3f:
            java.lang.Object r0 = r5.f511c
            java.util.List r0 = (java.util.List) r0
            int r0 = r0.size()
            r2 = 0
        L48:
            if (r2 >= r0) goto L5c
            java.lang.Object r3 = r5.f511c
            java.util.List r3 = (java.util.List) r3
            java.lang.Object r3 = r3.get(r2)
            S.l0 r3 = (S.l0) r3
            int r3 = r3.f436a
            if (r3 < r6) goto L59
            goto L5d
        L59:
            int r2 = r2 + 1
            goto L48
        L5c:
            r2 = r1
        L5d:
            if (r2 == r1) goto L13
            java.lang.Object r0 = r5.f511c
            java.util.List r0 = (java.util.List) r0
            java.lang.Object r0 = r0.get(r2)
            S.l0 r0 = (S.l0) r0
            java.lang.Object r3 = r5.f511c
            java.util.List r3 = (java.util.List) r3
            r3.remove(r2)
            int r0 = r0.f436a
        L72:
            if (r0 != r1) goto L82
            java.lang.Object r0 = r5.f510b
            int[] r0 = (int[]) r0
            int r2 = r0.length
            java.util.Arrays.fill(r0, r6, r2, r1)
            java.lang.Object r5 = r5.f510b
            int[] r5 = (int[]) r5
            int r5 = r5.length
            return r5
        L82:
            java.lang.Object r5 = r5.f510b
            int[] r5 = (int[]) r5
            int r0 = r0 + 1
            java.util.Arrays.fill(r5, r6, r0, r1)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: S.r0.g(int):int");
    }

    public final boolean h(View view) {
        int A2;
        int i2;
        int B2;
        o0 o0Var = (o0) this.f511c;
        N n2 = (N) ((p0) this.f510b);
        int i3 = n2.f276a;
        Object obj = n2.f277b;
        switch (i3) {
            case 0:
                A2 = ((P) obj).A();
                break;
            default:
                A2 = ((P) obj).C();
                break;
        }
        N n3 = (N) ((p0) this.f510b);
        int i4 = n3.f276a;
        Object obj2 = n3.f277b;
        switch (i4) {
            case 0:
                P p2 = (P) obj2;
                i2 = p2.f295n;
                B2 = p2.B();
                break;
            default:
                P p3 = (P) obj2;
                i2 = p3.f296o;
                B2 = p3.z();
                break;
        }
        int i5 = i2 - B2;
        int c2 = ((N) ((p0) this.f510b)).c(view);
        int b2 = ((N) ((p0) this.f510b)).b(view);
        o0Var.f462b = A2;
        o0Var.f463c = i5;
        o0Var.f464d = c2;
        o0Var.f465e = b2;
        Object obj3 = this.f511c;
        ((o0) obj3).f461a = 24579;
        return ((o0) obj3).a();
    }

    public final void i(int i2, int i3) {
        int[] iArr = (int[]) this.f510b;
        if (iArr == null || i2 >= iArr.length) {
            return;
        }
        int i4 = i2 + i3;
        e(i4);
        int[] iArr2 = (int[]) this.f510b;
        System.arraycopy(iArr2, i2, iArr2, i4, (iArr2.length - i2) - i3);
        Arrays.fill((int[]) this.f510b, i2, i4, -1);
        List list = (List) this.f511c;
        if (list == null) {
            return;
        }
        for (int size = list.size() - 1; size >= 0; size--) {
            l0 l0Var = (l0) ((List) this.f511c).get(size);
            int i5 = l0Var.f436a;
            if (i5 >= i2) {
                l0Var.f436a = i5 + i3;
            }
        }
    }

    public final void j(int i2, int i3) {
        int[] iArr = (int[]) this.f510b;
        if (iArr == null || i2 >= iArr.length) {
            return;
        }
        int i4 = i2 + i3;
        e(i4);
        int[] iArr2 = (int[]) this.f510b;
        System.arraycopy(iArr2, i4, iArr2, i2, (iArr2.length - i2) - i3);
        int[] iArr3 = (int[]) this.f510b;
        Arrays.fill(iArr3, iArr3.length - i3, iArr3.length, -1);
        List list = (List) this.f511c;
        if (list == null) {
            return;
        }
        for (int size = list.size() - 1; size >= 0; size--) {
            l0 l0Var = (l0) ((List) this.f511c).get(size);
            int i5 = l0Var.f436a;
            if (i5 >= i2) {
                if (i5 < i4) {
                    ((List) this.f511c).remove(size);
                } else {
                    l0Var.f436a = i5 - i3;
                }
            }
        }
    }

    public final K k(f0 f0Var, int i2) {
        q0 q0Var;
        K k2;
        int e2 = ((l.k) this.f510b).e(f0Var);
        if (e2 >= 0 && (q0Var = (q0) ((l.k) this.f510b).j(e2)) != null) {
            int i3 = q0Var.f501a;
            if ((i3 & i2) != 0) {
                int i4 = i3 & (~i2);
                q0Var.f501a = i4;
                if (i2 == 4) {
                    k2 = q0Var.f502b;
                } else {
                    if (i2 != 8) {
                        throw new IllegalArgumentException("Must provide flag PRE or POST");
                    }
                    k2 = q0Var.f503c;
                }
                if ((i4 & 12) == 0) {
                    ((l.k) this.f510b).i(e2);
                    q0Var.f501a = 0;
                    q0Var.f502b = null;
                    q0Var.f503c = null;
                    q0.f500d.b(q0Var);
                }
                return k2;
            }
        }
        return null;
    }

    public final void l(f0 f0Var) {
        q0 q0Var = (q0) ((l.k) this.f510b).getOrDefault(f0Var, null);
        if (q0Var == null) {
            return;
        }
        q0Var.f501a &= -2;
    }

    public final void m(f0 f0Var) {
        int f2 = ((C0193e) this.f511c).f() - 1;
        while (true) {
            if (f2 < 0) {
                break;
            }
            if (f0Var == ((C0193e) this.f511c).g(f2)) {
                C0193e c0193e = (C0193e) this.f511c;
                Object[] objArr = c0193e.f3024c;
                Object obj = objArr[f2];
                Object obj2 = C0193e.f3021e;
                if (obj != obj2) {
                    objArr[f2] = obj2;
                    c0193e.f3022a = true;
                }
            } else {
                f2--;
            }
        }
        q0 q0Var = (q0) ((l.k) this.f510b).remove(f0Var);
        if (q0Var != null) {
            q0Var.f501a = 0;
            q0Var.f502b = null;
            q0Var.f503c = null;
            q0.f500d.b(q0Var);
        }
    }

    public r0(N n2) {
        this.f509a = 2;
        this.f510b = n2;
        o0 o0Var = new o0();
        o0Var.f461a = 0;
        this.f511c = o0Var;
    }
}
