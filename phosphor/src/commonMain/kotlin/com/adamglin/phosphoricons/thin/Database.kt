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

public val ThinGroup.Database: ImageVector
    get() {
        if (_database != null) {
            return _database!!
        }
        _database = Builder(name = "Database", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(192.14f, 42.55f)
                curveTo(174.94f, 33.17f, 152.16f, 28.0f, 128.0f, 28.0f)
                reflectiveCurveTo(81.06f, 33.17f, 63.86f, 42.55f)
                curveTo(45.89f, 52.35f, 36.0f, 65.65f, 36.0f, 80.0f)
                verticalLineToRelative(96.0f)
                curveToRelative(0.0f, 14.35f, 9.89f, 27.65f, 27.86f, 37.45f)
                curveToRelative(17.2f, 9.38f, 40.0f, 14.55f, 64.14f, 14.55f)
                reflectiveCurveToRelative(46.94f, -5.17f, 64.14f, -14.55f)
                curveToRelative(18.0f, -9.8f, 27.86f, -23.1f, 27.86f, -37.45f)
                lineTo(220.0f, 80.0f)
                curveTo(220.0f, 65.65f, 210.11f, 52.35f, 192.14f, 42.55f)
                close()
                moveTo(212.0f, 176.0f)
                curveToRelative(0.0f, 11.29f, -8.41f, 22.1f, -23.69f, 30.43f)
                curveTo(172.27f, 215.18f, 150.85f, 220.0f, 128.0f, 220.0f)
                reflectiveCurveToRelative(-44.27f, -4.82f, -60.31f, -13.57f)
                curveTo(52.41f, 198.1f, 44.0f, 187.29f, 44.0f, 176.0f)
                lineTo(44.0f, 149.48f)
                curveToRelative(4.69f, 5.93f, 11.37f, 11.34f, 19.86f, 16.0f)
                curveToRelative(17.2f, 9.38f, 40.0f, 14.55f, 64.14f, 14.55f)
                reflectiveCurveToRelative(46.94f, -5.17f, 64.14f, -14.55f)
                curveToRelative(8.49f, -4.63f, 15.17f, -10.0f, 19.86f, -16.0f)
                close()
                moveTo(212.0f, 128.0f)
                curveToRelative(0.0f, 11.29f, -8.41f, 22.1f, -23.69f, 30.43f)
                curveTo(172.27f, 167.18f, 150.85f, 172.0f, 128.0f, 172.0f)
                reflectiveCurveToRelative(-44.27f, -4.82f, -60.31f, -13.57f)
                curveTo(52.41f, 150.1f, 44.0f, 139.29f, 44.0f, 128.0f)
                lineTo(44.0f, 101.48f)
                curveToRelative(4.69f, 5.93f, 11.37f, 11.34f, 19.86f, 16.0f)
                curveToRelative(17.2f, 9.38f, 40.0f, 14.55f, 64.14f, 14.55f)
                reflectiveCurveToRelative(46.94f, -5.17f, 64.14f, -14.55f)
                curveToRelative(8.49f, -4.63f, 15.17f, -10.0f, 19.86f, -16.0f)
                close()
                moveTo(188.31f, 110.43f)
                curveTo(172.27f, 119.18f, 150.85f, 124.0f, 128.0f, 124.0f)
                reflectiveCurveToRelative(-44.27f, -4.82f, -60.31f, -13.57f)
                curveTo(52.41f, 102.1f, 44.0f, 91.29f, 44.0f, 80.0f)
                reflectiveCurveToRelative(8.41f, -22.1f, 23.69f, -30.43f)
                curveTo(83.73f, 40.82f, 105.15f, 36.0f, 128.0f, 36.0f)
                reflectiveCurveToRelative(44.27f, 4.82f, 60.31f, 13.57f)
                curveTo(203.59f, 57.9f, 212.0f, 68.71f, 212.0f, 80.0f)
                reflectiveCurveTo(203.59f, 102.1f, 188.31f, 110.43f)
                close()
            }
        }
        .build()
        return _database!!
    }

private var _database: ImageVector? = null
