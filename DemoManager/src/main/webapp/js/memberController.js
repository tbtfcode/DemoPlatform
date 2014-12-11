'use strict';

var memberModule = angular.module('DOMMemberModule', []);

var memberController = function($scope, $http) {

/*
	$scope.user = {
		id : "",
		pw : ""
	};

	$scope.doLogin = function() {
		$http.post('/loginAuthentication', {
			userId : $scope.user.id,
			userPw : $scope.user.pw
		}).success(function(data, status, headers, config) {
			// this callback will be called asynchronously
			// when the response is available
			console.log(data);
			console.log(status);
			console.log(headers);
			console.log(config);
		}).error(function(data, status, headers, config) {
			// called asynchronously if an error occurs
			// or server returns response with an error status.
			console.log(data);
			console.log(status);
			console.log(headers);
			console.log(config);
		});
	};
*/
	$scope.greet = "Hi~!";

	$scope.greeting = function() {
		$scope.greet = $scope.greet + " memberController";
	};

};

memberController.$inject = [ '$scope', '$http' ];

memberModule.controller('DOMMemberController', memberController);
