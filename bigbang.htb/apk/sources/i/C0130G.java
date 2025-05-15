package i;

import android.R;
import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Shader;
import android.graphics.drawable.AnimationDrawable;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.ClipDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.RoundRectShape;
import android.util.AttributeSet;
import android.widget.ProgressBar;
import e.C0097c;
import z.AbstractC0241b;
import z.InterfaceC0240a;

/* renamed from: i.G, reason: case insensitive filesystem */
/* loaded from: /home/sonpt/Hackdeboc/bigbang.htb/apk/classes.dex */
public class C0130G {

    /* renamed from: c, reason: collision with root package name */
    public static final int[] f2636c = {R.attr.indeterminateDrawable, R.attr.progressDrawable};

    /* renamed from: a, reason: collision with root package name */
    public final ProgressBar f2637a;

    /* renamed from: b, reason: collision with root package name */
    public Bitmap f2638b;

    public C0130G(ProgressBar progressBar) {
        this.f2637a = progressBar;
    }

    public void a(AttributeSet attributeSet, int i2) {
        ProgressBar progressBar = this.f2637a;
        C0097c t2 = C0097c.t(progressBar.getContext(), attributeSet, f2636c, i2, 0);
        Drawable h2 = t2.h(0);
        if (h2 != null) {
            if (h2 instanceof AnimationDrawable) {
                AnimationDrawable animationDrawable = (AnimationDrawable) h2;
                int numberOfFrames = animationDrawable.getNumberOfFrames();
                AnimationDrawable animationDrawable2 = new AnimationDrawable();
                animationDrawable2.setOneShot(animationDrawable.isOneShot());
                for (int i3 = 0; i3 < numberOfFrames; i3++) {
                    Drawable b2 = b(animationDrawable.getFrame(i3), true);
                    b2.setLevel(10000);
                    animationDrawable2.addFrame(b2, animationDrawable.getDuration(i3));
                }
                animationDrawable2.setLevel(10000);
                h2 = animationDrawable2;
            }
            progressBar.setIndeterminateDrawable(h2);
        }
        Drawable h3 = t2.h(1);
        if (h3 != null) {
            progressBar.setProgressDrawable(b(h3, false));
        }
        t2.u();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final Drawable b(Drawable drawable, boolean z2) {
        if (drawable instanceof InterfaceC0240a) {
            ((AbstractC0241b) ((InterfaceC0240a) drawable)).getClass();
        } else {
            if (drawable instanceof LayerDrawable) {
                LayerDrawable layerDrawable = (LayerDrawable) drawable;
                int numberOfLayers = layerDrawable.getNumberOfLayers();
                Drawable[] drawableArr = new Drawable[numberOfLayers];
                for (int i2 = 0; i2 < numberOfLayers; i2++) {
                    int id = layerDrawable.getId(i2);
                    drawableArr[i2] = b(layerDrawable.getDrawable(i2), id == 16908301 || id == 16908303);
                }
                LayerDrawable layerDrawable2 = new LayerDrawable(drawableArr);
                for (int i3 = 0; i3 < numberOfLayers; i3++) {
                    layerDrawable2.setId(i3, layerDrawable.getId(i3));
                    layerDrawable2.setLayerGravity(i3, layerDrawable.getLayerGravity(i3));
                    layerDrawable2.setLayerWidth(i3, layerDrawable.getLayerWidth(i3));
                    layerDrawable2.setLayerHeight(i3, layerDrawable.getLayerHeight(i3));
                    layerDrawable2.setLayerInsetLeft(i3, layerDrawable.getLayerInsetLeft(i3));
                    layerDrawable2.setLayerInsetRight(i3, layerDrawable.getLayerInsetRight(i3));
                    layerDrawable2.setLayerInsetTop(i3, layerDrawable.getLayerInsetTop(i3));
                    layerDrawable2.setLayerInsetBottom(i3, layerDrawable.getLayerInsetBottom(i3));
                    layerDrawable2.setLayerInsetStart(i3, layerDrawable.getLayerInsetStart(i3));
                    layerDrawable2.setLayerInsetEnd(i3, layerDrawable.getLayerInsetEnd(i3));
                }
                return layerDrawable2;
            }
            if (drawable instanceof BitmapDrawable) {
                BitmapDrawable bitmapDrawable = (BitmapDrawable) drawable;
                Bitmap bitmap = bitmapDrawable.getBitmap();
                if (this.f2638b == null) {
                    this.f2638b = bitmap;
                }
                ShapeDrawable shapeDrawable = new ShapeDrawable(new RoundRectShape(new float[]{5.0f, 5.0f, 5.0f, 5.0f, 5.0f, 5.0f, 5.0f, 5.0f}, null, null));
                shapeDrawable.getPaint().setShader(new BitmapShader(bitmap, Shader.TileMode.REPEAT, Shader.TileMode.CLAMP));
                shapeDrawable.getPaint().setColorFilter(bitmapDrawable.getPaint().getColorFilter());
                return z2 ? new ClipDrawable(shapeDrawable, 3, 1) : shapeDrawable;
            }
        }
        return drawable;
    }
}
