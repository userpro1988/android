/**
 * ownCloud Android client application
 *
 * @author Abel García de Prada
 * Copyright (C) 2020 ownCloud GmbH.
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License version 2,
 * as published by the Free Software Foundation.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */
package com.owncloud.android.domain.files

import com.owncloud.android.domain.BaseUseCaseWithResult
import com.owncloud.android.domain.files.model.OCFile

class RefreshFolderFromServerAsyncUseCase(
    private val fileRepository: FileRepository
) : BaseUseCaseWithResult<Unit, RefreshFolderFromServerAsyncUseCase.Params>() {
    override fun run(params: Params) = fileRepository.refreshFolder(params.remotePath)

    data class Params(val remotePath: String)

}
