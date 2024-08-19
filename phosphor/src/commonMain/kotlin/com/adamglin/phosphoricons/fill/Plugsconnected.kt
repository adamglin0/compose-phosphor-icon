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

public val FillGroup.Plugsconnected: ImageVector
    get() {
        if (_plugsconnected != null) {
            return _plugsconnected!!
        }
        _plugsconnected = Builder(name = "Plugsconnected", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(88.57f, 35.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, true, 103.43f, 29.0f)
                lineToRelative(8.0f, 20.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, true, 96.57f, 55.0f)
                close()
                moveTo(29.0f, 103.43f)
                lineToRelative(20.0f, 8.0f)
                arcTo(8.0f, 8.0f, 0.0f, true, false, 55.0f, 96.57f)
                lineToRelative(-20.0f, -8.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, false, 29.0f, 103.43f)
                close()
                moveTo(227.0f, 152.57f)
                lineToRelative(-20.0f, -8.0f)
                arcTo(8.0f, 8.0f, 0.0f, true, false, 201.0f, 159.43f)
                lineToRelative(20.0f, 8.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, false, 227.0f, 152.57f)
                close()
                moveTo(159.43f, 201.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, false, 144.57f, 207.0f)
                lineToRelative(8.0f, 20.0f)
                arcTo(8.0f, 8.0f, 0.0f, true, false, 167.43f, 221.0f)
                close()
                moveTo(237.91f, 18.52f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -11.5f, -0.18f)
                lineTo(174.0f, 70.75f)
                lineToRelative(-5.38f, -5.38f)
                arcToRelative(32.0f, 32.0f, 0.0f, false, false, -45.28f, 0.0f)
                lineTo(106.14f, 82.54f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 0.0f, 5.66f)
                lineToRelative(61.7f, 61.66f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 5.66f, 0.0f)
                lineToRelative(16.74f, -16.74f)
                arcToRelative(32.76f, 32.76f, 0.0f, false, false, 9.81f, -22.52f)
                arcToRelative(31.82f, 31.82f, 0.0f, false, false, -9.37f, -23.17f)
                lineToRelative(-5.38f, -5.37f)
                lineToRelative(52.2f, -52.17f)
                arcTo(8.22f, 8.22f, 0.0f, false, false, 237.91f, 18.52f)
                close()
                moveTo(85.64f, 90.34f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -11.49f, 0.18f)
                arcToRelative(8.22f, 8.22f, 0.0f, false, false, 0.41f, 11.37f)
                lineTo(80.67f, 108.0f)
                lineTo(65.34f, 123.31f)
                arcTo(31.82f, 31.82f, 0.0f, false, false, 56.0f, 146.47f)
                arcTo(32.75f, 32.75f, 0.0f, false, false, 65.77f, 169.0f)
                lineToRelative(5.0f, 4.94f)
                lineTo(18.49f, 226.13f)
                arcToRelative(8.21f, 8.21f, 0.0f, false, false, -0.61f, 11.1f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 11.72f, 0.43f)
                lineTo(82.0f, 185.25f)
                lineToRelative(5.37f, 5.38f)
                arcToRelative(32.1f, 32.1f, 0.0f, false, false, 45.29f, 0.0f)
                lineTo(148.0f, 175.31f)
                lineToRelative(6.34f, 6.35f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 11.32f, -11.32f)
                close()
            }
        }
        .build()
        return _plugsconnected!!
    }

private var _plugsconnected: ImageVector? = null
