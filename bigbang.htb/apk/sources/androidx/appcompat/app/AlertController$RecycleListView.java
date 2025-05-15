package androidx.appcompat.app;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.widget.ListView;
import d.AbstractC0092a;

/* loaded from: /home/sonpt/Hackdeboc/bigbang.htb/apk/classes.dex */
public class AlertController$RecycleListView extends ListView {

    /* renamed from: a, reason: collision with root package name */
    public final int f779a;

    /* renamed from: b, reason: collision with root package name */
    public final int f780b;

    public AlertController$RecycleListView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC0092a.f2025t);
        this.f780b = obtainStyledAttributes.getDimensionPixelOffset(0, -1);
        this.f779a = obtainStyledAttributes.getDimensionPixelOffset(1, -1);
    }
}
