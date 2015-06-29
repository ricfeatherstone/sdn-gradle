package demo.domain

import org.neo4j.ogm.annotation.GraphId
import org.neo4j.ogm.annotation.NodeEntity

@NodeEntity
class Node {

  @GraphId
  Long nodeId
  
  String name
}
