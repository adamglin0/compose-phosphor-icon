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

public val ThinGroup.Nuclearplant: ImageVector
    get() {
        if (_nuclearplant != null) {
            return _nuclearplant!!
        }
        _nuclearplant = Builder(name = "Nuclearplant", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(152.0f, 36.0f)
                horizontalLineToRelative(24.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 12.0f, -12.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 8.0f, 0.0f)
                arcToRelative(20.0f, 20.0f, 0.0f, false, true, -20.0f, 20.0f)
                lineTo(152.0f, 44.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, -12.0f, 12.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -8.0f, 0.0f)
                arcTo(20.0f, 20.0f, 0.0f, false, true, 152.0f, 36.0f)
                close()
                moveTo(104.0f, 60.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 4.0f, -4.0f)
                arcToRelative(44.05f, 44.05f, 0.0f, false, true, 44.0f, -44.0f)
                horizontalLineToRelative(8.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 0.0f, -8.0f)
                horizontalLineToRelative(-8.0f)
                arcToRelative(52.06f, 52.06f, 0.0f, false, false, -52.0f, 52.0f)
                arcTo(4.0f, 4.0f, 0.0f, false, false, 104.0f, 60.0f)
                close()
                moveTo(244.0f, 216.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -4.0f, 4.0f)
                lineTo(16.0f, 220.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 0.0f, -8.0f)
                lineTo(35.21f, 212.0f)
                curveToRelative(14.21f, -28.21f, 30.94f, -70.65f, 32.65f, -116.51f)
                arcTo(11.93f, 11.93f, 0.0f, false, true, 79.85f, 84.0f)
                horizontalLineToRelative(88.33f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, 12.0f, 11.46f)
                curveToRelative(2.21f, 50.34f, 25.71f, 97.0f, 37.0f, 116.54f)
                lineTo(240.0f, 212.0f)
                arcTo(4.0f, 4.0f, 0.0f, false, true, 244.0f, 216.0f)
                close()
                moveTo(171.85f, 212.0f)
                curveToRelative(-14.14f, -28.88f, -30.0f, -70.85f, -31.7f, -116.21f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, -4.0f, -3.79f)
                lineTo(79.85f, 92.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, -4.0f, 3.79f)
                curveTo(74.16f, 141.15f, 58.29f, 183.12f, 44.15f, 212.0f)
                close()
                moveTo(207.94f, 212.0f)
                curveToRelative(-12.17f, -22.0f, -33.62f, -67.3f, -35.77f, -116.19f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, -4.0f, -3.81f)
                lineTo(147.49f, 92.0f)
                arcToRelative(11.86f, 11.86f, 0.0f, false, true, 0.65f, 3.49f)
                curveToRelative(1.71f, 45.86f, 18.44f, 88.3f, 32.65f, 116.51f)
                close()
            }
        }
        .build()
        return _nuclearplant!!
    }

private var _nuclearplant: ImageVector? = null
