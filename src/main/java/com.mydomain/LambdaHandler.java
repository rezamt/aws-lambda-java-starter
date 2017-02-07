package au.com.vodafone;

// Java

// AWS

import com.mydomain.model.ServerlessResponse;
import com.amazonaws.services.lambda.runtime.Context;
import com.amazonaws.services.lambda.runtime.LambdaLogger;
import com.amazonaws.services.lambda.runtime.RequestHandler;

// Vodafone Company
import com.mydomain.model.ServerlessRequest;

import java.util.HashMap;
import java.util.Map;

/**
 * @See https://docs.aws.amazon.com/lambda/latest/dg/create-deployment-pkg-zip-java.html
 */
public class LambdaHandler implements RequestHandler<ServerlessRequest, ServerlessResponse> {

  private static final String LAMBDA_ENVIRONMENT_VARIABLE = System.getenv("LAMBDA_ENVIRONMENT_VARIABLE");


  /**
   * Lambda Event Handler
   *
   * @param input   API Gateway Request Event (Passing to Lambda)
   * @param context Lambda Execution Context Object
   * @return output API Gateway Response
   * @Configure: com.mydomain.LambdaHandler::handleRequest (package.class::method)
   */
  public ServerlessResponse handleRequest(ServerlessRequest input, Context context) {

    // Lambda Logger
    LambdaLogger logger = context.getLogger();

    logger.log("Event Received >: " + input);
    logger.log("Environment > DAS_SIEBEL_CONNECTION_TIMEOUT: " + LAMBDA_ENVIRONMENT_VARIABLE);

    ServerlessResponse out = new ServerlessResponse();

    out.setStatusCode(ServerlessResponse.Accepted);
    out.setBody("{\"status\":\"success\"}");

    Map<String, String> headers = new HashMap<String, String>();
    headers.put("Content-Type", "application/json");

    out.setHeaders(headers);

    return out;
  }

}
