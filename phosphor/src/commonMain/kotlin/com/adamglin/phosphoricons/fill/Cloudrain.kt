package com.adamglin.phosphoricons.fill

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.adamglin.phosphoricons.FillGroup

public val FillGroup.CloudRain: ImageVector
    get() {
        if (_cloudRain != null) {
            return _cloudRain!!
        }
        _cloudRain = Builder(name = "CloudRain", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(158.66f, 196.44f)
                lineToRelative(-32.0f, 48.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, true, true, -13.32f, -8.88f)
                lineToRelative(32.0f, -48.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 13.32f, 8.88f)
                close()
                moveTo(231.87f, 87.55f)
                arcToRelative(76.0f, 76.0f, 0.0f, false, false, -151.78f, 0.73f)
                arcTo(8.18f, 8.18f, 0.0f, false, true, 72.0f, 96.0f)
                lineToRelative(-0.6f, 0.0f)
                arcTo(8.14f, 8.14f, 0.0f, false, true, 64.0f, 87.39f)
                arcToRelative(92.48f, 92.48f, 0.0f, false, true, 2.33f, -16.51f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, -5.0f, -4.78f)
                arcTo(52.09f, 52.09f, 0.0f, false, false, 24.0f, 116.36f)
                curveTo(24.2f, 145.07f, 48.12f, 168.0f, 76.84f, 168.0f)
                horizontalLineToRelative(36.21f)
                lineTo(89.34f, 203.56f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 13.32f, 8.88f)
                lineTo(132.28f, 168.0f)
                horizontalLineTo(156.0f)
                arcTo(76.08f, 76.08f, 0.0f, false, false, 231.87f, 87.55f)
                close()
            }
        }
        .build()
        return _cloudRain!!
    }

private var _cloudRain: ImageVector? = null
