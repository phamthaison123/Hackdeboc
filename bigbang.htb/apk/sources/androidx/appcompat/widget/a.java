package androidx.appcompat.widget;

import android.app.SearchableInfo;
import android.content.ActivityNotFoundException;
import android.content.ComponentName;
import android.content.Intent;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;
import androidx.appcompat.widget.SearchView;

/* loaded from: /home/sonpt/Hackdeboc/bigbang.htb/apk/classes.dex */
public final class a implements View.OnClickListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ SearchView f984a;

    public a(SearchView searchView) {
        this.f984a = searchView;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        SearchView searchView = this.f984a;
        ImageView imageView = searchView.f929t;
        SearchView.SearchAutoComplete searchAutoComplete = searchView.f925p;
        if (view == imageView) {
            searchView.x(false);
            searchAutoComplete.requestFocus();
            searchAutoComplete.setImeVisibility(true);
            View.OnClickListener onClickListener = searchView.f907L;
            if (onClickListener != null) {
                onClickListener.onClick(searchView);
                return;
            }
            return;
        }
        if (view == searchView.f931v) {
            searchView.n();
            return;
        }
        if (view == searchView.f930u) {
            searchView.r();
            return;
        }
        if (view != searchView.f932w) {
            if (view == searchAutoComplete) {
                searchAutoComplete.refreshAutoCompleteResults();
                return;
            }
            return;
        }
        SearchableInfo searchableInfo = searchView.f920b0;
        if (searchableInfo == null) {
            return;
        }
        try {
            if (!searchableInfo.getVoiceSearchLaunchWebSearch()) {
                if (searchableInfo.getVoiceSearchLaunchRecognizer()) {
                    searchView.getContext().startActivity(searchView.m(searchView.f904I, searchableInfo));
                }
            } else {
                Intent intent = new Intent(searchView.f903H);
                ComponentName searchActivity = searchableInfo.getSearchActivity();
                intent.putExtra("calling_package", searchActivity == null ? null : searchActivity.flattenToShortString());
                searchView.getContext().startActivity(intent);
            }
        } catch (ActivityNotFoundException unused) {
            Log.w("SearchView", "Could not find voice search activity");
        }
    }
}
