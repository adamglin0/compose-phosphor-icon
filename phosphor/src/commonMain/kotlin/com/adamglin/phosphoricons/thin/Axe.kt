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

public val ThinGroup.Axe: ImageVector
    get() {
        if (_axe != null) {
            return _axe!!
        }
        _axe = Builder(name = "Axe", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(251.36f, 99.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, -9.86f, -8.09f)
                arcTo(141.13f, 141.13f, 0.0f, false, true, 184.0f, 69.67f)
                lineTo(197.86f, 55.8f)
                arcTo(21.0f, 21.0f, 0.0f, false, false, 168.2f, 26.14f)
                lineTo(152.0f, 42.39f)
                arcToRelative(107.24f, 107.24f, 0.0f, false, true, -7.47f, -9.27f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, -18.29f, -1.61f)
                lineTo(87.51f, 70.18f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 1.61f, 18.3f)
                arcTo(107.24f, 107.24f, 0.0f, false, true, 98.39f, 96.0f)
                lineTo(10.14f, 184.2f)
                arcTo(21.0f, 21.0f, 0.0f, false, false, 39.8f, 213.86f)
                lineTo(125.67f, 128.0f)
                arcToRelative(141.0f, 141.0f, 0.0f, false, true, 21.24f, 57.52f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 20.38f, 7.0f)
                lineToRelative(81.19f, -81.19f)
                arcTo(11.89f, 11.89f, 0.0f, false, false, 251.36f, 99.0f)
                close()
                moveTo(173.86f, 31.8f)
                arcTo(13.0f, 13.0f, 0.0f, true, true, 192.2f, 50.14f)
                lineToRelative(-15.0f, 15.0f)
                arcToRelative(156.72f, 156.72f, 0.0f, false, true, -19.81f, -16.88f)
                close()
                moveTo(34.14f, 208.2f)
                arcTo(13.0f, 13.0f, 0.0f, true, true, 15.8f, 189.86f)
                lineToRelative(88.43f, -88.43f)
                arcToRelative(156.72f, 156.72f, 0.0f, false, true, 16.88f, 19.81f)
                close()
                moveTo(242.82f, 105.64f)
                lineToRelative(-81.18f, 81.18f)
                arcToRelative(3.86f, 3.86f, 0.0f, false, true, -4.08f, 1.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -2.72f, -3.34f)
                curveTo(146.3f, 120.51f, 99.07f, 85.69f, 93.72f, 81.93f)
                arcTo(4.0f, 4.0f, 0.0f, false, true, 92.0f, 79.0f)
                arcToRelative(3.9f, 3.9f, 0.0f, false, true, 1.14f, -3.15f)
                lineToRelative(38.68f, -38.68f)
                arcToRelative(3.92f, 3.92f, 0.0f, false, true, 2.8f, -1.16f)
                lineToRelative(0.35f, 0.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 2.94f, 1.7f)
                curveToRelative(3.76f, 5.35f, 38.58f, 52.58f, 102.52f, 61.11f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 3.33f, 2.73f)
                arcTo(3.86f, 3.86f, 0.0f, false, true, 242.82f, 105.64f)
                close()
            }
        }
        .build()
        return _axe!!
    }

private var _axe: ImageVector? = null
