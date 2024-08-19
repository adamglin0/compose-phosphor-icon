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

public val ThinGroup.`Lightning-a-thin`: ImageVector
    get() {
        if (`_lightning-a-thin` != null) {
            return `_lightning-a-thin`!!
        }
        `_lightning-a-thin` = Builder(name = "Lightning-a-thin", defaultWidth = 256.0.dp,
                defaultHeight = 256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(171.92f, 112.34f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, -2.28f, -2.85f)
                lineToRelative(-53.0f, -23.78f)
                lineToRelative(14.43f, -60.79f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, -6.83f, -3.64f)
                lineTo(29.06f, 124.14f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 1.3f, 6.37f)
                lineToRelative(53.0f, 23.78f)
                lineTo(68.91f, 215.07f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 2.0f, 4.46f)
                arcToRelative(3.94f, 3.94f, 0.0f, false, false, 1.88f, 0.47f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 2.94f, -1.28f)
                lineToRelative(95.2f, -102.86f)
                arcTo(4.0f, 4.0f, 0.0f, false, false, 171.92f, 112.34f)
                close()
                moveTo(80.21f, 202.1f)
                lineToRelative(11.68f, -49.18f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, -2.25f, -4.57f)
                lineTo(38.72f, 125.49f)
                lineTo(119.79f, 37.9f)
                lineTo(108.11f, 87.08f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 2.25f, 4.57f)
                lineToRelative(50.92f, 22.86f)
                close()
                moveTo(235.58f, 214.21f)
                lineTo(199.58f, 142.21f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, -7.16f, 0.0f)
                lineToRelative(-36.0f, 72.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, true, false, 7.16f, 3.58f)
                lineTo(174.47f, 196.0f)
                horizontalLineToRelative(43.06f)
                lineToRelative(10.89f, 21.79f)
                arcTo(4.0f, 4.0f, 0.0f, false, false, 232.0f, 220.0f)
                arcToRelative(4.12f, 4.12f, 0.0f, false, false, 1.79f, -0.42f)
                arcTo(4.0f, 4.0f, 0.0f, false, false, 235.58f, 214.21f)
                close()
                moveTo(178.47f, 188.0f)
                lineTo(196.0f, 152.94f)
                lineTo(213.53f, 188.0f)
                close()
            }
        }
        .build()
        return `_lightning-a-thin`!!
    }

private var `_lightning-a-thin`: ImageVector? = null
