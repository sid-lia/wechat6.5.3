package com.tencent.mm.protocal.c;

import a.a.a.c.a;
import java.util.LinkedList;

public final class bew extends aqp {
    public long mqT;
    public LinkedList<bev> naH = new LinkedList();
    public long nat;

    protected final int a(int i, Object... objArr) {
        if (i == 0) {
            a aVar = (a) objArr[0];
            if (this.mPU != null) {
                aVar.dX(1, this.mPU.aHr());
                this.mPU.a(aVar);
            }
            aVar.C(2, this.nat);
            aVar.C(3, this.mqT);
            aVar.d(4, 8, this.naH);
            return 0;
        } else if (i == 1) {
            if (this.mPU != null) {
                r0 = a.a.a.a.dU(1, this.mPU.aHr()) + 0;
            } else {
                r0 = 0;
            }
            return ((r0 + a.a.a.a.B(2, this.nat)) + a.a.a.a.B(3, this.mqT)) + a.a.a.a.c(4, 8, this.naH);
        } else if (i == 2) {
            r0 = (byte[]) objArr[0];
            this.naH.clear();
            a.a.a.a.a aVar2 = new a.a.a.a.a(r0, unknownTagHandler);
            for (r0 = aqp.a(aVar2); r0 > 0; r0 = aqp.a(aVar2)) {
                if (!super.a(aVar2, this, r0)) {
                    aVar2.bQL();
                }
            }
            return 0;
        } else if (i != 3) {
            return -1;
        } else {
            a.a.a.a.a aVar3 = (a.a.a.a.a) objArr[0];
            bew com_tencent_mm_protocal_c_bew = (bew) objArr[1];
            int intValue = ((Integer) objArr[2]).intValue();
            LinkedList zQ;
            int size;
            a.a.a.a.a aVar4;
            boolean z;
            switch (intValue) {
                case 1:
                    zQ = aVar3.zQ(intValue);
                    size = zQ.size();
                    for (intValue = 0; intValue < size; intValue++) {
                        r0 = (byte[]) zQ.get(intValue);
                        en enVar = new en();
                        aVar4 = new a.a.a.a.a(r0, unknownTagHandler);
                        for (z = true; z; z = enVar.a(aVar4, enVar, aqp.a(aVar4))) {
                        }
                        com_tencent_mm_protocal_c_bew.mPU = enVar;
                    }
                    return 0;
                case 2:
                    com_tencent_mm_protocal_c_bew.nat = aVar3.pMj.mI();
                    return 0;
                case 3:
                    com_tencent_mm_protocal_c_bew.mqT = aVar3.pMj.mI();
                    return 0;
                case 4:
                    zQ = aVar3.zQ(intValue);
                    size = zQ.size();
                    for (intValue = 0; intValue < size; intValue++) {
                        r0 = (byte[]) zQ.get(intValue);
                        bev com_tencent_mm_protocal_c_bev = new bev();
                        aVar4 = new a.a.a.a.a(r0, unknownTagHandler);
                        for (z = true; z; z = com_tencent_mm_protocal_c_bev.a(aVar4, com_tencent_mm_protocal_c_bev, aqp.a(aVar4))) {
                        }
                        com_tencent_mm_protocal_c_bew.naH.add(com_tencent_mm_protocal_c_bev);
                    }
                    return 0;
                default:
                    return -1;
            }
        }
    }
}
