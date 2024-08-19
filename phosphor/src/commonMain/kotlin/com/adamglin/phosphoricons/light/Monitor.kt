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

public val LightGroup.Monitor: ImageVector
    get() {
        if (_monitor != null) {
            return _monitor!!
        }
        _monitor = Builder(name = "Monitor", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(208.0f, 42.0f)
                lineTo(48.0f, 42.0f)
                arcTo(22.0f, 22.0f, 0.0f, false, false, 26.0f, 64.0f)
                lineTo(26.0f, 176.0f)
                arcToRelative(22.0f, 22.0f, 0.0f, false, false, 22.0f, 22.0f)
                lineTo(208.0f, 198.0f)
                arcToRelative(22.0f, 22.0f, 0.0f, false, false, 22.0f, -22.0f)
                lineTo(230.0f, 64.0f)
                arcTo(22.0f, 22.0f, 0.0f, false, false, 208.0f, 42.0f)
                close()
                moveTo(218.0f, 176.0f)
                arcToRelative(10.0f, 10.0f, 0.0f, false, true, -10.0f, 10.0f)
                lineTo(48.0f, 186.0f)
                arcToRelative(10.0f, 10.0f, 0.0f, false, true, -10.0f, -10.0f)
                lineTo(38.0f, 64.0f)
                arcTo(10.0f, 10.0f, 0.0f, false, true, 48.0f, 54.0f)
                lineTo(208.0f, 54.0f)
                arcToRelative(10.0f, 10.0f, 0.0f, false, true, 10.0f, 10.0f)
                close()
                moveTo(166.0f, 224.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, -6.0f, 6.0f)
                lineTo(96.0f, 230.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, 0.0f, -12.0f)
                horizontalLineToRelative(64.0f)
                arcTo(6.0f, 6.0f, 0.0f, false, true, 166.0f, 224.0f)
                close()
            }
        }
        .build()
        return _monitor!!
    }

private var _monitor: ImageVector? = null
