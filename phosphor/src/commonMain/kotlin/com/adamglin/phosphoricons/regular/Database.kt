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

public val RegularGroup.Database: ImageVector
    get() {
        if (_database != null) {
            return _database!!
        }
        _database = Builder(name = "Database", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(128.0f, 24.0f)
                curveTo(74.17f, 24.0f, 32.0f, 48.6f, 32.0f, 80.0f)
                verticalLineToRelative(96.0f)
                curveToRelative(0.0f, 31.4f, 42.17f, 56.0f, 96.0f, 56.0f)
                reflectiveCurveToRelative(96.0f, -24.6f, 96.0f, -56.0f)
                lineTo(224.0f, 80.0f)
                curveTo(224.0f, 48.6f, 181.83f, 24.0f, 128.0f, 24.0f)
                close()
                moveTo(208.0f, 128.0f)
                curveToRelative(0.0f, 9.62f, -7.88f, 19.43f, -21.61f, 26.92f)
                curveTo(170.93f, 163.35f, 150.19f, 168.0f, 128.0f, 168.0f)
                reflectiveCurveToRelative(-42.93f, -4.65f, -58.39f, -13.08f)
                curveTo(55.88f, 147.43f, 48.0f, 137.62f, 48.0f, 128.0f)
                lineTo(48.0f, 111.36f)
                curveToRelative(17.06f, 15.0f, 46.23f, 24.64f, 80.0f, 24.64f)
                reflectiveCurveToRelative(62.94f, -9.68f, 80.0f, -24.64f)
                close()
                moveTo(69.61f, 53.08f)
                curveTo(85.07f, 44.65f, 105.81f, 40.0f, 128.0f, 40.0f)
                reflectiveCurveToRelative(42.93f, 4.65f, 58.39f, 13.08f)
                curveTo(200.12f, 60.57f, 208.0f, 70.38f, 208.0f, 80.0f)
                reflectiveCurveToRelative(-7.88f, 19.43f, -21.61f, 26.92f)
                curveTo(170.93f, 115.35f, 150.19f, 120.0f, 128.0f, 120.0f)
                reflectiveCurveToRelative(-42.93f, -4.65f, -58.39f, -13.08f)
                curveTo(55.88f, 99.43f, 48.0f, 89.62f, 48.0f, 80.0f)
                reflectiveCurveTo(55.88f, 60.57f, 69.61f, 53.08f)
                close()
                moveTo(186.39f, 202.92f)
                curveTo(170.93f, 211.35f, 150.19f, 216.0f, 128.0f, 216.0f)
                reflectiveCurveToRelative(-42.93f, -4.65f, -58.39f, -13.08f)
                curveTo(55.88f, 195.43f, 48.0f, 185.62f, 48.0f, 176.0f)
                lineTo(48.0f, 159.36f)
                curveToRelative(17.06f, 15.0f, 46.23f, 24.64f, 80.0f, 24.64f)
                reflectiveCurveToRelative(62.94f, -9.68f, 80.0f, -24.64f)
                lineTo(208.0f, 176.0f)
                curveTo(208.0f, 185.62f, 200.12f, 195.43f, 186.39f, 202.92f)
                close()
            }
        }
        .build()
        return _database!!
    }

private var _database: ImageVector? = null
