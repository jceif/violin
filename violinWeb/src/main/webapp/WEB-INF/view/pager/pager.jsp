<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<c:if test="${page!=null}">
    <table class="gridtable" style="width:100%;text-align: center;">
        <tr>
            <c:if test="${pageInfo.hasPreviousPage}">
                <td>
                    <a href="${pageContext.request.contextPath}/${controllerName}/list?page=${pageInfo.prePage}&rows=${pageInfo.pageSize}">前一页</a>
                </td>
            </c:if>
            <c:forEach items="${pageInfo.navigatepageNums}" var="nav">
                <c:if test="${nav == pageInfo.pageNum}">
                    <td style="font-weight: bold;">${nav}</td>
                </c:if>
                <c:if test="${nav != pageInfo.pageNum}">
                    <td>
                        <a href="${pageContext.request.contextPath}/${controllerName}/list?page=${nav}&rows=${pageInfo.pageSize}">${nav}</a>
                    </td>
                </c:if>
            </c:forEach>
            <c:if test="${pageInfo.hasNextPage}">
                <td>
                    <a href="${pageContext.request.contextPath}/${controllerName}/list?page=${pageInfo.nextPage}&rows=${pageInfo.pageSize}">下一页</a>
                </td>
            </c:if>
        </tr>
    </table>
</c:if>

<script>
    function

</script>

<%--
&countryname=${queryParam.countryname}&countrycode=${queryParam.countrycode}--%>
