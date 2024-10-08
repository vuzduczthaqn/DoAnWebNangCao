package wint.webchat.modelDTO.reponse;

import lombok.*;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class ApiResponse<T> {
    private T data;
    private int code;
    private Map<String,String> error=new TreeMap<>();
    public static<T>ApiResponse<T>createResponse(){
        return null;
    };
}
