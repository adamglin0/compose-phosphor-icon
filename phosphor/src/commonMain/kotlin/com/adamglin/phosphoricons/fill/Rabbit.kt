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

public val FillGroup.Rabbit: ImageVector
    get() {
        if (_rabbit != null) {
            return _rabbit!!
        }
        _rabbit = Builder(name = "Rabbit", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(199.28f, 149.8f)
                arcTo(71.58f, 71.58f, 0.0f, false, false, 193.0f, 129.0f)
                curveToRelative(19.0f, -37.94f, 30.45f, -88.28f, 17.34f, -110.0f)
                arcTo(22.0f, 22.0f, 0.0f, false, false, 190.94f, 8.0f)
                curveToRelative(-14.12f, 0.0f, -26.0f, 11.89f, -36.44f, 36.36f)
                curveToRelative(-6.22f, 14.62f, -10.85f, 31.32f, -14.0f, 44.74f)
                arcToRelative(71.8f, 71.8f, 0.0f, false, false, -25.0f, 0.0f)
                curveToRelative(-3.13f, -13.42f, -7.76f, -30.12f, -14.0f, -44.74f)
                curveTo(91.1f, 19.89f, 79.18f, 8.0f, 65.06f, 8.0f)
                arcTo(22.0f, 22.0f, 0.0f, false, false, 45.64f, 19.08f)
                curveTo(32.53f, 40.76f, 44.0f, 91.1f, 63.0f, 129.0f)
                arcToRelative(71.58f, 71.58f, 0.0f, false, false, -6.26f, 20.76f)
                arcTo(52.0f, 52.0f, 0.0f, true, false, 128.0f, 225.52f)
                lineToRelative(-21.12f, -19.37f)
                arcToRelative(8.0f, 8.0f, 0.0f, true, true, 10.24f, -12.3f)
                lineTo(128.0f, 202.9f)
                lineToRelative(10.88f, -9.05f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 10.24f, 12.3f)
                lineTo(128.0f, 225.52f)
                arcToRelative(52.0f, 52.0f, 0.0f, true, false, 71.28f, -75.72f)
                close()
                moveTo(73.28f, 113.27f)
                arcTo(218.45f, 218.45f, 0.0f, false, true, 58.4f, 67.08f)
                curveToRelative(-3.49f, -18.13f, -3.15f, -33.0f, 0.93f, -39.72f)
                arcTo(6.0f, 6.0f, 0.0f, false, true, 65.06f, 24.0f)
                curveToRelative(6.61f, 0.0f, 14.52f, 9.7f, 21.72f, 26.62f)
                curveToRelative(5.93f, 13.94f, 10.35f, 30.12f, 13.33f, 43.0f)
                arcToRelative(71.72f, 71.72f, 0.0f, false, false, -26.88f, 19.64f)
                close()
                moveTo(100.0f, 176.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, true, true, 12.0f, -12.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, true, 100.0f, 176.0f)
                close()
                moveTo(156.0f, 176.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, true, true, 12.0f, -12.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, true, 156.0f, 176.0f)
                close()
                moveTo(176.55f, 106.83f)
                arcToRelative(71.89f, 71.89f, 0.0f, false, false, -20.66f, -13.2f)
                curveToRelative(3.0f, -12.89f, 7.4f, -29.07f, 13.33f, -43.0f)
                curveTo(176.42f, 33.7f, 184.33f, 24.0f, 190.94f, 24.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, 5.73f, 3.36f)
                curveToRelative(4.08f, 6.74f, 4.42f, 21.59f, 0.93f, 39.72f)
                arcToRelative(218.45f, 218.45f, 0.0f, false, true, -14.83f, 46.19f)
                arcTo(72.6f, 72.6f, 0.0f, false, false, 176.55f, 106.83f)
                close()
            }
        }
        .build()
        return _rabbit!!
    }

private var _rabbit: ImageVector? = null
