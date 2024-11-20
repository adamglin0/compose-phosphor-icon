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

public val ThinGroup.Gear: ImageVector
    get() {
        if (_gear != null) {
            return _gear!!
        }
        _gear = Builder(name = "Gear", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(128.0f, 84.0f)
                arcToRelative(44.0f, 44.0f, 0.0f, true, false, 44.0f, 44.0f)
                arcTo(44.05f, 44.05f, 0.0f, false, false, 128.0f, 84.0f)
                close()
                moveTo(128.0f, 164.0f)
                arcToRelative(36.0f, 36.0f, 0.0f, true, true, 36.0f, -36.0f)
                arcTo(36.0f, 36.0f, 0.0f, false, true, 128.0f, 164.0f)
                close()
                moveTo(211.93f, 131.51f)
                quadToRelative(0.13f, -3.51f, 0.0f, -7.0f)
                lineToRelative(15.83f, -19.79f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 0.75f, -3.53f)
                arcTo(103.64f, 103.64f, 0.0f, false, false, 218.0f, 75.9f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, -3.0f, -2.0f)
                lineToRelative(-25.19f, -2.8f)
                curveToRelative(-1.58f, -1.71f, -3.24f, -3.37f, -4.95f, -4.95f)
                lineTo(182.07f, 41.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, -2.0f, -3.0f)
                arcTo(104.0f, 104.0f, 0.0f, false, false, 154.82f, 27.5f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, -3.53f, 0.74f)
                lineTo(131.51f, 44.07f)
                quadToRelative(-3.51f, -0.14f, -7.0f, 0.0f)
                lineTo(104.7f, 28.24f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, -3.53f, -0.75f)
                arcTo(103.64f, 103.64f, 0.0f, false, false, 75.9f, 38.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, -2.0f, 3.0f)
                lineToRelative(-2.8f, 25.19f)
                curveToRelative(-1.71f, 1.58f, -3.37f, 3.24f, -4.95f, 4.95f)
                lineTo(41.0f, 73.93f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, -3.0f, 2.0f)
                arcTo(104.0f, 104.0f, 0.0f, false, false, 27.5f, 101.18f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 0.74f, 3.53f)
                lineToRelative(15.83f, 19.78f)
                quadToRelative(-0.14f, 3.51f, 0.0f, 7.0f)
                lineTo(28.24f, 151.3f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, -0.75f, 3.53f)
                arcTo(103.64f, 103.64f, 0.0f, false, false, 38.0f, 180.1f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 3.0f, 2.0f)
                lineToRelative(25.19f, 2.8f)
                curveToRelative(1.58f, 1.71f, 3.24f, 3.37f, 4.95f, 4.95f)
                lineToRelative(2.8f, 25.2f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 2.0f, 3.0f)
                arcToRelative(104.0f, 104.0f, 0.0f, false, false, 25.28f, 10.46f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 3.53f, -0.74f)
                lineToRelative(19.78f, -15.83f)
                quadToRelative(3.51f, 0.13f, 7.0f, 0.0f)
                lineToRelative(19.79f, 15.83f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 2.5f, 0.88f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 1.0f, -0.13f)
                arcTo(103.64f, 103.64f, 0.0f, false, false, 180.1f, 218.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 2.0f, -3.0f)
                lineToRelative(2.8f, -25.19f)
                curveToRelative(1.71f, -1.58f, 3.37f, -3.24f, 4.95f, -4.95f)
                lineToRelative(25.2f, -2.8f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 3.0f, -2.0f)
                arcToRelative(104.0f, 104.0f, 0.0f, false, false, 10.46f, -25.28f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, -0.74f, -3.53f)
                close()
                moveTo(212.1f, 174.34f)
                lineTo(187.43f, 177.08f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, -2.55f, 1.32f)
                arcToRelative(76.2f, 76.2f, 0.0f, false, true, -6.48f, 6.48f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, -1.32f, 2.55f)
                lineToRelative(-2.74f, 24.66f)
                arcToRelative(95.45f, 95.45f, 0.0f, false, true, -19.64f, 8.15f)
                lineToRelative(-19.38f, -15.51f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, -2.5f, -0.87f)
                horizontalLineToRelative(-0.24f)
                arcToRelative(73.67f, 73.67f, 0.0f, false, true, -9.16f, 0.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, -2.74f, 0.87f)
                lineToRelative(-19.37f, 15.5f)
                arcToRelative(95.33f, 95.33f, 0.0f, false, true, -19.65f, -8.13f)
                lineToRelative(-2.74f, -24.67f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, -1.32f, -2.55f)
                arcToRelative(76.2f, 76.2f, 0.0f, false, true, -6.48f, -6.48f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, -2.55f, -1.32f)
                lineToRelative(-24.66f, -2.74f)
                arcToRelative(95.45f, 95.45f, 0.0f, false, true, -8.15f, -19.64f)
                lineToRelative(15.51f, -19.38f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 0.87f, -2.74f)
                arcToRelative(77.76f, 77.76f, 0.0f, false, true, 0.0f, -9.16f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, -0.87f, -2.74f)
                lineToRelative(-15.5f, -19.37f)
                arcTo(95.33f, 95.33f, 0.0f, false, true, 43.9f, 81.66f)
                lineToRelative(24.67f, -2.74f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 2.55f, -1.32f)
                arcToRelative(76.2f, 76.2f, 0.0f, false, true, 6.48f, -6.48f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 1.32f, -2.55f)
                lineToRelative(2.74f, -24.66f)
                arcToRelative(95.45f, 95.45f, 0.0f, false, true, 19.64f, -8.15f)
                lineToRelative(19.38f, 15.51f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 2.74f, 0.87f)
                arcToRelative(73.67f, 73.67f, 0.0f, false, true, 9.16f, 0.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 2.74f, -0.87f)
                lineToRelative(19.37f, -15.5f)
                arcToRelative(95.33f, 95.33f, 0.0f, false, true, 19.65f, 8.13f)
                lineToRelative(2.74f, 24.67f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 1.32f, 2.55f)
                arcToRelative(76.2f, 76.2f, 0.0f, false, true, 6.48f, 6.48f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 2.55f, 1.32f)
                lineToRelative(24.66f, 2.74f)
                arcToRelative(95.45f, 95.45f, 0.0f, false, true, 8.15f, 19.64f)
                lineToRelative(-15.51f, 19.38f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, -0.87f, 2.74f)
                arcToRelative(77.76f, 77.76f, 0.0f, false, true, 0.0f, 9.16f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 0.87f, 2.74f)
                lineToRelative(15.5f, 19.37f)
                arcTo(95.33f, 95.33f, 0.0f, false, true, 212.1f, 174.34f)
                close()
            }
        }
        .build()
        return _gear!!
    }

private var _gear: ImageVector? = null
