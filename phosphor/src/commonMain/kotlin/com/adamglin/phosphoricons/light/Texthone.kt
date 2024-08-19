package com.adamglin.phosphoricons.light

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.adamglin.phosphoricons.LightGroup

public val LightGroup.Texthone: ImageVector
    get() {
        if (_texthone != null) {
            return _texthone!!
        }
        _texthone = Builder(name = "Texthone", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(230.0f, 112.0f)
                verticalLineToRelative(96.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, -12.0f, 0.0f)
                verticalLineTo(123.21f)
                lineTo(203.33f, 133.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, -6.66f, -10.0f)
                lineToRelative(24.0f, -16.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, 9.33f, 5.0f)
                close()
                moveTo(144.0f, 50.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, -6.0f, 6.0f)
                verticalLineToRelative(54.0f)
                horizontalLineTo(46.0f)
                verticalLineTo(56.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, -12.0f, 0.0f)
                verticalLineTo(176.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 12.0f, 0.0f)
                verticalLineTo(122.0f)
                horizontalLineToRelative(92.0f)
                verticalLineToRelative(54.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 12.0f, 0.0f)
                verticalLineTo(56.0f)
                arcTo(6.0f, 6.0f, 0.0f, false, false, 144.0f, 50.0f)
                close()
            }
        }
        .build()
        return _texthone!!
    }

private var _texthone: ImageVector? = null
