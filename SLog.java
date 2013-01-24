/**
 * Copyright (c) 2012 Edison Wang
 * All rights reserved.
 *
 * Permission is hereby granted, free  of charge, to any person obtaining
 * a  copy  of this  software  and  associated  documentation files  (the
 * "Software"), to  deal in  the Software without  restriction, including
 * without limitation  the rights to  use, copy, modify,  merge, publish,
 * distribute,  sublicense, and/or sell  copies of  the Software,  and to
 * permit persons to whom the Software  is furnished to do so, subject to
 * the following conditions:
 *
 * The  above  copyright  notice  and  this permission  notice  shall  be
 * included in all copies or substantial portions of the Software.
 *
 * THE  SOFTWARE IS  PROVIDED  "AS  IS", WITHOUT  WARRANTY  OF ANY  KIND,
 * EXPRESS OR  IMPLIED, INCLUDING  BUT NOT LIMITED  TO THE  WARRANTIES OF
 * MERCHANTABILITY,    FITNESS    FOR    A   PARTICULAR    PURPOSE    AND
 * NONINFRINGEMENT. IN NO EVENT SHALL THE AUTHORS OR COPYRIGHT HOLDERS BE
 * LIABLE FOR ANY CLAIM, DAMAGES OR OTHER LIABILITY, WHETHER IN AN ACTION
 * OF CONTRACT, TORT OR OTHERWISE,  ARISING FROM, OUT OF OR IN CONNECTION
 * WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE SOFTWARE.
 *
 */
import android.util.Log;

public class SLog {

  public static class Environment{
    public static final boolean LOGGING=true;
  }


  public static final String TAG_COMMON = "APP_DEPENDENT_TAG_FOR_USE_WITH_GREP";

  public static boolean isLoggingEnabled() {
    return Environment.LOGGING;
  }

  public static String getTag(String appTag, Class<?> clazz) {
    return appTag + "." + clazz.getName();
  }

  public static void v(String tag, String msg) {
    if (Environment.LOGGING) {
      Log.v(tag, getCallingMethod() + msg);
    }
  }

  public static void v(String tag, String format, Object arg) {
    if (Environment.LOGGING) {
      FormattingTuple ft = MessageFormatter.format(format, arg);
      Log.v(tag, getCallingMethod() + ft.getMessage());
    }
  }

  public static void v(String tag, String format, Object arg1, Object arg2) {
    if (Environment.LOGGING) {
      FormattingTuple ft = MessageFormatter.format(format, arg1, arg2);
      Log.v(tag, getCallingMethod() + ft.getMessage());
    }
  }

  public static void v(String tag, String format, Object[] args) {
    if (Environment.LOGGING) {
      FormattingTuple ft = MessageFormatter.format(format, args);
      Log.v(tag, getCallingMethod() + ft.getMessage());
    }
  }

  public static void v(String tag, String msg, Throwable throwable) {
    if (Environment.LOGGING) {
      Log.v(tag, getCallingMethod() + msg, throwable);
    }
  }

  public static void d(String tag, String msg) {
    if (Environment.LOGGING) {
      Log.d(tag, getCallingMethod() + msg);
    }
  }

  public static void d(String tag, String format, Object arg) {
    if (Environment.LOGGING) {
      FormattingTuple ft = MessageFormatter.format(format, arg);
      Log.d(tag, getCallingMethod() + ft.getMessage());
    }
  }

  public static void d(String tag, String format, Object arg1, Object arg2) {
    if (Environment.LOGGING) {
      FormattingTuple ft = MessageFormatter.format(format, arg1, arg2);
      Log.d(tag, getCallingMethod() + ft.getMessage());
    }
  }

  public static void d(String tag, String format, Object[] args) {
    if (Environment.LOGGING) {
      FormattingTuple ft = MessageFormatter.format(format, args);
      Log.d(tag, getCallingMethod() + ft.getMessage());
    }
  }

  public static void d(String tag, String msg, Throwable throwable) {
    if (Environment.LOGGING) {
      Log.d(tag, getCallingMethod() + msg, throwable);
    }
  }

  public static void i(String tag, String msg) {
    if (Environment.LOGGING) {
      Log.i(tag, getCallingMethod() + msg);
    }
  }

