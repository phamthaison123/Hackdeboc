package q;

import android.content.Context;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.util.Xml;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import java.util.ArrayList;

/* loaded from: /home/sonpt/Hackdeboc/bigbang.htb/apk/classes.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    public final int f3569a;

    /* renamed from: b, reason: collision with root package name */
    public final int f3570b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f3571c = new ArrayList();

    /* renamed from: d, reason: collision with root package name */
    public final Object f3572d;

    public f(Context context, XmlResourceParser xmlResourceParser) {
        this.f3570b = -1;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(Xml.asAttributeSet(xmlResourceParser), q.f3681g);
        int indexCount = obtainStyledAttributes.getIndexCount();
        for (int i2 = 0; i2 < indexCount; i2++) {
            int index = obtainStyledAttributes.getIndex(i2);
            if (index == 0) {
                this.f3569a = obtainStyledAttributes.getResourceId(index, this.f3569a);
            } else if (index == 1) {
                this.f3570b = obtainStyledAttributes.getResourceId(index, this.f3570b);
                String resourceTypeName = context.getResources().getResourceTypeName(this.f3570b);
                context.getResources().getResourceName(this.f3570b);
                if ("layout".equals(resourceTypeName)) {
                    new n().b((ConstraintLayout) LayoutInflater.from(context).inflate(this.f3570b, (ViewGroup) null));
                }
            }
        }
        obtainStyledAttributes.recycle();
    }
}
