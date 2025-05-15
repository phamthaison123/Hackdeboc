package androidx.appcompat.widget;

import F.AbstractC0023y;
import F.J;
import F.O;
import android.app.PendingIntent;
import android.app.SearchableInfo;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.database.Cursor;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.Editable;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.style.ImageSpan;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputMethodManager;
import android.widget.ImageView;
import d.AbstractC0092a;
import e.C0097c;
import g.InterfaceC0104d;
import i.AbstractC0160n0;
import i.C0;
import i.C0164p0;
import i.C0165q;
import i.D0;
import i.E0;
import i.F0;
import i.G0;
import i.H0;
import i.I0;
import i.J0;
import i.K0;
import i.M0;
import i.N0;
import i.P0;
import java.util.WeakHashMap;

/* loaded from: /home/sonpt/Hackdeboc/bigbang.htb/apk/classes.dex */
public class SearchView extends AbstractC0160n0 implements InterfaceC0104d {

    /* renamed from: g0, reason: collision with root package name */
    public static final /* synthetic */ int f895g0 = 0;

    /* renamed from: A, reason: collision with root package name */
    public final Rect f896A;

    /* renamed from: B, reason: collision with root package name */
    public final int[] f897B;

    /* renamed from: C, reason: collision with root package name */
    public final int[] f898C;

    /* renamed from: D, reason: collision with root package name */
    public final ImageView f899D;

    /* renamed from: E, reason: collision with root package name */
    public final Drawable f900E;

    /* renamed from: F, reason: collision with root package name */
    public final int f901F;

    /* renamed from: G, reason: collision with root package name */
    public final int f902G;

    /* renamed from: H, reason: collision with root package name */
    public final Intent f903H;

    /* renamed from: I, reason: collision with root package name */
    public final Intent f904I;

    /* renamed from: J, reason: collision with root package name */
    public final CharSequence f905J;

    /* renamed from: K, reason: collision with root package name */
    public View.OnFocusChangeListener f906K;

    /* renamed from: L, reason: collision with root package name */
    public View.OnClickListener f907L;

    /* renamed from: M, reason: collision with root package name */
    public boolean f908M;

    /* renamed from: N, reason: collision with root package name */
    public boolean f909N;

    /* renamed from: O, reason: collision with root package name */
    public J.b f910O;

    /* renamed from: P, reason: collision with root package name */
    public boolean f911P;

    /* renamed from: Q, reason: collision with root package name */
    public CharSequence f912Q;

    /* renamed from: R, reason: collision with root package name */
    public boolean f913R;

    /* renamed from: S, reason: collision with root package name */
    public boolean f914S;

    /* renamed from: T, reason: collision with root package name */
    public int f915T;

    /* renamed from: U, reason: collision with root package name */
    public boolean f916U;

    /* renamed from: V, reason: collision with root package name */
    public CharSequence f917V;

    /* renamed from: W, reason: collision with root package name */
    public boolean f918W;

    /* renamed from: a0, reason: collision with root package name */
    public int f919a0;

    /* renamed from: b0, reason: collision with root package name */
    public SearchableInfo f920b0;

    /* renamed from: c0, reason: collision with root package name */
    public Bundle f921c0;

    /* renamed from: d0, reason: collision with root package name */
    public final D0 f922d0;

    /* renamed from: e0, reason: collision with root package name */
    public final D0 f923e0;

    /* renamed from: f0, reason: collision with root package name */
    public final WeakHashMap f924f0;

    /* renamed from: p, reason: collision with root package name */
    public final SearchAutoComplete f925p;

    /* renamed from: q, reason: collision with root package name */
    public final View f926q;

    /* renamed from: r, reason: collision with root package name */
    public final View f927r;

    /* renamed from: s, reason: collision with root package name */
    public final View f928s;

    /* renamed from: t, reason: collision with root package name */
    public final ImageView f929t;

    /* renamed from: u, reason: collision with root package name */
    public final ImageView f930u;

    /* renamed from: v, reason: collision with root package name */
    public final ImageView f931v;

