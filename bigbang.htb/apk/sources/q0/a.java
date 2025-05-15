package q0;

import android.content.Intent;
import android.view.View;
import android.widget.Toast;
import com.satellite.bigbang.InteractionActivity;
import com.satellite.bigbang.MoveCommandActivity;
import com.satellite.bigbang.TakePictureActivity;

/* loaded from: /home/sonpt/Hackdeboc/bigbang.htb/apk/classes.dex */
public final class a implements View.OnClickListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3684a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ InteractionActivity f3685b;

    public /* synthetic */ a(InteractionActivity interactionActivity, int i2) {
        this.f3684a = i2;
        this.f3685b = interactionActivity;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i2 = this.f3684a;
        InteractionActivity interactionActivity = this.f3685b;
        switch (i2) {
            case 0:
                int i3 = InteractionActivity.f1985r;
                interactionActivity.getClass();
                if (System.currentTimeMillis() <= interactionActivity.f1989q) {
                    Intent intent = new Intent(interactionActivity, (Class<?>) MoveCommandActivity.class);
                    intent.putExtra("access_token", interactionActivity.f1988p);
                    intent.putExtra("token_expiry_time", interactionActivity.f1989q);
                    interactionActivity.startActivity(intent);
                    break;
                } else {
                    Toast.makeText(interactionActivity, "The token has expired. Please log in again.", 0).show();
                    break;
                }
            default:
                int i4 = InteractionActivity.f1985r;
                interactionActivity.getClass();
                if (System.currentTimeMillis() <= interactionActivity.f1989q) {
                    Intent intent2 = new Intent(interactionActivity, (Class<?>) TakePictureActivity.class);
                    intent2.putExtra("access_token", interactionActivity.f1988p);
                    intent2.putExtra("token_expiry_time", interactionActivity.f1989q);
                    interactionActivity.startActivity(intent2);
                    break;
                } else {
                    Toast.makeText(interactionActivity, "The token has expired. Please log in again.", 0).show();
                    break;
                }
        }
    }
}
