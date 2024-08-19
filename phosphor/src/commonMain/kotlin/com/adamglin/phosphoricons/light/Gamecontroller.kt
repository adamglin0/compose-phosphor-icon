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

public val LightGroup.Gamecontroller: ImageVector
    get() {
        if (_gamecontroller != null) {
            return _gamecontroller!!
        }
        _gamecontroller = Builder(name = "Gamecontroller", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(176.0f, 110.0f)
                lineTo(152.0f, 110.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, 0.0f, -12.0f)
                horizontalLineToRelative(24.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, 0.0f, 12.0f)
                close()
                moveTo(104.0f, 98.0f)
                lineTo(94.0f, 98.0f)
                lineTo(94.0f, 88.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, -12.0f, 0.0f)
                lineTo(82.0f, 98.0f)
                lineTo(72.0f, 98.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 0.0f, 12.0f)
                lineTo(82.0f, 110.0f)
                verticalLineToRelative(10.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 12.0f, 0.0f)
                lineTo(94.0f, 110.0f)
                horizontalLineToRelative(10.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 0.0f, -12.0f)
                close()
                moveTo(239.84f, 199.5f)
                arcTo(34.0f, 34.0f, 0.0f, false, true, 212.0f, 214.0f)
                arcTo(34.11f, 34.11f, 0.0f, false, true, 188.0f, 204.05f)
                lineToRelative(-0.26f, -0.28f)
                lineTo(147.38f, 158.0f)
                lineTo(108.62f, 158.0f)
                lineTo(68.31f, 203.76f)
                lineTo(68.0f, 204.0f)
                arcTo(34.0f, 34.0f, 0.0f, false, true, 44.0f, 214.0f)
                arcToRelative(34.0f, 34.0f, 0.0f, false, true, -33.46f, -39.91f)
                reflectiveCurveToRelative(0.0f, -0.06f, 0.0f, -0.1f)
                lineTo(26.9f, 89.88f)
                arcTo(57.89f, 57.89f, 0.0f, false, true, 83.89f, 42.0f)
                lineTo(172.0f, 42.0f)
                arcToRelative(58.07f, 58.07f, 0.0f, false, true, 57.05f, 47.63f)
                curveToRelative(0.0f, 0.07f, 0.0f, 0.12f, 0.0f, 0.19f)
                lineTo(245.46f, 174.0f)
                reflectiveCurveToRelative(0.0f, 0.07f, 0.0f, 0.11f)
                arcTo(33.75f, 33.75f, 0.0f, false, true, 239.84f, 199.5f)
                close()
                moveTo(172.0f, 146.0f)
                arcToRelative(46.0f, 46.0f, 0.0f, false, false, 0.0f, -92.0f)
                lineTo(83.89f, 54.0f)
                arcTo(45.9f, 45.9f, 0.0f, false, false, 38.71f, 92.0f)
                arcToRelative(0.36f, 0.36f, 0.0f, false, false, 0.0f, 0.1f)
                lineTo(22.33f, 176.23f)
                arcToRelative(22.0f, 22.0f, 0.0f, false, false, 37.11f, 19.45f)
                lineToRelative(42.0f, -47.65f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, 4.5f, -2.0f)
                close()
                moveTo(233.67f, 176.23f)
                lineTo(223.88f, 125.88f)
                arcTo(58.06f, 58.06f, 0.0f, false, true, 172.0f, 158.0f)
                horizontalLineToRelative(-8.63f)
                lineToRelative(33.19f, 37.68f)
                arcToRelative(22.0f, 22.0f, 0.0f, false, false, 37.11f, -19.45f)
                close()
            }
        }
        .build()
        return _gamecontroller!!
    }

private var _gamecontroller: ImageVector? = null
