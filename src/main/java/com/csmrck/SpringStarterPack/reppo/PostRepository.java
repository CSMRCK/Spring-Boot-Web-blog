package com.csmrck.SpringStarterPack.reppo;

import com.csmrck.SpringStarterPack.models.Post;
import org.springframework.data.repository.CrudRepository;

public interface PostRepository extends CrudRepository<Post, Long> {

}
