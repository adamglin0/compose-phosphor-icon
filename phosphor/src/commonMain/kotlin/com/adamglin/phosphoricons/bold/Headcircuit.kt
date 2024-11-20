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

public val BoldGroup.HeadCircuit: ImageVector
    get() {
        if (_headCircuit != null) {
            return _headCircuit!!
        }
        _headCircuit = Builder(name = "HeadCircuit", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(203.91f, 230.51f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, -10.42f, 13.4f)
                arcTo(12.87f, 12.87f, 0.0f, false, true, 192.0f, 244.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, -11.89f, -10.51f)
                lineToRelative(-8.0f, -64.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, 4.7f, -11.08f)
                arcToRelative(68.26f, 68.26f, 0.0f, false, false, 27.19f, -56.0f)
                curveToRelative(0.0f, -0.81f, -0.07f, -1.6f, -0.11f, -2.4f)
                horizontalLineTo(189.62f)
                lineToRelative(-23.1f, 27.72f)
                arcTo(23.69f, 23.69f, 0.0f, false, true, 168.0f, 136.0f)
                arcToRelative(24.07f, 24.07f, 0.0f, true, true, -19.92f, -23.64f)
                lineToRelative(26.7f, -32.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, true, 184.0f, 76.0f)
                horizontalLineToRelative(13.91f)
                arcToRelative(68.19f, 68.19f, 0.0f, false, false, -58.22f, -39.9f)
                quadTo(137.85f, 36.0f, 136.0f, 36.0f)
                verticalLineTo(55.23f)
                arcToRelative(24.0f, 24.0f, 0.0f, true, true, -24.0f, 0.0f)
                verticalLineTo(40.34f)
                arcTo(68.11f, 68.11f, 0.0f, false, false, 68.0f, 104.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, -1.36f, 5.54f)
                lineTo(45.51f, 150.15f)
                lineTo(69.0f, 160.9f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, 7.0f, 10.91f)
                verticalLineTo(204.0f)
                horizontalLineToRelative(44.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, 0.0f, 24.0f)
                horizontalLineTo(72.0f)
                arcToRelative(20.0f, 20.0f, 0.0f, false, true, -20.0f, -20.0f)
                verticalLineTo(179.51f)
                lineToRelative(-20.57f, -9.42f)
                arcToRelative(3.26f, 3.26f, 0.0f, false, true, -0.38f, -0.18f)
                arcToRelative(20.0f, 20.0f, 0.0f, false, true, -9.43f, -25.76f)
                arcToRelative(7.49f, 7.49f, 0.0f, false, true, 0.38f, -0.81f)
                lineToRelative(22.0f, -42.37f)
                arcTo(92.0f, 92.0f, 0.0f, false, true, 141.0f, 12.13f)
                curveToRelative(47.7f, 2.51f, 85.93f, 41.92f, 87.0f, 89.71f)
                arcToRelative(92.33f, 92.33f, 0.0f, false, true, -31.25f, 71.26f)
                close()
            }
        }
        .build()
        return _headCircuit!!
    }

private var _headCircuit: ImageVector? = null
