'use strict';

var memberModule = angular.module('DOMMemberModule', []);

var memberController = function($scope, $http, $location) {
/*
	$scope.doLoginDTO = {
		j_username : "",
		j_password : "",
		errorCode : "",
		errorMessage : ""
	};

	$scope.doLogin = function() {
		$http({
			url : '/j_spring_security_check',
			method : 'POST',
			data : $scope.doLoginDTO {
				j_username : $scope.doLoginDTO.userId,
				j_password : $scope.doLoginDTO.userPw
			}
		}).success(function(data, status, headers, config) {
			console.log(data);
		}).error(function(data, status, headers, config) {
			console.log(data);
		});
	};

	$scope.doLogout = function(token) {
		$http({
			url : '/logout.do',
			method : 'POST'
		}).success(function(data, status, headers, config) {
			console.log(data);
		}).error(function(data, status, headers, config) {
			console.log(data);
		});
	}
*/
	$scope.greet = "Hi~!";

	$scope.greeting = function() {
		$scope.greet = $scope.greet + " memberController";
	};

};

memberController.$inject = [ '$scope', '$http', '$location' ];

memberModule.controller('DOMMemberController', memberController);
