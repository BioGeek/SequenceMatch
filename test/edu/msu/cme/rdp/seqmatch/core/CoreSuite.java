/*
 * CoreSuite.java
 * JUnit based test
 *
 * Created on April 19, 2004, 3:00 PM
 */

package edu.msu.cme.rdp.seqmatch.core;

import junit.framework.*;

/**
 *
 * @author wangqion
 */
public class CoreSuite extends TestCase {

  public CoreSuite(java.lang.String testName) {
    super(testName);
  }

  public static void main(java.lang.String[] args) {
    junit.textui.TestRunner.run(suite());
  }

  /**
   * suite method automatically generated by JUnit module
   */
  public static Test suite() {
    TestSuite suite = new TestSuite("CoreSuite");
    suite.addTest(edu.msu.cme.rdp.seqmatch.core.MatchEngineTest.suite());
    suite.addTest(edu.msu.cme.rdp.seqmatch.core.TwowayMatchTest.suite());
    suite.addTest(edu.msu.cme.rdp.seqmatch.core.SeqmatchResultSetTest.suite());
    return suite;
  }

  // TODO add test methods here, they have to start with 'test' name.
  // for example:
  // public void testHello() {}


}