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

public val LightGroup.Ghost: ImageVector
    get() {
        if (_ghost != null) {
            return _ghost!!
        }
        _ghost = Builder(name = "Ghost", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(110.0f, 116.0f)
                arcToRelative(10.0f, 10.0f, 0.0f, true, true, -10.0f, -10.0f)
                arcTo(10.0f, 10.0f, 0.0f, false, true, 110.0f, 116.0f)
                close()
                moveTo(156.0f, 106.0f)
                arcToRelative(10.0f, 10.0f, 0.0f, true, false, 10.0f, 10.0f)
                arcTo(10.0f, 10.0f, 0.0f, false, false, 156.0f, 106.0f)
                close()
                moveTo(222.0f, 120.0f)
                verticalLineToRelative(96.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, -9.8f, 4.64f)
                lineToRelative(-25.53f, -20.89f)
                lineToRelative(-25.54f, 20.89f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, -7.6f, 0.0f)
                lineTo(128.0f, 199.75f)
                lineToRelative(-25.53f, 20.89f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, -7.6f, 0.0f)
                lineTo(69.33f, 199.75f)
                lineTo(43.8f, 220.64f)
                arcTo(6.0f, 6.0f, 0.0f, false, true, 34.0f, 216.0f)
                lineTo(34.0f, 120.0f)
                arcToRelative(94.0f, 94.0f, 0.0f, false, true, 188.0f, 0.0f)
                close()
                moveTo(210.0f, 120.0f)
                arcToRelative(82.0f, 82.0f, 0.0f, false, false, -164.0f, 0.0f)
                verticalLineToRelative(83.34f)
                lineToRelative(19.53f, -16.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, 7.6f, 0.0f)
                lineToRelative(25.54f, 20.89f)
                lineToRelative(25.53f, -20.89f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, 7.6f, 0.0f)
                lineToRelative(25.53f, 20.89f)
                lineToRelative(25.54f, -20.89f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, 7.6f, 0.0f)
                lineToRelative(19.53f, 16.0f)
                close()
            }
        }
        .build()
        return _ghost!!
    }

private var _ghost: ImageVector? = null
