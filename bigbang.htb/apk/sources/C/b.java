package C;

import S.N;
import android.content.ContentUris;
import android.content.Context;
import android.content.pm.PackageManager;
import android.content.pm.ProviderInfo;
import android.content.pm.Signature;
import android.content.res.Resources;
import android.database.Cursor;
import android.net.Uri;
import i.r;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import s.C0220g;

/* loaded from: /home/sonpt/Hackdeboc/bigbang.htb/apk/classes.dex */
public abstract class b {

    /* renamed from: a, reason: collision with root package name */
    public static final C0220g f9a = new C0220g(1);

    public static N a(Context context, r rVar) {
        Cursor cursor;
        PackageManager packageManager = context.getPackageManager();
        Resources resources = context.getResources();
        String str = (String) rVar.f2884c;
        int i2 = 0;
        ProviderInfo resolveContentProvider = packageManager.resolveContentProvider(str, 0);
        if (resolveContentProvider == null) {
            throw new PackageManager.NameNotFoundException("No package found for authority: " + str);
        }
        String str2 = resolveContentProvider.packageName;
        String str3 = (String) rVar.f2885d;
        if (!str2.equals(str3)) {
            throw new PackageManager.NameNotFoundException("Found content provider " + str + ", but package was not " + str3);
        }
        Signature[] signatureArr = packageManager.getPackageInfo(resolveContentProvider.packageName, 64).signatures;
        ArrayList arrayList = new ArrayList();
        for (Signature signature : signatureArr) {
            arrayList.add(signature.toByteArray());
        }
        C0220g c0220g = f9a;
        Collections.sort(arrayList, c0220g);
        List list = (List) rVar.f2887f;
        if (list == null) {
            list = B.a.g0(resources, rVar.f2883b);
        }
        int i3 = 0;
        loop1: while (true) {
            cursor = null;
            if (i3 >= list.size()) {
                resolveContentProvider = null;
                break;
            }
            ArrayList arrayList2 = new ArrayList((Collection) list.get(i3));
            Collections.sort(arrayList2, c0220g);
            if (arrayList.size() == arrayList2.size()) {
                for (int i4 = 0; i4 < arrayList.size(); i4++) {
                    if (!Arrays.equals((byte[]) arrayList.get(i4), (byte[]) arrayList2.get(i4))) {
                        break;
                    }
                }
                break loop1;
            }
            i3++;
        }
        int i5 = 1;
        if (resolveContentProvider == null) {
            return new N(i5, cursor);
        }
        String str4 = resolveContentProvider.authority;
        ArrayList arrayList3 = new ArrayList();
        Uri build = new Uri.Builder().scheme("content").authority(str4).build();
        Uri build2 = new Uri.Builder().scheme("content").authority(str4).appendPath("file").build();
        try {
            cursor = context.getContentResolver().query(build, new String[]{"_id", "file_id", "font_ttc_index", "font_variation_settings", "font_weight", "font_italic", "result_code"}, "query = ?", new String[]{(String) rVar.f2886e}, null, null);
            if (cursor != null && cursor.getCount() > 0) {
                int columnIndex = cursor.getColumnIndex("result_code");
                arrayList3 = new ArrayList();
                int columnIndex2 = cursor.getColumnIndex("_id");
                int columnIndex3 = cursor.getColumnIndex("file_id");
                int columnIndex4 = cursor.getColumnIndex("font_ttc_index");
                int columnIndex5 = cursor.getColumnIndex("font_weight");
                int columnIndex6 = cursor.getColumnIndex("font_italic");
                while (cursor.moveToNext()) {
                    arrayList3.add(new g(columnIndex3 == -1 ? ContentUris.withAppendedId(build, cursor.getLong(columnIndex2)) : ContentUris.withAppendedId(build2, cursor.getLong(columnIndex3)), columnIndex4 != -1 ? cursor.getInt(columnIndex4) : 0, columnIndex5 != -1 ? cursor.getInt(columnIndex5) : 400, columnIndex6 != -1 && cursor.getInt(columnIndex6) == 1, columnIndex != -1 ? cursor.getInt(columnIndex) : 0));
                }
            }
            if (cursor != null) {
                cursor.close();
            }
            return new N(i2, (g[]) arrayList3.toArray(new g[0]));
        } catch (Throwable th) {
            if (cursor != null) {
                cursor.close();
            }
            throw th;
        }
    }
}
