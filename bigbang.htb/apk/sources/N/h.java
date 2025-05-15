package N;

import android.text.InputFilter;
import android.text.method.PasswordTransformationMethod;
import android.text.method.TransformationMethod;
import android.util.SparseArray;
import android.widget.TextView;

/* loaded from: /home/sonpt/Hackdeboc/bigbang.htb/apk/classes.dex */
public final class h extends m0.e {

    /* renamed from: b, reason: collision with root package name */
    public final TextView f233b;

    /* renamed from: c, reason: collision with root package name */
    public final f f234c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f235d = true;

    public h(TextView textView) {
        this.f233b = textView;
        this.f234c = new f(textView);
    }

    @Override // m0.e
    public final InputFilter[] a(InputFilter[] inputFilterArr) {
        if (!this.f235d) {
            SparseArray sparseArray = new SparseArray(1);
            for (int i2 = 0; i2 < inputFilterArr.length; i2++) {
                InputFilter inputFilter = inputFilterArr[i2];
                if (inputFilter instanceof f) {
                    sparseArray.put(i2, inputFilter);
                }
            }
            if (sparseArray.size() == 0) {
                return inputFilterArr;
            }
            int length = inputFilterArr.length;
            InputFilter[] inputFilterArr2 = new InputFilter[inputFilterArr.length - sparseArray.size()];
            int i3 = 0;
            for (int i4 = 0; i4 < length; i4++) {
                if (sparseArray.indexOfKey(i4) < 0) {
                    inputFilterArr2[i3] = inputFilterArr[i4];
                    i3++;
                }
            }
            return inputFilterArr2;
        }
        int length2 = inputFilterArr.length;
        int i5 = 0;
        while (true) {
            f fVar = this.f234c;
            if (i5 >= length2) {
                InputFilter[] inputFilterArr3 = new InputFilter[inputFilterArr.length + 1];
                System.arraycopy(inputFilterArr, 0, inputFilterArr3, 0, length2);
                inputFilterArr3[length2] = fVar;
                return inputFilterArr3;
            }
            if (inputFilterArr[i5] == fVar) {
                return inputFilterArr;
            }
            i5++;
        }
    }

    @Override // m0.e
    public final void e(boolean z2) {
        if (z2) {
            g();
        }
    }

    @Override // m0.e
    public final void f(boolean z2) {
        this.f235d = z2;
        g();
        TextView textView = this.f233b;
        textView.setFilters(a(textView.getFilters()));
    }

    public final void g() {
        TextView textView = this.f233b;
        TransformationMethod transformationMethod = textView.getTransformationMethod();
        if (this.f235d) {
            if (!(transformationMethod instanceof l) && !(transformationMethod instanceof PasswordTransformationMethod)) {
                transformationMethod = new l(transformationMethod);
            }
        } else if (transformationMethod instanceof l) {
            transformationMethod = ((l) transformationMethod).f242a;
        }
        textView.setTransformationMethod(transformationMethod);
    }
}
