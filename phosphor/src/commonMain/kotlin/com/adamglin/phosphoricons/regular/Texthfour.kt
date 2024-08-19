package com.adamglin.phosphoricons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.adamglin.phosphoricons.RegularGroup

public val RegularGroup.Texthfour: ImageVector
    get() {
        if (_texthfour != null) {
            return _texthfour!!
        }
        _texthfour = Builder(name = "Texthfour", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(152.0f, 56.0f)
                lineTo(152.0f, 176.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -16.0f, 0.0f)
                lineTo(136.0f, 124.0f)
                lineTo(48.0f, 124.0f)
                verticalLineToRelative(52.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -16.0f, 0.0f)
                lineTo(32.0f, 56.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 16.0f, 0.0f)
                verticalLineToRelative(52.0f)
                horizontalLineToRelative(88.0f)
                lineTo(136.0f, 56.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 16.0f, 0.0f)
                close()
                moveTo(256.0f, 184.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -8.0f, 8.0f)
                horizontalLineToRelative(-8.0f)
                verticalLineToRelative(16.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -16.0f, 0.0f)
                lineTo(224.0f, 192.0f)
                lineTo(176.0f, 192.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -6.31f, -12.91f)
                lineToRelative(56.0f, -72.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, true, 240.0f, 112.0f)
                verticalLineToRelative(64.0f)
                horizontalLineToRelative(8.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, true, 256.0f, 184.0f)
                close()
                moveTo(224.0f, 135.32f)
                lineTo(192.36f, 176.0f)
                lineTo(224.0f, 176.0f)
                close()
            }
        }
        .build()
        return _texthfour!!
    }

private var _texthfour: ImageVector? = null
