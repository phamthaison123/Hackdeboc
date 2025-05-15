package F;

import android.content.ClipData;
import android.net.Uri;
import android.os.Bundle;
import android.view.ContentInfo;
import java.util.Locale;

/* renamed from: F.f, reason: case insensitive filesystem */
/* loaded from: /home/sonpt/Hackdeboc/bigbang.htb/apk/classes.dex */
public final class C0005f implements InterfaceC0004e, InterfaceC0006g {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f87a = 1;

    /* renamed from: b, reason: collision with root package name */
    public final ClipData f88b;

    /* renamed from: c, reason: collision with root package name */
    public final int f89c;

    /* renamed from: d, reason: collision with root package name */
    public int f90d;

    /* renamed from: e, reason: collision with root package name */
    public Uri f91e;

    /* renamed from: f, reason: collision with root package name */
    public Bundle f92f;

    public C0005f(C0005f c0005f) {
        ClipData clipData = c0005f.f88b;
        clipData.getClass();
        this.f88b = clipData;
        int i2 = c0005f.f89c;
        if (i2 < 0) {
            Locale locale = Locale.US;
            throw new IllegalArgumentException("source is out of range of [0, 5] (too low)");
        }
        if (i2 > 5) {
            Locale locale2 = Locale.US;
            throw new IllegalArgumentException("source is out of range of [0, 5] (too high)");
        }
        this.f89c = i2;
        int i3 = c0005f.f90d;
        if ((i3 & 1) == i3) {
            this.f90d = i3;
            this.f91e = c0005f.f91e;
            this.f92f = c0005f.f92f;
        } else {
            throw new IllegalArgumentException("Requested flags 0x" + Integer.toHexString(i3) + ", but only 0x" + Integer.toHexString(1) + " are allowed");
        }
    }

    @Override // F.InterfaceC0004e
    public final void a(Bundle bundle) {
        this.f92f = bundle;
    }

    @Override // F.InterfaceC0004e
    public final void b(Uri uri) {
        this.f91e = uri;
    }

    @Override // F.InterfaceC0006g
    public final int c() {
        return this.f89c;
    }

    @Override // F.InterfaceC0004e
    public final C0007h d() {
        return new C0007h(new C0005f(this));
    }

    @Override // F.InterfaceC0004e
    public final void e(int i2) {
        this.f90d = i2;
    }

    @Override // F.InterfaceC0006g
    public final ClipData g() {
        return this.f88b;
    }

    @Override // F.InterfaceC0006g
    public final int l() {
        return this.f90d;
    }

    @Override // F.InterfaceC0006g
    public final ContentInfo p() {
        return null;
    }

    public final String toString() {
        String str;
        switch (this.f87a) {
            case 1:
                StringBuilder sb = new StringBuilder("ContentInfoCompat{clip=");
                sb.append(this.f88b.getDescription());
                sb.append(", source=");
                int i2 = this.f89c;
                sb.append(i2 != 0 ? i2 != 1 ? i2 != 2 ? i2 != 3 ? i2 != 4 ? i2 != 5 ? String.valueOf(i2) : "SOURCE_PROCESS_TEXT" : "SOURCE_AUTOFILL" : "SOURCE_DRAG_AND_DROP" : "SOURCE_INPUT_METHOD" : "SOURCE_CLIPBOARD" : "SOURCE_APP");
                sb.append(", flags=");
                int i3 = this.f90d;
                sb.append((i3 & 1) != 0 ? "FLAG_CONVERT_TO_PLAIN_TEXT" : String.valueOf(i3));
                if (this.f91e == null) {
                    str = "";
                } else {
                    str = ", hasLinkUri(" + this.f91e.toString().length() + ")";
                }
                sb.append(str);
                sb.append(this.f92f != null ? ", hasExtras" : "");
                sb.append("}");
                return sb.toString();
            default:
                return super.toString();
        }
    }

    public C0005f(ClipData clipData, int i2) {
        this.f88b = clipData;
        this.f89c = i2;
    }
}
