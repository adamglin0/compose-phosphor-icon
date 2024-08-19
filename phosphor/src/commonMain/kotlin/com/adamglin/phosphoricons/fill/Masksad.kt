package com.adamglin.phosphoricons.fill

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.adamglin.phosphoricons.FillGroup

public val FillGroup.Masksad: ImageVector
    get() {
        if (_masksad != null) {
            return _masksad!!
        }
        _masksad = Builder(name = "Masksad", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(217.0f, 34.8f)
                arcToRelative(15.94f, 15.94f, 0.0f, false, false, -14.82f, -1.71f)
                curveTo(188.15f, 38.55f, 159.82f, 47.71f, 128.0f, 47.71f)
                reflectiveCurveTo(67.84f, 38.55f, 53.79f, 33.09f)
                arcTo(16.0f, 16.0f, 0.0f, false, false, 32.0f, 48.0f)
                verticalLineToRelative(55.77f)
                curveToRelative(0.0f, 35.84f, 9.65f, 69.65f, 27.18f, 95.18f)
                curveToRelative(18.16f, 26.46f, 42.6f, 41.0f, 68.82f, 41.0f)
                reflectiveCurveToRelative(50.66f, -14.57f, 68.82f, -41.0f)
                curveTo(214.35f, 173.44f, 224.0f, 139.63f, 224.0f, 103.79f)
                lineTo(224.0f, 48.0f)
                arcTo(16.0f, 16.0f, 0.0f, false, false, 217.0f, 34.8f)
                close()
                moveTo(66.0f, 125.33f)
                arcTo(8.0f, 8.0f, 0.0f, false, true, 78.0f, 114.66f)
                curveToRelative(2.68f, 3.0f, 8.85f, 5.34f, 14.0f, 5.34f)
                reflectiveCurveToRelative(11.36f, -2.35f, 14.0f, -5.34f)
                arcTo(8.0f, 8.0f, 0.0f, false, true, 118.0f, 125.33f)
                curveTo(112.25f, 131.71f, 101.82f, 136.0f, 92.0f, 136.0f)
                reflectiveCurveTo(71.75f, 131.71f, 66.0f, 125.33f)
                close()
                moveTo(158.62f, 188.43f)
                arcTo(8.0f, 8.0f, 0.0f, false, true, 152.0f, 192.0f)
                arcToRelative(7.92f, 7.92f, 0.0f, false, true, -4.42f, -1.34f)
                curveTo(141.07f, 186.34f, 136.0f, 184.0f, 128.0f, 184.0f)
                reflectiveCurveToRelative(-13.07f, 2.34f, -19.57f, 6.66f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -8.86f, -13.32f)
                curveTo(108.0f, 171.73f, 116.06f, 168.0f, 128.0f, 168.0f)
                reflectiveCurveToRelative(20.0f, 3.73f, 28.43f, 9.34f)
                arcTo(8.0f, 8.0f, 0.0f, false, true, 158.66f, 188.43f)
                close()
                moveTo(189.92f, 125.33f)
                curveToRelative(-5.71f, 6.38f, -16.14f, 10.67f, -26.0f, 10.67f)
                reflectiveCurveToRelative(-20.25f, -4.29f, -26.0f, -10.67f)
                arcTo(8.0f, 8.0f, 0.0f, false, true, 150.0f, 114.66f)
                curveToRelative(2.68f, 3.0f, 8.85f, 5.34f, 14.0f, 5.34f)
                reflectiveCurveToRelative(11.36f, -2.35f, 14.0f, -5.34f)
                arcTo(8.0f, 8.0f, 0.0f, false, true, 190.0f, 125.33f)
                close()
            }
        }
        .build()
        return _masksad!!
    }

private var _masksad: ImageVector? = null
