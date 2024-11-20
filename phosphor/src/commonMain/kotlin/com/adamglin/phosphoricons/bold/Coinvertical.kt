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

public val BoldGroup.CoinVertical: ImageVector
    get() {
        if (_coinVertical != null) {
            return _coinVertical!!
        }
        _coinVertical = Builder(name = "CoinVertical", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(152.0f, 20.0f)
                lineTo(104.0f, 20.0f)
                curveTo(65.87f, 20.0f, 36.0f, 67.44f, 36.0f, 128.0f)
                reflectiveCurveToRelative(29.87f, 108.0f, 68.0f, 108.0f)
                horizontalLineToRelative(48.0f)
                curveToRelative(38.13f, 0.0f, 68.0f, -47.44f, 68.0f, -108.0f)
                reflectiveCurveTo(190.13f, 20.0f, 152.0f, 20.0f)
                close()
                moveTo(189.21f, 172.0f)
                horizontalLineToRelative(-22.9f)
                arcToRelative(162.62f, 162.62f, 0.0f, false, false, 5.29f, -32.0f)
                horizontalLineToRelative(23.93f)
                arcTo(133.22f, 133.22f, 0.0f, false, true, 189.21f, 172.0f)
                close()
                moveTo(171.6f, 116.0f)
                arcToRelative(162.62f, 162.62f, 0.0f, false, false, -5.29f, -32.0f)
                horizontalLineToRelative(22.9f)
                arcToRelative(133.22f, 133.22f, 0.0f, false, true, 6.32f, 32.0f)
                close()
                moveTo(177.23f, 60.0f)
                horizontalLineToRelative(-20.0f)
                arcToRelative(98.26f, 98.26f, 0.0f, false, false, -10.0f, -16.0f)
                lineTo(152.0f, 44.0f)
                curveTo(157.37f, 44.0f, 167.25f, 46.25f, 177.23f, 60.0f)
                close()
                moveTo(74.77f, 189.84f)
                curveTo(65.24f, 173.51f, 60.0f, 151.55f, 60.0f, 128.0f)
                reflectiveCurveToRelative(5.24f, -45.51f, 14.77f, -61.84f)
                curveTo(86.0f, 46.88f, 97.91f, 44.0f, 104.0f, 44.0f)
                reflectiveCurveToRelative(18.0f, 2.88f, 29.23f, 22.16f)
                curveTo(142.76f, 82.49f, 148.0f, 104.45f, 148.0f, 128.0f)
                reflectiveCurveToRelative(-5.24f, 45.51f, -14.77f, 61.84f)
                curveTo(122.0f, 209.12f, 110.09f, 212.0f, 104.0f, 212.0f)
                reflectiveCurveTo(86.0f, 209.12f, 74.77f, 189.84f)
                close()
                moveTo(152.0f, 212.0f)
                horizontalLineToRelative(-4.79f)
                arcToRelative(98.26f, 98.26f, 0.0f, false, false, 10.0f, -16.0f)
                horizontalLineToRelative(20.0f)
                curveTo(167.25f, 209.75f, 157.37f, 212.0f, 152.0f, 212.0f)
                close()
            }
        }
        .build()
        return _coinVertical!!
    }

private var _coinVertical: ImageVector? = null
