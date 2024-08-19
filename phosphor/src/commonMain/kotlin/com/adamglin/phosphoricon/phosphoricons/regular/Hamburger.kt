package com.adamglin.phosphoricon.phosphoricons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.adamglin.phosphoricon.phosphoricons.RegularGroup

public val RegularGroup.Hamburger: ImageVector
    get() {
        if (_hamburger != null) {
            return _hamburger!!
        }
        _hamburger = Builder(name = "Hamburger", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(48.07f, 104.0f)
                horizontalLineTo(207.93f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, 15.72f, -19.38f)
                curveTo(216.22f, 49.5f, 176.0f, 24.0f, 128.0f, 24.0f)
                reflectiveCurveTo(39.78f, 49.5f, 32.35f, 84.62f)
                arcTo(16.0f, 16.0f, 0.0f, false, false, 48.07f, 104.0f)
                close()
                moveTo(128.0f, 40.0f)
                curveToRelative(39.82f, 0.0f, 74.21f, 20.61f, 79.93f, 48.0f)
                horizontalLineTo(48.07f)
                lineTo(48.0f, 87.93f)
                curveTo(53.79f, 60.61f, 88.18f, 40.0f, 128.0f, 40.0f)
                close()
                moveTo(229.26f, 152.48f)
                lineToRelative(-41.13f, 15.0f)
                lineTo(151.0f, 152.57f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -5.94f, 0.0f)
                lineToRelative(-37.0f, 14.81f)
                lineTo(71.0f, 152.57f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -5.7f, -0.09f)
                lineToRelative(-44.0f, 16.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 5.47f, 15.0f)
                lineTo(40.0f, 178.69f)
                verticalLineTo(184.0f)
                arcToRelative(40.0f, 40.0f, 0.0f, false, false, 40.0f, 40.0f)
                horizontalLineToRelative(96.0f)
                arcToRelative(40.0f, 40.0f, 0.0f, false, false, 40.0f, -40.0f)
                verticalLineToRelative(-9.67f)
                lineToRelative(18.73f, -6.81f)
                arcToRelative(8.0f, 8.0f, 0.0f, true, false, -5.47f, -15.0f)
                close()
                moveTo(200.0f, 184.0f)
                arcToRelative(24.0f, 24.0f, 0.0f, false, true, -24.0f, 24.0f)
                horizontalLineTo(80.0f)
                arcToRelative(24.0f, 24.0f, 0.0f, false, true, -24.0f, -24.0f)
                verticalLineTo(172.88f)
                lineToRelative(11.87f, -4.32f)
                lineTo(105.0f, 183.43f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 5.94f, 0.0f)
                lineToRelative(37.0f, -14.81f)
                lineToRelative(37.0f, 14.81f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 5.7f, 0.09f)
                lineToRelative(9.27f, -3.37f)
                close()
                moveTo(16.0f, 128.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 8.0f, -8.0f)
                horizontalLineTo(232.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 0.0f, 16.0f)
                horizontalLineTo(24.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, true, 16.0f, 128.0f)
                close()
            }
        }
        .build()
        return _hamburger!!
    }

private var _hamburger: ImageVector? = null
