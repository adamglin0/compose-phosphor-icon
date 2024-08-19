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

public val BoldGroup.Balloon: ImageVector
    get() {
        if (_balloon != null) {
            return _balloon!!
        }
        _balloon = Builder(name = "Balloon", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(128.0f, 12.0f)
                arcToRelative(92.1f, 92.1f, 0.0f, false, false, -92.0f, 92.0f)
                curveToRelative(0.0f, 24.53f, 9.55f, 50.13f, 26.19f, 70.22f)
                curveToRelative(10.0f, 12.0f, 21.56f, 21.07f, 34.05f, 26.76f)
                lineTo(85.0f, 227.27f)
                arcTo(12.0f, 12.0f, 0.0f, false, false, 96.0f, 244.0f)
                horizontalLineToRelative(64.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 11.0f, -16.73f)
                lineTo(159.76f, 201.0f)
                curveToRelative(12.49f, -5.69f, 24.08f, -14.73f, 34.05f, -26.76f)
                curveTo(210.45f, 154.13f, 220.0f, 128.53f, 220.0f, 104.0f)
                arcTo(92.1f, 92.1f, 0.0f, false, false, 128.0f, 12.0f)
                close()
                moveTo(141.8f, 220.0f)
                lineTo(114.2f, 220.0f)
                lineToRelative(5.35f, -12.49f)
                arcToRelative(73.1f, 73.1f, 0.0f, false, false, 16.9f, 0.0f)
                close()
                moveTo(175.33f, 158.91f)
                curveTo(161.93f, 175.09f, 145.12f, 184.0f, 128.0f, 184.0f)
                reflectiveCurveToRelative(-33.93f, -8.91f, -47.33f, -25.09f)
                curveTo(67.73f, 143.29f, 60.0f, 122.76f, 60.0f, 104.0f)
                arcToRelative(68.0f, 68.0f, 0.0f, false, true, 136.0f, 0.0f)
                curveTo(196.0f, 122.76f, 188.27f, 143.29f, 175.33f, 158.91f)
                close()
                moveTo(168.99f, 111.91f)
                quadToRelative(-0.6f, 0.06f, -1.2f, 0.06f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, -11.93f, -10.81f)
                arcToRelative(28.0f, 28.0f, 0.0f, false, false, -19.47f, -23.91f)
                arcToRelative(12.0f, 12.0f, 0.0f, true, true, 7.22f, -22.89f)
                arcToRelative(51.94f, 51.94f, 0.0f, false, true, 36.13f, 44.42f)
                arcTo(12.0f, 12.0f, 0.0f, false, true, 169.0f, 111.94f)
                close()
            }
        }
        .build()
        return _balloon!!
    }

private var _balloon: ImageVector? = null
