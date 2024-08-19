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

public val LightGroup.Handdeposit: ImageVector
    get() {
        if (_handdeposit != null) {
            return _handdeposit!!
        }
        _handdeposit = Builder(name = "Handdeposit", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(126.0f, 30.49f)
                lineTo(126.0f, 128.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, -12.0f, 0.0f)
                lineTo(114.0f, 30.49f)
                lineTo(92.24f, 52.24f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, -8.48f, -8.48f)
                lineToRelative(32.0f, -32.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, 8.48f, 0.0f)
                lineToRelative(32.0f, 32.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, true, true, -8.48f, 8.48f)
                close()
                moveTo(190.0f, 124.69f)
                lineTo(190.0f, 96.0f)
                arcToRelative(14.0f, 14.0f, 0.0f, false, false, -14.0f, -14.0f)
                lineTo(160.0f, 82.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 0.0f, 12.0f)
                horizontalLineToRelative(16.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, 2.0f, 2.0f)
                verticalLineToRelative(86.14f)
                arcTo(26.0f, 26.0f, 0.0f, false, false, 133.49f, 209.0f)
                curveToRelative(0.0f, 0.1f, 0.11f, 0.19f, 0.17f, 0.29f)
                lineToRelative(22.26f, 34.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 10.0f, -6.58f)
                lineTo(143.8f, 202.87f)
                arcTo(14.0f, 14.0f, 0.0f, false, true, 168.13f, 189.0f)
                arcToRelative(2.75f, 2.75f, 0.0f, false, false, 0.17f, 0.29f)
                lineTo(179.0f, 205.59f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 11.0f, -3.28f)
                lineTo(190.0f, 139.57f)
                arcToRelative(76.83f, 76.83f, 0.0f, false, true, 28.0f, 59.08f)
                lineTo(218.0f, 240.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 12.0f, 0.0f)
                lineTo(230.0f, 198.65f)
                arcTo(88.88f, 88.88f, 0.0f, false, false, 190.0f, 124.69f)
                close()
                moveTo(80.0f, 82.0f)
                lineTo(64.0f, 82.0f)
                arcTo(14.0f, 14.0f, 0.0f, false, false, 50.0f, 96.0f)
                lineTo(50.0f, 200.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 12.0f, 0.0f)
                lineTo(62.0f, 96.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, 2.0f, -2.0f)
                lineTo(80.0f, 94.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 0.0f, -12.0f)
                close()
            }
        }
        .build()
        return _handdeposit!!
    }

private var _handdeposit: ImageVector? = null