  public static void i(String tag, String format, Object arg) {
    if (Environment.LOGGING) {
      FormattingTuple ft = MessageFormatter.format(format, arg);
      Log.i(tag, getCallingMethod() + ft.getMessage());
    }
  }

  public static void i(String tag, String format, Object arg1, Object arg2) {
    if (Environment.LOGGING) {
      FormattingTuple ft = MessageFormatter.format(format, arg1, arg2);
      Log.i(tag, getCallingMethod() + ft.getMessage());
    }
  }

  public static void i(String tag, String format, Object[] args) {
    if (Environment.LOGGING) {
      FormattingTuple ft = MessageFormatter.format(format, args);
      Log.i(tag, getCallingMethod() + ft.getMessage());
    }
  }

  public static void i(String tag, String msg, Throwable throwable) {
    if (Environment.LOGGING) {
      Log.i(tag, getCallingMethod() + msg, throwable);
    }
  }

  public static void w(String tag, String msg) {
    if (Environment.LOGGING) {
      Log.w(tag, getCallingMethod() + msg);
    }
  }

  public static void w(String tag, String format, Object arg) {
    if (Environment.LOGGING) {
      FormattingTuple ft = MessageFormatter.format(format, arg);
      Log.w(tag, getCallingMethod() + ft.getMessage());
    }
  }

  public static void w(String tag, String format, Object[] args) {
    if (Environment.LOGGING) {
      FormattingTuple ft = MessageFormatter.format(format, args);
      Log.w(tag, getCallingMethod() + ft.getMessage());
    }
  }

  public static void w(String tag, String format, Object arg1, Object arg2) {
    if (Environment.LOGGING) {
      FormattingTuple ft = MessageFormatter.format(format, arg1, arg2);
      Log.w(tag, getCallingMethod() + ft.getMessage());
    }
  }

  public static void w(String tag, String msg, Throwable throwable) {
    if (Environment.LOGGING) {
      Log.w(tag, getCallingMethod() + msg, throwable);
    }
  }

  public static void e(String tag, String msg) {
    if (Environment.LOGGING) {
      Log.e(tag, getCallingMethod() + msg);
    }
  }

  public static void e(String tag, String format, Object arg) {
    if (Environment.LOGGING) {
      FormattingTuple ft = MessageFormatter.format(format, arg);
      Log.e(tag, getCallingMethod() + ft.getMessage());
    }
  }

  public static void e(String tag, String format, Object arg1, Object arg2) {
    if (Environment.LOGGING) {
      FormattingTuple ft = MessageFormatter.format(format, arg1, arg2);
      Log.e(tag, getCallingMethod() + ft.getMessage());
    }
  }

  public static void e(String tag, String format, Object[] args) {
    if (Environment.LOGGING) {
      FormattingTuple ft = MessageFormatter.format(format, args);
      Log.e(tag, getCallingMethod() + ft.getMessage());
    }
  }

  public static void e(String tag, String msg, Throwable throwable) {
    if (Environment.LOGGING) {
      Log.e(tag, getCallingMethod() + msg, throwable);
    }
  }

  public static void wtf(String tag, String msg) {
    if (Environment.LOGGING) {
      Log.wtf(tag, getCallingMethod() + msg);
    }
  }

  public static void wtf(String tag, String format, Object arg) {
    if (Environment.LOGGING) {
      FormattingTuple ft = MessageFormatter.format(format, arg);
      Log.wtf(tag, getCallingMethod() + ft.getMessage());
    }
  }

  public static void wtf(String tag, String format, Object arg1, Object arg2) {
    if (Environment.LOGGING) {
      FormattingTuple ft = MessageFormatter.format(format, arg1, arg2);
      Log.wtf(tag, getCallingMethod() + ft.getMessage());
    }
  }

  public static void wtf(String tag, String format, Object[] args) {
    if (Environment.LOGGING) {
      FormattingTuple ft = MessageFormatter.format(format, args);
      Log.wtf(tag, getCallingMethod() + ft.getMessage());
    }
  }

  public static void wtf(String tag, String msg, Throwable throwable) {
    if (Environment.LOGGING) {
      Log.wtf(tag, getCallingMethod() + msg, throwable);
    }
  }

  private static String getCallingMethod() {
    return Thread.currentThread().getStackTrace()[4].getMethodName() + "()" + ":"
        + Thread.currentThread().getStackTrace()[4].getLineNumber() + " > ";
  }

}
