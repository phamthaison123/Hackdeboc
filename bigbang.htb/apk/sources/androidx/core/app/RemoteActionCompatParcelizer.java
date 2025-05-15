package androidx.core.app;

import W.a;
import W.b;
import W.c;
import android.app.PendingIntent;
import android.os.Parcel;
import android.text.TextUtils;
import androidx.core.graphics.drawable.IconCompat;

/* loaded from: /home/sonpt/Hackdeboc/bigbang.htb/apk/classes.dex */
public class RemoteActionCompatParcelizer {
    public static RemoteActionCompat read(a aVar) {
        RemoteActionCompat remoteActionCompat = new RemoteActionCompat();
        c cVar = remoteActionCompat.f1032a;
        if (aVar.e(1)) {
            cVar = aVar.g();
        }
        remoteActionCompat.f1032a = (IconCompat) cVar;
        CharSequence charSequence = remoteActionCompat.f1033b;
        if (aVar.e(2)) {
            charSequence = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(((b) aVar).f671e);
        }
        remoteActionCompat.f1033b = charSequence;
        CharSequence charSequence2 = remoteActionCompat.f1034c;
        if (aVar.e(3)) {
            charSequence2 = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(((b) aVar).f671e);
        }
        remoteActionCompat.f1034c = charSequence2;
        remoteActionCompat.f1035d = (PendingIntent) aVar.f(remoteActionCompat.f1035d, 4);
        boolean z2 = remoteActionCompat.f1036e;
        if (aVar.e(5)) {
            z2 = ((b) aVar).f671e.readInt() != 0;
        }
        remoteActionCompat.f1036e = z2;
        boolean z3 = remoteActionCompat.f1037f;
        if (aVar.e(6)) {
            z3 = ((b) aVar).f671e.readInt() != 0;
        }
        remoteActionCompat.f1037f = z3;
        return remoteActionCompat;
    }

    public static void write(RemoteActionCompat remoteActionCompat, a aVar) {
        aVar.getClass();
        IconCompat iconCompat = remoteActionCompat.f1032a;
        aVar.h(1);
        aVar.i(iconCompat);
        CharSequence charSequence = remoteActionCompat.f1033b;
        aVar.h(2);
        Parcel parcel = ((b) aVar).f671e;
        TextUtils.writeToParcel(charSequence, parcel, 0);
        CharSequence charSequence2 = remoteActionCompat.f1034c;
        aVar.h(3);
        TextUtils.writeToParcel(charSequence2, parcel, 0);
        PendingIntent pendingIntent = remoteActionCompat.f1035d;
        aVar.h(4);
        parcel.writeParcelable(pendingIntent, 0);
        boolean z2 = remoteActionCompat.f1036e;
        aVar.h(5);
        parcel.writeInt(z2 ? 1 : 0);
        boolean z3 = remoteActionCompat.f1037f;
        aVar.h(6);
        parcel.writeInt(z3 ? 1 : 0);
    }
}
