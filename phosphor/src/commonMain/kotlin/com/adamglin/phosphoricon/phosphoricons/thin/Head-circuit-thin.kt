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

public val ThinGroup.`Head-circuit-thin`: ImageVector
    get() {
        if (`_head-circuit-thin` != null) {
            return `_head-circuit-thin`!!
        }
        `_head-circuit-thin` = Builder(name = "Head-circuit-thin", defaultWidth = 256.0.dp,
                defaultHeight = 256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(188.25f, 169.77f)
                arcTo(84.3f, 84.3f, 0.0f, false, false, 220.0f, 102.0f)
                curveToRelative(-1.0f, -43.64f, -35.9f, -79.62f, -79.45f, -81.91f)
                arcTo(84.0f, 84.0f, 0.0f, false, false, 52.0f, 103.0f)
                lineTo(29.1f, 147.0f)
                curveToRelative(-0.05f, 0.09f, -0.09f, 0.18f, -0.13f, 0.27f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 5.66f, 15.46f)
                lineToRelative(0.13f, 0.06f)
                lineTo(60.0f, 174.38f)
                lineTo(60.0f, 208.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 12.0f, 12.0f)
                horizontalLineToRelative(48.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 0.0f, -8.0f)
                lineTo(72.0f, 212.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -4.0f, -4.0f)
                lineTo(68.0f, 171.81f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, -2.34f, -3.64f)
                lineToRelative(-27.5f, -12.59f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -1.88f, -5.0f)
                lineToRelative(23.27f, -44.72f)
                arcTo(4.11f, 4.11f, 0.0f, false, false, 60.0f, 104.0f)
                arcToRelative(76.0f, 76.0f, 0.0f, false, true, 64.0f, -75.0f)
                lineTo(124.0f, 52.4f)
                arcToRelative(20.0f, 20.0f, 0.0f, true, false, 8.0f, 0.0f)
                lineTo(132.0f, 28.11f)
                arcToRelative(78.35f, 78.35f, 0.0f, false, true, 8.11f, 0.0f)
                curveToRelative(33.13f, 1.74f, 60.72f, 25.0f, 69.2f, 55.89f)
                lineTo(184.0f, 84.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, -3.07f, 1.44f)
                lineToRelative(-27.46f, 33.0f)
                arcToRelative(20.12f, 20.12f, 0.0f, true, false, 6.13f, 5.13f)
                lineTo(185.87f, 92.0f)
                lineTo(211.0f, 92.0f)
                arcToRelative(75.9f, 75.9f, 0.0f, false, true, -29.44f, 72.8f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, -1.57f, 3.7f)
                lineToRelative(8.0f, 64.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 4.0f, 3.5f)
                lineToRelative(0.5f, 0.0f)
                arcTo(4.0f, 4.0f, 0.0f, false, false, 196.0f, 231.5f)
                close()
                moveTo(140.0f, 72.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, true, true, -12.0f, -12.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, true, 140.0f, 72.0f)
                close()
                moveTo(144.0f, 148.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, true, true, 12.0f, -12.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, true, 144.0f, 148.0f)
                close()
            }
        }
        .build()
        return `_head-circuit-thin`!!
    }

private var `_head-circuit-thin`: ImageVector? = null
