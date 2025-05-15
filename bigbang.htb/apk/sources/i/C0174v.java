package i;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.widget.CheckedTextView;
import android.widget.CompoundButton;
import android.widget.TextView;

/* renamed from: i.v, reason: case insensitive filesystem */
/* loaded from: /home/sonpt/Hackdeboc/bigbang.htb/apk/classes.dex */
public final class C0174v {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2927a;

    /* renamed from: b, reason: collision with root package name */
    public ColorStateList f2928b = null;

    /* renamed from: c, reason: collision with root package name */
    public PorterDuff.Mode f2929c = null;

    /* renamed from: d, reason: collision with root package name */
    public boolean f2930d = false;

    /* renamed from: e, reason: collision with root package name */
    public boolean f2931e = false;

    /* renamed from: f, reason: collision with root package name */
    public boolean f2932f;

    /* renamed from: g, reason: collision with root package name */
    public final TextView f2933g;

    public /* synthetic */ C0174v(TextView textView, int i2) {
        this.f2927a = i2;
        this.f2933g = textView;
    }

    public final void a() {
        TextView textView = this.f2933g;
        Drawable buttonDrawable = ((CompoundButton) textView).getButtonDrawable();
        if (buttonDrawable != null) {
            if (this.f2930d || this.f2931e) {
                Drawable mutate = buttonDrawable.mutate();
                if (this.f2930d) {
                    mutate.setTintList(this.f2928b);
                }
                if (this.f2931e) {
                    mutate.setTintMode(this.f2929c);
                }
                if (mutate.isStateful()) {
                    mutate.setState(((CompoundButton) textView).getDrawableState());
                }
                ((CompoundButton) textView).setButtonDrawable(mutate);
            }
        }
    }

    public final void b() {
        TextView textView = this.f2933g;
        Drawable checkMarkDrawable = ((CheckedTextView) textView).getCheckMarkDrawable();
        if (checkMarkDrawable != null) {
            if (this.f2930d || this.f2931e) {
                Drawable mutate = checkMarkDrawable.mutate();
                if (this.f2930d) {
                    mutate.setTintList(this.f2928b);
                }
                if (this.f2931e) {
                    mutate.setTintMode(this.f2929c);
                }
                if (mutate.isStateful()) {
                    mutate.setState(((CheckedTextView) textView).getDrawableState());
                }
                ((CheckedTextView) textView).setCheckMarkDrawable(mutate);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0074 A[Catch: all -> 0x004f, TryCatch #3 {all -> 0x004f, blocks: (B:5:0x0031, B:7:0x0037, B:10:0x003d, B:11:0x006e, B:13:0x0074, B:14:0x007e, B:16:0x0084, B:23:0x0051, B:25:0x0057, B:27:0x005d), top: B:4:0x0031 }] */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0084 A[Catch: all -> 0x004f, TRY_LEAVE, TryCatch #3 {all -> 0x004f, blocks: (B:5:0x0031, B:7:0x0037, B:10:0x003d, B:11:0x006e, B:13:0x0074, B:14:0x007e, B:16:0x0084, B:23:0x0051, B:25:0x0057, B:27:0x005d), top: B:4:0x0031 }] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00fb A[Catch: all -> 0x00d6, TryCatch #1 {all -> 0x00d6, blocks: (B:33:0x00b8, B:35:0x00be, B:38:0x00c4, B:39:0x00f5, B:41:0x00fb, B:42:0x0105, B:44:0x010b, B:50:0x00d8, B:52:0x00de, B:54:0x00e4), top: B:32:0x00b8 }] */
    /* JADX WARN: Removed duplicated region for block: B:44:0x010b A[Catch: all -> 0x00d6, TRY_LEAVE, TryCatch #1 {all -> 0x00d6, blocks: (B:33:0x00b8, B:35:0x00be, B:38:0x00c4, B:39:0x00f5, B:41:0x00fb, B:42:0x0105, B:44:0x010b, B:50:0x00d8, B:52:0x00de, B:54:0x00e4), top: B:32:0x00b8 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void c(android.util.AttributeSet r16, int r17) {
        /*
            Method dump skipped, instructions count: 294
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: i.C0174v.c(android.util.AttributeSet, int):void");
    }
}
