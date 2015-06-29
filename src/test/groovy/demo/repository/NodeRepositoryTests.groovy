package demo.repository

import static org.junit.Assert.*

import org.junit.Test
import org.junit.runner.RunWith
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.test.annotation.DirtiesContext
import org.springframework.test.context.ContextConfiguration
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner

import demo.PersistenceContext
import demo.domain.Node

@ContextConfiguration(classes = [PersistenceContext])
@RunWith(SpringJUnit4ClassRunner.class)
@DirtiesContext(classMode = DirtiesContext.ClassMode.AFTER_EACH_TEST_METHOD)
class NodeRepositoryTests {

  @Autowired
  NodeRepository repo

  @Test
  void shouldBeAbleToSaveANode(){
    Node aNode = new Node(name: 'TestNode')
    repo.save(aNode)

    assertNotNull(aNode.nodeId)
  }
}
