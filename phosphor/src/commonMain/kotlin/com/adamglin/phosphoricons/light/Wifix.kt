package com.adamglin.phosphoricons.light

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.adamglin.phosphoricons.LightGroup

public val LightGroup.WifiX: ImageVector
    get() {
        if (_wifiX != null) {
            return _wifiX!!
        }
        _wifiX = Builder(name = "WifiX", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(138.0f, 204.0f)
                arcToRelative(10.0f, 10.0f, 0.0f, true, true, -10.0f, -10.0f)
                arcTo(10.0f, 10.0f, 0.0f, false, true, 138.0f, 204.0f)
                close()
                moveTo(208.48f, 80.0f)
                lineToRelative(19.76f, -19.76f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, -8.48f, -8.48f)
                lineTo(200.0f, 71.52f)
                lineTo(180.24f, 51.76f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, -8.48f, 8.48f)
                lineTo(191.52f, 80.0f)
                lineTo(171.76f, 99.76f)
                arcToRelative(6.0f, 6.0f, 0.0f, true, false, 8.48f, 8.48f)
                lineTo(200.0f, 88.48f)
                lineToRelative(19.76f, 19.76f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 8.48f, -8.48f)
                close()
                moveTo(171.53f, 160.15f)
                arcToRelative(74.0f, 74.0f, 0.0f, false, false, -87.06f, 0.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 7.06f, 9.7f)
                arcToRelative(62.0f, 62.0f, 0.0f, false, true, 72.94f, 0.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 8.38f, -1.32f)
                arcTo(6.0f, 6.0f, 0.0f, false, false, 171.53f, 160.15f)
                close()
                moveTo(135.71f, 62.15f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 0.58f, -12.0f)
                curveToRelative(-2.75f, -0.13f, -5.54f, -0.2f, -8.29f, -0.2f)
                arcTo(170.32f, 170.32f, 0.0f, false, false, 20.19f, 88.55f)
                arcToRelative(6.0f, 6.0f, 0.0f, true, false, 7.62f, 9.27f)
                arcTo(158.26f, 158.26f, 0.0f, false, true, 128.0f, 62.0f)
                curveTo(130.56f, 62.0f, 133.16f, 62.06f, 135.71f, 62.18f)
                close()
                moveTo(135.59f, 110.23f)
                arcToRelative(6.0f, 6.0f, 0.0f, true, false, 0.82f, -12.0f)
                curveToRelative(-2.79f, -0.19f, -5.62f, -0.29f, -8.41f, -0.29f)
                arcToRelative(120.75f, 120.75f, 0.0f, false, false, -75.73f, 26.34f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 7.46f, 9.41f)
                arcTo(108.78f, 108.78f, 0.0f, false, true, 128.0f, 110.0f)
                curveTo(130.52f, 110.0f, 133.08f, 110.09f, 135.59f, 110.26f)
                close()
            }
        }
        .build()
        return _wifiX!!
    }

private var _wifiX: ImageVector? = null
