package com.tencent.mm.protocal.b;

import a.a.a.b;

public final class atr
  extends com.tencent.mm.at.a
{
  public String username;
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    if (paramInt == 0)
    {
      paramVarArgs = (a.a.a.c.a)paramVarArgs[0];
      if (username == null) {
        throw new b("Not all required fields were included: username");
      }
      if (username != null) {
        paramVarArgs.d(1, username);
      }
      return 0;
    }
    if (paramInt == 1) {
      if (username == null) {
        break label210;
      }
    }
    label210:
    for (paramInt = a.a.a.b.b.a.e(1, username) + 0;; paramInt = 0)
    {
      return paramInt;
      if (paramInt == 2)
      {
        paramVarArgs = new a.a.a.a.a((byte[])paramVarArgs[0], iTR);
        for (paramInt = com.tencent.mm.at.a.a(paramVarArgs); paramInt > 0; paramInt = com.tencent.mm.at.a.a(paramVarArgs)) {
          if (!super.a(paramVarArgs, this, paramInt)) {
            paramVarArgs.bog();
          }
        }
        if (username != null) {
          break;
        }
        throw new b("Not all required fields were included: username");
      }
      if (paramInt == 3)
      {
        a.a.a.a.a locala = (a.a.a.a.a)paramVarArgs[0];
        atr localatr = (atr)paramVarArgs[1];
        switch (((Integer)paramVarArgs[2]).intValue())
        {
        default: 
          return -1;
        }
        username = maU.readString();
        return 0;
      }
      return -1;
    }
  }
}

/* Location:
 * Qualified Name:     com.tencent.mm.protocal.b.atr
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */