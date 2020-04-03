
package br.com.search.news.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort.Direction;
import org.springframework.data.web.PageableDefault;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.search.news.dto.NewsDto;
import br.com.search.news.model.News;
import br.com.search.news.repository.NewsRepository;

@RestController
@RequestMapping("/v1/news")
public class NewsController {

    @Autowired
    private NewsRepository newsRepository;

    @GetMapping
    public Page<NewsDto> listNews(
            @PageableDefault(page = 0, size = 100, direction = Direction.DESC, sort = "id") final Pageable newsPagination) {

        if (newsPagination != null) {
            final Page<News> newsResult = newsRepository.findBySearched(false, newsPagination);
            final List<News> content = newsResult.getContent();
            content.forEach(news -> {
                final Boolean searched = news.getSearched();

                if (!searched) {
                    news.setSearched(true);
                }

            });
            newsRepository.saveAll(content);
            return NewsDto.converter(newsResult);
        }

        return null;
    }

    @GetMapping("/{id}")
    public ResponseEntity<?> detailsPost(@PathVariable final Long id) {
        final Optional<News> newFound = newsRepository.findById(id);

        if (newFound.isPresent()) {
            return ResponseEntity.ok(new NewsDto(newFound.get()));
        }

        return ResponseEntity.notFound().build();
    }
}
