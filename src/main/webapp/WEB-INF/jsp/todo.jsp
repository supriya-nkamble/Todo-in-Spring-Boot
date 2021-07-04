<%@ include file="common/header.jsp"%>
<%@ include file="common/navigation.jsp"%>
<div class="container">
 <div class="row">
  <div class="col-md-6 col-md-offset-3 ">
   <div class="panel panel-primary">
    <div class="panel-heading">Add TODO</div>
    <div class="panel-body">
     <form:form method="post" modelAttribute="todo">
      <form:hidden path="id" />
      <fieldset class="form-group">
       <form:label path="task">Description</form:label>
       <form:input path="task" type="text" class="form-control"
        required="required" />
       <form:errors path="task" cssClass="text-warning" />
      </fieldset>

      <fieldset class="form-group">
       <form:label path="dueDate">Target Date</form:label>
       <form:input path="dueDate" type="text" class="form-control"
        required="required" />
       <form:errors path="dueDate" cssClass="text-warning" />
      </fieldset>

      <button type="submit" class="btn btn-success">Save</button>
     </form:form>
    </div>
   </div>
  </div>
 </div>
</div>
<%@ include file="common/footer.jsp"%>