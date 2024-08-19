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

public val LightGroup.Eyedropper: ImageVector
    get() {
        if (_eyedropper != null) {
            return _eyedropper!!
        }
        _eyedropper = Builder(name = "Eyedropper", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(222.0f, 67.34f)
                arcToRelative(33.81f, 33.81f, 0.0f, false, false, -10.64f, -24.25f)
                curveTo(198.12f, 30.56f, 176.68f, 31.0f, 163.54f, 44.18f)
                lineTo(142.82f, 65.0f)
                lineToRelative(-0.63f, -0.63f)
                arcToRelative(22.0f, 22.0f, 0.0f, false, false, -31.11f, 0.0f)
                lineToRelative(-9.0f, 9.0f)
                arcToRelative(14.0f, 14.0f, 0.0f, false, false, 0.0f, 19.81f)
                lineToRelative(3.47f, 3.47f)
                lineTo(53.14f, 149.1f)
                arcToRelative(37.79f, 37.79f, 0.0f, false, false, -9.84f, 36.73f)
                lineToRelative(-8.31f, 19.0f)
                arcToRelative(11.68f, 11.68f, 0.0f, false, false, 2.46f, 13.0f)
                arcTo(13.91f, 13.91f, 0.0f, false, false, 47.32f, 222.0f)
                arcTo(14.15f, 14.15f, 0.0f, false, false, 53.0f, 220.82f)
                lineTo(71.0f, 212.92f)
                arcToRelative(37.92f, 37.92f, 0.0f, false, false, 35.84f, -10.07f)
                lineToRelative(52.44f, -52.46f)
                lineToRelative(3.47f, 3.48f)
                arcToRelative(14.0f, 14.0f, 0.0f, false, false, 19.8f, 0.0f)
                lineToRelative(9.0f, -9.0f)
                arcToRelative(22.0f, 22.0f, 0.0f, false, false, 0.0f, -31.12f)
                lineToRelative(-0.66f, -0.66f)
                lineTo(212.0f, 91.85f)
                arcTo(33.76f, 33.76f, 0.0f, false, false, 222.0f, 67.34f)
                close()
                moveTo(98.39f, 194.34f)
                arcToRelative(26.0f, 26.0f, 0.0f, false, true, -26.0f, 6.47f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, -4.16f, 0.24f)
                lineToRelative(-20.0f, 8.75f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, -2.09f, -0.31f)
                lineToRelative(9.12f, -20.9f)
                arcToRelative(5.94f, 5.94f, 0.0f, false, false, 0.19f, -4.31f)
                arcToRelative(25.88f, 25.88f, 0.0f, false, true, 6.26f, -26.72f)
                lineToRelative(52.44f, -52.45f)
                lineToRelative(36.76f, 36.78f)
                close()
                moveTo(203.55f, 83.34f)
                lineTo(178.17f, 108.9f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 0.0f, 8.47f)
                lineToRelative(4.88f, 4.89f)
                arcToRelative(10.0f, 10.0f, 0.0f, false, true, 0.0f, 14.15f)
                lineToRelative(-9.0f, 9.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, -2.82f, 0.0f)
                lineToRelative(-60.69f, -60.7f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, 0.0f, -2.83f)
                lineToRelative(9.0f, -9.0f)
                arcToRelative(10.0f, 10.0f, 0.0f, false, true, 14.14f, 0.0f)
                lineToRelative(4.89f, 4.89f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 4.24f, 1.75f)
                horizontalLineToRelative(0.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 4.25f, -1.77f)
                lineTo(172.0f, 52.66f)
                curveToRelative(8.58f, -8.58f, 22.52f, -9.0f, 31.08f, -0.85f)
                arcToRelative(22.0f, 22.0f, 0.0f, false, true, 0.44f, 31.57f)
                close()
            }
        }
        .build()
        return _eyedropper!!
    }

private var _eyedropper: ImageVector? = null
