package test
import groovy.xml.XmlParser

/**
 * A Simple Example that searches information from XML parsed by XmlParser.
 */
class GetXMLValue {
  static main(args) {
      // Read the xml file and store the data into pack
      def pack = new XmlParser().parse(new File("1.xml"))

      // define the initial variable for test and prod count
      int test = 0;
      int prod = 0;

      // Loop all the col for checking it test mode or not.
      for (int i = 0 ; i < pack.tran.col.size(); i ++)
        pack.tran.col[i].@newtablename.indexOf("_Test") == -1 ? prod ++ : test ++;

      // print the result
      print "prod = ${prod}\n"
      print "test = ${test}"
  }
}