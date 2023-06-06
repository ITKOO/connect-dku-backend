package kr.itkoo.connectdkubackend.service;

import kr.itkoo.connectdkubackend.dto.post.PostRequestDTO;
import kr.itkoo.connectdkubackend.dto.post.PostResponseDTO;
import kr.itkoo.connectdkubackend.model.Post;
import kr.itkoo.connectdkubackend.repository.PostRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class PostService {
    private final PostRepository postRepository;

    public PostResponseDTO findById(Long id) {
        return postRepository.findById(id).orElseThrow().toResponse();
    }

    public List<PostResponseDTO> findAll() {
        List<Post> postList = postRepository.findAll();
        return postList.stream()
                .map(Post::toResponse)
                .collect(Collectors.toList());
    }

    public PostResponseDTO save(PostRequestDTO dto) {
        return postRepository.save(dto.toPost()).toResponse();
    }
}
