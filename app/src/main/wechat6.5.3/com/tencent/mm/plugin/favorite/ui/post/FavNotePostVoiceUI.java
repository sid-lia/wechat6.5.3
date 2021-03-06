package com.tencent.mm.plugin.favorite.ui.post;

import android.content.Intent;
import android.os.Bundle;
import android.os.Message;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnTouchListener;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.view.animation.Animation.AnimationListener;
import android.view.animation.TranslateAnimation;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;
import com.tencent.mm.c.b.j;
import com.tencent.mm.sdk.platformtools.BackwardSupportUtil.b;
import com.tencent.mm.sdk.platformtools.ac;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.sdk.platformtools.ah.a;
import com.tencent.mm.sdk.platformtools.be;
import com.tencent.mm.sdk.platformtools.v;
import com.tencent.mm.ui.MMBaseActivity;
import com.tencent.mm.ui.q;
import java.io.File;

public class FavNotePostVoiceUI extends MMBaseActivity {
    private static final int[] ewE = new int[]{0, 15, 30, 45, 60, 75, 90, 100};
    private static final int[] ewF = new int[]{2130837628, 2130837629, 2130837630, 2130837631, 2130837632, 2130837633, 2130837634};
    private long dfS;
    private long ewI = -1;
    private Toast ewJ;
    private ImageView ewN;
    private boolean ewV;
    private boolean ewW;
    private int ewx;
    private final ah exb = new ah(new a(this) {
        final /* synthetic */ FavNotePostVoiceUI fTk;

        {
            this.fTk = r1;
        }

        public final boolean oU() {
            int maxAmplitude = this.fTk.fTi.getMaxAmplitude();
            int i = 0;
            while (i < FavNotePostVoiceUI.ewF.length) {
                if (maxAmplitude >= FavNotePostVoiceUI.ewE[i] && maxAmplitude < FavNotePostVoiceUI.ewE[i + 1]) {
                    this.fTk.ewN.setBackgroundResource(FavNotePostVoiceUI.ewF[i]);
                    break;
                }
                i++;
            }
            return true;
        }
    }, true);
    private final ah exc = new ah(new a(this) {
        final /* synthetic */ FavNotePostVoiceUI fTk;

        {
            this.fTk = r1;
        }

        public final boolean oU() {
            if (this.fTk.ewI == -1) {
                this.fTk.ewI = be.Nj();
            }
            long az = be.az(this.fTk.ewI);
            if (az >= 3590000 && az <= 3600000) {
                if (this.fTk.ewJ == null) {
                    this.fTk.ewJ = Toast.makeText(this.fTk, this.fTk.getString(2131231871, new Object[]{Integer.valueOf((int) ((3600000 - az) / 1000))}), 0);
                } else {
                    this.fTk.ewJ.setText(this.fTk.getString(2131231871, new Object[]{Integer.valueOf((int) ((3600000 - az) / 1000))}));
                }
                this.fTk.ewJ.show();
            }
            if (az < 3600000) {
                return true;
            }
            v.v("MicroMsg.FavPostVoiceUI", "record stop on countdown");
            this.fTk.ewW = true;
            this.fTk.ane();
            return false;
        }
    }, true);
    private final ac exe = new ac(this) {
        final /* synthetic */ FavNotePostVoiceUI fTk;

        {
            this.fTk = r1;
        }

        public final void handleMessage(Message message) {
            super.handleMessage(message);
            this.fTk.anf();
            this.fTk.fTa.setBackgroundResource(2130839044);
            this.fTk.fTa.setEnabled(true);
        }
    };
    private Button fTa;
    private long fTb;
    private View fTc;
    private View fTd;
    private View fTe;
    private View fTf;
    private TextView fTg;
    private View fTh;
    private j fTi;
    boolean fTj = false;
    private String path;

    static /* synthetic */ void j(FavNotePostVoiceUI favNotePostVoiceUI) {
        favNotePostVoiceUI.fTa.setKeepScreenOn(true);
        favNotePostVoiceUI.fTa.setBackgroundResource(2130839044);
        favNotePostVoiceUI.fTa.setText(2131232721);
        favNotePostVoiceUI.ewW = false;
        favNotePostVoiceUI.fTi = favNotePostVoiceUI.and();
        if (favNotePostVoiceUI.fTi.bz(favNotePostVoiceUI.path)) {
            favNotePostVoiceUI.fTb = be.Nj();
            favNotePostVoiceUI.exc.ea(200);
            favNotePostVoiceUI.ewN.setVisibility(0);
            favNotePostVoiceUI.exb.ea(100);
            favNotePostVoiceUI.fTg.setText(2131232689);
            return;
        }
        favNotePostVoiceUI.fTb = 0;
    }

