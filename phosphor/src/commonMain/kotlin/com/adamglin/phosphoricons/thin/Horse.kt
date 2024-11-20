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

public val ThinGroup.Horse: ImageVector
    get() {
        if (_horse != null) {
            return _horse!!
        }
        _horse = Builder(name = "Horse", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(132.0f, 100.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, true, true, -8.0f, -8.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, true, 132.0f, 100.0f)
                close()
                moveTo(228.0f, 129.42f)
                arcTo(100.29f, 100.29f, 0.0f, false, true, 130.0f, 228.0f)
                lineToRelative(-2.09f, 0.0f)
                arcToRelative(99.37f, 99.37f, 0.0f, false, true, -66.6f, -25.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, true, true, 5.34f, -6.0f)
                arcToRelative(89.08f, 89.08f, 0.0f, false, false, 24.09f, 15.39f)
                lineToRelative(31.35f, -43.11f)
                curveToRelative(-25.16f, -13.0f, -53.95f, -8.1f, -68.14f, -5.7f)
                arcToRelative(27.85f, 27.85f, 0.0f, false, true, -27.43f, -11.22f)
                curveToRelative(-0.05f, -0.07f, -0.1f, -0.14f, -0.14f, -0.21f)
                lineToRelative(-13.79f, -22.0f)
                arcToRelative(3.94f, 3.94f, 0.0f, false, true, -0.5f, -3.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 1.79f, -2.5f)
                lineTo(116.0f, 61.76f)
                lineTo(116.0f, 32.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 4.0f, -4.0f)
                horizontalLineToRelative(8.0f)
                arcTo(100.0f, 100.0f, 0.0f, false, true, 228.0f, 129.42f)
                close()
                moveTo(193.52f, 63.42f)
                arcTo(91.35f, 91.35f, 0.0f, false, false, 128.0f, 36.0f)
                horizontalLineToRelative(-4.0f)
                lineTo(124.0f, 64.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -1.9f, 3.41f)
                lineTo(21.53f, 129.29f)
                lineToRelative(11.58f, 18.52f)
                arcToRelative(19.89f, 19.89f, 0.0f, false, false, 19.52f, 7.91f)
                curveToRelative(15.68f, -2.66f, 48.08f, -8.13f, 76.39f, 8.25f)
                arcToRelative(44.0f, 44.0f, 0.0f, false, false, 43.0f, -44.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 8.0f, 0.0f)
                arcTo(52.06f, 52.06f, 0.0f, false, true, 130.07f, 172.0f)
                lineToRelative(-31.56f, 43.4f)
                arcTo(94.54f, 94.54f, 0.0f, false, false, 129.86f, 220.0f)
                arcTo(92.0f, 92.0f, 0.0f, false, false, 193.51f, 63.4f)
                close()
            }
        }
        .build()
        return _horse!!
    }

private var _horse: ImageVector? = null
