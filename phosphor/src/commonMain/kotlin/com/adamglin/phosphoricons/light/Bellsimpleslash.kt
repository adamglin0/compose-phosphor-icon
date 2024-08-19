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

public val LightGroup.Bellsimpleslash: ImageVector
    get() {
        if (_bellsimpleslash != null) {
            return _bellsimpleslash!!
        }
        _bellsimpleslash = Builder(name = "Bellsimpleslash", defaultWidth = 256.0.dp, defaultHeight
                = 256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(52.44f, 36.0f)
                arcTo(6.0f, 6.0f, 0.0f, false, false, 43.56f, 44.0f)
                lineTo(61.31f, 63.56f)
                arcTo(77.45f, 77.45f, 0.0f, false, false, 50.0f, 104.0f)
                curveToRelative(0.0f, 35.74f, -8.42f, 63.2f, -14.08f, 72.94f)
                arcTo(14.0f, 14.0f, 0.0f, false, false, 48.0f, 198.0f)
                lineTo(183.53f, 198.0f)
                lineToRelative(20.0f, 22.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 8.88f, -8.08f)
                close()
                moveTo(48.0f, 186.0f)
                arcToRelative(1.9f, 1.9f, 0.0f, false, true, -1.7f, -1.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, 0.0f, -2.0f)
                curveTo(53.86f, 170.0f, 62.0f, 139.69f, 62.0f, 104.0f)
                arcToRelative(65.63f, 65.63f, 0.0f, false, true, 7.78f, -31.12f)
                lineTo(172.62f, 186.0f)
                close()
                moveTo(166.0f, 224.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, -6.0f, 6.0f)
                lineTo(96.0f, 230.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, 0.0f, -12.0f)
                horizontalLineToRelative(64.0f)
                arcTo(6.0f, 6.0f, 0.0f, false, true, 166.0f, 224.0f)
                close()
                moveTo(213.27f, 177.38f)
                arcToRelative(5.88f, 5.88f, 0.0f, false, true, -2.2f, 0.42f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, -5.58f, -3.81f)
                curveToRelative(-7.2f, -18.31f, -11.49f, -44.48f, -11.49f, -70.0f)
                arcTo(66.0f, 66.0f, 0.0f, false, false, 95.45f, 46.57f)
                arcToRelative(6.0f, 6.0f, 0.0f, true, true, -5.93f, -10.43f)
                arcTo(78.0f, 78.0f, 0.0f, false, true, 206.0f, 104.0f)
                curveToRelative(0.0f, 35.7f, 8.16f, 59.24f, 10.66f, 65.61f)
                arcTo(6.0f, 6.0f, 0.0f, false, true, 213.27f, 177.38f)
                close()
            }
        }
        .build()
        return _bellsimpleslash!!
    }

private var _bellsimpleslash: ImageVector? = null
