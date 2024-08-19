package com.adamglin.phosphoricons.thin

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.adamglin.phosphoricons.ThinGroup

public val ThinGroup.Smileysad: ImageVector
    get() {
        if (_smileysad != null) {
            return _smileysad!!
        }
        _smileysad = Builder(name = "Smileysad", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(128.0f, 28.0f)
                arcTo(100.0f, 100.0f, 0.0f, true, false, 228.0f, 128.0f)
                arcTo(100.11f, 100.11f, 0.0f, false, false, 128.0f, 28.0f)
                close()
                moveTo(128.0f, 220.0f)
                arcToRelative(92.0f, 92.0f, 0.0f, true, true, 92.0f, -92.0f)
                arcTo(92.1f, 92.1f, 0.0f, false, true, 128.0f, 220.0f)
                close()
                moveTo(84.0f, 108.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, true, true, 8.0f, 8.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, true, 84.0f, 108.0f)
                close()
                moveTo(172.0f, 108.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, true, true, -8.0f, -8.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, true, 172.0f, 108.0f)
                close()
                moveTo(171.46f, 174.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -1.46f, 5.46f)
                arcToRelative(3.93f, 3.93f, 0.0f, false, true, -2.0f, 0.54f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -3.46f, -2.0f)
                curveToRelative(-8.21f, -14.19f, -21.19f, -22.0f, -36.54f, -22.0f)
                reflectiveCurveToRelative(-28.33f, 7.81f, -36.54f, 22.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -6.92f, -4.0f)
                curveToRelative(9.55f, -16.52f, 25.4f, -26.0f, 43.46f, -26.0f)
                reflectiveCurveTo(161.91f, 157.48f, 171.46f, 174.0f)
                close()
            }
        }
        .build()
        return _smileysad!!
    }

private var _smileysad: ImageVector? = null
