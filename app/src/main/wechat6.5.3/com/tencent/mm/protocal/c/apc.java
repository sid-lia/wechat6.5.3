package com.tencent.mm.protocal.c;

import a.a.a.b;
import a.a.a.c.a;
import java.util.LinkedList;

public final class apc extends aqx {
    public int eOX;
    public int lZm;
    public LinkedList<apa> mbB = new LinkedList();
    public String mpB;

    protected final int a(int i, Object... objArr) {
        if (i == 0) {
            a aVar = (a) objArr[0];
            if (this.mQl == null) {
                throw new b("Not all required fields were included: BaseResponse");
            }
            if (this.mQl != null) {
                aVar.dX(1, this.mQl.aHr());
                this.mQl.a(aVar);
            }
            if (this.mpB != null) {
                aVar.e(2, this.mpB);
            }
            aVar.dV(3, this.lZm);
            aVar.dV(4, this.eOX);
            aVar.d(5, 8, this.mbB);
            return 0;
        } else if (i == 1) {
            if (this.mQl != null) {
                r0 = a.a.a.a.dU(1, this.mQl.aHr()) + 0;
            } else {
                r0 = 0;
            }
            if (this.mpB != null) {
                r0 += a.a.a.b.b.a.f(2, this.mpB);
            }
            return ((r0 + a.a.a.a.dS(3, this.lZm)) + a.a.a.a.dS(4, this.eOX)) + a.a.a.a.c(5, 8, this.mbB);
        } else if (i == 2) {
            r0 = (byte[]) objArr[0];
            this.mbB.clear();
            a.a.a.a.a aVar2 = new a.a.a.a.a(r0, unknownTagHandler);
            for (r0 = aqx.a(aVar2); r0 > 0; r0 = aqx.a(aVar2)) {
                if (!super.a(aVar2, this, r0)) {
                    aVar2.bQL();
                }
            }
            if (this.mQl != null) {
                return 0;
            }
            throw new b("Not all required fields were included: BaseResponse");
        } else if (i != 3) {
            return -1;
        } else {
            a.a.a.a.a aVar3 = (a.a.a.a.a) objArr[0];
            apc com_tencent_mm_protocal_c_apc = (apc) objArr[1];
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
                        eo eoVar = new eo();
                        aVar4 = new a.a.a.a.a(r0, unknownTagHandler);
                        for (z = true; z; z = eoVar.a(aVar4, eoVar, aqx.a(aVar4))) {
                        }
                        com_tencent_mm_protocal_c_apc.mQl = eoVar;
                    }
                    return 0;
                case 2:
                    com_tencent_mm_protocal_c_apc.mpB = aVar3.pMj.readString();
                    return 0;
                case 3:
                    com_tencent_mm_protocal_c_apc.lZm = aVar3.pMj.mH();
                    return 0;
                case 4:
                    com_tencent_mm_protocal_c_apc.eOX = aVar3.pMj.mH();
                    return 0;
                case 5:
                    zQ = aVar3.zQ(intValue);
                    size = zQ.size();
                    for (intValue = 0; intValue < size; intValue++) {
                        r0 = (byte[]) zQ.get(intValue);
                        apa com_tencent_mm_protocal_c_apa = new apa();
                        aVar4 = new a.a.a.a.a(r0, unknownTagHandler);
                        for (z = true; z; z = com_tencent_mm_protocal_c_apa.a(aVar4, com_tencent_mm_protocal_c_apa, aqx.a(aVar4))) {
                        }
                        com_tencent_mm_protocal_c_apc.mbB.add(com_tencent_mm_protocal_c_apa);
                    }
                    return 0;
                default:
                    return -1;
            }
        }
    }
}
