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

public val BoldGroup.Axe: ImageVector
    get() {
        if (_axe != null) {
            return _axe!!
        }
        _axe = Builder(name = "Axe", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp, viewportWidth
                = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(254.93f, 96.43f)
                arcTo(20.0f, 20.0f, 0.0f, false, false, 238.56f, 83.0f)
                arcTo(122.0f, 122.0f, 0.0f, false, true, 198.7f, 70.54f)
                lineToRelative(3.92f, -3.92f)
                arcToRelative(32.0f, 32.0f, 0.0f, false, false, -45.26f, -45.26f)
                lineToRelative(-6.69f, 6.69f)
                arcToRelative(20.0f, 20.0f, 0.0f, false, false, -30.15f, -2.21f)
                lineTo(81.84f, 64.52f)
                arcToRelative(20.0f, 20.0f, 0.0f, false, false, 2.21f, 30.16f)
                lineTo(9.36f, 169.38f)
                arcToRelative(32.0f, 32.0f, 0.0f, false, false, 45.25f, 45.26f)
                lineToRelative(71.92f, -71.93f)
                arcTo(122.0f, 122.0f, 0.0f, false, true, 139.0f, 182.57f)
                arcToRelative(20.0f, 20.0f, 0.0f, false, false, 34.0f, 11.58f)
                lineTo(250.13f, 117.0f)
                arcTo(19.86f, 19.86f, 0.0f, false, false, 254.93f, 96.43f)
                close()
                moveTo(174.33f, 38.33f)
                arcToRelative(8.0f, 8.0f, 0.0f, true, true, 11.32f, 11.32f)
                lineToRelative(-7.58f, 7.57f)
                arcToRelative(135.65f, 135.65f, 0.0f, false, true, -11.94f, -10.68f)
                close()
                moveTo(37.64f, 197.67f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -11.31f, -11.32f)
                lineToRelative(76.21f, -76.21f)
                arcToRelative(135.65f, 135.65f, 0.0f, false, true, 10.68f, 11.94f)
                close()
                moveTo(161.52f, 171.67f)
                curveToRelative(-9.0f, -48.5f, -39.27f, -78.44f, -59.38f, -93.47f)
                lineToRelative(32.0f, -32.0f)
                curveToRelative(15.0f, 20.11f, 45.0f, 50.34f, 93.45f, 59.38f)
                close()
            }
        }
        .build()
        return _axe!!
    }

private var _axe: ImageVector? = null
