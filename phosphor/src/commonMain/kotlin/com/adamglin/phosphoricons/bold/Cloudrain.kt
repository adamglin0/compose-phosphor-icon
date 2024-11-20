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

public val BoldGroup.CloudRain: ImageVector
    get() {
        if (_cloudRain != null) {
            return _cloudRain!!
        }
        _cloudRain = Builder(name = "CloudRain", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(156.0f, 12.0f)
                arcTo(80.22f, 80.22f, 0.0f, false, false, 82.39f, 60.36f)
                arcTo(56.76f, 56.76f, 0.0f, false, false, 76.0f, 60.0f)
                arcToRelative(56.0f, 56.0f, 0.0f, false, false, 0.0f, 112.0f)
                horizontalLineToRelative(29.58f)
                lineTo(86.0f, 201.34f)
                arcToRelative(12.0f, 12.0f, 0.0f, true, false, 20.0f, 13.32f)
                lineTo(134.42f, 172.0f)
                lineTo(156.0f, 172.0f)
                arcToRelative(80.0f, 80.0f, 0.0f, false, false, 0.0f, -160.0f)
                close()
                moveTo(156.0f, 148.0f)
                lineTo(76.0f, 148.0f)
                arcToRelative(32.0f, 32.0f, 0.0f, false, true, 0.0f, -64.0f)
                horizontalLineToRelative(0.28f)
                curveToRelative(-0.11f, 1.1f, -0.2f, 2.2f, -0.26f, 3.3f)
                arcToRelative(12.0f, 12.0f, 0.0f, true, false, 24.0f, 1.39f)
                arcTo(56.06f, 56.06f, 0.0f, true, true, 156.0f, 148.0f)
                close()
                moveTo(156.65f, 206.66f)
                lineTo(129.98f, 246.66f)
                arcToRelative(12.0f, 12.0f, 0.0f, true, true, -20.0f, -13.32f)
                lineToRelative(26.66f, -40.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, true, true, 20.0f, 13.32f)
                close()
            }
        }
        .build()
        return _cloudRain!!
    }

private var _cloudRain: ImageVector? = null
