package androidx.savedstate;

import android.annotation.SuppressLint;
import android.os.Bundle;
import androidx.lifecycle.B;
import androidx.lifecycle.i;
import androidx.lifecycle.m;
import androidx.lifecycle.o;
import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.Iterator;

@SuppressLint({"RestrictedApi"})
/* loaded from: /home/sonpt/Hackdeboc/bigbang.htb/apk/classes.dex */
final class Recreator implements m {

    /* renamed from: a, reason: collision with root package name */
    public final e f1612a;

    public Recreator(e eVar) {
        this.f1612a = eVar;
    }

    @Override // androidx.lifecycle.m
    public final void b(o oVar, i iVar) {
        if (iVar != i.ON_CREATE) {
            throw new AssertionError("Next event must be ON_CREATE");
        }
        oVar.d().d(this);
        e eVar = this.f1612a;
        Bundle a2 = eVar.a().a("androidx.savedstate.Restarter");
        if (a2 == null) {
            return;
        }
        ArrayList<String> stringArrayList = a2.getStringArrayList("classes_to_restore");
        if (stringArrayList == null) {
            throw new IllegalStateException("Bundle with restored state for the component \"androidx.savedstate.Restarter\" must contain list of strings by the key \"classes_to_restore\"");
        }
        Iterator<String> it = stringArrayList.iterator();
        while (it.hasNext()) {
            String next = it.next();
            try {
                Class<? extends U> asSubclass = Class.forName(next, false, Recreator.class.getClassLoader()).asSubclass(a.class);
                try {
                    Constructor declaredConstructor = asSubclass.getDeclaredConstructor(new Class[0]);
                    declaredConstructor.setAccessible(true);
                    try {
                        ((B) ((a) declaredConstructor.newInstance(new Object[0]))).a(eVar);
                    } catch (Exception e2) {
                        throw new RuntimeException("Failed to instantiate " + next, e2);
                    }
                } catch (NoSuchMethodException e3) {
                    throw new IllegalStateException("Class" + asSubclass.getSimpleName() + " must have default constructor in order to be automatically recreated", e3);
                }
            } catch (ClassNotFoundException e4) {
                throw new RuntimeException("Class " + next + " wasn't found", e4);
            }
        }
    }
}
