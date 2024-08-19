package com.adamglin.phosphoricon.phosphoricons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.adamglin.phosphoricon.phosphoricons.RegularGroup

public val RegularGroup.Towel: ImageVector
    get() {
        if (_towel != null) {
            return _towel!!
        }
        _towel = Builder(name = "Towel", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(200.0f, 24.0f)
                horizontalLineTo(72.0f)
                arcTo(24.0f, 24.0f, 0.0f, false, false, 48.0f, 48.0f)
                verticalLineTo(216.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, 16.0f, 16.0f)
                horizontalLineTo(176.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, 16.0f, -16.0f)
                verticalLineTo(48.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 16.0f, 0.0f)
                verticalLineTo(152.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 16.0f, 0.0f)
                verticalLineTo(48.0f)
                arcTo(24.0f, 24.0f, 0.0f, false, false, 200.0f, 24.0f)
                close()
                moveTo(72.0f, 40.0f)
                horizontalLineTo(177.37f)
                arcTo(23.84f, 23.84f, 0.0f, false, false, 176.0f, 48.0f)
                verticalLineTo(184.0f)
                horizontalLineTo(64.0f)
                verticalLineTo(48.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, true, 72.0f, 40.0f)
                close()
                moveTo(64.0f, 216.0f)
                verticalLineTo(200.0f)
                horizontalLineTo(176.0f)
                verticalLineToRelative(16.0f)
                close()
            }
        }
        .build()
        return _towel!!
    }

private var _towel: ImageVector? = null
