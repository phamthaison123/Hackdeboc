package l;

import java.util.ConcurrentModificationException;
import java.util.Map;

/* loaded from: /home/sonpt/Hackdeboc/bigbang.htb/apk/classes.dex */
public class k {

    /* renamed from: d, reason: collision with root package name */
    public static Object[] f3043d;

    /* renamed from: e, reason: collision with root package name */
    public static int f3044e;

    /* renamed from: f, reason: collision with root package name */
    public static Object[] f3045f;

    /* renamed from: g, reason: collision with root package name */
    public static int f3046g;

    /* renamed from: a, reason: collision with root package name */
    public int[] f3047a = AbstractC0192d.f3019a;

    /* renamed from: b, reason: collision with root package name */
    public Object[] f3048b = AbstractC0192d.f3020b;

    /* renamed from: c, reason: collision with root package name */
    public int f3049c = 0;

    public static void c(int[] iArr, Object[] objArr, int i2) {
        if (iArr.length == 8) {
            synchronized (k.class) {
                try {
                    if (f3046g < 10) {
                        objArr[0] = f3045f;
                        objArr[1] = iArr;
                        for (int i3 = (i2 << 1) - 1; i3 >= 2; i3--) {
                            objArr[i3] = null;
                        }
                        f3045f = objArr;
                        f3046g++;
                    }
                } finally {
                }
            }
            return;
        }
        if (iArr.length == 4) {
            synchronized (k.class) {
                try {
                    if (f3044e < 10) {
                        objArr[0] = f3043d;
                        objArr[1] = iArr;
                        for (int i4 = (i2 << 1) - 1; i4 >= 2; i4--) {
                            objArr[i4] = null;
                        }
                        f3043d = objArr;
                        f3044e++;
                    }
                } finally {
                }
            }
        }
    }

    public final void a(int i2) {
        if (i2 == 8) {
            synchronized (k.class) {
                try {
                    Object[] objArr = f3045f;
                    if (objArr != null) {
                        this.f3048b = objArr;
                        f3045f = (Object[]) objArr[0];
                        this.f3047a = (int[]) objArr[1];
                        objArr[1] = null;
                        objArr[0] = null;
                        f3046g--;
                        return;
                    }
                } finally {
                }
            }
        } else if (i2 == 4) {
            synchronized (k.class) {
                try {
                    Object[] objArr2 = f3043d;
                    if (objArr2 != null) {
                        this.f3048b = objArr2;
                        f3043d = (Object[]) objArr2[0];
                        this.f3047a = (int[]) objArr2[1];
                        objArr2[1] = null;
                        objArr2[0] = null;
                        f3044e--;
                        return;
                    }
                } finally {
                }
            }
        }
        this.f3047a = new int[i2];
        this.f3048b = new Object[i2 << 1];
    }

    public final void b(int i2) {
        int i3 = this.f3049c;
        int[] iArr = this.f3047a;
        if (iArr.length < i2) {
            Object[] objArr = this.f3048b;
            a(i2);
            if (this.f3049c > 0) {
                System.arraycopy(iArr, 0, this.f3047a, 0, i3);
                System.arraycopy(objArr, 0, this.f3048b, 0, i3 << 1);
            }
            c(iArr, objArr, i3);
        }
        if (this.f3049c != i3) {
            throw new ConcurrentModificationException();
        }
    }

    public final void clear() {
        int i2 = this.f3049c;
        if (i2 > 0) {
            int[] iArr = this.f3047a;
            Object[] objArr = this.f3048b;
            this.f3047a = AbstractC0192d.f3019a;
            this.f3048b = AbstractC0192d.f3020b;
            this.f3049c = 0;
            c(iArr, objArr, i2);
        }
        if (this.f3049c > 0) {
            throw new ConcurrentModificationException();
        }
    }

    public final boolean containsKey(Object obj) {
        return e(obj) >= 0;
    }

    public final boolean containsValue(Object obj) {
        return g(obj) >= 0;
    }

    public final int d(int i2, Object obj) {
        int i3 = this.f3049c;
        if (i3 == 0) {
            return -1;
        }
        try {
            int a2 = AbstractC0192d.a(i3, i2, this.f3047a);
            if (a2 < 0 || obj.equals(this.f3048b[a2 << 1])) {
                return a2;
            }
            int i4 = a2 + 1;
            while (i4 < i3 && this.f3047a[i4] == i2) {
                if (obj.equals(this.f3048b[i4 << 1])) {
                    return i4;
                }
                i4++;
            }
            for (int i5 = a2 - 1; i5 >= 0 && this.f3047a[i5] == i2; i5--) {
                if (obj.equals(this.f3048b[i5 << 1])) {
                    return i5;
                }
            }
            return ~i4;
        } catch (ArrayIndexOutOfBoundsException unused) {
            throw new ConcurrentModificationException();
        }
    }

