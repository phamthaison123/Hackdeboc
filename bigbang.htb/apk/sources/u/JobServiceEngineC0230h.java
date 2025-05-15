package u;

import android.app.job.JobParameters;
import android.app.job.JobServiceEngine;
import android.os.AsyncTask;
import androidx.core.app.JobIntentService;

/* renamed from: u.h, reason: case insensitive filesystem */
/* loaded from: /home/sonpt/Hackdeboc/bigbang.htb/apk/classes.dex */
public final class JobServiceEngineC0230h extends JobServiceEngine {

    /* renamed from: a, reason: collision with root package name */
    public final JobIntentService f3727a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f3728b;

    /* renamed from: c, reason: collision with root package name */
    public JobParameters f3729c;

    public JobServiceEngineC0230h(JobIntentService jobIntentService) {
        super(jobIntentService);
        this.f3728b = new Object();
        this.f3727a = jobIntentService;
    }

    @Override // android.app.job.JobServiceEngine
    public final boolean onStartJob(JobParameters jobParameters) {
        this.f3729c = jobParameters;
        JobIntentService jobIntentService = this.f3727a;
        if (jobIntentService.f1031b != null) {
            return true;
        }
        AsyncTaskC0228f asyncTaskC0228f = new AsyncTaskC0228f(jobIntentService, 0);
        jobIntentService.f1031b = asyncTaskC0228f;
        asyncTaskC0228f.executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, new Void[0]);
        return true;
    }

    @Override // android.app.job.JobServiceEngine
    public final boolean onStopJob(JobParameters jobParameters) {
        AsyncTaskC0228f asyncTaskC0228f = this.f3727a.f1031b;
        if (asyncTaskC0228f != null) {
            asyncTaskC0228f.cancel(false);
        }
        synchronized (this.f3728b) {
            this.f3729c = null;
        }
        return true;
    }
}
