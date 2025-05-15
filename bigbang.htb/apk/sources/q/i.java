package q;

import android.view.ViewGroup;
import java.util.Arrays;
import java.util.HashMap;

/* loaded from: /home/sonpt/Hackdeboc/bigbang.htb/apk/classes.dex */
public final class i {

    /* renamed from: a, reason: collision with root package name */
    public int f3580a;

    /* renamed from: b, reason: collision with root package name */
    public final l f3581b;

    /* renamed from: c, reason: collision with root package name */
    public final k f3582c;

    /* renamed from: d, reason: collision with root package name */
    public final j f3583d;

    /* renamed from: e, reason: collision with root package name */
    public final m f3584e;

    /* renamed from: f, reason: collision with root package name */
    public HashMap f3585f;

    public i() {
        l lVar = new l();
        lVar.f3653a = 0;
        lVar.f3654b = 0;
        lVar.f3655c = 1.0f;
        lVar.f3656d = Float.NaN;
        this.f3581b = lVar;
        k kVar = new k();
        kVar.f3649a = -1;
        kVar.f3650b = -1;
        kVar.f3651c = Float.NaN;
        kVar.f3652d = Float.NaN;
        this.f3582c = kVar;
        j jVar = new j();
        jVar.f3613a = false;
        jVar.f3619d = -1;
        jVar.f3621e = -1;
        jVar.f3623f = -1.0f;
        jVar.f3625g = -1;
        jVar.f3627h = -1;
        jVar.f3629i = -1;
        jVar.f3631j = -1;
        jVar.f3632k = -1;
        jVar.f3633l = -1;
        jVar.f3634m = -1;
        jVar.f3635n = -1;
        jVar.f3636o = -1;
        jVar.f3637p = -1;
        jVar.f3638q = -1;
        jVar.f3639r = -1;
        jVar.f3640s = -1;
        jVar.f3641t = 0.5f;
        jVar.f3642u = 0.5f;
        jVar.f3643v = null;
        jVar.f3644w = -1;
        jVar.f3645x = 0;
        jVar.f3646y = 0.0f;
        jVar.f3647z = -1;
        jVar.f3587A = -1;
        jVar.f3588B = -1;
        jVar.f3589C = -1;
        jVar.f3590D = -1;
        jVar.f3591E = -1;
        jVar.f3592F = -1;
        jVar.f3593G = -1;
        jVar.f3594H = -1;
        jVar.f3595I = -1;
        jVar.f3596J = -1;
        jVar.f3597K = -1;
        jVar.f3598L = -1;
        jVar.f3599M = -1;
        jVar.f3600N = -1;
        jVar.f3601O = -1.0f;
        jVar.f3602P = -1.0f;
        jVar.f3603Q = 0;
        jVar.f3604R = 0;
        jVar.f3605S = 0;
        jVar.f3606T = 0;
        jVar.f3607U = -1;
        jVar.f3608V = -1;
        jVar.f3609W = -1;
        jVar.f3610X = -1;
        jVar.f3611Y = 1.0f;
        jVar.f3612Z = 1.0f;
        jVar.f3614a0 = -1;
        jVar.f3616b0 = 0;
        jVar.f3618c0 = -1;
        jVar.f3626g0 = false;
        jVar.f3628h0 = false;
        jVar.f3630i0 = true;
        this.f3583d = jVar;
        m mVar = new m();
        mVar.f3658a = 0.0f;
        mVar.f3659b = 0.0f;
        mVar.f3660c = 0.0f;
        mVar.f3661d = 1.0f;
        mVar.f3662e = 1.0f;
        mVar.f3663f = Float.NaN;
        mVar.f3664g = Float.NaN;
        mVar.f3665h = 0.0f;
        mVar.f3666i = 0.0f;
        mVar.f3667j = 0.0f;
        mVar.f3668k = false;
        mVar.f3669l = 0.0f;
        this.f3584e = mVar;
        this.f3585f = new HashMap();
    }

