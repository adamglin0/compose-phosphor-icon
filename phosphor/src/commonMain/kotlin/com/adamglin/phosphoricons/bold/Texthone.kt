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

public val BoldGroup.Texthone: ImageVector
    get() {
        if (_texthone != null) {
            return _texthone!!
        }
        _texthone = Builder(name = "Texthone", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(236.0f, 112.0f)
                verticalLineToRelative(96.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, -24.0f, 0.0f)
                verticalLineTo(134.42f)
                lineTo(206.66f, 138.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, -13.32f, -20.0f)
                lineToRelative(24.0f, -16.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, true, 236.0f, 112.0f)
                close()
                moveTo(144.0f, 44.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, -12.0f, 12.0f)
                verticalLineToRelative(48.0f)
                horizontalLineTo(52.0f)
                verticalLineTo(56.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, -24.0f, 0.0f)
                verticalLineTo(176.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 24.0f, 0.0f)
                verticalLineTo(128.0f)
                horizontalLineToRelative(80.0f)
                verticalLineToRelative(48.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 24.0f, 0.0f)
                verticalLineTo(56.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, false, 144.0f, 44.0f)
                close()
            }
        }
        .build()
        return _texthone!!
    }

private var _texthone: ImageVector? = null
