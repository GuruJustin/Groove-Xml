package test
import groovy.xml.XmlParser

/**
 * A Simple Example that searches information from XML parsed by XmlParser.
 */
class Test {
  static main(args) {
      def pack = new XmlParser().parse(new File("1.xml"))
      // for (int i = 0 ; i < pack.)
      int test = 0;
      int prod = 0;
      // println "${pack}"
      // println "${pack.tran.col.size()}"
      for (int i = 0 ; i < pack.tran.col.size(); i ++) {
        // println "${pack.tran.col[i].@newtablename}"
        // if (pack.tran.col[i].@newtablename.indexOf("_Test") == -1)
        //   prod ++
        // else test ++

        pack.tran.col[i].@newtablename.indexOf("_Test") == -1 ? prod ++ : test ++;
      }
      print "prod = ${prod}\n"
      print "test = ${test}"
      // def pretty = prettyPrint(pack)
      // print "${pretty}";
  }
}