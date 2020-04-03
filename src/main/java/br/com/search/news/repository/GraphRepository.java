
package br.com.search.news.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.search.news.model.Graph;

public interface GraphRepository extends JpaRepository<Graph, Long> {

}
