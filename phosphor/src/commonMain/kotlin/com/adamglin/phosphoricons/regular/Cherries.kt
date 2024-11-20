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

public val RegularGroup.Cherries: ImageVector
    get() {
        if (_cherries != null) {
            return _cherries!!
        }
        _cherries = Builder(name = "Cherries", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(176.0f, 72.0f)
                arcToRelative(71.5f, 71.5f, 0.0f, false, false, -7.76f, 0.43f)
                arcToRelative(91.77f, 91.77f, 0.0f, false, false, -21.62f, -25.11f)
                curveTo(108.78f, 16.79f, 57.05f, 23.77f, 54.87f, 24.08f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -3.31f, 14.58f)
                curveToRelative(17.5f, 11.66f, 25.51f, 31.0f, 28.85f, 49.74f)
                arcTo(72.0f, 72.0f, 0.0f, true, false, 142.0f, 207.5f)
                arcTo(72.0f, 72.0f, 0.0f, true, false, 176.0f, 72.0f)
                close()
                moveTo(76.0f, 39.37f)
                curveToRelative(16.67f, 0.72f, 41.24f, 4.78f, 60.64f, 20.48f)
                arcToRelative(75.28f, 75.28f, 0.0f, false, true, 15.0f, 16.4f)
                arcTo(72.2f, 72.2f, 0.0f, false, false, 121.9f, 96.5f)
                arcToRelative(71.46f, 71.46f, 0.0f, false, false, -25.23f, -8.0f)
                curveTo(93.54f, 68.59f, 86.56f, 52.0f, 76.0f, 39.37f)
                close()
                moveTo(88.0f, 216.0f)
                arcToRelative(56.0f, 56.0f, 0.0f, false, true, -5.76f, -111.7f)
                arcToRelative(176.49f, 176.49f, 0.0f, false, true, -1.0f, 31.08f)
                curveToRelative(-7.58f, -1.43f, -11.35f, -4.85f, -11.55f, -5.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -11.32f, 11.32f)
                curveTo(59.4f, 142.71f, 69.2f, 152.0f, 87.92f, 152.0f)
                horizontalLineToRelative(0.25f)
                curveToRelative(18.66f, -0.05f, 28.43f, -9.28f, 29.49f, -10.33f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -11.32f, -11.32f)
                arcToRelative(22.31f, 22.31f, 0.0f, false, true, -8.93f, 4.44f)
                arcTo(190.36f, 190.36f, 0.0f, false, false, 98.34f, 105.0f)
                arcTo(56.0f, 56.0f, 0.0f, false, true, 88.0f, 216.0f)
                close()
                moveTo(145.0f, 116.11f)
                arcToRelative(72.27f, 72.27f, 0.0f, false, false, -9.82f, -10.42f)
                arcToRelative(56.15f, 56.15f, 0.0f, false, true, 24.22f, -15.16f)
                arcTo(110.84f, 110.84f, 0.0f, false, true, 167.0f, 118.88f)
                curveToRelative(-6.09f, -1.6f, -9.16f, -4.37f, -9.33f, -4.54f)
                arcTo(8.0f, 8.0f, 0.0f, false, false, 145.0f, 116.11f)
                close()
                moveTo(176.0f, 200.0f)
                arcToRelative(55.76f, 55.76f, 0.0f, false, true, -24.69f, -5.73f)
                arcToRelative(71.83f, 71.83f, 0.0f, false, false, 2.5f, -63.42f)
                arcTo(47.47f, 47.47f, 0.0f, false, false, 175.67f, 136.0f)
                lineTo(176.0f, 136.0f)
                curveToRelative(18.77f, 0.0f, 28.6f, -9.28f, 29.66f, -10.34f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -11.32f, -11.32f)
                curveToRelative(-0.19f, 0.19f, -3.84f, 3.49f, -11.15f, 5.0f)
                arcTo(131.66f, 131.66f, 0.0f, false, false, 175.7f, 88.0f)
                horizontalLineToRelative(0.3f)
                arcToRelative(56.0f, 56.0f, 0.0f, false, true, 0.0f, 112.0f)
                close()
            }
        }
        .build()
        return _cherries!!
    }

private var _cherries: ImageVector? = null
