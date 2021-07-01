package ru.netology.manager;

import ru.netology.domain.Post;

public class PostManager { // создан класс PostManager, к-ый обращается к классу Post за хар-ми (полями)
    private Post[] posts;

    public Post[] search(int ownerId, String domain, String query, int ownersOnly, int count, int offset){ // должен возвращать массив
      return null;
    }

    public void delete(int postId, int ownerId){ // ничего не возвращает
    }
}

