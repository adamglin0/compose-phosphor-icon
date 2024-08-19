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

public val BoldGroup.Texthfour: ImageVector
    get() {
        if (_texthfour != null) {
            return _texthfour!!
        }
        _texthfour = Builder(name = "Texthfour", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(156.0f, 56.0f)
                lineTo(156.0f, 176.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, -24.0f, 0.0f)
                lineTo(132.0f, 128.0f)
                lineTo(52.0f, 128.0f)
                verticalLineToRelative(48.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, -24.0f, 0.0f)
                lineTo(28.0f, 56.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, 24.0f, 0.0f)
                verticalLineToRelative(48.0f)
                horizontalLineToRelative(80.0f)
                lineTo(132.0f, 56.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, 24.0f, 0.0f)
                close()
                moveTo(256.0f, 184.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, -12.0f, 12.0f)
                verticalLineToRelative(12.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, -24.0f, 0.0f)
                lineTo(220.0f, 196.0f)
                lineTo(180.0f, 196.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, -9.73f, -19.0f)
                lineToRelative(52.0f, -72.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, true, 244.0f, 112.0f)
                verticalLineToRelative(60.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, true, 256.0f, 184.0f)
                close()
                moveTo(220.0f, 149.11f)
                lineTo(203.47f, 172.0f)
                lineTo(220.0f, 172.0f)
                close()
            }
        }
        .build()
        return _texthfour!!
    }

private var _texthfour: ImageVector? = null
