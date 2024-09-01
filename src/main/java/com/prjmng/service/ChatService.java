package com.prjmng.service;

import java.util.List;

import com.prjmng.exception.ChatException;
import com.prjmng.exception.ProjectException;
import com.prjmng.model.Chat;

public interface ChatService {

	Chat createChat(Chat chat) ;

	//Chat getChatsByProjectId(Long projectId) throws ChatException, ProjectException;

//	Chat addUsersToChat(Long chatId, List<Long> userIds) throws ChatException;

	
//	 List<Chat> searchChatsByName(String name) throws ChatException;

	// Other methods as needed
}
