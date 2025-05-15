package D;

import android.text.PrecomputedText;
import android.text.TextDirectionHeuristic;
import android.text.TextPaint;
import android.text.TextUtils;
import java.util.Objects;

/* loaded from: /home/sonpt/Hackdeboc/bigbang.htb/apk/classes.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public final TextPaint f43a;

    /* renamed from: b, reason: collision with root package name */
    public final TextDirectionHeuristic f44b;

    /* renamed from: c, reason: collision with root package name */
    public final int f45c;

    /* renamed from: d, reason: collision with root package name */
    public final int f46d;

    public c(PrecomputedText.Params params) {
        this.f43a = params.getTextPaint();
        this.f44b = params.getTextDirection();
        this.f45c = params.getBreakStrategy();
        this.f46d = params.getHyphenationFrequency();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        if (this.f45c == cVar.f45c && this.f46d == cVar.f46d) {
            TextPaint textPaint = this.f43a;
            float textSize = textPaint.getTextSize();
            TextPaint textPaint2 = cVar.f43a;
            return textSize == textPaint2.getTextSize() && textPaint.getTextScaleX() == textPaint2.getTextScaleX() && textPaint.getTextSkewX() == textPaint2.getTextSkewX() && textPaint.getLetterSpacing() == textPaint2.getLetterSpacing() && TextUtils.equals(textPaint.getFontFeatureSettings(), textPaint2.getFontFeatureSettings()) && textPaint.getFlags() == textPaint2.getFlags() && textPaint.getTextLocales().equals(textPaint2.getTextLocales()) && (textPaint.getTypeface() != null ? textPaint.getTypeface().equals(textPaint2.getTypeface()) : textPaint2.getTypeface() == null) && this.f44b == cVar.f44b;
        }
        return false;
    }

    public final int hashCode() {
        TextPaint textPaint = this.f43a;
        return Objects.hash(Float.valueOf(textPaint.getTextSize()), Float.valueOf(textPaint.getTextScaleX()), Float.valueOf(textPaint.getTextSkewX()), Float.valueOf(textPaint.getLetterSpacing()), Integer.valueOf(textPaint.getFlags()), textPaint.getTextLocales(), textPaint.getTypeface(), Boolean.valueOf(textPaint.isElegantTextHeight()), this.f44b, Integer.valueOf(this.f45c), Integer.valueOf(this.f46d));
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("{");
        StringBuilder sb2 = new StringBuilder("textSize=");
        TextPaint textPaint = this.f43a;
        sb2.append(textPaint.getTextSize());
        sb.append(sb2.toString());
        sb.append(", textScaleX=" + textPaint.getTextScaleX());
        sb.append(", textSkewX=" + textPaint.getTextSkewX());
        sb.append(", letterSpacing=" + textPaint.getLetterSpacing());
        sb.append(", elegantTextHeight=" + textPaint.isElegantTextHeight());
        sb.append(", textLocale=" + textPaint.getTextLocales());
        sb.append(", typeface=" + textPaint.getTypeface());
        sb.append(", variationSettings=" + textPaint.getFontVariationSettings());
        sb.append(", textDir=" + this.f44b);
        sb.append(", breakStrategy=" + this.f45c);
        sb.append(", hyphenationFrequency=" + this.f46d);
        sb.append("}");
        return sb.toString();
    }
}
