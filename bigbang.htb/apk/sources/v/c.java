package v;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import w.g;

/* loaded from: /home/sonpt/Hackdeboc/bigbang.htb/apk/classes.dex */
public abstract class c extends Binder implements IInterface {
    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this;
    }

    @Override // android.os.Binder
    public final boolean onTransact(int i2, Parcel parcel, Parcel parcel2, int i3) {
        InterfaceC0232b interfaceC0232b;
        if (i2 != 1) {
            if (i2 != 1598968902) {
                return super.onTransact(i2, parcel, parcel2, i3);
            }
            parcel2.writeString("androidx.core.app.unusedapprestrictions.IUnusedAppRestrictionsBackportService");
            return true;
        }
        parcel.enforceInterface("androidx.core.app.unusedapprestrictions.IUnusedAppRestrictionsBackportService");
        IBinder readStrongBinder = parcel.readStrongBinder();
        if (readStrongBinder == null) {
            interfaceC0232b = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("androidx.core.app.unusedapprestrictions.IUnusedAppRestrictionsBackportCallback");
            if (queryLocalInterface == null || !(queryLocalInterface instanceof InterfaceC0232b)) {
                C0231a c0231a = new C0231a();
                c0231a.f3730a = readStrongBinder;
                interfaceC0232b = c0231a;
            } else {
                interfaceC0232b = (InterfaceC0232b) queryLocalInterface;
            }
        }
        g gVar = (g) this;
        if (interfaceC0232b != null) {
            gVar.f3733a.a();
        }
        return true;
    }
}
