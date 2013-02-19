Simple Android Logging
====
After iterating through many of my Android projects and seeing how other companies do it, I came up with this logging framework.


* Fully LogCat compatible, all you need is to add an S in front of Log.
* High Performance: Unified Pre-(Debug Flag Checking), or fork to fit your needs. 
* SL4J Styles: Object/Arrays as parameters.
* Support global app tag. 
* Display method/line/class name for easy tracing. 
* light weight and has 0 dependencies. 
* Install: 1. Drop in the three files into a package. 2. use it by replacing Log with SLog. 
* Or if you want to use a cached logger, just new SLogger() during object instantiation. 
