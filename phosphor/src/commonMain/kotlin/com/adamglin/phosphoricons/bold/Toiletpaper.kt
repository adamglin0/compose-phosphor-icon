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

public val BoldGroup.ToiletPaper: ImageVector
    get() {
        if (_toiletPaper != null) {
            return _toiletPaper!!
        }
        _toiletPaper = Builder(name = "ToiletPaper", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(80.0f, 120.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, true, true, -16.0f, -16.0f)
                arcTo(16.0f, 16.0f, 0.0f, false, true, 80.0f, 120.0f)
                close()
                moveTo(244.0f, 120.0f)
                verticalLineToRelative(88.0f)
                arcToRelative(20.0f, 20.0f, 0.0f, false, true, -20.0f, 20.0f)
                lineTo(112.0f, 228.0f)
                arcToRelative(20.0f, 20.0f, 0.0f, false, true, -20.0f, -20.0f)
                verticalLineToRelative(-9.61f)
                curveTo(84.0f, 207.07f, 74.46f, 212.0f, 64.0f, 212.0f)
                curveToRelative(-29.65f, 0.0f, -52.0f, -39.55f, -52.0f, -92.0f)
                reflectiveCurveTo(34.35f, 28.0f, 64.0f, 28.0f)
                lineTo(192.0f, 28.0f)
                curveTo(221.65f, 28.0f, 244.0f, 67.55f, 244.0f, 120.0f)
                close()
                moveTo(92.0f, 120.0f)
                curveToRelative(0.0f, -19.26f, -3.81f, -37.92f, -10.45f, -51.2f)
                curveTo(76.29f, 58.28f, 69.73f, 52.0f, 64.0f, 52.0f)
                reflectiveCurveTo(51.71f, 58.28f, 46.45f, 68.8f)
                curveTo(39.81f, 82.08f, 36.0f, 100.74f, 36.0f, 120.0f)
                reflectiveCurveToRelative(3.81f, 37.92f, 10.45f, 51.2f)
                curveTo(51.71f, 181.72f, 58.27f, 188.0f, 64.0f, 188.0f)
                reflectiveCurveToRelative(12.29f, -6.28f, 17.55f, -16.8f)
                curveTo(88.19f, 157.92f, 92.0f, 139.26f, 92.0f, 120.0f)
                close()
                moveTo(220.0f, 204.0f)
                lineTo(220.0f, 132.0f)
                horizontalLineToRelative(-8.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, 0.0f, -24.0f)
                horizontalLineToRelative(7.5f)
                curveToRelative(-1.23f, -14.85f, -4.7f, -28.71f, -9.95f, -39.2f)
                reflectiveCurveTo(197.73f, 52.0f, 192.0f, 52.0f)
                lineTo(99.74f, 52.0f)
                curveToRelative(8.61f, 14.11f, 14.35f, 33.56f, 15.86f, 56.0f)
                lineTo(124.0f, 108.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, 0.0f, 24.0f)
                horizontalLineToRelative(-8.0f)
                verticalLineToRelative(72.0f)
                close()
                moveTo(172.0f, 108.0f)
                horizontalLineToRelative(-8.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 0.0f, 24.0f)
                horizontalLineToRelative(8.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 0.0f, -24.0f)
                close()
            }
        }
        .build()
        return _toiletPaper!!
    }

private var _toiletPaper: ImageVector? = null
