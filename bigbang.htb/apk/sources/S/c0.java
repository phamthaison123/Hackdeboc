package S;

/* loaded from: /home/sonpt/Hackdeboc/bigbang.htb/apk/classes.dex */
public final class c0 {

    /* renamed from: a, reason: collision with root package name */
    public int f334a;

    /* renamed from: b, reason: collision with root package name */
    public int f335b;

    /* renamed from: c, reason: collision with root package name */
    public int f336c;

    /* renamed from: d, reason: collision with root package name */
    public int f337d;

    /* renamed from: e, reason: collision with root package name */
    public int f338e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f339f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f340g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f341h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f342i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f343j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f344k;

    /* renamed from: l, reason: collision with root package name */
    public int f345l;

    /* renamed from: m, reason: collision with root package name */
    public long f346m;

    /* renamed from: n, reason: collision with root package name */
    public int f347n;

    public final void a(int i2) {
        if ((this.f337d & i2) != 0) {
            return;
        }
        throw new IllegalStateException("Layout state should be one of " + Integer.toBinaryString(i2) + " but it is " + Integer.toBinaryString(this.f337d));
    }

    public final int b() {
        return this.f340g ? this.f335b - this.f336c : this.f338e;
    }

    public final String toString() {
        return "State{mTargetPosition=" + this.f334a + ", mData=null, mItemCount=" + this.f338e + ", mIsMeasuring=" + this.f342i + ", mPreviousLayoutItemCount=" + this.f335b + ", mDeletedInvisibleItemCountSincePreviousLayout=" + this.f336c + ", mStructureChanged=" + this.f339f + ", mInPreLayout=" + this.f340g + ", mRunSimpleAnimations=" + this.f343j + ", mRunPredictiveAnimations=" + this.f344k + '}';
    }
}
