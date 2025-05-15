package S;

import android.database.Observable;

/* loaded from: /home/sonpt/Hackdeboc/bigbang.htb/apk/classes.dex */
public final class H extends Observable {
    public final boolean a() {
        return !((Observable) this).mObservers.isEmpty();
    }
}
