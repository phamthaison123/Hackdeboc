package N;

import android.text.method.KeyListener;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.EditText;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/* loaded from: /home/sonpt/Hackdeboc/bigbang.htb/apk/classes.dex */
public final class a extends m0.e {

    /* renamed from: b, reason: collision with root package name */
    public final EditText f219b;

    /* renamed from: c, reason: collision with root package name */
    public final k f220c;

    public a(EditText editText) {
        this.f219b = editText;
        k kVar = new k(editText);
        this.f220c = kVar;
        editText.addTextChangedListener(kVar);
        if (c.f223b == null) {
            synchronized (c.f222a) {
                try {
                    if (c.f223b == null) {
                        c cVar = new c();
                        try {
                            c.f224c = Class.forName("android.text.DynamicLayout$ChangeWatcher", false, c.class.getClassLoader());
                        } catch (Throwable unused) {
                        }
                        c.f223b = cVar;
                    }
                } finally {
                }
            }
        }
        editText.setEditableFactory(c.f223b);
    }

    @Override // m0.e
    public final void f(boolean z2) {
        k kVar = this.f220c;
        if (kVar.f241d != z2) {
            if (kVar.f240c != null) {
                androidx.emoji2.text.i a2 = androidx.emoji2.text.i.a();
                j jVar = kVar.f240c;
                a2.getClass();
                B.a.o(jVar, "initCallback cannot be null");
                ReentrantReadWriteLock reentrantReadWriteLock = a2.f1093a;
                reentrantReadWriteLock.writeLock().lock();
                try {
                    a2.f1094b.remove(jVar);
                } finally {
                    reentrantReadWriteLock.writeLock().unlock();
                }
            }
            kVar.f241d = z2;
            if (z2) {
                k.a(kVar.f238a, androidx.emoji2.text.i.a().b());
            }
        }
    }

    public final KeyListener g(KeyListener keyListener) {
        if (keyListener instanceof g) {
            return keyListener;
        }
        if (keyListener == null) {
            return null;
        }
        return new g(keyListener);
    }

    public final InputConnection h(InputConnection inputConnection, EditorInfo editorInfo) {
        return inputConnection instanceof d ? inputConnection : new d(this.f219b, inputConnection, editorInfo);
    }
}
