package androidx.activity.result;

import androidx.lifecycle.i;
import androidx.lifecycle.m;
import androidx.lifecycle.o;

/* loaded from: /home/sonpt/Hackdeboc/bigbang.htb/apk/classes.dex */
class ActivityResultRegistry$1 implements m {
    @Override // androidx.lifecycle.m
    public final void b(o oVar, i iVar) {
        if (i.ON_START.equals(iVar)) {
            throw null;
        }
        if (i.ON_STOP.equals(iVar)) {
            throw null;
        }
        if (i.ON_DESTROY.equals(iVar)) {
            throw null;
        }
    }
}
