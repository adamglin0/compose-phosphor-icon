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

public val ThinGroup.ToiletPaper: ImageVector
    get() {
        if (_toiletPaper != null) {
            return _toiletPaper!!
        }
        _toiletPaper = Builder(name = "ToiletPaper", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(72.0f, 120.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, true, true, -8.0f, -8.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, true, 72.0f, 120.0f)
                close()
                moveTo(236.0f, 120.0f)
                verticalLineToRelative(88.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, -12.0f, 12.0f)
                lineTo(112.0f, 220.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, -12.0f, -12.0f)
                lineTo(100.0f, 168.86f)
                curveToRelative(-7.9f, 21.4f, -21.0f, 35.14f, -36.0f, 35.14f)
                curveToRelative(-24.67f, 0.0f, -44.0f, -36.9f, -44.0f, -84.0f)
                reflectiveCurveTo(39.33f, 36.0f, 64.0f, 36.0f)
                lineTo(192.0f, 36.0f)
                curveTo(216.67f, 36.0f, 236.0f, 72.9f, 236.0f, 120.0f)
                close()
                moveTo(100.0f, 120.0f)
                curveToRelative(0.0f, -41.2f, -16.49f, -76.0f, -36.0f, -76.0f)
                reflectiveCurveTo(28.0f, 78.8f, 28.0f, 120.0f)
                reflectiveCurveToRelative(16.49f, 76.0f, 36.0f, 76.0f)
                reflectiveCurveTo(100.0f, 161.2f, 100.0f, 120.0f)
                close()
                moveTo(228.0f, 208.0f)
                lineTo(228.0f, 124.0f)
                lineTo(208.0f, 124.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 0.0f, -8.0f)
                lineTo(228.0f, 116.0f)
                curveToRelative(-1.0f, -39.42f, -17.07f, -72.0f, -35.95f, -72.0f)
                lineTo(83.05f, 44.0f)
                curveToRelative(14.29f, 12.8f, 24.14f, 39.76f, 24.9f, 72.0f)
                horizontalLineToRelative(20.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 0.0f, 8.0f)
                lineTo(108.0f, 124.0f)
                verticalLineToRelative(84.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 4.0f, 4.0f)
                lineTo(224.0f, 212.0f)
                arcTo(4.0f, 4.0f, 0.0f, false, false, 228.0f, 208.0f)
                close()
                moveTo(176.0f, 116.0f)
                lineTo(160.0f, 116.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 0.0f, 8.0f)
                horizontalLineToRelative(16.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 0.0f, -8.0f)
                close()
            }
        }
        .build()
        return _toiletPaper!!
    }

private var _toiletPaper: ImageVector? = null
