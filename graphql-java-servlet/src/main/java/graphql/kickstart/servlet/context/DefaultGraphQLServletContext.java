package graphql.kickstart.servlet.context;

import graphql.kickstart.execution.context.DefaultGraphQLContext;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import javax.security.auth.Subject;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.Part;
import lombok.SneakyThrows;
import org.dataloader.DataLoaderRegistry;

public class DefaultGraphQLServletContext extends DefaultGraphQLContext implements
    GraphQLServletContext {

  private final HttpServletRequest httpServletRequest;
  private final HttpServletResponse httpServletResponse;

  protected DefaultGraphQLServletContext(DataLoaderRegistry dataLoaderRegistry, Subject subject,
      HttpServletRequest httpServletRequest,
      HttpServletResponse httpServletResponse) {
    super(dataLoaderRegistry, subject);
    this.httpServletRequest = httpServletRequest;
    this.httpServletResponse = httpServletResponse;
  }

  public static Builder createServletContext(DataLoaderRegistry registry, Subject subject) {
    return new Builder(registry, subject);
  }

  public static Builder createServletContext() {
    return new Builder(new DataLoaderRegistry(), null);
  }

  @Override
  public HttpServletRequest getHttpServletRequest() {
    return httpServletRequest;
  }

  @Override
  public HttpServletResponse getHttpServletResponse() {
    return httpServletResponse;
  }

  @Override
  @SneakyThrows
  public List<Part> getFileParts() {
    return httpServletRequest.getParts().stream()
        .filter(part -> part.getContentType() != null)
        .collect(Collectors.toList());
  }

  @Override
  @SneakyThrows
  public Map<String, List<Part>> getParts() {
    return httpServletRequest.getParts()
        .stream()
        .collect(Collectors.groupingBy(Part::getName));
  }

  public static class Builder {

    private HttpServletRequest httpServletRequest;
    private HttpServletResponse httpServletResponse;
    private DataLoaderRegistry dataLoaderRegistry;
    private Subject subject;

    private Builder(DataLoaderRegistry dataLoaderRegistry, Subject subject) {
      this.dataLoaderRegistry = dataLoaderRegistry;
      this.subject = subject;
    }

    public DefaultGraphQLServletContext build() {
      return new DefaultGraphQLServletContext(dataLoaderRegistry, subject, httpServletRequest,
          httpServletResponse);
    }

    public Builder with(HttpServletRequest httpServletRequest) {
      this.httpServletRequest = httpServletRequest;
      return this;
    }

    public Builder with(DataLoaderRegistry dataLoaderRegistry) {
      this.dataLoaderRegistry = dataLoaderRegistry;
      return this;
    }

    public Builder with(Subject subject) {
      this.subject = subject;
      return this;
    }

    public Builder with(HttpServletResponse httpServletResponse) {
      this.httpServletResponse = httpServletResponse;
      return this;
    }
  }
}
