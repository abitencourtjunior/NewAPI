
package br.com.search.news.repository;

import java.time.LocalDateTime;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.search.news.model.Graph;

public interface GraphRepository extends JpaRepository<Graph, Long> {

    Graph findByLocalDateTime(LocalDateTime local);

}