    static /* synthetic */ void n(FavNotePostVoiceUI favNotePostVoiceUI) {
        favNotePostVoiceUI.fTa.setKeepScreenOn(false);
        favNotePostVoiceUI.fTi.pb();
        favNotePostVoiceUI.exb.QI();
        favNotePostVoiceUI.exc.QI();
        favNotePostVoiceUI.ang();
        favNotePostVoiceUI.anf();
    }

    public void onCreate(Bundle bundle) {
        String str;
        super.onCreate(bundle);
        setContentView(q.em(this).inflate(2130903613, null));
        this.ewN = (ImageView) findViewById(2131756976);
        this.fTe = findViewById(2131756974);
        this.fTf = findViewById(2131756978);
        this.fTc = findViewById(2131756973);
        this.fTd = findViewById(2131756981);
        this.fTg = (TextView) findViewById(2131756977);
        this.fTh = findViewById(2131756971);
        findViewById(2131756972).setVisibility(8);
        this.fTh.setVisibility(8);
        findViewById(2131756972).setOnTouchListener(new OnTouchListener(this) {
            final /* synthetic */ FavNotePostVoiceUI fTk;

            {
                this.fTk = r1;
            }

            public final boolean onTouch(View view, MotionEvent motionEvent) {
                this.fTk.anh();
                return false;
            }
        });
        findViewById(2131756982).setVisibility(8);
        this.fTi = and();
        this.fTa = (Button) findViewById(2131756983);
        this.fTa.setOnTouchListener(new OnTouchListener(this) {
            final /* synthetic */ FavNotePostVoiceUI fTk;

            {
                this.fTk = r1;
            }

            public final boolean onTouch(View view, MotionEvent motionEvent) {
                if (view == this.fTk.fTa) {
                    int rawY = (int) motionEvent.getRawY();
                    int[] iArr = new int[2];
                    this.fTk.ewx = this.fTk.getResources().getDisplayMetrics().heightPixels;
                    this.fTk.fTa.getLocationOnScreen(iArr);
                    int i = iArr[1];
                    switch (motionEvent.getAction()) {
                        case 0:
                            if (!this.fTk.ewV) {
                                this.fTk.ewV = true;
                                FavNotePostVoiceUI.j(this.fTk);
                                break;
                            }
                            break;
                        case 1:
                            if (this.fTk.ewV) {
                                if (this.fTk.fTf.getVisibility() != 0) {
                                    if (!this.fTk.ewW) {
                                        this.fTk.ane();
                                        break;
                                    }
                                }
                                v.w("MicroMsg.FavPostVoiceUI", "action up -> cancel");
                                FavNotePostVoiceUI.n(this.fTk);
                                break;
                            }
                            break;
                        case 2:
                            if (rawY <= this.fTk.ewx - b.a(this.fTk, 60.0f) && rawY < i) {
                                this.fTk.fTe.setVisibility(8);
                                this.fTk.fTf.setVisibility(0);
                                break;
                            }
                            this.fTk.fTe.setVisibility(0);
                            this.fTk.fTf.setVisibility(8);
                            break;
                        case 3:
                            v.w("MicroMsg.FavPostVoiceUI", "action cancel");
                            FavNotePostVoiceUI.n(this.fTk);
                            break;
                        default:
                            break;
                    }
                }
                return false;
            }
        });
        anf();
        String alR = com.tencent.mm.plugin.favorite.b.v.alR();
        File file = new File(alR);
        if (!file.exists()) {
            file.mkdirs();
        }
        do {
            str = alR + "/" + System.currentTimeMillis();
        } while (new File(str).exists());
        this.path = str;
        this.fTg.post(new Runnable(this) {
            final /* synthetic */ FavNotePostVoiceUI fTk;

            {
                this.fTk = r1;
            }

            public final void run() {
                this.fTk.findViewById(2131756972).setVisibility(0);
                this.fTk.fTh.setVisibility(0);
                this.fTk.findViewById(2131756982).setVisibility(0);
                Animation alphaAnimation = new AlphaAnimation(0.0f, 1.0f);
                alphaAnimation.setDuration(300);
                Animation translateAnimation = new TranslateAnimation(1, 0.0f, 1, 0.0f, 1, 1.0f, 1, 0.0f);
                translateAnimation.setDuration(300);
                this.fTk.fTh.startAnimation(alphaAnimation);
                this.fTk.findViewById(2131756972).startAnimation(alphaAnimation);
                this.fTk.findViewById(2131756982).startAnimation(translateAnimation);
            }
        });
    }

