 //控制层 
app.controller('usersController' ,function($scope ,userService){
	
$scope.reg=function () {
	//匹配用户两次输入的密码是否一致
    //这个方法可以不要  两次密码验证
	if ($scope.entity.password!=$scope.entity.password2){
		alert("你两次输入的密不一致，请重新输入");
        $scope.entity.password="";
        $scope.entity.password2="";
		return;
	}
	//新增
	userService.add($scope.entity).success(
		function (response) {
		alert(response.massage);
    })
}
    //发送验证码
/*    $scope.sendCode=function () {
	if ($scope.entity.phone==null){
		alert("手机号码为空")
		return ;
	}
/!*	  userService.sendCode($scope.entity.phone).success(
	  	function (response) {
		  alert(response.massage);
      })*!/*/
    //发送验证码
/*    $scope.sendCode=function () {
        if ($scope.entity.phone!=null ){
            userService.sendCode($scope.entity.phone).success(function (response) {

                alert(response.massage)//
            });
        }else {
            alert("请输入手机号");
            return ;
        }

    }*/

	

    
});	
