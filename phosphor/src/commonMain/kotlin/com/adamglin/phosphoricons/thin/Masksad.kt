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

public val ThinGroup.MaskSad: ImageVector
    get() {
        if (_maskSad != null) {
            return _maskSad!!
        }
        _maskSad = Builder(name = "MaskSad", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(155.33f, 186.21f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -5.54f, 1.12f)
                curveTo(142.8f, 182.69f, 137.0f, 180.0f, 128.0f, 180.0f)
                reflectiveCurveToRelative(-14.8f, 2.69f, -21.79f, 7.33f)
                arcToRelative(4.0f, 4.0f, 0.0f, true, true, -4.42f, -6.66f)
                curveToRelative(7.82f, -5.21f, 15.28f, -8.67f, 26.21f, -8.67f)
                reflectiveCurveToRelative(18.39f, 3.46f, 26.21f, 8.67f)
                arcTo(4.0f, 4.0f, 0.0f, false, true, 155.33f, 186.21f)
                close()
                moveTo(181.0f, 117.33f)
                curveToRelative(-3.4f, 3.8f, -10.72f, 6.67f, -17.0f, 6.67f)
                reflectiveCurveToRelative(-13.62f, -2.87f, -17.0f, -6.67f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, -6.0f, 5.33f)
                curveToRelative(4.92f, 5.5f, 14.37f, 9.34f, 23.0f, 9.34f)
                reflectiveCurveToRelative(18.06f, -3.84f, 23.0f, -9.33f)
                arcToRelative(4.0f, 4.0f, 0.0f, true, false, -6.0f, -5.34f)
                close()
                moveTo(220.0f, 48.0f)
                verticalLineToRelative(55.78f)
                curveToRelative(0.0f, 35.0f, -9.4f, 68.0f, -26.48f, 92.92f)
                curveTo(176.13f, 222.05f, 152.86f, 236.0f, 128.0f, 236.0f)
                reflectiveCurveToRelative(-48.13f, -13.95f, -65.52f, -39.29f)
                curveTo(45.4f, 171.83f, 36.0f, 138.83f, 36.0f, 103.79f)
                lineTo(36.0f, 48.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, 16.34f, -11.2f)
                curveTo(66.66f, 42.38f, 95.53f, 51.7f, 128.0f, 51.7f)
                reflectiveCurveToRelative(61.34f, -9.32f, 75.66f, -14.88f)
                arcTo(12.0f, 12.0f, 0.0f, false, true, 220.0f, 48.0f)
                close()
                moveTo(212.0f, 48.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, -5.44f, -3.74f)
                curveTo(191.72f, 50.0f, 161.77f, 59.7f, 128.0f, 59.7f)
                reflectiveCurveTo(64.28f, 50.0f, 49.44f, 44.27f)
                arcTo(4.14f, 4.14f, 0.0f, false, false, 48.0f, 44.0f)
                arcToRelative(3.87f, 3.87f, 0.0f, false, false, -2.23f, 0.7f)
                arcTo(4.0f, 4.0f, 0.0f, false, false, 44.0f, 48.0f)
                verticalLineToRelative(55.77f)
                curveTo(44.0f, 172.28f, 81.68f, 228.0f, 128.0f, 228.0f)
                reflectiveCurveToRelative(84.0f, -55.72f, 84.0f, -124.21f)
                close()
                moveTo(115.0f, 122.66f)
                arcToRelative(4.0f, 4.0f, 0.0f, true, false, -6.0f, -5.34f)
                curveToRelative(-3.4f, 3.8f, -10.72f, 6.67f, -17.0f, 6.67f)
                reflectiveCurveToRelative(-13.62f, -2.87f, -17.0f, -6.67f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, -6.0f, 5.33f)
                curveToRelative(4.92f, 5.5f, 14.37f, 9.34f, 23.0f, 9.34f)
                reflectiveCurveTo(110.06f, 128.16f, 115.0f, 122.67f)
                close()
            }
        }
        .build()
        return _maskSad!!
    }

private var _maskSad: ImageVector? = null
