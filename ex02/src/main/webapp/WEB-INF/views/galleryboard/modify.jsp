<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.6.0/jquery.min.js"></script>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ include file="../includes/header.jsp" %>

        <!-- Content Wrapper -->
        <div id="content-wrapper" class="d-flex flex-column">

            <!-- Main Content -->
            <div id="content">
            
            <!-- Topbar 제일 상단 검색 부분은 필요없어서 생략 -->

                <!-- Begin Page Content -->
                <div class="container-fluid">

                    <!-- Page Heading -->
                    <h1 class="h3 mb-2 text-gray-800">Tables</h1>
                    <p class="mb-4">DataTables is a third party plugin that is used to generate the demo table below.
                        For more information about DataTables, please visit the <a target="_blank"
                            href="https://datatables.net">official DataTables documentation</a>
                    </p>
                    
					<h2>갤러리 수정 페이지 입니다.</h2>
					
					<form class="galleryboard" action="/galleryboard/modify" method="post">
			    	<div class="form-group row">
			            <div class="col-sm-12">
			            	<input type="hidden" name="gno" value="${board.gno}" />
			                 <input type="text" class="form-control" id="exampleFirstName"
			                        value="${board.title}" placeholder="제목" name="title" required>
			            </div>
			        	<div class="col-sm-12">
			            	<input type="text" class="form-control" id="exampleLastName"
			                         value="${board.writer}" placeholder="글쓴이" name="writer" required>
			        	</div>
			        	<div class="col-sm-12">
			        		<select name="category">
			        			<option>종류</option>
			        			<option value="all">all</option>
			        			<option value="cat">cat</option>
			        			<option value="dog">dog</option>
			        		</select>
			        	</div>
			        	<div class="col-sm-12">
			        		<div class="panel panel-default">
							<div class="panel-heading">파일 첨부</div>
							<div class="panel-body">
								<div class="uploadDiv">
									<input type="file" name="uploadFile" />
								</div>
								<div class="uploadResult">
									<img src="/display?fileName=${board.fullname}" width="100" />
								</div>
							</div>
			        	</div>
			        	<div class="col-sm-12">
			        		<textarea rows="" cols="" id="exampleLastName" class="form-control"
			        		name="content" required>${board.content}</textarea>
			        	</div>
			      
			       	</div>
			       	<div class="form-group">
			        	<button type=submit class="btn btn-primary btn-user">등록</button>
						<button type=reset class="btn btn-primary btn-user">취소</button>
			        </div>      	
				</form>
					
			</div>
		</div>
		
	<script>
		$(document).ready(function() {
			
			// input태그 중 type이 있으면 file요소 선택 
			// 요소의 변경이 있으면 콜백함수 실행 
			$("input[type='file']").change(function() {
				// 가상의 폼을 생성 (폼태그)
				let formData = new FormData();
				let inputFile = $("input[name='uploadFile']");
				let files = inputFile[0].files;
				
				for(let i=0; i<files.length; i++) {
					formData.append("uploadFile", files[i]);
				}
				
				$.ajax({
					url: '/uploadAjaxAction',
					processData: false,
					contentType: false,
					data: formData,
					type: 'POST',
					dataType: 'json',
					success: function(result) {
						console.log(result);
						showUploadResult(result);
					}
				})
			})
			
			function showUploadResult(uploadResultArr) {
				// 결과 배열이 null이거나 길이가 0이면 함수 종료
				if(!uploadResultArr || uploadResultArr.length==0) { return; }
				let uploadul = $(".uploadResult");
				let str = "";
				$(uploadResultArr).each(function(i, obj) {
					console.log(obj);
					let fileCallpath = encodeURIComponent(obj.uploadPath+"/s_"+obj.uuid+"_"+obj.fileName);
					let filePullpath = encodeURIComponent(obj.uploadPath+"\\"+obj.uuid+"_"+obj.fileName);
					
					str += "<p data-path='"+obj.uploadPath+"' data-filename='"+obj.uuid+"_"+obj.fileName+"'"
					+ "data-fullname='"+filePullpath+"'>"
					+ "<img src='/display?fileName="+fileCallpath+"'/>"		
					+ "</p>";
				})
				uploadul.html(str);
			}
			
			// 전송 버튼 클릭 시 실행
			$("button[type='submit']").on("click", function(e) {
				// 연결된 이벤트 제거 (submit 전송 제거)
				e.preventDefault();
				
				// 폼 선택
				let formObj = $("form.galleryboard");
				let imgp = $(".uploadResult p");
				let inputstr = "";
				inputstr += "<input type='hidden' name='fileName' value='"+imgp.data("filename")+"' />"; 
				inputstr += "<input type='hidden' name='fullname' value='"+imgp.data("fullname")+"' />"; 
				inputstr += "<input type='hidden' name='uploadPath' value='"+imgp.data("path")+"' />"; 
				formObj.append(inputstr).submit();
			})
		})
		
	</script>		

<%@ include file="../includes/footer.jsp" %>