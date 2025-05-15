package q0;

import android.os.AsyncTask;
import android.os.Environment;
import android.widget.Toast;
import com.satellite.bigbang.TakePictureActivity;
import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;

/* loaded from: /home/sonpt/Hackdeboc/bigbang.htb/apk/classes.dex */
public final class b extends AsyncTask {

    /* renamed from: a, reason: collision with root package name */
    public String f3686a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ TakePictureActivity f3687b;

    public b(TakePictureActivity takePictureActivity) {
        this.f3687b = takePictureActivity;
    }

    @Override // android.os.AsyncTask
    public final Object doInBackground(Object[] objArr) {
        this.f3686a = ((String[]) objArr)[0];
        try {
            HttpURLConnection httpURLConnection = (HttpURLConnection) new URL("http://app.bigbang.htb:9090/command").openConnection();
            httpURLConnection.setRequestMethod("POST");
            httpURLConnection.setRequestProperty("Content-Type", "application/json");
            httpURLConnection.setRequestProperty("Authorization", "Bearer " + this.f3687b.f2003p);
            httpURLConnection.setDoOutput(true);
            String str = "{\"command\": \"send_image\", \"output_file\": \"" + this.f3686a + "\"}";
            OutputStream outputStream = httpURLConnection.getOutputStream();
            try {
                byte[] bytes = str.getBytes("utf-8");
                outputStream.write(bytes, 0, bytes.length);
                outputStream.close();
                if (httpURLConnection.getResponseCode() != 200) {
                    return Boolean.FALSE;
                }
                InputStream inputStream = httpURLConnection.getInputStream();
                FileOutputStream fileOutputStream = new FileOutputStream(new File(Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_PICTURES), this.f3686a));
                try {
                    byte[] bArr = new byte[1024];
                    while (true) {
                        int read = inputStream.read(bArr);
                        if (read == -1) {
                            fileOutputStream.close();
                            inputStream.close();
                            return Boolean.TRUE;
                        }
                        fileOutputStream.write(bArr, 0, read);
                    }
                } finally {
                }
            } finally {
            }
        } catch (Exception e2) {
            e2.printStackTrace();
            return Boolean.FALSE;
        }
    }

    @Override // android.os.AsyncTask
    public final void onPostExecute(Object obj) {
        boolean booleanValue = ((Boolean) obj).booleanValue();
        TakePictureActivity takePictureActivity = this.f3687b;
        if (booleanValue) {
            Toast.makeText(takePictureActivity, "Request Successful and Image Downloaded", 0).show();
        } else {
            Toast.makeText(takePictureActivity, "Request Failed", 0).show();
        }
    }
}
