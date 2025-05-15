package F;

import android.view.View;

/* loaded from: /home/sonpt/Hackdeboc/bigbang.htb/apk/classes.dex */
public abstract class K {
    public static CharSequence a(View view) {
        return view.getStateDescription();
    }

    public static void b(View view, CharSequence charSequence) {
        view.setStateDescription(charSequence);
    }
}
