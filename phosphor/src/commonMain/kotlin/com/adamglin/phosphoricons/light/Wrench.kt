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

public val LightGroup.Wrench: ImageVector
    get() {
        if (_wrench != null) {
            return _wrench!!
        }
        _wrench = Builder(name = "Wrench", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(224.91f, 69.75f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, -9.63f, -2.16f)
                lineToRelative(-41.07f, 37.9f)
                lineTo(154.7f, 101.3f)
                lineToRelative(-4.19f, -19.51f)
                lineToRelative(37.9f, -41.07f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, -2.16f, -9.63f)
                arcToRelative(70.0f, 70.0f, 0.0f, false, false, -89.77f, 94.39f)
                lineToRelative(-61.39f, 53.0f)
                curveToRelative(-0.11f, 0.09f, -0.21f, 0.19f, -0.32f, 0.3f)
                arcTo(30.0f, 30.0f, 0.0f, false, false, 77.2f, 221.23f)
                curveToRelative(0.11f, -0.11f, 0.21f, -0.21f, 0.3f, -0.32f)
                lineToRelative(53.0f, -61.39f)
                arcToRelative(70.0f, 70.0f, 0.0f, false, false, 94.39f, -89.77f)
                close()
                moveTo(160.0f, 154.0f)
                arcToRelative(58.0f, 58.0f, 0.0f, false, true, -28.0f, -7.22f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, -7.45f, 1.33f)
                lineTo(68.57f, 212.88f)
                arcToRelative(18.0f, 18.0f, 0.0f, false, true, -25.45f, -25.45f)
                lineToRelative(64.76f, -55.94f)
                arcTo(6.0f, 6.0f, 0.0f, false, false, 109.2f, 124.0f)
                arcToRelative(58.0f, 58.0f, 0.0f, false, true, 64.0f, -84.53f)
                lineTo(139.58f, 75.93f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, -1.45f, 5.33f)
                lineToRelative(5.65f, 26.35f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 4.61f, 4.61f)
                lineToRelative(26.35f, 5.65f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 5.33f, -1.45f)
                lineTo(216.49f, 82.8f)
                arcTo(58.06f, 58.06f, 0.0f, false, true, 160.0f, 154.0f)
                close()
            }
        }
        .build()
        return _wrench!!
    }

private var _wrench: ImageVector? = null
