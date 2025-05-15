package androidx.fragment.app;

import android.transition.Transition;
import java.util.ArrayList;

/* loaded from: /home/sonpt/Hackdeboc/bigbang.htb/apk/classes.dex */
public final class U implements Transition.TransitionListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Object f1249a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ArrayList f1250b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f1251c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ArrayList f1252d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f1253e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ ArrayList f1254f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ W f1255g;

    public U(W w2, Object obj, ArrayList arrayList, Object obj2, ArrayList arrayList2, Object obj3, ArrayList arrayList3) {
        this.f1255g = w2;
        this.f1249a = obj;
        this.f1250b = arrayList;
        this.f1251c = obj2;
        this.f1252d = arrayList2;
        this.f1253e = obj3;
        this.f1254f = arrayList3;
    }

    @Override // android.transition.Transition.TransitionListener
    public final void onTransitionCancel(Transition transition) {
    }

    @Override // android.transition.Transition.TransitionListener
    public final void onTransitionEnd(Transition transition) {
        transition.removeListener(this);
    }

    @Override // android.transition.Transition.TransitionListener
    public final void onTransitionPause(Transition transition) {
    }

    @Override // android.transition.Transition.TransitionListener
    public final void onTransitionResume(Transition transition) {
    }

    @Override // android.transition.Transition.TransitionListener
    public final void onTransitionStart(Transition transition) {
        W w2 = this.f1255g;
        Object obj = this.f1249a;
        if (obj != null) {
            w2.v(obj, this.f1250b, null);
        }
        Object obj2 = this.f1251c;
        if (obj2 != null) {
            w2.v(obj2, this.f1252d, null);
        }
        Object obj3 = this.f1253e;
        if (obj3 != null) {
            w2.v(obj3, this.f1254f, null);
        }
    }
}
