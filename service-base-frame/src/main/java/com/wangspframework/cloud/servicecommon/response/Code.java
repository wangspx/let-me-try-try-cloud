package com.wangspframework.cloud.servicecommon.response;

import lombok.Data;

/**
 * @author spwang Created on 2019/11/29 at 10:54
 * @version 1.0.0
 */
public enum Code {
    CODE_100(100, "Continue"),
    CODE_101(101, "Switching Protocols"),
    CODE_102(102, "Processing"),

    CODE_200(200, "OK"),
    CODE_201(201, "Created"),
    CODE_202(202, "Accepted"),
    CODE_203(202, "Non-Authoritative Information"),
    CODE_204(204, "No Content"),
    CODE_205(205, "Reset Content"),
    CODE_206(206, "Partial Content"),
    CODE_207(207, "Multi-Status"),

    CODE_300(300, "Multiple Choices"),
    CODE_301(301, "Moved Permanently"),
    CODE_302(302, "Move Temporarily"),
    CODE_303(304, "See Other"),
    CODE_304(304, "Not Modified"),
    CODE_305(305, "Use Proxy"),
    CODE_306(306, "Switch Proxy"),
    CODE_307(307, "Temporary Redirect"),

    CODE_400(400, "Bad Request"),
    CODE_401(401, "Unauthorized"),
    CODE_402(402, "Payment Required"),
    CODE_403(403, "Forbidden"),
    CODE_404(404, "Not Found"),
    CODE_405(405, "Method Not Allowed"),
    CODE_406(406, "Not Acceptable"),
    CODE_407(407, "Proxy Authentication Required"),
    CODE_408(408, "Request Timeout"),
    CODE_409(409, "Conflict"),
    CODE_410(410, "Gone"),
    CODE_411(411, "Length Required"),
    CODE_412(412, "Precondition Failed"),
    CODE_413(413, "Request Entity Too Large"),
    CODE_414(414, "Request-URI Too Long"),
    CODE_415(415, "Unsupported Media Type"),
    CODE_416(416, "Requested Range Not Satisfiable"),
    CODE_417(417, "Expectation Failed"),
    CODE_418(418, "I'm a teapot"),
    CODE_421(421, "Too Many Connections"),
    CODE_422(422, "Unprocessable Entity"),
    CODE_423(423, "Locked"),
    CODE_424(424, "Failed Dependency"),
    CODE_425(425, "Too Early"),
    CODE_426(426, "Upgrade Required"),
    CODE_449(449, "Retry With"),
    CODE_451(451, "Unavailable For Legal Reasons"),

    CODE_500(500, "Internal Server Error"),
    CODE_501(501, "Not Implemented"),
    CODE_502(502, "Bad Gateway"),
    CODE_503(503, "Service Unavailable"),
    CODE_504(504, "Gateway Timeout"),
    CODE_505(505, "HTTP Version Not Supported"),
    CODE_506(506, "Variant Also Negotiates"),
    CODE_507(507, "Insufficient Storage"),
    CODE_509(509, "Bandwidth Limit Exceeded"),
    CODE_510(510, "Not Extended"),

    CODE_600(600, "Unparseable Response Headers");

    /** http状态码 */
    private Integer code;
    /** http描述信息 */
    private String message;

    Code(Integer code, String message) {
        this.code = code;
        this.message = message;
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