    public final void a(d dVar) {
        j jVar = this.f3583d;
        dVar.f3532d = jVar.f3625g;
        dVar.f3534e = jVar.f3627h;
        dVar.f3536f = jVar.f3629i;
        dVar.f3538g = jVar.f3631j;
        dVar.f3540h = jVar.f3632k;
        dVar.f3542i = jVar.f3633l;
        dVar.f3544j = jVar.f3634m;
        dVar.f3546k = jVar.f3635n;
        dVar.f3547l = jVar.f3636o;
        dVar.f3551p = jVar.f3637p;
        dVar.f3552q = jVar.f3638q;
        dVar.f3553r = jVar.f3639r;
        dVar.f3554s = jVar.f3640s;
        ((ViewGroup.MarginLayoutParams) dVar).leftMargin = jVar.f3589C;
        ((ViewGroup.MarginLayoutParams) dVar).rightMargin = jVar.f3590D;
        ((ViewGroup.MarginLayoutParams) dVar).topMargin = jVar.f3591E;
        ((ViewGroup.MarginLayoutParams) dVar).bottomMargin = jVar.f3592F;
        dVar.f3559x = jVar.f3600N;
        dVar.f3560y = jVar.f3599M;
        dVar.f3556u = jVar.f3596J;
        dVar.f3558w = jVar.f3598L;
        dVar.f3561z = jVar.f3641t;
        dVar.f3500A = jVar.f3642u;
        dVar.f3548m = jVar.f3644w;
        dVar.f3549n = jVar.f3645x;
        dVar.f3550o = jVar.f3646y;
        dVar.f3501B = jVar.f3643v;
        dVar.f3515P = jVar.f3647z;
        dVar.f3516Q = jVar.f3587A;
        dVar.f3504E = jVar.f3601O;
        dVar.f3503D = jVar.f3602P;
        dVar.f3506G = jVar.f3604R;
        dVar.f3505F = jVar.f3603Q;
        dVar.f3518S = jVar.f3626g0;
        dVar.f3519T = jVar.f3628h0;
        dVar.f3507H = jVar.f3605S;
        dVar.f3508I = jVar.f3606T;
        dVar.f3511L = jVar.f3607U;
        dVar.f3512M = jVar.f3608V;
        dVar.f3509J = jVar.f3609W;
        dVar.f3510K = jVar.f3610X;
        dVar.f3513N = jVar.f3611Y;
        dVar.f3514O = jVar.f3612Z;
        dVar.f3517R = jVar.f3588B;
        dVar.f3530c = jVar.f3623f;
        dVar.f3526a = jVar.f3619d;
        dVar.f3528b = jVar.f3621e;
        ((ViewGroup.MarginLayoutParams) dVar).width = jVar.f3615b;
        ((ViewGroup.MarginLayoutParams) dVar).height = jVar.f3617c;
        String str = jVar.f3624f0;
        if (str != null) {
            dVar.f3520U = str;
        }
        dVar.setMarginStart(jVar.f3594H);
        dVar.setMarginEnd(jVar.f3593G);
        dVar.a();
    }

