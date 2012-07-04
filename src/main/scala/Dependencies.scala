package org.boesinger

import collection.mutable
import com.detector.{Date, IpAddress}

class Dependencies {


  private var deps: mutable.HashMap[Int, List[Int]] = new mutable.HashMap[Int, List[Int]]()

  def add_direct(i: Int, input: List[Int]) {

    deps += ( i -> input)



  }


  def dependencies_for(i: Int) : List[Int] = {
      return  deps.get(i).get


  }

}
