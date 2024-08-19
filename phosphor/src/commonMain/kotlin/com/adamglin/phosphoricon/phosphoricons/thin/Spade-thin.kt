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

public val ThinGroup.`Spade-thin`: ImageVector
    get() {
        if (`_spade-thin` != null) {
            return `_spade-thin`!!
        }
        `_spade-thin` = Builder(name = "Spade-thin", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(178.56f, 52.93f)
                arcToRelative(281.08f, 281.08f, 0.0f, false, false, -48.77f, -32.51f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, -3.58f, 0.0f)
                arcTo(281.08f, 281.08f, 0.0f, false, false, 77.44f, 52.93f)
                curveTo(45.1f, 79.88f, 28.0f, 108.61f, 28.0f, 136.0f)
                arcToRelative(52.0f, 52.0f, 0.0f, false, false, 76.46f, 45.89f)
                lineToRelative(-12.29f, 41.0f)
                arcTo(4.0f, 4.0f, 0.0f, false, false, 96.0f, 228.0f)
                horizontalLineToRelative(64.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 3.83f, -5.15f)
                lineToRelative(-12.29f, -41.0f)
                arcTo(52.0f, 52.0f, 0.0f, false, false, 228.0f, 136.0f)
                curveTo(228.0f, 108.61f, 210.9f, 79.88f, 178.56f, 52.93f)
                close()
                moveTo(176.0f, 180.0f)
                arcToRelative(44.0f, 44.0f, 0.0f, false, true, -28.92f, -10.84f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, -6.46f, 4.17f)
                lineToRelative(14.0f, 46.67f)
                horizontalLineTo(101.38f)
                lineToRelative(14.0f, -46.67f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, -6.46f, -4.17f)
                arcTo(44.0f, 44.0f, 0.0f, false, true, 36.0f, 136.0f)
                curveToRelative(0.0f, -56.06f, 79.0f, -100.56f, 92.0f, -107.49f)
                curveToRelative(13.0f, 6.93f, 92.0f, 51.38f, 92.0f, 107.49f)
                arcTo(44.05f, 44.05f, 0.0f, false, true, 176.0f, 180.0f)
                close()
            }
        }
        .build()
        return `_spade-thin`!!
    }

private var `_spade-thin`: ImageVector? = null
