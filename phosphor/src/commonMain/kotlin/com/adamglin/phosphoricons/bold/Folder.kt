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

public val BoldGroup.Folder: ImageVector
    get() {
        if (_folder != null) {
            return _folder!!
        }
        _folder = Builder(name = "Folder", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(216.0f, 68.0f)
                horizontalLineTo(133.39f)
                lineToRelative(-26.0f, -29.29f)
                arcToRelative(20.0f, 20.0f, 0.0f, false, false, -15.0f, -6.71f)
                horizontalLineTo(40.0f)
                arcTo(20.0f, 20.0f, 0.0f, false, false, 20.0f, 52.0f)
                verticalLineTo(200.62f)
                arcTo(19.41f, 19.41f, 0.0f, false, false, 39.38f, 220.0f)
                horizontalLineTo(216.89f)
                arcTo(19.13f, 19.13f, 0.0f, false, false, 236.0f, 200.89f)
                verticalLineTo(88.0f)
                arcTo(20.0f, 20.0f, 0.0f, false, false, 216.0f, 68.0f)
                close()
                moveTo(44.0f, 56.0f)
                horizontalLineTo(90.61f)
                lineToRelative(10.67f, 12.0f)
                horizontalLineTo(44.0f)
                close()
                moveTo(212.0f, 196.0f)
                horizontalLineTo(44.0f)
                verticalLineTo(92.0f)
                horizontalLineTo(212.0f)
                close()
            }
        }
        .build()
        return _folder!!
    }

private var _folder: ImageVector? = null
