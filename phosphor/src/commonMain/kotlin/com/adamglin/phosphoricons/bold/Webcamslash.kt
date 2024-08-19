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

public val BoldGroup.Webcamslash: ImageVector
    get() {
        if (_webcamslash != null) {
            return _webcamslash!!
        }
        _webcamslash = Builder(name = "Webcamslash", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(216.88f, 207.93f)
                lineToRelative(-160.0f, -176.0f)
                arcTo(12.0f, 12.0f, 0.0f, true, false, 39.12f, 48.07f)
                lineTo(53.93f, 64.36f)
                arcTo(84.0f, 84.0f, 0.0f, false, false, 116.0f, 187.13f)
                lineTo(116.0f, 196.0f)
                lineTo(32.0f, 196.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 0.0f, 24.0f)
                lineTo(195.42f, 220.0f)
                lineToRelative(3.7f, 4.07f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 17.76f, -16.14f)
                close()
                moveTo(68.0f, 104.0f)
                arcToRelative(59.84f, 59.84f, 0.0f, false, true, 3.52f, -20.29f)
                lineToRelative(12.91f, 14.2f)
                arcTo(44.0f, 44.0f, 0.0f, false, false, 128.0f, 148.0f)
                curveToRelative(0.64f, 0.0f, 1.28f, 0.0f, 1.92f, -0.05f)
                lineToRelative(12.9f, 14.19f)
                arcTo(60.0f, 60.0f, 0.0f, false, true, 68.0f, 104.0f)
                close()
                moveTo(140.0f, 196.0f)
                verticalLineToRelative(-8.87f)
                arcToRelative(84.41f, 84.41f, 0.0f, false, false, 20.42f, -5.63f)
                lineTo(173.6f, 196.0f)
                close()
                moveTo(88.89f, 42.35f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, 6.37f, -15.73f)
                arcTo(84.0f, 84.0f, 0.0f, false, true, 201.91f, 143.94f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, -10.56f, 6.29f)
                arcToRelative(11.84f, 11.84f, 0.0f, false, true, -5.7f, -1.45f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, -4.84f, -16.26f)
                arcToRelative(60.0f, 60.0f, 0.0f, false, false, -76.19f, -83.8f)
                arcTo(12.0f, 12.0f, 0.0f, false, true, 88.89f, 42.35f)
                close()
                moveTo(172.0f, 103.64f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, -11.9f, 12.1f)
                lineTo(160.0f, 115.74f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, -12.0f, -11.91f)
                arcTo(20.0f, 20.0f, 0.0f, false, false, 130.06f, 84.1f)
                arcToRelative(12.0f, 12.0f, 0.0f, true, true, 2.42f, -23.87f)
                arcTo(43.92f, 43.92f, 0.0f, false, true, 172.0f, 103.64f)
                close()
            }
        }
        .build()
        return _webcamslash!!
    }

private var _webcamslash: ImageVector? = null
