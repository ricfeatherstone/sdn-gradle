package demo.repository

import org.springframework.data.neo4j.repository.GraphRepository
import demo.domain.Node


interface NodeRepository extends GraphRepository<Node>{
}
