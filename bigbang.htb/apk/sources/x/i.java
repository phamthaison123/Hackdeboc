package x;

import android.content.res.Resources;
import java.util.Objects;

/* loaded from: /home/sonpt/Hackdeboc/bigbang.htb/apk/classes.dex */
public final class i {

    /* renamed from: a, reason: collision with root package name */
    public final Resources f3757a;

    /* renamed from: b, reason: collision with root package name */
    public final Resources.Theme f3758b;

    public i(Resources resources, Resources.Theme theme) {
        this.f3757a = resources;
        this.f3758b = theme;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || i.class != obj.getClass()) {
            return false;
        }
        i iVar = (i) obj;
        return this.f3757a.equals(iVar.f3757a) && Objects.equals(this.f3758b, iVar.f3758b);
    }

    public final int hashCode() {
        return Objects.hash(this.f3757a, this.f3758b);
    }
}
