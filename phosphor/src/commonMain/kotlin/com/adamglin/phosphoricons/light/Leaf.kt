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

public val LightGroup.Leaf: ImageVector
    get() {
        if (_leaf != null) {
            return _leaf!!
        }
        _leaf = Builder(name = "Leaf", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(221.45f, 40.19f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, -5.64f, -5.64f)
                curveTo(140.43f, 30.11f, 80.14f, 52.71f, 54.53f, 95.0f)
                curveToRelative(-17.44f, 28.79f, -16.76f, 62.8f, 1.79f, 96.2f)
                lineTo(35.76f, 211.76f)
                arcToRelative(6.0f, 6.0f, 0.0f, true, false, 8.48f, 8.48f)
                lineTo(64.8f, 199.68f)
                curveToRelative(17.27f, 9.59f, 34.7f, 14.41f, 51.49f, 14.41f)
                arcTo(85.38f, 85.38f, 0.0f, false, false, 161.0f, 201.47f)
                curveTo(203.29f, 175.86f, 225.88f, 115.57f, 221.45f, 40.19f)
                close()
                moveTo(154.79f, 191.19f)
                curveToRelative(-24.08f, 14.58f, -52.64f, 14.37f, -81.13f, -0.39f)
                lineToRelative(90.59f, -90.59f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, -8.48f, -8.48f)
                lineTo(65.18f, 182.34f)
                curveToRelative(-14.76f, -28.49f, -15.0f, -57.0f, -0.39f, -81.13f)
                curveToRelative(22.68f, -37.43f, 76.63f, -57.8f, 145.0f, -54.95f)
                curveTo(212.59f, 114.58f, 192.22f, 168.54f, 154.79f, 191.21f)
                close()
            }
        }
        .build()
        return _leaf!!
    }

private var _leaf: ImageVector? = null
