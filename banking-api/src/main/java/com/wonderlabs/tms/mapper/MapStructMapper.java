package com.wonderlabs.tms.mapper;

import com.wonderlabs.tms.dto.*;
import com.wonderlabs.tms.entity.*;
import org.mapstruct.Mapper;

@Mapper(
        componentModel = "spring"
)
public interface MapStructMapper {

    UserDTO userEntityToUserDto(
            UserEntity userEntity
    );

    UserEntity userDtoToUserEntity(
            UserDTO userDTO
    );

    AccountDTO accountEntityToAccountDto(
            AccountEntity accountEntity
    );

    AccountEntity accountDtoToAccountEntity(
            AccountDTO accountDTO
    );

    AccountTypeDTO accountTypeEntityToAccountTypeDto(
            AccountTypeEntity accountTypeEntity
    );

    AccountTypeEntity accountTypeDtoToAccountTypeEntity(
            AccountTypeDTO accountTypeDTO
    );

    AddressDTO addressEntityToAddressDto(
            AddressEntity addressEntity
    );

    AddressEntity addressDtoToAddressEntity(
            AddressDTO addressDTO
    );

    AddressTypeDTO addressTypeEntityToAddressTypeDto(
            AddressEntity addressEntity
    );

    AddressTypeEntity addressTypeDtoToAddressTypeEntity(
            AddressTypeDTO addressTypeDTO
    );

    TransactionDetailsDTO transactionDetailsEntityToTransactionDetailsDto(
            TransactionDetailsEntity transactionDetailsEntity
    );

    TransactionDetailsEntity transactionDetailsDtoToTransactionDetailsEntity(
            TransactionDetailsDTO transactionDetailsDTO
    );

    TransactionTypeDTO transactionTypeEntityToTransactionTypeDto(
            TransactionDetailsEntity transactionDetailsEntity
    );

    TransactionTypeEntity transactionTypeDtoToTransactionTypeEntity(
            TransactionTypeDTO transactionTypeDTO
    );

    TransactionStatusDTO transactionStatusEntityToTransactionStatusDto(
            TransactionStatusEntity transactionStatusEntity
    );

    TransactionStatusEntity transactionStatusDtoToTransactionStatusEntity(
            TransactionStatusDTO transactionStatusDTO
    );

    TransactionReasonDTO transactionReasonEntityToTransactionReasonDto(
            TransactionReasonEntity transactionReasonEntity
    );

    TransactionReasonEntity transactionReasonDtoToTransactionReasonEntity(
            TransactionReasonDTO transactionReasonDTO
    );
}