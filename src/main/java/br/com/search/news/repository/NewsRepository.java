
package br.com.search.news.repository;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

import br.com.search.news.model.News;

public interface NewsRepository extends JpaRepository<News, Long> {
	
	Page<News> findBySearched(boolean status, Pageable postPagination);
	News findByTitle(String title);
}
