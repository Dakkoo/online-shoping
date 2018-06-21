<div class="cantainer">
	<div class="row">
		<!-- would be to display  sidebar -->
		<div class="col-md-3">
			<%@ include file="./shared/sidebar.jsp"%>


		</div>
		<!-- to display actual product  -->
		<div class="col-md-9">
			<!-- Added breadcrump component -->
			<div class="row">
				<div class="col-lg-12">
					<c:if test="${userClickAllProducts == true}">
						<ol class="breadcrumb">
							<li><a href="${contextRoot}/home">Home</a></li>

							<li><a href="active">All Products</a></li>

						</ol>
					</c:if>
					
					<c:if test="${userClickCategoryProducts == true}">
						<ol class="breadcrumb">
							<li><a href="${contextRoot}/home">Home</a></li>
							<li><a href="active">Category</a></li>
							<li><a href="active">${category.name}</a></li>

						</ol>
					</c:if>
				</div>
			</div>
		</div>
	</div>
</div>