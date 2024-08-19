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

public val LightGroup.Handswipeleft: ImageVector
    get() {
        if (_handswipeleft != null) {
            return _handswipeleft!!
        }
        _handswipeleft = Builder(name = "Handswipeleft", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(214.0f, 140.0f)
                verticalLineToRelative(36.0f)
                curveToRelative(0.0f, 25.13f, -8.28f, 42.0f, -8.64f, 42.68f)
                arcToRelative(6.0f, 6.0f, 0.0f, true, true, -10.73f, -5.36f)
                curveToRelative(0.07f, -0.14f, 7.37f, -15.19f, 7.37f, -37.32f)
                lineTo(202.0f, 140.0f)
                arcToRelative(14.0f, 14.0f, 0.0f, false, false, -28.0f, 0.0f)
                verticalLineToRelative(4.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, -12.0f, 0.0f)
                lineTo(162.0f, 124.0f)
                arcToRelative(14.0f, 14.0f, 0.0f, false, false, -28.0f, 0.0f)
                verticalLineToRelative(12.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, -12.0f, 0.0f)
                lineTo(122.0f, 68.0f)
                arcToRelative(14.0f, 14.0f, 0.0f, false, false, -28.0f, 0.0f)
                lineTo(94.0f, 176.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, -11.09f, 3.17f)
                lineToRelative(-18.68f, -30.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -0.1f, -0.17f)
                arcToRelative(14.0f, 14.0f, 0.0f, false, false, -24.25f, 14.0f)
                lineToRelative(29.29f, 50.0f)
                arcTo(6.0f, 6.0f, 0.0f, false, true, 58.81f, 219.0f)
                lineTo(29.49f, 169.0f)
                arcToRelative(26.0f, 26.0f, 0.0f, false, true, 45.0f, -26.13f)
                lineTo(82.0f, 155.0f)
                lineTo(82.0f, 68.0f)
                arcToRelative(26.0f, 26.0f, 0.0f, false, true, 52.0f, 0.0f)
                verticalLineToRelative(34.1f)
                arcToRelative(26.0f, 26.0f, 0.0f, false, true, 39.42f, 16.39f)
                arcTo(26.0f, 26.0f, 0.0f, false, true, 214.0f, 140.0f)
                close()
                moveTo(248.0f, 50.0f)
                lineTo(190.48f, 50.0f)
                lineToRelative(21.76f, -21.76f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, -8.49f, -8.48f)
                lineToRelative(-32.0f, 32.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 0.0f, 8.48f)
                lineToRelative(32.0f, 32.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 8.49f, -8.48f)
                lineTo(190.48f, 62.0f)
                lineTo(248.0f, 62.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 0.0f, -12.0f)
                close()
            }
        }
        .build()
        return _handswipeleft!!
    }

private var _handswipeleft: ImageVector? = null
