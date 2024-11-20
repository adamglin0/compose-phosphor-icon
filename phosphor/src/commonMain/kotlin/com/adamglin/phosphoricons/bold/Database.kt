package com.adamglin.phosphoricons.bold

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.adamglin.phosphoricons.BoldGroup

public val BoldGroup.Database: ImageVector
    get() {
        if (_database != null) {
            return _database!!
        }
        _database = Builder(name = "Database", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(196.0f, 35.52f)
                curveTo(177.62f, 25.51f, 153.48f, 20.0f, 128.0f, 20.0f)
                reflectiveCurveTo(78.38f, 25.51f, 60.0f, 35.52f)
                curveTo(39.37f, 46.79f, 28.0f, 62.58f, 28.0f, 80.0f)
                verticalLineToRelative(96.0f)
                curveToRelative(0.0f, 17.42f, 11.37f, 33.21f, 32.0f, 44.48f)
                curveToRelative(18.35f, 10.0f, 42.49f, 15.52f, 68.0f, 15.52f)
                reflectiveCurveToRelative(49.62f, -5.51f, 68.0f, -15.52f)
                curveToRelative(20.66f, -11.27f, 32.0f, -27.06f, 32.0f, -44.48f)
                lineTo(228.0f, 80.0f)
                curveTo(228.0f, 62.58f, 216.63f, 46.79f, 196.0f, 35.52f)
                close()
                moveTo(204.0f, 128.0f)
                curveToRelative(0.0f, 17.0f, -31.21f, 36.0f, -76.0f, 36.0f)
                reflectiveCurveToRelative(-76.0f, -19.0f, -76.0f, -36.0f)
                verticalLineToRelative(-8.46f)
                arcToRelative(88.9f, 88.9f, 0.0f, false, false, 8.0f, 4.94f)
                curveToRelative(18.35f, 10.0f, 42.49f, 15.52f, 68.0f, 15.52f)
                reflectiveCurveToRelative(49.62f, -5.51f, 68.0f, -15.52f)
                arcToRelative(88.9f, 88.9f, 0.0f, false, false, 8.0f, -4.94f)
                close()
                moveTo(128.0f, 44.0f)
                curveToRelative(44.79f, 0.0f, 76.0f, 19.0f, 76.0f, 36.0f)
                reflectiveCurveToRelative(-31.21f, 36.0f, -76.0f, 36.0f)
                reflectiveCurveTo(52.0f, 97.0f, 52.0f, 80.0f)
                reflectiveCurveTo(83.21f, 44.0f, 128.0f, 44.0f)
                close()
                moveTo(128.0f, 212.0f)
                curveToRelative(-44.79f, 0.0f, -76.0f, -19.0f, -76.0f, -36.0f)
                verticalLineToRelative(-8.46f)
                arcToRelative(88.9f, 88.9f, 0.0f, false, false, 8.0f, 4.94f)
                curveToRelative(18.35f, 10.0f, 42.49f, 15.52f, 68.0f, 15.52f)
                reflectiveCurveToRelative(49.62f, -5.51f, 68.0f, -15.52f)
                arcToRelative(88.9f, 88.9f, 0.0f, false, false, 8.0f, -4.94f)
                lineTo(204.0f, 176.0f)
                curveTo(204.0f, 193.0f, 172.79f, 212.0f, 128.0f, 212.0f)
                close()
            }
        }
        .build()
        return _database!!
    }

private var _database: ImageVector? = null
