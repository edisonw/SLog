
public class SLogger extends SLog{

  private String tag;

  public SLogger(String appTag, Class<?> clazz) {
    this.tag = getTag(appTag, clazz);
  }

  public SLogger(Class<?> clazz) {
    this("", clazz);
  }

  /**
   * If you want to use a logger that is instantiated during class instantiation, you may omit the class name.
   * @param appTag
   */
  public SLogger(String appTag) {
    this(appTag, Thread.currentThread().getStackTrace()[4].getClass());
  }

  public SLogger() {
    this("", Thread.currentThread().getStackTrace()[4].getClass());
  }

  public void v(String msg) {
    v(tag, msg);
  }

  public void v(String format, Object arg) {
    v(tag, format, arg);
  }

  public void v(String format, Object arg1, Object arg2) {
    v(tag, format, arg1, arg2);
  }

  public void v(String format, Object[] args) {
    v(tag, format, args);
  }

  public void v(String msg, Throwable throwable) {
    v(tag, msg, throwable);
  }

  public void d(String msg) {
    d(tag, msg);
  }

  public void d(String format, Object arg) {
    d(tag, format, arg);
  }

  public void d(String format, Object arg1, Object arg2) {
    d(tag, format, arg1, arg2);
  }

  public void d(String format, Object[] args) {
    d(tag, format, args);
  }

  public void d(String msg, Throwable throwable) {
    d(tag, msg, throwable);
  }

  public void i(String msg) {
    i(tag, msg);
  }

  public void i(String format, Object arg) {
    i(tag, format, arg);
  }

  public void i(String format, Object arg1, Object arg2) {
    i(tag, format, arg1, arg2);
  }

  public void i(String format, Object[] args) {
    i(tag, format, args);
  }

  public void i(String msg, Throwable throwable) {
    i(tag, msg, throwable);
  }

  public void w(String msg) {
    w(tag, msg);
  }

  public void w(String format, Object arg) {
    w(tag, format, arg);
  }

  public void w(String format, Object[] args) {
    w(tag, format, args);
  }

  public void w(String format, Object arg1, Object arg2) {
    w(tag, format, arg1, arg2);
  }

  public void w(String msg, Throwable throwable) {
    w(tag, msg, throwable);
  }

  public void e(String msg) {
    e(tag, msg);
  }

  public void e(String format, Object arg) {
    e(tag, format, arg);
  }

  public void e(String format, Object arg1, Object arg2) {
    e(tag, format, arg1, arg2);
  }

  public void e(String format, Object[] args) {
    e(tag, format, args);
  }

  public void e(String msg, Throwable throwable) {
    e(tag, msg, throwable);
  }

  public void wtf(String msg) {
    wtf(tag, msg);
  }

  public void wtf(String format, Object arg) {
    wtf(tag, tag, format, arg);
  }

  public void wtf(String format, Object arg1, Object arg2) {
    wtf(tag, format, arg1, arg2);
  }

  public void wtf(String format, Object[] args) {
    wtf(tag, format, args);
  }

  public void wtf(String msg, Throwable throwable) {
    wtf(tag, msg, throwable);
  }
