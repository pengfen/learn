<?php

/**
    分而治之 一个大任务分成多个小的子任务(map) 并行执行后 合并结果(reduce)

    Job & Task
    JobTracker
    TaskTracker
    MapTask
    ReduceTask

    JobTracker 的角色
    作业调度
    分配任务 监控任务执行进度
    监控 TaskTracker 的状态

    TaskTracker 的角色
    执行任务
    汇报任务状态

    MapReduce 的容错机制
    重复执行
    推测执行
*/