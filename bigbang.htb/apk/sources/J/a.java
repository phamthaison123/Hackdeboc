package J;

import android.database.ContentObserver;
import android.database.Cursor;
import android.net.Uri;
import android.os.Handler;
import androidx.emoji2.text.r;

/* loaded from: /home/sonpt/Hackdeboc/bigbang.htb/apk/classes.dex */
public final class a extends ContentObserver {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f162a = 0;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f163b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(b bVar) {
        super(new Handler());
        this.f163b = bVar;
    }

    @Override // android.database.ContentObserver
    public final boolean deliverSelfNotifications() {
        switch (this.f162a) {
            case 0:
                return true;
            default:
                return super.deliverSelfNotifications();
        }
    }

    @Override // android.database.ContentObserver
    public final void onChange(boolean z2) {
        Cursor cursor;
        switch (this.f162a) {
            case 0:
                b bVar = (b) this.f163b;
                if (bVar.f165b && (cursor = bVar.f166c) != null && !cursor.isClosed()) {
                    bVar.f164a = bVar.f166c.requery();
                    break;
                }
                break;
            default:
                super.onChange(z2);
                break;
        }
    }

    @Override // android.database.ContentObserver
    public final void onChange(boolean z2, Uri uri) {
        switch (this.f162a) {
            case 1:
                ((r) this.f163b).c();
                break;
            default:
                super.onChange(z2, uri);
                break;
        }
    }
}
