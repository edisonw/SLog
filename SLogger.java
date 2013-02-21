
import android.util.Log;

public class SLogger{

  private String tag;

  public SLogger(String appTag, Class<?> clazz) {
    this.tag = SLog.getTag(appTag, clazz);
  }

  public SLogger(String appTag, String className) {
    this.tag = SLog.getTag(appTag, className);
  }

  public SLogger(Class<?> clazz) {
    this(null, clazz);
  }

  public void v(String msg) {
    if (Environment.LOGGING) {
      Log.v(tag, SLog.getCallingMethod(4) + msg);
    }
  }

  public void v(String format, Object arg) {
    if (Environment.LOGGING) {
      FormattingTuple ft = MessageFormatter.format(format, arg);
      Log.v(tag, SLog.getCallingMethod(4) + ft.getMessage());
    }
  }

  public void v(String format, Object arg1, Object arg2) {
    if (Environment.LOGGING) {
      FormattingTuple ft = MessageFormatter.format(format, arg1, arg2);
      Log.v(tag, SLog.getCallingMethod(4) + ft.getMessage());
    }
  }

  public void v(String format, Object[] args) {
    if (Environment.LOGGING) {
      FormattingTuple ft = MessageFormatter.format(format, args);
      Log.v(tag, SLog.getCallingMethod(4) + ft.getMessage());
    }
  }

  public void v(String msg, Throwable throwable) {
    if (Environment.LOGGING) {
      Log.v(tag, SLog.getCallingMethod(4) + msg, throwable);
    }
  }

  public void d(String msg) {
    if (Environment.LOGGING) {
      Log.d(tag, SLog.getCallingMethod(4) + msg);
    }
  }

  public void d(String format, Object arg) {
    if (Environment.LOGGING) {
      FormattingTuple ft = MessageFormatter.format(format, arg);
      Log.d(tag, SLog.getCallingMethod(4) + ft.getMessage());
    }
  }

  public void d(String format, Object arg1, Object arg2) {
    if (Environment.LOGGING) {
      FormattingTuple ft = MessageFormatter.format(format, arg1, arg2);
      Log.d(tag, SLog.getCallingMethod(4) + ft.getMessage());
    }
  }

  public void d(String format, Object[] args) {
    if (Environment.LOGGING) {
      FormattingTuple ft = MessageFormatter.format(format, args);
      Log.d(tag, SLog.getCallingMethod(4) + ft.getMessage());
    }
  }

  public void d(String msg, Throwable throwable) {
    if (Environment.LOGGING) {
      Log.d(tag, SLog.getCallingMethod(4) + msg, throwable);
    }
  }

  public void i(String msg) {
    if (Environment.LOGGING) {
      Log.i(tag, SLog.getCallingMethod(4) + msg);
    }
  }

  public void i(String format, Object arg) {
    if (Environment.LOGGING) {
      FormattingTuple ft = MessageFormatter.format(format, arg);
      Log.i(tag, SLog.getCallingMethod(4) + ft.getMessage());
    }
  }

  public void i(String format, Object arg1, Object arg2) {
    if (Environment.LOGGING) {
      FormattingTuple ft = MessageFormatter.format(format, arg1, arg2);
      Log.i(tag, SLog.getCallingMethod(4) + ft.getMessage());
    }
  }

  public void i(String format, Object[] args) {
    if (Environment.LOGGING) {
      FormattingTuple ft = MessageFormatter.format(format, args);
      Log.i(tag, SLog.getCallingMethod(4) + ft.getMessage());
    }
  }

  public void i(String msg, Throwable throwable) {
    if (Environment.LOGGING) {
      Log.i(tag, SLog.getCallingMethod(4) + msg, throwable);
    }
  }

  public void w(String msg) {
    if (Environment.LOGGING) {
      Log.w(tag, SLog.getCallingMethod(4) + msg);
    }
  }

  public void w(String format, Object arg) {
    if (Environment.LOGGING) {
      FormattingTuple ft = MessageFormatter.format(format, arg);
      Log.w(tag, SLog.getCallingMethod(4) + ft.getMessage());
    }
  }

  public void w(String format, Object[] args) {
    if (Environment.LOGGING) {
      FormattingTuple ft = MessageFormatter.format(format, args);
      Log.w(tag, SLog.getCallingMethod(4) + ft.getMessage());
    }
  }

  public void w(String format, Object arg1, Object arg2) {
    if (Environment.LOGGING) {
      FormattingTuple ft = MessageFormatter.format(format, arg1, arg2);
      Log.w(tag, SLog.getCallingMethod(4) + ft.getMessage());
    }
  }

  public void w(String msg, Throwable throwable) {
    if (Environment.LOGGING) {
      Log.w(tag, SLog.getCallingMethod(4) + msg, throwable);
    }
  }

  public void e(String msg) {
    if (Environment.LOGGING) {
      Log.e(tag, SLog.getCallingMethod(4) + msg);
    }
  }

  public void e(String format, Object arg) {
    if (Environment.LOGGING) {
      FormattingTuple ft = MessageFormatter.format(format, arg);
      Log.e(tag, SLog.getCallingMethod(4) + ft.getMessage());
    }
  }

  public void e(String format, Object arg1, Object arg2) {
    if (Environment.LOGGING) {
      FormattingTuple ft = MessageFormatter.format(format, arg1, arg2);
      Log.e(tag, SLog.getCallingMethod(4) + ft.getMessage());
    }
  }

  public void e(String format, Object[] args) {
    if (Environment.LOGGING) {
      FormattingTuple ft = MessageFormatter.format(format, args);
      Log.e(tag, SLog.getCallingMethod(4) + ft.getMessage());
    }
  }

  public void e(String msg, Throwable throwable) {
    if (Environment.LOGGING) {
      Log.e(tag, SLog.getCallingMethod(4) + msg, throwable);
    }
  }

  public void wtf(String msg) {
    if (Environment.LOGGING) {
      Log.wtf(tag, SLog.getCallingMethod(4) + msg);
    }
  }

  public void wtf(String format, Object arg) {
    if (Environment.LOGGING) {
      FormattingTuple ft = MessageFormatter.format(format, arg);
      Log.wtf(tag, SLog.getCallingMethod(4) + ft.getMessage());
    }
  }

  public void wtf(String format, Object arg1, Object arg2) {
    if (Environment.LOGGING) {
      FormattingTuple ft = MessageFormatter.format(format, arg1, arg2);
      Log.wtf(tag, SLog.getCallingMethod(4) + ft.getMessage());
    }
  }

  public void wtf(String format, Object[] args) {
    if (Environment.LOGGING) {
      FormattingTuple ft = MessageFormatter.format(format, args);
      Log.wtf(tag, SLog.getCallingMethod(4) + ft.getMessage());
    }
  }

  public void wtf(String msg, Throwable throwable) {
    if (Environment.LOGGING) {
      Log.wtf(tag, SLog.getCallingMethod(4) + msg, throwable);
    }
  }

}