    public final int e(Object obj) {
        return obj == null ? f() : d(obj.hashCode(), obj);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof k) {
            k kVar = (k) obj;
            if (this.f3049c != kVar.f3049c) {
                return false;
            }
            for (int i2 = 0; i2 < this.f3049c; i2++) {
                try {
                    Object h2 = h(i2);
                    Object j2 = j(i2);
                    Object orDefault = kVar.getOrDefault(h2, null);
                    if (j2 == null) {
                        if (orDefault != null || !kVar.containsKey(h2)) {
                            return false;
                        }
                    } else if (!j2.equals(orDefault)) {
                        return false;
                    }
                } catch (ClassCastException | NullPointerException unused) {
                    return false;
                }
            }
            return true;
        }
        if (obj instanceof Map) {
            Map map = (Map) obj;
            if (this.f3049c != map.size()) {
                return false;
            }
            for (int i3 = 0; i3 < this.f3049c; i3++) {
                try {
                    Object h3 = h(i3);
                    Object j3 = j(i3);
                    Object obj2 = map.get(h3);
                    if (j3 == null) {
                        if (obj2 != null || !map.containsKey(h3)) {
                            return false;
                        }
                    } else if (!j3.equals(obj2)) {
                        return false;
                    }
                } catch (ClassCastException | NullPointerException unused2) {
                }
            }
            return true;
        }
        return false;
    }

    public final int f() {
        int i2 = this.f3049c;
        if (i2 == 0) {
            return -1;
        }
        try {
            int a2 = AbstractC0192d.a(i2, 0, this.f3047a);
            if (a2 < 0 || this.f3048b[a2 << 1] == null) {
                return a2;
            }
            int i3 = a2 + 1;
            while (i3 < i2 && this.f3047a[i3] == 0) {
                if (this.f3048b[i3 << 1] == null) {
                    return i3;
                }
                i3++;
            }
            for (int i4 = a2 - 1; i4 >= 0 && this.f3047a[i4] == 0; i4--) {
                if (this.f3048b[i4 << 1] == null) {
                    return i4;
                }
            }
            return ~i3;
        } catch (ArrayIndexOutOfBoundsException unused) {
            throw new ConcurrentModificationException();
        }
    }

    public final int g(Object obj) {
        int i2 = this.f3049c * 2;
        Object[] objArr = this.f3048b;
        if (obj == null) {
            for (int i3 = 1; i3 < i2; i3 += 2) {
                if (objArr[i3] == null) {
                    return i3 >> 1;
                }
            }
            return -1;
        }
        for (int i4 = 1; i4 < i2; i4 += 2) {
            if (obj.equals(objArr[i4])) {
                return i4 >> 1;
            }
        }
        return -1;
    }

    public final Object get(Object obj) {
        return getOrDefault(obj, null);
    }

    public final Object getOrDefault(Object obj, Object obj2) {
        int e2 = e(obj);
        return e2 >= 0 ? this.f3048b[(e2 << 1) + 1] : obj2;
    }

    public final Object h(int i2) {
        return this.f3048b[i2 << 1];
    }

    public final int hashCode() {
        int[] iArr = this.f3047a;
        Object[] objArr = this.f3048b;
        int i2 = this.f3049c;
        int i3 = 1;
        int i4 = 0;
        int i5 = 0;
        while (i4 < i2) {
            Object obj = objArr[i3];
            i5 += (obj == null ? 0 : obj.hashCode()) ^ iArr[i4];
            i4++;
            i3 += 2;
        }
        return i5;
    }

    public final Object i(int i2) {
        Object[] objArr = this.f3048b;
        int i3 = i2 << 1;
        Object obj = objArr[i3 + 1];
        int i4 = this.f3049c;
        int i5 = 0;
        if (i4 <= 1) {
            c(this.f3047a, objArr, i4);
            this.f3047a = AbstractC0192d.f3019a;
            this.f3048b = AbstractC0192d.f3020b;
        } else {
            int i6 = i4 - 1;
            int[] iArr = this.f3047a;
            if (iArr.length <= 8 || i4 >= iArr.length / 3) {
                if (i2 < i6) {
                    int i7 = i2 + 1;
                    int i8 = i6 - i2;
                    System.arraycopy(iArr, i7, iArr, i2, i8);
                    Object[] objArr2 = this.f3048b;
                    System.arraycopy(objArr2, i7 << 1, objArr2, i3, i8 << 1);
                }
                Object[] objArr3 = this.f3048b;
                int i9 = i6 << 1;
                objArr3[i9] = null;
                objArr3[i9 + 1] = null;
            } else {
                a(i4 > 8 ? i4 + (i4 >> 1) : 8);
                if (i4 != this.f3049c) {
                    throw new ConcurrentModificationException();
                }
                if (i2 > 0) {
                    System.arraycopy(iArr, 0, this.f3047a, 0, i2);
                    System.arraycopy(objArr, 0, this.f3048b, 0, i3);
                }
                if (i2 < i6) {
                    int i10 = i2 + 1;
                    int i11 = i6 - i2;
                    System.arraycopy(iArr, i10, this.f3047a, i2, i11);
                    System.arraycopy(objArr, i10 << 1, this.f3048b, i3, i11 << 1);
                }
            }
            i5 = i6;
        }
        if (i4 != this.f3049c) {
            throw new ConcurrentModificationException();
        }
        this.f3049c = i5;
        return obj;
    }

    public final boolean isEmpty() {
        return this.f3049c <= 0;
    }

    public final Object j(int i2) {
        return this.f3048b[(i2 << 1) + 1];
    }

    public final Object put(Object obj, Object obj2) {
        int i2;
        int d2;
        int i3 = this.f3049c;
        if (obj == null) {
            d2 = f();
            i2 = 0;
        } else {
            int hashCode = obj.hashCode();
            i2 = hashCode;
            d2 = d(hashCode, obj);
        }
        if (d2 >= 0) {
            int i4 = (d2 << 1) + 1;
            Object[] objArr = this.f3048b;
            Object obj3 = objArr[i4];
            objArr[i4] = obj2;
            return obj3;
        }
        int i5 = ~d2;
        int[] iArr = this.f3047a;
        if (i3 >= iArr.length) {
            int i6 = 8;
            if (i3 >= 8) {
                i6 = (i3 >> 1) + i3;
            } else if (i3 < 4) {
                i6 = 4;
            }
            Object[] objArr2 = this.f3048b;
            a(i6);
            if (i3 != this.f3049c) {
                throw new ConcurrentModificationException();
            }
            int[] iArr2 = this.f3047a;
            if (iArr2.length > 0) {
                System.arraycopy(iArr, 0, iArr2, 0, iArr.length);
                System.arraycopy(objArr2, 0, this.f3048b, 0, objArr2.length);
            }
            c(iArr, objArr2, i3);
        }
        if (i5 < i3) {
            int[] iArr3 = this.f3047a;
            int i7 = i5 + 1;
            System.arraycopy(iArr3, i5, iArr3, i7, i3 - i5);
            Object[] objArr3 = this.f3048b;
            System.arraycopy(objArr3, i5 << 1, objArr3, i7 << 1, (this.f3049c - i5) << 1);
        }
        int i8 = this.f3049c;
        if (i3 == i8) {
            int[] iArr4 = this.f3047a;
            if (i5 < iArr4.length) {
                iArr4[i5] = i2;
                Object[] objArr4 = this.f3048b;
                int i9 = i5 << 1;
                objArr4[i9] = obj;
                objArr4[i9 + 1] = obj2;
                this.f3049c = i8 + 1;
                return null;
            }
        }
        throw new ConcurrentModificationException();
    }

    public final Object putIfAbsent(Object obj, Object obj2) {
        Object orDefault = getOrDefault(obj, null);
        return orDefault == null ? put(obj, obj2) : orDefault;
    }

    public final Object remove(Object obj) {
        int e2 = e(obj);
        if (e2 >= 0) {
            return i(e2);
        }
        return null;
    }

    public final Object replace(Object obj, Object obj2) {
        int e2 = e(obj);
        if (e2 < 0) {
            return null;
        }
        int i2 = (e2 << 1) + 1;
        Object[] objArr = this.f3048b;
        Object obj3 = objArr[i2];
        objArr[i2] = obj2;
        return obj3;
    }

    public final int size() {
        return this.f3049c;
    }

    public final String toString() {
        if (isEmpty()) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder(this.f3049c * 28);
        sb.append('{');
        for (int i2 = 0; i2 < this.f3049c; i2++) {
            if (i2 > 0) {
                sb.append(", ");
            }
            Object h2 = h(i2);
            if (h2 != this) {
                sb.append(h2);
            } else {
                sb.append("(this Map)");
            }
            sb.append('=');
            Object j2 = j(i2);
            if (j2 != this) {
                sb.append(j2);
            } else {
                sb.append("(this Map)");
            }
        }
        sb.append('}');
        return sb.toString();
    }

    public final boolean remove(Object obj, Object obj2) {
        int e2 = e(obj);
        if (e2 < 0) {
            return false;
        }
        Object j2 = j(e2);
        if (obj2 != j2 && (obj2 == null || !obj2.equals(j2))) {
            return false;
        }
        i(e2);
        return true;
    }

    public final boolean replace(Object obj, Object obj2, Object obj3) {
        int e2 = e(obj);
        if (e2 < 0) {
            return false;
        }
        Object j2 = j(e2);
        if (j2 != obj2 && (obj2 == null || !obj2.equals(j2))) {
            return false;
        }
        int i2 = (e2 << 1) + 1;
        Object[] objArr = this.f3048b;
        Object obj4 = objArr[i2];
        objArr[i2] = obj3;
        return true;
    }
}
