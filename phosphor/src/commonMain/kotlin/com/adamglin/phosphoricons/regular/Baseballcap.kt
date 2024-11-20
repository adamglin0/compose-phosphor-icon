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

public val RegularGroup.BaseballCap: ImageVector
    get() {
        if (_baseballCap != null) {
            return _baseballCap!!
        }
        _baseballCap = Builder(name = "BaseballCap", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(128.0f, 24.0f)
                horizontalLineToRelative(0.0f)
                arcTo(104.12f, 104.12f, 0.0f, false, false, 24.0f, 128.0f)
                verticalLineToRelative(56.0f)
                arcToRelative(24.0f, 24.0f, 0.0f, false, false, 24.0f, 24.0f)
                arcToRelative(24.11f, 24.11f, 0.0f, false, false, 14.18f, -4.64f)
                curveTo(74.33f, 194.53f, 95.6f, 184.0f, 128.0f, 184.0f)
                reflectiveCurveToRelative(53.67f, 10.52f, 65.81f, 19.35f)
                arcTo(24.0f, 24.0f, 0.0f, false, false, 232.0f, 184.0f)
                lineTo(232.0f, 128.0f)
                arcTo(104.12f, 104.12f, 0.0f, false, false, 128.0f, 24.0f)
                close()
                moveTo(216.0f, 128.0f)
                verticalLineToRelative(8.87f)
                arcToRelative(166.0f, 166.0f, 0.0f, false, false, -40.94f, -18.22f)
                arcTo(167.0f, 167.0f, 0.0f, false, false, 146.19f, 41.9f)
                arcTo(88.14f, 88.14f, 0.0f, false, true, 216.0f, 128.0f)
                close()
                moveTo(128.0f, 44.27f)
                arcToRelative(152.47f, 152.47f, 0.0f, false, true, 30.4f, 70.46f)
                arcToRelative(170.85f, 170.85f, 0.0f, false, false, -60.84f, 0.0f)
                arcTo(153.31f, 153.31f, 0.0f, false, true, 128.0f, 44.27f)
                close()
                moveTo(109.81f, 41.9f)
                arcToRelative(167.0f, 167.0f, 0.0f, false, false, -28.87f, 76.76f)
                arcTo(166.0f, 166.0f, 0.0f, false, false, 40.0f, 136.88f)
                lineTo(40.0f, 128.0f)
                arcTo(88.14f, 88.14f, 0.0f, false, true, 109.81f, 41.9f)
                close()
                moveTo(211.66f, 191.11f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -8.44f, -0.69f)
                curveTo(189.16f, 180.2f, 164.7f, 168.0f, 128.0f, 168.0f)
                reflectiveCurveTo(66.84f, 180.2f, 52.78f, 190.42f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -8.44f, 0.69f)
                arcTo(7.77f, 7.77f, 0.0f, false, true, 40.0f, 184.0f)
                lineTo(40.0f, 156.07f)
                arcToRelative(152.0f, 152.0f, 0.0f, false, true, 176.0f, 0.0f)
                lineTo(216.0f, 184.0f)
                arcTo(7.77f, 7.77f, 0.0f, false, true, 211.66f, 191.11f)
                close()
            }
        }
        .build()
        return _baseballCap!!
    }

private var _baseballCap: ImageVector? = null
