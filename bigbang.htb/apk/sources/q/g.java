package q;

import android.content.Context;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.util.Log;
import android.util.Xml;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;

/* loaded from: /home/sonpt/Hackdeboc/bigbang.htb/apk/classes.dex */
public final class g {

    /* renamed from: a, reason: collision with root package name */
    public final float f3573a;

    /* renamed from: b, reason: collision with root package name */
    public final float f3574b;

    /* renamed from: c, reason: collision with root package name */
    public final float f3575c;

    /* renamed from: d, reason: collision with root package name */
    public final float f3576d;

    /* renamed from: e, reason: collision with root package name */
    public final int f3577e;

    public g(Context context, XmlResourceParser xmlResourceParser) {
        this.f3573a = Float.NaN;
        this.f3574b = Float.NaN;
        this.f3575c = Float.NaN;
        this.f3576d = Float.NaN;
        this.f3577e = -1;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(Xml.asAttributeSet(xmlResourceParser), q.f3683i);
        int indexCount = obtainStyledAttributes.getIndexCount();
        for (int i2 = 0; i2 < indexCount; i2++) {
            int index = obtainStyledAttributes.getIndex(i2);
            if (index == 0) {
                int resourceId = obtainStyledAttributes.getResourceId(index, this.f3577e);
                this.f3577e = resourceId;
                String resourceTypeName = context.getResources().getResourceTypeName(resourceId);
                context.getResources().getResourceName(resourceId);
                if ("layout".equals(resourceTypeName)) {
                    new n().b((ConstraintLayout) LayoutInflater.from(context).inflate(resourceId, (ViewGroup) null));
                }
            } else if (index == 1) {
                this.f3576d = obtainStyledAttributes.getDimension(index, this.f3576d);
            } else if (index == 2) {
                this.f3574b = obtainStyledAttributes.getDimension(index, this.f3574b);
            } else if (index == 3) {
                this.f3575c = obtainStyledAttributes.getDimension(index, this.f3575c);
            } else if (index == 4) {
                this.f3573a = obtainStyledAttributes.getDimension(index, this.f3573a);
            } else {
                Log.v("ConstraintLayoutStates", "Unknown tag");
            }
        }
        obtainStyledAttributes.recycle();
    }
}
