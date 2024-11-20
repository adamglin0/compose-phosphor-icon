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

public val ThinGroup.ThermometerHot: ImageVector
    get() {
        if (_thermometerHot != null) {
            return _thermometerHot!!
        }
        _thermometerHot = Builder(name = "ThermometerHot", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(124.0f, 156.29f)
                lineTo(124.0f, 48.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, -8.0f, 0.0f)
                lineTo(116.0f, 156.29f)
                arcToRelative(28.0f, 28.0f, 0.0f, true, false, 8.0f, 0.0f)
                close()
                moveTo(120.0f, 204.0f)
                arcToRelative(20.0f, 20.0f, 0.0f, true, true, 20.0f, -20.0f)
                arcTo(20.0f, 20.0f, 0.0f, false, true, 120.0f, 204.0f)
                close()
                moveTo(156.0f, 136.0f)
                lineTo(156.0f, 48.0f)
                arcToRelative(36.0f, 36.0f, 0.0f, false, false, -72.0f, 0.0f)
                verticalLineToRelative(88.0f)
                arcToRelative(60.0f, 60.0f, 0.0f, true, false, 72.0f, 0.0f)
                close()
                moveTo(120.0f, 236.0f)
                arcToRelative(52.0f, 52.0f, 0.0f, false, true, -29.71f, -94.68f)
                arcTo(4.0f, 4.0f, 0.0f, false, false, 92.0f, 138.0f)
                lineTo(92.0f, 48.0f)
                arcToRelative(28.0f, 28.0f, 0.0f, false, true, 56.0f, 0.0f)
                verticalLineToRelative(90.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 1.71f, 3.28f)
                arcTo(52.0f, 52.0f, 0.0f, false, true, 120.0f, 236.0f)
                close()
                moveTo(180.65f, 78.59f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 1.17f, -5.54f)
                curveToRelative(13.24f, -8.63f, 23.07f, -4.43f, 31.75f, -0.73f)
                curveToRelative(8.15f, 3.48f, 14.58f, 6.22f, 24.25f, -0.07f)
                arcToRelative(4.0f, 4.0f, 0.0f, true, true, 4.36f, 6.7f)
                curveTo(236.43f, 82.7f, 231.32f, 84.0f, 226.67f, 84.0f)
                curveToRelative(-6.06f, 0.0f, -11.33f, -2.25f, -16.24f, -4.34f)
                curveToRelative(-8.15f, -3.47f, -14.58f, -6.22f, -24.25f, 0.07f)
                arcTo(4.0f, 4.0f, 0.0f, false, true, 180.65f, 78.59f)
                close()
                moveTo(243.35f, 105.41f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -1.17f, 5.54f)
                curveToRelative(-5.75f, 3.75f, -10.86f, 5.07f, -15.51f, 5.07f)
                curveToRelative(-6.06f, 0.0f, -11.33f, -2.25f, -16.24f, -4.34f)
                curveToRelative(-8.15f, -3.47f, -14.58f, -6.22f, -24.25f, 0.07f)
                arcToRelative(4.0f, 4.0f, 0.0f, true, true, -4.36f, -6.7f)
                curveToRelative(13.24f, -8.63f, 23.07f, -4.43f, 31.75f, -0.73f)
                curveToRelative(8.15f, 3.48f, 14.58f, 6.22f, 24.25f, -0.07f)
                arcTo(4.0f, 4.0f, 0.0f, false, true, 243.35f, 105.41f)
                close()
            }
        }
        .build()
        return _thermometerHot!!
    }

private var _thermometerHot: ImageVector? = null
