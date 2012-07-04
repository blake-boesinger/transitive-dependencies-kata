package org.boesinger

import org.junit.Assert._

class TransitiveDependencyTest {


  def testBasic {
      val dep : Dependencies = new Dependencies()
      dep.add_direct(1,List( 2, 3) )
      dep.add_direct(2,List( 3, 5) )
      dep.add_direct(3,List( 7) )
      dep.add_direct(4,List( 1, 6) )
      dep.add_direct(5,List( 6) )
      dep.add_direct(6,List( 8, 3)  )
      



      assertEquals( List( 2, 3, 5, 6, 7, 8 ),   dep.dependencies_for(1))
      assertEquals( List( 3, 5, 6, 7, 8 ),     dep.dependencies_for(2))
      assertEquals( List( 7 ),             dep.dependencies_for(3))
      assertEquals( List( 1, 2, 3, 5, 6, 7, 8 ), dep.dependencies_for(4))
      assertEquals( List(7, 8  ),           dep.dependencies_for(5))
      assertEquals( List( 8 ),             dep.dependencies_for(6))
  }

}
