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

public val FillGroup.Signature: ImageVector
    get() {
        if (_signature != null) {
            return _signature!!
        }
        _signature = Builder(name = "Signature", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(80.3f, 120.26f)
                arcTo(58.29f, 58.29f, 0.0f, false, true, 81.0f, 97.07f)
                curveTo(83.32f, 87.0f, 87.89f, 80.0f, 92.1f, 80.0f)
                curveToRelative(2.57f, 0.0f, 2.94f, 0.67f, 3.12f, 1.0f)
                curveToRelative(0.88f, 1.61f, 4.0f, 10.93f, -12.63f, 46.52f)
                arcTo(28.87f, 28.87f, 0.0f, false, true, 80.3f, 120.26f)
                close()
                moveTo(232.0f, 56.0f)
                verticalLineTo(200.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, true, -16.0f, 16.0f)
                horizontalLineTo(40.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, true, -16.0f, -16.0f)
                verticalLineTo(56.0f)
                arcTo(16.0f, 16.0f, 0.0f, false, true, 40.0f, 40.0f)
                horizontalLineTo(216.0f)
                arcTo(16.0f, 16.0f, 0.0f, false, true, 232.0f, 56.0f)
                close()
                moveTo(84.0f, 160.0f)
                curveToRelative(2.0f, -3.59f, 3.94f, -7.32f, 5.9f, -11.14f)
                curveToRelative(10.34f, -0.32f, 22.21f, -7.57f, 35.47f, -21.68f)
                curveToRelative(5.0f, 9.69f, 11.38f, 15.25f, 18.87f, 16.55f)
                curveToRelative(8.0f, 1.38f, 16.0f, -2.38f, 23.94f, -11.2f)
                curveToRelative(6.0f, 5.53f, 16.15f, 11.47f, 31.8f, 11.47f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 0.0f, -16.0f)
                curveToRelative(-17.91f, 0.0f, -24.3f, -10.88f, -24.84f, -11.86f)
                arcToRelative(7.83f, 7.83f, 0.0f, false, false, -6.54f, -4.51f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -7.25f, 3.6f)
                curveToRelative(-6.78f, 10.0f, -11.87f, 13.16f, -14.39f, 12.73f)
                curveToRelative(-4.0f, -0.69f, -9.15f, -10.0f, -11.23f, -18.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -14.0f, -3.0f)
                curveToRelative(-8.88f, 10.94f, -16.3f, 17.79f, -22.13f, 21.66f)
                curveToRelative(15.8f, -35.65f, 13.27f, -48.59f, 9.6f, -55.3f)
                curveTo(107.35f, 69.84f, 102.59f, 64.0f, 92.1f, 64.0f)
                curveTo(79.66f, 64.0f, 69.68f, 75.0f, 65.41f, 93.46f)
                arcToRelative(75.0f, 75.0f, 0.0f, false, false, -0.83f, 29.81f)
                curveToRelative(1.7f, 8.9f, 5.17f, 15.73f, 10.16f, 20.12f)
                curveToRelative(-3.0f, 5.81f, -6.09f, 11.43f, -9.0f, 16.61f)
                horizontalLineTo(56.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 0.0f, 16.0f)
                horizontalLineToRelative(0.44f)
                curveToRelative(-4.26f, 7.12f, -7.11f, 11.59f, -7.18f, 11.69f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 13.48f, 8.62f)
                curveToRelative(0.36f, -0.55f, 5.47f, -8.57f, 12.29f, -20.31f)
                horizontalLineTo(200.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 0.0f, -16.0f)
                close()
            }
        }
        .build()
        return _signature!!
    }

private var _signature: ImageVector? = null
