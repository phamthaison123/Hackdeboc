package k;

import java.util.Iterator;
import java.util.Map;
import java.util.WeakHashMap;

/* loaded from: /home/sonpt/Hackdeboc/bigbang.htb/apk/classes.dex */
public class g implements Iterable {

    /* renamed from: a, reason: collision with root package name */
    public c f3002a;

    /* renamed from: b, reason: collision with root package name */
    public c f3003b;

    /* renamed from: c, reason: collision with root package name */
    public final WeakHashMap f3004c = new WeakHashMap();

    /* renamed from: d, reason: collision with root package name */
    public int f3005d = 0;

    public c a(Object obj) {
        c cVar = this.f3002a;
        while (cVar != null && !cVar.f2993a.equals(obj)) {
            cVar = cVar.f2995c;
        }
        return cVar;
    }

    public Object b(Object obj) {
        c a2 = a(obj);
        if (a2 == null) {
            return null;
        }
        this.f3005d--;
        WeakHashMap weakHashMap = this.f3004c;
        if (!weakHashMap.isEmpty()) {
            Iterator it = weakHashMap.keySet().iterator();
            while (it.hasNext()) {
                ((f) it.next()).a(a2);
            }
        }
        c cVar = a2.f2996d;
        if (cVar != null) {
            cVar.f2995c = a2.f2995c;
        } else {
            this.f3002a = a2.f2995c;
        }
        c cVar2 = a2.f2995c;
        if (cVar2 != null) {
            cVar2.f2996d = cVar;
        } else {
            this.f3003b = cVar;
        }
        a2.f2995c = null;
        a2.f2996d = null;
        return a2.f2994b;
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x0048, code lost:
    
        if (r1.hasNext() != false) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0050, code lost:
    
        if (((k.e) r6).hasNext() != false) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:?, code lost:
    
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0054, code lost:
    
        return false;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean equals(java.lang.Object r6) {
        /*
            r5 = this;
            r0 = 1
            if (r6 != r5) goto L4
            return r0
        L4:
            boolean r1 = r6 instanceof k.g
            r2 = 0
            if (r1 != 0) goto La
            return r2
        La:
            k.g r6 = (k.g) r6
            int r1 = r5.f3005d
            int r3 = r6.f3005d
            if (r1 == r3) goto L13
            return r2
        L13:
            java.util.Iterator r5 = r5.iterator()
            java.util.Iterator r6 = r6.iterator()
        L1b:
            r1 = r5
            k.e r1 = (k.e) r1
            boolean r3 = r1.hasNext()
            if (r3 == 0) goto L44
            r3 = r6
            k.e r3 = (k.e) r3
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto L44
            java.lang.Object r1 = r1.next()
            java.util.Map$Entry r1 = (java.util.Map.Entry) r1
            java.lang.Object r3 = r3.next()
            if (r1 != 0) goto L3b
            if (r3 != 0) goto L43
        L3b:
            if (r1 == 0) goto L1b
            boolean r1 = r1.equals(r3)
            if (r1 != 0) goto L1b
        L43:
            return r2
        L44:
            boolean r5 = r1.hasNext()
            if (r5 != 0) goto L53
            k.e r6 = (k.e) r6
            boolean r5 = r6.hasNext()
            if (r5 != 0) goto L53
            goto L54
        L53:
            r0 = r2
        L54:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: k.g.equals(java.lang.Object):boolean");
    }

    public final int hashCode() {
        Iterator it = iterator();
        int i2 = 0;
        while (true) {
            e eVar = (e) it;
            if (!eVar.hasNext()) {
                return i2;
            }
            i2 += ((Map.Entry) eVar.next()).hashCode();
        }
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        C0188b c0188b = new C0188b(this.f3002a, this.f3003b, 0);
        this.f3004c.put(c0188b, Boolean.FALSE);
        return c0188b;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("[");
        Iterator it = iterator();
        while (true) {
            e eVar = (e) it;
            if (!eVar.hasNext()) {
                sb.append("]");
                return sb.toString();
            }
            sb.append(((Map.Entry) eVar.next()).toString());
            if (eVar.hasNext()) {
                sb.append(", ");
            }
        }
    }
}
