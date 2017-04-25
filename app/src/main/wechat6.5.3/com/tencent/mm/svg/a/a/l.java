package com.tencent.mm.svg.a.a;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Paint.Cap;
import android.graphics.Paint.Join;
import android.graphics.Paint.Style;
import android.graphics.Path;
import android.os.Looper;
import com.tencent.mm.svg.WeChatSVGRenderC2Java;
import com.tencent.mm.svg.c;
import com.tencent.smtt.sdk.WebView;

public final class l extends c {
    private final int height = 30;
    private final int width = 30;

    protected final int j(int i, Object... objArr) {
        switch (i) {
            case 0:
                return 30;
            case 1:
                return 30;
            case 2:
                Canvas canvas = (Canvas) objArr[0];
                Looper looper = (Looper) objArr[1];
                Matrix d = c.d(looper);
                float[] c = c.c(looper);
                Paint g = c.g(looper);
                g.setFlags(385);
                g.setStyle(Style.FILL);
                Paint g2 = c.g(looper);
                g2.setFlags(385);
                g2.setStyle(Style.STROKE);
                g.setColor(WebView.NIGHT_MODE_COLOR);
                g2.setStrokeWidth(1.0f);
                g2.setStrokeCap(Cap.BUTT);
                g2.setStrokeJoin(Join.MITER);
                g2.setStrokeMiter(4.0f);
                g2.setPathEffect(null);
                c.a(g2, looper).setStrokeWidth(1.0f);
                canvas.save();
                c = c.a(c, 1.0f, 0.0f, -326.0f, 0.0f, 1.0f, -190.0f);
                d.reset();
                d.setValues(c);
                canvas.concat(d);
                canvas.restore();
                canvas.save();
                g = c.a(g, looper);
                g.setColor(-1);
                c = c.a(c, 1.0f, 0.0f, -274.0f, 0.0f, 1.0f, -83.0f);
                d.reset();
                d.setValues(c);
                canvas.concat(d);
                canvas.save();
                Paint a = c.a(g, looper);
                Path h = c.h(looper);
                h.moveTo(280.0f, 90.0f);
                h.lineTo(288.0f, 90.0f);
                h.lineTo(288.0f, 98.0f);
                h.lineTo(280.0f, 98.0f);
                h.lineTo(280.0f, 90.0f);
                h.close();
                h.moveTo(289.0f, 90.0f);
                h.lineTo(297.0f, 90.0f);
                h.lineTo(297.0f, 98.0f);
                h.lineTo(289.0f, 98.0f);
                h.lineTo(289.0f, 90.0f);
                h.close();
                h.moveTo(282.0f, 92.0f);
                h.lineTo(286.0f, 92.0f);
                h.lineTo(286.0f, 96.0f);
                h.lineTo(282.0f, 96.0f);
                h.lineTo(282.0f, 92.0f);
                h.close();
                h.moveTo(291.0f, 92.0f);
                h.lineTo(295.0f, 92.0f);
                h.lineTo(295.0f, 96.0f);
                h.lineTo(291.0f, 96.0f);
                h.lineTo(291.0f, 92.0f);
                h.close();
                h.moveTo(289.0f, 105.0f);
                h.lineTo(297.0f, 105.0f);
                h.lineTo(297.0f, 107.0f);
                h.lineTo(289.0f, 107.0f);
                h.lineTo(289.0f, 105.0f);
                h.close();
                h.moveTo(295.0f, 102.0f);
                h.lineTo(297.0f, 102.0f);
                h.lineTo(297.0f, 104.0f);
                h.lineTo(295.0f, 104.0f);
                h.lineTo(295.0f, 102.0f);
                h.close();
                h.moveTo(292.0f, 99.0f);
                h.lineTo(294.0f, 99.0f);
                h.lineTo(294.0f, 104.0f);
                h.lineTo(292.0f, 104.0f);
                h.lineTo(292.0f, 99.0f);
                h.close();
                h.moveTo(294.0f, 99.0f);
                h.lineTo(297.0f, 99.0f);
                h.lineTo(297.0f, 101.0f);
                h.lineTo(294.0f, 101.0f);
                h.lineTo(294.0f, 99.0f);
                h.close();
                h.moveTo(289.0f, 102.0f);
                h.lineTo(292.0f, 102.0f);
                h.lineTo(292.0f, 104.0f);
                h.lineTo(289.0f, 104.0f);
                h.lineTo(289.0f, 102.0f);
                h.close();
                h.moveTo(280.0f, 99.0f);
                h.lineTo(288.0f, 99.0f);
                h.lineTo(288.0f, 107.0f);
                h.lineTo(280.0f, 107.0f);
                h.lineTo(280.0f, 99.0f);
                h.close();
                h.moveTo(282.0f, 101.0f);
                h.lineTo(286.0f, 101.0f);
                h.lineTo(286.0f, 105.0f);
                h.lineTo(282.0f, 105.0f);
                h.lineTo(282.0f, 101.0f);
                h.close();
                WeChatSVGRenderC2Java.setFillType(h, 2);
                canvas.drawPath(h, a);
                canvas.restore();
                canvas.restore();
                c.f(looper);
                break;
        }
        return 0;
    }
}