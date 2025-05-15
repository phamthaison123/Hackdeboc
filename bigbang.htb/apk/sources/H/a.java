package H;

import F.C0003d;
import F.C0005f;
import F.InterfaceC0004e;
import F.O;
import android.content.ClipData;
import android.os.Build;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputConnectionWrapper;
import android.view.inputmethod.InputContentInfo;
import e.z;

/* loaded from: /home/sonpt/Hackdeboc/bigbang.htb/apk/classes.dex */
public final class a extends InputConnectionWrapper {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ z f133a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ a(InputConnection inputConnection, z zVar) {
        super(inputConnection, false);
        this.f133a = zVar;
    }

    @Override // android.view.inputmethod.InputConnectionWrapper, android.view.inputmethod.InputConnection
    public final boolean commitContent(InputContentInfo inputContentInfo, int i2, Bundle bundle) {
        Bundle bundle2;
        z zVar = inputContentInfo == null ? null : new z(17, new z(inputContentInfo));
        z zVar2 = this.f133a;
        zVar2.getClass();
        if ((i2 & 1) != 0) {
            try {
                zVar.f();
                InputContentInfo inputContentInfo2 = (InputContentInfo) ((b) zVar.f2221b).n();
                bundle2 = bundle == null ? new Bundle() : new Bundle(bundle);
                bundle2.putParcelable("androidx.core.view.extra.INPUT_CONTENT_INFO", inputContentInfo2);
            } catch (Exception e2) {
                Log.w("InputConnectionCompat", "Can't insert content from IME; requestPermission() failed", e2);
            }
        } else {
            bundle2 = bundle;
        }
        ClipData clipData = new ClipData(zVar.e(), new ClipData.Item(zVar.q()));
        InterfaceC0004e c0003d = Build.VERSION.SDK_INT >= 31 ? new C0003d(clipData, 2) : new C0005f(clipData, 2);
        c0003d.b(zVar.k());
        c0003d.a(bundle2);
        if (O.e((View) zVar2.f2221b, c0003d.d()) == null) {
            return true;
        }
        return super.commitContent(inputContentInfo, i2, bundle);
    }

    @Override // android.view.inputmethod.InputConnectionWrapper, android.view.inputmethod.InputConnection
    public final boolean performPrivateCommand(String str, Bundle bundle) {
        return super.performPrivateCommand(str, bundle);
    }
}