    /* renamed from: w, reason: collision with root package name */
    public final ImageView f932w;

    /* renamed from: x, reason: collision with root package name */
    public final View f933x;

    /* renamed from: y, reason: collision with root package name */
    public N0 f934y;

    /* renamed from: z, reason: collision with root package name */
    public final Rect f935z;

    public static class SearchAutoComplete extends C0165q {

        /* renamed from: e, reason: collision with root package name */
        public int f936e;

        /* renamed from: f, reason: collision with root package name */
        public SearchView f937f;

        /* renamed from: g, reason: collision with root package name */
        public boolean f938g;

        /* renamed from: h, reason: collision with root package name */
        public final c f939h;

        public SearchAutoComplete(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.f939h = new c(this);
            this.f936e = getThreshold();
        }

        private int getSearchViewTextMinWidthDp() {
            Configuration configuration = getResources().getConfiguration();
            int i2 = configuration.screenWidthDp;
            int i3 = configuration.screenHeightDp;
            if (i2 >= 960 && i3 >= 720 && configuration.orientation == 2) {
                return 256;
            }
            if (i2 < 600) {
                return (i2 < 640 || i3 < 480) ? 160 : 192;
            }
            return 192;
        }

        @Override // android.widget.AutoCompleteTextView
        public final boolean enoughToFilter() {
            return this.f936e <= 0 || super.enoughToFilter();
        }

        @Override // i.C0165q, android.widget.TextView, android.view.View
        public final InputConnection onCreateInputConnection(EditorInfo editorInfo) {
            InputConnection onCreateInputConnection = super.onCreateInputConnection(editorInfo);
            if (this.f938g) {
                c cVar = this.f939h;
                removeCallbacks(cVar);
                post(cVar);
            }
            return onCreateInputConnection;
        }

        @Override // android.view.View
        public final void onFinishInflate() {
            super.onFinishInflate();
            setMinWidth((int) TypedValue.applyDimension(1, getSearchViewTextMinWidthDp(), getResources().getDisplayMetrics()));
        }

        @Override // android.widget.AutoCompleteTextView, android.widget.TextView, android.view.View
        public final void onFocusChanged(boolean z2, int i2, Rect rect) {
            super.onFocusChanged(z2, i2, rect);
            SearchView searchView = this.f937f;
            searchView.x(searchView.f909N);
            searchView.post(searchView.f922d0);
            SearchAutoComplete searchAutoComplete = searchView.f925p;
            if (searchAutoComplete.hasFocus()) {
                searchAutoComplete.refreshAutoCompleteResults();
            }
        }

        @Override // android.widget.AutoCompleteTextView, android.widget.TextView, android.view.View
        public final boolean onKeyPreIme(int i2, KeyEvent keyEvent) {
            if (i2 == 4) {
                if (keyEvent.getAction() == 0 && keyEvent.getRepeatCount() == 0) {
                    KeyEvent.DispatcherState keyDispatcherState = getKeyDispatcherState();
                    if (keyDispatcherState != null) {
                        keyDispatcherState.startTracking(keyEvent, this);
                    }
                    return true;
                }
                if (keyEvent.getAction() == 1) {
                    KeyEvent.DispatcherState keyDispatcherState2 = getKeyDispatcherState();
                    if (keyDispatcherState2 != null) {
                        keyDispatcherState2.handleUpEvent(keyEvent);
                    }
                    if (keyEvent.isTracking() && !keyEvent.isCanceled()) {
                        this.f937f.clearFocus();
                        setImeVisibility(false);
                        return true;
                    }
                }
            }
            return super.onKeyPreIme(i2, keyEvent);
        }

        @Override // android.widget.AutoCompleteTextView, android.widget.TextView, android.view.View
        public final void onWindowFocusChanged(boolean z2) {
            super.onWindowFocusChanged(z2);
            if (z2 && this.f937f.hasFocus() && getVisibility() == 0) {
                this.f938g = true;
                Context context = getContext();
                int i2 = SearchView.f895g0;
                if (context.getResources().getConfiguration().orientation == 2) {
                    setInputMethodMode(1);
                    if (enoughToFilter()) {
                        showDropDown();
                    }
                }
            }
        }

