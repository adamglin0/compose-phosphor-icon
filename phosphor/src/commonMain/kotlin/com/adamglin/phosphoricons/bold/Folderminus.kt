package com.adamglin.phosphoricons.bold

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.adamglin.phosphoricons.BoldGroup

public val BoldGroup.FolderMinus: ImageVector
    get() {
        if (_folderMinus != null) {
            return _folderMinus!!
        }
        _folderMinus = Builder(name = "FolderMinus", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(92.0f, 144.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, 12.0f, -12.0f)
                horizontalLineToRelative(48.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, 0.0f, 24.0f)
                horizontalLineTo(104.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, true, 92.0f, 144.0f)
                close()
                moveTo(236.0f, 88.0f)
                verticalLineTo(200.89f)
                arcTo(19.13f, 19.13f, 0.0f, false, true, 216.89f, 220.0f)
                horizontalLineTo(39.38f)
                arcTo(19.41f, 19.41f, 0.0f, false, true, 20.0f, 200.62f)
                verticalLineTo(52.0f)
                arcTo(20.0f, 20.0f, 0.0f, false, true, 40.0f, 32.0f)
                horizontalLineTo(92.41f)
                arcToRelative(20.0f, 20.0f, 0.0f, false, true, 15.0f, 6.71f)
                lineToRelative(26.0f, 29.29f)
                horizontalLineTo(216.0f)
                arcTo(20.0f, 20.0f, 0.0f, false, true, 236.0f, 88.0f)
                close()
                moveTo(44.0f, 68.0f)
                horizontalLineToRelative(57.28f)
                lineTo(90.61f, 56.0f)
                horizontalLineTo(44.0f)
                close()
                moveTo(212.0f, 92.0f)
                horizontalLineTo(44.0f)
                verticalLineTo(196.0f)
                horizontalLineTo(212.0f)
                close()
            }
        }
        .build()
        return _folderMinus!!
    }

private var _folderMinus: ImageVector? = null
