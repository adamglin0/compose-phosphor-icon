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

public val BoldGroup.Pennibstraight: ImageVector
    get() {
        if (_pennibstraight != null) {
            return _pennibstraight!!
        }
        _pennibstraight = Builder(name = "Pennibstraight", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(225.92f, 122.11f)
                curveToRelative(-0.1f, -0.19f, -0.19f, -0.37f, -0.3f, -0.56f)
                lineTo(196.0f, 68.85f)
                lineTo(196.0f, 32.0f)
                arcToRelative(20.0f, 20.0f, 0.0f, false, false, -20.0f, -20.0f)
                lineTo(80.0f, 12.0f)
                arcTo(20.0f, 20.0f, 0.0f, false, false, 60.0f, 32.0f)
                lineTo(60.0f, 68.87f)
                lineTo(30.38f, 121.55f)
                arcToRelative(5.12f, 5.12f, 0.0f, false, false, -0.3f, 0.57f)
                arcToRelative(19.89f, 19.89f, 0.0f, false, false, 1.83f, 20.71f)
                curveToRelative(0.09f, 0.13f, 0.18f, 0.25f, 0.28f, 0.37f)
                lineToRelative(86.44f, 108.29f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 18.75f, 0.0f)
                lineTo(223.81f, 143.2f)
                curveToRelative(0.1f, -0.12f, 0.19f, -0.24f, 0.28f, -0.37f)
                arcTo(19.91f, 19.91f, 0.0f, false, false, 225.92f, 122.11f)
                close()
                moveTo(172.0f, 36.0f)
                lineTo(172.0f, 60.0f)
                lineTo(84.0f, 60.0f)
                lineTo(84.0f, 36.0f)
                close()
                moveTo(128.0f, 144.0f)
                arcToRelative(10.0f, 10.0f, 0.0f, true, true, 10.0f, -10.0f)
                arcTo(10.0f, 10.0f, 0.0f, false, true, 128.0f, 144.0f)
                close()
                moveTo(140.0f, 209.74f)
                lineTo(140.0f, 165.81f)
                arcToRelative(34.0f, 34.0f, 0.0f, true, false, -24.0f, 0.0f)
                verticalLineToRelative(43.92f)
                lineTo(52.83f, 130.59f)
                lineTo(79.0f, 84.0f)
                lineTo(177.0f, 84.0f)
                lineToRelative(26.19f, 46.59f)
                close()
            }
        }
        .build()
        return _pennibstraight!!
    }

private var _pennibstraight: ImageVector? = null
