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

public val FillGroup.Scribbleloop: ImageVector
    get() {
        if (_scribbleloop != null) {
            return _scribbleloop!!
        }
        _scribbleloop = Builder(name = "Scribbleloop", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(128.0f, 128.0f)
                arcToRelative(81.4f, 81.4f, 0.0f, false, true, 25.69f, 4.28f)
                curveTo(151.56f, 154.87f, 137.33f, 176.0f, 112.0f, 176.0f)
                curveToRelative(-15.8f, 0.0f, -24.06f, -10.85f, -24.06f, -21.58f)
                curveToRelative(0.0f, -6.59f, 3.0f, -12.75f, 8.56f, -17.35f)
                curveTo(103.62f, 131.14f, 114.52f, 128.0f, 128.0f, 128.0f)
                close()
                moveTo(224.0f, 48.0f)
                lineTo(224.0f, 208.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, true, -16.0f, 16.0f)
                lineTo(48.0f, 224.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, true, -16.0f, -16.0f)
                lineTo(32.0f, 48.0f)
                arcTo(16.0f, 16.0f, 0.0f, false, true, 48.0f, 32.0f)
                lineTo(208.0f, 32.0f)
                arcTo(16.0f, 16.0f, 0.0f, false, true, 224.0f, 48.0f)
                close()
                moveTo(205.89f, 146.59f)
                arcToRelative(120.21f, 120.21f, 0.0f, false, false, -36.08f, -25.21f)
                curveToRelative(-0.9f, -14.35f, -5.75f, -27.54f, -13.89f, -37.55f)
                curveTo(145.38f, 70.86f, 130.19f, 64.0f, 112.0f, 64.0f)
                curveTo(76.44f, 64.0f, 50.68f, 97.76f, 49.6f, 99.2f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 12.79f, 9.62f)
                curveTo(62.61f, 108.53f, 84.51f, 80.0f, 112.0f, 80.0f)
                curveToRelative(13.4f, 0.0f, 24.0f, 4.68f, 31.5f, 13.92f)
                arcToRelative(47.54f, 47.54f, 0.0f, false, true, 9.48f, 21.4f)
                arcTo(96.75f, 96.75f, 0.0f, false, false, 128.0f, 112.0f)
                curveToRelative(-17.27f, 0.0f, -31.71f, 4.42f, -41.74f, 12.78f)
                curveTo(77.0f, 132.47f, 71.94f, 143.0f, 71.94f, 154.42f)
                curveTo(71.94f, 172.64f, 86.0f, 192.0f, 112.0f, 192.0f)
                arcToRelative(54.0f, 54.0f, 0.0f, false, false, 43.53f, -21.23f)
                arcTo(70.0f, 70.0f, 0.0f, false, false, 169.0f, 138.89f)
                arcToRelative(106.24f, 106.24f, 0.0f, false, true, 25.13f, 18.52f)
                arcToRelative(8.0f, 8.0f, 0.0f, true, false, 11.78f, -10.82f)
                close()
            }
        }
        .build()
        return _scribbleloop!!
    }

private var _scribbleloop: ImageVector? = null
