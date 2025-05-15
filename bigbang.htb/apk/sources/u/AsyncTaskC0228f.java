package u;

import android.content.ContextWrapper;
import android.content.Intent;
import android.os.AsyncTask;
import android.widget.Toast;
import androidx.core.app.JobIntentService;
import com.satellite.bigbang.InteractionActivity;
import com.satellite.bigbang.LoginActivity;
import com.satellite.bigbang.MoveCommandActivity;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import org.json.JSONObject;

/* renamed from: u.f, reason: case insensitive filesystem */
/* loaded from: /home/sonpt/Hackdeboc/bigbang.htb/apk/classes.dex */
public final class AsyncTaskC0228f extends AsyncTask {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3723a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ContextWrapper f3724b;

    public /* synthetic */ AsyncTaskC0228f(ContextWrapper contextWrapper, int i2) {
        this.f3723a = i2;
        this.f3724b = contextWrapper;
    }

    public final String a(String... strArr) {
        OutputStream outputStream;
        BufferedReader bufferedReader;
        int i2 = this.f3723a;
        ContextWrapper contextWrapper = this.f3724b;
        switch (i2) {
            case 1:
                try {
                    HttpURLConnection httpURLConnection = (HttpURLConnection) new URL("http://app.bigbang.htb:9090/login").openConnection();
                    httpURLConnection.setRequestMethod("POST");
                    httpURLConnection.setRequestProperty("Content-Type", "application/json");
                    httpURLConnection.setRequestProperty("Accept", "application/json");
                    httpURLConnection.setDoOutput(true);
                    outputStream = httpURLConnection.getOutputStream();
                    try {
                        byte[] bytes = strArr[0].getBytes("utf-8");
                        outputStream.write(bytes, 0, bytes.length);
                        outputStream.close();
                        bufferedReader = new BufferedReader(new InputStreamReader(httpURLConnection.getInputStream(), "utf-8"));
                        try {
                            StringBuilder sb = new StringBuilder();
                            while (true) {
                                String readLine = bufferedReader.readLine();
                                if (readLine == null) {
                                    String sb2 = sb.toString();
                                    bufferedReader.close();
                                    return sb2;
                                }
                                sb.append(readLine.trim());
                            }
                        } finally {
                            try {
                                bufferedReader.close();
                            } catch (Throwable th) {
                                th.addSuppressed(th);
                            }
                        }
                    } finally {
                        if (outputStream != null) {
                            try {
                                outputStream.close();
                            } catch (Throwable th2) {
                                th.addSuppressed(th2);
                            }
                        }
                    }
                } catch (Exception e2) {
                    e2.printStackTrace();
                    ((LoginActivity) contextWrapper).runOnUiThread(new androidx.activity.b(10, this));
                    return null;
                }
            default:
                try {
                    HttpURLConnection httpURLConnection2 = (HttpURLConnection) new URL("http://app.bigbang.htb:9090/command").openConnection();
                    httpURLConnection2.setRequestMethod("POST");
                    httpURLConnection2.setRequestProperty("Content-Type", "application/json");
                    httpURLConnection2.setRequestProperty("Authorization", "Bearer " + ((MoveCommandActivity) contextWrapper).f1999q);
                    httpURLConnection2.setDoOutput(true);
                    outputStream = httpURLConnection2.getOutputStream();
                    try {
                        byte[] bytes2 = strArr[0].getBytes("utf-8");
                        outputStream.write(bytes2, 0, bytes2.length);
                        outputStream.close();
                        bufferedReader = new BufferedReader(new InputStreamReader(httpURLConnection2.getInputStream(), "utf-8"));
                        try {
                            StringBuilder sb3 = new StringBuilder();
                            while (true) {
                                String readLine2 = bufferedReader.readLine();
                                if (readLine2 == null) {
                                    String sb4 = sb3.toString();
                                    bufferedReader.close();
                                    return sb4;
                                }
                                sb3.append(readLine2.trim());
                            }
                        } finally {
                        }
                    } finally {
                    }
                } catch (Exception e3) {
                    e3.printStackTrace();
                    return null;
                }
        }
    }

