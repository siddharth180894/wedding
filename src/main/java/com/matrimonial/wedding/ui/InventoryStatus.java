package com.matrimonial.wedding.ui;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class InventoryStatus<T> {

        public ResponseEntity<Map> get100() {
            Map<String, Object> map = new HashMap<>();
            HttpStatus status = null;
            map.put("status_code", "100");
            map.put("results", "Continue!");
            map.put("message", "Everything is OK can continue with the request");
            status = HttpStatus.OK;
            return (ResponseEntity<Map>) map;
        }

        public static ResponseEntity<Map> get101() {
            Map<String, Object> map = new HashMap<>();
            HttpStatus status = null;
            map.put("status_code", "101");
            map.put("results", "Switching protocols!");
            map.put("message", "Request is being accepted for processing and server is switching protocol!");
            status = HttpStatus.SWITCHING_PROTOCOLS;
            return (ResponseEntity<Map>) map;
        }

        public ResponseEntity<Map> get102() {
            Map<String, Object> map = new HashMap<>();
            HttpStatus status = null;
            map.put("status_code", "102");
            map.put("results", "Processing!");
            map.put("message", "server has received and is processing the request, but no response is available yet!");
            status = HttpStatus.BAD_REQUEST;
            return (ResponseEntity<Map>) map;
        }

        public static ResponseEntity<Map> get103() {
            Map<String, Object> map = new HashMap<>();
            HttpStatus status = null;
            map.put("status_code", "103");
            map.put("results", "Early Hints!");
            map.put("message", " return some response headers before final HTTP message!");
            status = HttpStatus.BAD_REQUEST;
            return (ResponseEntity<Map>) map;
        }

        public static ResponseEntity<Map> get104() {
            Map<String, Object> map = new HashMap<>();
            HttpStatus status = null;
            map.put("status_code", "104");
            map.put("results", "The username or password was not correct!");
            map.put("message", " client attempted to log in, but didn’t provide valid credentials!");
            status = HttpStatus.NOT_ACCEPTABLE;
            return (ResponseEntity<Map>) map;
        }

        public static ResponseEntity<Map> get105() {
            Map<String, Object> map = new HashMap<>();
            HttpStatus status = null;
            map.put("status_code", "105");
            map.put("results", "Invalid Form Data!");
            map.put("message", " The data sent in the request had errors. One or more fields failed to validate correctly!");
            status = HttpStatus.BAD_REQUEST;
            return (ResponseEntity<Map>) map;
        }

        public static ResponseEntity<Map> get106() {
            Map<String, Object> map = new HashMap<>();
            HttpStatus status = null;
            map.put("status_code", "106");
            map.put("results", "Missing Attribute!");
            map.put("message", "One or more required attributes were missing from the request.!");
            status = HttpStatus.BAD_REQUEST;
            return (ResponseEntity<Map>) map;
        }

        public static ResponseEntity<Map> get107() {
            Map<String, Object> map = new HashMap<>();
            HttpStatus status = null;
            map.put("status_code", "107");
            map.put("results", "SSL protocol error!");
            map.put("message", "website has not enabled SSL connections or has blocked post 443!");
            status = HttpStatus.BAD_REQUEST;
            return (ResponseEntity<Map>) map;
        }

        public static ResponseEntity<Map> get108() {
            Map<String, Object> map = new HashMap<>();
            HttpStatus status = null;
            map.put("status_code", "108");
            map.put("results", "not available error!");
            map.put("message", "resource is not enabled!");
            status = HttpStatus.BAD_REQUEST;
            return (ResponseEntity<Map>) map;
        }

        public static ResponseEntity<Map> get109() {
            Map<String, Object> map = new HashMap<>();
            HttpStatus status = null;
            map.put("status_code", "109");
            map.put("results", "bad format error!");
            map.put("message", "The request was in a format that the server did not expect!");
            status = HttpStatus.BAD_REQUEST;
            return (ResponseEntity<Map>) map;
        }

        public static ResponseEntity<Map> get110() {
            Map<String, Object> map = new HashMap<>();
            HttpStatus status = null;
            map.put("status_code", "110");
            map.put("results", "Install Extension Failed!");
            map.put("message", "An unexpected error occurred when trying to install the extension.!");
            status = HttpStatus.CONFLICT;
            return (ResponseEntity<Map>) map;
        }

        public static ResponseEntity<Map> get111() {
            Map<String, Object> map = new HashMap<>();
            HttpStatus status = null;
            map.put("status_code", "111");
            map.put("results", "Duplicate Item!");
            map.put("message", "An entry for the given item or its unique key(s) already exists!");
            status = HttpStatus.CONFLICT;
            return (ResponseEntity<Map>) map;
        }

        public static ResponseEntity<Map> get112() {
            Map<String, Object> map = new HashMap<>();
            HttpStatus status = null;
            map.put("status_code", "112");
            map.put("results", "Disconnected Operation!");
            map.put("message", "The cache is intentionally disconnected from the rest of the network.");
            status = HttpStatus.FORBIDDEN;
            return (ResponseEntity<Map>) map;
        }

        public static ResponseEntity<Map> get113() {
            Map<String, Object> map = new HashMap<>();
            HttpStatus status = null;
            map.put("status_code", "113");
            map.put("results", "OAuth2 Access Denied Error!");
            map.put("message", "The OAuth2 token access for the given resource is prohibited.");
            status = HttpStatus.FORBIDDEN;
            return (ResponseEntity<Map>) map;
        }

        public static ResponseEntity<Map> get114() {
            Map<String, Object> map = new HashMap<>();
            HttpStatus status = null;
            map.put("status_code", "114");
            map.put("results", "Rate Limit Exceeded!");
            map.put("message", "The rate limit for API requests has been exceeded by this user or IP.");
            status = HttpStatus.TOO_MANY_REQUESTS;
            return (ResponseEntity<Map>) map;
        }

        public static ResponseEntity<Map> get115() {
            Map<String, Object> map = new HashMap<>();
            HttpStatus status = null;
            map.put("status_code", "114");
            map.put("results", "Rate Limit Exceeded!");
            map.put("message", "The rate limit for API requests has been exceeded by this user or IP.");
            status = HttpStatus.TOO_MANY_REQUESTS;
            return (ResponseEntity<Map>) map;
        }

        public Map<T, T> get200forClass(
                T value
        ) {
            Map<String, Object> map = new HashMap<>();
            HttpStatus status = null;
            map.put("status_code", "200");
            map.put("results", "OK!");
            map.put("message", "The request succeeded");
            map.put("data", value);
            status = HttpStatus.OK;
            map.put("status", status);
            return (Map<T, T>) map;
        }

        public ResponseEntity<Map> get200forList(
                List<T> value

        ) {
            Map<String, Object> map = new HashMap<>();
            HttpStatus status = null;
            map.put("status_code", "200");
            map.put("results", "OK!");
            map.put("message", "The request succeeded");
            map.put("data", value);
            status = HttpStatus.OK;
            return (ResponseEntity<Map>) map;
        }

//        public Map<T, T> get201forClass(T value) {
//            Map<String, Object> map = new HashMap<>();
//            HttpStatus status = null;
//            map.put("status_code", "201");
//            map.put("results", "resource was created!");
//            map.put("message", "The request has been fulfilled, resulting in the creation of a new resource");
//            map.put("data", value);
//            status = HttpStatus.CREATED;
//            map.put("status", status);
//            return (Map<T, T>) map;
//        }


    public Map<String, Object> get201forClass(T value) {
        Map<String, Object> map = new HashMap<>();

        map.put("status_code", "201");
        map.put("results", "Resource was created!");
        map.put("message",
                "The request has been fulfilled, resulting in the creation of a new resource");
        map.put("data", value);
        map.put("status", HttpStatus.CREATED);

        return map;
    }

        public static ResponseEntity<Map> get202() {
            Map<String, Object> map = new HashMap<>();
            HttpStatus status = null;
            map.put("status_code", "202");
            map.put("results", "resource was created!");
            map.put("message", "The request succeeded, and a new resource was created as a result");
            status = HttpStatus.ACCEPTED;
            return (ResponseEntity<Map>) map;
        }

        public static ResponseEntity<Map> get203forClass() {
            Map<String, Object> map = new HashMap<>();
            HttpStatus status = null;
            map.put("status_code", "203");
            map.put("results", "NON_AUTHORITATIVE_INFORMATION!");
            map.put("message", "the request was successful but the enclosed payload has been modified.");
            status = HttpStatus.NON_AUTHORITATIVE_INFORMATION;
            return (ResponseEntity<Map>) map;
        }

        public static ResponseEntity<Map> get204() {
            Map<String, Object> map = new HashMap<>();
            HttpStatus status = null;
            map.put("status_code", "204");
            map.put("results", "No Content!");
            map.put("message", "The request was successful but there was no response body");
            status = HttpStatus.NO_CONTENT;
            return (ResponseEntity<Map>) map;
        }

        public Map<T, T> get204ForClass(T value) {
            Map<String, Object> map = new HashMap<>();
            HttpStatus status = null;
            map.put("status_code", "204");
            map.put("results", "No Content!");
            map.put("message", "The server successfully processed the request, and is not returning any content");
            map.put("data", value);
            status = HttpStatus.NO_CONTENT;
            map.put("status", status);
            return (Map<T, T>) map;
        }

        public static ResponseEntity<Map> get205() {
            Map<String, Object> map = new HashMap<>();
            HttpStatus status = null;
            map.put("status_code", "205");
            map.put("results", "reset Document View!");
            map.put("message", " reset the document view,or clear the content of a form.");
            status = HttpStatus.RESET_CONTENT;
            return (ResponseEntity<Map>) map;
        }

        public static ResponseEntity<Map> get206() {
            Map<String, Object> map = new HashMap<>();
            HttpStatus status = null;
            map.put("status_code", "206");
            map.put("results", "Partial content!");
            map.put("message", "  server is successfully fulfilling a range request ");
            status = HttpStatus.PARTIAL_CONTENT;
            return (ResponseEntity<Map>) map;
        }

        //    Redirection messages
        public static ResponseEntity<Map> get300() {
            Map<String, Object> map = new HashMap<>();
            HttpStatus status = null;
            map.put("status_code", "300");
            map.put("results", "Multiple Choices!");
            map.put("message", " the request has more than one possible responses");
            status = HttpStatus.MULTIPLE_CHOICES;
            return (ResponseEntity<Map>) map;
        }

        public static ResponseEntity<Map> get301() {
            Map<String, Object> map = new HashMap<>();
            HttpStatus status = null;
            map.put("status_code", "301");
            map.put("results", "Url changed!");
            map.put("message", "the requested resource has been definitively moved to the URL given by the Location headers!");
            status = HttpStatus.MOVED_PERMANENTLY;
            return (ResponseEntity<Map>) map;
        }

        public static ResponseEntity<Map> get302() {
            Map<String, Object> map = new HashMap<>();
            HttpStatus status = null;
            map.put("status_code", "302");
            map.put("results", "page Redirected!");
            map.put("message", "The resource requested has been temporarily moved to the URL");
            status = HttpStatus.FOUND;
            return (ResponseEntity<Map>) map;
        }

        public static ResponseEntity<Map> get303() {
            Map<String, Object> map = new HashMap<>();
            HttpStatus status = null;
            map.put("status_code", "303");
            map.put("results", "page Redirected!");
            map.put("message", "the page is being redirected");
            status = HttpStatus.SEE_OTHER;
            return (ResponseEntity<Map>) map;
        }

        public static ResponseEntity<Map> get304() {
            Map<String, Object> map = new HashMap<>();
            HttpStatus status = null;
            map.put("status_code", "304");
            map.put("results", "page Redirected!");
            map.put("message", "implicit redirection to a cached resource");
            status = HttpStatus.NOT_MODIFIED;
            return (ResponseEntity<Map>) map;
        }

//        public static ResponseEntity<Map> get305() {
//            Map<String, Object> map = new HashMap<>();
//            HttpStatus status = null;
//            map.put("status_code", "305");
//            map.put("results", "use proxy to redirect!");
//            map.put("message", " the requested resource is only available through a proxy");
//            status = HttpStatus.USE_PROXY;
//            return (ResponseEntity<Map>) map;
//        }

    public static ResponseEntity<Map<String, Object>> get305() {
        Map<String, Object> map = new HashMap<>();

        map.put("status_code", "305");
        map.put("results", "Use Proxy to Redirect!");
        map.put("message",
                "The requested resource is only available through a proxy.");

        return ResponseEntity
                .status(org.springframework.http.HttpStatusCode.valueOf(305))
                .body(map);
    }

        public static ResponseEntity<Map> get307() {
            Map<String, Object> map = new HashMap<>();
            HttpStatus status = null;
            map.put("status_code", "307");
            map.put("results", "Temporary Redirected!");
            map.put("message", " The resource requested has been temporarily moved to the URL given by the Location headers.");
            status = HttpStatus.TEMPORARY_REDIRECT;
            return (ResponseEntity<Map>) map;

        }

        public static ResponseEntity<Map> get308() {
            Map<String, Object> map = new HashMap<>();
            HttpStatus status = null;
            map.put("status_code", "308");
            map.put("results", "Permanent Redirected!");
            map.put("message", " The resource requested has been Permanently moved to the URL given by the Location headers.");
            status = HttpStatus.PERMANENT_REDIRECT;
            return (ResponseEntity<Map>) map;

        }

        //    Client error responses
        public Map<T, T> get400() {
            Map<String, Object> map = new HashMap<>();
            HttpStatus status = null;
            map.put("status_code", "400");
            map.put("results", "Client Errors!");
            map.put("message", "the server cannot process the client's request because of an apparent client error.");
            status = HttpStatus.BAD_REQUEST;
            map.put("status", status);
            return (Map<T, T>) map;

        }

        public static ResponseEntity<Map> get401() {
            Map<String, Object> map = new HashMap<>();
            HttpStatus status = null;
            map.put("status_code", "401 ");
            map.put("results", "Validation Error!");
            map.put("message", " required authentication has failed or has not yet been provided by the client.");
            status = HttpStatus.UNAUTHORIZED;
            return (ResponseEntity<Map>) map;

        }

        public static ResponseEntity<Map> get402() {
            Map<String, Object> map = new HashMap<>();
            HttpStatus status = null;
            map.put("status_code", "402");
            map.put("results", "payment Required!");
            map.put("message", " required payment for redirection");
            status = HttpStatus.PAYMENT_REQUIRED;
            return (ResponseEntity<Map>) map;

        }

        public Map<T, T> get403() {
            Map<String, Object> map = new HashMap<>();
            HttpStatus status = null;
            map.put("status_code", "403");
            map.put("results", "Response Error!");
            map.put("message", " server understands the request but refuses to authorize it");
            status = HttpStatus.FORBIDDEN;
            map.put("status", status);
            return (Map<T, T>) map;

        }

        public Map<T, T> get404() {
            System.out.println("inside 404");
            Map<String, Object> map = new HashMap<>();
            HttpStatus status = null;
            map.put("status_code", "404");
            map.put("results", "No Content!");
            map.put("message", "Records Not Found or Case ID Invalid!");
            status = HttpStatus.NOT_FOUND;
            map.put("status", status);
            return (Map<T, T>) map;
        }

        public static ResponseEntity<Map> get405() {
            Map<String, Object> map = new HashMap<>();
            HttpStatus status = null;
            map.put("status_code", "405");
            map.put("results", "Method not Allowed!");
            map.put("message", "request method is not supported for the requested resource");
            status = HttpStatus.METHOD_NOT_ALLOWED;
            return (ResponseEntity<Map>) map;

        }

        public static ResponseEntity<Map> get406() {
            Map<String, Object> map = new HashMap<>();
            HttpStatus status = null;
            map.put("status_code", "406");
            map.put("results", "Not Acceptable!");
            map.put("message", "server cannot produce a response matching the list of acceptable values");
            status = HttpStatus.NOT_ACCEPTABLE;
            return (ResponseEntity<Map>) map;

        }

        public static ResponseEntity<Map> get407() {
            Map<String, Object> map = new HashMap<>();
            HttpStatus status = null;
            map.put("status_code", "407");
            map.put("results", "Proxy Authentication Required!");
            map.put("message", "request has not been applied because it lacks valid authentication credentials ");
            status = HttpStatus.PROXY_AUTHENTICATION_REQUIRED;
            return (ResponseEntity<Map>) map;

        }

        public static ResponseEntity<Map> get408() {
            Map<String, Object> map = new HashMap<>();
            HttpStatus status = null;
            map.put("status_code", "408");
            map.put("results", "Request Timeout!");
            map.put("message", "server would like to shut down this unused connection");
            status = HttpStatus.REQUEST_TIMEOUT;
            return (ResponseEntity<Map>) map;

        }

        public Map<T, T> get409() {
            Map<String, Object> map = new HashMap<>();
            HttpStatus status = null;
            map.put("status_code", "409");
            map.put("results", "Request Conflict!");
            map.put("message", " request conflict with the current target resource or Duplicate entry.");
            status = HttpStatus.CONFLICT;
            map.put("status", status);
            return (Map<T, T>) map;

        }

        public Map<T, T> get410() {
            Map<String, Object> map = new HashMap<>();
            HttpStatus status = null;
            map.put("status_code", "410");
            map.put("results", "Resource not available!");
            map.put("message", " resource requested is no longer available on the server.");
            status = HttpStatus.GONE;
            map.put("status", status);
            return (Map<T, T>) map;

        }

        public static ResponseEntity<Map> get411() {
            Map<String, Object> map = new HashMap<>();
            HttpStatus status = null;
            map.put("status_code", "411");
            map.put("results", "Content-length required!");
            map.put("message", "server refuses to accept the request without a defined Content-Length header.");
            status = HttpStatus.LENGTH_REQUIRED;
            return (ResponseEntity<Map>) map;

        }

        public static ResponseEntity<Map> get412() {
            Map<String, Object> map = new HashMap<>();
            HttpStatus status = null;
            map.put("status_code", "412");
            map.put("results", "request header field Required");
            map.put("message", "server does not meet one of the preconditions that the client put in its request header fields.");
            status = HttpStatus.PRECONDITION_FAILED;
            return (ResponseEntity<Map>) map;

        }

        public static ResponseEntity<Map> get413() {
            Map<String, Object> map = new HashMap<>();
            HttpStatus status = null;
            map.put("status_code", "413");
            map.put("results", "Retry-After");
            map.put("message", " request entity is larger than limits defined by server");
            status = HttpStatus.PAYLOAD_TOO_LARGE;
            return (ResponseEntity<Map>) map;

        }

        public static ResponseEntity<Map> get414() {
            Map<String, Object> map = new HashMap<>();
            HttpStatus status = null;
            map.put("status_code", "414");
            map.put("results", "Request-URI Too Long");
            map.put("message", " URI provided was too long for the server to process.");
            status = HttpStatus.URI_TOO_LONG;
            return (ResponseEntity<Map>) map;

        }

        public static ResponseEntity<Map> get415() {
            Map<String, Object> map = new HashMap<>();
            HttpStatus status = null;
            map.put("status_code", "415");
            map.put("results", "Unsupported Media Type");
            map.put("message", " request entity has a media type that the server or resource does not support");
            status = HttpStatus.UNSUPPORTED_MEDIA_TYPE;
            return (ResponseEntity<Map>) map;

        }

        public static ResponseEntity<Map> get416() {
            Map<String, Object> map = new HashMap<>();
            HttpStatus status = null;
            map.put("status_code", "416");
            map.put("results", "Unsupported Range");
            map.put("message", "server cannot serve the requested ranges");
            status = HttpStatus.REQUESTED_RANGE_NOT_SATISFIABLE;
            return (ResponseEntity<Map>) map;

        }

        public static ResponseEntity<Map> get417() {
            Map<String, Object> map = new HashMap<>();
            HttpStatus status = null;
            map.put("status_code", "417");
            map.put("results", "Unexpected request-header field");
            map.put("message", "server cannot meet the requirements of the Expect request-header field.");
            status = HttpStatus.EXPECTATION_FAILED;
            return (ResponseEntity<Map>) map;

        }

        public static ResponseEntity<Map> get418() {
            Map<String, Object> map = new HashMap<>();
            HttpStatus status = null;
            map.put("status_code", "418");
            map.put("results", "temporarily out of coffee ");
            map.put("message", "server refuses to brew coffee");
            status = HttpStatus.I_AM_A_TEAPOT;
            return (ResponseEntity<Map>) map;

        }

        public static ResponseEntity<Map> get419() {
            Map<String, Object> map = new HashMap<>();
            HttpStatus status = null;
            map.put("status_code", "419");
            map.put("results", "Request Failed");
            map.put("message", "session has expired while processing a post request.");
            status = HttpStatus.TOO_MANY_REQUESTS;
            return (ResponseEntity<Map>) map;

        }

        public static ResponseEntity<Map> get420() {
            Map<String, Object> map = new HashMap<>();
            HttpStatus status = null;
            map.put("status_code", "420");
            map.put("results", "Request Failed");
            map.put("message", " too many requests in a short period of time.");
            status = HttpStatus.TOO_MANY_REQUESTS;
            return (ResponseEntity<Map>) map;

        }

        public static ResponseEntity<Map> get421() {
            Map<String, Object> map = new HashMap<>();
            HttpStatus status = null;
            map.put("status_code", "421");
            map.put("results", "Request misdirected");
            map.put("message", " server that is not able to produce a response.");
            status = HttpStatus.REQUEST_TIMEOUT;
            return (ResponseEntity<Map>) map;

        }

        public Map<T, T> get422() {
            Map<String, Object> map = new HashMap<>();
            HttpStatus status = null;
            map.put("status_code", "422");
            map.put("results", "Entity Unprocessable");
            map.put("message", "request was well-formed but was unable to be followed due to semantic errors.");
            status = HttpStatus.UNPROCESSABLE_ENTITY;
            return (Map<T, T>) map;

        }

        public static ResponseEntity<Map> get423() {
            Map<String, Object> map = new HashMap<>();
            HttpStatus status = null;
            map.put("status_code", "423");
            map.put("results", "Locked Resource");
            map.put("message", "resource that is being accessed is locked.");
            status = HttpStatus.LOCKED;
            return (ResponseEntity<Map>) map;

        }

        public static ResponseEntity<Map> get424() {
            Map<String, Object> map = new HashMap<>();
            HttpStatus status = null;
            map.put("status_code", "424");
            map.put("results", "Dependency failed");
            map.put("message", "request failed due to a dependency.");
            status = HttpStatus.FAILED_DEPENDENCY;
            return (ResponseEntity<Map>) map;
        }

        public static ResponseEntity<Map> get425() {
            Map<String, Object> map = new HashMap<>();
            HttpStatus status = null;
            map.put("status_code", "425");
            map.put("results", "Request too early");
            map.put("message", "server is unwilling to risk processing a request that might be replayed.");
            status = HttpStatus.TOO_EARLY;
            return (ResponseEntity<Map>) map;
        }

        public static ResponseEntity<Map> get426() {
            Map<String, Object> map = new HashMap<>();
            HttpStatus status = null;
            map.put("status_code", "426");
            map.put("results", "protocol Upgrade Required");
            map.put("message", " client should switch to a different protocol.");
            status = HttpStatus.UPGRADE_REQUIRED;
            return (ResponseEntity<Map>) map;
        }

        public static ResponseEntity<Map> get428() {
            Map<String, Object> map = new HashMap<>();
            HttpStatus status = null;
            map.put("status_code", "428");
            map.put("results", "Required Conditional Request");
            map.put("message", "origin server requires the request to be conditional.");
            status = HttpStatus.PRECONDITION_REQUIRED;
            return (ResponseEntity<Map>) map;
        }

        public static ResponseEntity<Map> get429() {
            Map<String, Object> map = new HashMap<>();
            HttpStatus status = null;
            map.put("status_code", "429");
            map.put("results", "Too Many request");
            map.put("message", "Too many requests in a given amount of time");
            status = HttpStatus.TOO_MANY_REQUESTS;
            return (ResponseEntity<Map>) map;
        }

        public static ResponseEntity<Map> get431() {
            Map<String, Object> map = new HashMap<>();
            HttpStatus status = null;
            map.put("status_code", "431");
            map.put("results", "Request Header Too Long");
            map.put("message", "request's HTTP headers are too long.");
            status = HttpStatus.REQUEST_HEADER_FIELDS_TOO_LARGE;
            return (ResponseEntity<Map>) map;
        }

        public static ResponseEntity<Map> get451() {
            Map<String, Object> map = new HashMap<>();
            HttpStatus status = null;
            map.put("status_code", "451");
            map.put("results", "Unavailable due to Legal Reasons");
            map.put("message", "requested resource is not available due to legal reasons");
            status = HttpStatus.UNAVAILABLE_FOR_LEGAL_REASONS;
            return (ResponseEntity<Map>) map;
        }

        //       SERVER ERRORS
        public Map<T, T> get500() {
            System.out.println("Reached111");
            Map<String, Object> map = new HashMap<String, Object>();
            map.put("status_code", "500");
            map.put("results", "Internal Server Error");
            map.put("message", "Unexpected Condition Aroused!");
            HttpStatus status = HttpStatus.INTERNAL_SERVER_ERROR;
            map.put("status", status);
            return (Map<T, T>) map;
        }

        public Map<T, T> get501() {
            Map<String, Object> map = new HashMap<>();
            HttpStatus status = null;
            map.put("status_code", "501");
            map.put("results", "Do not recognize the request method");
            map.put("message", "Server does not support the functionality required to fulfill the request!");
            status = HttpStatus.NOT_IMPLEMENTED;
            map.put("status", status);
            return (Map<T, T>) map;
        }

        public Map<T, T> get502() {
            Map<String, Object> map = new HashMap<>();
            HttpStatus status = null;
            map.put("status_code", "502");
            map.put("results", "Invalid Response");
            map.put("message", "Server while acting as a gateway or proxy received an invalid response!");
            status = HttpStatus.BAD_GATEWAY;
            map.put("status", status);
            return (Map<T, T>) map;
        }

        public Map<T, T> get503() {
            Map<String, Object> map = new HashMap<>();
            HttpStatus status = null;
            map.put("status_code", "503");
            map.put("results", "Service Unavailable");
            map.put("message", "server is not ready to handle the request!");
            status = HttpStatus.SERVICE_UNAVAILABLE;
            map.put("status", status);
            return (Map<T, T>) map;
        }

        public static ResponseEntity<Map> get504() {
            Map<String, Object> map = new HashMap<>();
            HttpStatus status = null;
            map.put("status_code", "504");
            map.put("results", "Server Timeout");
            map.put("message", "Did not get a response in time from server !");
            status = HttpStatus.GATEWAY_TIMEOUT;
            return (ResponseEntity<Map>) map;
        }

        public static ResponseEntity<Map> get505() {
            Map<String, Object> map = new HashMap<>();
            HttpStatus status = null;
            map.put("status_code", "505");
            map.put("results", "Http version not supported");
            map.put("message", "HTTP version used is not supported by the server.");
            status = HttpStatus.HTTP_VERSION_NOT_SUPPORTED;
            return (ResponseEntity<Map>) map;
        }

        public static ResponseEntity<Map> get506() {
            Map<String, Object> map = new HashMap<>();
            HttpStatus status = null;
            map.put("status_code", "506");
            map.put("results", " internal server configuration error");
            map.put("message", "status code may be given in the context of Transparent Content Negotiation");
            status = HttpStatus.VARIANT_ALSO_NEGOTIATES;
            return (ResponseEntity<Map>) map;
        }

        public static ResponseEntity<Map> get507() {
            Map<String, Object> map = new HashMap<>();
            HttpStatus status = null;
            map.put("status_code", "507");
            map.put("results", "Server Storage Full");
            map.put("message", "server cannot store the representation to successfully complete the request.");
            status = HttpStatus.INSUFFICIENT_STORAGE;
            return (ResponseEntity<Map>) map;
        }

        public static ResponseEntity<Map> get508() {
            Map<String, Object> map = new HashMap<>();
            HttpStatus status = null;
            map.put("status_code", "508");
            map.put("results", "Infinite Loop");
            map.put("message", "server terminated an operation because it encountered an infinite loop while processing a request.");
            status = HttpStatus.LOOP_DETECTED;
            return (ResponseEntity<Map>) map;
        }

        public static ResponseEntity<Map> get509() {
            Map<String, Object> map = new HashMap<>();
            HttpStatus status = null;
            map.put("status_code", "509");
            map.put("results", "Bandwidth limit exceeded");
            map.put("message", " Bandwidth limit being exceeded.");
            status = HttpStatus.BANDWIDTH_LIMIT_EXCEEDED;
            return (ResponseEntity<Map>) map;
        }

        public static ResponseEntity<Map> get510() {
            Map<String, Object> map = new HashMap<>();
            HttpStatus status = null;
            map.put("status_code", "510");
            map.put("results", "Extensions Required");
            map.put("message", "Further extensions to the request are required for the server to fulfill it");
            status = HttpStatus.NOT_EXTENDED;
            return (ResponseEntity<Map>) map;
        }

        public static ResponseEntity<Map> get511() {
            Map<String, Object> map = new HashMap<>();
            HttpStatus status = null;
            map.put("status_code", "511");
            map.put("results", "Authentication Required");
            map.put("message", "Authenticate to gain network access");
            status = HttpStatus.NETWORK_AUTHENTICATION_REQUIRED;
            return (ResponseEntity<Map>) map;
        }

    }
//}
