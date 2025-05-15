package m0;

import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.RectF;
import java.util.ArrayList;
import java.util.BitSet;

/* loaded from: /home/sonpt/Hackdeboc/bigbang.htb/apk/classes.dex */
public final class n {

    /* renamed from: a, reason: collision with root package name */
    public final v[] f3142a = new v[4];

    /* renamed from: b, reason: collision with root package name */
    public final Matrix[] f3143b = new Matrix[4];

    /* renamed from: c, reason: collision with root package name */
    public final Matrix[] f3144c = new Matrix[4];

    /* renamed from: d, reason: collision with root package name */
    public final PointF f3145d = new PointF();

    /* renamed from: e, reason: collision with root package name */
    public final Path f3146e = new Path();

    /* renamed from: f, reason: collision with root package name */
    public final Path f3147f = new Path();

    /* renamed from: g, reason: collision with root package name */
    public final v f3148g = new v();

    /* renamed from: h, reason: collision with root package name */
    public final float[] f3149h = new float[2];

    /* renamed from: i, reason: collision with root package name */
    public final float[] f3150i = new float[2];

    /* renamed from: j, reason: collision with root package name */
    public final Path f3151j = new Path();

    /* renamed from: k, reason: collision with root package name */
    public final Path f3152k = new Path();

    /* renamed from: l, reason: collision with root package name */
    public final boolean f3153l = true;

    public n() {
        for (int i2 = 0; i2 < 4; i2++) {
            this.f3142a[i2] = new v();
            this.f3143b[i2] = new Matrix();
            this.f3144c[i2] = new Matrix();
        }
    }

