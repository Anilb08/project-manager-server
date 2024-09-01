package com.prjmng.service;

import java.util.List;

import com.prjmng.exception.ChatException;
import com.prjmng.exception.ProjectException;
import com.prjmng.exception.UserException;
import com.prjmng.model.Message;

public interface MessageService {

    Message sendMessage(Long senderId, Long chatId, String content) throws UserException, ChatException, ProjectException;

    List<Message> getMessagesByProjectId(Long projectId) throws ProjectException, ChatException;
}

