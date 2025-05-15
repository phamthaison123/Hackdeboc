package e;

import F.Q;
import android.text.Editable;
import android.text.method.PasswordTransformationMethod;
import android.view.View;
import android.widget.AutoCompleteTextView;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;
import androidx.appcompat.widget.Toolbar;
import com.google.android.material.textfield.TextInputLayout;
import com.satellite.bigbang.LoginActivity;
import com.satellite.bigbang.MoveCommandActivity;
import com.satellite.bigbang.TakePictureActivity;
import i.U0;
import org.json.JSONObject;
import u.AsyncTaskC0228f;

/* renamed from: e.b, reason: case insensitive filesystem */
/* loaded from: /home/sonpt/Hackdeboc/bigbang.htb/apk/classes.dex */
public final class ViewOnClickListenerC0096b implements View.OnClickListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2075a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f2076b;

    public /* synthetic */ ViewOnClickListenerC0096b(int i2, Object obj) {
        this.f2075a = i2;
        this.f2076b = obj;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i2 = 2;
        int i3 = this.f2075a;
        int i4 = 1;
        Object obj = this.f2076b;
        switch (i3) {
            case 0:
                h hVar = (h) obj;
                Button button = hVar.f2100f;
                hVar.f2117w.obtainMessage(1, hVar.f2096b).sendToTarget();
                break;
            case 1:
                U0 u0 = ((Toolbar) obj).f951L;
                h.q qVar = u0 != null ? u0.f2724b : null;
                if (qVar != null) {
                    qVar.collapseActionView();
                    break;
                }
                break;
            case 2:
                com.google.android.material.datepicker.l lVar = (com.google.android.material.datepicker.l) obj;
                int i5 = lVar.f1814W;
                if (i5 != 2) {
                    if (i5 == 1) {
                        lVar.G(2);
                        break;
                    }
                } else {
                    lVar.G(1);
                    break;
                }
                break;
            case 3:
                o0.e eVar = (o0.e) obj;
                Editable text = eVar.f3393a.getEditText().getText();
                if (text != null) {
                    text.clear();
                }
                TextInputLayout textInputLayout = eVar.f3393a;
                textInputLayout.k(textInputLayout.f1917i0, textInputLayout.k0);
                break;
            case 4:
                o0.l lVar2 = (o0.l) obj;
                o0.l.d(lVar2, (AutoCompleteTextView) lVar2.f3393a.getEditText());
                break;
            case 5:
                o0.q qVar2 = (o0.q) obj;
                EditText editText = qVar2.f3393a.getEditText();
                if (editText != null) {
                    int selectionEnd = editText.getSelectionEnd();
                    if (o0.q.d(qVar2)) {
                        editText.setTransformationMethod(null);
                    } else {
                        editText.setTransformationMethod(PasswordTransformationMethod.getInstance());
                    }
                    if (selectionEnd >= 0) {
                        editText.setSelection(selectionEnd);
                    }
                    TextInputLayout textInputLayout2 = qVar2.f3393a;
                    textInputLayout2.k(textInputLayout2.f1917i0, textInputLayout2.k0);
                    break;
                }
                break;
            case 6:
                LoginActivity loginActivity = (LoginActivity) obj;
                String obj2 = loginActivity.f1991o.getText().toString();
                String obj3 = loginActivity.f1992p.getText().toString();
                if (obj2.isEmpty() || obj3.isEmpty()) {
                    Toast.makeText(loginActivity, "Please enter username and password", 0).show();
                    break;
                } else {
                    try {
                        JSONObject jSONObject = new JSONObject();
                        jSONObject.put("username", obj2);
                        jSONObject.put("password", obj3);
                        new AsyncTaskC0228f((LoginActivity) obj, i4).execute(jSONObject.toString());
                        break;
                    } catch (Exception e2) {
                        e2.printStackTrace();
                        return;
                    }
                }
                break;
            case 7:
                MoveCommandActivity moveCommandActivity = (MoveCommandActivity) obj;
                int i6 = MoveCommandActivity.f1995s;
                moveCommandActivity.getClass();
                if (System.currentTimeMillis() > moveCommandActivity.f2000r) {
                    Toast.makeText(moveCommandActivity, "The token has expired. Please log in again.", 0).show();
                    break;
                } else {
                    String obj4 = moveCommandActivity.f1996n.getText().toString();
                    String obj5 = moveCommandActivity.f1997o.getText().toString();
                    String obj6 = moveCommandActivity.f1998p.getText().toString();
                    if (obj4.isEmpty() || obj5.isEmpty() || obj6.isEmpty()) {
                        Toast.makeText(moveCommandActivity, "Please enter coordinates for x, y, and z.", 0).show();
                        break;
                    } else {
                        try {
                            JSONObject jSONObject2 = new JSONObject();
                            jSONObject2.put("command", "move");
                            jSONObject2.put("x", Float.parseFloat(obj4));
                            jSONObject2.put("y", Float.parseFloat(obj5));
                            jSONObject2.put("z", Float.parseFloat(obj6));
                            new AsyncTaskC0228f((MoveCommandActivity) obj, i2).execute(jSONObject2.toString());
                            break;
                        } catch (Exception e3) {
                            e3.printStackTrace();
                            Toast.makeText(moveCommandActivity, "Error creating JSON object.", 0).show();
                            return;
                        }
                    }
                }
            default:
                TakePictureActivity takePictureActivity = (TakePictureActivity) obj;
                new q0.b(takePictureActivity).execute(Q.d((String) takePictureActivity.f2004q.get(takePictureActivity.f2001n.getSelectedItem().toString()), ".png"));
                break;
        }
    }
}
