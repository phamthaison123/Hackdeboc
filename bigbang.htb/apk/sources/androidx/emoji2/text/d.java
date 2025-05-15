package androidx.emoji2.text;

import android.os.Bundle;
import android.view.inputmethod.EditorInfo;
import e.z;
import g.C0107g;

/* loaded from: /home/sonpt/Hackdeboc/bigbang.htb/apk/classes.dex */
public final class d extends z {

    /* renamed from: c, reason: collision with root package name */
    public volatile p f1086c;

    /* renamed from: d, reason: collision with root package name */
    public volatile C0107g f1087d;

    public final void w() {
        try {
            ((i) this.f2221b).f1098f.a(new c(this));
        } catch (Throwable th) {
            ((i) this.f2221b).d(th);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:98:0x012a, code lost:
    
        return r11;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0049 A[Catch: all -> 0x002f, TryCatch #0 {all -> 0x002f, blocks: (B:101:0x0013, B:104:0x0018, B:106:0x001c, B:108:0x0029, B:9:0x003a, B:11:0x0042, B:13:0x0045, B:15:0x0049, B:17:0x0055, B:19:0x0058, B:23:0x0065, B:26:0x006d, B:31:0x008b, B:56:0x0099, B:60:0x00a5, B:61:0x00aa, B:43:0x00be, B:46:0x00c5, B:34:0x00ca, B:36:0x00d5, B:67:0x00dc, B:69:0x00e0, B:71:0x00e6, B:73:0x00ea, B:77:0x00f4, B:80:0x0100, B:81:0x0105, B:6:0x0034), top: B:100:0x0013 }] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00ca A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0091 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0100 A[Catch: all -> 0x002f, TryCatch #0 {all -> 0x002f, blocks: (B:101:0x0013, B:104:0x0018, B:106:0x001c, B:108:0x0029, B:9:0x003a, B:11:0x0042, B:13:0x0045, B:15:0x0049, B:17:0x0055, B:19:0x0058, B:23:0x0065, B:26:0x006d, B:31:0x008b, B:56:0x0099, B:60:0x00a5, B:61:0x00aa, B:43:0x00be, B:46:0x00c5, B:34:0x00ca, B:36:0x00d5, B:67:0x00dc, B:69:0x00e0, B:71:0x00e6, B:73:0x00ea, B:77:0x00f4, B:80:0x0100, B:81:0x0105, B:6:0x0034), top: B:100:0x0013 }] */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0118  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x011b  */
    /* JADX WARN: Type inference failed for: r3v10, types: [android.text.Spannable] */
    /* JADX WARN: Type inference failed for: r3v11, types: [android.text.SpannableString] */
    /* JADX WARN: Type inference failed for: r3v2 */
    /* JADX WARN: Type inference failed for: r3v3 */
    /* JADX WARN: Type inference failed for: r3v4 */
    /* JADX WARN: Type inference failed for: r3v5 */
    /* JADX WARN: Type inference failed for: r3v6 */
    /* JADX WARN: Type inference failed for: r3v7, types: [android.text.Spannable] */
    /* JADX WARN: Type inference failed for: r3v8, types: [android.text.SpannableString] */
    /* JADX WARN: Type inference failed for: r3v9 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.CharSequence x(java.lang.CharSequence r11, int r12, int r13, boolean r14) {
        /*
            Method dump skipped, instructions count: 307
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.emoji2.text.d.x(java.lang.CharSequence, int, int, boolean):java.lang.CharSequence");
    }

    public final void y(EditorInfo editorInfo) {
        Bundle bundle = editorInfo.extras;
        M.b bVar = (M.b) this.f1087d.f2292a;
        int a2 = bVar.a(4);
        bundle.putInt("android.support.text.emoji.emojiCompat_metadataVersion", a2 != 0 ? bVar.f216b.getInt(a2 + bVar.f215a) : 0);
        Bundle bundle2 = editorInfo.extras;
        ((i) this.f2221b).getClass();
        bundle2.putBoolean("android.support.text.emoji.emojiCompat_replaceAll", false);
    }
}
