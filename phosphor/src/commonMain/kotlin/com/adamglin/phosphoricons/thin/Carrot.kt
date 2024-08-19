package com.adamglin.phosphoricons.thin

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.adamglin.phosphoricons.ThinGroup

public val ThinGroup.Carrot: ImageVector
    get() {
        if (_carrot != null) {
            return _carrot!!
        }
        _carrot = Builder(name = "Carrot", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(232.0f, 68.0f)
                lineTo(193.66f, 68.0f)
                lineToRelative(33.17f, -33.17f)
                arcToRelative(4.0f, 4.0f, 0.0f, true, false, -5.66f, -5.66f)
                lineTo(188.0f, 62.34f)
                lineTo(188.0f, 24.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, -8.0f, 0.0f)
                lineTo(180.0f, 64.0f)
                arcToRelative(60.0f, 60.0f, 0.0f, false, false, -78.39f, 5.54f)
                lineToRelative(0.0f, 0.0f)
                horizontalLineToRelative(0.0f)
                curveToRelative(-17.12f, 16.79f, -34.51f, 45.72f, -51.7f, 86.0f)
                curveToRelative(-11.93f, 28.0f, -19.61f, 52.0f, -20.59f, 55.09f)
                arcTo(12.05f, 12.05f, 0.0f, false, false, 40.0f, 228.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 5.36f, -1.28f)
                curveToRelative(3.12f, -1.0f, 27.13f, -8.65f, 55.09f, -20.59f)
                curveToRelative(40.29f, -17.2f, 69.24f, -34.61f, 86.0f, -51.71f)
                arcTo(60.0f, 60.0f, 0.0f, false, false, 192.0f, 76.0f)
                horizontalLineToRelative(40.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 0.0f, -8.0f)
                close()
                moveTo(180.74f, 148.79f)
                curveToRelative(-9.76f, 10.0f, -23.42f, 19.39f, -38.37f, 27.91f)
                lineToRelative(-27.54f, -27.53f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, -5.65f, 5.65f)
                lineToRelative(25.9f, 25.91f)
                curveTo(92.61f, 203.55f, 43.34f, 219.0f, 42.64f, 219.18f)
                arcToRelative(4.45f, 4.45f, 0.0f, false, false, -0.71f, 0.3f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -5.41f, -5.41f)
                arcToRelative(4.45f, 4.45f, 0.0f, false, false, 0.3f, -0.71f)
                curveToRelative(0.29f, -1.0f, 29.72f, -95.0f, 67.62f, -135.27f)
                lineToRelative(36.74f, 36.73f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 5.65f, 0.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 0.0f, -5.65f)
                lineTo(110.18f, 72.52f)
                arcToRelative(52.0f, 52.0f, 0.0f, false, true, 70.56f, 76.27f)
                close()
            }
        }
        .build()
        return _carrot!!
    }

private var _carrot: ImageVector? = null
