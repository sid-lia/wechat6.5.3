package com.tencent.mm.protocal.c;

import com.tencent.mm.ba.a;

public final class ajh extends a {
    public int mJD;

    protected final int a(int i, Object... objArr) {
        if (i == 0) {
            ((a.a.a.c.a) objArr[0]).dV(1, this.mJD);
            return 0;
        } else if (i == 1) {
            return a.a.a.a.dS(1, this.mJD) + 0;
        } else {
            if (i == 2) {
                a.a.a.a.a aVar = new a.a.a.a.a((byte[]) objArr[0], unknownTagHandler);
                for (int a = a.a(aVar); a > 0; a = a.a(aVar)) {
                    if (!super.a(aVar, this, a)) {
                        aVar.bQL();
                    }
                }
                return 0;
            } else if (i != 3) {
                return -1;
            } else {
                a.a.a.a.a aVar2 = (a.a.a.a.a) objArr[0];
                ajh com_tencent_mm_protocal_c_ajh = (ajh) objArr[1];
                switch (((Integer) objArr[2]).intValue()) {
                    case 1:
                        com_tencent_mm_protocal_c_ajh.mJD = aVar2.pMj.mH();
                        return 0;
                    default:
                        return -1;
                }
            }
        }
    }
}