    public final Object clone() {
        i iVar = new i();
        j jVar = iVar.f3583d;
        jVar.getClass();
        j jVar2 = this.f3583d;
        jVar.f3613a = jVar2.f3613a;
        jVar.f3615b = jVar2.f3615b;
        jVar.f3617c = jVar2.f3617c;
        jVar.f3619d = jVar2.f3619d;
        jVar.f3621e = jVar2.f3621e;
        jVar.f3623f = jVar2.f3623f;
        jVar.f3625g = jVar2.f3625g;
        jVar.f3627h = jVar2.f3627h;
        jVar.f3629i = jVar2.f3629i;
        jVar.f3631j = jVar2.f3631j;
        jVar.f3632k = jVar2.f3632k;
        jVar.f3633l = jVar2.f3633l;
        jVar.f3634m = jVar2.f3634m;
        jVar.f3635n = jVar2.f3635n;
        jVar.f3636o = jVar2.f3636o;
        jVar.f3637p = jVar2.f3637p;
        jVar.f3638q = jVar2.f3638q;
        jVar.f3639r = jVar2.f3639r;
        jVar.f3640s = jVar2.f3640s;
        jVar.f3641t = jVar2.f3641t;
        jVar.f3642u = jVar2.f3642u;
        jVar.f3643v = jVar2.f3643v;
        jVar.f3644w = jVar2.f3644w;
        jVar.f3645x = jVar2.f3645x;
        jVar.f3646y = jVar2.f3646y;
        jVar.f3647z = jVar2.f3647z;
        jVar.f3587A = jVar2.f3587A;
        jVar.f3588B = jVar2.f3588B;
        jVar.f3589C = jVar2.f3589C;
        jVar.f3590D = jVar2.f3590D;
        jVar.f3591E = jVar2.f3591E;
        jVar.f3592F = jVar2.f3592F;
        jVar.f3593G = jVar2.f3593G;
        jVar.f3594H = jVar2.f3594H;
        jVar.f3595I = jVar2.f3595I;
        jVar.f3596J = jVar2.f3596J;
        jVar.f3597K = jVar2.f3597K;
        jVar.f3598L = jVar2.f3598L;
        jVar.f3599M = jVar2.f3599M;
        jVar.f3600N = jVar2.f3600N;
        jVar.f3601O = jVar2.f3601O;
        jVar.f3602P = jVar2.f3602P;
        jVar.f3603Q = jVar2.f3603Q;
        jVar.f3604R = jVar2.f3604R;
        jVar.f3605S = jVar2.f3605S;
        jVar.f3606T = jVar2.f3606T;
        jVar.f3607U = jVar2.f3607U;
        jVar.f3608V = jVar2.f3608V;
        jVar.f3609W = jVar2.f3609W;
        jVar.f3610X = jVar2.f3610X;
        jVar.f3611Y = jVar2.f3611Y;
        jVar.f3612Z = jVar2.f3612Z;
        jVar.f3614a0 = jVar2.f3614a0;
        jVar.f3616b0 = jVar2.f3616b0;
        jVar.f3618c0 = jVar2.f3618c0;
        jVar.f3624f0 = jVar2.f3624f0;
        int[] iArr = jVar2.f3620d0;
        if (iArr != null) {
            jVar.f3620d0 = Arrays.copyOf(iArr, iArr.length);
        } else {
            jVar.f3620d0 = null;
        }
        jVar.f3622e0 = jVar2.f3622e0;
        jVar.f3626g0 = jVar2.f3626g0;
        jVar.f3628h0 = jVar2.f3628h0;
        jVar.f3630i0 = jVar2.f3630i0;
        k kVar = iVar.f3582c;
        kVar.getClass();
        k kVar2 = this.f3582c;
        kVar2.getClass();
        kVar.f3649a = kVar2.f3649a;
        kVar.f3650b = kVar2.f3650b;
        kVar.f3652d = kVar2.f3652d;
        kVar.f3651c = kVar2.f3651c;
        l lVar = iVar.f3581b;
        lVar.getClass();
        l lVar2 = this.f3581b;
        lVar2.getClass();
        lVar.f3653a = lVar2.f3653a;
        lVar.f3655c = lVar2.f3655c;
        lVar.f3656d = lVar2.f3656d;
        lVar.f3654b = lVar2.f3654b;
        m mVar = iVar.f3584e;
        mVar.getClass();
        m mVar2 = this.f3584e;
        mVar2.getClass();
        mVar.f3658a = mVar2.f3658a;
        mVar.f3659b = mVar2.f3659b;
        mVar.f3660c = mVar2.f3660c;
        mVar.f3661d = mVar2.f3661d;
        mVar.f3662e = mVar2.f3662e;
        mVar.f3663f = mVar2.f3663f;
        mVar.f3664g = mVar2.f3664g;
        mVar.f3665h = mVar2.f3665h;
        mVar.f3666i = mVar2.f3666i;
        mVar.f3667j = mVar2.f3667j;
        mVar.f3668k = mVar2.f3668k;
        mVar.f3669l = mVar2.f3669l;
        iVar.f3580a = this.f3580a;
        return iVar;
    }
}
