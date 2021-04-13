package graphql.kickstart.servlet.context;

import graphql.kickstart.execution.context.GraphQLContext;
import java.util.List;
import java.util.Map;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.Part;

public interface GraphQLServletContext extends GraphQLContext {

  List<Part> getFileParts();

  Map<String, List<Part>> getParts();

  HttpServletRequest getHttpServletRequest();

  HttpServletResponse getHttpServletResponse();

}