        @Override // android.widget.AutoCompleteTextView
        public final void performCompletion() {
        }

        @Override // android.widget.AutoCompleteTextView
        public final void replaceText(CharSequence charSequence) {
        }

        public void setImeVisibility(boolean z2) {
            InputMethodManager inputMethodManager = (InputMethodManager) getContext().getSystemService("input_method");
            c cVar = this.f939h;
            if (!z2) {
                this.f938g = false;
                removeCallbacks(cVar);
                inputMethodManager.hideSoftInputFromWindow(getWindowToken(), 0);
            } else {
                if (!inputMethodManager.isActive(this)) {
                    this.f938g = true;
                    return;
                }
                this.f938g = false;
                removeCallbacks(cVar);
                inputMethodManager.showSoftInput(this, 0);
            }
        }

        public void setSearchView(SearchView searchView) {
            this.f937f = searchView;
        }

        @Override // android.widget.AutoCompleteTextView
        public void setThreshold(int i2) {
            super.setThreshold(i2);
            this.f936e = i2;
        }
    }

    public SearchView(Context context) {
        this(context, null);
    }

    private int getPreferredHeight() {
        return getContext().getResources().getDimensionPixelSize(2131165238);
    }

    private int getPreferredWidth() {
        return getContext().getResources().getDimensionPixelSize(2131165239);
    }

    private void setQuery(CharSequence charSequence) {
        SearchAutoComplete searchAutoComplete = this.f925p;
        searchAutoComplete.setText(charSequence);
        searchAutoComplete.setSelection(TextUtils.isEmpty(charSequence) ? 0 : charSequence.length());
    }

