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

public val LightGroup.Circlenotch: ImageVector
    get() {
        if (_circlenotch != null) {
            return _circlenotch!!
        }
        _circlenotch = Builder(name = "Circlenotch", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(230.0f, 128.0f)
                arcToRelative(102.0f, 102.0f, 0.0f, false, true, -204.0f, 0.0f)
                curveToRelative(0.0f, -40.18f, 23.35f, -76.86f, 59.5f, -93.45f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, 5.0f, 10.9f)
                curveTo(58.61f, 60.09f, 38.0f, 92.49f, 38.0f, 128.0f)
                arcToRelative(90.0f, 90.0f, 0.0f, false, false, 180.0f, 0.0f)
                curveToRelative(0.0f, -35.51f, -20.61f, -67.91f, -52.5f, -82.55f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, 5.0f, -10.9f)
                curveTo(206.65f, 51.14f, 230.0f, 87.82f, 230.0f, 128.0f)
                close()
            }
        }
        .build()
        return _circlenotch!!
    }

private var _circlenotch: ImageVector? = null
