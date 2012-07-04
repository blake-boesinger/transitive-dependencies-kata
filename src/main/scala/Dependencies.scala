package org.boesinger

import collection.mutable
import com.detector.{Date, IpAddress}

class Dependencies {


  private var deps: mutable.HashMap[Int, List[Int]] = new mutable.HashMap[Int, List[Int]]()

  def add_direct(i: Int, input: List[Int]) {

    deps += ( i -> input)



  }


  def directDependenciesFor( i : Int ) = {
    deps.get(i).getOrElse(List())

  }


  def dependencies_for(i: Int) : List[Int] = {
      val direct = directDependenciesFor(i)
    return direct.map(  y =>   y ::     dependencies_for(y)     ).flatten.distinct.sortWith( (x, y) => x < y)





  }

}
