package com.tencent.mm.plugin.voip;

import com.tencent.mm.model.ag;
import com.tencent.mm.plugin.voip.a.a;
import com.tencent.mm.plugin.voip.model.d;
import com.tencent.mm.pluginsdk.c.b;
import com.tencent.mm.pluginsdk.c.c;
import com.tencent.mm.pluginsdk.i;

public final class Plugin implements c {
    public final i createApplication() {
        return new a();
    }

    public final b getContactWidgetFactory() {
        return null;
    }

    public final ag createSubCore() {
        return new d();
    }
}