    public final void b(String str) {
        int i2 = this.f3723a;
        ContextWrapper contextWrapper = this.f3724b;
        switch (i2) {
            case 1:
                if (str != null) {
                    try {
                        ((LoginActivity) contextWrapper).f1993q = new JSONObject(str).getString("access_token");
                        ((LoginActivity) contextWrapper).f1994r = System.currentTimeMillis() + 120000;
                        Intent intent = new Intent((LoginActivity) contextWrapper, (Class<?>) InteractionActivity.class);
                        intent.putExtra("access_token", ((LoginActivity) contextWrapper).f1993q);
                        intent.putExtra("token_expiry_time", ((LoginActivity) contextWrapper).f1994r);
                        ((LoginActivity) contextWrapper).startActivity(intent);
                        break;
                    } catch (Exception e2) {
                        e2.printStackTrace();
                        return;
                    }
                }
                break;
            default:
                if (str == null) {
                    Toast.makeText((MoveCommandActivity) contextWrapper, "Failed to execute command.", 0).show();
                    break;
                } else {
                    Toast.makeText((MoveCommandActivity) contextWrapper, "Command executed: ".concat(str), 0).show();
                    break;
                }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x006b A[SYNTHETIC] */
    @Override // android.os.AsyncTask
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object doInBackground(java.lang.Object[] r5) {
        /*
            r4 = this;
            int r0 = r4.f3723a
            switch(r0) {
                case 0: goto L13;
                case 1: goto Lc;
                default: goto L5;
            }
        L5:
            java.lang.String[] r5 = (java.lang.String[]) r5
            java.lang.String r4 = r4.a(r5)
            return r4
        Lc:
            java.lang.String[] r5 = (java.lang.String[]) r5
            java.lang.String r4 = r4.a(r5)
            return r4
        L13:
            java.lang.Void[] r5 = (java.lang.Void[]) r5
        L15:
            android.content.ContextWrapper r5 = r4.f3724b
            androidx.core.app.JobIntentService r5 = (androidx.core.app.JobIntentService) r5
            u.h r0 = r5.f1030a
            r0.getClass()
            u.h r5 = r5.f1030a
            java.lang.Object r0 = r5.f3728b
            monitor-enter(r0)
            android.app.job.JobParameters r1 = r5.f3729c     // Catch: java.lang.Throwable -> L2b
            r2 = 0
            if (r1 != 0) goto L2d
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L2b
        L29:
            r0 = r2
            goto L46
        L2b:
            r4 = move-exception
            goto L6c
        L2d:
            android.app.job.JobWorkItem r1 = r1.dequeueWork()     // Catch: java.lang.Throwable -> L2b
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L2b
            if (r1 == 0) goto L29
            android.content.Intent r0 = r1.getIntent()
            androidx.core.app.JobIntentService r3 = r5.f3727a
            java.lang.ClassLoader r3 = r3.getClassLoader()
            r0.setExtrasClassLoader(r3)
            u.g r0 = new u.g
            r0.<init>(r5, r1)
        L46:
            if (r0 == 0) goto L6b
            android.content.ContextWrapper r5 = r4.f3724b
            androidx.core.app.JobIntentService r5 = (androidx.core.app.JobIntentService) r5
            android.app.job.JobWorkItem r1 = r0.f3725a
            r1.getIntent()
            r5.a()
            u.h r5 = r0.f3726b
            java.lang.Object r5 = r5.f3728b
            monitor-enter(r5)
            u.h r1 = r0.f3726b     // Catch: java.lang.Throwable -> L65
            android.app.job.JobParameters r1 = r1.f3729c     // Catch: java.lang.Throwable -> L65
            if (r1 == 0) goto L67
            android.app.job.JobWorkItem r0 = r0.f3725a     // Catch: java.lang.Throwable -> L65
            r1.completeWork(r0)     // Catch: java.lang.Throwable -> L65
            goto L67
        L65:
            r4 = move-exception
            goto L69
        L67:
            monitor-exit(r5)     // Catch: java.lang.Throwable -> L65
            goto L15
        L69:
            monitor-exit(r5)     // Catch: java.lang.Throwable -> L65
            throw r4
        L6b:
            return r2
        L6c:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L2b
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: u.AsyncTaskC0228f.doInBackground(java.lang.Object[]):java.lang.Object");
    }

    @Override // android.os.AsyncTask
    public final void onCancelled(Object obj) {
        switch (this.f3723a) {
            case 0:
                ((JobIntentService) this.f3724b).getClass();
                break;
            default:
                super.onCancelled(obj);
                break;
        }
    }

    @Override // android.os.AsyncTask
    public final void onPostExecute(Object obj) {
        switch (this.f3723a) {
            case 0:
                ((JobIntentService) this.f3724b).getClass();
                break;
            case 1:
                b((String) obj);
                break;
            default:
                b((String) obj);
                break;
        }
    }
}