    @Override // g.InterfaceC0104d
    public final void a() {
        if (this.f918W) {
            return;
        }
        this.f918W = true;
        SearchAutoComplete searchAutoComplete = this.f925p;
        int imeOptions = searchAutoComplete.getImeOptions();
        this.f919a0 = imeOptions;
        searchAutoComplete.setImeOptions(imeOptions | 33554432);
        searchAutoComplete.setText("");
        setIconified(false);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void clearFocus() {
        this.f914S = true;
        super.clearFocus();
        SearchAutoComplete searchAutoComplete = this.f925p;
        searchAutoComplete.clearFocus();
        searchAutoComplete.setImeVisibility(false);
        this.f914S = false;
    }

    @Override // g.InterfaceC0104d
    public final void d() {
        SearchAutoComplete searchAutoComplete = this.f925p;
        searchAutoComplete.setText("");
        searchAutoComplete.setSelection(searchAutoComplete.length());
        this.f917V = "";
        clearFocus();
        x(true);
        searchAutoComplete.setImeOptions(this.f919a0);
        this.f918W = false;
    }

    public int getImeOptions() {
        return this.f925p.getImeOptions();
    }

    public int getInputType() {
        return this.f925p.getInputType();
    }

    public int getMaxWidth() {
        return this.f915T;
    }

    public CharSequence getQuery() {
        return this.f925p.getText();
    }

    public CharSequence getQueryHint() {
        CharSequence charSequence = this.f912Q;
        if (charSequence != null) {
            return charSequence;
        }
        SearchableInfo searchableInfo = this.f920b0;
        return (searchableInfo == null || searchableInfo.getHintId() == 0) ? this.f905J : getContext().getText(this.f920b0.getHintId());
    }

    public int getSuggestionCommitIconResId() {
        return this.f902G;
    }

    public int getSuggestionRowLayout() {
        return this.f901F;
    }

    public J.b getSuggestionsAdapter() {
        return this.f910O;
    }

    public final Intent l(String str, Uri uri, String str2, String str3) {
        Intent intent = new Intent(str);
        intent.addFlags(268435456);
        if (uri != null) {
            intent.setData(uri);
        }
        intent.putExtra("user_query", this.f917V);
        if (str3 != null) {
            intent.putExtra("query", str3);
        }
        if (str2 != null) {
            intent.putExtra("intent_extra_data_key", str2);
        }
        Bundle bundle = this.f921c0;
        if (bundle != null) {
            intent.putExtra("app_data", bundle);
        }
        intent.setComponent(this.f920b0.getSearchActivity());
        return intent;
    }

    public final Intent m(Intent intent, SearchableInfo searchableInfo) {
        ComponentName searchActivity = searchableInfo.getSearchActivity();
        Intent intent2 = new Intent("android.intent.action.SEARCH");
        intent2.setComponent(searchActivity);
        PendingIntent activity = PendingIntent.getActivity(getContext(), 0, intent2, 1107296256);
        Bundle bundle = new Bundle();
        Bundle bundle2 = this.f921c0;
        if (bundle2 != null) {
            bundle.putParcelable("app_data", bundle2);
        }
        Intent intent3 = new Intent(intent);
        Resources resources = getResources();
        String string = searchableInfo.getVoiceLanguageModeId() != 0 ? resources.getString(searchableInfo.getVoiceLanguageModeId()) : "free_form";
        String string2 = searchableInfo.getVoicePromptTextId() != 0 ? resources.getString(searchableInfo.getVoicePromptTextId()) : null;
        String string3 = searchableInfo.getVoiceLanguageId() != 0 ? resources.getString(searchableInfo.getVoiceLanguageId()) : null;
        int voiceMaxResults = searchableInfo.getVoiceMaxResults() != 0 ? searchableInfo.getVoiceMaxResults() : 1;
        intent3.putExtra("android.speech.extra.LANGUAGE_MODEL", string);
        intent3.putExtra("android.speech.extra.PROMPT", string2);
        intent3.putExtra("android.speech.extra.LANGUAGE", string3);
        intent3.putExtra("android.speech.extra.MAX_RESULTS", voiceMaxResults);
        intent3.putExtra("calling_package", searchActivity != null ? searchActivity.flattenToShortString() : null);
        intent3.putExtra("android.speech.extra.RESULTS_PENDINGINTENT", activity);
        intent3.putExtra("android.speech.extra.RESULTS_PENDINGINTENT_BUNDLE", bundle);
        return intent3;
    }

    public final void n() {
        SearchAutoComplete searchAutoComplete = this.f925p;
        if (!TextUtils.isEmpty(searchAutoComplete.getText())) {
            searchAutoComplete.setText("");
            searchAutoComplete.requestFocus();
            searchAutoComplete.setImeVisibility(true);
        } else if (this.f908M) {
            clearFocus();
            x(true);
        }
    }

    public final void o(int i2) {
        int i3;
        String h2;
        Cursor cursor = this.f910O.f166c;
        if (cursor != null && cursor.moveToPosition(i2)) {
            Intent intent = null;
            try {
                int i4 = P0.f2680x;
                String h3 = P0.h(cursor, cursor.getColumnIndex("suggest_intent_action"));
                if (h3 == null) {
                    h3 = this.f920b0.getSuggestIntentAction();
                }
                if (h3 == null) {
                    h3 = "android.intent.action.SEARCH";
                }
                String h4 = P0.h(cursor, cursor.getColumnIndex("suggest_intent_data"));
                if (h4 == null) {
                    h4 = this.f920b0.getSuggestIntentData();
                }
                if (h4 != null && (h2 = P0.h(cursor, cursor.getColumnIndex("suggest_intent_data_id"))) != null) {
                    h4 = h4 + "/" + Uri.encode(h2);
                }
                intent = l(h3, h4 == null ? null : Uri.parse(h4), P0.h(cursor, cursor.getColumnIndex("suggest_intent_extra_data")), P0.h(cursor, cursor.getColumnIndex("suggest_intent_query")));
            } catch (RuntimeException e2) {
                try {
                    i3 = cursor.getPosition();
                } catch (RuntimeException unused) {
                    i3 = -1;
                }
                Log.w("SearchView", "Search suggestions cursor at row " + i3 + " returned exception.", e2);
            }
            if (intent != null) {
                try {
                    getContext().startActivity(intent);
                } catch (RuntimeException e3) {
                    Log.e("SearchView", "Failed launch activity: " + intent, e3);
                }
            }
        }
        SearchAutoComplete searchAutoComplete = this.f925p;
        searchAutoComplete.setImeVisibility(false);
        searchAutoComplete.dismissDropDown();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        removeCallbacks(this.f922d0);
        post(this.f923e0);
        super.onDetachedFromWindow();
    }

    @Override // i.AbstractC0160n0, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z2, int i2, int i3, int i4, int i5) {
        super.onLayout(z2, i2, i3, i4, i5);
        if (z2) {
            int[] iArr = this.f897B;
            SearchAutoComplete searchAutoComplete = this.f925p;
            searchAutoComplete.getLocationInWindow(iArr);
            int[] iArr2 = this.f898C;
            getLocationInWindow(iArr2);
            int i6 = iArr[1] - iArr2[1];
            int i7 = iArr[0] - iArr2[0];
            int width = searchAutoComplete.getWidth() + i7;
            int height = searchAutoComplete.getHeight() + i6;
            Rect rect = this.f935z;
            rect.set(i7, i6, width, height);
            int i8 = rect.left;
            int i9 = rect.right;
            int i10 = i5 - i3;
            Rect rect2 = this.f896A;
            rect2.set(i8, 0, i9, i10);
            N0 n02 = this.f934y;
            if (n02 == null) {
                N0 n03 = new N0(rect2, rect, searchAutoComplete);
                this.f934y = n03;
                setTouchDelegate(n03);
            } else {
                n02.f2663b.set(rect2);
                Rect rect3 = n02.f2665d;
                rect3.set(rect2);
                int i11 = -n02.f2666e;
                rect3.inset(i11, i11);
                n02.f2664c.set(rect);
            }
        }
    }

