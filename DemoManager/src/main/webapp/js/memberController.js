'use strict';

var memberModule = angular.module('DOMMemberModule', []);

var memberController = function($scope) {

	$scope.greet = "Hi~!";

	$scope.greeting = function() {
		$scope.greet = $scope.greet + " memberController";
	};

};

memberController.$inject = [ '$scope' ];

memberModule.controller('DOMMemberController', memberController);
