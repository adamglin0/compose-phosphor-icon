package com.adamglin.phosphoricon.phosphoricons.thin

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.adamglin.phosphoricon.phosphoricons.ThinGroup

public val ThinGroup.`Broom-thin`: ImageVector
    get() {
        if (`_broom-thin` != null) {
            return `_broom-thin`!!
        }
        `_broom-thin` = Builder(name = "Broom-thin", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(233.75f, 220.4f)
                curveTo(209.76f, 208.75f, 196.0f, 183.82f, 196.0f, 152.0f)
                verticalLineTo(134.72f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, -7.56f, -11.15f)
                lineToRelative(-24.89f, -9.83f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, -6.71f, -15.55f)
                lineToRelative(21.33f, -53.0f)
                arcToRelative(23.88f, 23.88f, 0.0f, false, false, -31.93f, -31.0f)
                arcTo(24.72f, 24.72f, 0.0f, false, false, 133.62f, 27.3f)
                lineToRelative(-21.0f, 53.1f)
                arcTo(12.0f, 12.0f, 0.0f, false, true, 97.0f, 87.13f)
                lineTo(71.63f, 76.84f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, -13.0f, 2.73f)
                curveTo(38.3f, 100.45f, 28.0f, 124.82f, 28.0f, 152.0f)
                arcToRelative(107.5f, 107.5f, 0.0f, false, false, 30.07f, 74.77f)
                arcTo(4.0f, 4.0f, 0.0f, false, false, 61.0f, 228.0f)
                horizontalLineTo(232.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 1.75f, -7.6f)
                close()
                moveTo(64.34f, 85.15f)
                arcToRelative(3.94f, 3.94f, 0.0f, false, true, 4.3f, -0.89f)
                lineTo(94.0f, 94.55f)
                arcToRelative(20.0f, 20.0f, 0.0f, false, false, 26.0f, -11.2f)
                lineToRelative(21.0f, -53.0f)
                curveTo(144.39f, 22.19f, 153.61f, 18.0f, 161.58f, 21.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, true, 9.19f, 21.16f)
                lineTo(149.41f, 95.22f)
                arcToRelative(20.0f, 20.0f, 0.0f, false, false, 11.18f, 26.0f)
                lineToRelative(24.9f, 9.83f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 2.51f, 3.72f)
                verticalLineTo(152.0f)
                curveToRelative(0.0f, 2.36f, 0.08f, 4.69f, 0.22f, 7.0f)
                lineToRelative(-138.5f, -55.4f)
                arcTo(110.84f, 110.84f, 0.0f, false, true, 64.34f, 85.15f)
                close()
                moveTo(113.56f, 220.0f)
                arcTo(91.35f, 91.35f, 0.0f, false, true, 86.9f, 175.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, -7.75f, 2.0f)
                arcToRelative(100.21f, 100.21f, 0.0f, false, false, 23.09f, 43.0f)
                horizontalLineTo(62.68f)
                arcTo(99.5f, 99.5f, 0.0f, false, true, 36.0f, 152.0f)
                arcToRelative(89.37f, 89.37f, 0.0f, false, true, 9.73f, -41.4f)
                lineTo(189.13f, 168.0f)
                curveToRelative(3.22f, 22.0f, 13.23f, 40.09f, 28.8f, 52.0f)
                close()
            }
        }
        .build()
        return `_broom-thin`!!
    }

private var `_broom-thin`: ImageVector? = null
