package com.adamglin.phosphoricons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.adamglin.phosphoricons.RegularGroup

public val RegularGroup.Strategy: ImageVector
    get() {
        if (_strategy != null) {
            return _strategy!!
        }
        _strategy = Builder(name = "Strategy", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(76.0f, 152.0f)
                arcToRelative(36.0f, 36.0f, 0.0f, true, false, 36.0f, 36.0f)
                arcTo(36.0f, 36.0f, 0.0f, false, false, 76.0f, 152.0f)
                close()
                moveTo(76.0f, 208.0f)
                arcToRelative(20.0f, 20.0f, 0.0f, true, true, 20.0f, -20.0f)
                arcTo(20.0f, 20.0f, 0.0f, false, true, 76.0f, 208.0f)
                close()
                moveTo(42.34f, 106.34f)
                lineTo(56.69f, 92.0f)
                lineTo(42.34f, 77.66f)
                arcTo(8.0f, 8.0f, 0.0f, false, true, 53.66f, 66.34f)
                lineTo(68.0f, 80.69f)
                lineTo(82.34f, 66.34f)
                arcTo(8.0f, 8.0f, 0.0f, false, true, 93.66f, 77.66f)
                lineTo(79.31f, 92.0f)
                lineToRelative(14.35f, 14.34f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -11.32f, 11.32f)
                lineTo(68.0f, 103.31f)
                lineTo(53.66f, 117.66f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -11.32f, -11.32f)
                close()
                moveTo(229.66f, 202.34f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -11.32f, 11.32f)
                lineTo(204.0f, 199.31f)
                lineToRelative(-14.34f, 14.35f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -11.32f, -11.32f)
                lineTo(192.69f, 188.0f)
                lineToRelative(-14.35f, -14.34f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 11.32f, -11.32f)
                lineTo(204.0f, 176.69f)
                lineToRelative(14.34f, -14.35f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 11.32f, 11.32f)
                lineTo(215.31f, 188.0f)
                close()
                moveTo(184.47f, 112.83f)
                curveToRelative(-6.18f, 22.33f, -25.32f, 41.63f, -46.53f, 46.93f)
                arcTo(8.13f, 8.13f, 0.0f, false, true, 136.0f, 160.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -1.93f, -15.76f)
                curveToRelative(15.63f, -3.91f, 30.35f, -18.91f, 35.0f, -35.68f)
                curveToRelative(3.19f, -11.5f, 3.22f, -29.0f, -14.71f, -46.9f)
                lineTo(152.0f, 59.31f)
                lineTo(152.0f, 80.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -16.0f, 0.0f)
                lineTo(136.0f, 40.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 8.0f, -8.0f)
                horizontalLineToRelative(40.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 0.0f, 16.0f)
                lineTo(163.31f, 48.0f)
                lineToRelative(2.35f, 2.34f)
                curveTo(183.9f, 68.59f, 190.58f, 90.78f, 184.47f, 112.83f)
                close()
            }
        }
        .build()
        return _strategy!!
    }

private var _strategy: ImageVector? = null