    public final void a(l lVar, float f2, RectF rectF, f fVar, Path path) {
        int i2;
        Matrix[] matrixArr;
        float[] fArr;
        Matrix[] matrixArr2;
        v[] vVarArr;
        int i3;
        n nVar = this;
        path.rewind();
        Path path2 = nVar.f3146e;
        path2.rewind();
        Path path3 = nVar.f3147f;
        path3.rewind();
        path3.addRect(rectF, Path.Direction.CW);
        int i4 = 0;
        while (true) {
            i2 = 4;
            matrixArr = nVar.f3144c;
            fArr = nVar.f3149h;
            matrixArr2 = nVar.f3143b;
            vVarArr = nVar.f3142a;
            if (i4 >= 4) {
                break;
            }
            c cVar = i4 != 1 ? i4 != 2 ? i4 != 3 ? lVar.f3134f : lVar.f3133e : lVar.f3136h : lVar.f3135g;
            B.a aVar = i4 != 1 ? i4 != 2 ? i4 != 3 ? lVar.f3130b : lVar.f3129a : lVar.f3132d : lVar.f3131c;
            v vVar = vVarArr[i4];
            aVar.getClass();
            aVar.y(f2, cVar.a(rectF), vVar);
            int i5 = i4 + 1;
            float f3 = i5 * 90;
            matrixArr2[i4].reset();
            PointF pointF = nVar.f3145d;
            if (i4 == 1) {
                i3 = i5;
                pointF.set(rectF.right, rectF.bottom);
            } else if (i4 == 2) {
                i3 = i5;
                pointF.set(rectF.left, rectF.bottom);
            } else if (i4 != 3) {
                i3 = i5;
                pointF.set(rectF.right, rectF.top);
            } else {
                i3 = i5;
                pointF.set(rectF.left, rectF.top);
            }
            matrixArr2[i4].setTranslate(pointF.x, pointF.y);
            matrixArr2[i4].preRotate(f3);
            v vVar2 = vVarArr[i4];
            fArr[0] = vVar2.f3173c;
            fArr[1] = vVar2.f3174d;
            matrixArr2[i4].mapPoints(fArr);
            matrixArr[i4].reset();
            matrixArr[i4].setTranslate(fArr[0], fArr[1]);
            matrixArr[i4].preRotate(f3);
            i4 = i3;
        }
        int i6 = 0;
        while (i6 < i2) {
            v vVar3 = vVarArr[i6];
            fArr[0] = vVar3.f3171a;
            fArr[1] = vVar3.f3172b;
            matrixArr2[i6].mapPoints(fArr);
            if (i6 == 0) {
                path.moveTo(fArr[0], fArr[1]);
            } else {
                path.lineTo(fArr[0], fArr[1]);
            }
            vVarArr[i6].b(matrixArr2[i6], path);
            if (fVar != null) {
                v vVar4 = vVarArr[i6];
                Matrix matrix = matrixArr2[i6];
                h hVar = fVar.f3071a;
                BitSet bitSet = hVar.f3097d;
                vVar4.getClass();
                bitSet.set(i6, false);
                vVar4.a(vVar4.f3176f);
                hVar.f3095b[i6] = new o(new ArrayList(vVar4.f3178h), new Matrix(matrix));
            }
            int i7 = i6 + 1;
            int i8 = i7 % 4;
            v vVar5 = vVarArr[i6];
            fArr[0] = vVar5.f3173c;
            fArr[1] = vVar5.f3174d;
            matrixArr2[i6].mapPoints(fArr);
            v vVar6 = vVarArr[i8];
            float f4 = vVar6.f3171a;
            float[] fArr2 = nVar.f3150i;
            fArr2[0] = f4;
            fArr2[1] = vVar6.f3172b;
            matrixArr2[i8].mapPoints(fArr2);
            float max = Math.max(((float) Math.hypot(fArr[0] - fArr2[0], fArr[1] - fArr2[1])) - 0.001f, 0.0f);
            v vVar7 = vVarArr[i6];
            fArr[0] = vVar7.f3173c;
            fArr[1] = vVar7.f3174d;
            matrixArr2[i6].mapPoints(fArr);
            if (i6 == 1 || i6 == 3) {
                Math.abs(rectF.centerX() - fArr[0]);
            } else {
                Math.abs(rectF.centerY() - fArr[1]);
            }
            v vVar8 = nVar.f3148g;
            vVar8.d(0.0f, 270.0f, 0.0f);
            (i6 != 1 ? i6 != 2 ? i6 != 3 ? lVar.f3138j : lVar.f3137i : lVar.f3140l : lVar.f3139k).getClass();
            vVar8.c(max, 0.0f);
            Path path4 = nVar.f3151j;
            path4.reset();
            vVar8.b(matrixArr[i6], path4);
            if (nVar.f3153l && (nVar.b(path4, i6) || nVar.b(path4, i8))) {
                path4.op(path4, path3, Path.Op.DIFFERENCE);
                fArr[0] = vVar8.f3171a;
                fArr[1] = vVar8.f3172b;
                matrixArr[i6].mapPoints(fArr);
                path2.moveTo(fArr[0], fArr[1]);
                vVar8.b(matrixArr[i6], path2);
            } else {
                vVar8.b(matrixArr[i6], path);
            }
            if (fVar != null) {
                Matrix matrix2 = matrixArr[i6];
                h hVar2 = fVar.f3071a;
                hVar2.f3097d.set(i6 + 4, false);
                vVar8.a(vVar8.f3176f);
                hVar2.f3096c[i6] = new o(new ArrayList(vVar8.f3178h), new Matrix(matrix2));
            }
            i2 = 4;
            nVar = this;
            i6 = i7;
        }
        path.close();
        path2.close();
        if (path2.isEmpty()) {
            return;
        }
        path.op(path2, Path.Op.UNION);
    }

    public final boolean b(Path path, int i2) {
        Path path2 = this.f3152k;
        path2.reset();
        this.f3142a[i2].b(this.f3143b[i2], path2);
        RectF rectF = new RectF();
        path.computeBounds(rectF, true);
        path2.computeBounds(rectF, true);
        path.op(path2, Path.Op.INTERSECT);
        path.computeBounds(rectF, true);
        if (rectF.isEmpty()) {
            return rectF.width() > 1.0f && rectF.height() > 1.0f;
        }
        return true;
    }
}
