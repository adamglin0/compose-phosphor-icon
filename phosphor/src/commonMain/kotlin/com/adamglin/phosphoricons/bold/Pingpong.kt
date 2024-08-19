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

public val BoldGroup.Pingpong: ImageVector
    get() {
        if (_pingpong != null) {
            return _pingpong!!
        }
        _pingpong = Builder(name = "Pingpong", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(243.93f, 195.71f)
                arcToRelative(20.0f, 20.0f, 0.0f, false, false, -8.0f, -14.41f)
                lineTo(203.0f, 155.17f)
                lineToRelative(12.1f, -12.1f)
                arcToRelative(43.66f, 43.66f, 0.0f, false, false, 12.11f, -39.4f)
                arcToRelative(103.52f, 103.52f, 0.0f, false, false, -36.81f, -60.23f)
                arcTo(106.19f, 106.19f, 0.0f, false, false, 122.52f, 20.0f)
                arcTo(104.29f, 104.29f, 0.0f, false, false, 20.0f, 122.52f)
                arcToRelative(106.17f, 106.17f, 0.0f, false, false, 23.43f, 67.85f)
                arcToRelative(103.52f, 103.52f, 0.0f, false, false, 60.23f, 36.81f)
                arcToRelative(43.64f, 43.64f, 0.0f, false, false, 39.39f, -12.11f)
                lineTo(155.17f, 203.0f)
                lineToRelative(26.13f, 32.95f)
                arcToRelative(20.0f, 20.0f, 0.0f, false, false, 14.41f, 8.0f)
                curveToRelative(0.55f, 0.0f, 1.1f, 0.07f, 1.66f, 0.07f)
                arcToRelative(20.0f, 20.0f, 0.0f, false, false, 14.13f, -5.86f)
                lineToRelative(26.64f, -26.64f)
                arcTo(19.94f, 19.94f, 0.0f, false, false, 243.93f, 195.71f)
                close()
                moveTo(44.0f, 122.86f)
                curveTo(44.6f, 80.0f, 80.0f, 44.6f, 122.86f, 44.0f)
                arcToRelative(81.92f, 81.92f, 0.0f, false, true, 65.2f, 31.0f)
                lineTo(75.0f, 188.06f)
                arcToRelative(81.92f, 81.92f, 0.0f, false, true, -31.0f, -65.2f)
                close()
                moveTo(197.71f, 218.0f)
                lineToRelative(-32.1f, -40.49f)
                arcTo(12.0f, 12.0f, 0.0f, false, false, 156.9f, 173.0f)
                lineToRelative(-0.69f, 0.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, -8.49f, 3.51f)
                lineTo(126.09f, 198.1f)
                horizontalLineToRelative(0.0f)
                arcToRelative(19.72f, 19.72f, 0.0f, false, true, -17.75f, 5.54f)
                arcToRelative(76.28f, 76.28f, 0.0f, false, true, -11.68f, -3.33f)
                lineTo(200.31f, 96.66f)
                arcToRelative(76.28f, 76.28f, 0.0f, false, true, 3.33f, 11.68f)
                arcToRelative(19.72f, 19.72f, 0.0f, false, true, -5.54f, 17.75f)
                lineToRelative(-21.63f, 21.63f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 1.0f, 17.89f)
                lineTo(218.0f, 197.71f)
                close()
            }
        }
        .build()
        return _pingpong!!
    }

private var _pingpong: ImageVector? = null