    private j and() {
        com.tencent.mm.compatible.b.b.qP();
        j jVar = new j();
        jVar.aVH = new j.a(this) {
            final /* synthetic */ FavNotePostVoiceUI fTk;

            {
                this.fTk = r1;
            }

            public final void onError() {
                this.fTk.exb.QI();
                this.fTk.exc.QI();
            }
        };
        return jVar;
    }

    private void ane() {
        long j = 0;
        if (this.ewV) {
            boolean z;
            this.fTa.setKeepScreenOn(true);
            this.fTa.setBackgroundResource(2130839043);
            this.fTa.setText(2131232705);
            this.fTi.pb();
            if (this.fTb != 0) {
                j = be.az(this.fTb);
            }
            this.dfS = j;
            if (this.dfS < 800) {
                z = true;
            } else {
                z = false;
            }
            this.exb.QI();
            this.exc.QI();
            if (z) {
                ang();
                this.fTa.setEnabled(false);
                this.fTa.setBackgroundResource(2130839042);
                this.fTd.setVisibility(0);
                this.fTc.setVisibility(8);
                this.exe.sendEmptyMessageDelayed(0, 500);
            } else {
                Intent intent = new Intent();
                intent.putExtra("voicepath", this.path);
                intent.putExtra("voiceduration", (int) this.dfS);
                setResult(-1, intent);
                finish();
                overridePendingTransition(0, 0);
            }
            this.ewV = false;
        }
    }

    public final void anf() {
        this.fTc.setVisibility(0);
        this.fTd.setVisibility(8);
        this.fTf.setVisibility(8);
        this.fTe.setVisibility(0);
        this.fTg.setText(2131234244);
        this.fTa.setBackgroundResource(2130839044);
        this.fTa.setText(2131232705);
        this.ewN.setVisibility(4);
        this.ewV = false;
    }

    private void ang() {
        File file = new File(this.path);
        if (file.exists()) {
            file.delete();
        }
    }

    protected void onDestroy() {
        super.onDestroy();
    }

    protected void onResume() {
        super.onResume();
    }

    protected void onPause() {
        super.onPause();
        ane();
    }

    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        if (4 != i) {
            return super.onKeyDown(i, keyEvent);
        }
        anh();
        return true;
    }

    private void anh() {
        if (!this.fTj) {
            this.fTj = true;
            Animation translateAnimation = new TranslateAnimation(1, 0.0f, 1, 0.0f, 1, 0.0f, 1, 1.0f);
            translateAnimation.setDuration(300);
            Animation alphaAnimation = new AlphaAnimation(1.0f, 0.0f);
            alphaAnimation.setDuration(300);
            translateAnimation.setAnimationListener(new AnimationListener(this) {
                final /* synthetic */ FavNotePostVoiceUI fTk;

                {
                    this.fTk = r1;
                }

                public final void onAnimationStart(Animation animation) {
                }

                public final void onAnimationRepeat(Animation animation) {
                }

                public final void onAnimationEnd(Animation animation) {
                    this.fTk.fTe.post(new Runnable(this) {
                        final /* synthetic */ AnonymousClass8 fTl;

                        {
                            this.fTl = r1;
                        }

                        public final void run() {
                            this.fTl.fTk.setResult(0);
                            this.fTl.fTk.finish();
                            this.fTl.fTk.overridePendingTransition(0, 0);
                        }
                    });
                }
            });
            findViewById(2131756972).setVisibility(8);
            findViewById(2131756982).setVisibility(8);
            this.fTh.setVisibility(8);
            this.fTh.startAnimation(alphaAnimation);
            findViewById(2131756972).startAnimation(alphaAnimation);
            findViewById(2131756982).startAnimation(translateAnimation);
        }
    }
}
