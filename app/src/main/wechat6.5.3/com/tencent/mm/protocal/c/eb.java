package com.tencent.mm.protocal.c;

import a.a.a.c.a;
import java.util.LinkedList;

public final class eb extends aqp {
    public int efm;
    public String meZ;
    public int mfa;
    public int mfc;
    public int mfl;

    protected final int a(int i, Object... objArr) {
        if (i == 0) {
            a aVar = (a) objArr[0];
            if (this.mPU != null) {
                aVar.dX(1, this.mPU.aHr());
                this.mPU.a(aVar);
            }
            if (this.meZ != null) {
                aVar.e(2, this.meZ);
            }
            aVar.dV(3, this.mfa);
            aVar.dV(4, this.mfl);
            aVar.dV(5, this.mfc);
            aVar.dV(6, this.efm);
            return 0;
        } else if (i == 1) {
            if (this.mPU != null) {
                r0 = a.a.a.a.dU(1, this.mPU.aHr()) + 0;
            } else {
                r0 = 0;
            }
            if (this.meZ != null) {
                r0 += a.a.a.b.b.a.f(2, this.meZ);
            }
            return (((r0 + a.a.a.a.dS(3, this.mfa)) + a.a.a.a.dS(4, this.mfl)) + a.a.a.a.dS(5, this.mfc)) + a.a.a.a.dS(6, this.efm);
        } else if (i == 2) {
            a.a.a.a.a aVar2 = new a.a.a.a.a((byte[]) objArr[0], unknownTagHandler);
            for (r0 = com.tencent.mm.ba.a.a(aVar2); r0 > 0; r0 = com.tencent.mm.ba.a.a(aVar2)) {
                if (!super.a(aVar2, this, r0)) {
                    aVar2.bQL();
                }
            }
            return 0;
        } else if (i != 3) {
            return -1;
        } else {
            a.a.a.a.a aVar3 = (a.a.a.a.a) objArr[0];
            eb ebVar = (eb) objArr[1];
            int intValue = ((Integer) objArr[2]).intValue();
            switch (intValue) {
                case 1:
                    LinkedList zQ = aVar3.zQ(intValue);
                    int size = zQ.size();
                    for (intValue = 0; intValue < size; intValue++) {
                        byte[] bArr = (byte[]) zQ.get(intValue);
                        com.tencent.mm.ba.a enVar = new en();
                        a.a.a.a.a aVar4 = new a.a.a.a.a(bArr, unknownTagHandler);
                        for (boolean z = true; z; z = enVar.a(aVar4, enVar, com.tencent.mm.ba.a.a(aVar4))) {
                        }
                        ebVar.mPU = enVar;
                    }
                    return 0;
                case 2:
                    ebVar.meZ = aVar3.pMj.readString();
                    return 0;
                case 3:
                    ebVar.mfa = aVar3.pMj.mH();
                    return 0;
                case 4:
                    ebVar.mfl = aVar3.pMj.mH();
                    return 0;
                case 5:
                    ebVar.mfc = aVar3.pMj.mH();
                    return 0;
                case 6:
                    ebVar.efm = aVar3.pMj.mH();
                    return 0;
                default:
                    return -1;
            }
        }
    }
}
