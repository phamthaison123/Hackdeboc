package androidx.core.graphics.drawable;

import W.a;
import W.b;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.os.Parcel;
import android.os.Parcelable;
import java.nio.charset.Charset;

/* loaded from: /home/sonpt/Hackdeboc/bigbang.htb/apk/classes.dex */
public class IconCompatParcelizer {
    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static IconCompat read(a aVar) {
        IconCompat iconCompat = new IconCompat();
        int i2 = iconCompat.f1044a;
        if (aVar.e(1)) {
            i2 = ((b) aVar).f671e.readInt();
        }
        iconCompat.f1044a = i2;
        byte[] bArr = iconCompat.f1046c;
        if (aVar.e(2)) {
            Parcel parcel = ((b) aVar).f671e;
            int readInt = parcel.readInt();
            if (readInt < 0) {
                bArr = null;
            } else {
                byte[] bArr2 = new byte[readInt];
                parcel.readByteArray(bArr2);
                bArr = bArr2;
            }
        }
        iconCompat.f1046c = bArr;
        iconCompat.f1047d = aVar.f(iconCompat.f1047d, 3);
        int i3 = iconCompat.f1048e;
        if (aVar.e(4)) {
            i3 = ((b) aVar).f671e.readInt();
        }
        iconCompat.f1048e = i3;
        int i4 = iconCompat.f1049f;
        if (aVar.e(5)) {
            i4 = ((b) aVar).f671e.readInt();
        }
        iconCompat.f1049f = i4;
        iconCompat.f1050g = (ColorStateList) aVar.f(iconCompat.f1050g, 6);
        String str = iconCompat.f1052i;
        if (aVar.e(7)) {
            str = ((b) aVar).f671e.readString();
        }
        iconCompat.f1052i = str;
        String str2 = iconCompat.f1053j;
        if (aVar.e(8)) {
            str2 = ((b) aVar).f671e.readString();
        }
        iconCompat.f1053j = str2;
        iconCompat.f1051h = PorterDuff.Mode.valueOf(iconCompat.f1052i);
        switch (iconCompat.f1044a) {
            case -1:
                Parcelable parcelable = iconCompat.f1047d;
                if (parcelable == null) {
                    throw new IllegalArgumentException("Invalid icon");
                }
                iconCompat.f1045b = parcelable;
                return iconCompat;
            case 0:
            default:
                return iconCompat;
            case 1:
            case 5:
                Parcelable parcelable2 = iconCompat.f1047d;
                if (parcelable2 != null) {
                    iconCompat.f1045b = parcelable2;
                } else {
                    byte[] bArr3 = iconCompat.f1046c;
                    iconCompat.f1045b = bArr3;
                    iconCompat.f1044a = 3;
                    iconCompat.f1048e = 0;
                    iconCompat.f1049f = bArr3.length;
                }
                return iconCompat;
            case 2:
            case 4:
            case 6:
                String str3 = new String(iconCompat.f1046c, Charset.forName("UTF-16"));
                iconCompat.f1045b = str3;
                if (iconCompat.f1044a == 2 && iconCompat.f1053j == null) {
                    iconCompat.f1053j = str3.split(":", -1)[0];
                }
                return iconCompat;
            case 3:
                iconCompat.f1045b = iconCompat.f1046c;
                return iconCompat;
        }
    }

    public static void write(IconCompat iconCompat, a aVar) {
        aVar.getClass();
        iconCompat.f1052i = iconCompat.f1051h.name();
        switch (iconCompat.f1044a) {
            case -1:
                iconCompat.f1047d = (Parcelable) iconCompat.f1045b;
                break;
            case 1:
            case 5:
                iconCompat.f1047d = (Parcelable) iconCompat.f1045b;
                break;
            case 2:
                iconCompat.f1046c = ((String) iconCompat.f1045b).getBytes(Charset.forName("UTF-16"));
                break;
            case 3:
                iconCompat.f1046c = (byte[]) iconCompat.f1045b;
                break;
            case 4:
            case 6:
                iconCompat.f1046c = iconCompat.f1045b.toString().getBytes(Charset.forName("UTF-16"));
                break;
        }
        int i2 = iconCompat.f1044a;
        if (-1 != i2) {
            aVar.h(1);
            ((b) aVar).f671e.writeInt(i2);
        }
        byte[] bArr = iconCompat.f1046c;
        if (bArr != null) {
            aVar.h(2);
            int length = bArr.length;
            Parcel parcel = ((b) aVar).f671e;
            parcel.writeInt(length);
            parcel.writeByteArray(bArr);
        }
        Parcelable parcelable = iconCompat.f1047d;
        if (parcelable != null) {
            aVar.h(3);
            ((b) aVar).f671e.writeParcelable(parcelable, 0);
        }
        int i3 = iconCompat.f1048e;
        if (i3 != 0) {
            aVar.h(4);
            ((b) aVar).f671e.writeInt(i3);
        }
        int i4 = iconCompat.f1049f;
        if (i4 != 0) {
            aVar.h(5);
            ((b) aVar).f671e.writeInt(i4);
        }
        ColorStateList colorStateList = iconCompat.f1050g;
        if (colorStateList != null) {
            aVar.h(6);
            ((b) aVar).f671e.writeParcelable(colorStateList, 0);
        }
        String str = iconCompat.f1052i;
        if (str != null) {
            aVar.h(7);
            ((b) aVar).f671e.writeString(str);
        }
        String str2 = iconCompat.f1053j;
        if (str2 != null) {
            aVar.h(8);
            ((b) aVar).f671e.writeString(str2);
        }
    }
}
