package e0;

import android.graphics.Typeface;
import com.google.android.material.chip.Chip;

/* loaded from: /home/sonpt/Hackdeboc/bigbang.htb/apk/classes.dex */
public final class a extends B.a {

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f2222c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f2223d;

    public /* synthetic */ a(int i2, Object obj) {
        this.f2222c = i2;
        this.f2223d = obj;
    }

    @Override // B.a
    public final void S(int i2) {
        switch (this.f2222c) {
            case 0:
                break;
            default:
                h0.i iVar = (h0.i) this.f2223d;
                iVar.f2600d = true;
                h0.h hVar = (h0.h) iVar.f2601e.get();
                if (hVar != null) {
                    e eVar = (e) hVar;
                    eVar.v();
                    eVar.invalidateSelf();
                    break;
                }
                break;
        }
    }

    @Override // B.a
    public final void U(Typeface typeface, boolean z2) {
        int i2 = this.f2222c;
        Object obj = this.f2223d;
        switch (i2) {
            case 0:
                Chip chip = (Chip) obj;
                e eVar = chip.f1758e;
                chip.setText(eVar.D0 ? eVar.f2230E : chip.getText());
                chip.requestLayout();
                chip.invalidate();
                break;
            default:
                if (!z2) {
                    h0.i iVar = (h0.i) obj;
                    iVar.f2600d = true;
                    h0.h hVar = (h0.h) iVar.f2601e.get();
                    if (hVar != null) {
                        e eVar2 = (e) hVar;
                        eVar2.v();
                        eVar2.invalidateSelf();
                        break;
                    }
                }
                break;
        }
    }
}