    @Override // i.AbstractC0160n0, android.view.View
    public final void onMeasure(int i2, int i3) {
        int i4;
        if (this.f909N) {
            super.onMeasure(i2, i3);
            return;
        }
        int mode = View.MeasureSpec.getMode(i2);
        int size = View.MeasureSpec.getSize(i2);
        if (mode == Integer.MIN_VALUE) {
            int i5 = this.f915T;
            size = i5 > 0 ? Math.min(i5, size) : Math.min(getPreferredWidth(), size);
        } else if (mode == 0) {
            size = this.f915T;
            if (size <= 0) {
                size = getPreferredWidth();
            }
        } else if (mode == 1073741824 && (i4 = this.f915T) > 0) {
            size = Math.min(i4, size);
        }
        int mode2 = View.MeasureSpec.getMode(i3);
        int size2 = View.MeasureSpec.getSize(i3);
        if (mode2 == Integer.MIN_VALUE) {
            size2 = Math.min(getPreferredHeight(), size2);
        } else if (mode2 == 0) {
            size2 = getPreferredHeight();
        }
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(size2, 1073741824));
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof M0)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        M0 m02 = (M0) parcelable;
        super.onRestoreInstanceState(m02.f173a);
        x(m02.f2659c);
        requestLayout();
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        M0 m02 = new M0(super.onSaveInstanceState());
        m02.f2659c = this.f909N;
        return m02;
    }

    @Override // android.view.View
    public final void onWindowFocusChanged(boolean z2) {
        super.onWindowFocusChanged(z2);
        post(this.f922d0);
    }

    public final void p(int i2) {
        Editable text = this.f925p.getText();
        Cursor cursor = this.f910O.f166c;
        if (cursor == null) {
            return;
        }
        if (!cursor.moveToPosition(i2)) {
            setQuery(text);
            return;
        }
        String c2 = this.f910O.c(cursor);
        if (c2 != null) {
            setQuery(c2);
        } else {
            setQuery(text);
        }
    }

    public final void q(CharSequence charSequence) {
        setQuery(charSequence);
    }

    public final void r() {
        SearchAutoComplete searchAutoComplete = this.f925p;
        Editable text = searchAutoComplete.getText();
        if (text == null || TextUtils.getTrimmedLength(text) <= 0) {
            return;
        }
        if (this.f920b0 != null) {
            getContext().startActivity(l("android.intent.action.SEARCH", null, null, text.toString()));
        }
        searchAutoComplete.setImeVisibility(false);
        searchAutoComplete.dismissDropDown();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean requestFocus(int i2, Rect rect) {
        if (this.f914S || !isFocusable()) {
            return false;
        }
        if (this.f909N) {
            return super.requestFocus(i2, rect);
        }
        boolean requestFocus = this.f925p.requestFocus(i2, rect);
        if (requestFocus) {
            x(false);
        }
        return requestFocus;
    }

    public final void s() {
        boolean z2 = true;
        boolean z3 = !TextUtils.isEmpty(this.f925p.getText());
        if (!z3 && (!this.f908M || this.f918W)) {
            z2 = false;
        }
        int i2 = z2 ? 0 : 8;
        ImageView imageView = this.f931v;
        imageView.setVisibility(i2);
        Drawable drawable = imageView.getDrawable();
        if (drawable != null) {
            drawable.setState(z3 ? ViewGroup.ENABLED_STATE_SET : ViewGroup.EMPTY_STATE_SET);
        }
    }

    public void setAppSearchData(Bundle bundle) {
        this.f921c0 = bundle;
    }

    public void setIconified(boolean z2) {
        if (z2) {
            n();
            return;
        }
        x(false);
        SearchAutoComplete searchAutoComplete = this.f925p;
        searchAutoComplete.requestFocus();
        searchAutoComplete.setImeVisibility(true);
        View.OnClickListener onClickListener = this.f907L;
        if (onClickListener != null) {
            onClickListener.onClick(this);
        }
    }

    public void setIconifiedByDefault(boolean z2) {
        if (this.f908M == z2) {
            return;
        }
        this.f908M = z2;
        x(z2);
        u();
    }

    public void setImeOptions(int i2) {
        this.f925p.setImeOptions(i2);
    }

    public void setInputType(int i2) {
        this.f925p.setInputType(i2);
    }

    public void setMaxWidth(int i2) {
        this.f915T = i2;
        requestLayout();
    }

    public void setOnCloseListener(I0 i02) {
    }

    public void setOnQueryTextFocusChangeListener(View.OnFocusChangeListener onFocusChangeListener) {
        this.f906K = onFocusChangeListener;
    }

    public void setOnQueryTextListener(J0 j02) {
    }

    public void setOnSearchClickListener(View.OnClickListener onClickListener) {
        this.f907L = onClickListener;
    }

    public void setOnSuggestionListener(K0 k0) {
    }

    public void setQueryHint(CharSequence charSequence) {
        this.f912Q = charSequence;
        u();
    }

    public void setQueryRefinementEnabled(boolean z2) {
        this.f913R = z2;
        J.b bVar = this.f910O;
        if (bVar instanceof P0) {
            ((P0) bVar).f2689p = z2 ? 2 : 1;
        }
    }

    public void setSearchableInfo(SearchableInfo searchableInfo) {
        this.f920b0 = searchableInfo;
        Intent intent = null;
        SearchAutoComplete searchAutoComplete = this.f925p;
        if (searchableInfo != null) {
            searchAutoComplete.setThreshold(searchableInfo.getSuggestThreshold());
            searchAutoComplete.setImeOptions(this.f920b0.getImeOptions());
            int inputType = this.f920b0.getInputType();
            if ((inputType & 15) == 1) {
                inputType &= -65537;
                if (this.f920b0.getSuggestAuthority() != null) {
                    inputType |= 589824;
                }
            }
            searchAutoComplete.setInputType(inputType);
            J.b bVar = this.f910O;
            if (bVar != null) {
                bVar.b(null);
            }
            if (this.f920b0.getSuggestAuthority() != null) {
                P0 p02 = new P0(getContext(), this, this.f920b0, this.f924f0);
                this.f910O = p02;
                searchAutoComplete.setAdapter(p02);
                ((P0) this.f910O).f2689p = this.f913R ? 2 : 1;
            }
            u();
        }
        SearchableInfo searchableInfo2 = this.f920b0;
        boolean z2 = false;
        if (searchableInfo2 != null && searchableInfo2.getVoiceSearchEnabled()) {
            if (this.f920b0.getVoiceSearchLaunchWebSearch()) {
                intent = this.f903H;
            } else if (this.f920b0.getVoiceSearchLaunchRecognizer()) {
                intent = this.f904I;
            }
            if (intent != null) {
                z2 = getContext().getPackageManager().resolveActivity(intent, 65536) != null;
            }
        }
        this.f916U = z2;
        if (z2) {
            searchAutoComplete.setPrivateImeOptions("nm");
        }
        x(this.f909N);
    }

    public void setSubmitButtonEnabled(boolean z2) {
        this.f911P = z2;
        x(this.f909N);
    }

    public void setSuggestionsAdapter(J.b bVar) {
        this.f910O = bVar;
        this.f925p.setAdapter(bVar);
    }

    public final void t() {
        int[] iArr = this.f925p.hasFocus() ? ViewGroup.FOCUSED_STATE_SET : ViewGroup.EMPTY_STATE_SET;
        Drawable background = this.f927r.getBackground();
        if (background != null) {
            background.setState(iArr);
        }
        Drawable background2 = this.f928s.getBackground();
        if (background2 != null) {
            background2.setState(iArr);
        }
        invalidate();
    }

    public final void u() {
        Drawable drawable;
        CharSequence queryHint = getQueryHint();
        if (queryHint == null) {
            queryHint = "";
        }
        boolean z2 = this.f908M;
        SearchAutoComplete searchAutoComplete = this.f925p;
        if (z2 && (drawable = this.f900E) != null) {
            int textSize = (int) (searchAutoComplete.getTextSize() * 1.25d);
            drawable.setBounds(0, 0, textSize, textSize);
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("   ");
            spannableStringBuilder.setSpan(new ImageSpan(drawable), 1, 2, 33);
            spannableStringBuilder.append(queryHint);
            queryHint = spannableStringBuilder;
        }
        searchAutoComplete.setHint(queryHint);
    }

    public final void v() {
        this.f928s.setVisibility(((this.f911P || this.f916U) && !this.f909N && (this.f930u.getVisibility() == 0 || this.f932w.getVisibility() == 0)) ? 0 : 8);
    }

    public final void w(boolean z2) {
        boolean z3 = this.f911P;
        this.f930u.setVisibility((!z3 || !(z3 || this.f916U) || this.f909N || !hasFocus() || (!z2 && this.f916U)) ? 8 : 0);
    }

    public final void x(boolean z2) {
        this.f909N = z2;
        int i2 = 8;
        int i3 = z2 ? 0 : 8;
        boolean isEmpty = TextUtils.isEmpty(this.f925p.getText());
        this.f929t.setVisibility(i3);
        w(!isEmpty);
        this.f926q.setVisibility(z2 ? 8 : 0);
        ImageView imageView = this.f899D;
        imageView.setVisibility((imageView.getDrawable() == null || this.f908M) ? 8 : 0);
        s();
        if (this.f916U && !this.f909N && isEmpty) {
            this.f930u.setVisibility(8);
            i2 = 0;
        }
        this.f932w.setVisibility(i2);
        v();
    }

    public SearchView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 2130969340);
    }

    public SearchView(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        this.f935z = new Rect();
        this.f896A = new Rect();
        this.f897B = new int[2];
        this.f898C = new int[2];
        int i3 = 0;
        this.f922d0 = new D0(this, i3);
        this.f923e0 = new D0(this, 1);
        this.f924f0 = new WeakHashMap();
        a aVar = new a(this);
        b bVar = new b(this);
        G0 g02 = new G0(this);
        H0 h02 = new H0(this, i3);
        C0164p0 c0164p0 = new C0164p0(1, this);
        C0 c02 = new C0(0, this);
        int[] iArr = AbstractC0092a.f2026u;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr, i2, 0);
        C0097c c0097c = new C0097c(context, obtainStyledAttributes);
        WeakHashMap weakHashMap = O.f58a;
        J.c(this, context, iArr, attributeSet, obtainStyledAttributes, i2, 0);
        LayoutInflater.from(context).inflate(c0097c.m(9, 2131492889), (ViewGroup) this, true);
        SearchAutoComplete searchAutoComplete = (SearchAutoComplete) findViewById(2131296591);
        this.f925p = searchAutoComplete;
        searchAutoComplete.setSearchView(this);
        this.f926q = findViewById(2131296587);
        View findViewById = findViewById(2131296590);
        this.f927r = findViewById;
        View findViewById2 = findViewById(2131296628);
        this.f928s = findViewById2;
        ImageView imageView = (ImageView) findViewById(2131296585);
        this.f929t = imageView;
        ImageView imageView2 = (ImageView) findViewById(2131296588);
        this.f930u = imageView2;
        ImageView imageView3 = (ImageView) findViewById(2131296586);
        this.f931v = imageView3;
        ImageView imageView4 = (ImageView) findViewById(2131296592);
        this.f932w = imageView4;
        ImageView imageView5 = (ImageView) findViewById(2131296589);
        this.f899D = imageView5;
        AbstractC0023y.q(findViewById, c0097c.g(10));
        AbstractC0023y.q(findViewById2, c0097c.g(14));
        imageView.setImageDrawable(c0097c.g(13));
        imageView2.setImageDrawable(c0097c.g(7));
        imageView3.setImageDrawable(c0097c.g(4));
        imageView4.setImageDrawable(c0097c.g(16));
        imageView5.setImageDrawable(c0097c.g(13));
        this.f900E = c0097c.g(12);
        imageView.setTooltipText(getResources().getString(2131755029));
        this.f901F = c0097c.m(15, 2131492888);
        this.f902G = c0097c.m(5, 0);
        imageView.setOnClickListener(aVar);
        imageView3.setOnClickListener(aVar);
        imageView2.setOnClickListener(aVar);
        imageView4.setOnClickListener(aVar);
        searchAutoComplete.setOnClickListener(aVar);
        searchAutoComplete.addTextChangedListener(c02);
        searchAutoComplete.setOnEditorActionListener(g02);
        searchAutoComplete.setOnItemClickListener(h02);
        searchAutoComplete.setOnItemSelectedListener(c0164p0);
        searchAutoComplete.setOnKeyListener(bVar);
        searchAutoComplete.setOnFocusChangeListener(new E0(i3, this));
        setIconifiedByDefault(c0097c.a(8, true));
        int d2 = c0097c.d(1, -1);
        if (d2 != -1) {
            setMaxWidth(d2);
        }
        this.f905J = c0097c.p(6);
        this.f912Q = c0097c.p(11);
        int j2 = c0097c.j(3, -1);
        if (j2 != -1) {
            setImeOptions(j2);
        }
        int j3 = c0097c.j(2, -1);
        if (j3 != -1) {
            setInputType(j3);
        }
        setFocusable(c0097c.a(0, true));
        c0097c.u();
        Intent intent = new Intent("android.speech.action.WEB_SEARCH");
        this.f903H = intent;
        intent.addFlags(268435456);
        intent.putExtra("android.speech.extra.LANGUAGE_MODEL", "web_search");
        Intent intent2 = new Intent("android.speech.action.RECOGNIZE_SPEECH");
        this.f904I = intent2;
        intent2.addFlags(268435456);
        View findViewById3 = findViewById(searchAutoComplete.getDropDownAnchor());
        this.f933x = findViewById3;
        if (findViewById3 != null) {
            findViewById3.addOnLayoutChangeListener(new F0(0, this));
        }
        x(this.f908M);
        u();
    }
}
