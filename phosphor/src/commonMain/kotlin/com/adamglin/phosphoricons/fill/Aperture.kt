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

public val FillGroup.Aperture: ImageVector
    get() {
        if (_aperture != null) {
            return _aperture!!
        }
        _aperture = Builder(name = "Aperture", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(232.0f, 128.0f)
                arcTo(104.0f, 104.0f, 0.0f, false, false, 54.46f, 54.46f)
                arcTo(104.0f, 104.0f, 0.0f, false, false, 128.0f, 232.0f)
                horizontalLineToRelative(0.09f)
                arcTo(104.0f, 104.0f, 0.0f, false, false, 232.0f, 128.0f)
                close()
                moveTo(49.18f, 88.92f)
                lineToRelative(51.21f, 9.35f)
                lineTo(46.65f, 161.53f)
                arcTo(88.39f, 88.39f, 0.0f, false, true, 49.18f, 88.92f)
                close()
                moveTo(209.35f, 94.46f)
                arcToRelative(88.41f, 88.41f, 0.0f, false, true, -2.53f, 72.62f)
                lineToRelative(-51.21f, -9.35f)
                close()
                moveTo(201.27f, 79.26f)
                lineTo(167.55f, 119.0f)
                lineTo(139.63f, 40.78f)
                arcToRelative(87.38f, 87.38f, 0.0f, false, true, 50.6f, 25.0f)
                arcTo(88.74f, 88.74f, 0.0f, false, true, 201.27f, 79.26f)
                close()
                moveTo(122.43f, 40.19f)
                lineToRelative(17.51f, 49.0f)
                lineTo(58.3f, 74.32f)
                arcToRelative(89.28f, 89.28f, 0.0f, false, true, 7.47f, -8.55f)
                arcTo(87.37f, 87.37f, 0.0f, false, true, 122.43f, 40.19f)
                close()
                moveTo(54.73f, 176.74f)
                lineTo(88.45f, 137.0f)
                lineToRelative(27.92f, 78.18f)
                arcToRelative(88.0f, 88.0f, 0.0f, false, true, -61.64f, -38.48f)
                close()
                moveTo(133.57f, 215.8f)
                lineTo(116.06f, 166.8f)
                lineTo(139.14f, 171.0f)
                horizontalLineToRelative(0.0f)
                lineToRelative(58.52f, 10.69f)
                arcToRelative(87.5f, 87.5f, 0.0f, false, true, -64.13f, 34.12f)
                close()
            }
        }
        .build()
        return _aperture!!
    }

private var _aperture: ImageVector? = null
