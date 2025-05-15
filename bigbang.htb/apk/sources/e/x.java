package e;

import android.content.Context;
import android.content.ContextWrapper;
import android.view.View;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* loaded from: /home/sonpt/Hackdeboc/bigbang.htb/apk/classes.dex */
public final class x implements View.OnClickListener {

    /* renamed from: a, reason: collision with root package name */
    public final View f2211a;

    /* renamed from: b, reason: collision with root package name */
    public final String f2212b;

    /* renamed from: c, reason: collision with root package name */
    public Method f2213c;

    /* renamed from: d, reason: collision with root package name */
    public Context f2214d;

    public x(View view, String str) {
        this.f2211a = view;
        this.f2212b = str;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        String str;
        Method method;
        if (this.f2213c == null) {
            View view2 = this.f2211a;
            Context context = view2.getContext();
            while (true) {
                String str2 = this.f2212b;
                if (context == null) {
                    int id = view2.getId();
                    if (id == -1) {
                        str = "";
                    } else {
                        str = " with id '" + view2.getContext().getResources().getResourceEntryName(id) + "'";
                    }
                    throw new IllegalStateException("Could not find method " + str2 + "(View) in a parent or ancestor Context for android:onClick attribute defined on view " + view2.getClass() + str);
                }
                try {
                    if (!context.isRestricted() && (method = context.getClass().getMethod(str2, View.class)) != null) {
                        this.f2213c = method;
                        this.f2214d = context;
                    }
                } catch (NoSuchMethodException unused) {
                }
                context = context instanceof ContextWrapper ? ((ContextWrapper) context).getBaseContext() : null;
            }
        }
        try {
            this.f2213c.invoke(this.f2214d, view);
        } catch (IllegalAccessException e2) {
            throw new IllegalStateException("Could not execute non-public method for android:onClick", e2);
        } catch (InvocationTargetException e3) {
            throw new IllegalStateException("Could not execute method for android:onClick", e3);
        }
    }
}
