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

public val LightGroup.Smileysticker: ImageVector
    get() {
        if (_smileysticker != null) {
            return _smileysticker!!
        }
        _smileysticker = Builder(name = "Smileysticker", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(128.0f, 26.0f)
                arcToRelative(102.0f, 102.0f, 0.0f, true, false, 30.0f, 199.52f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 2.48f, -1.49f)
                lineTo(224.0f, 160.46f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 1.49f, -2.49f)
                arcTo(102.06f, 102.06f, 0.0f, false, false, 128.0f, 26.0f)
                close()
                moveTo(214.47f, 153.0f)
                lineTo(153.05f, 214.43f)
                arcTo(89.91f, 89.91f, 0.0f, true, true, 214.47f, 153.0f)
                close()
                moveTo(82.0f, 108.0f)
                arcToRelative(10.0f, 10.0f, 0.0f, true, true, 10.0f, 10.0f)
                arcTo(10.0f, 10.0f, 0.0f, false, true, 82.0f, 108.0f)
                close()
                moveTo(174.0f, 108.0f)
                arcToRelative(10.0f, 10.0f, 0.0f, true, true, -10.0f, -10.0f)
                arcTo(10.0f, 10.0f, 0.0f, false, true, 174.0f, 108.0f)
                close()
                moveTo(173.19f, 155.0f)
                curveToRelative(-9.92f, 17.16f, -26.39f, 27.0f, -45.19f, 27.0f)
                reflectiveCurveToRelative(-35.27f, -9.84f, -45.19f, -27.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, 10.38f, -6.0f)
                curveToRelative(7.84f, 13.54f, 20.2f, 21.0f, 34.81f, 21.0f)
                reflectiveCurveToRelative(27.0f, -7.46f, 34.81f, -21.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, true, true, 10.38f, 6.0f)
                close()
            }
        }
        .build()
        return _smileysticker!!
    }

private var _smileysticker: ImageVector? = null
