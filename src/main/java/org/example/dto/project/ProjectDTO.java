package org.example.dto.project;

import com.google.gson.annotations.SerializedName;
import org.example.enums.ProjectStatus;
import jakarta.persistence.Id;
import lombok.*;

import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@Builder
@AllArgsConstructor
@ToString
public class ProjectDTO {
    @Id
    private Long id;
    @SerializedName("title")
    private String title;
    @SerializedName("description")
    private String description;
    @SerializedName("doc_path")
    private String docPath;

    private ProjectStatus status;
    @SerializedName("created_by")
    private Long createdBy;
    @SerializedName("project_column_list")
    private List<ProjectColumnDTO> projectColumnDTO;
}
