package com.adamglin.phosphoricon.phosphoricons.bold

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.adamglin.phosphoricon.phosphoricons.BoldGroup

public val BoldGroup.`Phone-outgoing-bold`: ImageVector
    get() {
        if (`_phone-outgoing-bold` != null) {
            return `_phone-outgoing-bold`!!
        }
        `_phone-outgoing-bold` = Builder(name = "Phone-outgoing-bold", defaultWidth = 256.0.dp,
                defaultHeight = 256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(143.52f, 112.48f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, 0.0f, -17.0f)
                lineTo(171.0f, 68.0f)
                lineTo(160.0f, 68.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, 0.0f, -24.0f)
                horizontalLineToRelative(40.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, 12.0f, 12.0f)
                lineTo(212.0f, 96.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, -24.0f, 0.0f)
                lineTo(188.0f, 85.0f)
                lineToRelative(-27.51f, 27.51f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, -17.0f, 0.0f)
                close()
                moveTo(227.85f, 183.58f)
                arcTo(60.27f, 60.27f, 0.0f, false, true, 168.0f, 236.0f)
                curveTo(86.39f, 236.0f, 20.0f, 169.61f, 20.0f, 88.0f)
                arcTo(60.27f, 60.27f, 0.0f, false, true, 72.42f, 28.15f)
                arcTo(20.05f, 20.05f, 0.0f, false, true, 93.2f, 40.0f)
                lineToRelative(21.11f, 47.13f)
                arcToRelative(1.42f, 1.42f, 0.0f, false, false, 0.08f, 0.18f)
                arcToRelative(20.0f, 20.0f, 0.0f, false, true, -1.66f, 18.83f)
                arcToRelative(10.67f, 10.67f, 0.0f, false, true, -0.85f, 1.15f)
                lineTo(92.82f, 130.0f)
                curveToRelative(7.06f, 12.84f, 20.5f, 26.16f, 33.49f, 33.21f)
                lineToRelative(22.31f, -19.0f)
                arcToRelative(13.08f, 13.08f, 0.0f, false, true, 1.12f, -0.84f)
                arcToRelative(19.91f, 19.91f, 0.0f, false, true, 19.0f, -1.74f)
                lineToRelative(0.18f, 0.08f)
                lineTo(216.0f, 162.8f)
                arcTo(20.06f, 20.06f, 0.0f, false, true, 227.85f, 183.58f)
                close()
                moveTo(203.54f, 183.52f)
                lineTo(161.54f, 164.71f)
                lineTo(139.11f, 183.78f)
                arcToRelative(11.63f, 11.63f, 0.0f, false, true, -1.11f, 0.85f)
                arcTo(20.0f, 20.0f, 0.0f, false, true, 118.31f, 186.0f)
                curveToRelative(-19.48f, -9.4f, -38.89f, -28.68f, -48.31f, -48.0f)
                arcToRelative(20.0f, 20.0f, 0.0f, false, true, 1.28f, -19.64f)
                arcToRelative(10.75f, 10.75f, 0.0f, false, true, 0.86f, -1.15f)
                lineTo(91.3f, 94.5f)
                lineToRelative(-18.82f, -42.0f)
                arcTo(36.29f, 36.29f, 0.0f, false, false, 44.0f, 88.0f)
                arcTo(124.15f, 124.15f, 0.0f, false, false, 168.0f, 212.0f)
                arcTo(36.29f, 36.29f, 0.0f, false, false, 203.54f, 183.52f)
                close()
            }
        }
        .build()
        return `_phone-outgoing-bold`!!
    }

private var `_phone-outgoing-bold`: ImageVector? = null
