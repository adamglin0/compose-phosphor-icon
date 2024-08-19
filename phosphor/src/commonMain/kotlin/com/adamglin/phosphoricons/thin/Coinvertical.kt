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

public val ThinGroup.Coinvertical: ImageVector
    get() {
        if (_coinvertical != null) {
            return _coinvertical!!
        }
        _coinvertical = Builder(name = "Coinvertical", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(195.05f, 58.1f)
                curveTo(183.73f, 38.69f, 168.44f, 28.0f, 152.0f, 28.0f)
                lineTo(104.0f, 28.0f)
                curveTo(87.56f, 28.0f, 72.27f, 38.69f, 61.0f, 58.1f)
                curveTo(50.0f, 76.84f, 44.0f, 101.66f, 44.0f, 128.0f)
                reflectiveCurveToRelative(6.0f, 51.16f, 17.0f, 69.9f)
                curveTo(72.27f, 217.31f, 87.56f, 228.0f, 104.0f, 228.0f)
                horizontalLineToRelative(48.0f)
                curveToRelative(16.44f, 0.0f, 31.73f, -10.69f, 43.05f, -30.1f)
                curveTo(206.0f, 179.16f, 212.0f, 154.34f, 212.0f, 128.0f)
                reflectiveCurveTo(206.0f, 76.84f, 195.05f, 58.1f)
                close()
                moveTo(191.27f, 188.0f)
                lineTo(152.1f, 188.0f)
                curveToRelative(7.24f, -16.14f, 11.37f, -35.53f, 11.84f, -56.0f)
                horizontalLineToRelative(40.0f)
                curveTo(203.44f, 152.77f, 199.0f, 172.28f, 191.27f, 188.0f)
                close()
                moveTo(163.94f, 124.0f)
                curveToRelative(-0.47f, -20.47f, -4.6f, -39.86f, -11.84f, -56.0f)
                horizontalLineToRelative(39.17f)
                curveToRelative(7.74f, 15.72f, 12.17f, 35.23f, 12.67f, 56.0f)
                close()
                moveTo(152.0f, 36.0f)
                curveToRelative(12.89f, 0.0f, 25.19f, 8.51f, 34.84f, 24.0f)
                lineTo(148.11f, 60.0f)
                curveToRelative(-0.35f, -0.63f, -0.7f, -1.28f, -1.06f, -1.9f)
                curveToRelative(-5.58f, -9.56f, -12.12f, -17.0f, -19.29f, -22.1f)
                close()
                moveTo(67.86f, 193.87f)
                curveTo(57.63f, 176.34f, 52.0f, 153.0f, 52.0f, 128.0f)
                reflectiveCurveToRelative(5.63f, -48.34f, 15.86f, -65.87f)
                curveTo(77.69f, 45.28f, 90.52f, 36.0f, 104.0f, 36.0f)
                reflectiveCurveToRelative(26.31f, 9.28f, 36.14f, 26.13f)
                curveTo(150.37f, 79.66f, 156.0f, 103.05f, 156.0f, 128.0f)
                reflectiveCurveToRelative(-5.63f, 48.34f, -15.86f, 65.87f)
                curveTo(130.31f, 210.72f, 117.48f, 220.0f, 104.0f, 220.0f)
                reflectiveCurveTo(77.69f, 210.72f, 67.86f, 193.87f)
                close()
                moveTo(152.0f, 220.0f)
                lineTo(127.76f, 220.0f)
                curveToRelative(7.17f, -5.09f, 13.71f, -12.54f, 19.29f, -22.1f)
                curveToRelative(0.36f, -0.62f, 0.71f, -1.27f, 1.06f, -1.9f)
                horizontalLineToRelative(38.73f)
                curveTo(177.19f, 211.49f, 164.89f, 220.0f, 152.0f, 220.0f)
                close()
            }
        }
        .build()
        return _coinvertical!!
    }

private var _coinvertical: ImageVector? = null
