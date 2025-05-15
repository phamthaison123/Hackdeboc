package i;

import F.C0003d;
import F.C0005f;
import F.C0007h;
import F.InterfaceC0004e;
import android.app.Activity;
import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.Editable;
import android.text.method.KeyListener;
import android.text.method.NumberKeyListener;
import android.util.AttributeSet;
import android.util.Log;
import android.view.ActionMode;
import android.view.DragEvent;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.textclassifier.TextClassifier;
import android.widget.EditText;

/* renamed from: i.y, reason: case insensitive filesystem */
/* loaded from: /home/sonpt/Hackdeboc/bigbang.htb/apk/classes.dex */
public class C0180y extends EditText implements F.r {

    /* renamed from: a, reason: collision with root package name */
    public final r f2948a;

    /* renamed from: b, reason: collision with root package name */
    public final W f2949b;

    /* renamed from: c, reason: collision with root package name */
    public final I.i f2950c;

    /* renamed from: d, reason: collision with root package name */
    public final C0182z f2951d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0180y(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 2130968906);
        R0.a(context);
        Q0.a(this, getContext());
        r rVar = new r(this);
        this.f2948a = rVar;
        rVar.e(attributeSet, 2130968906);
        W w2 = new W(this);
        this.f2949b = w2;
        w2.d(attributeSet, 2130968906);
        w2.b();
        this.f2950c = new I.i();
        C0182z c0182z = new C0182z(this);
        this.f2951d = c0182z;
        c0182z.r(attributeSet, 2130968906);
        KeyListener keyListener = getKeyListener();
        if (!(keyListener instanceof NumberKeyListener)) {
            boolean isFocusable = super.isFocusable();
            int inputType = super.getInputType();
            KeyListener q2 = c0182z.q(keyListener);
            if (q2 == keyListener) {
                return;
            }
            super.setKeyListener(q2);
            super.setRawInputType(inputType);
            super.setFocusable(isFocusable);
        }
    }

    @Override // F.r
    public final C0007h a(C0007h c0007h) {
        return this.f2950c.a(this, c0007h);
    }

    @Override // android.widget.TextView, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        r rVar = this.f2948a;
        if (rVar != null) {
            rVar.a();
        }
        W w2 = this.f2949b;
        if (w2 != null) {
            w2.b();
        }
    }

    @Override // android.widget.TextView
    public ActionMode.Callback getCustomSelectionActionModeCallback() {
        return super.getCustomSelectionActionModeCallback();
    }

    public ColorStateList getSupportBackgroundTintList() {
        r rVar = this.f2948a;
        if (rVar != null) {
            return rVar.c();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        r rVar = this.f2948a;
        if (rVar != null) {
            return rVar.d();
        }
        return null;
    }

    @Override // android.widget.TextView
    public TextClassifier getTextClassifier() {
        return super.getTextClassifier();
    }

    @Override // android.widget.TextView, android.view.View
    public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        String[] c2;
        InputConnection onCreateInputConnection = super.onCreateInputConnection(editorInfo);
        this.f2949b.getClass();
        B.a.P(this, editorInfo, onCreateInputConnection);
        if (onCreateInputConnection != null && Build.VERSION.SDK_INT <= 30 && (c2 = F.O.c(this)) != null) {
            editorInfo.contentMimeTypes = c2;
            onCreateInputConnection = new H.a(onCreateInputConnection, new e.z(15, this));
        }
        return this.f2951d.s(onCreateInputConnection, editorInfo);
    }

    @Override // android.widget.TextView, android.view.View
    public final boolean onDragEvent(DragEvent dragEvent) {
        Activity activity;
        if (Build.VERSION.SDK_INT < 31 && dragEvent.getLocalState() == null && F.O.c(this) != null) {
            Context context = getContext();
            while (true) {
                if (!(context instanceof ContextWrapper)) {
                    activity = null;
                    break;
                }
                if (context instanceof Activity) {
                    activity = (Activity) context;
                    break;
                }
                context = ((ContextWrapper) context).getBaseContext();
            }
            if (activity == null) {
                Log.i("ReceiveContent", "Can't handle drop: no activity: view=" + this);
            } else if (dragEvent.getAction() != 1 && dragEvent.getAction() == 3 && J.a(dragEvent, this, activity)) {
                return true;
            }
        }
        return super.onDragEvent(dragEvent);
    }

    @Override // android.widget.EditText, android.widget.TextView
    public final boolean onTextContextMenuItem(int i2) {
        int i3 = Build.VERSION.SDK_INT;
        if (i3 >= 31 || F.O.c(this) == null || !(i2 == 16908322 || i2 == 16908337)) {
            return super.onTextContextMenuItem(i2);
        }
        ClipboardManager clipboardManager = (ClipboardManager) getContext().getSystemService("clipboard");
        ClipData primaryClip = clipboardManager == null ? null : clipboardManager.getPrimaryClip();
        if (primaryClip != null && primaryClip.getItemCount() > 0) {
            InterfaceC0004e c0003d = i3 >= 31 ? new C0003d(primaryClip, 1) : new C0005f(primaryClip, 1);
            c0003d.e(i2 == 16908322 ? 0 : 1);
            F.O.e(this, c0003d.d());
        }
        return true;
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        r rVar = this.f2948a;
        if (rVar != null) {
            rVar.f();
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i2) {
        super.setBackgroundResource(i2);
        r rVar = this.f2948a;
        if (rVar != null) {
            rVar.g(i2);
        }
    }

    @Override // android.widget.TextView
    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(callback);
    }

    public void setEmojiCompatEnabled(boolean z2) {
        ((N.b) this.f2951d.f2961b).f221a.f(z2);
    }

    @Override // android.widget.TextView
    public void setKeyListener(KeyListener keyListener) {
        super.setKeyListener(this.f2951d.q(keyListener));
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        r rVar = this.f2948a;
        if (rVar != null) {
            rVar.i(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        r rVar = this.f2948a;
        if (rVar != null) {
            rVar.j(mode);
        }
    }

    @Override // android.widget.TextView
    public final void setTextAppearance(Context context, int i2) {
        super.setTextAppearance(context, i2);
        W w2 = this.f2949b;
        if (w2 != null) {
            w2.e(context, i2);
        }
    }

    @Override // android.widget.TextView
    public void setTextClassifier(TextClassifier textClassifier) {
        super.setTextClassifier(textClassifier);
    }

    @Override // android.widget.EditText, android.widget.TextView
    public Editable getText() {
        return super.getText();
    }
}
