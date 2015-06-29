package demo

import org.neo4j.ogm.session.Session
import org.neo4j.ogm.session.SessionFactory
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration
import org.springframework.data.neo4j.config.Neo4jConfiguration
import org.springframework.data.neo4j.repository.config.EnableNeo4jRepositories
import org.springframework.data.neo4j.server.InProcessServer
import org.springframework.data.neo4j.server.Neo4jServer
import org.springframework.transaction.annotation.EnableTransactionManagement

@Configuration
@EnableNeo4jRepositories("demo.repository")
@EnableTransactionManagement
class PersistenceContext extends Neo4jConfiguration {  
      SessionFactory getSessionFactory() {
          new SessionFactory("demo.domain");
      }
  
      @Bean
      Neo4jServer neo4jServer() {
        new InProcessServer()
      }
  
      @Bean
      Session getSession() throws Exception {
          super.getSession();
      }
}
