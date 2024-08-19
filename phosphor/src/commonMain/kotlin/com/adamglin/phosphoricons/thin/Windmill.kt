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

public val ThinGroup.Windmill: ImageVector
    get() {
        if (_windmill != null) {
            return _windmill!!
        }
        _windmill = Builder(name = "Windmill", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(224.0f, 228.0f)
                lineTo(179.47f, 228.0f)
                lineToRelative(-8.0f, -55.78f)
                lineToRelative(10.4f, 6.12f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 16.45f, -4.25f)
                lineToRelative(12.0f, -20.34f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, -4.26f, -16.43f)
                lineToRelative(-38.46f, -22.64f)
                lineTo(210.34f, 42.1f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, -4.25f, -16.44f)
                lineToRelative(-20.34f, -12.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, -16.44f, 4.25f)
                lineTo(146.68f, 56.38f)
                lineTo(74.1f, 13.66f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, -16.45f, 4.25f)
                lineToRelative(-12.0f, 20.34f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 4.26f, 16.44f)
                lineTo(88.38f, 77.33f)
                lineTo(45.66f, 149.91f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 4.25f, 16.44f)
                lineToRelative(20.34f, 12.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 13.5f, -0.91f)
                lineTo(76.53f, 228.0f)
                lineTo(32.0f, 228.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 0.0f, 8.0f)
                lineTo(224.0f, 236.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 0.0f, -8.0f)
                close()
                moveTo(203.87f, 146.66f)
                arcToRelative(3.93f, 3.93f, 0.0f, false, true, -0.43f, 3.0f)
                lineToRelative(-12.0f, 20.34f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -5.49f, 1.42f)
                lineToRelative(-72.58f, -42.72f)
                lineToRelative(16.0f, -27.25f)
                lineTo(202.0f, 144.21f)
                arcTo(4.0f, 4.0f, 0.0f, false, true, 203.87f, 146.66f)
                close()
                moveTo(176.21f, 22.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 5.48f, -1.42f)
                lineToRelative(20.34f, 12.0f)
                arcTo(4.0f, 4.0f, 0.0f, false, true, 203.44f, 38.0f)
                lineToRelative(-42.71f, 72.58f)
                lineToRelative(-27.25f, -16.0f)
                close()
                moveTo(52.13f, 45.35f)
                arcToRelative(3.92f, 3.92f, 0.0f, false, true, 0.43f, -3.0f)
                lineTo(64.55f, 22.0f)
                arcTo(4.0f, 4.0f, 0.0f, false, true, 70.0f, 20.56f)
                lineToRelative(72.58f, 42.72f)
                lineToRelative(-16.0f, 27.25f)
                lineTo(54.0f, 47.79f)
                arcTo(4.0f, 4.0f, 0.0f, false, true, 52.13f, 45.35f)
                close()
                moveTo(77.34f, 171.87f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -3.0f, -0.42f)
                lineTo(54.0f, 159.46f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -1.41f, -5.5f)
                lineTo(95.27f, 81.38f)
                lineToRelative(27.25f, 16.0f)
                lineTo(79.79f, 170.0f)
                arcTo(4.0f, 4.0f, 0.0f, false, true, 77.34f, 171.87f)
                close()
                moveTo(94.12f, 161.46f)
                lineTo(109.32f, 135.62f)
                lineTo(162.68f, 167.0f)
                lineToRelative(8.71f, 61.0f)
                lineTo(84.61f, 228.0f)
                close()
            }
        }
        .build()
        return _windmill!!
    }

private var _windmill: ImageVector? = null
