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

public val ThinGroup.DribbbleLogo: ImageVector
    get() {
        if (_dribbbleLogo != null) {
            return _dribbbleLogo!!
        }
        _dribbbleLogo = Builder(name = "DribbbleLogo", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(128.0f, 28.0f)
                arcTo(100.0f, 100.0f, 0.0f, true, false, 228.0f, 128.0f)
                arcTo(100.11f, 100.11f, 0.0f, false, false, 128.0f, 28.0f)
                close()
                moveTo(219.92f, 124.43f)
                curveTo(216.0f, 124.15f, 212.0f, 124.0f, 208.0f, 124.0f)
                arcToRelative(164.4f, 164.4f, 0.0f, false, false, -46.55f, 6.74f)
                arcTo(163.48f, 163.48f, 0.0f, false, false, 146.61f, 97.0f)
                curveToRelative(-0.49f, -0.82f, -1.0f, -1.64f, -1.5f, -2.46f)
                arcTo(164.0f, 164.0f, 0.0f, false, false, 188.5f, 58.75f)
                arcTo(91.8f, 91.8f, 0.0f, false, true, 219.92f, 124.43f)
                close()
                moveTo(182.25f, 53.75f)
                arcToRelative(156.23f, 156.23f, 0.0f, false, true, -41.46f, 34.08f)
                arcToRelative(165.0f, 165.0f, 0.0f, false, false, -46.3f, -45.51f)
                arcToRelative(91.86f, 91.86f, 0.0f, false, true, 87.76f, 11.43f)
                close()
                moveTo(85.78f, 46.28f)
                arcToRelative(157.0f, 157.0f, 0.0f, false, true, 47.9f, 45.34f)
                arcTo(155.67f, 155.67f, 0.0f, false, true, 64.0f, 108.0f)
                arcToRelative(157.47f, 157.47f, 0.0f, false, true, -25.33f, -2.0f)
                arcTo(92.35f, 92.35f, 0.0f, false, true, 85.78f, 46.28f)
                close()
                moveTo(36.0f, 128.0f)
                arcToRelative(92.34f, 92.34f, 0.0f, false, true, 1.1f, -14.2f)
                arcTo(165.6f, 165.6f, 0.0f, false, false, 64.0f, 116.0f)
                arcToRelative(163.6f, 163.6f, 0.0f, false, false, 74.05f, -17.62f)
                curveToRelative(0.55f, 0.9f, 1.11f, 1.79f, 1.64f, 2.7f)
                arcToRelative(155.15f, 155.15f, 0.0f, false, true, 14.14f, 32.11f)
                arcToRelative(162.7f, 162.7f, 0.0f, false, false, -27.59f, 12.61f)
                arcTo(164.94f, 164.94f, 0.0f, false, false, 70.0f, 199.36f)
                arcTo(91.84f, 91.84f, 0.0f, false, true, 36.0f, 128.0f)
                close()
                moveTo(76.44f, 204.16f)
                arcToRelative(157.08f, 157.08f, 0.0f, false, true, 53.8f, -51.43f)
                arcTo(153.87f, 153.87f, 0.0f, false, true, 156.0f, 140.91f)
                arcToRelative(156.32f, 156.32f, 0.0f, false, true, 4.9f, 38.78f)
                arcToRelative(157.0f, 157.0f, 0.0f, false, true, -4.11f, 35.69f)
                arcToRelative(91.94f, 91.94f, 0.0f, false, true, -80.37f, -11.22f)
                close()
                moveTo(165.74f, 211.9f)
                arcToRelative(165.24f, 165.24f, 0.0f, false, false, 3.18f, -32.21f)
                arcToRelative(164.26f, 164.26f, 0.0f, false, false, -5.28f, -41.26f)
                arcTo(156.44f, 156.44f, 0.0f, false, true, 208.0f, 132.0f)
                curveToRelative(4.0f, 0.0f, 7.94f, 0.15f, 11.88f, 0.45f)
                arcTo(92.17f, 92.17f, 0.0f, false, true, 165.74f, 211.9f)
                close()
            }
        }
        .build()
        return _dribbbleLogo!!
    }

private var _dribbbleLogo: ImageVector? = null
