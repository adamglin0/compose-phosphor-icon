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

public val BoldGroup.Butterfly: ImageVector
    get() {
        if (_butterfly != null) {
            return _butterfly!!
        }
        _butterfly = Builder(name = "Butterfly", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(235.79f, 48.0f)
                curveToRelative(-4.27f, -5.48f, -12.4f, -12.0f, -26.88f, -12.0f)
                curveToRelative(-17.86f, 0.0f, -40.5f, 11.7f, -60.57f, 31.3f)
                curveToRelative(-3.0f, 2.89f, -5.74f, 5.85f, -8.34f, 8.84f)
                lineTo(140.0f, 56.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, -24.0f, 0.0f)
                lineTo(116.0f, 76.14f)
                curveToRelative(-2.6f, -3.0f, -5.38f, -6.0f, -8.34f, -8.84f)
                curveTo(87.59f, 47.7f, 65.0f, 36.0f, 47.09f, 36.0f)
                curveToRelative(-14.48f, 0.0f, -22.61f, 6.54f, -26.88f, 12.0f)
                curveTo(7.0f, 65.0f, 12.0f, 93.91f, 19.28f, 122.66f)
                curveToRelative(5.75f, 22.64f, 17.8f, 33.0f, 28.88f, 37.69f)
                arcTo(48.12f, 48.12f, 0.0f, false, false, 92.0f, 228.0f)
                arcToRelative(47.87f, 47.87f, 0.0f, false, false, 36.0f, -16.28f)
                arcTo(48.0f, 48.0f, 0.0f, false, false, 212.0f, 180.0f)
                arcToRelative(48.51f, 48.51f, 0.0f, false, false, -4.14f, -19.65f)
                curveToRelative(11.08f, -4.67f, 23.13f, -15.0f, 28.88f, -37.69f)
                curveTo(244.0f, 93.91f, 249.0f, 65.0f, 235.79f, 48.0f)
                close()
                moveTo(92.0f, 204.0f)
                arcToRelative(24.0f, 24.0f, 0.0f, false, true, -24.0f, -24.0f)
                arcToRelative(24.36f, 24.36f, 0.0f, false, true, 21.31f, -24.07f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, -2.64f, -23.86f)
                arcTo(47.63f, 47.63f, 0.0f, false, false, 65.17f, 140.0f)
                curveToRelative(-8.19f, -0.29f, -18.0f, -4.92f, -22.63f, -23.24f)
                curveToRelative(-7.41f, -29.18f, -8.55f, -47.35f, -3.39f, -54.0f)
                curveTo(39.74f, 62.0f, 41.3f, 60.0f, 47.09f, 60.0f)
                curveTo(58.3f, 60.0f, 75.91f, 69.83f, 90.9f, 84.47f)
                curveToRelative(15.25f, 14.9f, 25.1f, 31.86f, 25.1f, 43.2f)
                lineTo(116.0f, 180.0f)
                arcTo(24.0f, 24.0f, 0.0f, false, true, 92.0f, 204.0f)
                close()
                moveTo(213.45f, 116.75f)
                curveTo(208.81f, 135.07f, 199.0f, 139.7f, 190.82f, 140.0f)
                arcToRelative(47.54f, 47.54f, 0.0f, false, false, -21.51f, -7.92f)
                arcToRelative(12.0f, 12.0f, 0.0f, true, false, -2.64f, 23.86f)
                arcTo(24.36f, 24.36f, 0.0f, false, true, 188.0f, 180.0f)
                arcToRelative(24.0f, 24.0f, 0.0f, true, true, -48.0f, 0.0f)
                lineTo(140.0f, 127.67f)
                curveToRelative(0.0f, -11.34f, 9.85f, -28.3f, 25.1f, -43.2f)
                curveTo(180.09f, 69.83f, 197.7f, 60.0f, 208.91f, 60.0f)
                curveToRelative(5.79f, 0.0f, 7.35f, 2.0f, 7.94f, 2.76f)
                curveTo(222.0f, 69.4f, 220.87f, 87.57f, 213.46f, 116.75f)
                close()
            }
        }
        .build()
        return _butterfly!!
    }

private var _butterfly: ImageVector? = null
