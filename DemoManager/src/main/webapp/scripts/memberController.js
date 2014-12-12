'use strict';

var memberModule = angular.module('DOMMemberModule', []);

var memberController = function($scope, $http) {

	$scope.doLoginDTO = {
		userId : "",
		userPw : "",
		errorCode : "",
		errorMessage : ""
	};

	$scope.doLogin = function(token) {
		$http({
			method : 'POST',
			url : '/loginAuthProc',
			headers : {
				'X-CSRF-TOKENN' : token
			},
			data : {
				j_username : $scope.doLoginDTO.userId,
				j_password : $scope.doLoginDTO.userPw
			}
		}).success(function(data, status, headers, config) {
			// this callback will be called asynchronously
			// when the response is available
			console.log(data);
			console.log(status);
			console.log(headers);
			console.log(config);
		}).error(function(data, status, headers, config) {
			console.log(data);
		});
	};

	$scope.greet = "Hi~!";

	$scope.greeting = function() {
		$scope.greet = $scope.greet + " memberController";
	};

};

memberController.$inject = [ '$scope', '$http' ];

memberModule.controller('DOMMemberController', memberController);
