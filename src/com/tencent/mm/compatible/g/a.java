package com.tencent.mm.compatible.g;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.BitmapFactory.Options;

public final class a
  extends BitmapFactory
{
  private static a biv = null;
  
  /* Error */
  private static Bitmap a(Resources paramResources, int paramInt, BitmapFactory.Options paramOptions)
  {
    // Byte code:
    //   0: aconst_null
    //   1: astore_3
    //   2: aconst_null
    //   3: astore 5
    //   5: aconst_null
    //   6: astore 4
    //   8: aload_2
    //   9: invokestatic 24	com/tencent/mm/sdk/platformtools/d:a	(Landroid/graphics/BitmapFactory$Options;)V
    //   12: new 26	android/util/TypedValue
    //   15: dup
    //   16: invokespecial 29	android/util/TypedValue:<init>	()V
    //   19: astore 7
    //   21: aload_0
    //   22: iload_1
    //   23: aload 7
    //   25: invokevirtual 35	android/content/res/Resources:openRawResource	(ILandroid/util/TypedValue;)Ljava/io/InputStream;
    //   28: astore 6
    //   30: aload 6
    //   32: astore_3
    //   33: aload_0
    //   34: aload 7
    //   36: aload_3
    //   37: aconst_null
    //   38: aload_2
    //   39: invokestatic 39	com/tencent/mm/compatible/g/a:decodeResourceStream	(Landroid/content/res/Resources;Landroid/util/TypedValue;Ljava/io/InputStream;Landroid/graphics/Rect;Landroid/graphics/BitmapFactory$Options;)Landroid/graphics/Bitmap;
    //   42: astore_0
    //   43: aload_0
    //   44: astore 4
    //   46: aload_0
    //   47: ifnonnull +9 -> 56
    //   50: aload_3
    //   51: invokestatic 43	com/tencent/mm/compatible/g/a:decodeStream	(Ljava/io/InputStream;)Landroid/graphics/Bitmap;
    //   54: astore 4
    //   56: aload 4
    //   58: astore 5
    //   60: aload_3
    //   61: ifnull +11 -> 72
    //   64: aload_3
    //   65: invokevirtual 48	java/io/InputStream:close	()V
    //   68: aload 4
    //   70: astore 5
    //   72: aload 5
    //   74: ifnonnull +83 -> 157
    //   77: aload_2
    //   78: ifnull +79 -> 157
    //   81: new 50	java/lang/IllegalArgumentException
    //   84: dup
    //   85: ldc 52
    //   87: invokespecial 55	java/lang/IllegalArgumentException:<init>	(Ljava/lang/String;)V
    //   90: athrow
    //   91: astore_0
    //   92: aconst_null
    //   93: astore 4
    //   95: aload_3
    //   96: astore_0
    //   97: aload 4
    //   99: astore_3
    //   100: aload_0
    //   101: astore 5
    //   103: aload_3
    //   104: ifnull -32 -> 72
    //   107: aload_3
    //   108: invokevirtual 48	java/io/InputStream:close	()V
    //   111: aload_0
    //   112: astore 5
    //   114: goto -42 -> 72
    //   117: astore_3
    //   118: aload_0
    //   119: astore 5
    //   121: goto -49 -> 72
    //   124: astore_0
    //   125: aload 5
    //   127: astore_3
    //   128: aload_3
    //   129: ifnull +7 -> 136
    //   132: aload_3
    //   133: invokevirtual 48	java/io/InputStream:close	()V
    //   136: aload_0
    //   137: athrow
    //   138: astore_0
    //   139: aload 4
    //   141: astore_0
    //   142: goto -99 -> 43
    //   145: astore_0
    //   146: aload 4
    //   148: astore 5
    //   150: goto -78 -> 72
    //   153: astore_2
    //   154: goto -18 -> 136
    //   157: aload 5
    //   159: areturn
    //   160: astore_0
    //   161: goto -33 -> 128
    //   164: astore 4
    //   166: goto -66 -> 100
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	169	0	paramResources	Resources
    //   0	169	1	paramInt	int
    //   0	169	2	paramOptions	BitmapFactory.Options
    //   1	107	3	localObject1	Object
    //   117	1	3	localIOException	java.io.IOException
    //   127	6	3	localObject2	Object
    //   6	141	4	localObject3	Object
    //   164	1	4	localException	Exception
    //   3	155	5	localObject4	Object
    //   28	3	6	localInputStream	java.io.InputStream
    //   19	16	7	localTypedValue	android.util.TypedValue
    // Exception table:
    //   from	to	target	type
    //   12	30	91	java/lang/Exception
    //   107	111	117	java/io/IOException
    //   12	30	124	finally
    //   33	43	138	java/lang/Exception
    //   64	68	145	java/io/IOException
    //   132	136	153	java/io/IOException
    //   33	43	160	finally
    //   50	56	160	finally
    //   50	56	164	java/lang/Exception
  }
  
  public static void a(a parama)
  {
    biv = parama;
  }
  
  public static Bitmap decodeResource(Resources paramResources, int paramInt)
  {
    return decodeResource(paramResources, paramInt, null);
  }
  
  public static Bitmap decodeResource(Resources paramResources, int paramInt, BitmapFactory.Options paramOptions)
  {
    if (biv != null)
    {
      Bitmap localBitmap = biv.decodeResource(paramResources, paramInt, paramOptions);
      if (localBitmap != null) {
        return localBitmap;
      }
    }
    return a(paramResources, paramInt, paramOptions);
  }
  
  public static abstract interface a
  {
    public abstract Bitmap decodeResource(Resources paramResources, int paramInt, BitmapFactory.Options paramOptions);
  }
}

/* Location:
 * Qualified Name:     com.tencent.mm.compatible.g.a
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */