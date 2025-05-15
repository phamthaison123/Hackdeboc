package androidx.core.graphics.drawable;

import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.PorterDuff;
import android.graphics.drawable.Icon;
import android.os.Parcelable;
import androidx.versionedparcelable.CustomVersionedParcelable;

/* loaded from: /home/sonpt/Hackdeboc/bigbang.htb/apk/classes.dex */
public class IconCompat extends CustomVersionedParcelable {

    /* renamed from: k, reason: collision with root package name */
    public static final PorterDuff.Mode f1043k = PorterDuff.Mode.SRC_IN;

    /* renamed from: b, reason: collision with root package name */
    public Object f1045b;

    /* renamed from: j, reason: collision with root package name */
    public String f1053j;

    /* renamed from: a, reason: collision with root package name */
    public int f1044a = -1;

    /* renamed from: c, reason: collision with root package name */
    public byte[] f1046c = null;

    /* renamed from: d, reason: collision with root package name */
    public Parcelable f1047d = null;

    /* renamed from: e, reason: collision with root package name */
    public int f1048e = 0;

    /* renamed from: f, reason: collision with root package name */
    public int f1049f = 0;

    /* renamed from: g, reason: collision with root package name */
    public ColorStateList f1050g = null;

    /* renamed from: h, reason: collision with root package name */
    public PorterDuff.Mode f1051h = f1043k;

    /* renamed from: i, reason: collision with root package name */
    public String f1052i = null;

    public final String toString() {
        String str;
        int i2;
        if (this.f1044a == -1) {
            return String.valueOf(this.f1045b);
        }
        StringBuilder sb = new StringBuilder("Icon(typ=");
        switch (this.f1044a) {
            case 1:
                str = "BITMAP";
                break;
            case 2:
                str = "RESOURCE";
                break;
            case 3:
                str = "DATA";
                break;
            case 4:
                str = "URI";
                break;
            case 5:
                str = "BITMAP_MASKABLE";
                break;
            case 6:
                str = "URI_MASKABLE";
                break;
            default:
                str = "UNKNOWN";
                break;
        }
        sb.append(str);
        switch (this.f1044a) {
            case 1:
            case 5:
                sb.append(" size=");
                sb.append(((Bitmap) this.f1045b).getWidth());
                sb.append("x");
                sb.append(((Bitmap) this.f1045b).getHeight());
                break;
            case 2:
                sb.append(" pkg=");
                sb.append(this.f1053j);
                sb.append(" id=");
                Object[] objArr = new Object[1];
                int i3 = this.f1044a;
                if (i3 == -1) {
                    i2 = ((Icon) this.f1045b).getResId();
                } else {
                    if (i3 != 2) {
                        throw new IllegalStateException("called getResId() on " + this);
                    }
                    i2 = this.f1048e;
                }
                objArr[0] = Integer.valueOf(i2);
                sb.append(String.format("0x%08x", objArr));
                break;
            case 3:
                sb.append(" len=");
                sb.append(this.f1048e);
                if (this.f1049f != 0) {
                    sb.append(" off=");
                    sb.append(this.f1049f);
                    break;
                }
                break;
            case 4:
            case 6:
                sb.append(" uri=");
                sb.append(this.f1045b);
                break;
        }
        if (this.f1050g != null) {
            sb.append(" tint=");
            sb.append(this.f1050g);
        }
        if (this.f1051h != f1043k) {
            sb.append(" mode=");
            sb.append(this.f1051h);
        }
        sb.append(")");
        return sb.toString();
    }
}
