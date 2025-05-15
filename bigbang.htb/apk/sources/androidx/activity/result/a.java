package androidx.activity.result;

import S.C0048y;
import S.l0;
import S.m0;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.fragment.app.C0061b;
import androidx.fragment.app.E;
import androidx.fragment.app.I;
import androidx.fragment.app.L;
import androidx.versionedparcelable.ParcelImpl;
import com.google.android.material.datepicker.p;
import com.google.android.material.timepicker.g;
import i.Q;
import java.util.ArrayList;

/* loaded from: /home/sonpt/Hackdeboc/bigbang.htb/apk/classes.dex */
public final class a implements Parcelable.Creator {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f772a;

    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        switch (this.f772a) {
            case 0:
                return new b(parcel);
            case 1:
                Q q2 = new Q(parcel);
                q2.f2697a = parcel.readByte() != 0;
                return q2;
            case 2:
                I.f fVar = new I.f(parcel);
                fVar.f161a = parcel.readInt();
                return fVar;
            case 3:
                return new C0061b(parcel);
            case 4:
                E e2 = new E();
                e2.f1150a = parcel.readString();
                e2.f1151b = parcel.readInt();
                return e2;
            case 5:
                I i2 = new I();
                i2.f1200e = null;
                i2.f1201f = new ArrayList();
                i2.f1202g = new ArrayList();
                i2.f1196a = parcel.createTypedArrayList(L.CREATOR);
                i2.f1197b = parcel.createStringArrayList();
                i2.f1198c = (C0061b[]) parcel.createTypedArray(C0061b.CREATOR);
                i2.f1199d = parcel.readInt();
                i2.f1200e = parcel.readString();
                i2.f1201f = parcel.createStringArrayList();
                i2.f1202g = parcel.createTypedArrayList(Bundle.CREATOR);
                i2.f1203h = parcel.createTypedArrayList(E.CREATOR);
                return i2;
            case 6:
                return new L(parcel);
            case 7:
                C0048y c0048y = new C0048y();
                c0048y.f550a = parcel.readInt();
                c0048y.f551b = parcel.readInt();
                c0048y.f552c = parcel.readInt() == 1;
                return c0048y;
            case 8:
                l0 l0Var = new l0();
                l0Var.f436a = parcel.readInt();
                l0Var.f437b = parcel.readInt();
                l0Var.f439d = parcel.readInt() == 1;
                int readInt = parcel.readInt();
                if (readInt > 0) {
                    int[] iArr = new int[readInt];
                    l0Var.f438c = iArr;
                    parcel.readIntArray(iArr);
                }
                return l0Var;
            case 9:
                m0 m0Var = new m0();
                m0Var.f441a = parcel.readInt();
                m0Var.f442b = parcel.readInt();
                int readInt2 = parcel.readInt();
                m0Var.f443c = readInt2;
                if (readInt2 > 0) {
                    int[] iArr2 = new int[readInt2];
                    m0Var.f444d = iArr2;
                    parcel.readIntArray(iArr2);
                }
                int readInt3 = parcel.readInt();
                m0Var.f445e = readInt3;
                if (readInt3 > 0) {
                    int[] iArr3 = new int[readInt3];
                    m0Var.f446f = iArr3;
                    parcel.readIntArray(iArr3);
                }
                m0Var.f448h = parcel.readInt() == 1;
                m0Var.f449i = parcel.readInt() == 1;
                m0Var.f450j = parcel.readInt() == 1;
                m0Var.f447g = parcel.readArrayList(l0.class.getClassLoader());
                return m0Var;
            case 10:
                return new ParcelImpl(parcel);
            case 11:
                return new com.google.android.material.datepicker.c((p) parcel.readParcelable(p.class.getClassLoader()), (p) parcel.readParcelable(p.class.getClassLoader()), (com.google.android.material.datepicker.b) parcel.readParcelable(com.google.android.material.datepicker.b.class.getClassLoader()), (p) parcel.readParcelable(p.class.getClassLoader()));
            case 12:
                return new com.google.android.material.datepicker.e(parcel.readLong());
            case 13:
                return p.b(parcel.readInt(), parcel.readInt());
            default:
                return new g(parcel);
        }
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i2) {
        switch (this.f772a) {
            case 0:
                return new b[i2];
            case 1:
                return new Q[i2];
            case 2:
                return new I.f[i2];
            case 3:
                return new C0061b[i2];
            case 4:
                return new E[i2];
            case 5:
                return new I[i2];
            case 6:
                return new L[i2];
            case 7:
                return new C0048y[i2];
            case 8:
                return new l0[i2];
            case 9:
                return new m0[i2];
            case 10:
                return new ParcelImpl[i2];
            case 11:
                return new com.google.android.material.datepicker.c[i2];
            case 12:
                return new com.google.android.material.datepicker.e[i2];
            case 13:
                return new p[i2];
            default:
                return new g[i2];
        }
    }
}
