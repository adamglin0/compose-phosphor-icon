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

public val LightGroup.Asterisksimple: ImageVector
    get() {
        if (_asterisksimple != null) {
            return _asterisksimple!!
        }
        _asterisksimple = Builder(name = "Asterisksimple", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(210.23f, 101.57f)
                lineToRelative(-72.6f, 29.0f)
                lineToRelative(51.11f, 65.71f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, -9.48f, 7.36f)
                lineTo(128.0f, 137.77f)
                lineTo(76.74f, 203.68f)
                arcToRelative(6.0f, 6.0f, 0.0f, true, true, -9.48f, -7.36f)
                lineToRelative(51.11f, -65.71f)
                lineToRelative(-72.6f, -29.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, true, true, 4.46f, -11.14f)
                lineTo(122.0f, 119.14f)
                verticalLineTo(40.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, 12.0f, 0.0f)
                verticalLineToRelative(79.14f)
                lineToRelative(71.77f, -28.71f)
                arcToRelative(6.0f, 6.0f, 0.0f, true, true, 4.46f, 11.14f)
                close()
            }
        }
        .build()
        return _asterisksimple!!
    }

private var _asterisksimple: ImageVector? = null
