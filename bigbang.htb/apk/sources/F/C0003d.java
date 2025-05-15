package F;

import android.content.ClipData;
import android.net.Uri;
import android.os.Bundle;
import android.view.ContentInfo;

/* renamed from: F.d, reason: case insensitive filesystem */
/* loaded from: /home/sonpt/Hackdeboc/bigbang.htb/apk/classes.dex */
public final class C0003d implements InterfaceC0004e {

    /* renamed from: a, reason: collision with root package name */
    public final ContentInfo.Builder f83a;

    public C0003d(ClipData clipData, int i2) {
        this.f83a = AbstractC0002c.c(clipData, i2);
    }

    @Override // F.InterfaceC0004e
    public final void a(Bundle bundle) {
        this.f83a.setExtras(bundle);
    }

    @Override // F.InterfaceC0004e
    public final void b(Uri uri) {
        this.f83a.setLinkUri(uri);
    }

    @Override // F.InterfaceC0004e
    public final C0007h d() {
        ContentInfo build;
        build = this.f83a.build();
        return new C0007h(new e.z(build));
    }

    @Override // F.InterfaceC0004e
    public final void e(int i2) {
        this.f83a.setFlags(i2);
    }
}
