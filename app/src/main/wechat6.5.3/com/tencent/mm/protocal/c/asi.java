package com.tencent.mm.protocal.c;

import a.a.a.b;
import a.a.a.c.a;
import java.util.LinkedList;

public final class asi extends aqx {
    public String mfZ;
    public ais mga;
    public abt mgm;
    public abu mgn;

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
            if (this.mga != null) {
                aVar.dX(2, this.mga.aHr());
                this.mga.a(aVar);
            }
            if (this.mgm != null) {
                aVar.dX(3, this.mgm.aHr());
                this.mgm.a(aVar);
            }
            if (this.mgn != null) {
                aVar.dX(4, this.mgn.aHr());
                this.mgn.a(aVar);
            }
            if (this.mfZ == null) {
                return 0;
            }
            aVar.e(5, this.mfZ);
            return 0;
        } else if (i == 1) {
            if (this.mQl != null) {
                r0 = a.a.a.a.dU(1, this.mQl.aHr()) + 0;
            } else {
                r0 = 0;
            }
            if (this.mga != null) {
                r0 += a.a.a.a.dU(2, this.mga.aHr());
            }
            if (this.mgm != null) {
                r0 += a.a.a.a.dU(3, this.mgm.aHr());
            }
            if (this.mgn != null) {
                r0 += a.a.a.a.dU(4, this.mgn.aHr());
            }
            if (this.mfZ != null) {
                r0 += a.a.a.b.b.a.f(5, this.mfZ);
            }
            return r0;
        } else if (i == 2) {
            a.a.a.a.a aVar2 = new a.a.a.a.a((byte[]) objArr[0], unknownTagHandler);
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
            asi com_tencent_mm_protocal_c_asi = (asi) objArr[1];
            int intValue = ((Integer) objArr[2]).intValue();
            LinkedList zQ;
            int size;
            byte[] bArr;
            a.a.a.a.a aVar4;
            boolean z;
            switch (intValue) {
                case 1:
                    zQ = aVar3.zQ(intValue);
                    size = zQ.size();
                    for (intValue = 0; intValue < size; intValue++) {
                        bArr = (byte[]) zQ.get(intValue);
                        eo eoVar = new eo();
                        aVar4 = new a.a.a.a.a(bArr, unknownTagHandler);
                        for (z = true; z; z = eoVar.a(aVar4, eoVar, aqx.a(aVar4))) {
                        }
                        com_tencent_mm_protocal_c_asi.mQl = eoVar;
                    }
                    return 0;
                case 2:
                    zQ = aVar3.zQ(intValue);
                    size = zQ.size();
                    for (intValue = 0; intValue < size; intValue++) {
                        bArr = (byte[]) zQ.get(intValue);
                        ais com_tencent_mm_protocal_c_ais = new ais();
                        aVar4 = new a.a.a.a.a(bArr, unknownTagHandler);
                        for (z = true; z; z = com_tencent_mm_protocal_c_ais.a(aVar4, com_tencent_mm_protocal_c_ais, aqx.a(aVar4))) {
                        }
                        com_tencent_mm_protocal_c_asi.mga = com_tencent_mm_protocal_c_ais;
                    }
                    return 0;
                case 3:
                    zQ = aVar3.zQ(intValue);
                    size = zQ.size();
                    for (intValue = 0; intValue < size; intValue++) {
                        bArr = (byte[]) zQ.get(intValue);
                        abt com_tencent_mm_protocal_c_abt = new abt();
                        aVar4 = new a.a.a.a.a(bArr, unknownTagHandler);
                        for (z = true; z; z = com_tencent_mm_protocal_c_abt.a(aVar4, com_tencent_mm_protocal_c_abt, aqx.a(aVar4))) {
                        }
                        com_tencent_mm_protocal_c_asi.mgm = com_tencent_mm_protocal_c_abt;
                    }
                    return 0;
                case 4:
                    zQ = aVar3.zQ(intValue);
                    size = zQ.size();
                    for (intValue = 0; intValue < size; intValue++) {
                        bArr = (byte[]) zQ.get(intValue);
                        abu com_tencent_mm_protocal_c_abu = new abu();
                        aVar4 = new a.a.a.a.a(bArr, unknownTagHandler);
                        for (z = true; z; z = com_tencent_mm_protocal_c_abu.a(aVar4, com_tencent_mm_protocal_c_abu, aqx.a(aVar4))) {
                        }
                        com_tencent_mm_protocal_c_asi.mgn = com_tencent_mm_protocal_c_abu;
                    }
                    return 0;
                case 5:
                    com_tencent_mm_protocal_c_asi.mfZ = aVar3.pMj.readString();
                    return 0;
                default:
                    return -1;
            }
        }
    }
}
